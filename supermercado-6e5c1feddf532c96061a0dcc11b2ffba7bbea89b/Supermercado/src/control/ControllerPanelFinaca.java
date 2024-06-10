package control;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import model.Cliente;
import model.Produto;
import model.Venda;
import view.Frame;
import view.PanelFinaca;
import view.PanelHome;

public class ControllerPanelFinaca {
	Frame frame;
	PanelFinaca panelFinaca;
	PanelHome panelHome;
	ControllerDados controllerDados;
	ArrayList<Produto> produtos;
	ArrayList<Cliente> clientes;
	ArrayList<Venda> vendas;
	
	public ControllerPanelFinaca(Frame frame,PanelHome panelHome, PanelFinaca panelFinaca) {
		this.frame = frame;
		this.panelFinaca = panelFinaca;
		this.panelHome = panelHome;
		acaoButao();
	}
	
	public void acaoButao() {
		
		panelHome.getBtnFinacas().addActionListener( (ActionEvent e)->{
			CarregarFinacas();
			frame.setContentPane(panelFinaca);
			
		});
		panelFinaca.getBtnVoltar().addActionListener((ActionEvent e)->{			
			frame.setContentPane(panelHome);
			
		});	
		
	}
	void CarregarFinacas() {
		double valorTotalVenda = 0;
		double valorTotalCompra = 0;
		double lucroLiquido = 0;
		double precoEstoque = 0;
		ArrayList<Venda> listVendas =  ControllerDados.lerVendas();
		ArrayList<Produto> listProdutos =  ControllerDados.lerProdutos();
		
		//Pegando o total do preço de estoque
		for(Produto produto: listProdutos) {
			double preco = Double.parseDouble(produto.getPrecoCompra());
			double qantidade = Double.parseDouble(produto.getQuantidade());
			System.out.println("Produtos: \n"+" Nome: "+produto.getNome()+" Preço venda: "+produto.getPrecoVenda()+"Preço de compra: "+produto.getPrecoCompra()+" QTD: " + produto.getQuantidade());
			precoEstoque = precoEstoque+(preco*qantidade);
		}
	   String stgPreco = precoEstoque+"";
	    panelFinaca.getLblValorEstoque().setText("R$ "+stgPreco);
		
		// Verificar os produtos vendidos e pega seus preços
		for(Produto produto: listProdutos) {
			for(Venda venda : listVendas) {
				System.out.println(produto.getNome()+venda.getProdutos());
				
				if(produto.getNome().equals(venda.getProdutos()) ) {
					valorTotalVenda = valorTotalVenda + Double.parseDouble(produto.getPrecoVenda());
					valorTotalCompra = valorTotalCompra + Double.parseDouble(produto.getPrecoCompra());
				}
			}
		}
		lucroLiquido =  valorTotalVenda-valorTotalCompra;
		String stgLucroLiquido = lucroLiquido+""; // convertendo para String
		String stgLucroBruto = valorTotalVenda+""; // convertendo para String
		panelFinaca.getLblValorLucroLiquido().setText("R$ "+stgLucroLiquido);
		panelFinaca.getLblValorLucroBruto().setText("R$ "+stgLucroBruto);
	}
	
	
}
