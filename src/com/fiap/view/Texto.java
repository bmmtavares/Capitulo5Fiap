package com.fiap.view;

public class Texto {
	
	public static void main(String[] args) {
		String nome;
		nome=new String();
		nome="maçã";
		System.out.println(nome);
		
		String nome2=new String("maçã");
		System.out.println(nome2);
		
		String nome3="maçã";
		System.out.println(nome3);
		
//		String nome4=null;
//		System.out.println(nome4.length());
		
		String descricao="Tipo Gala \nA maçã mais doce do mercado";
		System.out.println(descricao);
		
		descricao="Tipo Gala \tA maçã mais doce do mercado";
		System.out.println(descricao);
		
		descricao="Tipo Gala \"A maçã mais doce do mercado\"";
		System.out.println(descricao);
		
		String propaganda = nome+" "+descricao;
		System.out.println(propaganda);
		
		
		propaganda=nome.concat(" - ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda +="!";
		System.out.println(propaganda);
	}

}
