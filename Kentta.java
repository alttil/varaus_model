package model;

public class Kentta {
	private int kentta_id, halli_id;

	public Kentta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kentta(int kentta_id, int halli_id) {
		super();
		this.kentta_id = kentta_id;
		this.halli_id = halli_id;
	}

	public int getKentta_id() {
		return kentta_id;
	}

	public void setKentta_id(int kentta_id) {
		this.kentta_id = kentta_id;
	}

	public int getHalli_id() {
		return halli_id;
	}

	public void setHalli_id(int halli_id) {
		this.halli_id = halli_id;
	}
	@Override
	public String toString() {
		return "Laji [kentta_id=" + kentta_id + ", halli_id=" + halli_id
				+ "]";
	}
}
