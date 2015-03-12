package kata02;

public class BinarySearch {

	public static int searchIterative(int target, int[] sortedInts ){
		if(sortedInts.length == 0) return -1;
		if(sortedInts.length == 1) return target == sortedInts[0] ? 0 : -1;
		
		for(int start=0, end = sortedInts.length-1, pivot = (start+end)/2 ;start <= end;pivot = (end + start) / 2){
			if(target < sortedInts[pivot])	 end = pivot -1;
			else if(target > sortedInts[pivot])  start = pivot +1;
			else if(target == sortedInts[pivot]) return pivot;
			else return -1;
		}
		return -1;
    }
    
    public static int searchRecursive(int target, int[]sortedInts){
		if(sortedInts.length == 0) return -1;
		
		return searchRecursive(target, 0, sortedInts.length-1, sortedInts);
	}
	private static int searchRecursive(int target, int start, int end, int[] sortedInts){
		if(end < start) return -1;
		int pivot = (start+end)/2;
		
		if(target == sortedInts[pivot]) return pivot;
		else if(target < sortedInts[pivot]) return searchRecursive(target, start, pivot-1, sortedInts);
		else if(target > sortedInts[pivot]) return searchRecursive(target, pivot+1, end, sortedInts);
		else return -1;
    }
}
