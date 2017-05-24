/**
 * Created by HJ on 2017/5/23.
 */
import java.util.*;
public class LotteryOdds {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in );//从键盘输入

        System.out.print("How much number do you need to draw?");
        int k =in.nextInt();

        System.out.println("What is the highest number you can draw?");
        int n =in.nextInt();

        int lotteryOdds=1;
        for(int i=1;i<=k;i++)
            lotteryOdds=lotteryOdds*(n-i+1)/i;

        System.out.println("Your Odds are 1 in "+lotteryOdds+".Good lock");

    }
}
