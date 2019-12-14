package JAVA数据结构;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

class Tree{
	String val;
	Tree left;
	Tree right;
	public Tree() {
	}
	public Tree(String val) {
		this.val=val;
		this.left=this.right=null;
	}
}

public class test_二叉树前序遍历 {
	static String s="A,B,#,C,#,#,D,E,#,#,G,H,#";
	static String[] node = s.split(",");
	public static int index=0;
	//前序递归
	public static void preOrderRecur(Tree tree) {
		if(tree!=null)
		{
			System.out.print(


					tree.val +"  ");
			if(tree.left!=null) preOrderRecur(tree.left);
			if(tree.right!=null) preOrderRecur(tree.right);
		}
	}
	//前序非递归
	public static void preOrderRecur2(Tree tree) {
		Stack<Tree> stack = new Stack<Tree>();
		while(tree!=null || !stack.isEmpty()) {
			while(tree!=null) {
				System.out.println(tree.val);
				stack.push(tree);
				tree=tree.left;
			}
			if(!stack.isEmpty()) {
				tree=stack.pop();
				tree=tree.right;
			}
		}
	}
	public static Tree createTree(Tree tree) {
		if(index>=node.length)
			return null;
		String val = node[index];
		index++;
		if(val.equals("#"))
			return null;
		else {
			tree.val=val;
			tree.left=createTree(new Tree(""));
			tree.right=createTree(new Tree(""));
			return tree;
		}
	}
	public static void main(String[] args) {
		Tree tree =new Tree("");
		Tree treeNode = createTree(tree);
		preOrderRecur(treeNode);
		System.out.println("");
		preOrderRecur2(treeNode);
	}

}
