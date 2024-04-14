package model;

public class Produto {
	String nome;
	String tipo;
	String fab;
	String val;
	String precoVenda;
	String precoCompra;
	String quantidade;
	
	public Produto(String nome, String tipo, String fab, String val, String precoVenda, String precoCompra,String quantidade) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.fab = fab;
		this.val = val;
		this.precoVenda = precoVenda;
		this.precoCompra = precoCompra;
		this.quantidade = quantidade;
	}

	public String getNome() {
		if(nome == null) {
			this.nome = "";
		}
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		if(tipo == null) {
			this.tipo = "";
		}
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFab() {
		if(fab == null) {
			this.fab = "";
		}
		return fab;
	}

	public void setFab(String fab) {
		this.fab = fab;
	}

	public String getVal() {
		if(val == null) {
			this.val = "";
		}
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	public String getPrecoVenda() {
		if(precoVenda == null) {
			this.precoVenda = "";
		}
		return precoVenda;
	}

	public void setPrecoVenda(String precoVenda) {
		this.precoVenda = precoVenda;
	}

	public String getPrecoCompra() {
		if(precoCompra == null) {
			this.precoCompra = "";
		}
		return precoCompra;
	}

	public void setPrecoCompra(String precoCompra) {
		this.precoCompra = precoCompra;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	
}
