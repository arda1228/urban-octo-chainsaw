// class Solution {
//     public boolean isValid(String s) {
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '{' && s.charAt(i + 1) != '}') {
//                 // if (s.charAt(i + 1) != '}') {
//                     System.out.println("squiggly error");
//                     return false;
//                 // }
//             }
//             if (s.charAt(i) == '(' && (s.charAt(i + 1) != ')')) {
//                     System.out.println("normal error");
//                     return false;
//                 // }
//             }
//             if (s.charAt(i) == '[' && (s.charAt(i + 1) != ']')) {
//                 // if (s.charAt(i + 1) != ']') {
//                     System.out.println("square error");
//                     return false;
//                 // }
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Solution test = new Solution();
//         System.out.println(test.isValid("()[]{}"));
//     }
// }

import java.util.*;

class Solution {
    public boolean plusOne(int[] digits) {
        int total = 0;
        int power = 0;
        // concatenate, change to int, add 1, separate again
        for (int i = digits.length - 1; i > -1; i--) {
            total += ((digits[i]) * Math.pow(10, power));
            power++;
        }
        int i = 0;
        total++;
        // BACKWARDS Collections.reverse(Arrays.asList(result))
        ArrayList<Integer> result1 = new ArrayList<Integer>();
        while (total > 0) {
            result1.add(total % 10);
            total = total / 10;
            i++;
        }
        System.out.println("result1:"+ result1);
        while (total > 0) {
            result1.add(total % 10);
            total = total / 10;
            i++;
        }
        // Integer[] array = list.toArray(new Integer[0]);
        // trying to get arraylist into array
        int[] result = new int[result1.size()];
        
        //int[] result = result1.toArray(new Integer[0]);
        //int[] result = result1.toArray(new int[result1.length]);
       // System.out.println((Collections.reverse(Arrays.asList(result));
        System.out.println("result:"+ result);

        return true;
    }

    public static void main(String[] args) {
        Solution test = new Solution();
        int[] digits = { 4, 3, 2, 1 };
        System.out.println(test.plusOne(digits));
    }
}