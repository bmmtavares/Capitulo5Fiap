package com.fiap.entity;

public class Produto {
	String nome;
	String descricao;
	float valor;
	
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Produto [nome="+nome+",descrição="+descricao+",valor="+valor+"]";
	}	
	
}
