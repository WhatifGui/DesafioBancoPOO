package com.gui.meuaparelho;

import com.gui.aparelho.*;
import com.gui.exceptions.ParametrosExceptions;

public class IphoneGui {
	public static void main(String[] args) throws ParametrosExceptions {
		Iphone igui = new Iphone();
		
		// igui.adicionarNovaAba();
		igui.setMusicasCelular();
		igui.getMusicasCelular();
	}
}
