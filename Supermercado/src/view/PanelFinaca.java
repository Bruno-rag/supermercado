package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFinaca extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;

	/**
	 * Create the panel.
	 */
	public PanelFinaca() {
		this.setBackground(new Color(150, 120, 10));
		this.setSize(1024, 768);
		setLayout(null);
		add(getBtnVoltar());
	}

	public JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("X");
			btnVoltar.setBackground(new Color(220, 20, 60));
			btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnVoltar.setBounds(952, 24, 47, 40);
		}
		return btnVoltar;
	}
}
