import java.util.Scanner;

public class LowerBound {

    public static int findlowerbound(int[] arr , int target) {
        int n = arr.length;
        int lb = n;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= target){
                lb = Math.min(lb,mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return lb;
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

        int result = findlowerbound(arr, target);
        System.out.println("The lower bound of this array is :"+result);
    }
}
