package zuoye1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N=1;
        int n= in.nextInt();
        for(int i=1;i<=n;i++){


            N*=i;
        }
        System.out.println(N);

    }
}
