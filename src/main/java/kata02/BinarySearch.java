package kata02;

public class BinarySearch {

    public static int search(int target, int[] sortedInts ){
	
		for(int start=0, end = sortedInts.length-1, pivot = (start+end)/2 ;start <= end;pivot = (end + start) / 2){
			if(target < sortedInts[pivot])	     end = pivot -1;
			else if(target > sortedInts[pivot])  start = pivot +1;
			else if(target == sortedInts[pivot]) return pivot;
			else return -1;
		}
		return -1;
	}
}
