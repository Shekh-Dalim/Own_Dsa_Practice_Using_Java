import java.util.HashSet;

class FindDuplicateNumber {

    public static int findDuplicate(int arr[]) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                return arr[i];
            }

            set.add(arr[i]);
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(arr));
    }
}