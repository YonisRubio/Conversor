package gui;

import javax.swing.JOptionPane;

public class OpcionesSelecion {
	/**
	 * Muestra un pantallla donde se debe seleccionar que aplicacion quiere usar,
	 * como conversor de monedas
	 * 
	 * @return : retorna un objeto de tipo Object que contiene la respuesta del
	 *         usuario
	 */
	public static Object EscogerPrograma() {

		String[] opcines = { "Conversor de Monedas" };
		Object selecValue = JOptionPane.showInputDialog(null, "Funciones", "seleccion de opciones",
				JOptionPane.INFORMATION_MESSAGE, null, opcines, opcines[0]);
		return selecValue;
	}

	/**
	 * Muestra una pantalla donde el ususario debe seleccion el tipo decambio que
	 * quiere hacer, de moneda naciona (CLP) a moneda extranjera o lo contrario
	 * 
	 * @return : retorna un objeto de tipo Object que contiene la respuesta del
	 *         usuario
	 */
	public static Object tipoDeCambio() {

		String[] opcines = { "Nacional a extranjera", "Extranjera a nacional" };
		Object selecValue = JOptionPane.showInputDialog(null, "Funciones", "seleccion de opciones",
				JOptionPane.INFORMATION_MESSAGE, null, opcines, opcines[0]);
		return selecValue;
	}

	public static Object ingresoDatos() {
		Object inputValue = JOptionPane.showInputDialog(null,
				"Ingrese la cantidad que desea convertir( letras o signos no son validos ) ", "Conversor",
				JOptionPane.INFORMATION_MESSAGE, null, null, null);
		return inputValue;
	}

	public static Object escogerMoneda() {

		String[] opcines = { "Dolar", "Euro", "Libras", "Yen", "Won SurCoreano", "Bolivares" };
		Object selecValue = JOptionPane.showInputDialog(null, "Monedas", "seleccion De Moneda",
				JOptionPane.INFORMATION_MESSAGE, null, opcines, opcines[0]);
		return selecValue;
	}

	public static void mensaje(String monto, String tipoMoneda) {

		JOptionPane.showMessageDialog(null, "Tienes: " + monto + " " + tipoMoneda, "Conversor",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void mensaje(String monto) {

		JOptionPane.showMessageDialog(null, "Tienes: " + monto + " " + "Pesos Chilenos", "Conversor",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static int continuar() {
		return JOptionPane.showOptionDialog(null, "Desea Continuar ?", "Message", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, null, null);
	}

	public static int finlizarPrograma() {
		return JOptionPane.showOptionDialog(null, "Programa Finalizado", "Message", JOptionPane.CLOSED_OPTION,
				JOptionPane.WARNING_MESSAGE, null, null, null);
	}

	public static int avisoNumeroInvalido() {
		return JOptionPane.showOptionDialog(null,
				"Por favor Ingrese un numero valido o use ( . ) para separar decimales ", "Message",
				JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
	}

}
