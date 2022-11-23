package com.fiap.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollections {

	public static void main(String[] args) {
		
		
//		ArrayList carrinho = new ArrayList();
//		double valor=10.55;
//		int valor2=1;
//		int valor3;
//		
//		carrinho.add(valor);
//		carrinho.add("Uva");
//		carrinho.add(valor2);
//		
//		System.out.println(carrinho.get(1));
//		
//		valor3 = (int) carrinho.get(2);
//		System.out.println(valor3);
		
		//interface list e uso de generics
		//generics nao permite tipos primitivos
		
		List<String> carrinho = new ArrayList<String>();
		System.out.println(carrinho.isEmpty());
		
		carrinho.add("Maçã");
		carrinho.add("Morango");
		carrinho.add("Maçã");
		carrinho.set(1, "Pera");
		
		System.out.println(carrinho.isEmpty());
		System.out.println(carrinho.size());
		
		System.out.println("####################################################");
		
		System.out.println(carrinho.contains("Maçã"));
		System.out.println(carrinho.indexOf("Maçã"));
		System.out.println(carrinho.get(carrinho.indexOf("Maçã")));
		System.out.println(carrinho.lastIndexOf("Maçã"));
		
		carrinho.remove(carrinho.indexOf("Maçã"));
		System.out.println(carrinho.get(0));
		
		carrinho.clear();
		System.out.println(carrinho.isEmpty());
		
		System.out.println("##########HashSet##########");
		Set<String> cesta = new HashSet<String>();
		System.out.println(cesta.isEmpty());
		cesta.add("Maçã");
		cesta.add("Maçã");
		cesta.add("maçã");
		System.out.println(cesta.isEmpty());
		System.out.println(cesta.size());
		System.out.println(cesta);

		System.out.println("##########HashMap##########");
		
		Map<String,String> caixa=new HashMap<String, String>();
		caixa.put("M2225", "Fernando");
		caixa.put("M2226", "Maria");
		caixa.put("M2227", "Soraya");
		System.out.println(caixa.isEmpty());
		System.out.println(caixa.size());
		System.out.println(caixa.containsKey("M2225"));
		System.out.println(caixa.containsValue("Fernando"));
		System.out.println(caixa);
	}

}
