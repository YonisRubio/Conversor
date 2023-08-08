package logica;

public class Conversor {

	String[] opcines = { "Dolar", "Euro", "Libras", "Yen", "Won SurCoreano", "Bolivares" };
	double[] monedas = { 800, 872, 1014, 5.52421, 0.612757, 28.5621 };

	public double convertir(String tipoMoneda, double monto) {

		switch (tipoMoneda) {
		case "Dolar":
			return monto / this.monedas[0];

		case "Euro":
			return monto / this.monedas[1];

		case "Libras":
			return monto / this.monedas[2];

		case "Yen":
			return monto / this.monedas[3];

		case "Won SurCoreano":
			return monto / this.monedas[4];

		case "Bolivares":
			return monto / this.monedas[5];

		default:
			return 0;
		}

	}

	public double convertirInverso(String tipoMoneda, double monto) {

		switch (tipoMoneda) {
		case "Dolar":
			return monto * this.monedas[0];

		case "Euro":
			return monto * this.monedas[1];

		case "Libras":
			return monto * this.monedas[2];

		case "Yen":
			return monto * this.monedas[3];

		case "Won SurCoreano":
			return monto * this.monedas[4];

		case "Bolivares":
			return monto * this.monedas[5];

		default:
			return 0;
		}

	}

}
