package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class ValidacaoTextField {
	
	public ValidacaoTextField() {
		
	}
	
	public static boolean verificaNome(String nome, String msg) {
		
		//"[A-Za-z0-9 ]{3,20}"
		if (!nome.matches("^[A-Z a-z¡-‹·-¸Á«Á]+(\s[A-Z a-z¡-‹·-¸Á«Á]+)*$") || nome.length()<=3 || nome.length() >=20){
		  // Exibe mensagem de erro para o usu·rio
			JOptionPane.showMessageDialog(null,msg +" inv·lido (3 a 20 caracteres,somente letras).");
		  return false; 
		}
		return true;
	}
	
	public static boolean verificaCpf(String dado) {

			  if (!dado.matches("([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})")) {
			    // Exibe mensagem de erro para o usu·rio
				  JOptionPane.showMessageDialog(null,"CPF inv·lido(Digite o CPF Completo)");
			    return false; 
			  }
		return true;
	}
	public static boolean verificaRg(String dado) {
	
			  if (!dado.matches("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})")) {
			    // Exibe mensagem de erro para o usu·rio
				  JOptionPane.showMessageDialog(null,"RG inv·lido(Digite o RG Completo)");
			    return false; 
			  }
		return true;
	}
	
	public static boolean verificaData(String dado) {
		if (!dado.matches("[0-9]{2}[\\/]{1}[0-9]{2}[\\/]{1}[0-9]{4}")) {
		
			  JOptionPane.showMessageDialog(null,"Data inv·lido(Digite data valida)");
		    return false; 
		  }
		  
		return true;
	}
	
	public static boolean verificaDouble(String dado, String msg) {	
		try {
			  double numDouble = Double.parseDouble(dado);
			  if (numDouble <= 0.0) {
			  
				  JOptionPane.showMessageDialog(null,msg +" inv·lido (deve ser maior que zero).");
			    return false; 
			  }
			} catch (NumberFormatException r) {
			  // Exibe mensagem de erro para o usu·rio
				JOptionPane.showMessageDialog(null,msg +" inv·lido (formato incorreto).");
			  return false; 
			}
		return true;
	}
	
	public static boolean verificaInteiro(String dado, String msg) {
	
		try {
			  int qtdInt = Integer.parseInt(dado);
			  if (qtdInt<= 0) {
			  
				  JOptionPane.showMessageDialog(null,msg +" inv·lida (deve ser maior que zero).");
			    return false; 
			  }
			} catch (NumberFormatException r) {
				//Exibe mensagem de erro para o usu·rio
				JOptionPane.showMessageDialog(null,msg +" inv·lido(formato incorreto).");
				return false; // Interrompe o salvamento
			}
		return true;
	}
	
	public static boolean CompararNumeroMaior(String num1 , String num2) {
			double num1Double = Double.parseDouble(num1);
			double num2Double = Double.parseDouble(num2);
		  if (num1Double <= num2Double) {
		    // Exibe mensagem de erro para o usu·rio
			  JOptionPane.showMessageDialog(null,"PreÁo de venda n„o pode ser menor ou igual ao o PreÁo de compra");
		    return false; 
		  }
	return true;
}
}
