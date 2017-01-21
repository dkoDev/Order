package com.dko.ordenamiento;

public class Order {

	public static void main(String[] args) {
		
		int num=9,y=0;
		int array_int []={49,62,73,23,63,86,58,85,47,65}; //new int[num];
		
		int aux=0;
		for (int i = 0; i < array_int.length-1; i++) {
			
			for (int j =0; j < array_int.length-1; j++) {
				if(array_int [j]>=array_int [j+1]){
					
					aux=array_int [j];
					array_int [j]=array_int [j+1];
					array_int [j+1]=aux;
					
					//System.out.println("J: "+j+" J+1: "+(j+1));
					//System.out.println("array[j]: "+array_int[j]+" array[j+1:] "+array_int[j+1]);
					
					
				}
				
				
				
			}
			
			
		}
		
		for (int x : array_int) {
			System.out.print(x+" ");
		}
		

	}

}
