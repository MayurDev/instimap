package com.mrane.campusmap;

import java.util.HashMap;

public class Locations {
	public HashMap<String, Marker> data = new HashMap<String, Marker>();

	public Locations() {
		String s0 = "Aerospace Engineering Department";
		Marker m0 = new Marker(s0, "Aerospace Engg", 4153f, 2249f, 1);
		data.put(s0, m0);
		String s1 = "Bio-diesel Lab";
		Marker m1 = new Marker(s1, "", 4220f, 1556f, 1);
		data.put(s1, m1);
		String s5 = "Central Library";
		Marker m5 = new Marker(s5, "Library", 3820f, 1455f, 1);
		data.put(s5, m5);
		String s7 = "CESE";
		Marker m7 = new Marker(s7, "", 4340f, 1985f, 1);
		data.put(s7, m7);
		String s8 = "Chemical/Chemistry Department";
		Marker m8 = new Marker(s8, "Chemical Engg", 3788f, 2350f, 1);
		data.put(s8, m8);
		String s9 = "Civil Engineering Department";
		Marker m9 = new Marker(s9, "Civil Engg", 3879f, 1804f, 1);
		data.put(s9, m9);
		String s10 = "New Computer Science & Engineering Department";
		Marker m10 = new Marker(s10, "New CSE Dept.", 3422f, 1986f, 1);
		data.put(s10, m10);
		String s11 = "Old Computer Science Department";
		Marker m11 = new Marker(s11, "Old CSE Dept.", 4002f, 1545f, 1);
		data.put(s11, m11);
		String s13 = "CSRE";
		Marker m13 = new Marker(s13, "", 4096f, 1993f, 1);
		data.put(s13, m13);
		String s14 = "Cummins Engine Research facility";
		Marker m14 = new Marker(s14, "", 4372f, 1625f, 1);
		data.put(s14, m14);
		String s15 = "Earth Science Department";
		Marker m15 = new Marker(s15, "Earth Sc. Dept", 4038f, 2123f, 1);
		data.put(s15, m15);
		String s16 = "Electrical Engineering Department";
		Marker m16 = new Marker(s16, "EE Dept.", 3932f, 1997f, 1);
		data.put(s16, m16);
		String s17 = "Electrical Engineering Annex Building";
		Marker m17 = new Marker(s17, "EE Annex", 3657f, 1934f, 1);
		data.put(s17, m17);
		String s18 = "Electrical Maintenance Department";
		Marker m18 = new Marker(s18, "Elec Maintanance", 4544f, 1830f, 1);
		data.put(s18, m18);
		String s24 = "Humanities and Social Sciences (HSS)";
		Marker m24 = new Marker(s24, "HSS Dept.", 3911f, 2171f, 1);
		data.put(s24, m24);
		String s28 = "IDC";
		Marker m28 = new Marker(s28, "", 4207f, 1732f, 1);
		data.put(s28, m28);
		String s31 = "IRCC";
		Marker m31 = new Marker(s31, " ", 3505f, 1867f, 1);
		data.put(s31, m31);
		String s32 = "KReSIT Building";
		Marker m32 = new Marker(s32, "", 3301f, 2106f, 1);
		data.put(s32, m32);
		String s33 = "Lecture Hall Complex-1";
		Marker m33 = new Marker(s33, "LHC 1", 3570f, 2152f, 1);
		data.put(s33, m33);
		String s34 = "Lecture Hall Complex-2";
		Marker m34 = new Marker(s34, "LHC 2", 3779f, 2220f, 1);
		data.put(s34, m34);
		String s36 = "Main Building";
		Marker m36 = new Marker(s36, "", 3628f, 1640f, 1);
		data.put(s36, m36);
		String s37 = "Mathematics";
		Marker m37 = new Marker(s37, "", 3928f, 1496f, 1);
		data.put(s37, m37);
		String s38 = "Mechanical Engg.";
		Marker m38 = new Marker(s38, "", 4009f, 1645f, 1);
		data.put(s38, m38);
		String s39 = "Metallurgical Engg.";
		Marker m39 = new Marker(s39, "", 3631f, 2044f, 1);
		data.put(s39, m39);
		String s41 = "NanoTech. & Science Research Centre (ACRE)";
		Marker m41 = new Marker(s41, "", 4081f, 1344f, 1);
		data.put(s41, m41);
		String s42 = "NASA";
		Marker m42 = new Marker(s42, "", 4326f, 1896f, 1);
		data.put(s42, m42);
		String s43 = "ONGC Research Centre";
		Marker m43 = new Marker(s43, "", 4234f, 2162f, 1);
		data.put(s43, m43);
		String s44 = "OrthoCad Lab";
		Marker m44 = new Marker(s44, "", 4644f, 1767f, 1);
		data.put(s44, m44);
		String s45 = "Physics";
		Marker m45 = new Marker(s45, "", 3479f, 2247f, 1);
		data.put(s45, m45);
		String s49 = "SOM";
		Marker m49 = new Marker(s49, "", 3505f, 1867f, 1);
		data.put(s49, m49);
		String s54 = "Hostel 1";
		Marker m54 = new Marker(s54, "H1", 3908f, 1077f, 2);
		data.put(s54, m54);
		String s55 = "Hostel 2";
		Marker m55 = new Marker(s55, "H2", 3672f, 1000f, 2);
		data.put(s55, m55);
		String s56 = "Hostel 3";
		Marker m56 = new Marker(s56, "H3", 3435f, 946f, 2);
		data.put(s56, m56);
		String s57 = "Hostel 4";
		Marker m57 = new Marker(s57, "H4", 3176f, 867f, 2);
		data.put(s57, m57);
		String s58 = "Hostel 5";
		Marker m58 = new Marker(s58, "H5", 2820f, 970f, 2);
		data.put(s58, m58);
		String s59 = "Hostel 6";
		Marker m59 = new Marker(s59, "H6", 2500f, 748f, 2);
		data.put(s59, m59);
		String s60 = "Hostel 7";
		Marker m60 = new Marker(s60, "H7", 2454f, 942f, 2);
		data.put(s60, m60);
		String s61 = "Hostel 8";
		Marker m61 = new Marker(s61, "H8", 2834f, 1257f, 2);
		data.put(s61, m61);
		String s62 = "Hostel 9";
		Marker m62 = new Marker(s62, "H9", 2676f, 844f, 2);
		data.put(s62, m62);
		String s63 = "Hostel 10 Girls’ Hostel New";
		Marker m63 = new Marker(s63, "H10 (New)", 3005f, 2342f, 2);
		data.put(s63, m63);
		String s64 = "Hostel 10 Girls’ Annex";
		Marker m64 = new Marker(s64, "H10 (Annex)", 2886f, 2452f, 2);
		data.put(s64, m64);
		String s65 = "Hostel 10A Girls’ (P. Staff)";
		Marker m65 = new Marker(s65, "H10A", 4716f, 1448f, 2);
		data.put(s65, m65);
		String s66 = "Hostel 11 Girls’ Hostel";
		Marker m66 = new Marker(s66, "H11", 2987f, 1368f, 2);
		data.put(s66, m66);
		String s67 = "Hostel 12";
		Marker m67 = new Marker(s67, "H12", 2096f, 667f, 2);
		data.put(s67, m67);
		String s68 = "Hostel 13";
		Marker m68 = new Marker(s68, "H13", 1918f, 745f, 2);
		data.put(s68, m68);
		String s69 = "Hostel 14";
		Marker m69 = new Marker(s69, "H14", 2114f, 800f, 2);
		data.put(s69, m69);
		String s70 = "Hostel 15";
		Marker m70 = new Marker(s70, "H15", 4196f, 870f, 2);
		data.put(s70, m70);
		String s71 = "Hostel 16";
		Marker m71 = new Marker(s71, "H16", 3972f, 849f, 2);
		data.put(s71, m71);
		String s72 = "Ananta";
		Marker m72 = new Marker(s72, "", 4695f, 925f, 3);
		data.put(s72, m72);
		String s73 = "Aravali";
		Marker m73 = new Marker(s73, "", 4404f, 968f, 3);
		data.put(s73, m73);
		String s74 = "B-19";
		Marker m74 = new Marker(s74, "", 1413f, 2885f, 3);
		data.put(s74, m74);
		String s75 = "Director’s Bungalow";
		Marker m75 = new Marker(s75, "", 2593f, 2408f, 3);
		data.put(s75, m75);
		String s76 = "DRDO";
		Marker m76 = new Marker(s76, "", 4125f, 1048f, 3);
		data.put(s76, m76);
		String s77 = "Guest House/ Jalvihar";
		Marker m77 = new Marker(s77, "Jalvihar", 2610f, 2138f, 3);
		data.put(s77, m77);
		String s78 = "Guest House/ Vanvihar";
		Marker m78 = new Marker(s78, "Vanvihar", 2881f, 2106f, 3);
		data.put(s78, m78);
		String s79 = "Nilgiri";
		Marker m79 = new Marker(s79, "", 3318f, 2324f, 3);
		data.put(s79, m79);
		String s80 = "Old Multistoried Building";
		Marker m80 = new Marker(s80, "", 1413f, 2885f, 3);
		data.put(s80, m80);
		String s81 = "Shivalik";
		Marker m81 = new Marker(s81, "", 3129f, 2612f, 3);
		data.put(s81, m81);
		String s82 = "Staff Hostel";
		Marker m82 = new Marker(s82, "", 2872f, 1472f, 3);
		data.put(s82, m82);
		String s83 = "Tansa House (Proj. Staff)";
		Marker m83 = new Marker(s83, "", 3028f, 932f, 3);
		data.put(s83, m83);
		String s84 = "Vidya Niwas";
		Marker m84 = new Marker(s84, "", 4911f, 1111f, 3);
		data.put(s84, m84);
		String s85 = "Vihar House";
		Marker m85 = new Marker(s85, "", 4558f, 1429f, 3);
		data.put(s85, m85);
		String s86 = "White House";
		Marker m86 = new Marker(s86, "", 1909f, 2799f, 3);
		data.put(s86, m86);
		String s87 = "Convocation Hall";
		Marker m87 = new Marker(s87, "", 3255f, 1711f, 4);
		data.put(s87, m87);
		String s89 = "PC Saxena Auditorium (LT)";
		Marker m89 = new Marker(s89, "PCSA", 3648f, 1790f, 4);
		data.put(s89, m89);
		String s90 = "Seminar Hall";
		Marker m90 = new Marker(s90, "", 3792f, 2025f, 4);
		data.put(s90, m90);
		String s91 = "Victor Menezes Concention Center";
		Marker m91 = new Marker(s91, "VMCC", 4110f, 1847f, 4);
		data.put(s91, m91);
		String s92 = "Brewberry Cafe";
		Marker m92 = new Marker(s92, "", 2967f, 1271f, 5);
		data.put(s92, m92);
		String s93 = "Gulmohar Restaurant";
		Marker m93 = new Marker(s93, "", 2989f, 2154f, 5);
		data.put(s93, m93);
		String s94 = "Nestle Cafe (Coffee Shack)";
		Marker m94 = new Marker(s94, "Coffee Shack", 3492f, 1784f, 5);
		data.put(s94, m94);
		String s95 = "Staff Canteen";
		Marker m95 = new Marker(s95, "", 3622f, 1547f, 5);
		data.put(s95, m95);
		String s96 = "ATM - Canara Bank";
		Marker m96 = new Marker(s96, "Canara ATM", 2659f, 931f, 6);
		data.put(s96, m96);
		String s97 = "ATM - State Bank";
		Marker m97 = new Marker(s97, "SBI ATM", 3028f, 989f, 6);
		data.put(s97, m97);
		String s99 = "State Bank";
		Marker m99 = new Marker(s99, "", 2154f, 3213f, 6);
		data.put(s99, m99);
		String s100 = "Campus School";
		Marker m100 = new Marker(s100, "", 3331f, 2865f, 7);
		data.put(s100, m100);
		String s102 = "Kendriya Vidyalaya (KV)";
		Marker m102 = new Marker(s102, "", 3883f, 2714f, 7);
		data.put(s102, m102);
		String s103 = "Badminton Court";
		Marker m103 = new Marker(s103, "", 3042f, 1244f, 8);
		data.put(s103, m103);
		String s104 = "SAC";
		Marker m104 = new Marker(s104, "", 3599f, 1225f, 8);
		data.put(s104, m104);
		String s105 = "Indoor SAC";
		Marker m105 = new Marker(s105, "", 3480f, 1081f, 8);
		data.put(s105, m105);
		String s106 = "Staff Club";
		Marker m106 = new Marker(s106, "", 2931f, 2027f, 8);
		data.put(s106, m106);
		String s107 = "Swimming Pool";
		Marker m107 = new Marker(s107, "", 3742f, 1229f, 8);
		data.put(s107, m107);
		String s108 = "Swimming Pool (new)";
		Marker m108 = new Marker(s108, "", 3558f, 1141f, 8);
		data.put(s108, m108);
		String s109 = "Tennis Court (old)";
		Marker m109 = new Marker(s109, "", 3177f, 1624f, 8);
		data.put(s109, m109);
		String s110 = "Tennis Court (new)";
		Marker m110 = new Marker(s110, "", 3046f, 1513f, 8);
		data.put(s110, m110);
		String s111 = "Power House";
		Marker m111 = new Marker(s111, "", 4671f, 1590f, 9);
		data.put(s111, m111);
		String s112 = "Printing Press";
		Marker m112 = new Marker(s112, "", 4326f, 1896f, 9);
		data.put(s112, m112);
		String s115 = "Boat House";
		Marker m115 = new Marker(s115, "", 1960f, 1757f, 9);
		data.put(s115, m115);
		String s116 = "Hospital";
		Marker m116 = new Marker(s116, "", 3018f, 1917f, 9);
		data.put(s116, m116);
		String s117 = "Kshitij Udyan";
		Marker m117 = new Marker(s117, "", 2971f, 1744f, 9);
		data.put(s117, m117);
		String s118 = "Lake Side Gate";
		Marker m118 = new Marker(s118, "", 792f, 2777f, 9);
		data.put(s118, m118);
		String s119 = "Main Gate";
		Marker m119 = new Marker(s119, "", 2259f, 3237f, 9);
		data.put(s119, m119);
		String s120 = "Market Gate";
		Marker m120 = new Marker(s120, "", 3829f, 2972f, 9);
		data.put(s120, m120);
		String s121 = "Medical Store";
		Marker m121 = new Marker(s121, "", 4000f, 2808f, 9);
		data.put(s121, m121);
		String s122 = "NCC Office";
		Marker m122 = new Marker(s122, "", 3387f, 1421f, 9);
		data.put(s122, m122);
		String s123 = "Post Office";
		Marker m123 = new Marker(s123, "", 3918f, 2846f, 9);
		data.put(s123, m123);
		String s124 = "Sarovar Udyan";
		Marker m124 = new Marker(s124, "", 1749f, 2814f, 9);
		data.put(s124, m124);
		String s125 = "Shishu Vihar";
		Marker m125 = new Marker(s125, "", 2949f, 1495f, 9);
		data.put(s125, m125);
		String s126 = "Temple (Padmavati Devi)";
		Marker m126 = new Marker(s126, "Temple", 946f, 2178f, 9);
		data.put(s126, m126);
	}
}