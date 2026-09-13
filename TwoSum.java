

//************************************  Using Set ************************************

// import java.util.HashSet;
// class TwoSum {

//     public static void twoSum(int arr[], int target) {

//         HashSet<Integer> set = new HashSet<>();

//         for (int i = 0; i < arr.length; i++) {

//             int required = target - arr[i];  // b = target - a

//             if (set.contains(required)) {   // Check whether required is already present inside the HashSet.
//                 System.out.println(required + " " + arr[i]);
//             }
//             set.add(arr[i]);
//         }
//     }

//     public static void main(String args[]) {

//         int arr[] = {1, 2, 3, 4, 5, 6};
//         int target = 6;

//         twoSum(arr, target);
//     }
// }


//************************************  Using Map ************************************


import java.util.HashMap;

class TwoSum {

    public static void twoSum(int arr[], int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int b = target - arr[i];

            if (map.containsKey(b)) {
                System.out.println(b + " " + arr[i]);
            }
            map.put(arr[i],i);
        }
    }

    public static void main(String args[]) {

        int arr[] = { 2,3,1,4};
        int target = 5;
        twoSum(arr, target);

    }
}