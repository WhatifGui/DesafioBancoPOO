
public class Caneta {
	
	String modelo;
	public String Cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;
	
	void status(){
		System.out.println("MODELO:"+ this.modelo);
		System.out.println("COR:"+ this.Cor);
		System.out.println("PONTA: "+ this.ponta);
		System.out.println("TAMPADA: "+this.tampada);
		
	}
	public void rabiscar(){
		if(this.tampada == true) {
			System.out.println("ERRO! Não posso rabiscar");
		}
		else {
			System.out.println("Rabisco");
		}
	}
	void tampar(){
		this.tampada = true;
		
	}
	void destampar() {
		this.tampada = false;	
	}
}
