package model;

import java.util.Date;

public class Varaus {
	private int kentta_id, tunti_id, asiakas_id;
	private Date paiva;
	public Varaus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Varaus(int kentta_id, int tunti_id, int asiakas_id, Date paiva) {
		super();
		this.kentta_id = kentta_id;
		this.tunti_id = tunti_id;
		this.asiakas_id = asiakas_id;
		this.paiva = paiva;
	}
	public int getKentta_id() {
		return kentta_id;
	}
	public void setKentta_id(int kentta_id) {
		this.kentta_id = kentta_id;
	}
	public int getTunti_id() {
		return tunti_id;
	}
	public void setTunti_id(int tunti_id) {
		this.tunti_id = tunti_id;
	}
	public Date getPaiva() {
		return paiva;
	}
	public void setPaiva(Date paiva) {
		this.paiva = paiva;
	}
	public int getAsiakas_id() {
		return asiakas_id;
	}

	public void setAsiakas_id(int asiakas_id) {
		this.asiakas_id = asiakas_id;
	}

	@Override
	public String toString() {
		return "Varaus [kentta_id=" + kentta_id + ", tunti_id=" + tunti_id + ", asiakas_id=" + asiakas_id + ", paiva=" + paiva + "]";
	}
	
	}
	


