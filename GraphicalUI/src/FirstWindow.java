import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstWindow extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	String s;
	JCheckBox cb, cb2;
	JTextField textField;
	JLabel label;
	JRadioButton b1,b2,b3,b4;
	ButtonGroup group;
	JTextArea tb;


	public FirstWindow() {
		super("Your computer is very special");

		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		SnazzyMenuBar j = new SnazzyMenuBar(this);
		setJMenuBar(j);
		
		JPanel p = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel(new GridBagLayout());
		JPanel p4 = new JPanel();
		
		
		b1 = new JRadioButton("choice 1");
		b1.setActionCommand("you selected num 1");
		b1.addActionListener(this);
		
		b2 = new JRadioButton("choice 2");
		b2.setActionCommand("you selected num 2");
		b2.addActionListener(this);
		
		b3 = new JRadioButton("choice 3");
		b3.setActionCommand("you selected num 3");
		b3.addActionListener(this);
		
		b4 = new JRadioButton("choice 4");
		b4.setActionCommand("you selected num 4");
		b4.addActionListener(this);

		
		group = new ButtonGroup();
		group.add(b1);
		group.add(b2);
		group.add(b3);
		group.add(b4);
		
		
		p4.add(b1);
		p4.add(b2);
		p4.add(b3);
		p4.add(b4);
		
		JButton b = new JButton("Button 1");
		JButton c = new JButton("Button 2");

		p.add(b);
		p.add(c);

		cb = new JCheckBox("Do you LOVE bacon?");
		cb2 = new JCheckBox("Do you LOVE cheese?");

		p2.add(cb);
		p2.add(cb2);

		label = new JLabel("This is a label");
		tb = new JTextArea("this is a text area");
		textField = new JTextField("text field");
		
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String s2 = textField.getText();
				label.setText(s2);
			}
		});

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(15, 15, 15, 15);

		gbc.gridx = 0;
		gbc.gridy = 0;
		
		p3.add(label, gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		p3.add(tb, gbc);
		gbc.gridx = 0;
		gbc.gridy = 2;
		p3.add(textField, gbc);

		add(p, BorderLayout.SOUTH);
		add(p3, BorderLayout.CENTER);
		add(p4, BorderLayout.WEST);
		add(p2, BorderLayout.NORTH);
		

		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				s = "Good job kid, you harvested your corn! \n";
				
				if (cb.isSelected()) {
					s += "of course you love bacon \n";
				}
				if (cb2.isSelected()) {
					s += "of course you love cheese \n";
				}

				JOptionPane.showMessageDialog(null, s);
			}
		});
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tb.setText(e.getActionCommand());
	}
}
