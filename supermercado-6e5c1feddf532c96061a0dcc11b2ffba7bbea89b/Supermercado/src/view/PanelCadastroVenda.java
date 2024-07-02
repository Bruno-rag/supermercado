package view;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

public class PanelCadastroVenda extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel lblCliente;
	private JLabel lblNome;
	private JLabel lblProduto;
	private JLabel lblQuantidade;
	private JLabel lblPrecoVenda;
	private JButton btnSalvar;
	private JComboBox<String> comboBoxProdutos;
	private JComboBox<String> comboBoxFormaPagamento;
	private JFormattedTextField formattedTextFieldquantidade;
	public MaskFormatter mascaraNum = null;
	private JComboBox comboBoxNomeCliente;
	private JLabel lblValorCompra;
	private JFormattedTextField formattedTextFieldValor;
	/**
	 * Create the panel.
	 */
	public PanelCadastroVenda() {
		this.setBackground(new Color(25, 25, 25));
		this.setSize(1024, 768);
		this.setLayout(null);
		add(getBtnVoltar());
		add(getLblCliente());
		add(getLblNome());
		add(getLblProduto());
		add(getLblQuantidade());
		add(getLblPrecoVenda());
		add(getBtnSalvar());
		add(getComboBoxProdutos());
		add(getComboBoxFormaPagamento());
		add(getFormattedTextFieldquantidade());
		add(getComboBoxNomeCliente());
		add(getLblValorCompra());
		add(getFormattedTextFieldValor());
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
			lblCliente = new JLabel("Cadastro de venda:");
			lblCliente.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblCliente.setForeground(new Color(255, 255, 255));
			lblCliente.setBounds(394, 41, 235, 23);
		}
		return lblCliente;
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
	public JLabel getLblProduto() {
		if (lblProduto == null) {
			lblProduto = new JLabel("Produto:");
			lblProduto.setForeground(Color.WHITE);
			lblProduto.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblProduto.setBounds(271, 281, 93, 23);
		}
		return lblProduto;
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
	public JLabel getLblPrecoVenda(){
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
	public JComboBox getComboBoxProdutos() {
		if (comboBoxProdutos == null) {
			comboBoxProdutos = new JComboBox();
			comboBoxProdutos.setBounds(270, 314, 483, 40);
		}
		return comboBoxProdutos;
	}
	public JComboBox getComboBoxFormaPagamento() {
		if (comboBoxFormaPagamento == null) {
			comboBoxFormaPagamento = new JComboBox();
			comboBoxFormaPagamento.setBounds(540, 397, 213, 40);
			comboBoxFormaPagamento.removeAllItems();
			//this.panelCadastroVenda.getComboBoxProdutos().setEnabled(false);
			comboBoxFormaPagamento.addItem("Selecione");
	        comboBoxFormaPagamento.addItem("Débito");
	        comboBoxFormaPagamento.addItem("Crédito");
		}
		return comboBoxFormaPagamento;
	}
	public JFormattedTextField getFormattedTextFieldquantidade() {
		if (formattedTextFieldquantidade == null) {
			try {
				mascaraNum = new MaskFormatter("#####");
			} catch (Exception e) {
				// TODO: handle exception
			}
			formattedTextFieldquantidade = new JFormattedTextField();
			formattedTextFieldquantidade.setFocusLostBehavior(JFormattedTextField.COMMIT);
			formattedTextFieldquantidade.setBounds(270, 398, 215, 40);
		}
		return formattedTextFieldquantidade;
	}
	public JComboBox getComboBoxNomeCliente() {
		if (comboBoxNomeCliente == null) {
			comboBoxNomeCliente = new JComboBox();
			comboBoxNomeCliente.setBounds(270, 231, 483, 40);
		}
		return comboBoxNomeCliente;
	}
	public JLabel getLblValorCompra() {
		if (lblValorCompra == null) {
			lblValorCompra = new JLabel("Valor Venda");
			lblValorCompra.setForeground(Color.WHITE);
			lblValorCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblValorCompra.setBounds(460, 473, 103, 23);
		}
		return lblValorCompra;
	}
	public JFormattedTextField getFormattedTextFieldValor() {
		if (formattedTextFieldValor == null) {
			formattedTextFieldValor = new JFormattedTextField();
			formattedTextFieldValor.setFocusLostBehavior(JFormattedTextField.COMMIT);
			formattedTextFieldValor.setBounds(404, 514, 215, 40);
			formattedTextFieldValor.setEnabled(false);
			formattedTextFieldValor.setDisabledTextColor(Color.decode("#333333"));
		}
		return formattedTextFieldValor;
	}
}
