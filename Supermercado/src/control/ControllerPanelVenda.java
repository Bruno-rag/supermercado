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
import view.PanelCadastroVenda;
import view.PanelCliente;
import view.PanelHome;
import view.PanelListaCliente;
import view.PanelListaProduto;
import view.PanelListaVenda;
import view.PanelProduto;
import view.PanelVendas;
import model.Cliente;
import model.Venda;

public class ControllerPanelVenda {
	Frame frame;
	PanelHome panelHome;
	PanelVendas panelVenda;
	PanelCadastroVenda panelCadastroVenda;
	PanelListaVenda panelListaVenda;
	ArrayList<Venda> vendas;
	
	public ControllerPanelVenda( Frame frame, PanelHome panelhome, PanelVendas panelVendas) {
		this.frame = frame;
		this.panelVenda = panelVendas;
		this.panelHome = panelhome;
		panelCadastroVenda= new PanelCadastroVenda();
		panelListaVenda = new PanelListaVenda();
		
		acaoButon();
		salvarDados();
		lerVendas();
	}

	private void salvarDados() {
		
		panelCadastroVenda.getBtnSalvar().addActionListener((ActionEvent e)->{	
			try {
				//cria um diretório chamando novo
				File diretorio = new File("c:\\novo");
				diretorio.mkdir();
				
				//cria um aquivo de texto chamando produto
				File arquivo = new File(diretorio, "Venda.txt");
				
				//FileWriter writer;
				//writer = new FileWriter(arquivo);
				//writer.close();
			
				FileOutputStream fileStream = new FileOutputStream(arquivo, true);
				
				
				//String texto = "Nome:+this.aluno.getNome()Cpf:this.aluno.getCpf() RG:this.aluno.getRg()Data de nascimento:this.aluno.getDataNascimento()Matrícula:this.aluno.getMatricula()Endereço:this.aluno.getEndereco()Gênero:this.aluno.getSexo()Curso:this.aluno.getCurso()\n";
				//String texto = "teste\n";
				String texto = this.panelCadastroVenda.getTextFieldNome().getText()+","+
									this.panelCadastroVenda.getTextFieldProduto().getText()+","+
									this.panelCadastroVenda.getTextFieldQuatidade().getText()+","+
									this.panelCadastroVenda.getTextFieldFormaPagamento().getText()+"\n";
				
				System.out.println(texto);
				fileStream.write(texto.getBytes());
				fileStream.close();
				
			} catch (IOException e1) {


				e1.printStackTrace();
			}
			//System.out.println(panelCadastroProduto.getTextFieldNome().getText());
			this.panelCadastroVenda.getTextFieldNome().setText("");
			this.panelCadastroVenda.getTextFieldProduto().setText("");
			this.panelCadastroVenda.getTextFieldQuatidade().setText("");
			this.panelCadastroVenda.getTextFieldFormaPagamento().setText("");
			
			
			//atualiza a lista
			
		});
	}

	private void acaoButon() {
		
		panelVenda.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		
		panelVenda.getBtnCadastroVenda().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelCadastroVenda);
		});
		panelCadastroVenda.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelVenda);
		});
		
	
		panelListaVenda.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelVenda);
		});
		
		panelVenda.getBtnRegistroVendas().addActionListener((ActionEvent e)->{
			
			panelListaVenda.getScrollPane().setViewportView(panelListaVenda.getPanelContainer(lerVendas()));
			frame.setContentPane(panelListaVenda);
		});
	}
	
	private ArrayList<Venda> lerVendas(){
		vendas = new ArrayList<Venda>();
		String nomeAqv = "c:\\novo\\Venda.txt";
		File arquivo = new File(nomeAqv);
	    String linha = new String();
	    
	    if(arquivo.exists()) {
	    	try {
				FileReader leitorDeArquivo = new FileReader(nomeAqv);
				BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);
				while((linha = bufferDeArquivo.readLine()) != null) {
					
					String[] token = linha.split(",");
					
					Venda venda = new Venda(token[0], token[1], token[2],token[3]);
	
					vendas.add(venda);
					
				}
				
			} catch (Exception e) {
				
			}
	    }
		return vendas; 
	}
	
	
}
