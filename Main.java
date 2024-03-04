import modulo6.Deportista;
import modulo6.Doctor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Gladys Mancia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Deportista deportista = new Deportista ();
         System.out.println(" ==================================");
         System.out.println(" ====== GRUPO # 2 MODULO #6 ====== ");
         System.out.println(" = Intregantes: Gladys Mancia    = ");
         System.out.println(" = Darling Zelaya, Vivian Vasquez= ");
         System.out.println(" ==================================");
         System.out.println(" ======  PRIMERA PROFESION  ====== ");
         System.out.println(" ==================================");
         doctor.impirmirInformacion();
         System.out.println ("");
         System.out.println(" ==================================");
         System.out.println(" ======  SEGUNDA PROFESION  ====== ");
         System.out.println(" ==================================");
         deportista.impirmirInformacion();
    }
    
}
