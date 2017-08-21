package br.com.buscape.viagemfundodomar;

import org.junit.Assert;
import org.junit.Test;

import br.com.buscape.viagemfundodomar.enumeration.ComandoEnum;
import br.com.buscape.viagemfundodomar.enumeration.DirecaoEnum;

/**
 * @author Marcelo Kimura
 *
 */
public class SubmarinoTest {
	
	@Test
	public void teste1() {
		
		Submarino submarino = new Submarino();
		String rota = "LMRDDMMUU";
		Navegacao navegacao = new Navegacao(submarino, rota);
		navegacao.navegar();
		Assert.assertEquals(submarino.getCoordenada().getEixoX(), -1);
		Assert.assertEquals(submarino.getCoordenada().getEixoY(), 2);
		Assert.assertEquals(submarino.getCoordenada().getEixoZ(), 0);
		Assert.assertEquals(submarino.getDirecao(), DirecaoEnum.NORTE);
		
		System.out.println(submarino.toString());
	}

	@Test
	public void teste2() {
		
		Submarino submarino = new Submarino();
		String rota = "RMMLMMMDDLL";
		Navegacao navegacao = new Navegacao(submarino, rota);
		navegacao.navegar();
		
		Assert.assertEquals(submarino.getCoordenada().getEixoX(), 2);
		Assert.assertEquals(submarino.getCoordenada().getEixoY(), 3);
		Assert.assertEquals(submarino.getCoordenada().getEixoZ(), -2);
		Assert.assertEquals(submarino.getDirecao(), DirecaoEnum.SUL);
		
		System.out.println(submarino.toString());
	}	
	
}