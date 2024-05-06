package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHome extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnProduto;
	private JLabel labelTitulo;
	private JLabel labelTela;
	private JPanel panel;
	private JButton btnVendas;
	private JButton btnClientes;
	private JButton btnFinacas;
	//private JButton btnEstoque;
	//public int num = 2;
	
	ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/shopping2.jpg"));
	//Image image =  imgIcon.getImage();
	public PanelHome() {
		this.setSize(1024, 768);
		this.setVisible(true);
		//this.setBackground(new Color(image));
		this.setLayout(null);
		getPanel().setLayout(null);
		
		add(getLabelTitulo());
		add(getBtnProduto());
		add(getBtnVendas());
		add(getBtnClientes());
		add(getBtnFinacas());
		//add(getBtnEstoque());
		add(getPanel());
		add(getLabelTela(), BorderLayout.CENTER);
	}
	public JButton getBtnProduto() {
		if (btnProduto == null) {
			btnProduto = new JButton("Produtos");
			/*btnProduto.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new PanelProduto().setVisible(true);
				}
			});*/
			btnProduto.setBounds(53, 117, 250, 35);
			btnProduto.setBackground(new Color(255, 255, 255));
			btnProduto.setFont(new Font("Tahoma", Font.PLAIN, 22));
		}
		return btnProduto;
	}
	public JLabel getLabelTitulo() {
		if (labelTitulo == null) {
			labelTitulo = new JLabel("Menu");
			labelTitulo.setBounds(53, 50, 56, 25);
			labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return labelTitulo;
	}
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel(new BorderLayout());
			panel.setBackground(new Color(255, 255, 255));
			panel.setBounds(0, 0, 342, 768);
			
			
		}
		return panel;
	}
	public JButton getBtnVendas() {
		if (btnVendas == null) {
			btnVendas = new JButton("Vendas");
			btnVendas.setBounds(53, 241, 250, 35);
			btnVendas.setFont(new Font("Tahoma", Font.PLAIN, 22));
			btnVendas.setBackground(new Color(255, 255, 255));
		}
		return btnVendas;
	}
	public JButton getBtnClientes() {
		if (btnClientes == null) {
			btnClientes = new JButton("Clientes");
			btnClientes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnClientes.setBounds(53, 365, 250, 35);
			btnClientes.setFont(new Font("Tahoma", Font.PLAIN, 22));
			btnClientes.setBackground(new Color(255, 255, 255));
		}
		return btnClientes;
	}
	public JButton getBtnFinacas() {
		if (btnFinacas == null) {
			btnFinacas = new JButton("Rendimento");
			btnFinacas.setBounds(53, 489, 250, 35);
			btnFinacas.setFont(new Font("Tahoma", Font.PLAIN, 22));
			btnFinacas.setBackground(new Color(255, 255, 255));
		}
		return btnFinacas;
	}
	/*public JButton getBtnEstoque() {
		if (btnEstoque == null) {
			btnEstoque = new JButton("....");
			btnEstoque.setBounds(53, 613, 250, 35);
			btnEstoque.setFont(new Font("Tahoma", Font.PLAIN, 22));
			btnEstoque.setBackground(new Color(255, 255, 255));
		}
		return btnEstoque;
	}*/
	public JLabel getLabelTela() {
		if(labelTela == null) {
			labelTela = new JLabel();
			labelTela.setIcon(imgIcon);
			labelTela.setBounds(-10, -20, 1024, 768);
			
		}
		return labelTela;
	}
	public void setLabelTela(JLabel labelTela) {
		this.labelTela = labelTela;
	}
	
}
