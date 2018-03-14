/* Timing Mechanism
Using System.nanoTime(), we kept track of when we started a quicksort, 
and subracted that time from the time that the sort is completed and 
printed this elapsed time into the terminal. 

We did this for increasingly larger sized arrays by using a while
loop and raising the size of the array by a desired incremnt.
*/



public class QuickSortTester {
    
    public static void main(String [] args) {

	int i = 1;

	QuickSort arr = new QuickSort();

	while (i < 40000) {
	    
	    long start, elapsed;
	    int[] array = arr.buildArray(i, 1000);

	    arr.shuffle(array);

	    start = System.nanoTime();

	    arr.qsort(array);

	    elapsed = System.nanoTime() - start;

	    System.out.println(elapsed);

	    i += 1;
	}
    }
}
