package main;

import gui.OpcionesSelecion;
import logica.Conversor;
import logica.Verificar;

public class Main {

	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		boolean continuar = true;

		while (continuar) {
			continuar = false;

			Object programa = OpcionesSelecion.EscogerPrograma();
			if (Verificar.verificarNull(programa))continue;

			Object tipoCambio = OpcionesSelecion.tipoDeCambio();
			if (Verificar.verificarNull(tipoCambio)) continue;
				

			Object monedasConvertir = OpcionesSelecion.ingresoDatos();
			if (Verificar.verificarNull(monedasConvertir)) continue;
				

			double numero = Verificar.verificarNumeros(monedasConvertir);
			if (numero == -1) continue;
				

			Object monedaEscogida = OpcionesSelecion.escogerMoneda();
			if (Verificar.verificarNull(monedaEscogida)) continue;
				

			if (tipoCambio.equals("Extranjera a nacional")) {

				String cambio = String.format("%.2f", conversor.convertirInverso(monedaEscogida.toString(), numero));
				OpcionesSelecion.mensaje(cambio);

			} else {

				String cambio = String.format("%.2f", conversor.convertir(monedaEscogida.toString(), numero));
				OpcionesSelecion.mensaje(cambio, monedaEscogida.toString());

			}

			if (OpcionesSelecion.continuar() == 0) {
				continuar = true;
				continue;
			}

			OpcionesSelecion.finlizarPrograma();

		}

	}

}
