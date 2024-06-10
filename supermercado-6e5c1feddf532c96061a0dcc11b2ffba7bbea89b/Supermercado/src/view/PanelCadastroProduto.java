package view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;


public class PanelCadastroProduto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel lblNovoProduto;
	private JTextField textFieldNome;
	private JLabel lblNome;
	private JTextField textFieldTipo;
	private JLabel lblTipo;
	private JLabel lblPrecoCompra;
	private JLabel lblPrecoVenda;
	private JLabel lblFabricao;
	private JLabel lblValidade;
	private JLabel lblQuantidadeEEstoque;
	private JButton btnSalvar;
	private JFormattedTextField formattedTextFieldPrecoVenda;
	public MaskFormatter mascaraNum = null;
	public MaskFormatter mascaraData = null;
	private JFormattedTextField formattedTextFieldPrecoCompra;
	private JFormattedTextField formattedTextFieldPrecoQuantidade;
	private JFormattedTextField formattedTextFieldFabricacao;
	private JFormattedTextField formattedTextFieldValidade;

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
		add(getLblPrecoCompra());
		add(getLblPrecoVenda());
		add(getLblFabricao());
		add(getLblValidade());
		add(getLblQuantidadeEEstoque());
		add(getBtnSalvar());
		add(getFormattedTextFieldPrecoVenda());
		add(getFormattedTextFieldPrecoCompra());
		add(getFormattedTextFieldPrecoQuantidade());
		add(getFormattedTextFieldFabricacao());
		add(getFormattedTextFieldValidade());

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
	public JLabel getLblPrecoCompra() {
		if (lblPrecoCompra == null) {
			lblPrecoCompra = new JLabel("Pre\u00E7o de Compra:");
			lblPrecoCompra.setForeground(Color.WHITE);
			lblPrecoCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPrecoCompra.setBounds(539, 304, 155, 23);
		}
		return lblPrecoCompra;
	}
	public JLabel getLblPrecoVenda() {
		if (lblPrecoVenda == null) {
			lblPrecoVenda = new JLabel("Pre\u00E7o de Venda:");
			lblPrecoVenda.setForeground(Color.WHITE);
			lblPrecoVenda.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPrecoVenda.setBounds(270, 304, 155, 23);
		}
		return lblPrecoVenda;
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
	public JLabel getLblValidade() {
		if (lblValidade == null) {
			lblValidade = new JLabel("Validade:");
			lblValidade.setForeground(Color.WHITE);
			lblValidade.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblValidade.setBounds(539, 387, 155, 23);
		}
		return lblValidade;
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
	public JFormattedTextField getFormattedTextFieldPrecoVenda() {
		if (formattedTextFieldPrecoVenda == null) {
			
			formattedTextFieldPrecoVenda = new JFormattedTextField();
			formattedTextFieldPrecoVenda.setFocusLostBehavior(JFormattedTextField.COMMIT);
			formattedTextFieldPrecoVenda.setBounds(270, 337, 214, 40);
		}
		return formattedTextFieldPrecoVenda;
	}
	public JFormattedTextField getFormattedTextFieldPrecoCompra() {
		if (formattedTextFieldPrecoCompra == null) {
			try {
				//mascaraNum = new MaskFormatter("#####");
			} catch (Exception e) {
				// TODO: handle exception
			}
			formattedTextFieldPrecoCompra = new JFormattedTextField();
			formattedTextFieldPrecoCompra.setFocusLostBehavior(JFormattedTextField.COMMIT);
			formattedTextFieldPrecoCompra.setBounds(539, 337, 214, 40);
		}
		return formattedTextFieldPrecoCompra;
	}
	public JFormattedTextField getFormattedTextFieldPrecoQuantidade() {
		if (formattedTextFieldPrecoQuantidade == null) {
			try {
				//mascaraNum = new MaskFormatter("##/##/####");
				formattedTextFieldPrecoQuantidade = new JFormattedTextField();
				formattedTextFieldPrecoCompra.setFocusLostBehavior(JFormattedTextField.COMMIT);
				formattedTextFieldPrecoQuantidade.setBounds(270, 503, 214, 40);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return formattedTextFieldPrecoQuantidade;
	}
	public JFormattedTextField getFormattedTextFieldFabricacao() {
		if (formattedTextFieldFabricacao == null) {
			
			try {
				mascaraData = new MaskFormatter("##/##/####");
				formattedTextFieldFabricacao = new JFormattedTextField(mascaraData);
				formattedTextFieldFabricacao.setBounds(270, 420, 214, 40);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return formattedTextFieldFabricacao;
	}
	public JFormattedTextField getFormattedTextFieldValidade() {
		if (formattedTextFieldValidade == null) {
			try {
				mascaraData = new MaskFormatter("##/##/####");
				formattedTextFieldValidade = new JFormattedTextField(mascaraData);
				formattedTextFieldValidade.setBounds(539, 420, 214, 40);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return formattedTextFieldValidade;
	}
}
