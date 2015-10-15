
public class DoubleSquares {

	public static void main(String[] args) {
		doubleSquare(874566596);
	}
	
	public static void doubleSquare(double number){
		
		double loopNumber = Math.sqrt(number);
		int count = 0;
		
		for(int firstSquare=0; firstSquare<=(int)loopNumber; firstSquare++){
			double secondSquareCheck = (number - (firstSquare*firstSquare));
			double secondSquare = Math.sqrt(secondSquareCheck);
			if((secondSquare - (int)secondSquare) == 0.0){
				System.out.println(firstSquare + " " + secondSquare);
				count++;
			}
		}
		System.out.print(number + " ==> " + (count/2));
		
	}

}
