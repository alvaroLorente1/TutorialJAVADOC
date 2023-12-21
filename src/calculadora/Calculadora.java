package calculadora;
/**
 * Clase que implementa una calculadora con distintos metodos
 * 
 * @author Álvaro Lorente Almán
 * @see "recomendacion"
 * @since 1.0
 */

public class Calculadora {
	/**
	 * Metodod que suma dos numeros
	 * @param num1 primer operando
	 * @param num2 segundo opreando
	 * @return suma de los operandos
	 */
	
	public static double sumar(double num1, double num2) {
		return num1 + num2;
	}

	/**
	 * Metodo que resta dos numeros
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double restar(double num1, double num2) {
		return num1 - num2;
	}

	/**
	 * Metodos que multiplica dos números
	 * @param num1
	 * @param num2
	 * @return multiplicacion
	 */
	public static double multiplicar(double num1, double num2) {
		return num1 * num2;
	}

	
	/**
	 * Metodo que divide dos numeros
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static double dividir(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Error: No se puede dividir por cero.");
			/**
			 * Nan representa un resultdo indefinido
			 */
			return Double.NaN;
		}
	}

	public static void main(String[] args) {
		/**
		 * 
		 * indica los valores con los que hemos inicializado la variables
		 */
		double numero1 = 10;
		double numero2 = 5;
		
		System.out.println("Suma: " + sumar(numero1, numero2));
		System.out.println("Resta: " + restar(numero1, numero2));
		System.out.println("Multiplicación: " + multiplicar(numero1, numero2));
		System.out.println("División: " + dividir(numero1, numero2));
	}
}
