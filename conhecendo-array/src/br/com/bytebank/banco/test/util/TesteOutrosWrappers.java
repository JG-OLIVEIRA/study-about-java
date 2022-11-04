package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.doubleValue()); //unboxing
		
		Double dRef = Double.valueOf(3.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		
		Number refNumero = Float.valueOf(29.9f);
		System.out.println(refNumero);
		
		List<Number> lista = new ArrayList<>();
		
		lista.add(20);
	}
}
