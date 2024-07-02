package control;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import org.mariadb.jdbc.Connection;

import model.Cliente;
import model.ClienteDAO;
import model.DAO;
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
	ControllerPanelFinaca controllerPanelFinaca;
	
	DAO dao = new DAO();
	ClienteDAO clienteDao = new ClienteDAO();	
	private Connection con;
	
	ArrayList<Cliente> clientes;
	
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
		controllerPanelFinaca = new ControllerPanelFinaca(frame,panelHome,panelFinaca);
		
		frame.setContentPane(panelHome);
		
		panelHome.getBtnVendas().addActionListener( (ActionEvent e)->{
			frame.setContentPane(panelVendas);
			
		});
		panelHome.getBtnClientes().addActionListener( (ActionEvent e)->{
			frame.setContentPane(panelCliente);
			
		});
		//status();
		
		//clientes = ClienteDAO.select();
		//JOptionPane.showMessageDialog(null, "test1");
		
	}
	
	private void status() {
		try {
			con = (Connection) dao.conectar();
			if (con == null) {
				JOptionPane.showMessageDialog(null, "Erro de Coneção");
			} else {
				JOptionPane.showMessageDialog(null, "Banco de dados conectao");
			}
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
}
