package br.com.buscape.viagemfundodomar.enumeration;

/**
 * @author Marcelo Kimura
 *
 */
public enum DirecaoEnum {
	 NORTE("N", "NORTE"),
	 LESTE("L", "LESTE"),
	 SUL("S", "SUL"),
	 OESTE("O", "OESTE");

	private String codigo;
	private String direcao;

	private DirecaoEnum(String codigo, String direcao) {
		this.setCodigo(codigo);
		this.setDirecao(direcao);
	}	

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public DirecaoEnum VirarDireita() {
		return this.ordinal() < DirecaoEnum.values().length - 1
				? DirecaoEnum.values()[this.ordinal() + 1] : DirecaoEnum.NORTE;
	}
	
	public DirecaoEnum VirarEsquerda() {
		return this.ordinal() > 0
				? DirecaoEnum.values()[this.ordinal() - 1] : DirecaoEnum.OESTE;
	}
	
}

