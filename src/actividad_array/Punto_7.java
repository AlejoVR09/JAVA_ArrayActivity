package actividad_array;


public class Punto_7 {
    
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
        int random;
        int[][] numeros=new int[3][4];
        boolean comp;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                random=(int)(Math.random()*20)+1;
                comp=cont(numeros,random);
                while(comp==true){
                    random=(int)(Math.random()*20)+1;
                    comp=cont(numeros,random);
                }    
                numeros[i][j]=random;
            }     
        }
        
        System.out.println("La matriz contiene los siguientes valores");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("");           
        }
        
        int sum=0;
        float prom;
        int[] valores=new int[12];
        int cont_1=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                sum=sum+numeros[i][j];
                valores[cont_1]=numeros[i][j];
                cont_1++;
            }          
        }
        prom=(float)sum/12;
        System.out.println("Promedio: "+prom);
        int cont_2=0;
        for(int h=0;h<12;h++){
            if(valores[h]>prom){
                cont_2++;
            }
        }
        System.out.println("Hay "+cont_2+" valores mayores a la media");
        
        for(int h=0;h<12;h++){
            if(valores[h]>prom){
                System.out.print(valores[h]+" ");
            }
        }
        System.out.println("");   
    }    
}
