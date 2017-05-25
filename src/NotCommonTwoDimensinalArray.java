/**
 * Created by HJ on 2017/5/25.
 */
package chapter04;
import java.util.Random;
public class NotCommonTwoDimensinalArray{
    public static void main(String[]args){
        int score[][]=new int[4][];
        int total[]=new int[4];
        for (int i=0;i<score.length;i++)
            score[i]=new int[3+i];
        for (int i=0;i<score.length;i++)
            for (int j=0;j<score[i].length;j++){
            score[i][j]=new Random().nextInt(100);
            total[i]+=score[i][j];
            }
            for (int i=0;i<score.length;i++){
                System.out.print("第"+(i+1)+"个学生的成绩为：");
                for (int j=0;j<score[i].length;j++){
                    System.out.print(score[i][j]+"\t");}
                    System.out.println();
            }
            for (int i=0;i<total.length;i++){
                System.out.println("第"+(i+1)+"个学生的平均成绩是："+total[i]/score[i].length);

            }
    }
}
