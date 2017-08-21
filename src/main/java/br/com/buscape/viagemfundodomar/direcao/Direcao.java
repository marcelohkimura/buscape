package br.com.buscape.viagemfundodomar.direcao;

import br.com.buscape.viagemfundodomar.Coordenada;
import br.com.buscape.viagemfundodomar.enumeration.DirecaoEnum;

/**
 * @author Marcelo Kimura
 *
 */
public interface Direcao {
	
	public abstract void mover(Coordenada ponto);
	
	public abstract Direcao virarEsqueda();
	
	public abstract Direcao virarDireita();
	
	public abstract DirecaoEnum getDirecao();
	
}