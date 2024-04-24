package fundamentos.polimorfismosobrescrita;

public class Gato extends Animal 
{	
	/*
	 * Sobrescreve o método comunica da superclasse
	 */
	@Override // anotação de sobrescrita
	public String comunicar() 
	{
		return "mia"; // uma das forma de comunicar
	}
}
