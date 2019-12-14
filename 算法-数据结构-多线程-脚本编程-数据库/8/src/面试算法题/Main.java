package 面试算法题;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static int check(int n,int k,int[] a) {
		int flag=0;
		int flag2=0;
		int count=0;
		int maxsub=0;
		int maxsub2 = 0;
		int maxsub3 = 0;
		int[] acount = new int[n];
		for(int i=0;i<n;i++) {
			if(a[i]==0) {
				flag = 1;
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]==1) {
				flag2=1;
			}
		}
		if(flag==0) {
			return n;
		}else if(flag2==0){
			return k;
		}else {
			for(int i=0;i<n;i++) {
				if(a[i]==1) {
					acount[i]++;
					for(int j=i+1;j<n;j++) {
						if(a[j]==a[i])
							acount[i]++;
						else
							break;
					}
				}
			}
			int max = 0;
			for(int i=0;i<n-1;i++) {
				max = i;
				for(int j=i+1;j<n;j++) {
					if(a[max]<a[j]) {
						max=j;
					}
				}
			}
			while(k!=0) {
				for(int i=max;i<max+acount[max];i++) {
					if(k%2!=0) {
						if(k<2) {
							a[i-1]=1;
							maxsub = check(n,k,a);
							a[i+acount[max]]=1;
							a[i-1]=0;
							maxsub2 = check(n,k,a);
							k-=1;
							if(maxsub>maxsub2) {
								return maxsub;
							}else {
								return maxsub2;
							}
						}else {
							a[i-1]=1;
							a[i+acount[max]]=1;
							maxsub3 = check(n,k,a);
							k-=2;
						}
					}else {
						if(k>0) {
							a[i-1]=1;
							a[i+acount[max]]=1;
							maxsub3 = check(n,k,a);
							k-=2;
						}else {
							return maxsub3;
						}
						
					}
				}
			}
			if(k==0) {
				return acount[max];
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,k;
		n = sc.nextInt();
		k = sc.nextInt();
		int[] a = new int[n*n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int count = check(n,k,a);
		System.out.println(count);
	}

}
