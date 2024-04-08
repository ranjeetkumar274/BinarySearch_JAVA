import java.util.Scanner;
public class Basics {
    public static int binarysearchbasics(int[] arr,int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(target < arr[mid]) high = mid-1;
            else if(target > arr[mid]) low = mid+1;
            else if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.print("enter the digits of the array : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println("Enter the element you want to search : ");
        int target = sc.nextInt();

        int result = binarysearchbasics(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
