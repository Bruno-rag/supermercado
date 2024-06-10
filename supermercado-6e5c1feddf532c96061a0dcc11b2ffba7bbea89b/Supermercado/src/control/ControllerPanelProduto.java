package control;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

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
	ControllerDados controllerDados;
	ArrayList<Produto> produtos;
	
	//String mascaraData = "99/99/9999"; 
	//MaskFormatter mascaraNum = null;
	
	String formatoData = "DD/MM/YYYY"; 
	SimpleDateFormat formatadorData = new SimpleDateFormat(formatoData);

	
	public ControllerPanelProduto( Frame frame, PanelHome panelhome, PanelProduto panelProduto) {
		
		this.panelProduto = panelProduto;
		this.frame = frame;
		this.panelHome = panelhome;
		panelCadastroProduto = new PanelCadastroProduto();
		acaoButon();
		salvarDados();
	}

	private void salvarDados() {
		
		panelCadastroProduto.getBtnSalvar().addActionListener((ActionEvent e)->{	
			//Date dataParseada1;
			//SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
			
			
			//verifica o campo nome	
			if(!ValidacaoTextField.verificaNome(this.panelCadastroProduto.getTextFieldNome().getText(),"Nome")){				
				return;
			}
				
			//verifica o campo tipo
			if(!ValidacaoTextField.verificaNome(this.panelCadastroProduto.getTextFieldTipo().getText(),"Tipo")){		
				return;
			}
			
			//verifica o campo preço de venda
			if(!ValidacaoTextField.verificaDouble(this.panelCadastroProduto.getFormattedTextFieldPrecoVenda().getText(),"Preço de venda")){
				return;
			}
			
			//verifica o campo preço de compra
			if(!ValidacaoTextField.verificaDouble(this.panelCadastroProduto.getFormattedTextFieldPrecoCompra().getText(),"Preço de Compra")){
				return;
			}
			//verifica se o valor de compra é menor que o de venda
			if(!ValidacaoTextField.CompararNumeroMaior(this.panelCadastroProduto.getFormattedTextFieldPrecoVenda().getText(),this.panelCadastroProduto.getFormattedTextFieldPrecoCompra().getText())){
				return;
			}
			
			//verifica o campo Frabricação
			if(!ValidacaoTextField.verificaData(this.panelCadastroProduto.getFormattedTextFieldFabricacao().getText())){			
				return;
			}
			
			//verifica o campo validade
			if(!ValidacaoTextField.verificaData(this.panelCadastroProduto.getFormattedTextFieldValidade().getText())){				
				return;
			}
			
			/*String dataEntradaFab = this.panelCadastroProduto.getFormattedTextFieldFabricacao().getText(); 
			
			try {
			  dataParseada1 = sdf.parse(dataEntradaFab);  // Tente converter a string para uma data
			  
			  System.out.println(sdf.format(dataParseada1));
			  //JOptionPane.showMessageDialog(null,"Data válida: " + dataParseada1);  // Data válida e parseada com sucesso
			} catch (ParseException r) {
				JOptionPane.showMessageDialog(null,"Formato de data inválido: " + r.getMessage()); // Formato de data inválido
			  return; 
			}
			*/
			//verifica o campo validade
			
			/*String dataEntradaVal = this.panelCadastroProduto.getFormattedTextFieldValidade().getText(); 
			try {
			  Date dataParseada2 = sdf.parse(dataEntradaVal);  // Tente converter a string para uma data
			  System.out.println("data 1: :"+dataParseada1);
			  int result = dataParseada1.compareTo(dataParseada2);
			  System.out.println("data 1: :"+dataParseada1+"\n"+dataParseada2+"\n"+" result: " + result);
			  if(result >= 0 ) {
				  JOptionPane.showMessageDialog(null,"Data de Validade deve ser maior que a data de Fabricação.");
				  return; 
			  }
			} catch (ParseException r) {
				JOptionPane.showMessageDialog(null,"Formato de data inválido: "); // Formato de data inválido
			  return; 
			}*/
			
			//verifica o campo quantidade
			if(!ValidacaoTextField.verificaInteiro(this.panelCadastroProduto.getFormattedTextFieldPrecoQuantidade().getText(),"Quantidade")){			
				return;
			}
			
			Produto itemProduto = new Produto(
				this.panelCadastroProduto.getTextFieldNome().getText(),
				this.panelCadastroProduto.getTextFieldTipo().getText(),
				this.panelCadastroProduto.getFormattedTextFieldPrecoVenda().getText(),
				this.panelCadastroProduto.getFormattedTextFieldPrecoCompra().getText(),
				this.panelCadastroProduto.getFormattedTextFieldFabricacao().getText(),
				this.panelCadastroProduto.getFormattedTextFieldValidade().getText(),
				this.panelCadastroProduto.getFormattedTextFieldPrecoQuantidade().getText()
			);
			
			ControllerDados.salvarUmProduto(itemProduto);
				
			panelCadastroProduto.getTextFieldNome().setText("");
			panelCadastroProduto.getTextFieldTipo().setText("");
			panelCadastroProduto.getFormattedTextFieldPrecoVenda().setText("");
			panelCadastroProduto.getFormattedTextFieldPrecoCompra().setText("");
			panelCadastroProduto.getFormattedTextFieldFabricacao().setText("");
			panelCadastroProduto.getFormattedTextFieldValidade().setText("");
			panelCadastroProduto.getFormattedTextFieldPrecoQuantidade().setText("");
			JOptionPane.showMessageDialog(null,"Produto salvo");
			
		});
	}

	private void acaoButon() {
		panelHome.getBtnProduto().addActionListener( (ActionEvent e)->{
			frame.setContentPane(panelProduto);			
			
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
		
		panelProduto.getBtnEstoque().addActionListener((ActionEvent e)->{
			panelListaProduto = new PanelListaProduto();
			
			panelListaProduto.getBtnVoltar().addActionListener((ActionEvent r)->{
				frame.setContentPane(panelProduto);
			});
			
			panelListaProduto.getScrollPane().setViewportView(panelListaProduto.getPanelContainer(ControllerDados.lerProdutos()));
			frame.setContentPane(panelListaProduto);
		});
	}
		
}
