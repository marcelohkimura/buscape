package br.com.buscape.viagemfundodomar;

/**
 * @author Marcelo Kimura
 *
 */
public class Coordenada {
	
	private int eixoX = 0;
	private int eixoY = 0;
	private int eixoZ = 0;
	
	public int getEixoX() {
		return eixoX;
	}

	public void setEixoX(int eixoX) {
		this.eixoX = eixoX;
	}

	public int getEixoY() {
		return eixoY;
	}

	public void setEixoY(int eixoY) {
		this.eixoY = eixoY;
	}

	public int getEixoZ() {
		return eixoZ;
	}

	public void setEixoZ(int eixoZ) {
		if (eixoZ > 0) {
			eixoZ = 0;
		}
		this.eixoZ = eixoZ;
	}
	
	@Override
	public String toString() {
		return String.format("%d %d %d", eixoX, eixoY, eixoZ);
	}
	
}