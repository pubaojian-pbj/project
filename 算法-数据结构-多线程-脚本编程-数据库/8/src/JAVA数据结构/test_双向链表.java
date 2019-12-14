package JAVA数据结构;

import java.util.*;
//节点类
class Node{
	int data;
	Node pre;
	Node next;
	public Node() {
		this.data=0;
		this.pre=null;
		this.next=null;
	}
	public Node(int data) {
		this.data=data;
		this.pre=null;
		this.next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getPre() {
		return pre;
	}
	public void setPre(Node pre) {
		this.pre = pre;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}

/**
 * 1.创建表头，初始化链表长度。
 * 2.编写对于双向链表而言锁需要的所有方法
 * 	·在链表头部插入元素
 * 	.在链表头部删除元素
 * 	.在链表尾部插入元素
 * 	.在链表尾部删除元素
 * 	.正向遍历链表
 * 	.反向遍历链表
 * 	.获取链表的长度
 * 	.在指定位置插入结点
 * 	.在指定位置删除结点
 * 	.获取指定位置的元素
 * 	.修改指定位置的元素
 * 3.为对应的要实现的具体操作。
 *
 */
public class test_双向链表 {
	private static  Node  head = null;
	static int length=0;
	private static Node first=head;
	private static Node last=head;
	public static int getLength() {
		return length;
	}
	public static void deleteNode(int index) {
		Node node=first;
		for(int i=1;i<index;i++) {
			if(node!=null) {
				node=node.next;
			}else {
				return;
			}
		}
		if(node!=null) {
			if(node.next!=null && node.pre!=null) {
				node.next.pre=node.pre;
				node.pre.next=node.next;
				System.out.println("111");
			}else if(node.next==null){
				System.out.println("112");
				node.pre.next=null;
				last=node.pre;
			}else if(node.pre==null) {
				System.out.println("113");
				node.next.pre=null;
				first=node.next;
			}
			length--;
		}
		else {
			System.out.println("无效的删除！");
		}
	}
	public static void insertNode(int index,int data) {
		Node node=first;
		Node nodedata=new Node(data);
		for(int i=1;i<index-1;i++) {
			if(node!=null)
				node=node.getNext();
		}
		if(node!=null) {
			if(node.next!=null) {
				nodedata.setNext(node.next);
				node.next.pre=nodedata;
				node.setNext(nodedata);
				nodedata.setPre(node);
			}
			else if(node.next==null){
				nodedata.setNext(last.next);
				last.setNext(nodedata);
				nodedata.setPre(last);
				last=nodedata;
			}
		}
		else {
			head=nodedata;
			head.setNext(null);
			head.setPre(null);
			first=nodedata;
			last=nodedata;
			
		}
		length++;
	}
	public static void deletetail() {
		if(last!=null) {
			last.pre.setNext(null);
			last=last.pre;
		}
		length--;
	}
	public static void deletehead() {
		if(first!=null) {
			first.next.setPre(null);
			first=first.next;
		}
		length--;
	}
	public static void addtail(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			first=head;
			last=head;
		}
		else {
			node.setPre(last);
			last.setNext(node);
			last=node;
		}
		last.next=null;
		length++;
	}
	public static void addhead(int data) {
		Node node = new Node(data);
		if(head==null) {
			head=node;
			first=head;
			last=head;
		}
		else {
			node.setNext(head);
			head.setPre(node);
			head=node;
			first=head;
		}
		last.next=null;
		length++;
	}
	public static void print() {
		while(first!=null) {
			System.out.print(first.data+"  ");
			first=first.next;
		}
		System.out.println("");
		while(last!=null) {
			System.out.print(last.data+"  ");
			last=last.pre;
		}
		
	}
	public static void create(int[] number) {
		for(int i=0;i<number.length;i++) {
//			addtail(number[i]);
			insertNode(i+1,number[i]);
		}
		insertNode(4,90);
//		deletetail();
//		deletehead();
		deleteNode(1);
		deleteNode(2);
		print();
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] array = new int[10];
		for(int i=0;i<array.length;i++) {
			array[i]=a[i];
		}
		create(array);
//		delete(8);
	}

}
