package l5;

import java.awt.Container;
import java.io.File;
import java.net.MalformedURLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Something extends JFrame {
Something () throws MalformedURLException {
	JPanel panel = new JPanel ();
	File file= new File ("image/1741463_1414577815510922_1790730905_n.jpg");
	ImageIcon image = new ImageIcon (file.toURI().toURL());
	
	JLabel label = new JLabel (image);
	JLabel path = new JLabel (file.getAbsolutePath());
	setSize (500,500);
	panel.add(label);
	add(panel);
	
	
	setVisible (true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	


	
	
	
}
	
}
