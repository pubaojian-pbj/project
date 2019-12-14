package JAVA数据结构;

import java.util.HashMap;

public class LRU {
	class Node{
		int key;
		char value;
		Node pre;
		Node next;
		public Node() {
		}
		public Node(int key,char value) {
			this.key=key;
			this.value=value;
		}
		
	}
	int length=0;
	int cap;
	private Node head=null;
	private Node first=head,last=head;
	HashMap<Integer,Node> map=null;
	//初始化
	public LRU(int cap) {
		this.cap=cap;
		map=new HashMap((int)(cap));
		head=new Node();
		this.first=this.last=head;
	}
	//删除头结点元素
	public void removeHeadNode(Node node) {
		if(node==first) {
			node.next.pre=null;
			first=node.next;
		}
		else {
			node.pre.next=node.next;
			node.next.pre=node.pre;
			node.pre=null;
			node.next=null;
		}
	}
	//将节点添加到双向链表尾部
	public void add(Node node) {
		if(head==null) {
			head=node;
			first=head;
			first.pre=null;
			last=head;
		}
		else {
			node.pre=last;
			last.next=node;
			last=node;
		}
		last.next=null;
	}
	//存储页面
	public void put(int key,char value) {
		Node node = map.get(key);
		if(node==null) {
			//缓存中无此页面，则将他加入双向链表的尾部，并将对应的key与Node存储到map
			//集合中,且当缓存容量大于设定值的时，删除链表中头部的结点，并删除相应的map集合
			//中存储的键值对
			Node newNode = new Node(key,value);
			map.put(key, newNode);
			add(newNode);
			if(map.size()>=cap && first!=last) {
				node = first;
				removeHeadNode(node);
				map.remove(node.key);
			}
		}
		else {
			//将此键值对移动到链表末尾
			removeHeadNode(node);
			add(node);
			//更新值
			node.value=value;
		}
	}
	//访问页面
	public int get(int key) {
		Node node = map.get(key);
		if(node==null) {
			System.out.println("无该页面信息");
			return -1;
		}
		else {
			removeHeadNode(node);
			add(node);
			return node.value;
		}
	}
	public void print() {
		Node node = first;
		while(node!=null) {
			System.out.print(node.value+" ");
			node=node.next;
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		LRU cache = new LRU(5);
		cache.put(1,'a');
		cache.put(2,'b');
		cache.put(3,'c');
		cache.put(4,'d');
		cache.put(5,'e');
		cache.print();
		cache.put(6,'f');
		cache.print();
		cache.get(1);
		System.out.println((char)cache.get(2));
		cache.print();
	}
}
