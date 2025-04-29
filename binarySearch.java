package buoi7_2;

public class binarySearch {
    public int binarySearch(int left, int right, int arr[], int target){
        if(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                return binarySearch(mid + 1, right, arr, target);
            } else {
                return binarySearch(left, mid-1, arr, target);
            }
        }
        return -1;
    }

    public int bs(int left, int right, int arr[], int target){
        if(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                mid = right - 1;
            } else {
                mid = left;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        binarySearch binary = new binarySearch();
        int arr[] = {2,4,6,8,10,12};
        int target = 3;

        int result = binary.binarySearch(0, arr.length-1, arr, target);
        if(result == -1){
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is not present in index: " + result);
        }
    }
}
