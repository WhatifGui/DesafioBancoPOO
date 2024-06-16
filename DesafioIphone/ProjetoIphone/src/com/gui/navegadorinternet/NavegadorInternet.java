package com.gui.navegadorinternet;

import com.gui.exceptions.ParametrosExceptions;

public interface NavegadorInternet {
	public void exibirPagina();
	public void adicionarNovaAba() throws ParametrosExceptions;
	public void atualizarPagina();
}
