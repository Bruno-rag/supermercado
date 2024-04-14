package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Frame;
import view.PanelCadCliente;
import view.PanelCadastroProduto;
import view.PanelCadastroVenda;
import view.PanelCliente;
import view.PanelFinaca;
import view.PanelHome;
import view.PanelProduto;
import view.PanelVendas;

public class ControllerFrame {
	
	Frame frame;
	PanelHome panelHome;
	PanelCliente panelCliente;
	PanelProduto panelProduto;
	PanelVendas panelVendas;
	PanelFinaca panelFinaca;
	PanelCadCliente panelCadCliente;
	PanelCadastroProduto panelCadastroProduto;
	PanelCadastroVenda panelCadastroVenda;
	ControllerPanelProduto controllerPanelProduto;
	
	public ControllerFrame() {
		
		frame = new Frame();
		panelProduto = new PanelProduto();
		panelHome = new PanelHome();
		panelVendas = new PanelVendas();
		panelCliente = new PanelCliente();
		panelFinaca = new PanelFinaca();
		panelCadCliente = new PanelCadCliente();
		panelCadastroProduto = new PanelCadastroProduto();
		panelCadastroVenda = new PanelCadastroVenda();
		controllerPanelProduto = new ControllerPanelProduto(frame,panelHome,panelProduto);
		
		
		frame.setContentPane(panelHome);
		
		panelHome.getBtnVendas().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelVendas);
			
		});
		panelHome.getBtnClientes().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelCliente);
			
		});
		
		panelCliente.getBtnCadCliente().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelCadCliente);
			
		});
		
		panelHome.getBtnFinacas().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelFinaca);
		});
		
		////////////////btnVOLTAR///////
		
		panelVendas.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		
		panelCliente.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		panelCadCliente.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelCliente);
		});
		
		panelFinaca.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});	
		
		
		panelVendas.getBtnCadastroVenda().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelCadastroVenda);
		});
		panelCadastroVenda.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelVendas);
		});
	}
	
}
