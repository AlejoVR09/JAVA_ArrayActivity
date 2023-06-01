package actividad_array;

public class Punto_3 {
    
    
    public static boolean cont(int[] array,int num) {
        boolean bandera = false;

        for(int i=0;i<array.length;i++){
            if(array[i]==num) {
                bandera=true;
            }
        }
        return bandera; 
    }
    
    public static void main(String[] args) {
        
        int random;
        int[] numeros=new int[50];
        boolean comp;
        
        for(int i=0;i<50;i++){
            random=(int)(Math.random()*99)+1;
            comp=cont(numeros,random);
            while(comp==true){
                random=(int)(Math.random()*99)+1;
                comp=cont(numeros,random);
            }
            numeros[i]=random;   
        }
        System.out.println("El vector contiene los siguientes valores");
        for(int i=0;i<50;i++){
            System.out.print(numeros[i]+" ");          
        }
        System.out.println("");
        
        int sum=0;
        float prom;
        for(int i=0;i<50;i++){
            sum=sum+numeros[i];       
        }
        prom=(float)sum/50;
        System.out.println("Promedio: "+prom);
        System.out.println("Valores mayores al promedio");
        for(int i=0;i<50;i++){
            if(numeros[i]>prom){
                System.out.print(numeros[i]+" ");
            }       
        }
        System.out.println("");
    }    
}
