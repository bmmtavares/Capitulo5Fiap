package com.fiap.view;

import com.fiap.entity.Produto;

public class Caixa {
	public static void main (String[] args) {
		int qtdProdutos=5;
		int registro=0;
		
		/*
		 * while(registro < qtdProdutos) { registro++;
		 * System.out.println("O produto numero "+registro+" foi registrado"); }
		 */
		
//		do {
//			registro++;
//			System.out.println("O caixa registrou o produto "+registro);
//		} while(registro < qtdProdutos);
		
		for(int i=1; i<=qtdProdutos; i++) {
			System.out.println("O caixa registrou o produto "+i);
		}
		
		float[] valores = new float[5];
		valores[0]=10;
		valores[1]=20;
		valores[2]=30;
		valores[3]=40;
		//valores[4]=50;
		System.out.println(valores[4]);
		
		float[] valores2= {10,20,30,40,50};
		float[] valores3=new float[] {10,20,30,40,50};
		System.out.println(valores2[4]);
		System.out.println(valores3[4]);
		
		Produto[] produtos = new Produto[2];
		
		Produto prod1 = new Produto();
		prod1.setNome("Lim�o");
		prod1.setDescricao("Galego");
		prod1.setValor(4);
		
		Produto prod2 = new Produto();
		prod2.setNome("Ma��");
		prod2.setDescricao("Gala");
		prod2.setValor(5);
		
		produtos[0]=prod1;
		produtos[1]=prod2;
		
//		for(int i=0; i<produtos.length;i++) {
//			System.out.println(produtos[i].toString());
//		}
		
		for(Produto prod:produtos) {
			System.out.println(prod.toString());
		}
		
		//10 corredores com 3 pratelerias cada
		Produto[][] localizacaoProduto = new Produto[10][3];
		
		localizacaoProduto[0][1]=prod1;
		localizacaoProduto[1][1]=prod2;
		
		System.out.println(localizacaoProduto[0][1].getNome());
	}
}
