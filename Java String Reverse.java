import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String str="Yes";
        for(int i=0; i<A.length()/2; i++){
            if(A.charAt(i)!=A.charAt(A.length()-i-1)){
                str="No";
            }
        }System.out.println(str);
    }
}



