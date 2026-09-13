
import java.util.HashMap;


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

/************** using Xor If one unique number present *****************/

// public class Find_The_unique_Element {

//     public static void main(String[] args) {

//         int arr[] = {2, 3, 5, 3, 2};

//         int unique = 0;

//         for (int i = 0; i < arr.length; i++) {
//             unique = unique ^ arr[i];
//         }

//         System.out.println("Unique element: " + unique);
//     }
// }


/************** usinging HashMap If multiple unique number present *****************/


// import java.util.HashMap;

// class Find_The_unique_Element {

//     public static void print_Unique_Ele(int arr[]) {

//         HashMap<Integer, Integer> map = new HashMap<>();

//         // Count elements
//         for (int i = 0; i < arr.length; i++) {

//             if (map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i]) + 1);
//             } else {
//                 map.put(arr[i], 1);
//             }
//         }

//         // Print unique elements
//         for (int i = 0; i < arr.length; i++) {

//             if (map.get(arr[i]) == 1) {
//                 System.out.println(arr[i]);
//             }
//         }
//     }

//     public static void main(String args[]) {

//         int arr[] = {1, 2, 1, 2, 3, 4};

//         print_Unique_Ele(arr);
//     }
// }


/************** usinging HashMap If multiple unique String present *****************/

// class Find_The_unique_Element {

//     public static void uniqueEle(String str){

//         HashMap<Character, Integer> map= new HashMap<>();

//         for(int i = 0; i< str.length(); i++ ){

//             char ch = str.charAt(i);

//             if(map.containsKey(ch)){
//                 map.put(ch, map.get(ch)+1); // map.get(ch) one char appear How many time 
//             }
//             else{
//                 map.put(ch, 1);
//             }
//         }

//         for(int i = 0; i< str.length(); i++){

//             char ch = str.charAt(i);

//             if(map.get(ch) == 1){
//                 System.out.print(ch+", ");
//             }
//         }
//     }


//     public static void main(String args[]) {
//         String str = "dadalm";
//         uniqueEle(str);
//     }
// }



/************** usinging HashMap ,First repeating element *****************/

import java.util.HashMap;

class Find_The_Repeating_Element {

    public static void repeatingEle(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Find the first repeating character
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.get(ch) > 1) {
                System.out.println("First repeating element: " + ch);
                break;
            }
        }
    }

    public static void main(String[] args) {

        String str = "dadalm";

        repeatingEle(str);
    }
}