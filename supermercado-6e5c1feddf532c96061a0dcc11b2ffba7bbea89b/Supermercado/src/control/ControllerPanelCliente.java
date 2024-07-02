package control;



import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import model.Cliente;
import model.ClienteDAO;
import view.Frame;
import view.PanelCadCliente;
import view.PanelCliente;
import view.PanelHome;
import view.PanelListaCliente;

public class ControllerPanelCliente {
	Frame frame;
	PanelHome panelHome;
	PanelCliente panelCliente;
	PanelCadCliente panelCadCliente;
	PanelListaCliente panelListaCliente;
	ValidacaoTextField validacao;
	ClienteDAO clienteDao;
	
	public ControllerPanelCliente( Frame frame, PanelHome panelhome, PanelCliente panelCliente) {
		
		this.panelCliente = panelCliente;
		this.frame = frame;
		this.panelHome = panelhome;
		panelCadCliente= new PanelCadCliente();
		
		acaoButon();
		salvarDados();

	}

	private void salvarDados() {
		
		panelCadCliente.getBtnCadastrar().addActionListener((ActionEvent e)->{	
			
			if(!ValidacaoTextField.verificaNome(this.panelCadCliente.getTextFieldNome().getText(),"Nome")){
				
				return;
			}
			
			if(!ValidacaoTextField.verificaCpf(this.panelCadCliente.getFormattedTextFieldCpf().getText())) {
				
				return;
			}
			
			if(!ValidacaoTextField.verificaRg(this.panelCadCliente.getFormattedTextFieldRg().getText())) {
				
				return;
			}
			
			if(!ValidacaoTextField.verificaRg(this.panelCadCliente.getFormattedTextFieldRg().getText())) {
			
				return;
			}
			
			if(!ValidacaoTextField.verificaDouble(this.panelCadCliente.getTextFieldLimiteCred().getText(),"Limite de Cartão")) {
				//JOptionPane.showMessageDialog(null,"Limite Cr�dito inv�lido (deve ser maior que zero).");
				return;
			}
			
			//verifica o campo nome
			/*String nome = this.panelCadCliente.getTextFieldNome().getText();
			System.out.println(nome.length());
			//"[A-Za-z0-9 ]{3,20}"
			if (!nome.matches("^[A-Z a-z�-��-����]+(\s[A-Z a-z�-��-����]+)*$") || nome.length()<=3 || nome.length() >=20){
			  // Exibe mensagem de erro para o usu�rio
				JOptionPane.showMessageDialog(null,"Nome inv�lido (3 a 20 caracteres,somente letras).");
			  return; 
			}
			*/
			
			//verifica o campo pre�o de venda
			/*String limiteCred = this.panelCadCliente.getTextFieldLimiteCred().getText();
			try {
			  double doublelimiteCred = Double.parseDouble(limiteCred);
			  if (doublelimiteCred <= 0.0) {
			    // Exibe mensagem de erro para o usu�rio
				  JOptionPane.showMessageDialog(null,"Limite Cr�dito inv�lido (deve ser maior que zero).");
			    return; // Interrompe o salvamento
			  }
			} catch (NumberFormatException r) {
			  // Exibe mensagem de erro para o usu�rio
				JOptionPane.showMessageDialog(null,"Limite Cr�dito inv�lido (formato incorreto).");
			  return; // Interrompe o salvamento
			}*/
			
			Cliente cliente = new Cliente(this.panelCadCliente.getTextFieldNome().getText(),
					this.panelCadCliente.getFormattedTextFieldCpf().getText(),
					this.panelCadCliente.getFormattedTextFieldRg().getText(),
					this.panelCadCliente.getFormattedTextFieldDataNasc().getText(),
					this.panelCadCliente.getTextFieldLimiteCred().getText());
			
			//ControllerDados.salvarUmCliente(cliente);
			ClienteDAO.insert(cliente);
			
			JOptionPane.showMessageDialog(null,"Cliente Salvo");
			this.panelCadCliente.getTextFieldNome().setText("");
			this.panelCadCliente.getFormattedTextFieldCpf().setText("");
			this.panelCadCliente.getFormattedTextFieldRg().setText("");
			this.panelCadCliente.getFormattedTextFieldDataNasc().setText("");
			this.panelCadCliente.getTextFieldLimiteCred().setText("");
			
		});
	}

	private void acaoButon() {
		
		panelCliente.getBtnCadCliente().addActionListener( (ActionEvent e)->{
			frame.setContentPane(panelCadCliente);
			
		});
		
		panelCliente.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		
		panelCadCliente.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelCliente);
		});
		
		panelCliente.getBtnRmvCliente().addActionListener((ActionEvent e)->{
			panelListaCliente = new PanelListaCliente();
			frame.repaint();
			panelListaCliente.repaint();
			
			panelListaCliente.getScrollPane().setViewportView(panelListaCliente.getPanelContainer(ClienteDAO.select()));
			frame.setContentPane(panelListaCliente);
			
			panelListaCliente.getBtnVoltar().addActionListener((ActionEvent r)->{
						frame.setContentPane(panelCliente);
			});
			
		});
	}
	
}
