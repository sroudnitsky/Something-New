public class QuickSortTester {
    
    public static void main(String [] args) {

	int i = 1;

	QuickSort arr = new QuickSort();

	while (i < 100000) {
	    
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
