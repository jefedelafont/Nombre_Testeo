/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ed_ejercicios;

/**
 *
 * @author vesprada
 */
import java.util.Scanner;
import java.io.*;
public class Ejercicio_2 {
    
    public static void main(String[] args) {    
        String ruta,nombre,cadena;
        char letras;
        Scanner Sc = new Scanner(System.in);
        int cont=0,espacio=32;
        try{
            System.out.print("Introduce el nombre de la palabra: ");      
            nombre  = Sc.nextLine();
            System.out.print("Introduce la ruta del fichero: ");      
            ruta = Sc.nextLine();
            FileReader fr=new FileReader(ruta);
            int valor=fr.read();
            cadena = " ";
            while(valor != -1){
            valor=fr.read();
            letras = (char)valor;
            cadena += (char)letras;
            
            if(valor == espacio)
            {
                System.out.println(cadena);
                if (nombre == cadena) {
                    System.out.print("Coinciden");
                }
            }else{
            System.out.print("No Coinciden");
            
            }
               // System.out.print((char)valor);
                

            }
                fr.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
}
}