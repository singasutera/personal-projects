package com.singasutera.main;

import java.util.Scanner;

import com.singasutera.model.Properti;

public class Main {

	public static void main(String[] args) {
		//CARA 1
		/*
		 * Scanner scan = new Scanner(System.in); Properti propertiBaru = new
		 * Properti();
		 * 
		 * System.out.print("Panjang	:	"); propertiBaru.setPanjang(scan.nextInt());
		 * System.out.print("Lebar	:	"); propertiBaru.setLebar(scan.nextInt());
		 * 
		 * System.out.print("Harga Jual Tanah " + propertiBaru.getPanjang() + " * " +
		 * propertiBaru.getLebar() + " adalah " + propertiBaru.getHargaJual());
		 */
		
		//CARA 2
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Panjang	:	");
		int panjang = scan.nextInt();
		System.out.print("Lebar		:	");
		int lebar = scan.nextInt();
		
		Properti propertiCara2 = new Properti(panjang, lebar);
		
		System.out.println("Harga Jual Tanah " + panjang + " * " + lebar + " adalah " 
				+ propertiCara2.getHargaJual());
	}

}
