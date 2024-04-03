package view;

import java.awt.Color;

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
			btnVoltar = new JButton("Voltar");
			btnVoltar.setBounds(10, 10, 85, 21);
		}
		return btnVoltar;
	}
}
