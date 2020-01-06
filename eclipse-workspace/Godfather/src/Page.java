import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public abstract class Page extends JPanel{
	
	int width, height;

	public Page(int width, int height) {
		this.width = width;
		this.height = height;
		this.setBackground(new Color(255,204,96));
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(new BorderLayout(0, 0));
	}
	
	public void setup() {};
	
}
