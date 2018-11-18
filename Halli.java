package model;

public class Halli {
	private int halli_id;
	private String nimi, osoite;
	private String sahkoposti, puhelin;
	public Halli() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Halli(int halli_id, String nimi, 
			String osoite, String sahkoposti,
			String puhelin) {
		super();
		this.halli_id = halli_id;
		this.nimi = nimi;
		this.osoite = osoite;
		this.sahkoposti = sahkoposti;
		this.puhelin = puhelin;
		
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
	
	public String getOsoite() {
		return osoite;
	}
	public void setOsoite(String osoite) {
		this.osoite = osoite;
	}
	
	public String getSahkoposti() {
		return sahkoposti;
	}
	public void setSahkoposti(String sahkoposti) {
		this.sahkoposti = sahkoposti;
	}
	
	public String getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	
	@Override
	public String toString() {
		return "Halli [halli_id=" + halli_id 
				+ ", nimi=" + nimi + ", osoite=" + osoite +  ", sahkoposti=" + sahkoposti + ", puhelin=" + puhelin + "]";
	}
	
}


