package com;

import java.io.File;

public class TFile {

	public static void test(String[] args) {
		File f = new File("D:\\Coating\\product");
		System.out.println(f.isDirectory());
		
		String[] fileName = f.list();
		for(String name : fileName){
			
			System.out.println(name);	
		}
	}
	
}
