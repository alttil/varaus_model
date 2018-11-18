package model;

public class Asiakas {
	private int asiakas_id;
	private String etunimi, sukunimi, osoite;
	private String sahkoposti, salasana, puhelin;
	private String nimimerkki;
	public Asiakas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Asiakas(int asiakas_id, int status, String etunimi, String sukunimi,
			String osoite, String sahkoposti,
			String salasana, String puhelin, String nimimerkki) {
		super();
		this.asiakas_id = asiakas_id;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.osoite = osoite;
		this.sahkoposti = sahkoposti;
		this.salasana = salasana;
		this.puhelin = puhelin;
		this.nimimerkki = nimimerkki;
		
	}
	public int getAsiakas_id() {
		return asiakas_id;
	}
	public void setAsiakas_id(int asiakas_id) {
		this.asiakas_id = asiakas_id;
	}
	public String getEtunimi() {
		return etunimi;
	}
	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}
	public String getSukunimi() {
		return sukunimi;
	}
	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
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
	public String getSalasana() {
		return salasana;
	}
	public void setSalasana(String salasana) {
		this.salasana = salasana;
	}
	public String getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	public String getNimimerkki() {
		return nimimerkki;
	}
	public void setNimimerkki(String nimimerkki) {
		this.nimimerkki = nimimerkki;
	}
	
	@Override
	public String toString() {
		return "Asiakas [asiakas_id=" + asiakas_id 
				+ ", etunimi=" + etunimi + ", sukunimi=" + sukunimi
				+ ", osoite=" + osoite +  ", sahkoposti=" + sahkoposti + ", salasana=" + salasana
				+ ", puhelin=" + puhelin + ", nimimerkki=" + nimimerkki + "]";
	}
	
}

