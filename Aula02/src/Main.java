
public class Main {
	public static void main(String[] args) {
		Boss b1 = new Boss();
		
		b1.nome = "Tyron";
		b1.raca = "Dragão";
		b1.hp = 1000;
		b1.dano = 150;
		
		
		Boss b2 = new Boss();
		
		b2.nome = "Zews";
		b2.raca = "Troll";
		b2.hp = 2500;
		b2.dano = 250;
				
		b2.atacar();
		
	}
}
