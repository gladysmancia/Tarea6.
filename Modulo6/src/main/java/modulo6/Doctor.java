/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo6;

/**
 *
 * @author Darlyng Alexander Zelaya
 */
public class Doctor extends Persona {

    private String especialidades;

    public Doctor() {
        establecerNombre("SALVADOR");
        establecerApellido("MONCADA");
        establecerNacionalidad("Hondureño");
        establecerSalario(150000);
        establecerEdad(80);
        
    }

 
   

    @Override
    String estudiosU() {
        return "Requiere estudios universitarios en medicina";
    }

   
    @Override
    String Objetivolabor() {
        return "Su pacion es la medicina e investigar curas";
    }

    @Override
    String subclase() {
        return "Doctor";
    }

    @Override
    String especialidades() {
        return "Cientifico";
    }

    public void establecerEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public String obtenerEspecialidades() {
        return especialidades;
    }

    
}

