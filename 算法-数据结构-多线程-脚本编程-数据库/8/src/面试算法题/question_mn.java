package 面试算法题;

import java.util.Scanner;

public class question_mn {

	public static void creategrape(int m,int n){
		char[][] arrays = new char[m+1][n+1];
		int c1=0,c2=0;
		int i,j;
		int z=m*n;
		char oua='A'-1;
		char ouz='Z';
		int count=0;
		while(count<z) {
			i=0;
			j=0;
			//从左到右
			for(i+=c1,j+=c1;j<n-c1;j++) {
				if(count>z)break;
				char temp =++oua;
				if(temp=='Z')
					temp='A';
				arrays[i][j] = temp;
				count++;
			}
			//从上到下
			for(j--,i++;i<n-c1;i++) {
				if(count>z)break;
				char temp =++oua;
				if(temp=='Z')
					temp='A';
				arrays[i][j] = temp;
				count++;
			}
			//从右到左
			for(i--,j--;j>=c1;j--) {
				if(count>z)break;
				char temp =++oua;
				if(temp=='Z')
					temp='A';
				arrays[i][j] = temp;
				count++;
			}
			//从下到上
			for(j++,i--;i>=c1+1;i--) {
				if(count>z)break;
				char temp =++oua;
				if(temp=='Z')
					temp='A';
				arrays[i][j] = temp;
				count++;
			}
			c1++;
		}
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.print(arrays[i][j]+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		creategrape(m,n);
	}

}
