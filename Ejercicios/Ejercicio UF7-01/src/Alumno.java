/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Rodri
 */
public class Alumno {

              private String nombre;

              private int matricula;

              public ArrayList<Calificacion> calificaciones;
              Calificacion cal;              

              public Alumno(String nombre, int matricula) {
         		 this.nombre = nombre;
         		 this.matricula = matricula;
                         calificaciones=new ArrayList<Calificacion>();                        
              }
               public Alumno(){
         		 this.nombre = "";
         		 this.matricula = 0;
                         calificaciones=new ArrayList<Calificacion>();                        
              }


           public String getNombre() {
				return nombre;
			}

			public int getMatricula() {
				return matricula;
			}

			public ArrayList<Calificacion> getCalificaciones() {
				return calificaciones;
			}
                        /**
                         * Este metodo sirve para asignar y almacenar la asignatura y su nota 
                         * en las calificaciones de cada alumno
                         * @param asignatura tipo cadena de texto
                         * @param nota tipo numerico
                         */
		public void calificar(String asignatura, int nota) {
			Calificacion cal = new Calificacion(asignatura, nota);
			calificaciones.add(cal);
           }
                          /**
                         * Este metodo devuelve en una cadena de texto por pantalla:
                         * @param nombre nombre del alumno/a
                         * @param matricula nº de la matricula
                         * @param calificaciones calificaciones obtenidas
                         * @param media nota media de las claificaciones
                         */
           @Override
           public String toString() {
        	   double media=0;int suma=0;
        	   for (int i=0;i<calificaciones.size();i++) {
        		   suma=suma+calificaciones.get(i).getNota();
        	   }
        	   media=suma/ calificaciones.size();
        	   return "El alumno con nombre : "+this.getNombre()+"y matricula: "+ this.getMatricula()+" Calificaciones: "+this.calificaciones.toString()+" Nota media "+media;

           }

}
