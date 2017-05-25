/**
 * Created by HJ on 2017/5/25.
 */
package chapter04;
public class SimpleTwoDimensionalArray {
    public static void main(String[]args){
        double score[][]={{62,59,82},{76,86,68},{58,71,79}};
        double average[]=new double[3];
        double temp=0;
        for (int i=0;i<score.length; i++){
            temp=0;
            for (int j=0;j<score.length;j++){
                temp+=score[i][j];
            }
            average[i]=temp/3.0;
        }
        for (int i=0;i<average.length;i++)
            System.out.println("第"+(i+1)+"个学生平均成绩是："+average[i]);
    }
}
