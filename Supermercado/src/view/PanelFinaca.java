package view;
import model.Produto;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PanelFinaca extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JButton btnCheque;
	private JLabel labelFinaca;

	
	public PanelFinaca() {
		//this.setVisible(false);
		this.setBackground(new Color(25, 25, 25));
		//this.setBounds(342, 0, 682, 768);
		this.setSize(1024, 768);
		setLayout(null);
		add(getBtnVoltar());
		add(getLabelFinaca());
		
		JLabel lblNewLabel = new JLabel("Balanço: ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(342, 109, 113, 14);
		add(lblNewLabel);
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
	public JLabel getLabelFinaca() {
		if (labelFinaca == null) {
			labelFinaca = new JLabel("RENDIMENTO");
			labelFinaca.setForeground(new Color(255, 255, 255));
			labelFinaca.setFont(new Font("Tahoma", Font.BOLD, 24));
			labelFinaca.setBounds(398, 24, 201, 91);
			//int rend = somaVenda - somaCompra;
			//labelFinaca = new JLabel(rend);
		}
		return labelFinaca;
	}
}
