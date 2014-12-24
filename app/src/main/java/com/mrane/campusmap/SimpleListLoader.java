package com.mrane.campusmap;

/*
 * Copyright 2012 CodeSlap - Cristian Castiblanco
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

/**
 * Used to write apps that run on platforms prior to Android 3.0.  When running
 * on Android 3.0 or above, this implementation is still used; it does not try
 * to switch to the framework's implementation.  See the framework SDK
 * documentation for a class overview.
 *
 * This was based on the CursorLoader class
 *
 * @author cristian
 */
public abstract class SimpleListLoader<T> extends AsyncTaskLoader<List<T>> {
    private List<T> mList;

    public SimpleListLoader(Context context) {
        super(context);
    }

    /* Runs on a worker thread */
    @Override
    public abstract List<T> loadInBackground();

    /* Runs on the UI thread */
    @Override
    public void deliverResult(List<T> list) {
        if (isReset()) {
            // An async query came in while the loader is stopped

            return;
        }
        mList = list;

        if (isStarted()) {
            super.deliverResult(list);
        }
    }

    /**
     * Starts an asynchronous load of the contacts list data. When the result is ready the callbacks
     * will be called on the UI thread. If a previous load has been completed and is still valid
     * the result may be passed to the callbacks immediately.
     * <p/>
     * Must be called from the UI thread
     */
    @Override
    protected void onStartLoading() {
        if (mList != null) {
            deliverResult(mList);
        }
        if (takeContentChanged() || mList == null) {
            forceLoad();
        }
    }

    /**
     * Must be called from the UI thread
     */
    @Override
    protected void onStopLoading() {
        // Attempt to cancel the current load task if possible.
        cancelLoad();
    }

    @Override
    public void onCanceled(List<T> cursor) {

    }

    @Override
    protected void onReset() {
        super.onReset();

        // Ensure the loader is stopped
        onStopLoading();
        mList = null;
    }
}