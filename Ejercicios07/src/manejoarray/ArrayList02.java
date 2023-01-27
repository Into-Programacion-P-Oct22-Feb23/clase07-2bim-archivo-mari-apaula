/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
    }
      
    public static ArrayList < String > obtenerDatos(){
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo2 = new ArrayList<>();
        boolean bandera = true;
        String pais;
        
        while (bandera){
            System.out.println("Ingrese el nombre de un pais");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Ingrese y para salir");
            String letra = entrada.nextLine();
            
            if (letra.equals("y")){
                bandera = false;
            }
 
        }
        return arreglo2;
        
    }
    public static String obtenerCadenaFinal(ArrayList<String> lista){
        String mensajeFinal = "";
        
        for(int i = 0; i < lista.size(); i++){
            mensajeFinal = String.format("%s%s\n", mensajeFinal, lista.get(i));
        }
        return mensajeFinal;
        
    }
}

