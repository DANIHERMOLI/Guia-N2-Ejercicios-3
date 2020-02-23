import java.util.Scanner;
/**
 * Este programa está diseñado para hallara la desviación estandar de un conjunto de n números. 
 * 
 * @author (Daniela) 
 * @version (2.0)
 */
public class Desviación
{
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
        
       //Datos de entrada
       double conjunto;
        double promedio;
        
        double varian;
       int c;
       //Datos de salida
       double desviación;
       
       System.out.println("Ingrese la cantidad de números del conjunto");
       c = teclado.nextInt();
       
       //Arreglos
       
       double conjuntos [] = new double [c];
        for(int i = 0; i<c;i++)
       {
        System.out.println("Ingrese los números");
        conjuntos[i]=teclado.nextDouble();  
        }
       
        //Cálculos
        double suma = 0;
        for (double i : conjuntos)
        {
         suma = suma + i;
        }
        promedio = suma/c;
        
        double total;
         for(int i =0; i<c;i++)
       {
         total = Math.pow(conjuntos[i]-promedio,2);
         varian = varian + total;
       }
       
        varian = varian / (c-1);
        
        desviación = Math.sqrt(varian);
        
        
        //Muestra de datos de salida
        
        System.out.println("La desviación del conjunto de numeros es" + desviación);
        
     
      
       
        
        
    }
}
