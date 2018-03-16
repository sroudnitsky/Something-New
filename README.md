# Something-New

Team Something New -- Sean Roudnitsky, Shruthi Venkata, Derek Song  
APCS2 pd08  
L #01 -- What Does the Data Say? And how?  
2018-03-13  

# Background
Write Java class QuickSort, which will use partitioning to recursively sort an array of ints. Develop and implement a mechanism for timing your QuickSort implementation. Assess the Big-Oh runtime classifacation in the best case, average case, and the worst case.

# Hypothesis  
For best case, our group believes that the big-O runtime would be O(nlogn)
For worse case, our group believes that the big-O runtime would be O(n^2)
For average cases, our group believes that the big-O runtime would be O(n)

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
Overall, when we put random data points, we got a linear or slightly exponential curve and this was due to the fact that as our n value increased, there was a increased runtime. If the best case or worst case occurred, then there would be a huge spike or drop in runtime. Such results were prominent after the n value went beyond 40000. 
