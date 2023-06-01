package actividad_array;

import java.util.Scanner;

public class Punto_6 {
    public static void main(String[] args) {       

        Scanner input=new Scanner(System.in);
        float[] numeros=new float[10];
        float n;
        for(int i=0;i<10;i++){
            n=input.nextFloat();
            numeros[i]=n;   
        }
        System.out.println("El vector contiene los siguientes valores");
        for(int i=0;i<10;i++){
            System.out.print(numeros[i]+" ");          
        } 
        System.out.println("");
        System.out.println("El vector inverso es");
        for(int i=9;i>=0;i--){
            System.out.print(numeros[i]+" ");          
        }
        System.out.println("");
    }     
}
