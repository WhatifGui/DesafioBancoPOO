
public class Boss {
	
	String nome;
	String raca;
	int hp;
	int dano;
	boolean kill;
	
	
	void atacar() {
		System.out.println("Toma este dano: " + this.dano);
	}
	void status() {
		System.out.println("NOME:"+ this.nome);
		System.out.println("RAÇA:"+ this.raca);
		System.out.println("HP: "+ this.hp);
	}
	
	void gritar() {
		if(hp > 0) {
			System.out.println("Ghrreaaaaaaaa! Vocês entraram no salão do boss errado");
		}
		else {
			System.out.println("MORTO NÃO FALA!");
		}
	}
	
	void kill() {
		
		this.hp = 0;
		System.out.println("COVARDE! Usando o sistema para passar de fase rapida!");
	}
	
	void vivo() {
		if (hp > 0) {
			System.out.println("Eu estou vivo! vai encarar?");
		}
		else {
			System.out.println("BOSS MORTO!");
		}
		
		
	}
}
