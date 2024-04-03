package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelCliente extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;

	
	public PanelCliente() {
		this.setBackground(new Color(57, 148, 28));
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
