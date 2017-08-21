package br.com.buscape.viagemfundodomar.direcao;

import br.com.buscape.viagemfundodomar.Coordenada;
import br.com.buscape.viagemfundodomar.enumeration.DirecaoEnum;

/**
 * @author Marcelo Kimura
 *
 */
public class Leste implements Direcao {

	public void mover(Coordenada ponto) {
		ponto.setEixoX(ponto.getEixoX() + 1);
	}

	public Direcao virarEsqueda() {
		return new Norte();
	}

	public Direcao virarDireita() {
		return new Sul();
	}

	public DirecaoEnum getDirecao() {
		return DirecaoEnum.LESTE;
	}
	
}