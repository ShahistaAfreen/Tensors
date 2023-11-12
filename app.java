import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;
import java.util.Map.Entry;

public class app{

    public static boolean Challenge1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine();

        int l = s.length();
        for(int i =0; i<=l/2;i++){
            if(s.charAt(i) != s.charAt(l-1-i)){
                return false;
            }
        }
        return true;
    }


    public static int[] challenge2(int n){
        int[] fibonacciSequence = new int[n];
        if (n >= 1) {
            fibonacciSequence[0] = 0;
        }
        if (n >= 2) {
            fibonacciSequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        return fibonacciSequence;
    }

    public static void challenge3(String text){
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.split("\\s+");
        

        for(int i =0; i< words.length;i++) {
          words[i] = words[i].toLowerCase();
        }

        for(String word : words){
            if(!wordFrequency.containsKey(word)){
                wordFrequency.put(word,1);
            }
            else{
                int count = wordFrequency.get(word);
                count++;
                wordFrequency.put(word,count);
            }
        }
         Set<String> keys = wordFrequency.keySet();

          for(String word : words){
           int count = wordFrequency.get(word);
           System.out.println(word + " : " +count);
          }
    }
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please select an option from below :");
    System.out.println("Enter 1 for Challenge-1 " +':' + " Testing a palindrome");
    System.out.println("Enter 2 for Challenge-2 " +':' + " Outputting first 'n' Fibonaccinumbers");
    System.out.println("Enter 3 for Challenge-3 " +":"+ " The word counter");

    int a = sc.nextInt();

    if(a == 1){
     System.out.println(Challenge1());
    }
    else if(a == 2){
     System.out.println("Enter n");
     int n = sc.nextInt();
       if(n < 0){
        System.out.println("Please Enter a valid positive number");
       }
       else{
        int[] fs = challenge2(n);
        System.out.println("Fibonacci sequence for n=" + n + ": " + Arrays.toString(fs));
       }
    }
    else if(a ==3){
        System.out.println("Input a sentence");
        String s = sc.nextLine();
        challenge3(s);
    }
    else{
        System.out.println("Inavlid Input, Please choose a number from 1,2 and 3");
    }
}
}