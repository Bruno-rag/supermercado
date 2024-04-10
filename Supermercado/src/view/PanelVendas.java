package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PanelVendas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel lblVendas;
	private JButton btnCadastroVenda;
	private JButton btnRegistroVendas;

	
	public PanelVendas() {
		this.setBackground(new Color(25, 25, 25));
		this.setSize(1024, 768);
		setLayout(null);
		
		add(getBtnVoltar());
		add(getLblVendas());
		add(getBtnCadastroVenda());
		add(getBtnRegistroVendas());
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
	public JLabel getLblVendas() {
		if (lblVendas == null) {
			lblVendas = new JLabel("VENDAS");
			lblVendas.setForeground(new Color(255, 255, 255));
			lblVendas.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblVendas.setBounds(451, 108, 121, 91);
		}
		return lblVendas;
	}
	public JButton getBtnCadastroVenda() {
		if (btnCadastroVenda == null) {
			btnCadastroVenda = new JButton("Cadastro de Venda");
			btnCadastroVenda.setBackground(new Color(255, 255, 255));
			btnCadastroVenda.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnCadastroVenda.setBounds(364, 252, 295, 91);
		}
		return btnCadastroVenda;
	}
	public JButton getBtnRegistroVendas() {
		if (btnRegistroVendas == null) {
			btnRegistroVendas = new JButton("Registro de Vendas");
			btnRegistroVendas.setBackground(new Color(255, 255, 255));
			btnRegistroVendas.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnRegistroVendas.setBounds(364, 441, 295, 91);
		}
		return btnRegistroVendas;
	}
}
