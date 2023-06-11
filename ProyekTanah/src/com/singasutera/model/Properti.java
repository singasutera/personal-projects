package com.singasutera.model;

public class Properti extends BidangTanah implements Transaksi {

	//UNTUK CARA2
	public Properti(int panjang, int lebar) {
		this.setPanjang(panjang);
		this.setLebar(lebar);
	}

	@Override
	public int getLuas() {
		return this.getPanjang() * this.getLebar();
	}

	@Override
	public int getKeliling() {
		return 2 * (this.getPanjang() + this.getLebar());
	}
	
	@Override
	public int getHargaJual() {
		return harga_per_meter_persegi * getLuas();
	}
	
	
}
