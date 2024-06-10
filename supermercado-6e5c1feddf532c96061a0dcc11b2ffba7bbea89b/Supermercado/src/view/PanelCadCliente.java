
package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

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
	private JTextField textFieldLimiteCred;
	private JLabel lblCadastroDeCliente;
	private JFormattedTextField formattedTextFieldCpf;
	private JFormattedTextField formattedTextFieldRg;
	private JFormattedTextField formattedTextFieldDataNasc;
	public MaskFormatter mascaraCpf = null;
	public MaskFormatter mascaraRg = null;
	public MaskFormatter mascaraData = null;
	
	public PanelCadCliente() {
		//this.setVisible(false);
		this.setBackground(new Color(25, 25, 25));
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
		add(getTextFieldLimiteCred());
		add(getLblCadastroDeCliente());
		add(getFormattedTextFieldCpf());
		add(getFormattedTextFieldRg());
		add(getFormattedTextFieldDataNasc());
	}
	
	
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome:");
			lblNome.setForeground(new Color(255, 255, 255));
			lblNome.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNome.setBounds(344, 145, 55, 45);
		}
		return lblNome;
	}
	public JLabel getLblCPF() {
		if (lblCPF == null) {
			lblCPF = new JLabel("CPF:");
			lblCPF.setForeground(new Color(255, 255, 255));
			lblCPF.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblCPF.setBounds(344, 226, 55, 45);
		}
		return lblCPF;
	}
	public JLabel getLblRG() {
		if (lblRG == null) {
			lblRG = new JLabel("RG:");
			lblRG.setForeground(new Color(255, 255, 255));
			lblRG.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblRG.setBounds(344, 306, 55, 45);
		}
		return lblRG;
	}
	public JLabel getLblDataN() {
		if (lblDataN == null) {
			lblDataN = new JLabel("Data de nascimento:");
			lblDataN.setForeground(new Color(255, 255, 255));
			lblDataN.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblDataN.setBounds(344, 381, 183, 45);
		}
		return lblDataN;
	}
	public JLabel getLblLimiteCred() {
		if (lblLimiteCred == null) {
			lblLimiteCred = new JLabel("Limite de credito:");
			lblLimiteCred.setForeground(new Color(255, 255, 255));
			lblLimiteCred.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblLimiteCred.setBounds(344, 459, 155, 45);
		}
		return lblLimiteCred;
	}
	public JButton getBtnCadastrar() {
		if (btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setBackground(new Color(87, 161, 115));
			btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnCadastrar.setBounds(380, 647, 264, 35);
		}
		return btnCadastrar;
	}
	public JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("X");
			btnVoltar.setForeground(new Color(255, 255, 255));
			btnVoltar.setBackground(new Color(220, 20, 60));
			btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 18));
			btnVoltar.setBounds(952, 24, 47, 40);
			
		}
		return btnVoltar;
	}
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(344, 186, 336, 30);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JTextField getTextFieldLimiteCred() {
		if (textFieldLimiteCred == null) {
			textFieldLimiteCred = new JTextField();
			textFieldLimiteCred.setColumns(10);
			textFieldLimiteCred.setBounds(344, 494, 336, 30);
		}
		return textFieldLimiteCred;
	}
	public JLabel getLblCadastroDeCliente() {
		if (lblCadastroDeCliente == null) {
			lblCadastroDeCliente = new JLabel("CADASTRO DE CLIENTE");
			lblCadastroDeCliente.setForeground(Color.WHITE);
			lblCadastroDeCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblCadastroDeCliente.setBounds(412, 41, 200, 45);
		}
		return lblCadastroDeCliente;
	}
	public JFormattedTextField getFormattedTextFieldCpf() {
		if (formattedTextFieldCpf == null) {
			try {
				mascaraCpf = new MaskFormatter("###.###.###-##");
				formattedTextFieldCpf = new JFormattedTextField(mascaraCpf);
				formattedTextFieldCpf.setBounds(344, 266, 336, 30);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return formattedTextFieldCpf;
	}
	public JFormattedTextField getFormattedTextFieldRg() {
		if (formattedTextFieldRg == null) {
			try {
				mascaraRg = new MaskFormatter("##.###.###-##");
				formattedTextFieldRg = new JFormattedTextField(mascaraRg);
				formattedTextFieldRg.setBounds(344, 341, 336, 30);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		return formattedTextFieldRg;
	}
	public JFormattedTextField getFormattedTextFieldDataNasc() {
		if (formattedTextFieldDataNasc == null) {
			try {
				mascaraData = new MaskFormatter("##/##/####");
				formattedTextFieldDataNasc = new JFormattedTextField(mascaraData);
				formattedTextFieldDataNasc.setBounds(344, 418, 336, 30);
				
			} catch (Exception e) {
				
			}	
		}
		return formattedTextFieldDataNasc;
	}
}

