package model;

public class Cliente {

	String nome;
	String cpf;
	String rg;
	String dataNasc;
	String limiteCredit;
	
	public Cliente(String nome, String cpf, String rg, String dataNasc, String limiteCredit) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.limiteCredit = limiteCredit;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getLimiteCredit() {
		return limiteCredit;
	}

	public void setLimiteCredit(String limiteCredit) {
		this.limiteCredit = limiteCredit;
	}
	
	
	
}
