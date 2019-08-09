/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdealgoritmos2020.pkg1;

import ordenamiento.Burbuja;

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
        b.definirDatos(new double[]{5,3,2,1});
        System.out.println(b.ordenarDatos());
        System.out.println();
    }
    
}
