package com.executante;

import com.tiposcontas.*;


public class Main {
	public static void main(String[] args) {
		ContasCorrente gui = new ContasCorrente("Luiz Guilherme");
		ContaPoupança guipp = new ContaPoupança("Guilherme");
		gui.depositarDin(100);
		gui.transfBanco(100, guipp);
		gui.extratoBanco();
		//guipp.extratoBanco();
	}
}
