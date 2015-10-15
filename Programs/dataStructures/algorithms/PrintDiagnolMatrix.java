package com.practice.dataStructures.algorithms;

public class PrintDiagnolMatrix {
	public static void main(String[] args) {
		int rowLength= 9;
		int columnLength = 7;
		int diagnolLength = 0;
		
		if(rowLength > 0 && columnLength > 0){
			diagnolLength = highestDiagnol(rowLength, columnLength, diagnolLength);
			int numberOfDiagnols = (diagnolLength);
			//System.out.println("Total number of diagnols: "+ numberOfDiagnols);
		}
			
		int matrix[][] = new int[6][6] ;
		printDiagnols(matrix);
	}
	
	public static int highestDiagnol(int rowLength, int columnLength, int diagnolLength){
		if(rowLength == columnLength){
			diagnolLength = rowLength;
			return diagnolLength;
		}
		else if(rowLength < columnLength){
			columnLength --;
			diagnolLength = highestDiagnol(rowLength, columnLength, diagnolLength);
		}
		else if(rowLength > columnLength){
			rowLength --;
			diagnolLength = highestDiagnol(rowLength, columnLength, diagnolLength);
		}
			
		return diagnolLength;
	}
	
	public static void printDiagnols(int matrix[][]){
		
		matrix[0][0] = 0;  matrix[0][1] = 1;  matrix[0][2] = 2;  matrix[0][3] = 3;  matrix[0][4] = 4;  matrix[0][5] = 5; 
		matrix[1][0] = 10; matrix[1][1] = 11; matrix[1][2] = 12; matrix[1][3] = 13; matrix[1][4] = 14; matrix[1][5] = 15;
		matrix[2][0] = 20; matrix[2][1] = 21; matrix[2][2] = 22; matrix[2][3] = 23; matrix[2][4] = 24; matrix[2][5] = 25;
		matrix[3][0] = 30; matrix[3][1] = 31; matrix[3][2] = 32; matrix[3][3] = 33; matrix[3][4] = 34; matrix[3][5] = 35;
		matrix[4][0] = 40; matrix[4][1] = 41; matrix[4][2] = 42; matrix[4][3] = 43; matrix[4][4] = 44; matrix[4][5] = 45;
		matrix[5][0] = 50; matrix[5][1] = 51; matrix[5][2] = 52; matrix[5][3] = 53; matrix[5][4] = 54; matrix[5][5] = 55;
		
		
		
		/** 0, 11, 22, 33, 44, 55
		 ** 1, 12, 23, 34, 45,
		 ** 2, 13, 24, 35
		 ** 3, 14, 25
		 ** 4, 15
		 ** 5
		**/
		
		/**
		 * 00, 01, 02, 03, 04
		 * 10, 11, 12 ,13, 14
		 * 20. 21, 22, 23, 24
		 * 30, 31, 32, 33, 34
		 * 40, 41, 42, 43, 44
		 **/
		
		int rowLength = 6;
		int columnLength = 6;
		
		int diagnolLength = 6;
		int i = 0; int j = 0;
		
		for(int k=0; k < diagnolLength; k++){
			
			j=k;
			for(i=0; isMatrixElement(i, j, rowLength, columnLength); i++){
				System.out.print(matrix[i][j] + "	");
				j++;
			}
			System.out.println();
			
			i=k;
			if(i!=0){
				for(j=0; isMatrixElement(i, j, rowLength, columnLength); j++){
					System.out.print(matrix[i][j] + "	");
					i++;
				}
				System.out.println();
			}
		}
	}

		private static boolean isMatrixElement(int i, int j, int rowLength, int columnLength) {
			return (i < rowLength) && (j < columnLength);
		}

}
