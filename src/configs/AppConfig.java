package configs;

public class AppConfig {
	private static final String PATH_APP = "C:\\Users\\ADMIN\\eclipse-workspace\\DOANCOSO_QLCF(1)";
	public static String getImageURL(String name) {
		return PATH_APP+"\\src\\Images\\"+name;
	}
}
