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
	private JLabel lblTituloApagar;

	
	public PanelCliente() {
		this.setBackground(new Color(57, 148, 28));
		this.setSize(1024, 768);
		setLayout(null);
		add(getBtnVoltar());
		add(getBtnCadCliente());
		add(getBtnRmvCliente());
		add(getLblTituloApagar());
	}
	
	public JButton getBtnCadCliente() {
		if (btnCadCliente == null) {
			btnCadCliente = new JButton("Cadastrar Cliente");
			btnCadCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnCadCliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnCadCliente.setBounds(267, 566, 250, 35);
		}
		return btnCadCliente;
	}
	
	public JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnVoltar.setBounds(10, 10, 85, 21);
		}
		return btnVoltar;
	}
	
	private JButton getBtnRmvCliente() {
		if (btnRmvCliente == null) {
			btnRmvCliente = new JButton("Remover Cliente");
			btnRmvCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnRmvCliente.setBounds(576, 566, 250, 35);
		}
		return btnRmvCliente;
	}
	
	//apagar essa label depois, serve para representar a lista
	private JLabel getLblTituloApagar() {
		if (lblTituloApagar == null) {
			lblTituloApagar = new JLabel("*Lista de Clientes*");
			lblTituloApagar.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblTituloApagar.setBounds(405, 214, 214, 92);
		}
		return lblTituloApagar;
	}
}
