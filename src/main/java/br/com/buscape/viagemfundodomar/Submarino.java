package br.com.buscape.viagemfundodomar;

import br.com.buscape.viagemfundodomar.direcao.Direcao;
import br.com.buscape.viagemfundodomar.direcao.Norte;
import br.com.buscape.viagemfundodomar.enumeration.DirecaoEnum;

/**
 * @author Marcelo Kimura
 *
 */
public class Submarino {

	// Ponto (0, 0, 0, NORTE) 
	private Direcao direcao = new Norte(); 
	private Coordenada coordenada = new Coordenada();

	public Submarino() {
	}
	
	public void mover() {
		this.direcao.mover(this.coordenada);
	}

	public void virarEsqueda() {
		this.direcao = this.direcao.virarEsqueda();		
	}
	
	public void virarDireita() {
		this.direcao = this.direcao.virarDireita();		
	}
	
	public void subir() {
		coordenada.setEixoZ(coordenada.getEixoZ() + 1);
	}

	public void descer() {
		coordenada.setEixoZ(coordenada.getEixoZ() - 1);
	}
	
	public Coordenada getCoordenada() {
		return coordenada;
	}
	
	public DirecaoEnum getDirecao() {
		return direcao.getDirecao();
	}
	
	@Override
	public String toString() {
		return coordenada.toString() + " " + getDirecao();
	}
	
}