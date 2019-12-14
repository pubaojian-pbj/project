/**
 * 
 */
package JAVA数据结构;

import java.util.Stack;

class TreeNode1{
	String val;
	TreeNode1 left;
	TreeNode1 right;
	public TreeNode1() {
	}
	public TreeNode1(String val) {
		this.val=val;
		this.left=this.right=null;
	}
}
public class test_二叉树中序遍历 {
	static String stringTree = "A,B,#,C,#,#,D,E,#,#,G,H,#";
	static String[] arrays = stringTree.split(",");
	static int index = 0;
	//中序非递归遍历
	public static void minghtTree2(TreeNode1 node) {
		Stack<TreeNode1> stack = new Stack<TreeNode1>();
		while(node!=null || !stack.isEmpty()) {
			while(node!=null) {
				stack.push(node);
				node=node.left;
			}
			if(!stack.isEmpty()) {
				node=stack.pop();
				System.out.print(node.val+"  ");
				node=node.right;
			}
		}
	}
	//中序递归遍历
	public static void minghtTree(TreeNode1 node) {
		if(node!=null) {
			if(node.left!=null) minghtTree(node.left);
			System.out.print(node.val+"  ");
			if(node.right!=null) minghtTree(node.right);
		}
	}
	public static TreeNode1 createTree(TreeNode1 node) {
		if(index>=arrays.length)
			return null;
		String val = arrays[index];
		index++;
		if(val.equals("#")) {
			return null;
		}
		else {
			node.val=val;
			node.left=createTree(new TreeNode1(""));
			node.right=createTree(new TreeNode1(""));
			return node;
		}
	}
	public static void main(String[] args) {
		TreeNode1 node = new TreeNode1("");
		node = createTree(node);
		minghtTree(node);
		System.out.println("");
		minghtTree2(node);
	}

}
