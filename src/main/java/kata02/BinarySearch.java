package kata02;

public class BinarySearch {

    public static int search(int target, int[] sortedInts ){

//	if(sortedInts.length == 0) return -1;
//	if(sortedInts.length == 1) return target == sortedInts[0] ? 0 : -1;
	
	int start = 0;
	int end = sortedInts.length -1;
	int pivot = sortedInts.length / 2;
	
	for(;start <= end;pivot = (end + start) / 2){
	    if(target == sortedInts[pivot]) return pivot;
	    else if(target < sortedInts[pivot])	end = pivot -1;
	    else if(target > sortedInts[pivot]) start = pivot +1;
	    else return -1;
	}
	return -1;
    }
}
