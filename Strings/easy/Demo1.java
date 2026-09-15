// Reverse String

import java.util.Stack;

public class Demo1 {

    // Valid Palindrome II
    static boolean palindromeII(String s) {
        if (palindrome(s)) {
            return true;
        }

        char [] arr = new char[s.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }

    }
    // Valid Palindrome
    static boolean palindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            
            if (!isAlphNum(l)) {
                left++;
            }
            else if (!isAlphNum(r)) {
                right--;
            }
            else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
            }

            left++;
            right--;
        
        }

        return true;        
    }

    static boolean isAlphNum(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '1' && c <= '9');
    }

    static String reverse(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();

    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        // char [] temp = new char[s.length];

        // for(int i = 0; i< s.length; i++) {
        //     temp[i] = s[i];
        // }   
        // int index = 0;
        // for(int i = temp.length - 1; i >= 0; i--) {
        //     s[index] = temp[i];
        //     index++;
        // }
    }

    public static void main(String[] args) {
        
        String s = new String("Bhagwat");
        // System.out.println(reverse(s));
        // System.out.println(s);

        System.out.println(palindrome(s));
    }
}