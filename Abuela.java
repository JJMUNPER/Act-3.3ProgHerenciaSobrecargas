package org.Ejercicios.ejercicio4tema3HerenciaSobreestructura;

public class Abuela {

    protected String nombre="Rosario";
    protected String apellidos="Moron Rendon";
    protected Integer edad = 79;
    protected String calle="Callejas";
    protected Integer numero = 15;
    protected String pueblo ="Arcos de la frontera";


    //Metodos//

    void imprime(){
        System.out.println(this.nombre);
    }

    String nombreCompleto(String nombre, String apellidos){
        return (this.nombre + "" + this.apellidos);
    }

    String direccion (String calle, Integer numero, String pueblo){
        return (this.calle + "" + this.numero + "" + this.pueblo);
    }










}
