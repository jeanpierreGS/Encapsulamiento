/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 * Esta clase representa una persona 
 * dentro del sistema 
 * @author Picon Jara , Miguel Angel
 */
//PRESIONAR CONTROL PARA VER LAS DESCRIPCIONES DE LA CLASE
public class Persona {
    private String nombre;
    private String dni;
    private double peso;
    
    //PRESIONAR ALT + INSERT 
    //OPCION SETTER
    //PARA PONER DE MANERA AUTOMATICA 
    // LOS METODOS
    
    
    public String getNombre(){
        return this.nombre;
    }

    public Persona(String nombre, String dni, double peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.peso = peso;
    }
    
    /**
     * ESTA FUNCION PERMITE ENCAPSULAR EL 
     * NOMBRE DE LA PERSONA
     * @param nombre ESTE ES EL VALOR DEL NUEVO NOMBRE
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
