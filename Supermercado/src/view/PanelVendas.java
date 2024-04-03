package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelVendas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;

	
	public PanelVendas() {
		this.setBackground(new Color(129, 54, 54));
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
