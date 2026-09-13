public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int arr[]) {

        int n = arr.length;
        int result[] = new int[n];

        // Prefix product
        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * arr[i - 1];
        }

        // Suffix product
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * arr[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        int result[] = productExceptSelf(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}