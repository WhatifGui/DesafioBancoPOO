package com.tiposcontas;

public interface IConta {
	
	
	
	public void sacarDin(double newSaque);
	public void depositarDin(double newDeposito);
	public void extratoBanco();
	public void transfBanco(double newTransf, Conta contaDestino);
	
}
