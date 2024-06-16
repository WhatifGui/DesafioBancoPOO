package com.gui.meuaparelho;

import com.gui.aparelho.*;
import com.gui.exceptions.ParametrosExceptions;

public class IphoneGui {
	public static void main(String[] args) throws ParametrosExceptions {
		Iphone igui = new Iphone();
		
		//igui.adicionarNovaAba(); // TESTE REALIZADO
		// igui.atender(); // TESTE REALIZADO
		// igui.iniciarCorreioVoz(); // TESTE REALIZADO
		igui.atualizarPagina(); //FALHO.
		//igui.setMusicasCelular(); // TESTE REALIZADO COM SUCESSO
		// igui.tocar(); // TESTE REALIZADO COM SUCESSO 
		//igui.pausar(); // TESTE REALIZADO COM SUCESSO
		
	}
}
