package com.gui.aparelho;


import com.gui.aparelhotelefonico.*;
import com.gui.exceptions.*;
import com.gui.navegadorinternet.*;
import com.gui.reprodutormusical.*;
import java.util.Scanner;

public class Iphone implements Telefone, NavegadorInternet, ReprodutorMusical {

	private int varAba;
	private int abaAbertaAnonima;
	private int abaAbertaComum;
	private boolean correioVoz;
	private boolean musicaTocando;
	private String musicasCelular[];
	Scanner leitor = new Scanner(System.in);
	

	
	public void adicionarNovaAba() throws ParametrosExceptions {
		try {
			// MENU DE ADICIONAR ABA
			System.out.println("Deseja abrir uma aba comum ou aba anonima?");
			System.out.println(" ");
			System.out.println("1. Anônima");
			System.out.println("2. Comum");
			this.varAba = leitor.nextInt();
			
			// CHAMANDO A FUNÇÃO PARA APONTAR O ERRO
			testarAba(varAba);
			
			// FLUXO PARA QUAL ABA ABRIR
			if (varAba == 1) {
				System.out.println("ABRINDO ABA ANONIMA.");
				setAbaAbertaAnonima(1);
			}
			else {
				System.out.println("ABRINDO ABA COMUM.");
				setAbaAbertaComum(1);
			}
		} catch (ParametrosExceptions exception) {
			System.out.println("Não foi possivel identificar. Por gentileza selecione no menu o valor 1 ou 2.");
		}
		
		
		
	}
	@Override
	public void atender() {
		int yesOrNot;
		// LAÇO DE ACEITAÇÃO DE LIGAÇÃO.
		do {
		// MENU CHAMADA
		System.out.println("Celular tocando...");
		System.out.println("Deseja atender? ");
		System.out.println(" ");
		System.out.println("1. SIM");
		System.out.println("2. NÃO");
		yesOrNot = leitor.nextInt();}
		while(yesOrNot != 1 && yesOrNot != 2);
		
		// FLUXO DE ACEITAÇÃO CHAMADA
		if(yesOrNot == 1) {
			System.out.println("ATENDENDO LIGAÇÃO.");
		}else {
			System.out.println("LIGAÇÃO RECUSADA.");
			setCorreioVoz(true);
		}
		
	}
	@Override
	public void atualizarPagina() {
		if(abaAbertaComum == 1 && abaAbertaAnonima == 1) {
			System.out.println("ATUALIZANDO A PAGINA");
		}else {
			System.out.println("NÃO HÁ A PAGINAS A SER ATUALIZADA.");
		}
		
	}
	@Override
	public void exibirPagina() {
		if(abaAbertaComum == 1 && abaAbertaAnonima == 1) {
			System.out.println("EXIBINDO PAGINA");
		}else {
			System.out.println("NÃO HÁ A PAGINAS A SER EXIBIDA.");
		}
	}
	@Override
	public void iniciarCorreioVoz() {
		if (correioVoz == true) {
			System.out.println("Inicializando correio de voz.");
		}else {
			System.out.println("Não há correio de voz.");
		}
		
	}
	@Override
	public void ligar() throws ParametrosExceptions {
		try {
			// MENU LIGAÇÃO
			System.out.println("Digite o número");
			String telefone = leitor.nextLine();
			
			// CHAMADA FUNÇÃO VALIDAÇÃO DE NUMEROS
			formatacaoNumero(telefone);
			
		} catch (ParametrosExceptions exception) {
			System.out.println("Quantidade de números errados.");
			System.out.println("Deverá ter 11 numeros. Seguindo o modelo (DD) 9 XXXX-XXXX");
		}
	}
	
	public void pausar() {
		if (musicaTocando == true) {
			System.out.println("MUSICA PAUSADA");
		}else {
			System.out.println("MUSICA INICIADA.");
		}
		
	}
	@Override
	public void selecionarMusica() {
		getMusicasCelular();
		
	}
	@Override
	public void tocar() {
		if (musicasCelular != null) {
			System.out.println("Escolhar uma musica: ");
			int j = 0;
			for (int i = 0; i <= 2; i++) {
				
				System.out.println("Musica "+( j + j++) + musicasCelular[i]);
			}
			System.out.println("Selecione o numero da música: ");
			int option = leitor.nextInt();
			
			switch (option) {
			case 1:
				System.out.println("Tocando Sweet Child Mine.");
				setMusicasTocando();
			case 2: 
				System.out.println("Tocando Eis me aqui");
				setMusicasTocando();
			case 3:
				System.out.println("Rude Cruz");
				setMusicasTocando();
			default:
				System.out.println("NÃO EXISTEM MAIS MÚSICAS");
				break;
			}
		}
		
	}
	
	public static void testarAba(int varAba) throws ParametrosExceptions {
		if (varAba != 1 && varAba != 2) {
			throw new ParametrosExceptions();
		}
	}

	public int getAbaAbertaComum() {
		return abaAbertaComum;
	}

	public void setAbaAbertaComum(int abaAbertaComum) {
		this.abaAbertaComum = abaAbertaComum;
	}
	public int getAbaAbertaAnonima() {
		return abaAbertaAnonima;
	}
	public void setAbaAbertaAnonima(int abaAbertaAnonima) {
		this.abaAbertaAnonima = abaAbertaAnonima;
	}
	public boolean getCorreioVoz() {
		return correioVoz;
	}
	public void setCorreioVoz(boolean correioVoz) {
		this.correioVoz = correioVoz;
	}
	
	public static void formatacaoNumero(String telefone) throws ParametrosExceptions {
		if (telefone.length() != 11) {
			throw new ParametrosExceptions();
		}
	}
	public String[] getMusicasCelular() {
		for(int i = 0;  ;i++) {
			System.out.println("Musica: "+ musicasCelular[i]);
			if(i >= 2) {
				break;
			}
		}
		
		return musicasCelular;
	}
	public void setMusicasCelular() {
		String newMusicas[] = {"Sweet Child Mine", "Eis me aqui", "Rude Cruz"};
		this.musicasCelular = newMusicas;
	}
	
	public void setMusicasTocando() {
		this.musicaTocando = true;
	}
	
	public boolean getMusicasTocando() {
		return musicaTocando;
	}
	
}
