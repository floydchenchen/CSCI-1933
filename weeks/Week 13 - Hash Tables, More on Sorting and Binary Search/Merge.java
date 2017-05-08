// Merge.java
// Merge sort algorithm implementation
// Requires extra space the size of the original array
// Time complexity is O(nlogn), but can you show this is true by analysis?

public class Merge {


public static int count = 0;
public static int mergeCount = 0;

public static void print(int[] a) {
// array printing utility for testing and debugging
    for (int i = 0; i < a.length; i++) 
        System.out.print(a[i] + " ");
    System.out.println();
}  // print

public static void merge(int[] a, int start, int mid, int end, int[] temp) {
// merges two sorted array segments into one sorted array segment
// a: array where merge items are found
// start: start index of first segment to merge
// mid: end index of first segment to merge  (runs from start ... end)
// end: end index of second segment to merge (runs from mid + 1 ... end)
// temp: temporary array used to do merging

    int ptr1 = start;
    int ptr2 = mid + 1;
    int resPtr = start;
 
    mergeCount++;
    System.out.println("start = " + start + "; mid = " + mid + "; end = " + end);

    while (ptr1 <= mid && ptr2 <= end)
        if (a[ptr1] <= a[ptr2])
          temp[resPtr++] = a[ptr1++];
        else temp[resPtr++] = a[ptr2++];

    if (ptr1 <= mid)  // copy rest of 1st half to temp
      for (int i = ptr1; i <= mid; i++)
        temp[resPtr++] = a[i];
    else  // copy rest of 2nd half to temp
      for (int i = ptr2; i <= end; i++)
        temp[resPtr++] = a[i];
    System.arraycopy(temp, start, a, start, end - start + 1);
}  // merge
    
public static void mergeSort(int[] a, int start, int end, int[] temp) {
    count++;
// divide and conquer algorithm to merge sort an array segment
    if (start < end) {
        int mid = (start + end) / 2;
        System.out.println("MergeSort: start = " + start + "; mid = " + mid + "; end = " + end);
        mergeSort(a, start, mid, temp);
        mergeSort(a, mid + 1, end, temp);
        merge(a, start, mid, end, temp);
    }
}  // mergeSort

public static void main(String[] args) {
    int[] a = {1, 11, 12, 15, 14}; //, -2, -5, 100, 101, 17};
// , 19, 14, 20, 9, 7, 8, 6, 4, 1, 0, 6, 4, 1, 8};

    int[] temp = new int[a.length];
    System.out.println("Original array:");
    print(a);
    System.out.println();
    mergeSort(a, 0, a.length - 1, temp);
    System.out.println("Sorted array:");
    print(a);
    System.out.println("number of calls to mergeSort: " + count);
    System.out.println("number of calls to merge: " + mergeCount);
    
}  // main
}  // Merge
