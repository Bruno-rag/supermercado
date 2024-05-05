package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;

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
	ControllerPanelCliente controllerPanelCliente;
	ControllerPanelVenda controllerPanelVenda;

	public JButton btnFinacas;

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
		controllerPanelCliente = new ControllerPanelCliente(frame,panelHome,panelCliente);
		controllerPanelVenda = new ControllerPanelVenda(frame,panelHome,panelVendas);
		frame.setContentPane(panelHome);
		
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
			//frame.setContentPane(panelFinaca);
			btnFinacas.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					btnFinacas.showMessageDialog("Mensagem de Exemplo", "Título da Mensagem", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		});
		
		////////////////btnVOLTAR///////
		
		panelFinaca.getBtnVoltar().addActionListener((ActionEvent e)->{
			frame.setContentPane(panelHome);
		});	
		
		
		
	}
	
}
