import java.util.Scanner;
/**
 * Este programa esta diseñado para hallar los valores no repetidos entre dos vectores.
 * 
 * @author (Daniela) 
 * @version (3.0)
 */
public class Vectores
{
     public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      //Datos de entrada
      int N =0;
      int P =0;
      int A[];
      int B[];
      //Datos de salida
      int C[];
      //Preguntas de entrada
      System.out.println("Ingrese el tamaño del arreglo A");
	N = in.nextInt();
	A = new int[N];
      System.out.println("Ingrese el tamaño del arreglo B");
	P = in.nextInt();
	B = new int[P];
	
       for(int i=0; i <N; i++)
       {
	System.out.println("Elementos del vector A");
	A[i] =in.nextInt();
       }
       
       for(int l=0; l <P; l++)
       {
	System.out.println("Elementos del vector B");
	B[l] =in.nextInt();
       }
    
       //Tamaño del arreglo C
       boolean existe = false;
	int count=0;
	for(int u=0; u <A.length;  u++)
	{
			for(int z=0; z< B.length; z++)
			{
				if(A[u]==B[z])
				{
					existe=true;
				}
			}
			if(existe==false)
			{
				count++;
			}
			existe=false;
	}
	
	
	C = new int[P+count];
	boolean existe0 = false;
	int count0=0;
	for(int j=0; j <A.length;  j++)
	{
			for(int z=0; z< B.length; z++)
			{
				if(A[j]==B[z])
				{
					existe=true;
				}
			}
			if(existe==false)
			{
				C[count]=A[j];
				count++;
			}
			existe=false;
	}
	 
	
	 for(int z=0; z< B.length; z++)
	 {
			C[count]=B[z];
			count++;
	}
 
	for(int s=0; s <C.length; s++)
	{
			System.out.println(C[s]);
	}
   }

}
 