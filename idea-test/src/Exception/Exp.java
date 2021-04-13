package Exception;

public class Exp {
    public static void main(String[] args) {
        try{
            int[] a = new int[3];
            a[3]=4;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("发生异常");
        }
        finally {

            System.out.println("11111");
        }
    }
}
