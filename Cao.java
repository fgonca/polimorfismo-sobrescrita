package fundamentos.polimorfismosobrescrita;

public class Cao extends Animal
{	
	/*
	 * Sobrescreve o método comunica da superclasse
	 */
	@Override // anotação de sobrescrita
	public String comunicar() 
	{
		return "ladra"; // uma das forma de comunicar
	}
}
