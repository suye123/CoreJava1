/**
 * Created by HJ on 2017/5/25.
 */
package chapter04;
public class Salary_TwoDimensionalArray {
    public static void main(String[]args){
        double salary[][]={{1900,450,344,7645,234},{563,354,244,980,4554},{785,343,888,345,2454}};
        double temp=0;
        double average[]=new double[3];
        for (int i=0;i<salary.length;i++){
            temp=0;
            for (int j = 0; j < salary.length; j++) {
                temp += salary[i][j];
            }
            average[i]=temp;
            System.out.println("第"+(i+1)+"个人平均工资是："+(average[i]/5)+"元");
        }
    }
}
