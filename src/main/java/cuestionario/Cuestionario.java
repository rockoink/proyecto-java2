/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;


public class Cuestionario {
  public static void main(String[] args){
    
        ArrayList<Pregunta> preguntas = new GenerarCues().getPreguntas();
        
        
        //Iteracion forma antigua
        for (Pregunta p : preguntas){
            
            System.out.println(p.getTitulo());
            for(Opcion o : p.getOpcion()){
                System.out.println(o.getTitulo());
            }
        
        
        }
        
    
    
    
    }  
}
