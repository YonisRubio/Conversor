package Pruebas;

import gui.OpcionesSelecion;
import logica.Conversor;

public class TestConversorIverso {
	
	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		
		OpcionesSelecion.tipoDeCambio();
		
		System.out.println(conversor.convertirInverso("Dolar", 12.5));
		
		
	}

}
