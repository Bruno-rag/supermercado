package control;



import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import view.Frame;
import view.PanelCadastroVenda;
import view.PanelHome;
import view.PanelListaVenda;
import view.PanelVendas;
import model.Cliente;
import model.Produto;
import model.Venda;

public class ControllerPanelVenda {
	Frame frame;
	PanelHome panelHome;
	PanelVendas panelVenda;
	PanelCadastroVenda panelCadastroVenda;
	PanelListaVenda panelListaVenda;
	ControllerDados contollerDados;
	ValidacaoTextField validacao;
	ArrayList<Venda> vendas;
	ArrayList<Produto> produtos;
	double valor = 0;
	String valorStg = "";
	
	public ControllerPanelVenda( Frame frame, PanelHome panelhome, PanelVendas panelVendas) {
		this.frame = frame;
		this.panelVenda = panelVendas;
		this.panelHome = panelhome;
		panelCadastroVenda= new PanelCadastroVenda();
		iniciarComboBox();
		acaoButon();
		salvarDados();
	}
	void iniciarComboBox(){
		String msg = "Selecione";
		
		//Inicia o comboBox produto
		this.panelCadastroVenda.getComboBoxProdutos();
		this.panelCadastroVenda.getComboBoxProdutos().removeAllItems();
		//this.panelCadastroVenda.getComboBoxProdutos().setEnabled(false);
        this.panelCadastroVenda.getComboBoxProdutos().addItem(msg);

        new Thread(()->{
            List<Produto> dados = ControllerDados.lerProdutos();
            
            for(Produto produto: dados){ 
            	this.panelCadastroVenda.getComboBoxProdutos().addItem(produto.getNome());
            }
            //this.panelCadastroVenda.getComboBoxProdutos().setEnabled(true);
        }).start();
        
      //Inicia o comboBox Clientes
  		this.panelCadastroVenda.getComboBoxNomeCliente();
  		this.panelCadastroVenda.getComboBoxNomeCliente().removeAllItems();
  		//this.panelCadastroVenda.getComboBoxProdutos().setEnabled(false);
          this.panelCadastroVenda.getComboBoxNomeCliente().addItem(msg);

          new Thread(()->{
              List<Cliente> dadosCliente = ControllerDados.lerCliente();
              for(Cliente cliente: dadosCliente){ 
              	this.panelCadastroVenda.getComboBoxNomeCliente().addItem(cliente.getNome());
              }
              //this.panelCadastroVenda.getComboBoxProdutos().setEnabled(true);
          }).start();
        
        
	}
	private void salvarDados() {
		
		//panelCadastroVenda.getFormattedTextFieldquantidade().getDocument().add
		panelCadastroVenda.getFormattedTextFieldquantidade().getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("testupI");
				valorStg = retornarValor();
				panelCadastroVenda.getFormattedTextFieldValor().setText(valorStg);
				frame.revalidate();
				frame.repaint();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				
			}
		});
		
		panelCadastroVenda.getBtnSalvar().addActionListener((ActionEvent e)->{	
			
			//verifica o comboBox Cliente
			if(panelCadastroVenda.getComboBoxNomeCliente().getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null,"Selecione um Cliente");
				return;
			}
			//verifica o comboBox Produto
			if(panelCadastroVenda.getComboBoxProdutos().getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null,"Selecione um produto");
				return;
			}
			//verifica o campo quantidade
			if(!ValidacaoTextField.verificaInteiro(this.panelCadastroVenda.getFormattedTextFieldquantidade().getText(), "Quantidade")) {
				return;
			}
			//verifica o comboBox Forma de pagamento
			if(panelCadastroVenda.getComboBoxFormaPagamento().getSelectedIndex() == 0) {
				JOptionPane.showMessageDialog(null,"Selecione uma forma de pagamento");
				return;
			}
			
			
			Venda itemVenda = new Venda(this.panelCadastroVenda.getComboBoxNomeCliente().getSelectedItem().toString(),
					this.panelCadastroVenda.getComboBoxProdutos().getSelectedItem().toString(),
					this.panelCadastroVenda.getFormattedTextFieldquantidade().getText(),
					this.panelCadastroVenda.getComboBoxFormaPagamento().getSelectedItem().toString(),
					valorStg);
			
			ControllerDados.salvarUmaVenda(itemVenda);
			JOptionPane.showMessageDialog(null,"Venda Realizada!");
			this.panelCadastroVenda.getComboBoxNomeCliente().setSelectedIndex(0);
			this.panelCadastroVenda.getComboBoxProdutos().setSelectedIndex(0);
			this.panelCadastroVenda.getFormattedTextFieldquantidade().setText("");
			this.panelCadastroVenda.getComboBoxFormaPagamento().setSelectedIndex(0);
			
			
		});
	}

	private void acaoButon() {
		
		panelVenda.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		
		panelVenda.getBtnCadastroVenda().addActionListener((ActionEvent e)->{
			iniciarComboBox();
			frame.setContentPane(panelCadastroVenda);
		});
		panelCadastroVenda.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelVenda);
		});
		
		
		panelVenda.getBtnRegistroVendas().addActionListener((ActionEvent e)->{
			panelListaVenda = new PanelListaVenda();
			
			panelListaVenda.getBtnVoltar().addActionListener((ActionEvent r)->{
				frame.setContentPane(panelVenda);
			});
			
			panelListaVenda.getScrollPane().setViewportView(panelListaVenda.getPanelContainer(ControllerDados.lerVendas()));
			frame.setContentPane(panelListaVenda);
			
		});
	}
	
	public String retornarValor() {
		//pega peço do produto
		List<Produto> listaProdutos = ControllerDados.lerProdutos();
		String valorStg1 = "";
		for(Produto produto: listaProdutos) {
			if(produto.getNome().equals(this.panelCadastroVenda.getComboBoxProdutos().getSelectedItem().toString())) {
				double valorItem = Double.parseDouble(produto.getPrecoVenda());
				double qtd = Integer.parseInt(this.panelCadastroVenda.getFormattedTextFieldquantidade().getText());
				
				valor = valorItem * qtd;
				valorStg1 = valor+"";
				
				//System.out.println("valorStg: "+ valorStg1);
				
			}
		}
		return valorStg1;
		
	}
	
}
