package model;

import java.sql.Time;
import java.util.Date;

public class Varaushalli {
	private int varaus_id, kentta_id, tunti_id, asiakas_id, halli_id, paiva_id, kuukausi_id, kuukausinro, paivanro, vuosi_id, vuosinro;
	private Date paiva;
	private Time alkuaika, loppuaika;
	private String sukunimi, etunimi, nimi, puhelin, nimimerkki;
	public Varaushalli() {
		super();
	}
	public Varaushalli(int varaus_id, int kentta_id, int tunti_id, int asiakas_id, int halli_id, int paiva_id, int kuukausi_id, int kuukausinro, int paivanro, int vuosi_id, int vuosinro,
			Date paiva, Time alkuaika, Time loppuaika, 
			String etunimi, String sukunimi, String nimi, String puhelin, String nimimerkki) {
		super();
		this.varaus_id = varaus_id;
		this.tunti_id = tunti_id;
		this.paiva = paiva;
		this.kentta_id = kentta_id;
		this.asiakas_id = asiakas_id;
		this.halli_id = halli_id;
		this.paiva_id = paiva_id;
		this.kuukausi_id = kuukausi_id;
		this.paivanro = paivanro;
		this.kuukausinro = kuukausinro;
		this.vuosi_id = vuosi_id;
		this.vuosinro = vuosinro;
		this.alkuaika = alkuaika;
		this.alkuaika = loppuaika;
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.nimi = nimi;
		this.nimimerkki = nimimerkki;
		this.puhelin = puhelin;
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
	public String getPuhelin() {
		return puhelin;
	}
	public void setPuhelin(String puhelin) {
		this.puhelin = puhelin;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getNimimerkki() {
		return nimimerkki;
	}
	public void setNimimerkki(String nimimerkki) {
		this.nimimerkki = nimimerkki;
	}
	public int getVaraus_id() {
		return varaus_id;
	}
	public void setVaraus_id(int varaus_id) {
		this.varaus_id = varaus_id;
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
	public int getKentta_id() {
		return kentta_id;
	}
	public void setKentta_id(int kentta_id) {
		this.kentta_id = kentta_id;
	}
	public int getAsiakas_id() {
		return asiakas_id;
	}
	public void setAsiakas_id(int asiakas_id) {
		this.asiakas_id = asiakas_id;
	}
	public int getHalli_id() {
		return halli_id;
	}
	public void setHalli_id(int halli_id) {
		this.halli_id = halli_id;
	}
	public int getPaiva_id() {
		return paiva_id;
	}
	public void setPaiva_id(int paiva_id) {
		this.paiva_id = paiva_id;
	}
	public int getKuukausi_id() {
		return kuukausi_id;
	}
	public void setKuukausi_id(int kuukausi_id) {
		this.kuukausi_id = kuukausi_id;
	}
	public int getKuukausinro() {
		return kuukausinro;
	}
	public void setKuukausinro(int kuukausinro) {
		this.kuukausinro = kuukausinro;
	}
	public int getPaivanro() {
		return paivanro;
	}
	public void setPaivanro(int paivanro) {
		this.paivanro = paivanro;
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
		return "Varaushalli [varaus_id=" + varaus_id + ", kentta_id=" + kentta_id + ", tunti_id=" + tunti_id
				+ ", asiakas_id=" + asiakas_id + ", halli_id=" + halli_id + ", paiva=" + paiva 
				+ ", alkuaika=" + alkuaika + ", loppuaika=" + loppuaika + ", etunimi=" + etunimi 
				+ ", sukunimi=" + sukunimi + ", nimi=" + nimi + ", nimimerkki=" + nimimerkki + ", puhelin=" + puhelin + "]";
	}
	
}

