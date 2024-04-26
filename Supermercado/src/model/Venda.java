package model;

public class Venda {

	String nome;
	String produtos;
	String quatidade;
	String formaPagemanto;
	
	public Venda(String nome, String produtos, String quatidade, String formaPagemanto) {
		super();
		this.nome = nome;
		this.produtos = produtos;
		this.quatidade = quatidade;
		this.formaPagemanto = formaPagemanto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public String getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(String quatidade) {
		this.quatidade = quatidade;
	}

	public String getFormaPagemanto() {
		return formaPagemanto;
	}

	public void setFormaPagemanto(String formaPagemanto) {
		this.formaPagemanto = formaPagemanto;
	}

}
