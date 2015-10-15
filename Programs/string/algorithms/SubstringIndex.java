package com.string.algorithms;

public class SubstringIndex {
	public static void main(String[] args) {
		String hayStack = "ababbab";
		String needle = "abb";

		/*To do logic to return the needle occurrence in hayStack*/

		int index;

		SubstringIndex s = new SubstringIndex();
		index = s.getNeedleIndex(hayStack, needle);
		System.out.println(index);
	}

	public int getNeedleIndex(String hayStack, String needle){
		int index = -1;
		int loopVariable = 0;
		char[] hayStackArr =  hayStack.toCharArray();
		char[] needleArr = needle.toCharArray();

		for(int i=0; i<hayStackArr.length; i++){
			if((hayStackArr.length-i) >= needleArr.length){
				loopVariable = i;
				index = i;
				for(int j=0; j<needleArr.length && loopVariable<hayStackArr.length; j++){
					if(hayStackArr[loopVariable] == needleArr[j]){
						if(j==(needleArr.length-1))
							return index;
						loopVariable++;
					}
					else
						break;
				}
			}
			else{
				index = -1;
				return index;
			}
		}

		return index;
	}
}
