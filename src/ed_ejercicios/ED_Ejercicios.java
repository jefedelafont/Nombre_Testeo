/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ed_ejercicios;

/**
 *
 * @author tu puta madre
 */
import java.util.Scanner;
import java.io.*;
public class ED_Ejercicios {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta;
        Scanner Sc = new Scanner(System.in);
        int cont=0;
        try{
            System.out.print("Introduce la ruta del archivo: ");      
            ruta = Sc.nextLine();
            FileReader fr=new FileReader(ruta);
            int valor=fr.read();
            while(valor !=-1){
                System.out.print((char)valor);
                valor=fr.read();
                   cont++;
            }
                fr.close();
                System.out.println("Numero de caracteres que contiene el archivo: "+cont);
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
        }
    }
    
