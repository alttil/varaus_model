package model;

public class Laji {
	private int laji_id, halli_id;
	private String nimi;
	
	public Laji() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Laji(int laji_id, int halli_id, String nimi) {
		super();
		this.laji_id = laji_id;
		this.halli_id = halli_id;
		this.nimi = nimi;
	}

	public int getLaji_id() {
		return laji_id;
	}

	public void setLaji_id(int laji_id) {
		this.laji_id = laji_id;
	}

	public int getHalli_id() {
		return halli_id;
	}

	public void setHalli_id(int halli_id) {
		this.halli_id = halli_id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	@Override
	public String toString() {
		return "Laji [laji_id=" + laji_id + ", halli_id=" + halli_id
				+ ", nimi=" + nimi + "]";
	}
	
}


