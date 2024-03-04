/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo6;

/**
 *
 * @author Vivian Giselle Vasquez Dubon
 */
public class Deportista  extends Persona {
    
    public Deportista () {
        establecerSalario(350000);
        establecerEdad(26);
        establecerNombre("Tiofilo");
        establecerApellido("Lopez");
        establecerNacionalidad("Estadounidense");
    }
        
    
    
    @Override
    String estudiosU() {
        return "No requiere estudios Universitario, vocacion";
    }

   
    @Override
    String Objetivolabor() {
        return "Entretener y ser el mejor boxeador del pais";
    }

    @Override
    String subclase() {
        return " Boxeador ";
    }

    @Override
    String especialidades() {
        return "Deportista orientado al Boxeo";
    }
    
    private String especialidades;

    

    public String obtenerEspecialidades() {
        return especialidades;
    }
    
    public void establecerEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

   
    
}
