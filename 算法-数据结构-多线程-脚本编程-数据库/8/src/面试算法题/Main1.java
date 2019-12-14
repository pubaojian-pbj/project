package 面试算法题;
import java.util.Scanner;

public class Main1{
    public static int test(int[] number){
        int left=0,right=0;
        int k=0,count=0;
        int max=0;
        int flag=0;
        for(int i=0;i<number.length;i++){
            left=number[i];
            for(int j=i+1;j<number.length;j++){
                if(number[j]>left) break;
                else{
                    max=number[i];
                   for(int p=j;p<number.length;p++){
                       if(max<number[p]){
                           max=number[p];
                           flag=p;
                       }
                   }
                }
            }
        }
        right=number[flag];
        System.out.println(left+","+right);
        int sum=0;
        int flag2=0;
        int min=(left>right)?right:left;
        for(int i=0;i<number.length;i++){
            if(number[i]==left){
              flag2=i;
            }
        }
        for(int j=flag2+1;j<flag;j++){
            sum+=min-number[j];
            System.out.println(number[j]);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] number = new int[n];
        for(int i=0;i<n;i++){
            number[i]=sc.nextInt();
        }
        int k = test(number);
        System.out.println(k);
        
    }
}
