package com.fiap.view;

public class Comparacao {
	
	public static void main(String args[]) {
	String nome=new String("ma��");
	String nome2=new String("Ma��");
	String nome3=new String("ma��");

	System.out.println(nome.equals(nome2));
	System.out.println(nome.equalsIgnoreCase(nome2));
	System.out.println(nome.equals(nome3));
	
	
	boolean teste = (nome == nome3);
	System.out.println(teste);
	
	String nome4="ma��";
	String nome5="ma��";
	
	teste=(nome4==nome5);
	System.out.println(teste);
	
	
	}	
}
