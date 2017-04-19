/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.*;

public class Pregunta {
    String titulo;
    ArrayList<Opcion> opcion;
 
    public Pregunta() {
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpcion() {
        return opcion;
    }

    public void setOpcion(ArrayList<Opcion> opcion) {
        this.opcion = opcion;
    }

    public Pregunta(String titulo, ArrayList<Opcion> opcion) {
        this.titulo = titulo;
        this.opcion = opcion;
    }

   
    
    
}
