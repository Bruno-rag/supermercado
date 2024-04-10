package view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PanelCadastroVenda extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel lblCliente;
	private JTextField textFieldNome;
	private JLabel lblNome;
	private JTextField textFieldTipo;
	private JLabel lblProduto;
	private JTextField textFieldPrecoVenda;
	private JLabel lblQuantidade;
	private JLabel lblPrecoVenda;
	private JButton btnSalvar;
	private JComboBox<?> comboBox;

	/**
	 * Create the panel.
	 */
	public PanelCadastroVenda() {
		
		this.setBackground(new Color(25, 25, 25));
		this.setSize(1024, 768);
		this.setLayout(null);
		add(getBtnVoltar());
		add(getLblCliente());
		add(getTextFieldNome());
		add(getLblNome());
		add(getTextFieldTipo());
		add(getLblProduto());
		add(getTextFieldPrecoVenda());
		add(getLblQuantidade());
		add(getLblPrecoVenda());
		add(getBtnSalvar());
		add(getComboBox());

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
	public JLabel getLblCliente() {
		if (lblCliente == null) {
			lblCliente = new JLabel("NOVO CLIENTE:");
			lblCliente.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblCliente.setForeground(new Color(255, 255, 255));
			lblCliente.setBounds(410, 41, 204, 23);
		}
		return lblCliente;
	}
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(270, 231, 483, 40);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome Cliente:");
			lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNome.setForeground(new Color(255, 255, 255));
			lblNome.setBounds(271, 198, 127, 23);
		}
		return lblNome;
	}
	public JTextField getTextFieldTipo() {
		if (textFieldTipo == null) {
			textFieldTipo = new JTextField();
			textFieldTipo.setColumns(10);
			textFieldTipo.setBounds(270, 314, 483, 40);
		}
		return textFieldTipo;
	}
	public JLabel getLblProduto() {
		if (lblProduto == null) {
			lblProduto = new JLabel("Produtos:");
			lblProduto.setForeground(Color.WHITE);
			lblProduto.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblProduto.setBounds(271, 281, 93, 23);
		}
		return lblProduto;
	}
	public JTextField getTextFieldPrecoVenda() {
		if (textFieldPrecoVenda == null) {
			textFieldPrecoVenda = new JTextField();
			textFieldPrecoVenda.setColumns(10);
			textFieldPrecoVenda.setBounds(271, 397, 214, 40);
		}
		return textFieldPrecoVenda;
	}
	public JLabel getLblQuantidade() {
		if (lblQuantidade == null) {
			lblQuantidade = new JLabel("Quantidade:");
			lblQuantidade.setForeground(Color.WHITE);
			lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblQuantidade.setBounds(271, 364, 155, 23);
		}
		return lblQuantidade;
	}
	public JLabel getLblPrecoVenda() {
		if (lblPrecoVenda == null) {
			lblPrecoVenda = new JLabel("Forma de Pagamento:");
			lblPrecoVenda.setForeground(Color.WHITE);
			lblPrecoVenda.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPrecoVenda.setBounds(540, 364, 187, 23);
		}
		return lblPrecoVenda;
	}
	public JButton getBtnSalvar() {
		if (btnSalvar == null) {
			btnSalvar = new JButton("SALVAR");
			btnSalvar.setBackground(new Color(87, 161, 115));
			btnSalvar.setBounds(400, 623, 224, 40);
		}
		return btnSalvar;
	}
	public JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(540, 397, 214, 40);
		}
		return comboBox;
	}
}
