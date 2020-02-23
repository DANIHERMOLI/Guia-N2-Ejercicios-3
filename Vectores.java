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
      
      int N =0;//numero de elementos del arreglo A
      int P =0;//numero de elementos del arreglo B
      int A[];
      int B[];
      int C[];
      
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
       
       for(int k=0; k <P; k++)
       {
	System.out.println("Elementos del vector B");
	B[k] =in.nextInt();
       }
    
       //Tamaño del arreglo C
       boolean existe = false;
	int count=0;
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
				count++;
			}
			existe=false;
	}
	
	//Elementos del vector A que aparecen en el vector B
	
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
	 
	 //Elementos del vecto B que aparecen en el vector A
	 for(int z=0; z< B.length; z++)
	 {
			C[count]=B[z];
			count++;
	}
 
	for(int x=0; x <C.length; x++)
	{
			System.out.println(C[x]);
	}
   }

}
 