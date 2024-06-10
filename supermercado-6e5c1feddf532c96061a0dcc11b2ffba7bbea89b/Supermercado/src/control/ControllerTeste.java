package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControllerTeste {
	
	//ControllerPanelCliente con = new ControllerPanelCliente(null, null, null);
	@Test
	void testNome() {
		
		boolean dado = ValidacaoTextField.verificaNome("joão",""); 
		assertEquals(true, dado);
		boolean dado2 = ValidacaoTextField.verificaNome("jo",""); 
		assertEquals(false, dado2);
		boolean dado3 = ValidacaoTextField.verificaNome("jooooooooooooooooooooooooooooooooooooooooooooooooooão", ""); 
		assertEquals(false, dado3);
	}
	
	
	@Test
	void testDouble() {
		
		boolean dado = ValidacaoTextField.verificaDouble("10.0","teste"); 
		assertEquals(true, dado);
		boolean dado2 = ValidacaoTextField.verificaDouble("nome","teste"); 
		assertEquals(false, dado2);
		boolean dado3 = ValidacaoTextField.verificaDouble("-20","teste"); 
		assertEquals(false, dado3);
		
	}
	
	@Test
	void testInteiro() {
		
		boolean dado = ValidacaoTextField.verificaInteiro("10","teste"); 
		assertEquals(true, dado);
		boolean dado2 = ValidacaoTextField.verificaInteiro("nome","teste"); 
		assertEquals(false, dado2);
		boolean dado3 = ValidacaoTextField.verificaInteiro("-20","teste"); 
		assertEquals(false, dado3);
		
	}
	@Test
	void testCpf() {
		
		boolean dado = ValidacaoTextField.verificaCpf("123.456.789-09"); 
		assertEquals(true, dado);
		boolean dado2 = ValidacaoTextField.verificaCpf("123.456.789-"); 
		assertEquals(false, dado2);
		boolean dado3 = ValidacaoTextField.verificaCpf("12345678909"); 
		assertEquals(true, dado3);
	}
	@Test
	void testRg() {
		
		boolean dado = ValidacaoTextField.verificaRg("23.456.789-09"); 
		assertEquals(true, dado);
		boolean dado2 = ValidacaoTextField.verificaRg("23.456.789-"); 
		assertEquals(false, dado2);
		boolean dado3 = ValidacaoTextField.verificaRg("2345678909"); 
		assertEquals(true, dado3);
	}
	@Test
	void testdata() {
		
		boolean dado = ValidacaoTextField.verificaData("12/10/2024"); 
		assertEquals(true, dado);
		boolean dado2 = ValidacaoTextField.verificaData("12/10/202"); 
		assertEquals(false, dado2);
		boolean dado3 = ValidacaoTextField.verificaData("12102024"); 
		assertEquals(false, dado3);
	}
	
}
