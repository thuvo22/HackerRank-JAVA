import java.io.*;
import java.util.*;

public class Solution {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
         while(n>0){    
             if (n%2==1){
                 sum++;
             }else {
                 sum=0;
                 }
         n=n/2;
         }
        System.out.println(sum);
        } 
    }
