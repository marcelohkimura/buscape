package br.com.buscape.viagemfundodomar;

import java.util.Scanner;

import br.com.buscape.viagemfundodomar.enumeration.ComandoEnum;

/**
 * @author Marcelo Kimura
 *
 */
public class Movimentacao {

	public static void main(String[] args) {
	
		Submarino submarino = new Submarino();
		System.out.println("Rotar para o submarino: ");
		Scanner scanner = new Scanner(System.in);
		String rota = scanner.nextLine();
		rota = rota.toUpperCase();

		Navegacao navegacao = new Navegacao(submarino, rota);
		navegacao.navegar();
		scanner.close();
		System.out.println(submarino.toString());		
	}
	
}