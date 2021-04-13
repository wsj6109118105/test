package zuoye1;

import java.util.*;

public class Huollang {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int num=0;
        while (num<20) {
//            System.out.println("请输入城市个数：");
            int n =1+(int)(Math.random()*12);
            System.out.println("城市个数"+n);
            long N=1;
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }

            for (int k=1;k<=n;k++){

                N *= k;

            }

            long startTime;
            long endTime;
            startTime = System.currentTimeMillis();
            int j=0;
            while (j<=N){
                Collections.shuffle(list,new Random());
                j++;
            }
            endTime=System.currentTimeMillis();

            System.out.println("运行时间："+(endTime-startTime));
            num++;
        }
    }
}
