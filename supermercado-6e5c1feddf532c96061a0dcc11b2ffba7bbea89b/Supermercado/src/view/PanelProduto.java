package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PanelProduto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JButton btnEstoque;
	private JButton btnAdicionarProduto;
	private JLabel labelProduto;

	
	public PanelProduto() {
		//this.setVisible(false);
		this.setBackground(new Color(25, 25, 25));
		//this.setBounds(342, 0, 682, 768);
		this.setSize(1024, 768);
		setLayout(null);
		add(getBtnVoltar());
		add(getBtnEstoque());
		add(getBtnAdicionarProduto());
		add(getLabelProduto());
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
	public JButton getBtnEstoque() {
		if (btnEstoque == null) {
			btnEstoque = new JButton("Estoque");
			btnEstoque.setBackground(new Color(255, 255, 255));
			btnEstoque.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnEstoque.setBounds(364, 441, 295, 91);
		}
		return btnEstoque;
	}
	public JButton getBtnAdicionarProduto() {
		if (btnAdicionarProduto == null) {
			btnAdicionarProduto = new JButton("Novo Produto");
			btnAdicionarProduto.setBackground(new Color(255, 255, 255));
			btnAdicionarProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnAdicionarProduto.setBounds(364, 265, 295, 91);
		}
		return btnAdicionarProduto;
	}
	public JLabel getLabelProduto() {
		if (labelProduto == null) {
			labelProduto = new JLabel("PRODUTO");
			labelProduto.setForeground(new Color(255, 255, 255));
			labelProduto.setFont(new Font("Tahoma", Font.BOLD, 24));
			labelProduto.setBounds(451, 24, 121, 91);
		}
		return labelProduto;
	}
}
