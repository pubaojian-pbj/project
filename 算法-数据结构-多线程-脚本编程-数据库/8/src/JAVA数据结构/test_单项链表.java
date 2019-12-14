package JAVA数据结构;

import java.util.*;

class linkNode{
	int val;
	linkNode next;
	public linkNode() {
	}
	public linkNode(int val) {
		this.val=val;
	}
}
public class test_单项链表 {
	public static void create(String s1,String s2) {
		linkNode node1 =null;
		linkNode node2 =null;
		linkNode pre1= null;
		linkNode pre2 = null;
		int size1=0,size2=0;
		for(int i=s1.length()-1;i>=0;i--) {
			if(size1==0) {
				node1=new linkNode(s1.charAt(i)-48);
				pre1=node1;
			}
			else {
				linkNode newNode = new linkNode(s1.charAt(i)-48);
				pre1.next=newNode;
				pre1=newNode;
			}
			size1++;
			pre1.next=null;
		}
		for(int i=s2.length()-1;i>=0;i--) {
			if(size2==0) {
				node2=new linkNode(s2.charAt(i)-48);
				pre2=node2;
			}
			else {
				//头插法
//				linkNode newNode = new linkNode(s2.charAt(i)-48);
//				newNode.next=pre2.next;
//				size2++;
//				pre2.next=newNode;
				//尾插法
				linkNode newNode = new linkNode(s2.charAt(i)-48);
				pre2.next=newNode;
				pre2=newNode;
			}
			size2++;
			pre2.next=null;
		}
		//大整数相加 逆序输出（单项链表）
//		num(node1,node2);
		//大整数相加 逆序输出（单项循环）
//		num1(node1,node2);
		//单链表逆置输出
		num2(node1,node2);
	}
	public static void num2(linkNode node1,linkNode node2) {
		int carry=0;
		linkNode node3 = new linkNode(0);
		linkNode pre3=node3;
		while(node1!=null || node2!=null) {
			int x=(node1!=null)?node1.val:0;
			int y=(node2!=null)?node2.val:0;
			int sum = x+y+carry;
			carry=sum/10;
			linkNode newNode = new linkNode(sum%10);
			pre3.next=newNode;
			pre3=newNode;
			if(node1!=null) node1=node1.next;
			if(node2!=null) node2=node2.next;
		}
		if(carry>0)
			pre3.next=new linkNode(carry);
		pre3.next=null;
		linkNode node=node3;
		while(node.next!=null) {
			node=node.next;
			System.out.print(node.val);
		}
		System.out.println("");
		//对node3链表进行逆置
		linkNode pre1=node3.next;
		linkNode pre2 = null;
		node3.next=null;
		while(pre1!=null) {
			pre2=pre1.next;
			pre1.next=node3.next;
			node3.next=pre1;
			pre1=pre2;
		}
		while(node3.next!=null) {
			node3=node3.next;
			System.out.print(node3.val);
		}
	}
	public static void num1(linkNode node1,linkNode node2) {
		int carry=0;
		int size=0;
		linkNode node3 =null;
		linkNode pre3=null;
		while(node1!=null || node2!=null) {
			int x = (node1!=null)?node1.val:0;
			int y = (node2!=null)?node2.val:0;
			int sum = x+y+carry;
			carry=sum/10;
			if(size==0) {
				node3=new linkNode(sum%10);
				pre3=node3;
				pre3.next=node3;
			}
			else {
				linkNode newNode = new linkNode(sum%10);
				newNode.next=node3;
				pre3.next=newNode;
				pre3=newNode;
			}
			size++;
			if(node1!=null) node1=node1.next;
			if(node2!=null) node2=node2.next;
		}
		if(carry>0) {
			linkNode newNode=new linkNode(carry);
			newNode.next=node3;
			pre3.next=newNode;
			pre3=newNode;
		}
		while(node3!=pre3) {
			System.out.print(node3.val);
			node3=node3.next;
		}
		System.out.print(node3.val);
	}
	public static void num(linkNode node1,linkNode node2) {
		int carry=0;
		linkNode node3 = new linkNode();
		linkNode pre3=node3;
		while(node1!=null || node2!=null) {
			int x = (node1!=null)?node1.val:0;
			int y = (node2!=null)?node2.val:0;
			int sum = x+y+carry;
			carry=sum/10;
			linkNode newNode = new linkNode(sum%10);
			pre3.next=newNode;
			pre3=newNode;
			if(node1!=null) node1=node1.next;
			if(node2!=null) node2=node2.next;
		}
		if(carry>0) {
			pre3.next=new linkNode(carry);
		}
		pre3.next=null;
		System.out.println("");
		while(node3.next!=null) {
			node3=node3.next;
			System.out.print(node3.val);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		create(s1,s2);
	}

}
