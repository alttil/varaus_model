package model;

public class Kuukausi {
	
	private int kuukausi_id, kuukausinro;

	public Kuukausi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kuukausi(int kuukausi_id, int kuukausinro) {
		super();
		this.kuukausi_id = kuukausi_id;
		this.kuukausinro = kuukausinro;
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

	@Override
	public String toString() {
		return "Kuukausi [kuukausi_id=" + kuukausi_id + ", kuukausinro=" + kuukausinro + "]";
	}

}
