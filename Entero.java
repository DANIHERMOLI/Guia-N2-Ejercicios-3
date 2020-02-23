import java.util.Scanner;
/**
 * Este programa esta diseñado para hallar el promedio, número mayor y número menor de n numeros enteros.
 * @author (Daniela) 
 * @version (1.0)
 */
public class Entero
{
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
       
       //Datos de entrada

        int entero,val,mayor,menor;
       //Datos de salida
        double promedio;
        
        //Pregunta de entrada

        System.out.println("¿Cuantos numeros enteros quiere ingresar? ");

        entero=teclado.nextInt();
        
        //Cálculos y arreglos
        
        mayor=0;

        menor=1000000;

        promedio=0;

        for (int i=1;i<=entero;i++)

        {

            System.out.println("Número entero" + i+": ");

            val=teclado.nextInt();

            if (val>mayor)

            {

                mayor=val;

            }

            if (val<menor)

            {

                menor=val;

            }

            promedio=promedio+val;

        }

        promedio=promedio/entero;
        

        System.out.println("El numero mayor es: "+mayor+"\n");

        System.out.println("El numero menor es: "+menor+"\n");

        System.out.println("el promedio de los valores es: "+promedio);

    }

 

} 

    
    
    
    
    
    
    


