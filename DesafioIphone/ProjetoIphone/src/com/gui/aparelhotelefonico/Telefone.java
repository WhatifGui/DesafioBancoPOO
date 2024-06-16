package com.gui.aparelhotelefonico;

import com.gui.exceptions.ParametrosExceptions;

public interface Telefone {
	public void ligar() throws ParametrosExceptions;
	public void atender();
	public void iniciarCorreioVoz();
}
