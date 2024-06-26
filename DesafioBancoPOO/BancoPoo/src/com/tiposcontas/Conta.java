package com.tiposcontas;

import java.util.Scanner;

public abstract class Conta implements IConta {
	//ATRIBUTO
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 11111111;
	
	private String nome;
	protected int agencia;
	protected String numero;
	protected double saldo;
	
	// CONSTRUCTOR
	public Conta(String nome) {	
		this.agencia = AGENCIA_PADRAO;
		SEQUENCIAL++;
		this.numero = String.valueOf(SEQUENCIAL);
		this.saldo = 0;
		this.nome = nome;
	}
	
	// SCANNER
	
	Scanner leitor = new Scanner(System.in);
	
	// MÉTODOS
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacarDin(double newSaque) {
		
		if(this.getSaldo() >= newSaque ) {
			this.setSaldo(this.getSaldo() - newSaque);
			System.out.println("SAQUE REALIZADO. "+ newSaque);
		}
		else {
			System.out.println("SALDO INSUFICIENTE");
		}
	};
	public void depositarDin(double newDeposito) {
		this.setSaldo(this.getSaldo() + newDeposito);
		System.out.println("Saldo atual: "+ this.getSaldo());
	};
	public void extratoBanco() {
		System.out.println(this.getSaldo());
	};
	public void transfBanco(double newTransf, Conta contaDestino) {
		
		 try {
	            
	        	
	        	verificarNumeroConta(numero);
	            if(numero.length() == 8){
	            System.out.println("Numero de conta valido.");}
	            System.out.println(" ");
	            
	      
	            if(this.getSaldo() >= newTransf) {
	            	this.setSaldo(this.getSaldo() - newTransf);
	            	contaDestino.depositarDin(newTransf);
	            }
	            else {
	            	System.out.println("Saldo insuficiente.");
	            }
	        } catch (IllegalArgumentException exception) {
	            // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
	            System.out.println("Erro: Numero de conta inválido. Digite exatamente 8 digitos.");
	        } finally {
	            // Fechar o scanner para evitar vazamentos de recursos
	            leitor.close();
	        }
	};	
	
    private static void verificarNumeroConta(String numero) throws IllegalArgumentException {
        if (numero.length() != 8) {
            throw new IllegalArgumentException();// TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
        };
    }
}
