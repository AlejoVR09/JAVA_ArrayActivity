package actividad_array;
//Tome en cuenta la composicion general de una familia que es: papa, mama, hijo/a y un familiar mas, ya sea otro hijo u abuela
//por lo tanto la en cada piso hay por lo menos 24 habitantes porque 6*4 lo que se ve reflejado en el numero random que da un valor entre 0 y 24
public class Punto_5 {
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
        n=7;m=20;
        int[][] numeros=new int[n][m];
        boolean comp;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                random=(int)(Math.random()*24)+1;   
                numeros[i][j]=random;
            }     
        }
        
        System.out.println("Cada torre por piso tiene habitantes");
        System.out.print(" Pisos   |");

        for(int i=1;i<=20;i++){
                if(digit(i)==true){
                    System.out.printf("  0%d |",i);
                }
                else{
                    System.out.printf("  %d |",i);
                }
        }
        System.out.println("\n__________________________________________________________________________________________________________________________________");        

        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.print("Torre "+(i+1)+" | ");
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
        
        //Cantidad total de habitantes en el complejo
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum=sum+numeros[i][j];
            }

        }
        
        System.out.println("\nLa cantidad total de habitantes del complejo es: "+sum+" \n");
        
        //Promedio de habitantes por piso
        System.out.println("Promedio de habitantes por piso");
        int sum_1;
        int prom;
        for(int i=0;i<7;i++){
            sum_1=0;
            for(int j=0;j<20;j++){
                sum_1=sum_1+numeros[i][j];
            }           
            prom=sum_1/20;
            System.out.println("Torre "+(i+1));
            System.out.println("Promedio: "+prom);
        }        
        
        
        //Promedio de habitantes por torre
        System.out.println("\nPromedio de habitantes por torre");
        int prom_1;         
        prom_1=sum/7;
        System.out.println("Promedio: "+prom_1);
        
    }     
}
