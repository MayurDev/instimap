package com.mrane.campusmap;

import java.util.HashMap;
import java.util.Set;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

import com.mrane.zoomview.CampusMapView;

public class MainActivity extends ActionBarActivity implements
		OnItemClickListener, TextWatcher, OnEditorActionListener {
	private static MainActivity mMainActivity;
	boolean isOpened = false;
	private ArrayAdapter<String> adapter;
	private FragmentManager fragmentManager;
	private ListFragment listFragment;
	private IndexFragment indexFragment;
	AutoCompleteTextView textView;
	HashMap<String, Marker> data;
	FragmentTransaction transaction;
	CampusMapView campusMapView;
	ImageButton searchIcon;
	ImageButton removeIcon;
	ImageButton mapIcon;
	ImageButton indexIcon;
	LocationManager locationManager;
	LocationListener locationListener;
	private boolean itemSelected = false;
	private boolean isFirstFragment = true;
	private final String firstStackTag = "FIRST_TAG";
	private final int MSG_ANIMATE = 1;
	private final long DELAY_ANIMATE = 50;

	@SuppressLint("HandlerLeak")
	private Handler mHandler = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSG_ANIMATE:
				resultMarker((String) msg.obj);
				break;
			}
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setmMainActivity(this);

		getSupportActionBar().hide();

		setContentView(R.layout.activity_main);

		Locations mLocations = new Locations();
		data = mLocations.data;
		Set<String> keys = data.keySet();
		String[] KEYS = keys.toArray(new String[keys.size()]);

		adapter = new ArrayAdapter<String>(this, R.layout.row_layout,
				R.id.label, KEYS);
		textView = (CustomAutoCompleteView) findViewById(R.id.search);
		textView.setAdapter(adapter);
		textView.addTextChangedListener(this);
		textView.setOnEditorActionListener(this);

		campusMapView = (CampusMapView) findViewById(R.id.campusMapView);
		campusMapView.setImageAsset("map.png");
		campusMapView.setData(mMainActivity.data);

		searchIcon = (ImageButton) findViewById(R.id.search_icon);
		removeIcon = (ImageButton) findViewById(R.id.remove_icon);
		indexIcon = (ImageButton) findViewById(R.id.index_icon);
		mapIcon = (ImageButton) findViewById(R.id.map_icon);

		fragmentManager = getSupportFragmentManager();
		listFragment = new ListFragment();
		indexFragment = new IndexFragment();

		locationManager = (LocationManager) this
				.getSystemService(Context.LOCATION_SERVICE);

		// boolean enabled = locationManager
		// .isProviderEnabled(LocationManager.GPS_PROVIDER);
		//
		// if (!enabled) {
		// Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
		// startActivity(intent);
		// }
		// Define a listener that responds to location updates
		locationListener = new LocationListenerClass();
		// locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,
		// 0, 0, locationListener);

	}

	public static MainActivity getmMainActivity() {
		return mMainActivity;
	}

	public static void setmMainActivity(MainActivity mMainActivity) {
		MainActivity.mMainActivity = mMainActivity;
	}

	public void autoCompleteFocusChanged(boolean focused) { 
		if (focused) {
			itemSelected = false;
			putFragment(listFragment);
		} else {
			if (itemSelected) {
				fragmentManager.popBackStack(firstStackTag,
						FragmentManager.POP_BACK_STACK_INCLUSIVE);
				isFirstFragment = true;
			} else {

			}
		}
	}

	private void putFragment(Fragment fragment) {
		transaction = fragmentManager.beginTransaction();
		if (isFirstFragment) {
			transaction.add(R.id.fragment_container, fragment);
			transaction.addToBackStack(firstStackTag);
			transaction
					.setTransitionStyle(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
			isFirstFragment = false;
		} else {
			transaction.replace(R.id.fragment_container, fragment);
			transaction.addToBackStack(null);
		}
		transaction.commit();
	}

	public ArrayAdapter<String> getAdapter() {
		return adapter;
	}

	public void setAdapter(ArrayAdapter<String> adapter) {
		this.adapter = adapter;
	}

	@Override
	public void onBackPressed() {
		textView.clearFocus();
		if (!isFirstFragment) {
			fragmentManager.popBackStack(firstStackTag,
					FragmentManager.POP_BACK_STACK_INCLUSIVE);
		} else {
			super.onBackPressed();
		}
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		String key = adapter.getItem(arg2);
		setAutoCompleteText(arg3, arg2, key);
		fragmentManager.popBackStack();

		Message msg = mHandler.obtainMessage(MSG_ANIMATE, key);
		mHandler.sendMessageDelayed(msg, DELAY_ANIMATE);
	}

	private void setAutoCompleteText(long id, int index, String key) {
		textView.dismissDropDown();
		InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
		imm.hideSoftInputFromWindow(textView.getWindowToken(), 0);
		textView.setText(key);
		textView.clearFocus();
	}

	public void resultMarker(String key) {
		Marker marker = mMainActivity.data.get(key);
		campusMapView.removeHighlightedMarkers();
		campusMapView.goToMarker(marker);
	}

	public void searchClick(View v) {
		Toast t = Toast.makeText(mMainActivity, "search", Toast.LENGTH_LONG);
		t.show();
	}

	public void indexClick(View v) {
		setAutoCompleteText(0, 0, null);
		putFragment(indexFragment);
		indexIcon.setVisibility(View.GONE);
		mapIcon.setVisibility(View.VISIBLE);
	}

	public void mapClick(View v) {
		setAutoCompleteText(0, 0, null);
		fragmentManager.popBackStack(firstStackTag,
				FragmentManager.POP_BACK_STACK_INCLUSIVE);
		mapIcon.setVisibility(View.GONE);
		indexIcon.setVisibility(View.VISIBLE);
		isFirstFragment = true;
	}

	public void removeClick(View v) {
		textView.getText().clear();
	}

	@Override
	public void afterTextChanged(Editable arg0) {

	}

	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
			int arg3) {

	}

	@Override
	public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		String text = arg0.toString();
		if (text.equals(null) || text.equals("")) {
			indexIcon.setVisibility(View.VISIBLE);
			mapIcon.setVisibility(View.GONE);
			removeIcon.setVisibility(View.GONE);
		} else {
			removeIcon.setVisibility(View.VISIBLE);
			mapIcon.setVisibility(View.GONE);
			indexIcon.setVisibility(View.GONE);
		}
	}

	@Override
	public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
		switch (actionId) {
		case EditorInfo.IME_ACTION_SEARCH:
			onItemClick(null, v, 0, 0);
		}
		return false;
	}

}
