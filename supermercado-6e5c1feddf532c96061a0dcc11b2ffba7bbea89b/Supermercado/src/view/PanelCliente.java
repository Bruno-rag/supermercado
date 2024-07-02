package view;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class PanelCliente extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JButton btnCadCliente;
	private JButton btnRmvCliente;
	private JLabel lblTitulo;

	
	public PanelCliente() {
		this.setBackground(new Color(25, 25, 25));
		this.setSize(1024, 768);
		setLayout(null);
		add(getBtnVoltar());
		add(getBtnCadCliente());
		add(getBtnRmvCliente());
		add(getLblTitulo());
	}
	
	public JButton getBtnCadCliente() {
		if (btnCadCliente == null) {
			btnCadCliente = new JButton("Cadastrar Cliente");
			btnCadCliente.setBackground(new Color(255, 255, 255));
			btnCadCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnCadCliente.setBounds(364, 265, 295, 91);
		}
		return btnCadCliente;
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
	
	public JButton getBtnRmvCliente() {
		if (btnRmvCliente == null) {
			btnRmvCliente = new JButton("Lista Clientes");
			btnRmvCliente.setBackground(new Color(255, 255, 255));
			btnRmvCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnRmvCliente.setBounds(364, 440, 295, 91);
		}
		return btnRmvCliente;
	}
	
	//apagar essa label depois, serve para representar a lista
	public JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("CLIENTE");
			lblTitulo.setForeground(new Color(255, 255, 255));
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblTitulo.setBounds(457, 108, 109, 91);
		}
		return lblTitulo;
	}
}
