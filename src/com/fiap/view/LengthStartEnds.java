package com.fiap.view;

public class LengthStartEnds {

	public static void main(String[]args) {
		
		String descricao=new String("Maçã Gala, a mais doce do mercado!");
		System.out.println(descricao.length());
		
		System.out.println(descricao.startsWith("Maçã"));
		System.out.println(descricao.endsWith("!"));
		
		System.out.println(descricao.charAt(1));
		
		System.out.println(descricao.indexOf("G"));
		System.out.println(descricao.indexOf("Gala"));
		
		System.out.println(descricao.indexOf("a"));
		System.out.println(descricao.lastIndexOf("a"));
		
	}
	
}
