/**
 * 
 */
package ordenador;

/**
 * Esta es una clase para almacenar la información de los ordenadores del centro
 * @author ALUMNO
 * @version 1.0
 */
public class Ordenador {
	/*Se informa el modelo del ordenador*/
	public String modelo;
	/*Variable que almacena el precio total del ordenador*/
	public double precio;
	/*Variable que almacena el tamaño de la memoria*/
	public int memoria;
	
	/*
	 * Constructor vacío de la clase Ordenador
	 */
	public Ordenador() {
		
	}
	
	/**
	 * Constructor de la clase Ordenador
	 * @param modelo: Modelo del ordenador
	 * @param precio: precio total del ordenador
	 * @param memoria: tamaño memoria del ordenador
	 */
	public Ordenador(String modelo,double precio, int memoria) {
		this.modelo = modelo;
		this.precio = precio;
		this.memoria = memoria;
	}
	
	
	
	
}
