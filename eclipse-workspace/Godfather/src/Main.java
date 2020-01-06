import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	static ScreenManager screenManager;

	public static void main(String[] args) {
		Path currentRelativePath = Paths.get("");
		String path = currentRelativePath.toAbsolutePath().toString();
		path = path.replaceAll("\\\\", "/");
		
		screenManager = new ScreenManager(path);
		
		screenManager.getPage("main page");

	}

}
