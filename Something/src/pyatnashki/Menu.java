package pyatnashki;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
	  private void createMenu() {
	        JMenuBar menu = new JMenuBar();
	        JMenu fileMenu = new JMenu("File");

	        for (String fileItem : new String [] { "New", "Exit" }) {
	            JMenuItem item = new JMenuItem(fileItem);
	            item.setActionCommand(fileItem.toLowerCase());
	            item.addActionListener(new NewMenuListener());
	            fileMenu.add(item);
	        }
	        fileMenu.insertSeparator(1);

	        menu.add(fileMenu);
	        setJMenuBar(menu);
	    }
}
