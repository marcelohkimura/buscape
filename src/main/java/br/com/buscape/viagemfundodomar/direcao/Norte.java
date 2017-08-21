package br.com.buscape.viagemfundodomar.direcao;

import br.com.buscape.viagemfundodomar.Coordenada;
import br.com.buscape.viagemfundodomar.enumeration.DirecaoEnum;

/**
 * @author Marcelo Kimura
 *
 */
public class Norte implements Direcao {

	public void mover(Coordenada ponto) {
		ponto.setEixoY(ponto.getEixoY() + 1);
	}

	public Direcao virarEsqueda() {
		return new Oeste();
	}

	public Direcao virarDireita() {
		return new Leste();	
	}
	
	public DirecaoEnum getDirecao() {
		return DirecaoEnum.NORTE;
	}	

}