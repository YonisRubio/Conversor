package logica;

import gui.OpcionesSelecion;

public class Verificar {

	public static boolean verificarNull(Object respuesta) {
		if (respuesta == null) {
			OpcionesSelecion.finlizarPrograma();
			return true;
		}
		return false;
	}

	public static double verificarNumeros(Object respuesta) {
		while (true) {

			try {
				return Double.parseDouble(respuesta.toString());

			} catch (Exception e) {
				if (respuesta == null) {
					OpcionesSelecion.finlizarPrograma();
					return -1;
				}
				OpcionesSelecion.avisoNumeroInvalido();
				respuesta = OpcionesSelecion.ingresoDatos();
			}

		}

	}

}
