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
import view.PanelCadastroProduto;
import view.PanelHome;
import view.PanelListaProduto;
import view.PanelProduto;
import model.Produto;

public class ControllerPanelProduto {
	Frame frame;
	PanelProduto panelProduto;
	PanelHome panelHome;
	PanelCadastroProduto panelCadastroProduto;
	PanelListaProduto panelListaProduto;
	ArrayList<Produto> produtos;
	
	public ControllerPanelProduto( Frame frame, PanelHome panelhome, PanelProduto panelProduto) {
		
		this.panelProduto = panelProduto;
		this.frame = frame;
		this.panelHome = panelhome;
		panelCadastroProduto = new PanelCadastroProduto();
		panelListaProduto = new PanelListaProduto();
		
		acaoButon();
		salvarDados();
		lerProdutos();
	}

	private void salvarDados() {
		
		panelCadastroProduto.getBtnSalvar().addActionListener((ActionEvent e)->{	
			try {
				//cria um diret�rio chamando novo
				File diretorio = new File("c:\\Registros");
				diretorio.mkdir();
				
				//cria um aquivo de texto chamando produto
				File arquivo = new File(diretorio, "Produto.txt");
				
				//FileWriter writer;
				//writer = new FileWriter(arquivo);
				//writer.close();
			
				FileOutputStream fileStream = new FileOutputStream(arquivo, true);
				
				
				//String texto = "Nome:+this.aluno.getNome()Cpf:this.aluno.getCpf() RG:this.aluno.getRg()Data de nascimento:this.aluno.getDataNascimento()Matr�cula:this.aluno.getMatricula()Endere�o:this.aluno.getEndereco()G�nero:this.aluno.getSexo()Curso:this.aluno.getCurso()\n";
				//String texto = "teste\n";
				String texto = "NOME:"+this.panelCadastroProduto.getTextFieldNome().getText()+"\n"+
								"TIPO:"+this.panelCadastroProduto.getTextFieldTipo().getText()+"\n"+
								"VENDA:"+this.panelCadastroProduto.getTextFieldPrecoVenda().getText()+"\n"+
								"COMPRA:"+this.panelCadastroProduto.getTextFieldPrecoCompra().getText()+"\n"+
								"FAB:"+this.panelCadastroProduto.getTextFieldFabricacao().getText()+"\n"+
								"VAL:"+this.panelCadastroProduto.getTextFieldValidade().getText()+"\n"+
								"ESTOQUE:"+this.panelCadastroProduto.getTextFieldQuatidadeEstoque().getText()+"\n\n";
				
				System.out.println(texto);
				fileStream.write(texto.getBytes());
				fileStream.close();
				
			} catch (IOException e1) {


				e1.printStackTrace();
			}
			//System.out.println(panelCadastroProduto.getTextFieldNome().getText());
			panelCadastroProduto.getTextFieldNome().setText("");
			panelCadastroProduto.getTextFieldTipo().setText("");
			panelCadastroProduto.getTextFieldPrecoVenda().setText("");
			panelCadastroProduto.getTextFieldPrecoCompra().setText("");
			panelCadastroProduto.getTextFieldFabricacao().setText("");
			panelCadastroProduto.getTextFieldValidade().setText("");
			panelCadastroProduto.getTextFieldQuatidadeEstoque().setText("");
			//atualiza a lista
			panelListaProduto.getScrollPane().setViewportView(panelListaProduto.getPanelContainer(lerProdutos()));
			
		});
	}

	private void acaoButon() {
		panelHome.getBtnProduto().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelProduto);
			panelProduto.setVisible(true);
			
		});
		//volta para home
		panelProduto.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		
		panelProduto.getBtnAdicionarProduto().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelCadastroProduto);
		});	
		//volta para panel produto
		panelCadastroProduto.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelProduto);
		});
		panelListaProduto.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelProduto);
		});
		
		panelProduto.getBtnEstoque().addActionListener((ActionEvent e)->{
			
			panelListaProduto.getScrollPane().setViewportView(panelListaProduto.getPanelContainer(lerProdutos()));
			frame.setContentPane(panelListaProduto);
		});
	}
	
	private ArrayList<Produto> lerProdutos(){
		produtos = new ArrayList<Produto>();
		String nomeAqv = "c:\\novo\\Produto.txt";
		File arquivo = new File(nomeAqv);
	    String linha = new String();
	    
	    if(arquivo.exists()) {
	    	try {
				FileReader leitorDeArquivo = new FileReader(nomeAqv);
				BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);
				while((linha = bufferDeArquivo.readLine()) != null) {
					
					String[] token = linha.split(",");
					
					Produto produto = new Produto(token[0], token[1], token[2],token[3],token[4],token[5],token[6]);
	
					produtos.add(produto);
				}
				
			} catch (Exception e) {
				
			}
	    }
		return produtos; 
	}
	
	
}
