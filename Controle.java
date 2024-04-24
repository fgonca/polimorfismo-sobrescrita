/**
 * FUNDAMENTOS DE ENGENHARIA DE SOFTWARE
 * - Polimorfismo
 * - Sobrescrita
 * @author Francisco Pedro Morais Gonçalves
 * https://github.com/fgonca
 */

package fundamentos.polimorfismosobrescrita;

public class Controle 
{
	public static void main(String[] args) 
	{
		Cao cao = new Cao();
		System.out.println("Cão "+cao.comunicar());;
		
		Gato gato = new Gato();
		System.out.println("Gato "+gato.comunicar());
		
		Rato rato = new Rato();
		System.out.println("Rato "+rato.comunicar());
	}
}
