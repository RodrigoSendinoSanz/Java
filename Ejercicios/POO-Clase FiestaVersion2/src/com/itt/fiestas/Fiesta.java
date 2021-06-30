/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itt.fiestas;

/**
 *      Esta clase representa a una fiesta 
 *      Los cuales son:
 *      @see Fiesta
 * 
 * 
 * @author Rodri
 */
public class Fiesta {
    	// Propiedades privadas
    
         /**
	 * la informacion del tipo de fiesta:
	 * @see tipo
	 */
	public String tipo;
         /**
	 * La informacion de la fecha:Año-Mes-Dia-Hora:Minuto:Segundos
	 * @see fecha
	 */
	public String fecha;
         /**
	 * La informacion de la direcion donde se efectua la fiesta
	 * @see direccion
	 */
	public String direccion;
         /**
	 * La cantidad de bocadillos que se han consumido en la fiesta
	 * @see bocadillos
	 */
	public int bocadillos;
         /**
	 * la cantidad de bebidas que se han consumido en la fiesta
	 * @see bebidas
	 */
        public int bebidas;
         /**
	 * La cantidad de invitados que han acudido a la fiesta
	 * @see invitados
	 */
        public int invitados;
         /**
	 * Sirve para contabilizar el numero de fiestas
	 * @see contadorFiestas
	 */
        private static int contadorFiestas;
        //Constructor 
         /**
	 * Establece el objeto Fiesta con las Propiedades:
         * direccion, tipo,fecha,bocadillos,bebidas,invitados y contadorFiestas
         * y sus metodos:
         * invitar(),invitar(int cuanto),cancelarInvitacion(),
         * PrecioFiesta(),getcontadorFiestas(),setTipoFiesta(String t),
         * setTipoFiesta(String t),setfechaHora(String f),getDireccion(), 
         * getInvitados(),setDireccion(String direccion),getBocadillos(), 
         * getBocadillos(),setBocadillos(int bocadillos),getBebidas(),
         * setBebidas(int bebidas)
         * 
	 * @see Fiesta
	 */
        public Fiesta(){
		this.direccion = " ";
		this.tipo = " ";
		this.fecha = null;
		this.bocadillos = 0;
                this.bebidas = 0;
		this.invitados = 0;
                contadorFiestas++;
}
	
	public Fiesta(String dir, String f, String fech, int color,int beb,int inv) {
		this.direccion = dir;
		this.tipo = f;
		this.fecha = fech;
		this.bebidas = beb;
		this.invitados = inv;
                contadorFiestas++;

}
         /**
	 * Muestra La informacion de la fiesta:
         * La fecha, el tipo de fiesta,direción,nºbocadillos,nºbebidas y el nºinvitados.
         * @return 
	 * @see consultar
	 */
        public String consultar(){
            return ("Fecha: "+"["+this.fecha+"]"+" "+"Tipo de fiesta: "+"["+this.tipo+"]"
            +" "+"Direción: "+"["+this.direccion+"]"+" "+"nºBocadillos: "+"["+this.bocadillos+"]"
            +" "+"nºBebidas: "+"["+this.bebidas+"]"+" "+"nºInvitados: "+"["+this.invitados+"]");
        }
	/**
	 * Representa la invitación de la persona a la la fiesta
         * Si se utiliza invitar() sin especificar un numero suma
         * 1 invitacion y tambien se puede especificar 
         * el numero de invitados
         * @return
	 * @see invitar
         * @see invitar(int cuanto)
	 */
        public int invitar(){
            this.invitados++;
            return this.invitados;
        }

        public void invitar(int cuanto) {
            this.invitados = this.invitados + cuanto;
	}
         /**
	 * Sirve para cancelar invitaciones y descuenta 1 en el nº de invitados
         * y cancela la invitacion
         * 
         * @return 
	 * @see cancelarInvitacion
	 */
        public int cancelarInvitacion(){
            this.invitados--;
            return this.invitados;
        }
         /**
         * Devuelve el precio de la fiesta teniendo en cuenta el calculo del
         * precio de los invitados las bebidas y los bocadillos de las
         * respectivas fiestas
         * @return 
	 * @see PrecioFiesta
	 */
        public int PrecioFiesta(){
            return(this.invitados*5 +this.bebidas*2+this.bocadillos*3);
        }
         /**
         * Muestra la cantidad de Fiestas que se han creado
         * @return 
	 * @see getcontadorFiestas
	 */
        public static int getcontadorFiestas() {
        return contadorFiestas;
        }

        //Metodos Getter y Setter
         /**
         * Sirve para selecionar el tipo de fiesta
         * @param t
	 * @see setTipoFiesta
	 */
        public void setTipoFiesta(String t){
            this.tipo=t;
        }
        /**
         * Sirve para obtener la informacion 
         * de la fecha:Año-Mes-Dia-Hora:Minuto:Segundos
         * @param f
	 * @see setfechaHora
	 */
        public void setfechaHora(String f){
            this.fecha=f;
        }

        /**
         * Sirve para muestrala informacion de la dirrecion 
         * donde se efectua la fiesta
         * @return 
	 * @see getDireccion
	 */
        public String getDireccion() {
		return direccion;
	}
        /**
	 * Muestra la cantidad de invitados que han acudido a la fiesta
         * @return 
	 * @see getInvitados
	 */
        
        public int getInvitados() {
		return invitados;
	}
        /**
	 * Muestra la cantidad de invitados que han acudido a la fiesta 
         * @param direccion
	 * @see setDireccion
	 */
        

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
        /**
	 * Muestra la cantidad de bocadillos que se han consumido en la fiesta 
         * @return 
	 * @see getBocadillos
	 */

	public int getBocadillos() {
		return bocadillos;
	}
        /**
	 * Establece la cantidad de bocadillos que se han consumido en la fiesta 
         * @param bocadillos
	 * @see setBocadillos
	 */

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

        /**
	 * Muestra la cantidad de bebidas que se han consumido en la fiesta 
         * @return 
	 * @see getBebidas
	 */
	public int getBebidas() {
		return bebidas;
	}

        /**
	 * Establece la cantidad de bebidas que se han consumido en la fiesta 
         * @param bebidas
	 * @see setBebidas
	 */
	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
        
}
