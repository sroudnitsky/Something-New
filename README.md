# Something-New

Team Something New -- Sean Roudnitsky, Shruthi Venkata, Derek Song  
APCS2 pd08  
L #01 -- What Does the Data Say? And how?  
2018-03-13  

# Background
Write Java class QuickSort, which will use partitioning to recursively sort an array of ints.

# Hypothesis  
your assessment of QuickSort’s Big-Oh runtime classification, abstracted to the algorithm level, in the  
    best case,  
    average or most likely case, and  
    worst case  

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
- Analysis of raw data  
- Time measurements?   
- how pivot selection and data arrangement affect execution time.  
- Mention any results that we can't explain
