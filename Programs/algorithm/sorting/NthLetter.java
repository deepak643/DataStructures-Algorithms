//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class NthLetter {
//	public static void main(String[] args) {
//		String original = "tAviekTbb";
//		String[] stringArray = original.split("");
//		ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(stringArray));
//		CaseComparator ignoringCase = new CaseComparator();
//		Collections.sort(stringArrayList, ignoringCase);
//		System.out.println(stringArrayList);
//		
//		char startSequence = 'r';
//		int startSequenceIndex = 0;
//		for(int i=0; i<stringArrayList.size(); i++){
//			if(stringArrayList.get(i).toLowerCase().charAt(0) > startSequence ){
//				startSequenceIndex = i;
//				//System.out.println(startSequenceIndex + " " + stringArrayList.get(i));
//				break;
//			}
//		}
//		//System.out.println(stringArrayList.size());
//		int getNthFromStartSequence = 7;
//		int retrievingCharIndex;
//		if((startSequenceIndex + getNthFromStartSequence) <= stringArrayList.size()){
//			retrievingCharIndex = startSequenceIndex + getNthFromStartSequence;
//			System.out.println(stringArrayList.get(retrievingCharIndex-1));
//		}else{
//			System.out.println("Need to be implemented");
//			retrievingCharIndex = startSequenceIndex + getNthFromStartSequence - stringArrayList.size();
//			System.out.println(stringArrayList.get(retrievingCharIndex-1));
//		}
//		
//	}
//}
//
//class CaseComparator implements Comparator<String>{
//
//	@Override
//	public int compare(String o1, String o2) {
//		return o1.compareToIgnoreCase(o2);
//	}
//	
//}
