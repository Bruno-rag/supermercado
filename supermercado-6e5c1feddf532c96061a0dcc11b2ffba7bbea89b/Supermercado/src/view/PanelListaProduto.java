
package view;

import javax.swing.JPanel;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

import javax.swing.JScrollPane;



import javax.swing.BorderFactory;

import java.util.ArrayList;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import model.Produto;

public class PanelListaProduto extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel lblTitulo;
	private JSeparator separator;
	private JPanel linha;
	private JTextPane txtpnNome;
	private JTextPane txtpnValidade;
	private JTextPane txtpnCompra;
	private JTextPane txtpnFabricacao;
	private JTextPane txtpnVenda;
	private JTextPane txtpnTipo;
	private JTextPane txtpnQtd;
	private JPanel panelContainer;
	
	private ArrayList<Produto> produtos;
	private JScrollPane scrollPane;
	private JLabel lblNome;
	private JLabel lblTipo;
	private JLabel lblvenda;
	private JLabel lblDataNasc;
	private JLabel lblVal;
	private JLabel lbl;
	private JLabel lblQtd;
	/**
	 * Create the panel.
	 */
	public PanelListaProduto() {
		setBackground(new Color(25, 25, 25));
		this.setSize(1024, 768);
		setLayout(null);
		
		add(getBtnVoltar());
		add(getLblTitulo());
		add(getSeparator());	
		add(getScrollPane());
		add(getLblNome());
		add(getLblTipo());
		add(getLblvenda());
		add(getLblDataNasc());
		add(getLblVal());
		add(getLbl());
		add(getLblQtd());
		
	}
	public JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("X");
			btnVoltar.setBackground(new Color(220, 20, 60));
			btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnVoltar.setBounds(949, 10, 47, 40);
		}
		return btnVoltar;
	}
	public JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("Lista de Produto");
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblTitulo.setForeground(new Color(255, 255, 255));
			lblTitulo.setBounds(407, 48, 210, 29);
		}
		return lblTitulo;
	}
	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(67, 87, 890, 13);
		}
		return separator;
	}
	
	
	public JPanel getPanelContainer(ArrayList<Produto> produtos) {
		this.produtos = produtos;
		if (panelContainer == null) {
			panelContainer = new JPanel();
			panelContainer.setBackground(new Color(50, 50, 50));
			panelContainer.setLayout(new GridLayout(40, 1));
			
			
			for (Produto produto : this.produtos) {
				Border borderLinhas = (Border) new LineBorder(new Color(100, 100, 100), 1);
				Border bordaColunas = (Border) new LineBorder(new Color(200, 200, 200), 1);	
				
				txtpnNome = new JTextPane();
				txtpnNome.setEditable(false);
				txtpnNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnNome.setText(produto.getNome());
				txtpnNome.setBounds(10, 10, 379, 50);
				txtpnNome.setBorder(bordaColunas);
				
				txtpnTipo = new JTextPane();
				txtpnTipo.setEditable(false);
				txtpnTipo.setText(produto.getTipo());
				txtpnTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnTipo.setBounds(413, 10, 379, 50);
				txtpnTipo.setBorder(bordaColunas);
				
				txtpnValidade = new JTextPane();
				txtpnValidade.setEditable(false);
				txtpnValidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnValidade.setText(produto.getVal());
				txtpnValidade.setBounds(10, 70, 379, 50);
				txtpnValidade.setBorder(bordaColunas);
				
				
				txtpnFabricacao = new JTextPane();
				txtpnFabricacao.setEditable(false);
				txtpnFabricacao.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnFabricacao.setText(produto.getFab());
				txtpnFabricacao.setBounds(413, 70, 379, 50);
				txtpnFabricacao.setBorder(bordaColunas);
				
				txtpnCompra = new JTextPane();
				txtpnCompra.setEditable(false);
				txtpnCompra.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnCompra.setText(produto.getPrecoCompra());
				txtpnCompra.setBounds(10, 130, 379, 50);
				txtpnCompra.setBorder(bordaColunas);
				
				txtpnVenda = new JTextPane();
				txtpnVenda.setEditable(false);
				txtpnVenda.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnVenda.setText(produto.getPrecoVenda());
				txtpnVenda.setBounds(413, 130, 379, 50);
				txtpnVenda.setBorder(bordaColunas);
				
				txtpnQtd = new JTextPane();
				txtpnQtd.setEditable(false);
				txtpnQtd.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnQtd.setText(produto.getQuantidade());
				txtpnQtd.setBounds(413, 130, 379, 50);
				txtpnQtd.setBorder(bordaColunas);
				
				
				
				linha = new JPanel();
				linha.setSize(890, 200);
				linha.setBorder(borderLinhas);
				linha.setBackground(new Color(105, 105, 105));
				linha.setLayout(new GridLayout(1, 0));
				linha.setPreferredSize(new Dimension(200, 100));
				
				linha.add(txtpnNome);
				linha.add(txtpnTipo);
				linha.add(txtpnVenda);
				linha.add(txtpnCompra);
				linha.add(txtpnValidade);
				linha.add(txtpnFabricacao);
				linha.add(txtpnQtd);
				panelContainer.add(linha);
			}
			
		}
		return panelContainer;
	}
	public JScrollPane getScrollPane() {
		if(scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 182, 986, 559);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setPreferredSize(new Dimension(986, 616));
			//scrollPane.setViewportView(getPanelContainer());
		}
		return scrollPane;
	}
	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome:");
			lblNome.setForeground(new Color(255, 255, 255));
			lblNome.setBackground(new Color(255, 255, 255));
			lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNome.setBounds(25, 135, 94, 29);
		}
		return lblNome;
	}
	public JLabel getLblTipo() {
		if (lblTipo == null) {
			lblTipo = new JLabel("Tipo:");
			lblTipo.setForeground(Color.WHITE);
			lblTipo.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblTipo.setBackground(Color.WHITE);
			lblTipo.setBounds(154, 135, 94, 29);
		}
		return lblTipo;
	}
	public JLabel getLblvenda() {
		if (lblvenda == null) {
			lblvenda = new JLabel("Pre\u00E7o de venda:");
			lblvenda.setForeground(Color.WHITE);
			lblvenda.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblvenda.setBackground(Color.WHITE);
			lblvenda.setBounds(293, 135, 131, 29);
		}
		return lblvenda;
	}
	public JLabel getLblDataNasc() {
		if (lblDataNasc == null) {
			lblDataNasc = new JLabel("Pre\u00E7o de Compra:");
			lblDataNasc.setForeground(Color.WHITE);
			lblDataNasc.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblDataNasc.setBackground(Color.WHITE);
			lblDataNasc.setBounds(434, 135, 148, 29);
		}
		return lblDataNasc;
	}
	public JLabel getLblVal() {
		if (lblVal == null) {
			lblVal = new JLabel("Vallidade:");
			lblVal.setForeground(Color.WHITE);
			lblVal.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblVal.setBackground(Color.WHITE);
			lblVal.setBounds(710, 135, 88, 29);
		}
		return lblVal;
	}
	public JLabel getLbl() {
		if (lbl == null) {
			lbl = new JLabel("Fab.:");
			lbl.setForeground(Color.WHITE);
			lbl.setFont(new Font("Tahoma", Font.BOLD, 16));
			lbl.setBackground(Color.WHITE);
			lbl.setBounds(592, 135, 40, 29);
		}
		return lbl;
	}
	public JLabel getLblQtd() {
		if (lblQtd == null) {
			lblQtd = new JLabel("Qtd.:");
			lblQtd.setForeground(Color.WHITE);
			lblQtd.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblQtd.setBackground(Color.WHITE);
			lblQtd.setBounds(859, 135, 40, 29);
		}
		return lblQtd;
	}
}
