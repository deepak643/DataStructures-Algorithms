package com.practice.dataStructures.algorithms;

public class PrintDiagnolMatrixTest {
	public static void main(String[] args) {
		int rowLength= 4;
		int columnLength = 6;
		int diagnolLength = 0;
		
		if(rowLength > 0 && columnLength > 0){
			diagnolLength = highestDiagnol(rowLength, columnLength, diagnolLength);
			int numberOfDiagnols = diagnolLength;
			System.out.println("Total number of diagnols: "+ numberOfDiagnols);
		}
			
		int matrix[][] = new int[10][10] ;
		printDiagnols(matrix);
	}
	
	public static int highestDiagnol(int rowLength, int columnLength, int diagnolLength){
		/*if(rowLength == columnLength){
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
			
		return diagnolLength;*/
		diagnolLength = columnLength + rowLength -1;
		return diagnolLength;
	}
	
	public static void printDiagnols(int matrix[][]){
		
		matrix[0][0] = 0;  matrix[0][1] = 1;  matrix[0][2] = 2;  matrix[0][3] = 3;  matrix[0][4] = 4;  matrix[0][5] = 5;  matrix[0][6] = 6;   matrix[0][7] = 7;
		matrix[1][0] = 10; matrix[1][1] = 11; matrix[1][2] = 12; matrix[1][3] = 13; matrix[1][4] = 14; matrix[1][5] = 15; matrix[1][6] = 16;  matrix[1][7] = 17;
		matrix[2][0] = 20; matrix[2][1] = 21; matrix[2][2] = 22; matrix[2][3] = 23; matrix[2][4] = 24; matrix[2][5] = 25; matrix[2][6] = 26;  matrix[2][7] = 27;
		
		
		/** 20
		 ** 10	21
		 ** 0	11	22
		 ** 1	12	23
		 ** 2	13	24
		 ** 3	14	25
		 ** 4	15	26
		 ** 5	16	27
		 ** 6	17
		 ** 7
		**/
		
		
		int rowLength = 3;
		int columnLength = 8;
		
		int numberOfDiagnols = 10;
		int i = 0; int j = 0;
		
		for(int k=0; k < numberOfDiagnols; k++){
			
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
