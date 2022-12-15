package org.Ejercicios.ejercicio4tema3HerenciaSobreestructura;

public class Hija extends Madre{

    private String nombre="Julia";
    private String apellidos="Perez Garrucho";
    private Integer edad=27;
    private String calle="Cuna";
    private Integer numero=6;
    private String poblacion="Arcos de la frontera";

    String nombreYpoblacion(String nombre, String poblacion, String calle){
        return ("Me llamo " + nombre + " y soy de " + poblacion + " y mi calle es " + calle);
    }

    String nombreCompleto(String nombre, String apellidos,Integer edad){
        return (super.nombre + "" + super.apellidos + "" + super.edad);
    }

    @Override
    String nombreCompleto(String nombre, String apellidos){
        return (this.nombre + "" + this.apellidos);
    }

    @Override
    String direccion (String calle, Integer numero, String pueblo){
        return (this.calle + "" + this.numero + "" + this.pueblo);
    }
}
