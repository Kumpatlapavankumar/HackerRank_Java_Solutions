import java.util.*;
import java.io.*;
//result the code
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int res=a;
            for(int j=0;j<n;j++){
                res=res+b*(int)Math.pow(2,j);
                System.out.print(res +" ");
            }
            System.out.println();
        }
        in.close();
    }
}
