/**
 * Created by HJ on 2017/5/25.
 */
package chapter04;
public class SimpleArray {
    public static void main(String[]args){
        int week[]=null;
        week=new int[7];
        //int week={1,2,3,4,5,6,7};
        for(int i=0;i<week.length;i++) {//week.length表示数组的长度；
            week[i] = i + 1;//为每个week元素赋值
        }
        for(int j=0;j<week.length;j++){//遍历一维数组
            System.out.println("星期："+week[j]);
        }
    }
}
