package com.fiap.view;

public class Texto {
	
	public static void main(String[] args) {
		String nome;
		nome=new String();
		nome="ma��";
		System.out.println(nome);
		
		String nome2=new String("ma��");
		System.out.println(nome2);
		
		String nome3="ma��";
		System.out.println(nome3);
		
//		String nome4=null;
//		System.out.println(nome4.length());
		
		String descricao="Tipo Gala \nA ma�� mais doce do mercado";
		System.out.println(descricao);
		
		descricao="Tipo Gala \tA ma�� mais doce do mercado";
		System.out.println(descricao);
		
		descricao="Tipo Gala \"A ma�� mais doce do mercado\"";
		System.out.println(descricao);
		
		String propaganda = nome+" "+descricao;
		System.out.println(propaganda);
		
		
		propaganda=nome.concat(" - ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda +="!";
		System.out.println(propaganda);
	}

}
