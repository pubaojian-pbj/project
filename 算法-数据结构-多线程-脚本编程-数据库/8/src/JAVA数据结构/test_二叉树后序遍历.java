package JAVA数据结构;

import java.util.Stack;

class TreeNode{
	String val;
	TreeNode left;
	TreeNode right;
	public TreeNode() {
	}
	public TreeNode(String val) {
		this.val=val;
		this.left=this.right=null;
	}
}
public class test_二叉树后序遍历 {
	static String stringTree="A,B,#,C,#,#,D,E,#,#,G,H,#";
	static String[] arrays = stringTree.split(",");
	static int index=0;
	//后序遍历非递归    方法二
		public static void hTree3(TreeNode node) {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode nodepre=null;
			while(node!=null || !stack.isEmpty()) {
				while(node!=null) {
					stack.push(node);
					node=node.left;
				}
				if(!stack.isEmpty()) {
					node=stack.peek();
					if(node.right==null || node.right==nodepre) {
						node = stack.pop();
						System.out.print(node.val+"  ");
						nodepre = node;
						node=null;
					}
					else {
						node = node.right;
					}
				}
					
			}
		}
	//后序遍历非递归 方法一
	public static void hTree2(TreeNode node) {
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<Integer> stack2 = new Stack<Integer>();
		while(node!=null || !stack1.isEmpty()) {
			while(node!=null) {
				stack1.push(node);
				stack2.push(0);    
				node=node.left;
			}
			while(!stack1.isEmpty() && stack2.peek()==1) {
				stack2.pop();
				System.out.print(stack1.pop().val+"  ");
			}
			if(!stack1.isEmpty()) {
				stack2.pop();
				stack2.push(1);
				node=stack1.peek();
				node = node.right;
			}
				
		}
	}
	//后序遍历递归
	public static void hTree(TreeNode node) {
		if(node!=null) {
			if(node.left!=null) hTree(node.left);
			if(node.right!=null) hTree(node.right);
			System.out.print(node.val+"  ");
		}
	}
	public static TreeNode createTree(TreeNode node) {
		if(index>=arrays.length) {
			return null;
		}
		String val = arrays[index];
		index++;
		if(val.equals("#"))
			return null;
		else {
			node.val=val;
			node.left = createTree(new TreeNode(""));
			node.right=createTree(new TreeNode(""));
			return node;
		}
	}
	public static void main(String[] args) {
		TreeNode node = new TreeNode("");
		node=createTree(node);
		hTree(node);
		System.out.println("");
		hTree2(node);
		System.out.println("");
		hTree3(node);
	}

}
