
package view;

import javax.swing.JPanel;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

import javax.swing.JScrollPane;




import java.util.ArrayList;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import model.Venda;

public class PanelListaVenda extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel lblTitulo;
	private JSeparator separator;
	private JPanel linha;
	private JTextPane txtpnNome;
	private JTextPane txtpnValidade;
	private JTextPane txtpnFabricacao;
	private JTextPane txtpnTipo;
	private JPanel panelContainer;
	
	private ArrayList<Venda> vendas;
	private JScrollPane scrollPane;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblRg;
	private JLabel lblDataNasc;
	private JLabel lblVal;
	private JLabel lbl;
	private JLabel lblQtd;
	/**
	 * Create the panel.
	 */
	public PanelListaVenda() {
		setBackground(new Color(25, 25, 25));
		this.setSize(1024, 768);
		setLayout(null);
		
		add(getBtnVoltar());
		add(getLblTitulo());
		add(getSeparator());	
		add(getScrollPane());
		add(getLblNome());
		add(getLblCpf());
		add(getLblRg());
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
	
	
	public JPanel getPanelContainer(ArrayList<Venda> vendas) {
		this.vendas = vendas;
		if (panelContainer == null) {
			panelContainer = new JPanel();
			panelContainer.setBackground(new Color(50, 50, 50));
			panelContainer.setLayout(new GridLayout(40, 1));
			
			
			for (Venda venda : this.vendas) {
				Border borderLinhas = (Border) new LineBorder(new Color(100, 100, 100), 1);
				Border bordaColunas = (Border) new LineBorder(new Color(200, 200, 200), 1);	
				
				txtpnNome = new JTextPane();
				txtpnNome.setEditable(false);
				txtpnNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnNome.setText(venda.getNome());
				txtpnNome.setBounds(10, 10, 379, 50);
				txtpnNome.setBorder(bordaColunas);
				
				txtpnTipo = new JTextPane();
				txtpnTipo.setEditable(false);
				txtpnTipo.setText(venda.getProdutos());
				txtpnTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnTipo.setBounds(413, 10, 379, 50);
				txtpnTipo.setBorder(bordaColunas);
				
				txtpnValidade = new JTextPane();
				txtpnValidade.setEditable(false);
				txtpnValidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnValidade.setText(venda.getQuatidade());
				txtpnValidade.setBounds(10, 70, 379, 50);
				txtpnValidade.setBorder(bordaColunas);
				
				
				txtpnFabricacao = new JTextPane();
				txtpnFabricacao.setEditable(false);
				txtpnFabricacao.setFont(new Font("Tahoma", Font.PLAIN, 16));
				txtpnFabricacao.setText(venda.getFormaPagemanto());
				txtpnFabricacao.setBounds(413, 70, 379, 50);
				txtpnFabricacao.setBorder(bordaColunas);
				
						
				
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
	public JLabel getLblCpf() {
		if (lblCpf == null) {
			lblCpf = new JLabel("CPF:");
			lblCpf.setForeground(Color.WHITE);
			lblCpf.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblCpf.setBackground(Color.WHITE);
			lblCpf.setBounds(154, 135, 94, 29);
		}
		return lblCpf;
	}
	public JLabel getLblRg() {
		if (lblRg == null) {
			lblRg = new JLabel("RG:");
			lblRg.setForeground(Color.WHITE);
			lblRg.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblRg.setBackground(Color.WHITE);
			lblRg.setBounds(281, 135, 131, 29);
		}
		return lblRg;
	}
	public JLabel getLblDataNasc() {
		if (lblDataNasc == null) {
			lblDataNasc = new JLabel("Data de Nascimento:");
			lblDataNasc.setForeground(Color.WHITE);
			lblDataNasc.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblDataNasc.setBackground(Color.WHITE);
			lblDataNasc.setBounds(379, 135, 167, 29);
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
			lbl.setBounds(556, 135, 40, 29);
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
