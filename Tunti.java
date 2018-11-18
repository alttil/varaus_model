package model;

import java.sql.Time;

public class Tunti {
	private int tunti_id;
	private Time alkuaika, loppuaika;
	
	public Tunti() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tunti(int tunti_id, Time alkuaika, Time loppuaika) {
		super();
		this.tunti_id = tunti_id;
		this.alkuaika = alkuaika;
		this.loppuaika = loppuaika;
	}

	public int getTunti_id() {
		return tunti_id;
	}

	public void setTunti_id(int tunti_id) {
		this.tunti_id = tunti_id;
	}

	public Time getAlkuaika() {
		return alkuaika;
	}

	public void setAlkuaika(Time alkuaika) {
		this.alkuaika = alkuaika;
	}

	public Time getLoppuaika() {
		return loppuaika;
	}

	public void setLoppuaika(Time loppuaika) {
		this.loppuaika = loppuaika;
	}
	
	@Override
	public String toString() {
		return "Tunti [tunti_id=" + tunti_id + ", alkuaika=" + alkuaika
				+ ", loppuaika=" + loppuaika + "]";
	}
	
}
