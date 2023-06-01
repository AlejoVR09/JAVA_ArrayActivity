package actividad_array;

public class Punto_2 {
    
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
        int[] numeros=new int[15];
        boolean comp;
        
        for(int i=0;i<15;i++){
            random=(int)(Math.random()*20)+1;
            comp=cont(numeros,random);
            while(comp==true){
                random=(int)(Math.random()*20)+1;
                comp=cont(numeros,random);
            }
            numeros[i]=random;   
        }
        System.out.println("El vector contiene los siguientes valores");
        for(int i=0;i<15;i++){
            System.out.print(numeros[i]+" ");          
        }
        System.out.println("");
    }
}
