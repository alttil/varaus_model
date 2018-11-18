package model;

public class Paiva {
	
	private int paiva_id, paivanro;

	public Paiva() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paiva(int paiva_id, int paivanro) {
		super();
		this.paiva_id = paiva_id;
		this.paivanro = paivanro;
	}

	public int getPaiva_id() {
		return paiva_id;
	}

	public void setPaiva_id(int paiva_id) {
		this.paiva_id = paiva_id;
	}

	public int getPaivanro() {
		return paivanro;
	}

	public void setPaivanro(int paivanro) {
		this.paivanro = paivanro;
	}

	@Override
	public String toString() {
		return "Paiva [paiva_id=" + paiva_id + ", paivanro=" + paivanro + "]";
	}

}
