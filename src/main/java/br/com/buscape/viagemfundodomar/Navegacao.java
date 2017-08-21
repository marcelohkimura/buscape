package br.com.buscape.viagemfundodomar;

import br.com.buscape.viagemfundodomar.enumeration.ComandoEnum;

public class Navegacao {
	private Submarino submarino;
	private String rota;
	
	public Navegacao(Submarino submarino, String rota) {
		this.submarino = submarino;
		this.rota = rota;
	}

	public Submarino getSubmarino() {
		return submarino;
	}
	public String getRota() {
		return rota;
	}
	
	public void navegar() {
		char[] comandos = rota.toCharArray();
		for (char comando : comandos) 
		{
			if (ComandoEnum.LEFT.getComando() == comando) {
				submarino.virarEsqueda();;
			} if (ComandoEnum.RIGHT.getComando() == comando) {
				submarino.virarDireita();
			} else if (ComandoEnum.MOVE.getComando() == comando) {
				submarino.mover();;
			} else if (ComandoEnum.UP.getComando() == comando) {
				submarino.subir();
			} else if (ComandoEnum.DOWN.getComando() == comando) {
				submarino.descer();;
			}
		}
	}

}
