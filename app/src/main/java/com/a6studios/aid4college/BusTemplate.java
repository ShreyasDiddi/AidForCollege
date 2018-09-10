package com.a6studios.aid4college;

import java.util.ArrayList;

/**
 * Created by HP on 10/28/2017.
 */

public class BusTemplate {
        private String bno;
        private String name;
        private String phone;
        private String route;

        public BusTemplate(String a,String b,String c ,String d){
                bno=a;
                name = b;
                phone = c;
                route = d;
        }

        public String getBno () {
                return bno;
        }
        public String getName () {
                return name;
        }
        public String getPhone(){
                return phone;
        }
        public String getRoute(){
                return route;
        }

        public static ArrayList<BusTemplate> createBusList(){
                ArrayList<BusTemplate> BusList = new ArrayList<BusTemplate>();
                BusList.add(new BusTemplate ("01","Vishnuvardhan Reddy","7032208821","Jeedimetla 7:05AM - Chintal - Balanagar X Road - Boji Function Hall (Balanagar) - Bowenpally (CMR Function Hall) - Bapuji Nagar (Sarojini Pulla Reddy Hospital)- Diamond Point - Mud Fort (Near Ford Show Room)- JBS - YMC - Sangeeth – College"));
                BusList.add(new BusTemplate ("02","Ramachandraiah","7731914909","Masab Tank Under Flyover-7.00AM- NMDC- Mehdipatnam (Before Rythu Bazar- Rathibowli- Raya Dharga- Gachibowli- TSPA- Rajendra Nagar- College"));
                BusList.add(new BusTemplate ("03","Satyanarayana","7093754915","Indira Park – 7:10AM - Indira Park - TDP Office - Ashok Nagar X Road (Before  Khaman) - RTC X Road Sandhya Theatre - Bus Bhavan – VST- SBI- Amberpet - Ramanthapur Church- College"));
                BusList.add(new BusTemplate ("04","Mallesh","9963334892","Pedda Amberpet Checkpost-7.30AM- Hayatnagar-Mandal Office –RTC Colony -Hyt - Bus Depot - Bhagyalatha Colony - High Court Colony- Andhra Bank ATM - Kamala Nagar - Bhulaxmi Nagar (Bus Stop) - Sampoorna Theatre - Vidya Nagar (Siva Sindhu school) - Sri Indu PG College - College"));
                BusList.add(new BusTemplate ("05","Thirupathi","9704706344","Bollaram Railway Station- 7.00AM - Risala bazar- Macha Bollaram-Old Alwal IG Statue- Alwal Bus Stop - Lothukunta (China Bazar)- Lal Bazar –Thirumalagiri- Kharkhana (Adidas Showroom) - College"));
                BusList.add(new BusTemplate ("06","Rasheed","9392869455","Liberty – 7:20AM - Tata Show Room - Himayat Nagar –X- Road - Sri Chaitanya College - Barkatpura Bus Depot - PF Office - Tourist Hotel - Kachiguda - Golnaka X Road - DSNR – Asta Laxmi Temple - College"));
                BusList.add(new BusTemplate ("07","Srinivas Reddy","9966771501","Vinayaka Nagar Bus Stop – 7:25AM - Anand Bagh - Vani Nagar - Anutex - Malkajgiri - Thukaramgate – Mettuguda - College"));
                BusList.add(new BusTemplate ("08","Suresh","8367012274","Mother Dairy – 7:25AM - DD Colony (Hotel Management) - Prashanth Nagar (Shivam Road) - SBI/ Bakers Q (Shivam Road) - Amberpet Darga - Amberpet Petrol Bunk - Ramanthapur TV station - Bharat Petroleum (Ramanthapur) - College"));
                BusList.add(new BusTemplate ("09","Krishna","9396566657","Vijaya Laxmi Theatre – 8:10AM - Chintalkunta - Vishnu Theatre – Panama - Prashanth Nagar Reliance Fresh - SBI ATM - Ganesh Temple - RED Tank - NGO’s Colony Area Hospital - NGO’s colony More Shop - NGO’s Colony Bus Stop - SKDR Bus Stop - BN Reddy - College"));
                BusList.add(new BusTemplate ("10","Srinivas","9951108428","Nalgonda X Road (Yashoda Hospital) – 7:35AM - Chanchal Guda Jail - Madannapet – Dhobighat-Bharat Garden - Champapet - Sama Narasimha Reddy Garden - Biramalguda - Sagar Ring Road Petrol Bunk - College"));
                BusList.add(new BusTemplate ("11","Srinivas","9951575889","Moti Nagar Circle – 7:00AM - Kalyan Nagar - SR Nagar (Circle) - Mythri Vanam - Ameerpet (Kanakadurga Temple) - Lal Bungalow - Life Style - HPS - Shopper’s Stop - Anand Theatre - College"));
                BusList.add(new BusTemplate ("12","Narasimha","9618125272","IS Sadan- 7.50AM Hastinapur –-Hastinapur Center - Bharathi Hostel - College"));
                BusList.add(new BusTemplate ("13","Kishan","9553471877","Satya Nagar – 7:40AM – Maruthi Nagar – Swhetha Garden – Rajarajeswari Temple - Mohan Nagar- New Nagole- Nagole X Road - College"));
                BusList.add(new BusTemplate ("14","Gopal","9963833781","Film Nagar – 7:00AM - Jubilee Hills - TV9- Taj Krishna Bus stop - Khairatabad - Abids - Big Bazar - Gujarathgally - Koti Womens College- KarmanGhatt - College"));
                BusList.add(new BusTemplate ("15","Sattar","9247167710","Sitapalmandi – 7:15AM - Namalagundu - Warasiguda - Warasiguda (ATM) - Jamia Osmania Railway Station - Adikmet (Clinic) - Ram Nagar Gundu (Babai Hotel) - Vidya Nagar (Turning point) - BN Reddy Water Tank-College"));
                BusList.add(new BusTemplate ("16","Baba","9948313363","Bagh Lingampally – (Park) – 7:25AM - Vidya Nagar Shankar Mutt - Koranti (Fever Hospital) - Tilak Nagar (Enjoy Cafe) - Sri Ramana Theatre - Ramanthapur - College"));
                BusList.add(new BusTemplate ("17","Madhukar Reddy","9963220970","RK Puram – 7:05AM - Neredmet X Road - Sainikpuri - AS Rao Nagar - Radhika Theatre - Ashok Nagar -College"));
                BusList.add(new BusTemplate ("18","Srinivas Reddy","9573445419","Dammaiguda - Saketh – 7:05AM - Kapra - North Kamala Nagar - ECIL X Road - Kamala Nagar - HB Bus Stop - HB Colony II Phase - HB Colony I Phase - Ram Talkies - White House - College"));
                BusList.add(new BusTemplate ("19","Anjaiah","9573997639","City College – 7:35AM - Darushifa Majid - Nalgonda X Road - Yashoda Hospital - Super Bazar - TMC DSNR - College"));
                BusList.add(new BusTemplate ("20","Ram Chander","9640867806","Amberpet Police Lines – 7:45AM - Ali Café- More-RTO Office - TMC - Rajadhani Theatre - Chaitanyapuri - College"));
                BusList.add(new BusTemplate ("21","Y.R. Reddy","9849286951","BD Reddy Garden – 8:10AM – B.N. Reddy - College"));
                BusList.add(new BusTemplate ("22","Badruddin","7702897655","Sarrornagar Bus Stand-Mandal Office (Saroor Nagar) -7:55AM - Huda Complex – Kotha Pet (Bakers Q) - Asta Laxmi Temple - College"));
                BusList.add(new BusTemplate ("23","Muneer","9177304439","Gandhi Nagar Khaman – 7:10AM - Kavadiguda (Kalpana Praga Tools) - Musheerabad - Padma Rao Nagar - Chilkalguda - Tarnaka (Bata) - College"));
                BusList.add(new BusTemplate ("24","Mallikarjun","8790068923","Old MLA Quarters – 7:20AM - Narayanguda - Kachiguda X Road - Vysya Hostel - Nimboliadda - Saidabad - IB Pump - Green Park Colony - Bairamlguda - College"));
                BusList.add(new BusTemplate ("25","Anjaiah","9908578470","Chengicherla X Road 7.30AM- Medipally – Canara Nagar - Pochamma Temple - Boduppal X Road - Firjadiguda Junction - Uppal Bus Stop - Uppal Ring Road - Raghavendra Tiffin Centre - Kamineni Hospital – College"));
                BusList.add(new BusTemplate ("26","Bikshapathi","9701166973","South End Park – 7:50AM - Mansoorabad - Sriramnagar - Sahara X Road - Chithraseema Colony (Little Flower School) - M.V. Reddy Function Hall - Sushma – Sampoorna Talkies - Rythu Bazar – Videye Nagar (Siva Sindu) - BN Reddy (More) - College"));
                BusList.add(new BusTemplate ("27","A. Sarvotham Reddy","9866917930","Badangpet Municipal Office – 7:45AM – Balapur- Datta Nagar Manda Mallamma – Gayathri Nagar-Ayyappa Temple- College"));
                BusList.add(new BusTemplate ("28","B. Shankaraiah","8466895637","Saroornagar Lake 7:45AM – Sivaganga – RED Cross – DSNR – Chaitanyapuri – Kothapet – R.R. Court – LB Nagar –College"));
                BusList.add(new BusTemplate ("29","K. Nagendar","9948296807","DSNR – 7:55AM - Rajadhani - Chaitanyapuri - RythuBazar – Astalakshmi Temple-College"));
                BusList.add(new BusTemplate ("30","M. Ramulu","8465921532","Gayatrinagar ‘X’ Road – 7:50AM – Jillalaguda – Meerpet – Narayana IIT Olympiad School – Prashanth Hill ‘X’ Road – Nandi Hills – BD Reddy Garden - College"));
                BusList.add(new BusTemplate ("31","Khareem","9000221538","7.10AM Mahendra Hills – East Mared Palli Sangeeth –Mettuguda- Shanti Nagar- Lalapet- Tarnaka- College"));
                BusList.add(new BusTemplate ("32","Suresh","9502795413","Safilguda – 7:15AM – East Anand Bagh – ZTS – Carban – H.B. I Phase –Mallapur – HMT- College"));
                BusList.add(new BusTemplate ("33","P Dasarath Reddy","9177770023","Chaitanyapuri– 8:00AM - Kothapet  - Asta Laxmi Temple – White House – Court – College"));
                BusList.add(new BusTemplate ("34","Murthy","9848135937","Kothapet RythuBazar – 7:45AM – Telephone Colony – Ramakrishna Puram – Alkapuri X Road – Rajiv nagar - College"));
                BusList.add(new BusTemplate ("35","K Ramurthy","9553449549","JNTU-Vivekananda Nagar- 6:50AM – Kukatpally – Ameerpet– Begumpet – Sangeet – College"));
                BusList.add(new BusTemplate ("36","Rama Krishna","9963006238","Yadagiri Theatre 7:55AM – Santosh Nagar – I S Sadan – Champapet – Karmanghat – College"));
                BusList.add(new BusTemplate ("37","Sundeep Reddy","9949221509","Omkar Nagar( Petrol Pump) 8.15AM  - Central Grammar School – College"));
                BusList.add(new BusTemplate ("38","Sanjeeva Reddy","9030039286","Panama - 7:55AM – Vanasthalipuram – BN Reddy – College"));
                BusList.add(new BusTemplate ("39","Raffath","8179763534","Ram Nagar - 7:22AM - Vidya Nagar- Amberpet- Ramanthapur- Uppal - College"));
                BusList.add(new BusTemplate ("40","Bhoopal","9959281383","Laxmi Nagar -7:20AM  - Jyothi Nagar - Karkhana Chowrasta – Attapur – Hyderguda - Rajendra Nagar- Aramgar X Road - Chandrayan Gutta – DRDL - Owaisi Hospital - Manda Mallamma Gardens - College"));
                BusList.add(new BusTemplate ("41","Srinivas","7799115773","Nagaram X Roads - 7.10AM – Chakripuram – Kushaiguda - ECIL- Housing Board – NFC - Mallapur – Nacharam - Habsiguda- Uppal- College"));
                BusList.add(new BusTemplate ("42","Narsing Rao","9848795664","SR College (CCMV Colony-Bodduppal) 7.30AM -Indira Nagar- Boduppal X Road- Ambedkar Statue- NTR Statue- Uppal- College"));
                BusList.add(new BusTemplate ("43","Anand","9912805101","Bhagya Latha Colony – 8.00AM - High Court Colony - Kamala Nagar - Rythu Bazar – BN Reddy- College"));
                BusList.add(new BusTemplate ("44","Shankaraiah","9963461240","DSNR- 8.00AM - Chaitanya Puri – Asta Laxmi Temple Khaman - LB Nagar - College"));
                BusList.add(new BusTemplate ("45","Asif","9866352975","Bharathi Hostel- 8.10AM - College"));
                BusList.add(new BusTemplate ("46","Rama Krishna","9700123734","Ravindra Bharathi School-Vaidehi Nagar(Shiva Sindu) - 8.15AM - B.N Reddy – BN Reddy Reservoir - Sagar Complex - Yamjal - Manneguda RTO Office - College"));
                BusList.add(new BusTemplate ("47","Satyanarayana","9666404430","St No.8(Habsiguda)- 7.40AM- Ramanthapur Church – Uppal - College"));
                BusList.add(new BusTemplate ("48","Laxmaiah","9959795611","Mallapur bridge(Noma Function Hall) -7:30AM - Chilakala Guda- Srinivasa Heights(Bersheeba Church)- Survey Of India- Uppal X Road- College"));
                BusList.add(new BusTemplate ("49","Dasarath","9000617684","Champapet – 7:45AM - Karmanghat- College"));
                BusList.add(new BusTemplate ("50","Yakub","9666251920","Bandla Guda 7:45AM - Indu Aranya - Nagole X Road - College "));
                BusList.add(new BusTemplate ("51","Sunder","9396615800","Chaitanyapuri - 7:40AM - Jain Temple- Mohan Nagar- Alkapuri Sai Baba temple- College"));
                BusList.add(new BusTemplate ("52","Vijendar Reddy","9885506368","Safil Guda – 7:20AM - Anand Bagh Chowrasta -Meerjath Guda- Lalapet- White House -Tarnaka- College"));
                BusList.add(new BusTemplate ("53","Venkatesh","8341204492","Gaddi Annaram Muncipal Office – 7:50AM - Chowdi - LB Nagar(Municipal Office) - HUDA Complex - Kothapet X Road - College"));
                BusList.add(new BusTemplate ("54","Srinivas","9912536884","T.V .Studio(Ramanthapur)- Majid – Uppal – Sagar Complex-College"));
                BusList.add(new BusTemplate ("55","Ramdas","9908019756","Jntu –7:05AM- Miyapur - Kothaguda X Road – Gachibowli - ORR – Nanakramguda – Appa - College "));
                BusList.add(new BusTemplate ("56","Vishnu","9652451198","Hastinapuram Signal-8.15AM- Bharathi Hostel- College"));
                BusList.add(new BusTemplate ("57","Balraju","8466803357","TKR Khaman- TKR College- Jillellaguda – Meerpet – Almasguda - Gurramguda - College"));
                BusList.add(new BusTemplate ("58","Srinivas","8340933176","Area Hospital (Vanasthalipuram) - NGO’s Bus Stop - BN Reddy - College"));
                return BusList;
        }

}
