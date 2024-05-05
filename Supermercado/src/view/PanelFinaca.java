package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PanelFinaca extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JButton btnCheque;
	private JButton btnRedimento;
	private JLabel labelFinaca;

	
	public PanelFinaca() {
		//this.setVisible(false);
		this.setBackground(new Color(25, 25, 25));
		//this.setBounds(342, 0, 682, 768);
		this.setSize(1024, 768);
		setLayout(null);
		add(getBtnVoltar());
		add(getBtnRedimento());
		add(getLabelFinaca());
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
	public JButton getBtnRedimento() {
		if (btnRedimento == null) {
			btnRedimento = new JButton("Rendimento");
			btnRedimento.setBackground(new Color(255, 255, 255));
			btnRedimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnRedimento.setBounds(364, 265, 295, 91);
		}
		return btnRedimento;
	}
	public JLabel getLabelFinaca() {
		if (labelFinaca == null) {
			labelFinaca = new JLabel("FINANÇA");
			labelFinaca.setForeground(new Color(255, 255, 255));
			labelFinaca.setFont(new Font("Tahoma", Font.BOLD, 24));
			labelFinaca.setBounds(451, 24, 121, 91);
		}
		return labelFinaca;
	}
}
