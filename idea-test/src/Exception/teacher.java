package Exception;

public class teacher {
    public void checkScore(int score) throws ScoreException{
        if(score<0 ||score >100)
        {
            throw new ScoreException("输入分数异常，应该在0-100之间");
        }
        else
        {
            System.out.println("成绩正常");
        }
    }
}
