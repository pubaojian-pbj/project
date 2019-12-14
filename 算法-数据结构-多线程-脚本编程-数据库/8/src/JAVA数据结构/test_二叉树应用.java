package JAVA数据结构;

import java.util.*;

class TreeNodes{
	String val;
	TreeNodes left;
	TreeNodes right;
	public TreeNodes() {
	}
	TreeNodes(String val){
		this.val=val;
		this.left=this.right=null;
	}
}
public class test_二叉树应用 {
	//按树状结构打印二叉树
	public static void print(TreeNodes node,int h) {
		if(node==null)
			return;
		print(node.left,h+1);
		for(int i=0;i<h;i++)
			System.out.print("  ");
		System.out.println(node.val);
		print(node.right,h+1);
	}
	//求二叉树的高度
	static int high=0;
	public static int highTree(TreeNodes node,int h) {
		if(node!=null) {
			if(h>high)
				high=h;
			highTree(node.left,h+1);
			highTree(node.right,h+1);
		}
		return high;
	}
	//统计叶子节点的数目
	static int count1=0;
	public static int countnode1(TreeNodes node){
		if(node!=null) {
			if(node.left==null && node.right==null) {
				count1++;
			}
			else {
				countnode1(node.left);
				countnode1(node.right);
			}
		}
		return count1;
	}
	//输出二叉树的叶子节点
	static List<String> list = new ArrayList<String>();
	public static List nodeList(TreeNodes node) {
		if(node!=null) {
			if(node.left==null && node.right==null) {
				list.add(node.val);
			}
			else {
				nodeList(node.left);
				nodeList(node.right);
			}
		}
		return list;
	}
	//统计二叉树的节点数
	static int count=0;
	public static int countNode(TreeNodes node) {
		if(node!=null) {
			count++;
			countNode(node.left);
			countNode(node.right);
		}
		return count;
	}
	//创建二叉树
	static String s= "A,B,#,C,#,#,D,E,#,#,G,H,#";
	static String[] arrays = s.split(",");
	static int index=0;
	public static TreeNodes create(TreeNodes node) {
		if(index>=arrays.length)
			return null;
		String val =arrays[index];
		index++;
		if(val.equals("#"))
			return null;
		else {
			node.val=val;
			node.left=create(new TreeNodes(""));
			node.right=create(new TreeNodes(""));
			return node;
		}
	}
		
	public static void main(String[] args) {
		TreeNodes node = new TreeNodes("");
		//创建二叉树
		node = create(node);
		List list =null;
		System.out.println("二叉树的节点数为:"+countNode(node));
		System.out.print("二叉树的叶子节点:");
		list=nodeList(node);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"  ");
		}
		System.out.println("");
		System.out.println("叶子节点的数目:"+countnode1(node));
		//求二叉树的高度
		System.out.println("二叉树的高度"+highTree(node,1));
		//按树状结构打印二叉树
		System.out.println("打印二叉树:");
		print(node,1);
	}
}
