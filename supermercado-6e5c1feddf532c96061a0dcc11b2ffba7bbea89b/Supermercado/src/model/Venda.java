package model;

public class Venda {

	String nome;
	String produtos;
	String quatidade;
	String formaPagemanto;
	String valorVenda;
	
	public Venda(String nome, String produtos, String quatidade, String formaPagemanto, String valor) {
		super();
		this.nome = nome;
		this.produtos = produtos;
		this.quatidade = quatidade;
		this.formaPagemanto = formaPagemanto;
		this.valorVenda = valor;
	}
	
	public String getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(String valorVenda) {
		this.valorVenda = valorVenda;
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
