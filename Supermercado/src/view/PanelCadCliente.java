package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class PanelCadCliente extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnVoltar;
	private JLabel lblNome;
	private JLabel lblCPF;
	private JLabel lblRG;
	private JLabel lblDataN;
	private JLabel lblLimiteCred;
	private JButton btnCadastrar;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldRG;
	private JTextField textFieldDataN;
	private JTextField textFieldLimiteCred;

	
	public PanelCadCliente() {
		//this.setVisible(false);
		this.setBackground(new Color(57, 148, 28));
		this.setSize(1024, 768);
		setLayout(null);
		add(getLblNome());
		add(getLblCPF());
		add(getLblRG());
		add(getLblDataN());
		add(getLblLimiteCred());
		add(getBtnCadastrar());
		add(getBtnVoltar());
		add(getTextFieldNome());
		add(getTextFieldCPF());
		add(getTextFieldRG());
		add(getTextFieldDataN());
		add(getTextFieldLimiteCred());
	}
	
	
	private JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome:");
			lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNome.setBounds(188, 179, 55, 45);
		}
		return lblNome;
	}
	private JLabel getLblCPF() {
		if (lblCPF == null) {
			lblCPF = new JLabel("CPF:");
			lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblCPF.setBounds(188, 234, 55, 45);
		}
		return lblCPF;
	}
	private JLabel getLblRG() {
		if (lblRG == null) {
			lblRG = new JLabel("RG:");
			lblRG.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblRG.setBounds(188, 289, 55, 45);
		}
		return lblRG;
	}
	private JLabel getLblDataN() {
		if (lblDataN == null) {
			lblDataN = new JLabel("Data de nascimento:");
			lblDataN.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblDataN.setBounds(188, 344, 155, 45);
		}
		return lblDataN;
	}
	private JLabel getLblLimiteCred() {
		if (lblLimiteCred == null) {
			lblLimiteCred = new JLabel("Limite de crédito:");
			lblLimiteCred.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblLimiteCred.setBounds(188, 399, 136, 45);
		}
		return lblLimiteCred;
	}
	private JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnCadastrar.setBounds(410, 479, 109, 45);
		}
		return btnCadastrar;
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
	private JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(253, 194, 233, 19);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	private JTextField getTextFieldCPF() {
		if (textFieldCPF == null) {
			textFieldCPF = new JTextField();
			textFieldCPF.setColumns(10);
			textFieldCPF.setBounds(253, 249, 144, 19);
		}
		return textFieldCPF;
	}
	private JTextField getTextFieldRG() {
		if (textFieldRG == null) {
			textFieldRG = new JTextField();
			textFieldRG.setColumns(10);
			textFieldRG.setBounds(253, 304, 144, 19);
		}
		return textFieldRG;
	}
	private JTextField getTextFieldDataN() {
		if (textFieldDataN == null) {
			textFieldDataN = new JTextField();
			textFieldDataN.setColumns(10);
			textFieldDataN.setBounds(353, 359, 96, 19);
		}
		return textFieldDataN;
	}
	private JTextField getTextFieldLimiteCred() {
		if (textFieldLimiteCred == null) {
			textFieldLimiteCred = new JTextField();
			textFieldLimiteCred.setColumns(10);
			textFieldLimiteCred.setBounds(334, 414, 96, 19);
		}
		return textFieldLimiteCred;
	}
}
