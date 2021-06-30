/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodri
 */
public class Calificacion {

              private String asignatura;

              private int nota = 0; // Valor de 0 a 100

         	 public Calificacion(String asignatura, int nota) {
        		 this.asignatura = asignatura;
        		 this.nota = nota;
        		 }

            @Override
            public String toString() {
            	return asignatura+nota;
            }

			public String getAsignatura() {
				return asignatura;
			}

			public void setAsignatura(String asignatura) {
				this.asignatura = asignatura;
			}

			public int getNota() {
				return nota;
			}

			public void setNota(int nota) {
				this.nota = nota;
			}

}
