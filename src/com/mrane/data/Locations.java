package com.mrane.data;

import java.util.HashMap;

import android.content.Context;

public class Locations {
	public HashMap<String, Marker> data = new HashMap<String, Marker>();

	public Locations(Context context) {
		Marker m0 = new Room("ACRE Advanced Centre for Research in Electronics", "ACRE", 4081, 1344, 1, "CRNTS NanoTech. & Science Research Centre", "Inside", "");
data.put(m0.name, m0);
Marker m1 = new Marker("Aerospace Engineering Department", "Aero engg", 4153, 2249, 1, "http://www.aero.iitb.ac.in/Phone No.: (+91-22) 2576 7101 / (+91-22) 2576 7102Fax No.: (+91-22) 2572 2602.Email: office@aero.iitb.ac.in The department offers academic programs for B. Tech, M. Tech, Ph. D. Specialization are offered: Aerodynamics, Control and Guidance, Propulsion, Structures, and Systems Engineering");
data.put(m1.name, m1);
Marker m2 = new Marker("Ananta", "0", 4695, 925, 3, "");
data.put(m2.name, m2);
Marker m3 = new Marker("Aravali", "0", 4404, 968, 3, "");
data.put(m3.name, m3);
Marker m4 = new Marker("ATM - Canara Bank", "Canara ATM", 2659, 931, 6, "");
data.put(m4.name, m4);
Marker m5 = new Marker("ATM - State Bank", "SBI ATM", 3028, 989, 6, "");
data.put(m5.name, m5);
Marker m6 = new Marker("B-19", "0", 1413, 2885, 3, "");
data.put(m6.name, m6);
Marker m7 = new Marker("Badminton Court", "0", 3042, 1244, 8, "");
data.put(m7.name, m7);
Marker m8 = new Marker("Bio-diesel Lab", "0", 4220, 1556, 1, "www.che.iitb.ac.in/chea/biosynth/be-a-part.phpcontact@biosynthiitb.orgProject ‘Biosynth’ is an initiative by the students of the Department of Chemical Engineering, IIT Bombay to install a Biodiesel plant. This student-managed initiative was started in 2008. The R & D activities at the plant include:the adaptation of the standard biodiesel production process to the available waste vegetable oil, the quality control for the biodiesel produced, allied issues pertaining to design and planning and research projects.");
data.put(m8.name, m8);
Marker m10 = new Marker("Boat House", "0", 1960, 1757, 9, "Timings: 6 am to 6 pm");
data.put(m10.name, m10);
Marker m11 = new Room("Brewberrys Cafe", "Brewberrys", 2967, 1271, 5, "Hostel 08", "Inside", "Ph no: 022 65641001, Hostel 8, IIT Bombay, Powai, Mumbai");
data.put(m11.name, m11);
Marker m12 = new Marker("Campus School", "0", 3331, 2865, 7, "Principal: MS.BHAGWAT A.S022 2576 8992Campus School began as a primary school on 29 June 1976. V to X standard was added by 1986 with 100% results in X std in 1986, 1987 and 1988. The junior college classes FYJC or XI Std and SYJC or XII Std were started in science stream under Principal Chandra Rao in 1989. The Primary to JC complex has about 400 students on its roll, 35 teachers and 20 non-teaching staff. Admission to all classes is restricted to children of IIT employees with some seats made available to the children of NITIE and SAMEER employees.");
data.put(m12.name, m12);
Marker m13 = new Marker("Central Library", "0", 3820, 1455, 1, "http://www.library.iitb.ac.in/022 2576 8921Library Working HoursMonday through Friday 0900 – 2300 hrsMonday through Friday 0900 – 0100 hrs (during examination)Saturdays / Sundays / Holidays   1000 – 1700 hrsSaturdays / Sundays / Holidays   1000 – 0100 hrs (during examination)Circulation HoursMonday through Friday 0900–2000 hrsSaturday, Sunday & Holidays 1100–1300 hrsSelf Issue / self Check out, any time till library is open.Study room books issued for overnight, one hour before closing of the library on all days");
data.put(m13.name, m13);
Marker m14 = new Marker("CESE Centre for Environmental Science and Engineering", "CESE", 4340, 1985, 1, "http://www.cese.iitb.ac.in/Tel +91-22-25767851 Fax +91-22-25764650The Centre offers M.Tech. and Ph.D. programmes, which are interdisciplinary in nature and consists of course work followed by a research project. The duration of the Ph.D. programme varies depending upon the background of the candidate.");
data.put(m14.name, m14);
Marker m15 = new Marker("Chemistry Department", "Chemistry", 3788, 2350, 1, "http://www.chem.iitb.ac.in/Phone: 022-2576-7151 Fax: 022-2572-3480, 022-2576-7152 The department offers academic programs for M.Sc, Ph.D, (M.Sc + Ph.D) Dual Degree Courses, 4 year BS degree course (From 2014, the 5 year Integrated M.Sc course has been replaced by the 4 year B.S course).");
data.put(m15.name, m15);
Marker m16 = new Marker("Civil Engineering Department", "Civil", 3879, 1804, 1, "http://www.civil.iitb.ac.in/Tel:+91-22-2576 7301Fax:+91-22-2576 7302The department offers academic programs for B Tech, Dual Degree (B Tech + M Tech), M Tech, MS and Ph.D across different divisions such asBuilding Technology and Construction Management (BTCM)Environmental and Water Resources Engineering (EWRE)Geotechnical Engineering (GT)Structural Engineering (ST)Transportation Engineering (TR)");
data.put(m16.name, m16);
Marker m17 = new Marker("Convocation Hall", "0", 3255, 1711, 4, "022 2576  2781");
data.put(m17.name, m17);
Marker m18 = new Building("CRNTS NanoTech. & Science Research Centre", "CRNTS", 4081, 1344, 1, new String[] {"ACRE Advanced Centre for Research in Electronics","SAIF Sophisticated Analytical Instruments Facility"}, "http://www.iitb.ac.in/~crnts/Tel:+91-22-25767691CRNTS offers programs such asDual degree programme-1 (B.Tech. Engg. Physics & M.Tech. Engg. Physics with specialization in Nanoscience. Admission Through: JEE. Offered by: Department of Physics. Duration: 5 years)Dual degree programme-2 (M.Sc. Physics & M.Tech. in Materials Science with specialization in Nanoscience., Input : B.Sc. (Physics), Admission through: J.A.M. Jointly offered by Department of Physics & Department of Metallurgical Engg. & Materials Science)Ph.D ( Interdisciplinary program. Research Domains include Nanomaterials, Nanobiotechnology,  Nanofluidics, Nanoelectronics, Nanomanufacturing, Nanosensors, Computational research in Nanosystems)");
data.put(m18.name, m18);
Marker m19 = new Marker("CSRE Centre of Studies in Resources Engineering", "CSRE", 4096, 1993, 1, "http://www.csre.iitb.ac.in/Tel:+91 22 2576 7662The centre offers Ph.D, M Tech, UG Minor and institute elective. Research areas include Spatial Analysis, Digital Image Processing, Global Positioning System (GPS) and Photogrammetry, Geocomputational Systems, Microwave Remote Sensing, Snow and Glacier Studies, Geology and Mineral Resources, Agro-Informatics and rural development, Terrain evaluation group, Environment, natural hazards and disaster management, Coastal and marine sciences");
data.put(m19.name, m19);
Marker m20 = new Marker("Director’s Bungalow", "0", 2593, 2408, 3, "");
data.put(m20.name, m20);
Marker m21 = new Marker("DRDO", "0", 4125, 1048, 3, "");
data.put(m21.name, m21);
Marker m22 = new Marker("Earth Science Department", "Earth Sci", 4038, 2123, 1, "http://www.geos.iitb.ac.in/+91-22-2576 7251, 2576 7265The department offers academic programs for M.Sc (Applied Geology, Applied Geophysics, Geoexploration), M Tech (Petroleum Geoscience) and Ph.D. Research areas include Mineralogy, Geochemistry and Ore Deposits Structural Geology Igneous and Metamorphic Petrology Engineering geology, Hydro-geology Sedimentology Stratigraphy and Micro-Paleontology Mathematical Geology/ Ore Deposit Modelling Rock Magnetism and Marine Geology Seismology, Geothermics");
data.put(m22.name, m22);
Marker m23 = new Marker("Electrical Engineering Annex Building", "Elec engg Anx", 3657, 1934, 1, "http://www.ee.iitb.ac.in/+91-22-2576 4408 ");
data.put(m23.name, m23);
Marker m24 = new Marker("Electrical Engineering Department", "Elec engg", 3932, 1997, 1, "http://www.ee.iitb.ac.in/ +91-22-2576-7401/ 7042B Tech, B Tech Honors, Dual Degree Program (B Tech + M Tech), M Tech (Full time 2 yrs, Part time 3yrs with specializations such as Communications, Engineering (termed as EE1), Control and Computing (EE2), Power Electronics and Power System (EE3), Microelectronics and VLSI (EE4), Electronic Systems (EE5)) and Ph D");
data.put(m24.name, m24);
Marker m26 = new Marker("Electrical Maintenence", "Elec Maint", 4544, 1830, 1, "022 2576 7971/4077");
data.put(m26.name, m26);
Marker m27 = new Marker("Guest House/ Jalvihar", "Jalvihar", 2610, 2138, 3, "022 2576 8940/8942/8943");
data.put(m27.name, m27);
Marker m28 = new Marker("Guest House/ Vanvihar", "Vanvihar", 2881, 2106, 3, "022 2576 1200/8945");
data.put(m28.name, m28);
Marker m29 = new Marker("Gulmohar Restaurant", "Gulmohar", 2989, 2154, 5, "022 2576 2783/2786");
data.put(m29.name, m29);
Marker m30 = new Marker("Hospital", "0", 3018, 1917, 9, "022 2576 7051, Ambulance 022 2576 1101");
data.put(m30.name, m30);
Marker m31 = new Marker("Hostel 01", "H1", 3908, 1077, 2, "Hostel security: 022-2576 2601Hall Manager: 022-2576 2701G.Sec: Ratikant 9930836852");
data.put(m31.name, m31);
Marker m32 = new Marker("Hostel 10 Girls’ Annex", "H10 Annx", 2886, 2452, 2, "Hostel security: 022-2576 2619Hall Manager: 022-2576G.Sec: Sagarika Kumar 9167273231");
data.put(m32.name, m32);
Marker m33 = new Marker("Hostel 10 Girls’ Hostel New", "H10 New", 3005, 2342, 2, "Hostel security: 022-2576 2610Hall Manager: 022-2576 2710G.Sec: Madhu Lekha 9769372532");
data.put(m33.name, m33);
Marker m34 = new Marker("Hostel 10A Girls’ QIP building (P. Staff)", "H10 QIP", 4716, 1448, 2, "Hostel security: 022-2576Hall Manager: 022-2576G.Sec:");
data.put(m34.name, m34);
Marker m35 = new Marker("Hostel 11 Girls’ Hostel", "H11", 2987, 1368, 2, "Hostel security: 022-2576 2611Hall Manager: 022-2576 2711G.Sec: Nanditha 9769834234");
data.put(m35.name, m35);
Marker m36 = new Marker("Hostel 12", "H12", 2096, 667, 2, "Hostel security: 022-2576 2612Hall Manager: 022-2576 2712G.Sec: Ashutosh 9167782489");
data.put(m36.name, m36);
Marker m37 = new Marker("Hostel 13", "H13", 1918, 745, 2, "Hostel security: 022-2576 2613Hall Manager: 022-2576 2713G.Sec: Raj Kumar Yadav 9769484219");
data.put(m37.name, m37);
Marker m38 = new Marker("Hostel 14", "H14", 2114, 800, 2, "Hostel security: 022-2576 2614Hall Manager: 022-2576 2714G.Sec: Mayuresh Pant 9730694513");
data.put(m38.name, m38);
Marker m39 = new Marker("Hostel 15", "H15", 4196, 870, 2, "Hostel security: 022-2576 2715Hall Manager: 022-2576G.Sec:");
data.put(m39.name, m39);
Marker m40 = new Marker("Hostel 16", "H16", 3972, 849, 2, "Hostel security: 022-2576 2716Hall Manager: 022-2576G.Sec:");
data.put(m40.name, m40);
Marker m41 = new Marker("Hostel 02", "H2", 3672, 1000, 2, "Hostel security: 022-2576 2602Hall Manager: 022-2576 2702G.Sec: Manohar Reddy Devarpalli 8796879949");
data.put(m41.name, m41);
Marker m42 = new Marker("Hostel 03", "H3 ", 3435, 946, 2, "Hostel security: 022-2576 2603Hall Manager: 022-2576 2703G.Sec: Arvind Jangid 9820525369");
data.put(m42.name, m42);
Marker m43 = new Marker("Hostel 04", "H4", 3176, 867, 2, "Hostel security: 022-2576 2604Hall Manager: 022-2576 2704G.Sec: Kumar Gaurav 9969800320");
data.put(m43.name, m43);
Marker m44 = new Marker("Hostel 05", "H5", 2820, 970, 2, "Hostel security: 022-2576 2605Hall Manager: 022-2576 2705G.Sec: Shashank Patidar 9820717487");
data.put(m44.name, m44);
Marker m45 = new Marker("Hostel 06", "H6", 2500, 748, 2, "Hostel security: 022-2576 2606Hall Manager: 022-2576 2706G.Sec: Anil Reddy 9022623186");
data.put(m45.name, m45);
Marker m46 = new Marker("Hostel 07", "H7", 2454, 942, 2, "Hostel security: 022-2576 2607Hall Manager: 022-2576 2707G.Sec: Archit Laddha 9930239739");
data.put(m46.name, m46);
Marker m47 = new Building("Hostel 08", "H8", 2834, 1257, 2, new String[] {"Brewberrys Cafe"}, "Hostel security: 022-2576 2608Hall Manager: 022-2576 2708G.Sec: Mayur Kalambe 9920147585");
data.put(m47.name, m47);
Marker m48 = new Marker("Hostel 09", "H9", 2676, 844, 2, "Hostel security: 022-2576 2609Hall Manager: 022-2576 2709G.Sec: Shubham Meena 9619835583");
data.put(m48.name, m48);
Marker m49 = new Marker("HSS Humanities and Social Sciences", "HSS", 3911, 2171, 1, "http://www.hss.iitb.ac.in/022 2576 7351/ 022 2576 73517352The department offers academic programs for B. Tech, M. Phil, Ph. D. Research areas include Economics, English, Philosophy, Psychology, Sociology");
data.put(m49.name, m49);
Marker m50 = new Marker("IDC Industrial Design Centre", "IDC", 4207, 1732, 1, "http://www.idc.iitb.ac.in091-022-2576 7801The department offers academic programs for M. Des and Ph. D. Sub-disciplines include Product Design, Industrial Design, Visual Communication, Animation, Interaction Design, Mobility and vehicle design");
data.put(m50.name, m50);
Marker m51 = new Marker("Indoor Stadium", "0", 3480, 1081, 8, "");
data.put(m51.name, m51);
Marker m52 = new Room("IRCC Indian Research & Consultancy Centre", "IRCC", 3505, 1867, 1, "SOM School of Management", "Level 2", "91-22-2576 7030, 91-22-2576 7039www.ircc.iitb.ac.inThe Industrial Research and Consultancy Centre (IRCC) co-ordinates and facilitates all research and development activities at the Institute.");
data.put(m52.name, m52);
Marker m53 = new Marker("KReSIT Kanwal Rekhi School of Information Technology ", "KResit", 3301, 2106, 1, "For admission / general queries 2576 7967/77Office 022 2576 7901 / 7902Security 022 2576 2784");
data.put(m53.name, m53);
Marker m54 = new Marker("Kshitij Udyan", "0", 2971, 1744, 9, "");
data.put(m54.name, m54);
Marker m55 = new Marker("KV Kendriya Vidyalaya ", "0", 3883, 2714, 7, "022 2576 8983");
data.put(m55.name, m55);
Marker m56 = new Marker("Lake Side Gate", "0", 792, 2777, 10, "022 2576 1124");
data.put(m56.name, m56);
Marker m57 = new Marker("Lecture Hall Complex-1", "Lec Hall 1", 3570, 2152, 1, "");
data.put(m57.name, m57);
Marker m58 = new Marker("Lecture Hall Complex-2", "Lec Hall 2", 3779, 2220, 1, "");
data.put(m58.name, m58);
Marker m59 = new Marker("Main Building", "0", 3628, 1640, 1, "");
data.put(m59.name, m59);
Marker m60 = new Marker("Main Gate", "0", 2259, 3237, 10, "02576 8978/1123. Tum Tum coupons available at Main Gate");
data.put(m60.name, m60);
Marker m61 = new Marker("Market Gate, Y point Gate", "0", 3829, 2972, 10, "2576 8979/1121");
data.put(m61.name, m61);
Marker m62 = new Marker("Mathematics Department", "Math", 3928, 1496, 1, "http://www.math.iitb.ac.in/022-2576 7451B Tech (core courses), MSc (ASI, Maths), Ph D");
data.put(m62.name, m62);
Marker m63 = new Marker("Mechanical Engineering", "Mech ", 4009, 1645, 1, "http://www.me.iitb.ac.in/(91) 22 - 2572 2545 Ext. 7500, 7501, 2576 7500, 2576 7501.The department offers academic programs for B. Tech, Dual degree, M. Tech and Ph. D. Research areas include design enggineering, manufacturing enggineering, thermal and fluid enggineering");
data.put(m63.name, m63);
Marker m64 = new Marker("Medical Store", "0", 4000, 2808, 9, "");
data.put(m64.name, m64);
Marker m65 = new Marker("MEMS Metallurgical Engineering and Material Science", "MEMS", 3631, 2044, 1, "http://www.met.iitb.ac.in/022 2576 7601/7602The department offers academic programs for B. Tech, Dual degree (B Tech + M Tech), M. Tech and Ph. D. Dual degree specializations include Ceramics and Composites and Metallurgical Process Engineering. M Tech specializations include Materials Science, Steel Technology, Process Engineering and Corrosion Science.");
data.put(m65.name, m65);
Marker m66 = new Marker("NASA Non- Academic Staff Association", "NASA", 4326, 1896, 1, "022 2576 8919");
data.put(m66.name, m66);
Marker m67 = new Marker("NCC Office", "0", 3387, 1421, 9, "022 2576 8917");
data.put(m67.name, m67);
Marker m68 = new Marker("Nestle Cafe (Coffee Shack)", "0", 3492, 1784, 5, "");
data.put(m68.name, m68);
Marker m69 = new Marker("New Computer Science Engineering Department", "New CSE", 3422, 1986, 1, "http://www.cse.iitb.ac.in/+91-22-2576 7901/02The department offers academic programs for B. Tech, Dual degree (B Tech + M Tech), M Tech, Dual Degree PG (M. Tech + Ph. D) and Ph. D. Research areas include algorithms, programming languages and Compilers, database and information systems, artificial intelligence and natural language processing, software engineering, formal methods, distributed systems, computer networks, data mining, computer graphics, computer vision and image understanding, real-time and embedded systems, formal languages and bio-inspired computing");
data.put(m69.name, m69);
Marker m70 = new Marker("Nilgiri B 24", "B 24", 3318, 2324, 3, "");
data.put(m70.name, m70);
Marker m71 = new Marker("Old Computer Science Engineering Department", "Old CSE", 4002, 1545, 1, "http://www.cse.iitb.ac.in/022 2576 7701/7702/2771The department offers academic programs for B. Tech, Dual degree (B Tech + M Tech), Dual Degree PG (M. Tech + Ph. D) and Ph. D. Research areas include algorithms, programming languages and Compilers, database and information systems, artificial intelligence and natural language processing, software engineering, formal methods, distributed systems, computer networks, data mining, computer graphics, computer vision and image understanding, real-time and embedded systems, formal languages and bio-inspired computing");
data.put(m71.name, m71);
Marker m72 = new Marker("Old Multistoried Building- Residence", "0", 1413, 2885, 3, "Building lift phone 022 2576 2884");
data.put(m72.name, m72);
Marker m73 = new Marker("ONGC Research Centre", "0", 4234, 2162, 1, "Currently, the centre is working on a project titled Physical and Numerical Models for Un-conventional Flood Patterns. The project relates to increasing countrys currrent oil production by means of Enhanced Oil Recovery (EOR) processes. ");
data.put(m73.name, m73);
Marker m74 = new Marker("OrthoCad Lab", "0", 4644, 1767, 1, "The OrthoCAD Network Research Cell was established in 2007 to jump-start indigenous research and development activities in orthopaedic reconstruction systems. The OrthoCAD Network addresses a critical need for mega-prostheses to reconstruct massive gaps or loss of bone from osteo-sarcoma (cancer), congenital (birth) defects or trauma (accidents).");
data.put(m74.name, m74);
Marker m75 = new Marker("Padmavati Devi Temple", "0", 946, 2178, 9, "");
data.put(m75.name, m75);
Marker m76 = new Marker("PC Saxena Auditorium (LT)", "PC Saxena Audi, LT", 3648, 1790, 4, "022 2576 4999");
data.put(m76.name, m76);
Marker m77 = new Marker("Physics Department", "0", 3479, 2247, 1, "The department offers academic programs for B.Tech Engineering Physics (through JEE), Dual degree B.Tech + M.Tech in Engineering Physics with specialisation in Nanoscience (through JEE), MSc Physics 2 Years programme (through JAM), Dual degree programme of MSc and PhD in physics (through JAM). Research areas include Condensed Matter Physics, Photonics and Optics, Nuclear Physics, High Energy Physics, Statistical Physics");
data.put(m77.name, m77);
Marker m78 = new Marker("Post Office", "0", 3918, 2846, 9, "022 2576 2774");
data.put(m78.name, m78);
Marker m79 = new Marker("Power House", "0", 4671, 1590, 9, "");
data.put(m79.name, m79);
Marker m80 = new Marker("Printing Press", "0", 4326, 1896, 9, "022 2576 8961");
data.put(m80.name, m80);
Marker m81 = new Marker("SAC Students Activity Centre", "SAC", 3599, 1225, 8, "022 2576 8968");
data.put(m81.name, m81);
Marker m82 = new Room("SAIF Sophisticated Analytical Instruments Facility", "SAIF", 4081, 1344, 1, "CRNTS NanoTech. & Science Research Centre", "", "022-25767691/2");
data.put(m82.name, m82);
Marker m83 = new Marker("Sarovar Udyan", "0", 1749, 2814, 9, "");
data.put(m83.name, m83);
Marker m84 = new Marker("Seminar Hall", "0", 3792, 2025, 4, "022 2576 4912, for booking 022 2576 4420");
data.put(m84.name, m84);
Marker m85 = new Marker("Shishu Vihar", "0", 2949, 1495, 9, "");
data.put(m85.name, m85);
Marker m86 = new Marker("Shivalik C 23", "C 23", 3129, 2612, 3, "");
data.put(m86.name, m86);
Marker m87 = new Building("SOM School of Management", "SOM", 3505, 1867, 1, new String[] {"IRCC Indian Research & Consultancy Centre"}, "http://www.som.iitb.ac.in/Office - +91 22 2576 7781Ph. D. admissions - +91 22 2576 7782M. Mgt. admissions - +91 22 2576 8781 The department offers academic programs in Master Of Management Programme - Full Time, Doctoral Programme in Management - PhD Degree, Management Development Programme - For Corporate Executives");
data.put(m87.name, m87);
Marker m88 = new Marker("Staff Canteen", "Staff Cant.", 3622, 1547, 5, "022 2576 8952");
data.put(m88.name, m88);
Marker m89 = new Marker("Staff Club", "0", 2931, 2027, 8, "022 3576 4075");
data.put(m89.name, m89);
Marker m90 = new Marker("Staff Hostel", "0", 2872, 1472, 3, "022 2576 1113");
data.put(m90.name, m90);
Marker m91 = new Marker("SBI State Bank of India, IIT Powai branch", "SBI", 2154, 3213, 6, "Phone (022) 25722894-25721103Faxwork hours: 10:30 am to 4:30 pm");
data.put(m91.name, m91);
Marker m92 = new Marker("Swimming Pool (new)", "S. Pool new", 3558, 1141, 8, "022 2576 2755");
data.put(m92.name, m92);
Marker m93 = new Marker("Swimming Pool (old)", "S. Pool old", 3742, 1229, 8, "022 2576 8967");
data.put(m93.name, m93);
Marker m94 = new Marker("Tansa House (Proj. Staff Boys)", "Tansa", 3028, 932, 3, "022 2576 2620");
data.put(m94.name, m94);
Marker m95 = new Marker("Tennis Court (new)", "0", 3046, 1513, 8, "");
data.put(m95.name, m95);
Marker m96 = new Marker("Tennis Court (old)", "0", 3177, 1624, 8, "");
data.put(m96.name, m96);
Marker m97 = new Marker("Victor Menezes Convention Centre", "VMCC", 4110, 1847, 4, "022 2576 1125");
data.put(m97.name, m97);
Marker m98 = new Marker("Vidya Niwas", "0", 4911, 1111, 3, "");
data.put(m98.name, m98);
Marker m99 = new Marker("Vihar House", "0", 4558, 1429, 3, "");
data.put(m99.name, m99);
Marker m100 = new Marker("White House", "0", 1909, 2799, 3, "A wing 022 2576 2885,B wing 022 2576 2840");
data.put(m100.name, m100);

	}
}