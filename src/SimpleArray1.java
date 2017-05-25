/**
 * Created by HJ on 2017/5/25.
 */
package chapter04;
public class SimpleArray1 {
    public static void main(String[]args){
        int month[]=null;
        month=new int[31];
        for(int i=0;i<month.length;i++){
            month[i]=i+1;
        }
        for(int j=0;j<month.length;j++){
            System.out.println(+month[j]);
        }
    }
}
