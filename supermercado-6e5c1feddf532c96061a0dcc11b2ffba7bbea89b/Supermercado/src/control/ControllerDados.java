package control;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import model.Cliente;
import model.Produto;
import model.Venda;

public class ControllerDados {
	static ArrayList<Produto> produtos;
	static ArrayList<Venda> vendas;
	static ArrayList<Cliente> clientes;
	
	public ControllerDados() {
		
	}
	
	public static void salvarUmProduto(Produto produto) {
		
		try {
			//cria um diretï¿½rio chamando novo
			File diretorio = new File("c:\\novo");
			diretorio.mkdir();
			
			//cria um aquivo de texto chamando produto
			File arquivo = new File(diretorio, "Produto.txt");
			
			//FileWriter writer;
			//writer = new FileWriter(arquivo);
			//writer.close();
		
			FileOutputStream fileStream = new FileOutputStream(arquivo, true);
			
			String texto = produto.getNome()+","+
					produto.getTipo()+","+
					produto.getPrecoVenda()+","+
					produto.getPrecoCompra()+","+
					produto.getFab()+","+
					produto.getVal()+","+
					produto.getQuantidade()+"\n";
			
			System.out.println(texto);
			fileStream.write(texto.getBytes());
			fileStream.close();
			
		} catch (IOException e1) {

			e1.printStackTrace();
		}
		
	}

	public static ArrayList<Produto> lerProdutos(){
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
				leitorDeArquivo.close();
			} catch (Exception e) {
				
			}
	    }
		return produtos; 
	}
	
	public static void salvarUmaVenda(Venda venda) {
		
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
				
				
				
				String texto = venda.getNome()+","+
								venda.getProdutos()+","+
								venda.getQuatidade()+","+
								venda.getFormaPagemanto()+","+
								venda.getValorVenda()+"\n";
				
				System.out.println(texto);
				fileStream.write(texto.getBytes());
				fileStream.close();
				
			} catch (IOException e1) {

				e1.printStackTrace();
			}	
	}
	
	public static ArrayList<Venda> lerVendas(){
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
					
					Venda venda = new Venda(token[0], token[1], token[2],token[3],token[4]);
	
					vendas.add(venda);	
				}
				leitorDeArquivo.close();
			} catch (Exception e) {
				
			}
	    	
	    }
		return vendas; 
	}
	
	public static void salvarUmCliente(Cliente cliente) {
		
		try {
			//cria um diretório chamando novo
			File diretorio = new File("c:\\novo");
			diretorio.mkdir();
			
			//cria um aquivo de texto chamando cliente
			File arquivo = new File(diretorio, "Cliente.txt");
			
			//FileWriter writer;
			//writer = new FileWriter(arquivo);
			//writer.close();
		
			FileOutputStream fileStream = new FileOutputStream(arquivo, true);
			
			String texto = cliente.getNome()+","+
					cliente.getCpf()+","+
					cliente.getRg()+","+
					cliente.getDataNasc()+","+
					cliente.getLimiteCredit()+"\n";
			
			fileStream.write(texto.getBytes());
			
			fileStream.close();
			
		} catch (IOException e1) {


			e1.printStackTrace();
		}
	}
	
	public static ArrayList<Cliente> lerCliente(){
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
				
				leitorDeArquivo.close();
			} catch (Exception e) {
				
			}
	    	
	    }
		return clientes; 
	}
}
