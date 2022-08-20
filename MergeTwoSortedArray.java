/*
Given two sorted arrays arr1[] and arr2[] of sizes n and m in
 non-decreasing order. Merge them in sorted order without using any extra space. 
 Modify arr1 so that it contains the first N elements and modify arr2 so that it
  contains the last M elements.
  Input: 
    n = 4, arr1[] = [1 3 5 7] 
    m = 5, arr2[] = [0 2 6 8 9]
    Output: 
    arr1[] = [0 1 2 3]
    arr2[] = [5 6 7 8 9]

    1 3 5 7  ------ 0 2 6 8 9
    0 3 5 7 --------1 2 6 8 9 
    0 1 5 7 ----- 3 2 6 8 9 
    0 1 3 7 -------5 2 6 8 9 
    0 1 3 5 -------7 2 6 8 9 
    0 1 3 5 ------

    4 5 7 2 6 8 9 
    
*/
class MergeTwoSortedArray{
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
       int i=0;
       int j=0;
       int k=n-1;
       while(i<n && j<m)
       {
           if(arr1[i]<=arr2[j])
           {
               i++;
           }
           else if(arr1[i]>arr2[j]){
               long temp=arr1[k];
               arr1[k]=arr2[j];
               arr2[j]=temp;
               j++;
               k--;
           }
       }
       Arrays.sort(arr1);
       Arrays.sort(arr2);
    }
}