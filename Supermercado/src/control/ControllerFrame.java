package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Frame;
import view.PanelCliente;
import view.PanelHome;
import view.PanelProduto;
import view.PanelVendas;

public class ControllerFrame {
	
	Frame frame;
	PanelHome panelHome;
	PanelCliente panelCliente;
	PanelProduto panelProduto;
	PanelVendas panelVendas;
	
	
	public ControllerFrame() {
		
		frame = new Frame();
		panelProduto = new PanelProduto();
		panelHome = new PanelHome();
		panelVendas = new PanelVendas();
		panelCliente = new PanelCliente();
		
		frame.setContentPane(panelHome);
		
		panelHome.getBtnProduto().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelProduto);
			//panelProduto.setVisible(true);
			
		});
		
		panelHome.getBtnVendas().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelVendas);
			
		});
		panelHome.getBtnClientes().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			frame.setContentPane(panelCliente);
			
		});
		panelHome.getBtnFinacas().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			
		});
		panelHome.getBtnEstoque().addActionListener( (ActionEvent e)->{
			//System.out.println("click");
			
		});
		
		panelProduto.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		panelVendas.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});
		
		
	}
	
}
