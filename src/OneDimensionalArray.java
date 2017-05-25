/**
 * Created by HJ on 2017/5/25.
 */
import java.util.*;
import java.util.Scanner;

public class OneDimensionalArray {                              //声明类
    public static void main(String[]args){
        double carbonEmissions[]=new double[6];                 //定义变量
        double totalEmissions=0;
        double emissionStandard=200;
        double miniEmissions=99999;
        double maxEmissions=0;
        int maxMonth=0;
        int miniMonth=0;
        int j=0;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<carbonEmissions.length;i++){              //输入月排放量
            System.out.println("请输入第"+(i+1)+"月的排放量");
            carbonEmissions[i]=scan.nextDouble();
        }
        while(j<carbonEmissions.length){
            totalEmissions+=carbonEmissions[j];

            if(carbonEmissions[j]>maxMonth){
            maxEmissions=carbonEmissions[j];
            maxMonth=j;
            }
            if(carbonEmissions[j]<miniEmissions){
            miniEmissions=carbonEmissions[j];
            miniMonth=j;
            }
            j++;
        }
        for(int i=1;i<carbonEmissions.length;i++)
            for (int k=0;k<carbonEmissions.length; k++)
                if (carbonEmissions[i]<carbonEmissions[k]){
                double temp=carbonEmissions[i];
                carbonEmissions[i]=carbonEmissions[k];
                carbonEmissions[k]=temp;
                }

        System.out.println("从小到大输出");
        for(int i=0;i<carbonEmissions.length;i++)
            System.out.println(carbonEmissions[i]+",");
        System.out.println("总排放量："+totalEmissions);
        System.out.println("是否超过"+emissionStandard+"的排放标准？"+(totalEmissions>emissionStandard));
        System.out.println("平均排放量："+totalEmissions/carbonEmissions.length);
        System.out.println("第"+(maxMonth+1)+"个月的排放量最大，为："+maxEmissions);
        System.out.println("第"+(miniMonth+1)+"个月的排放量最小,为："+miniEmissions);
    }
}
