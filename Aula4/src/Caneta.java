
public class Caneta {
	
	private String modelo;
	private String cor;
	private double ponta;
	
	
	public Caneta(String m, String c, Double p) {
		this.setModelo(m);
		this.setCor(c);
		this.setPonta(p);
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setCor(String c) {
		this.cor = c;		
	}
	
	public String getCor() {
		return this.cor;		
	}
	
	public void setPonta(Double p) {
		this.ponta = p;
	}
	
	public double getPonta() {
		return this.ponta;
	}
	
	public void status() {
		System.out.println("MODELO = "+ this.getModelo());
		System.out.println("COR = "+ this.getCor());
		System.out.println("PONTA = "+ this.getCor());
	}
	
}
