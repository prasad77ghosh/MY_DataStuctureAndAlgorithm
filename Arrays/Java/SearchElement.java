package Arrays.Java;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter the number of element in an array:- ");
      int n = input.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++){
        arr[i] = input.nextInt();
      }

      System.out.print("Enter the target number:- ");
      int target = input.nextInt();
      // int ans = linearSearch(arr, target);
      int ans2 = binarySearch(arr, target);
      // System.out.println(ans);
      System.out.println(ans2);
    }
  }
  
  //Time complexity O(n) and Space complexity O(1)
  public static int linearSearch(int[] arr, int target){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == target)
        return i;
    }
    return -1;
  }

  public static int binarySearch(int[] arr, int target){
    Arrays.sort(arr);
    int start = 0;
    int last = arr.length - 1;

    while(start <= last){
      int mid = start + last / 2;
      if(arr[mid] > target){
        last = mid - 1;
      }else if(arr[mid] < target){
        start = mid + 1;
      }else{
        return mid;
      }
    }

    return -1;
  }
}
