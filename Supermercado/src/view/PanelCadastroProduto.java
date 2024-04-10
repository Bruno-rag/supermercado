package view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelCadastroProduto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel lblNovoProduto;
	private JTextField textFieldNome;
	private JLabel lblNome;
	private JTextField textFieldTipo;
	private JLabel lblTipo;
	private JTextField textFieldPrecoVenda;
	private JLabel lblPrecoCompra;
	private JLabel lblPrecoVenda;
	private JTextField textFieldPrecoCompra;
	private JLabel lblFabricao;
	private JTextField textFieldFabricacao;
	private JTextField textFieldValidade;
	private JLabel lblValidade;
	private JTextField textFieldQuatidadeEstoque;
	private JLabel lblQuantidadeEEstoque;
	private JButton btnSalvar;

	/**
	 * Create the panel.
	 */
	public PanelCadastroProduto() {
		
		this.setBackground(new Color(25, 25, 25));
		this.setSize(1024, 768);
		this.setLayout(null);
		add(getBtnVoltar());
		add(getLblNovoProduto());
		add(getTextFieldNome());
		add(getLblNome());
		add(getTextFieldTipo());
		add(getLblTipo());
		add(getTextFieldPrecoVenda());
		add(getLblPrecoCompra());
		add(getLblPrecoVenda());
		add(getTextFieldPrecoCompra());
		add(getLblFabricao());
		add(getTextFieldFabricacao());
		add(getTextFieldValidade());
		add(getLblValidade());
		add(getTextFieldQuatidadeEstoque());
		add(getLblQuantidadeEEstoque());
		add(getBtnSalvar());

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
	public JLabel getLblNovoProduto() {
		if (lblNovoProduto == null) {
			lblNovoProduto = new JLabel("NOVO PRODUTO");
			lblNovoProduto.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblNovoProduto.setForeground(new Color(255, 255, 255));
			lblNovoProduto.setBounds(410, 41, 204, 23);
		}
		return lblNovoProduto;
	}
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(270, 171, 483, 40);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome:");
			lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNome.setForeground(new Color(255, 255, 255));
			lblNome.setBounds(270, 138, 93, 23);
		}
		return lblNome;
	}
	public JTextField getTextFieldTipo() {
		if (textFieldTipo == null) {
			textFieldTipo = new JTextField();
			textFieldTipo.setColumns(10);
			textFieldTipo.setBounds(270, 254, 483, 40);
		}
		return textFieldTipo;
	}
	public JLabel getLblTipo() {
		if (lblTipo == null) {
			lblTipo = new JLabel("Tipo:");
			lblTipo.setForeground(Color.WHITE);
			lblTipo.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblTipo.setBounds(270, 221, 93, 23);
		}
		return lblTipo;
	}
	public JTextField getTextFieldPrecoVenda() {
		if (textFieldPrecoVenda == null) {
			textFieldPrecoVenda = new JTextField();
			textFieldPrecoVenda.setColumns(10);
			textFieldPrecoVenda.setBounds(270, 337, 214, 40);
		}
		return textFieldPrecoVenda;
	}
	public JLabel getLblPrecoCompra() {
		if (lblPrecoCompra == null) {
			lblPrecoCompra = new JLabel("Pre\u00E7o de Compra:");
			lblPrecoCompra.setForeground(Color.WHITE);
			lblPrecoCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPrecoCompra.setBounds(270, 304, 155, 23);
		}
		return lblPrecoCompra;
	}
	public JLabel getLblPrecoVenda() {
		if (lblPrecoVenda == null) {
			lblPrecoVenda = new JLabel("Pre\u00E7o de Compra:");
			lblPrecoVenda.setForeground(Color.WHITE);
			lblPrecoVenda.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPrecoVenda.setBounds(539, 304, 155, 23);
		}
		return lblPrecoVenda;
	}
	public JTextField getTextFieldPrecoCompra() {
		if (textFieldPrecoCompra == null) {
			textFieldPrecoCompra = new JTextField();
			textFieldPrecoCompra.setColumns(10);
			textFieldPrecoCompra.setBounds(539, 337, 214, 40);
		}
		return textFieldPrecoCompra;
	}
	public JLabel getLblFabricao() {
		if (lblFabricao == null) {
			lblFabricao = new JLabel("Fabrica\u00E7\u00E3o:");
			lblFabricao.setForeground(Color.WHITE);
			lblFabricao.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblFabricao.setBounds(270, 387, 155, 23);
		}
		return lblFabricao;
	}
	public JTextField getTextFieldFabricacao() {
		if (textFieldFabricacao == null) {
			textFieldFabricacao = new JTextField();
			textFieldFabricacao.setColumns(10);
			textFieldFabricacao.setBounds(270, 420, 214, 40);
		}
		return textFieldFabricacao;
	}
	public JTextField getTextFieldValidade() {
		if (textFieldValidade == null) {
			textFieldValidade = new JTextField();
			textFieldValidade.setColumns(10);
			textFieldValidade.setBounds(539, 420, 214, 40);
		}
		return textFieldValidade;
	}
	public JLabel getLblValidade() {
		if (lblValidade == null) {
			lblValidade = new JLabel("Validade:");
			lblValidade.setForeground(Color.WHITE);
			lblValidade.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblValidade.setBounds(539, 387, 155, 23);
		}
		return lblValidade;
	}
	public JTextField getTextFieldQuatidadeEstoque() {
		if (textFieldQuatidadeEstoque == null) {
			textFieldQuatidadeEstoque = new JTextField();
			textFieldQuatidadeEstoque.setColumns(10);
			textFieldQuatidadeEstoque.setBounds(270, 503, 214, 40);
		}
		return textFieldQuatidadeEstoque;
	}
	public JLabel getLblQuantidadeEEstoque() {
		if (lblQuantidadeEEstoque == null) {
			lblQuantidadeEEstoque = new JLabel("Quantidade em Estoque:");
			lblQuantidadeEEstoque.setForeground(Color.WHITE);
			lblQuantidadeEEstoque.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblQuantidadeEEstoque.setBounds(270, 470, 204, 23);
		}
		return lblQuantidadeEEstoque;
	}
	public JButton getBtnSalvar() {
		if (btnSalvar == null) {
			btnSalvar = new JButton("SALVAR");
			btnSalvar.setBackground(new Color(87, 161, 115));
			btnSalvar.setBounds(410, 623, 224, 40);
		}
		return btnSalvar;
	}
}
