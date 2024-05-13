public class Caneta {
	
	
	
	private String marca;
	private double ponta;
	private int carga;
	
	
	public Caneta(String m, double p, int c) {
		this.setMarca(m);
		this.setPonta(p);
		this.setCarga(c);
	};
	
	
	public void setMarca(String m) {
		this.marca = m;
	};
	
	public String getMarca() {
		return this.marca;
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
	
	public int getCarga() {
		return this.carga;
	}
	
	public void status() {
		System.out.println("Marca = "+ this.marca );
		System.out.println("Ponta = "+ this.ponta);
		System.out.println("Carga = "+ this.carga );
		
	}
	
}