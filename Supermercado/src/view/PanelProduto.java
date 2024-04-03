package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelProduto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;

	
	public PanelProduto() {
		//this.setVisible(false);
		this.setBackground(new Color(45, 59, 167));
		this.setSize(1024, 768);
		setLayout(null);
		add(getBtnVoltar());
	}
	public JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("Voltar");
			btnVoltar.setBounds(29, 10, 107, 32);
		}
		return btnVoltar;
	}
}
