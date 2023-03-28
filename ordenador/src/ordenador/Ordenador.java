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
	private String modelo;
	/*Variable que almacena el precio total del ordenador*/
	private double precio;
	/*Variable que almacena el tamaño de la memoria*/
	private int memoria;
	/*Variable para almacenar la ubicacion donde se encuentra el equipo*/
	public String ubicacionAula;
	
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
		this.setModelo(modelo);
		this.setPrecio(precio);
		this.setMemoria(memoria);
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the memoria
	 */
	public int getMemoria() {
		return memoria;
	}

	/**
	 * @param memoria the memoria to set
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	
	
	
}
