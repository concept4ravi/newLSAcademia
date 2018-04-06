package utility;

public class Constant {
	public static String basePath;
	// CourseType indexes
	// M.Tech (Part Time) index : 0
	// M.Tech FT index          : 1
	// MBA index                : 2
	// PHD index 				: 3
	/*String current = new java.io.File( "." ).getCanonicalPath();
    System.out.println("Current dir:"+current);*/
	public static  String URL = "http://192.168.10.110:9580/lsa_lsui5_abes/LSAcademia";
	public static  String browserName = "firefox";
	public static  int randomStringLength = 6;
	public static  String Username = "010008";
	public static  String CourseType = "M.Tech FT";
	public static  String Password ="libsys";
	public static  String xmlFilePath ;
	public static  String firefoxDriverLocation ;//=  "/home/intern/git/Libsys_DTU/StudentNameUpdateScript/Browser Driver/geckodriver";
	public static  String chromeDriverLocation ;//= "/home/intern/git/Libsys_DTU/StudentNameUpdateScript/Browser Driver/chromedriver";
	public static final String Path_ScreenShot = "/home/intern/git/Libsys_DTU/StudentNameUpdateScript/Screenshots";
	public static void initializeVariables(String basePath) {
		firefoxDriverLocation = basePath+"/Browser Driver/geckodriver";
		chromeDriverLocation = basePath+"/Browser Driver/chromedriver";
		xmlFilePath = basePath+"/testng.xml";
	}
//	public static  String firefoxDriverLocation =  "/home/intern/git/Libsys_DTU/StudentNameUpdateScript/Browser Driver/geckodriver";
//	public static  String chromeDriverLocation = "/home/intern/git/Libsys_DTU/StudentNameUpdateScript/Browser Driver/chromedriver";
	
}
