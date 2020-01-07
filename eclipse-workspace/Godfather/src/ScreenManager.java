import java.awt.CardLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class ScreenManager {
	Frame frame  = new Frame();
	ContentPane contentPane = new ContentPane();
	
	public ScreenManager() {
	
		frame.setContentPane(contentPane);
		
		HomePage home = new HomePage(frame.width, frame.height, this, frame.absolute_path);
		AdminPanelPage admin = new AdminPanelPage(frame.width, frame.height, this, frame.absolute_path);
		contentPane.addPage(home, "home");
		contentPane.addPage(admin, "admin");
		
	}
	
	public void showPage(String pageName) {
		contentPane.showPage(pageName);
	}
}
