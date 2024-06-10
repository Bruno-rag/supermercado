
package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	
	public Frame() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(30, 50, 1024, 768);
		this.setResizable(false);
		this.validate();
	}

}
