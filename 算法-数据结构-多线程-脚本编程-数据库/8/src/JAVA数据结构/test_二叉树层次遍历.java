package JAVA数据结构;

import java.util.*;

class TreeNode2{
	public String val;
	public TreeNode2 left;
	public TreeNode2 right;
	public TreeNode2(){
	}
	TreeNode2(String val) {
		this.val=val;
		this.left=this.right=null;
	}
}
public class test_二叉树层次遍历 {
	
	static String s= "A,B,#,C,#,#,D,E,#,#,G,H,#";
	static String[] arrays = s.split(",");
	static int index =0;
	public static void ctree(TreeNode2 node) {
		Queue<TreeNode2> queue = new ArrayDeque();
		queue.add(node);
		while(!queue.isEmpty()) {
			node = queue.remove();
			System.out.print(node.val+"  ");
			if(node.left!=null) 
				queue.add(node.left);
			if(node.right!=null) 
				queue.add(node.right);
		}
	}
	public static TreeNode2 create(TreeNode2 node) {
		if(index>=arrays.length)
			return null;
		String val = arrays[index];
		index++;
		if(val.equals("#"))
			return null;
		else {
			node.val=val;
			node.left=create(new TreeNode2(""));
			node.right=create(new TreeNode2(""));
			return node;
		}
	}
	public static void main(String[] args) {
		TreeNode2 node = new TreeNode2();
		node = create(node);
		ctree(node);
	}

}
