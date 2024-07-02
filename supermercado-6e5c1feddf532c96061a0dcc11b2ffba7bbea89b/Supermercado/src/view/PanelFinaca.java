package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JSeparator;

public class PanelFinaca extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel labelFinaca;
	private JLabel lblrEDIMENTOS;
	private JLabel lblLucroBruto;
	private JLabel lblLucroLquido;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_1_1;
	private JLabel lblValorEstoque;
	private JLabel lblValorLucroBruto;
	private JLabel lblValorLucroLiquido;

	
	public PanelFinaca() {
		//this.setVisible(false);
		this.setBackground(new Color(25, 25, 25));
		//this.setBounds(342, 0, 682, 768);
		this.setSize(1024, 768);
		setLayout(null);
		add(getBtnVoltar());
		add(getLabelFinaca());
		add(getLblrEDIMENTOS());
		add(getLblLucroBruto());
		add(getLblLucroLquido());
		add(getSeparator());
		add(getSeparator_1());
		add(getSeparator_1_1());
		add(getLblValorEstoque());
		add(getLblValorLucroBruto());
		add(getLblValorLucroLiquido());
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
			labelFinaca = new JLabel("FINAN\u00C7AS");
			labelFinaca.setForeground(new Color(255, 255, 255));
			labelFinaca.setFont(new Font("Tahoma", Font.BOLD, 24));
			labelFinaca.setBounds(448, 10, 127, 91);
		}
		return labelFinaca;
	}
	public JLabel getLblrEDIMENTOS() {
		if (lblrEDIMENTOS == null) {
			lblrEDIMENTOS = new JLabel("CUSTO TOTAL DE ESTOQUE:");
			lblrEDIMENTOS.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblrEDIMENTOS.setForeground(new Color(255, 255, 255));
			lblrEDIMENTOS.setBounds(100, 192, 224, 13);
		}
		return lblrEDIMENTOS;
	}
	public JLabel getLblLucroBruto() {
		if (lblLucroBruto == null) {
			lblLucroBruto = new JLabel("LUCRO BRUTO:");
			lblLucroBruto.setForeground(Color.WHITE);
			lblLucroBruto.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblLucroBruto.setBounds(100, 254, 224, 13);
		}
		return lblLucroBruto;
	}
	public JLabel getLblLucroLquido() {
		if (lblLucroLquido == null) {
			lblLucroLquido = new JLabel("LUCRO L\u00CDQUIDO:");
			lblLucroLquido.setForeground(Color.WHITE);
			lblLucroLquido.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblLucroLquido.setBounds(100, 315, 224, 13);
		}
		return lblLucroLquido;
	}
	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(59, 215, 905, 28);
		}
		return separator;
	}
	public JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(59, 277, 905, 28);
		}
		return separator_1;
	}
	public JSeparator getSeparator_1_1() {
		if (separator_1_1 == null) {
			separator_1_1 = new JSeparator();
			separator_1_1.setBounds(59, 338, 905, 28);
		}
		return separator_1_1;
	}
	public JLabel getLblValorEstoque() {
		if (lblValorEstoque == null) {
			lblValorEstoque = new JLabel("...");
			lblValorEstoque.setForeground(Color.WHITE);
			lblValorEstoque.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblValorEstoque.setBounds(705, 194, 259, 13);
		}
		return lblValorEstoque;
	}
	public JLabel getLblValorLucroBruto() {
		if (lblValorLucroBruto == null) {
			lblValorLucroBruto = new JLabel("VALOR");
			lblValorLucroBruto.setForeground(Color.WHITE);
			lblValorLucroBruto.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblValorLucroBruto.setBounds(705, 256, 259, 13);
		}
		return lblValorLucroBruto;
	}
	public JLabel getLblValorLucroLiquido() {
		if (lblValorLucroLiquido == null) {
			lblValorLucroLiquido = new JLabel("VALOR");
			lblValorLucroLiquido.setForeground(Color.WHITE);
			lblValorLucroLiquido.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblValorLucroLiquido.setBounds(705, 315, 259, 13);
		}
		return lblValorLucroLiquido;
	}
}
