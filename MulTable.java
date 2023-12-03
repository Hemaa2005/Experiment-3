import java.io.*;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) 
    {
       Scanner obj = new Scanner(System.in);
       int i;
       int n = obj.nextInt();
       for(i=1;i<11;i++) 
       {
           System.out.println(n+" x "+i+" = "+i*n);
       }
    }
    
}
