
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

import java.util.ArrayList;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import model.Cliente;


public class PanelListaCliente extends JPanel {

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
	
	private ArrayList<Cliente> clientes;
	private JScrollPane scrollPane;
	private JLabel lblNome;
	private JLabel lblTipo;
	private JLabel lblPrecoCompra;
	private JLabel lblPrecoDeVenda;
	private JLabel lblVal;
	private JLabel lblFab;
	private JLabel lblQtd;
	/**
	 * Create the panel.
	 */
	public PanelListaCliente() {
		setBackground(new Color(25, 25, 25));
		this.setSize(1024, 768);
		setLayout(null);
		
		add(getBtnVoltar());
		add(getLblTitulo());
		add(getSeparator());	
		add(getScrollPane());
		add(getLblNome());
		add(getLblTipo());
		add(getLblPrecoCompra());
		add(getLblPrecoDeVenda());
		add(getLblVal());
		add(getLblFab());
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
			lblTitulo = new JLabel("Lista de Clientes");
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
	
	
	public JPanel getPanelContainer(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
		if (panelContainer == null) {
			panelContainer = new JPanel();
			panelContainer.setBackground(new Color(50, 50, 50));
			panelContainer.setLayout(new GridLayout(40, 1));
			
			
			for (Cliente cliente : this.clientes) {
				Border borderLinhas = (Border) new LineBorder(new Color(100, 100, 100), 1);
				Border bordaColunas = (Border) new LineBorder(new Color(200, 200, 200), 1);	
				
				txtpnNome = new JTextPane();
				txtpnNome.setEditable(false);
				txtpnNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnNome.setText(cliente.getNome());
				txtpnNome.setBounds(10, 10, 379, 50);
				txtpnNome.setBorder(bordaColunas);
				
				txtpnTipo = new JTextPane();
				txtpnTipo.setEditable(false);
				txtpnTipo.setText(cliente.getCpf());
				txtpnTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnTipo.setBounds(413, 10, 379, 50);
				txtpnTipo.setBorder(bordaColunas);
				
				txtpnValidade = new JTextPane();
				txtpnValidade.setEditable(false);
				txtpnValidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnValidade.setText(cliente.getRg());
				txtpnValidade.setBounds(10, 70, 379, 50);
				txtpnValidade.setBorder(bordaColunas);
				
				
				txtpnFabricacao = new JTextPane();
				txtpnFabricacao.setEditable(false);
				txtpnFabricacao.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnFabricacao.setText(cliente.getDataNasc());
				txtpnFabricacao.setBounds(413, 70, 379, 50);
				txtpnFabricacao.setBorder(bordaColunas);
				
				txtpnCompra = new JTextPane();
				txtpnCompra.setEditable(false);
				txtpnCompra.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnCompra.setText(cliente.getLimiteCredit());
				txtpnCompra.setBounds(10, 130, 379, 50);
				txtpnCompra.setBorder(bordaColunas);
				
					
			
				linha = new JPanel();
				linha.setSize(890, 200);
				linha.setBorder(borderLinhas);
				linha.setBackground(new Color(105, 105, 105));
				linha.setLayout(new GridLayout(1, 0));
				linha.setPreferredSize(new Dimension(200, 100));
				
				linha.add(txtpnNome);
				linha.add(txtpnTipo);
				linha.add(txtpnValidade);
				linha.add(txtpnFabricacao);
				linha.add(txtpnCompra);
				
			
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
	public JLabel getLblPrecoCompra() {
		if (lblPrecoCompra == null) {
			lblPrecoCompra = new JLabel("Val. de compra:");
			lblPrecoCompra.setForeground(Color.WHITE);
			lblPrecoCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPrecoCompra.setBackground(Color.WHITE);
			lblPrecoCompra.setBounds(281, 135, 131, 29);
		}
		return lblPrecoCompra;
	}
	public JLabel getLblPrecoDeVenda() {
		if (lblPrecoDeVenda == null) {
			lblPrecoDeVenda = new JLabel("Val. de venda:");
			lblPrecoDeVenda.setForeground(Color.WHITE);
			lblPrecoDeVenda.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblPrecoDeVenda.setBackground(Color.WHITE);
			lblPrecoDeVenda.setBounds(423, 135, 123, 29);
		}
		return lblPrecoDeVenda;
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
	public JLabel getLblFab() {
		if (lblFab == null) {
			lblFab = new JLabel("Fab.:");
			lblFab.setForeground(Color.WHITE);
			lblFab.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblFab.setBackground(Color.WHITE);
			lblFab.setBounds(556, 135, 40, 29);
		}
		return lblFab;
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
