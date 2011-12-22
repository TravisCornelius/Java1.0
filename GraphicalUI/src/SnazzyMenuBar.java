
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;


public class SnazzyMenuBar extends JMenuBar implements ActionListener {

	
	
	public SnazzyMenuBar(final FirstWindow firstWindow) {
		// TODO Auto-generated constructor stub
	
	
		
	JMenu first = new JMenu("Menu 1");
	first.setMnemonic(KeyEvent.VK_M);
	
	JMenu second = new JMenu("Menu 2");
	second.setMnemonic(KeyEvent.VK_E);
	
	JMenuItem bacon = new JMenuItem("BACON!!!", KeyEvent.VK_B);
	bacon.setActionCommand("baconcnocnvaosdkfjsadf;klaj");
	bacon.addActionListener(this);
	
	JMenuItem cheese = new JMenuItem("CHEESE!!!", KeyEvent.VK_C);
	cheese.setActionCommand("queso");
	cheese.addActionListener(this);
	
	JRadioButtonMenuItem rb1 = new JRadioButtonMenuItem("choice 1");
	JRadioButtonMenuItem rb2 = new JRadioButtonMenuItem("choice 2");
	ButtonGroup group = new ButtonGroup();
	group.add(rb1);
	group.add(rb2);
	
	
	
	JMenu sub = new JMenu("A submenu");
	JMenuItem test = new JMenuItem("Test!");
	sub.add(test);
	
	
	
	first.add(bacon);
	first.add(cheese);
	first.addSeparator();
	first.add(rb1);
	first.add(rb2);
	first.add(sub);

	
	

	
	add(first);
	add(second);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.print("Menu Item " + e.getActionCommand() + " Selected");
	}
}
