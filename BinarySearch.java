public class BinarySearch {

    public static int binarySearch(int arr[], int target) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                s = mid + 1;
            } else {
                s = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int result = binarySearch(arr, target);

        System.out.println("Index: " + result);
    }
}