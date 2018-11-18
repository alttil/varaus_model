package model;

public class Vuosi {
	
	private int vuosi_id, vuosinro;

	public Vuosi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vuosi(int vuosi_id, int vuosinro) {
		super();
		this.vuosi_id = vuosi_id;
		this.vuosinro = vuosinro;
	}

	public int getVuosi_id() {
		return vuosi_id;
	}

	public void setVuosi_id(int vuosi_id) {
		this.vuosi_id = vuosi_id;
	}

	public int getVuosinro() {
		return vuosinro;
	}

	public void setVuosinro(int vuosinro) {
		this.vuosinro = vuosinro;
	}

	@Override
	public String toString() {
		return "Vuosi [vuosi_id=" + vuosi_id + ", vuosinro=" + vuosinro + "]";
	}

}
