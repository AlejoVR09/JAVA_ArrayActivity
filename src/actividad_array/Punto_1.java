package actividad_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Punto_1 {
    
    public static boolean cont(int[][] array,int num) {
        boolean bandera = false;
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==num) {
                    bandera=true;
                                
                }
            }                           
            
        }
        return bandera; 
    }
    
    
    public static void main(String[] args) {       
        Scanner input=new Scanner(System.in);
        int random,n;
        System.out.println("Ingrese el valor de filas y colunmas que va a tener la matriz: ");
        n=input.nextInt();
        int[][] numeros=new int[n][n];
        boolean comp;
        
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                random=(int)(Math.random()*99)+1;
                comp=cont(numeros,random);
                while(comp==true){
                    random=(int)(Math.random()*99)+1;
                    comp=cont(numeros,random);
                }    
                numeros[i][j]=random;
            }     
        }
        System.out.println("\nLa matriz contiene los siguientes valores");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("");           
        }
        //Numero mayor por columna
        System.out.println("\nNumeros mayores por columna");
        int[] max=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                max[j]=numeros[j][i];
            }
            Arrays.sort(max);
            System.out.println("Colunma "+(i+1)+"\n   "+max[n-1]);
            
        }    
        
        //Numeros menores por fila
        System.out.println("\nNumeros menores por fila");
        for(int i=0;i<n;i++){
            Arrays.sort(numeros[i]);
            System.out.println("Fila "+(i+1)+"\n  "+numeros[i][0]);           
        }       

        //Vector con todos los valores de la matriz ordeanados de forma descendente        
        int[] valores=new int[n*n];
        int cont_1=0;
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                valores[cont_1]=numeros[i][j];
                cont_1++;
            }          
        }
        Arrays.sort(valores);
        System.out.println("Valores de la matriz ordenados de forma descendente");
        for(int h=valores.length-1;h>=0;h--){
            System.out.print(valores[h]+" ");
        }
        System.out.println("");        
    }
}
