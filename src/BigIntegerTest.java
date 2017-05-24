/**
 * Created by HJ on 2017/5/24.
 */
import java.math.*;
import java.util.*;
public class BigIntegerTest {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("How much number do you need to draw?");
        int k=in.nextInt();
        System.out.println("what the highest number can you draw？");
        int n=in.nextInt();
        BigInteger lotteryOdds1=BigInteger.valueOf(1);//

        for(int i=1;i<=k;i++)
            lotteryOdds1=lotteryOdds1.multiply(BigInteger.valueOf(n-1+i)).divide(BigInteger.valueOf(i));

//divide:除。valueOf(1)返回括号里的大的整数。即lotteryOdds*(n-1+i)/i
                System.out.println("your odds are 1 in  "+lotteryOdds1+".Good lock");






    }
}
