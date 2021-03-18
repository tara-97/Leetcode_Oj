

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){

            int N = sc.nextInt();
            String word = sc.next();
            String longest = findLongestRepeatingSubstring(N,word);
            if(longest == "") System.out.println("-1");
            else System.out.println(longest);

        }
    }
    public static String findLongestRepeatingSubstring(int N,String word){
        int start = 0;
        int end = 0;
        int maxLen = 0;
        String longest = "";
        while(end < N){
            String current = word.substring(start,end+1);
            if(word.indexOf(current,end+1) == -1) start++;
            else{
                if(end-start+1 > maxLen) {
                    maxLen = end-start+1;
                    longest = current;
                }
            }
            end++;
        }
        return longest;
    }
}