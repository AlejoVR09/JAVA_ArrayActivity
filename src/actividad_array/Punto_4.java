package actividad_array;
//Cada asignatura contara con una nota acumulada del estudiante
//Utilizare notas del 1 al 10 para solo poner enteros y no dañar el orden de la figura matricial
public class Punto_4 {
    
    public static boolean digit(int a){
        boolean bandera;
        if(a<10){
            bandera=true;
        }
        else{
            bandera=false;
        }
        return bandera;
    }  
    
    public static void main(String[] args) {       
        int random,n,m;
        n=6;m=30;
        int[][] numeros=new int[n][m];
        boolean comp;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                random=(int)(Math.random()*10)+1;   
                numeros[i][j]=random;
            }     
        }
        System.out.print(" Estudiante  | ");
        for(int i=1;i<=30;i++){
                if(digit(i)==true){
                    System.out.print("  0"+i+" |");
                }
                else{
                    System.out.printf("  %d |",i);
                }
        }
        
        System.out.println("\n_____________|_____________________________________________________________________________________________________________________________________________________________________________________");        
        for(int i=0;i<n;i++){
            System.out.print("Asignatura "+(i+1)+" | ");
            for(int j=0;j<m;j++){
                if(digit(numeros[i][j])==true){
                    System.out.printf("  0%d |",numeros[i][j]);
                }
                else{
                    System.out.printf("  %d |",numeros[i][j]);
                } 
            }
            System.out.println("");           
        }
        
        //La media de nota por alumno, osea el promedio de notas de todas las asignauras
        System.out.println("\nLa media de nota por alumno");
        System.out.print(" Estudiante  | ");
        for(int i=1;i<=30;i++){
                if(digit(i)==true){
                    System.out.print("  0"+i+" |");
                }
                else{
                    System.out.printf("  %d |",i);
                }
        }
        System.out.println("\n_____________|______|_____|________________________________________________________________________________________________________________________________________________________________________");        
        System.out.print(" Promedio    | ");
        int sum;
        int prom;
        for(int i=0;i<m;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum=sum+numeros[j][i];
            }           
            prom=sum/6;
           
            System.out.print("  0"+prom+" |");
        }
        System.out.println("\n");
        
        //Promedio de notas por asignatura
        System.out.println("Promedio de notas por asignatura");
        int sum_1;
        int prom_1;
        for(int i=0;i<n;i++){
            System.out.print("Asignatura "+(i+1)+" | ");
            sum_1=0;
            for(int j=0;j<m;j++){
                    sum_1=sum_1+numeros[i][j];
            }
            prom_1=sum_1/30;
            System.out.println(prom_1);           
        }
    }
}
