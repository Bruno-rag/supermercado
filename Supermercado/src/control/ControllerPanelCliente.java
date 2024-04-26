package control;


import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import view.Frame;
import view.PanelCadCliente;
import view.PanelCadastroProduto;
import view.PanelCliente;
import view.PanelHome;
import view.PanelListaCliente;
import view.PanelListaProduto;
import view.PanelProduto;
import model.Cliente;

public class ControllerPanelCliente {
	Frame frame;
	PanelHome panelHome;
	PanelCliente panelCliente;
	PanelCadCliente panelCadCliente;
	PanelListaCliente panelListaCliente;
	ArrayList<Cliente> clientes;
	
	public ControllerPanelCliente( Frame frame, PanelHome panelhome, PanelCliente panelCliente) {
		
		this.panelCliente = panelCliente;
		this.frame = frame;
		this.panelHome = panelhome;
		panelCadCliente= new PanelCadCliente();
		panelListaCliente = new PanelListaCliente();
		
		acaoButon();
		salvarDados();
		lerCliente();
	}

	private void salvarDados() {
		
		panelCadCliente.getBtnCadastrar().addActionListener((ActionEvent e)->{	
			try {
				//cria um diretório chamando novo
				File diretorio = new File("c:\\novo");
				diretorio.mkdir();
				
				//cria um aquivo de texto chamando produto
				File arquivo = new File(diretorio, "Cliente.txt");
				
				//FileWriter writer;
				//writer = new FileWriter(arquivo);
				//writer.close();
			
				FileOutputStream fileStream = new FileOutputStream(arquivo, true);
				
				
				//String texto = "Nome:+this.aluno.getNome()Cpf:this.aluno.getCpf() RG:this.aluno.getRg()Data de nascimento:this.aluno.getDataNascimento()Matrícula:this.aluno.getMatricula()Endereço:this.aluno.getEndereco()Gênero:this.aluno.getSexo()Curso:this.aluno.getCurso()\n";
				//String texto = "teste\n";
				String texto = this.panelCadCliente.getTextFieldNome().getText()+","+
									this.panelCadCliente.getTextFieldCPF().getText()+","+
									this.panelCadCliente.getTextFieldRG().getText()+","+
									this.panelCadCliente.getTextFieldDataN().getText()+","+
									this.panelCadCliente.getTextFieldLimiteCred().getText()+"\n";
				
				System.out.println(texto);
				fileStream.write(texto.getBytes());
				fileStream.close();
				
			} catch (IOException e1) {


				e1.printStackTrace();
			}
			//System.out.println(panelCadastroProduto.getTextFieldNome().getText());
			this.panelCadCliente.getTextFieldNome().setText("");
			this.panelCadCliente.getTextFieldCPF().setText("");
			this.panelCadCliente.getTextFieldRG().setText("");
			this.panelCadCliente.getTextFieldDataN().setText("");
			this.panelCadCliente.getTextFieldLimiteCred().setText("");
			
			//atualiza a lista
			
		});
	}

	private void acaoButon() {
		
		panelCliente.getBtnCadCliente().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelCadCliente);
			
		});
		
		panelCliente.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		
		panelCadCliente.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelCliente);
		});
		
	
		
		panelListaCliente.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelCliente);
		});
		
		panelCliente.getBtnRmvCliente().addActionListener((ActionEvent e)->{
			
			panelListaCliente.getScrollPane().setViewportView(panelListaCliente.getPanelContainer(lerCliente()));
			frame.setContentPane(panelListaCliente);
		});
	}
	
	private ArrayList<Cliente> lerCliente(){
		clientes = new ArrayList<Cliente>();
		String nomeAqv = "c:\\novo\\Cliente.txt";
		File arquivo = new File(nomeAqv);
	    String linha = new String();
	    
	    if(arquivo.exists()) {
	    	try {
				FileReader leitorDeArquivo = new FileReader(nomeAqv);
				BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);
				while((linha = bufferDeArquivo.readLine()) != null) {
					
					String[] token = linha.split(",");
					
					Cliente cliente = new Cliente(token[0], token[1], token[2],token[3],token[4]);
	
					clientes.add(cliente);
				}
				
			} catch (Exception e) {
				
			}
	    }
		return clientes; 
	}
	
	
}
