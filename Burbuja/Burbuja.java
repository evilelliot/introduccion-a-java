public class Burbuja
{
	void ordenar(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
   	void imprimir(int arr[]){ 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
	public static void main(String args[]){
        Burbuja ob = new Burbuja(); 
        int arr[] = {45, 22, 27, 234, 10, 19, 34}; 

        System.out.println("-- Ordenando un array con el metodo burbuja --\r\n"); 
        System.out.println("-- Array desordenado: --\r\n"); 
        ob.imprimir(arr); 

        System.out.println("-- Array ordenado: --\r\n"); 
        ob.ordenar(arr); 
        ob.imprimir(arr); 
	}
}