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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selecionarMusica() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		
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
	
	
}
