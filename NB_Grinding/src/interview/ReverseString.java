/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview;

/**
 *
 * @author aglis
 */
public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("waaaa"));
        swap(10, 20);
        System.out.println(isContainsVowel("apa")+"|"+isContainsVowel("bbb"));
        System.out.println(isPrimeNumber(0)+"|"+isPrimeNumber(3)+"|"+isPrimeNumber(13));
    }
    
    public static String reverse(String text){
        if (text == null) {
            throw new IllegalArgumentException("String was null");
        } else {
            String reversed="";
            int length = text.length();
            for (int i=1; i<=length;i++){
                reversed = reversed+text.charAt(length-i);
            }
            return reversed;
        }
    }
    
    public static void swap(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + "|" + num2);
    }
    
    public static boolean isContainsVowel(String text){
        return text.toLowerCase().matches(".*[aeiou].*");
    }
    
    public static boolean isPrimeNumber(int number){
        if (number < 2 || (number!=2 && number%2==0)) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i=2; i <= number/2;i++) {
                if(number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
