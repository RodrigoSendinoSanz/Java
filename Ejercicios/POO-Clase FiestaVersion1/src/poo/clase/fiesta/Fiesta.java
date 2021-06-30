/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase.fiesta;

/**
 *
 * @author Rodri
 */
public class Fiesta {
    	// Propiedades privadas
	private String tipo;
	private String fecha;
	private String direccion;
	private int bocadillos;
        private int bebidas;
        private int invitados;
        
        //Constructor 
        public Fiesta(){
		this.direccion = " ";
		this.tipo = " ";
		this.fecha = null;
		this.bocadillos = 0;
                this.bebidas = 0;
		this.invitados = 0;
}
	
	public Fiesta(String dir, String f, String fech, int color,int beb,int inv) {
		this.direccion = dir;
		this.tipo = f;
		this.fecha = fech;
		this.bebidas = beb;
		this.invitados = inv;
}
        String consultar(){
            return ("Fecha: "+"["+this.fecha+"]"+" "+"Tipo de fiesta: "+"["+this.tipo+"]"+" "+"Dirreción: "+"["+this.direccion+"]"+" "+"nºBocadillos: "+"["+this.bocadillos+"]"+" "+"nºBebidas: "+"["+this.bebidas+"]"+" "+"nºInvitados: "+"["+this.invitados+"]");
        }
        int invitar(){
            this.invitados++;
            return this.invitados;
        }
        int cancelarInvitacion(){
            this.invitados--;
            return this.invitados;
        }
        int PrecioFiesta(){
            return(this.invitados*5 +this.bebidas*2+this.bocadillos*3);
        }
        //Metodos Getter y Setter
        void setTipoFiesta(String t){
            this.tipo=t;
        }
        
        
        void setfechaHora(String f){
            this.fecha=f;
        }
        

        public String getDireccion() {
		return direccion;
	}
        
        
        int getInvitados() {
		return invitados;
	}


	void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	int getBocadillos() {
		return bocadillos;
	}


	void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}


	int getBebidas() {
		return bebidas;
	}


	void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}
        
}
