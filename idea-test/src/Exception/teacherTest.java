package Exception;

import java.util.Scanner;

public class teacherTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = in.nextInt();
        teacher t = new teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
