package com.singasutera.model;

public abstract class BidangTanah {
	private int panjang;
	private int lebar;
	
	public abstract int getLuas();
	
	public abstract int getKeliling();
	
	public BidangTanah() {
	
	}
	
	public BidangTanah(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	public int getPanjang() {
		return panjang;
	}
	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}
	public int getLebar() {
		return lebar;
	}
	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
	
	
}
