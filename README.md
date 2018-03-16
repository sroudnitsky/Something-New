# Something-New

Team Something New -- Sean Roudnitsky, Shruthi Venkata, Derek Song  
APCS2 pd08  
L #01 -- What Does the Data Say? And how?  
2018-03-13  

# Background
Write Java class QuickSort, which will use partitioning to recursively sort an array of ints. Develop and implement a mechanism for timing your QuickSort implementation. Assess the Big-Oh runtime classifacation in the best case, average case, and the worst case.

# Hypothesis  
We judged that `partition()` is O(n) because every part of the method is in constant time except for the for loop, which at most swaps n times. Knowing this, we believe that the best case scenario for QuickSort would be inputting an array where in every call to the qsort helper, the last element in the subarray, which is used as a pivot, ends up in the center of the subarray, and qsort performs on two smaller subarrays of equal length to its right and left. This way, the helper has to run log(n) times. In an average-runtime scenario, with a shuffled array, there would be about as many calls to the helper as in the best-case scenario, or log(n), because the pivot would end up somewhere in the middle, or the number of times it created a longer subarray to the left would balance the number of times it did so to the right. In a worst-case scenario, the array is in ascending (sorted) or descending order. If this is the case, the pivot value always ends up in the first or last position, depending on the order, and there have to be n calls to the qsort helper function. The runtime would be the number of calls to qsort times the number of times `partition()` has to be  called. In summary, we hypothesize that:  
  
For the best and average cases, the big-O runtime of QuickSort would be O(nlogn).  
For the worst case, the big-O runtime would be O(n^2).

# Experiment Methodology
In QuickSortTester.java, the main method contains a while loop that randomly populates an array of n elements, starting at 1 and incrementing by 1 up to a 100000-element array. Each time, it uses System.currenttimemillis to determine the amount of time that has elapsed from the start to end of the qsort() method (which uses the algorithm to sort the array). These values are stored in a csv file when, in the terminal, you run by entering `java QuickSortTester >>Data.csv`.

Pseudocode explaining the qsort algorithm:  
QSort(arr):
   algo qsort(arr,left,right) {  
      if left < right  
         pvtPos = postition(arr,left,right)  
            qsort(arr,left,pvtpos-1)  
            qsort(arr,pvtPos+1, right)  

# Results
Link to spreadsheets with graphs:  
https://drive.google.com/drive/folders/1cz-UhGsdMt5WLNXR-fTyKjkpyfpCJkc6?usp=sharing  

# Conclusion
When we performed QuickSort on randomly-generated arrays of increasing length, the runtime to sort each array a new data point, the data generated an linear, slightly concave-up curve. This was due to the fact that as our n value increased, there was a increased runtime--the graph did match most closely to that of O(nlogn), confirming our average-runtime hypothesis. If the best case or worst case occurred, then there would be a huge spike or drop in runtime. Such results were prominent after the n value went beyond 40000. 
