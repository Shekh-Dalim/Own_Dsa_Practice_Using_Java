
// class Find_The_unique_Element {

//     public static void print_Unique_Ele(int arr[]) {
//         int size = arr.length;
//         for (int i = 0; i < size - 1; i++) {
//             for (int j = i + 1; j < size; j++) {
//                 if (arr[i] == arr[j]) {
//                     arr[j] = -1;
//                     arr[i] = -1;
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {

//         int arr[] = { 1, 2, 1, 2, 3, 4 };
//         print_Unique_Ele(arr);
//         for(int i = 0; i < arr.length;i++){
//             if(arr[i] != -1){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }


// class Find_The_unique_Element {

//     public static void print_Unique_Ele(int arr[]) {
//         int size = arr.length;
        
//         for (int i = 0; i < size; i++) {
//             boolean isUnique = true;
//             for (int j = 0; j < size; j++) {
//                 if(i != j && arr[i] == arr[j]){
//                     isUnique = false;
//                     break;
//                 }
//             }

//             if(isUnique){
//                 System.out.println(arr[i]);
//             }
//         }
//     }

//     public static void main(String args[]) {

//         int arr[] = { 1, 2, 1, 2, 3, 4 };
//         print_Unique_Ele(arr);

//     }
// }


import java.util.HashMap;

class Find_The_unique_Element {

    public static void print_Unique_Ele(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count elements
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Print unique elements
        for (int i = 0; i < arr.length; i++) {

            if (map.get(arr[i]) == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 1, 2, 3, 4};

        print_Unique_Ele(arr);
    }
}