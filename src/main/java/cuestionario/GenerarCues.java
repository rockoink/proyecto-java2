/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;
import java.util.*;
import java.util.ArrayList;


public class GenerarCues {
    ArrayList<Pregunta> preguntas;

    public GenerarCues() {
        preguntas = new ArrayList<>();
        
    }
    public ArrayList<Pregunta> getPreguntas() {
//Pregunta 1
     Opcion o11=new Opcion("es un tipo de variable", false);
     Opcion o21=new Opcion("es una categoria de datos ordenada secuencialmente", false);
     Opcion o31=new Opcion("Es un modelo o plantilla a partir de la cual creamos objetos", true);
     
     ArrayList<Opcion> opcionesp1=new ArrayList<>();
     opcionesp1.add(o11);
     opcionesp1.add(o21);
     opcionesp1.add(o31);
     
//Pregunta 2
     Opcion o12=new Opcion("su interfaz y los eventos asociados", false);
     Opcion o22=new Opcion("sus atributos y sus metodos", true);
     Opcion o32=new Opcion("abstraccion y encapsulamiento", false);
     
     ArrayList<Opcion> opcionesp2=new ArrayList<>();
     opcionesp2.add(o12);
     opcionesp2.add(o22);
     opcionesp2.add(o32);
//Pregunta 3
     Opcion o13=new Opcion("public class Componente using Producto", false);
     Opcion o23=new Opcion("public class Componente implements Producto", false);
     Opcion o33=new Opcion("public class Componente extends Producto", true);
     
     ArrayList<Opcion> opcionesp3=new ArrayList<>();
     opcionesp3.add(o13);
     opcionesp3.add(o23);
     opcionesp3.add(o33);
//Pregunta 4
     Opcion o14=new Opcion("Crear un objeto a partir de la clase", true);
     Opcion o24=new Opcion("Duplicar una clase", false);
     Opcion o34=new Opcion("Conectar dos clases entre si", false);
     
     ArrayList<Opcion> opcionesp4=new ArrayList<>();
     opcionesp4.add(o14);
     opcionesp4.add(o24);
     opcionesp4.add(o34);
//Pregunta 5
     Opcion o15=new Opcion("Una libreria de Java", false);
     Opcion o25=new Opcion("Entorno de Desarrollo Integrado para facilitar el desarrollo de software", true);
     Opcion o35=new Opcion("Una version de Java para servidores", false);
     
     ArrayList<Opcion> opcionesp5=new ArrayList<>();
     opcionesp5.add(o15);
     opcionesp5.add(o25);
     opcionesp5.add(o35);
//Pregunta 6
     Opcion o16=new Opcion("Un bucle que no finaliza", false);
     Opcion o26=new Opcion("Es un error en tiempo de ejecucion", true);
     Opcion o36=new Opcion("Un evento usado al crear Interfaces", false);
     
     ArrayList<Opcion> opcionesp6=new ArrayList<>();
     opcionesp6.add(o16);
     opcionesp6.add(o26);
     opcionesp6.add(o36);
//Pregunta 7
     Opcion o17=new Opcion("Clase Secundaria", false);
     Opcion o27=new Opcion("Clase Principal", false);
     Opcion o37=new Opcion("Clase Modelo", true);
     
     ArrayList<Opcion> opcionesp7=new ArrayList<>();
     opcionesp7.add(o17);
     opcionesp7.add(o27);
     opcionesp7.add(o37);
//Pregunta 8
     Opcion o18=new Opcion("Abstraccion,Encapsulamiento,Herencia,Polimorfismo", true);
     Opcion o28=new Opcion("Array List, Linked List", false);
     Opcion o38=new Opcion("metodos y atributos", false);
     
     ArrayList<Opcion> opcionesp8=new ArrayList<>();
     opcionesp8.add(o18);
     opcionesp8.add(o28);
     opcionesp8.add(o38);
//Pregunta 9
     Opcion o19=new Opcion("Constructores, Arreglos mutables", false);
     Opcion o29=new Opcion("Create,Read,Update,Delete", true);
     Opcion o39=new Opcion("Modelo,Entidad,Aplicacion", false);
     
     ArrayList<Opcion> opcionesp9=new ArrayList<>();
     opcionesp9.add(o19);
     opcionesp9.add(o29);
     opcionesp9.add(o39);
//Pregunta 10
     Opcion o110=new Opcion("Una API que permite la ejecucion de operaciones sobre bases de datos desde Java", true);
     Opcion o210=new Opcion("Una libreria para construir interfaces graficas", false);
     Opcion o310=new Opcion("Una funcion utilizada para intercambiar valores", false);
     
     ArrayList<Opcion> opcionesp10=new ArrayList<>();
     opcionesp10.add(o110);
     opcionesp10.add(o210);
     opcionesp10.add(o310);
   
     
        Pregunta p1 = new Pregunta("¿Cuál es la descripción que define mejor el concepto 'clase' "
                + "                  en la programación orientada a objetos? ",opcionesp1);
        Pregunta p2 = new Pregunta("¿Que elementos definen un objeto? ",opcionesp2);
        Pregunta p3 = new Pregunta("¿Cual de los siguientes codigos tiene que ver con la herencia? ",opcionesp3);
        Pregunta p4 = new Pregunta("¿Que significa instanciar una clase? ",opcionesp4);
        Pregunta p5 = new Pregunta("¿Que es un IDE? ",opcionesp5);
        Pregunta p6 = new Pregunta("¿Que es una excepcion? ",opcionesp6);
        Pregunta p7 = new Pregunta("Menciona un tipo de clase ",opcionesp7);
        Pregunta p8 = new Pregunta("Estos son los pilares de la Programacion Orientada a Objetos ",opcionesp8);
        Pregunta p9 = new Pregunta("¿Caules son las operaciones CRUD? ",opcionesp9);
        Pregunta p10= new Pregunta("¿Que es JDBC? ",opcionesp10);

        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
       
        return preguntas;
}
}
