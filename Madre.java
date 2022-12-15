package org.Ejercicios.ejercicio4tema3HerenciaSobreestructura;

public class Madre extends Abuela{

    private String nombre ="Maria Dolores";
    private String apellidos ="Perez Moron";
    private Integer edad=53;
    private String calle ="Buleria";
    private Integer numero =2;
    private String pueblo ="Arcos de la frontera";


    String nombeYpoblacion (String nombre, String poblacion){
        return ("Me llamo " + nombre + " y soy de " + poblacion);
    }

    @Override
    void imprime(){
        System.out.println(this.nombre);
    }


}
