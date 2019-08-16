/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2020.pkg1;

import ordenamiento.Burbuja;
import ordenamiento.Herramientas;

/**
 *
 * @author CRUZLEIJA
 */
public class AnalisisDeAlgoritmos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Burbuja  b = new Burbuja();
        double original [] =  Herramientas.generarArregloMejorCaso(20000);
        //double original2 [] =  Herramientas.generarArregloMejorCaso(20000);
        
        for (int i = 0 ; i<20; i++){
         b.definirDatos(original.clone());
         System.out.println(i+": "+b.ordenarDatos());
         System.out.println();
        }
       
        
    }
    
}
