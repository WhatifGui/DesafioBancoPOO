
public class Caneta {

	private String modelo;
	private double ponta;
	private int carga;
	
	
	public Caneta(String m, double p, int c) {
		this.setModelo(m);
		this.setPonta(p);
		this.setCarga(c);
	}
	
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setPonta(double p) {
		this.ponta = p;
	}
	
	public double getPonta() {
		return this.ponta;
	}
	
	public void setCarga(int c) {
		this.carga = c;
	}
	public int carga() {
		return this.carga;
	}
	public void status() {
		System.out.println("MODELO = "+ this.modelo);
		System.out.println("PONTA = "+ this.ponta);
		System.out.println("CARGA = "+ this.carga);
		
	}
	
}
