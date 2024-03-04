/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo6;

/**
 *
 * @author Gladys Mancia
 */

public abstract class Persona {
    
    //encapsulamiento (obtener o establer)
    private int salario;
    
    private int edad;
    
    public void establecerSalario(int _salario){
        this.salario=_salario;
    }
    public int obtenerSalario(){
        return salario;
    }
    
    public void establecerEdad(int _edad){
        this.edad=_edad;
    }
    public int obtenerEdad (){
        return edad;
    }
    
    //abstraccion (establecer)
    
    
    abstract String estudiosU();//con esto me refiero, si es requerido estudiar en la universidad, puede estar predefinido
    
    abstract String Objetivolabor();//me refiero al objetivo que tiene su rubro
    
    //herencia
    
    //-atributos a obtener
    
    public String nombre;
    
    public String apellido;
    
    public String nacionalidad;
    
    //metodos establecer o pedir
    
    public void establecerNombre(String _nombre){
        this.nombre=_nombre;
    }
    public void establecerApellido(String _apellido){
        this.apellido=_apellido;
    }
    public void establecerNacionalidad(String _nacionalidad){
        this.nacionalidad=_nacionalidad;
    }
    
    //metodos para imprimir
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public String obtenerResidencia(){
        return nacionalidad;
        
        
    }
    
    
    //polimorfismo
    
    abstract String subclase();//tiene que retornar un string con el nombre de la subclase que se le asigno (nombre)
    
    abstract String especialidades(); //retornar una lista de especialidades de la clase ya sea estudios u orientaciones

    public void impirmirInformacion(){
    System.out.println(" Profesion: "   + subclase ());
    System.out.println(" Nombre:  " + nombre + " " + apellido );
    System.out.println(" Nacionalidad: "+ nacionalidad);
    System.out.println(" Edad:  "+ edad + "  años ");
    System.out.println(" Salario: Lps. " + salario);
    System.out.println(" Objetivo Laboral:  " + Objetivolabor ());
    System.out.println(" Estudios: "   + estudiosU ());
    System.out.println(" Especialidad: "   + especialidades ());
     
     
    
}
    }
    

