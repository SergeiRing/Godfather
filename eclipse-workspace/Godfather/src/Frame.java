import java.awt.Dimension;
import java.awt.Toolkit;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

public class Frame extends JFrame{
	
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static int width = Double.valueOf(screenSize.getWidth()).intValue();
	static int height = Double.valueOf(screenSize.getHeight()).intValue();
	
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setUndecorated(true);
		setResizable(true);
		setBounds(0, 0, width, height);
		setVisible(true);
	}

}
