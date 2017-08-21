package br.com.buscape.viagemfundodomar.enumeration;

/**
 * @author Marcelo Kimura
 *
 */
public enum ComandoEnum {
	LEFT('L'),
	RIGHT('R'),
	MOVE('M'),
	UP('U'),
	DOWN('D');

	private char comando;

	private ComandoEnum(char comando) {
		this.comando = comando;
	}

	public char getComando() {
		return comando;
	}
	
}

