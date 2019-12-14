package 面试算法题;

import java.util.Scanner;

class ListNode{
	int val;
	ListNode next;
	public ListNode() {
	}
	public ListNode(int val) {
		this.val=val;
	}
}
public class Add_sun_number {

	public static void create(String l1,String l2) {
		ListNode listnode1 =null;
		ListNode listnode2 = null;
		ListNode pre1 = null;
		ListNode pre2 = null;
		int size1=0;
		int size2=0;
		for(int i=l1.length()-1;i>=0;i--) {
			if(size1==0) {
				listnode1 = new ListNode(l1.charAt(i)-48);
				pre1=listnode1;
			}else {
				ListNode newNode = new ListNode(l1.charAt(i)-48);
				pre1.next=newNode;
				pre1=newNode;
			}
			size1++;
		}
		pre1.next=null;
		for(int i=l2.length()-1;i>=0;i--) {
			if(size2==0) {
				listnode2 = new ListNode(l2.charAt(i)-48);
				pre2=listnode2;
			}else {
				ListNode newNode = new ListNode(l2.charAt(i)-48);
				pre2.next=newNode;
				pre2=newNode;
			}
			size2++;
		}
		pre2.next=null;
//		while(listnode1!=null) {
//			System.out.print(listnode1.val+"->");
//			listnode1=listnode1.next;
//		}
//		System.out.println("");
//		while(listnode2!=null) {
//			System.out.print(listnode2.val+"->");
//			listnode2 = listnode2.next;
//		}
//		System.out.println("");
		num(listnode1,listnode2);
//		ListNode listnode3 = addTwoNumbers(listnode1,listnode2);
//		while(listnode3!=null) {
//			System.out.print(listnode3.val+"->");
//			listnode3=listnode3.next;
//		}
	}
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//           ListNode l3 =null;
//	       ListNode pre =null;
//	       int temp=0;
//	       int size=0;
//	       boolean flag = false;
//	       while(l1!=null &&l2!=null) {
//	    	   temp = l1.val+l2.val;
//	    	   if(flag) {
//	    		   temp=temp+1;
//	    	   }
//	    	   if(temp<10) {
//	    		   flag=false;
//	    		   if(size==0) {
//	    			   l3=new ListNode(temp);
//                       pre=l3;
//	    		   }else {
//	    			   ListNode newNode3 = new ListNode(temp);
//	    			   pre.next = newNode3;
//	    			   pre = newNode3;
//	    		   }
//	    		   size++;
//	    	   }else {
//	    		   flag=true;
//	    		   int temp1 = temp%10;
//	    		   if(size==0) {
//	    			   l3=new ListNode(temp1);
//                       pre=l3;
//	    		   }else {
//	    			   ListNode newNode3 = new ListNode(temp1);
//	    			   pre.next = newNode3;
//	    			   pre = newNode3;
//	    		   }
//	    		   size++;
//	    	   }
//	    	   l1 = l1.next;
//	    	   l2 = l2.next;
//	       }
//            boolean flag2=false;
//	       if(l1!=null) {
//	    	   while(flag) {
//	    		   flag2=true;
//	    		    if(l1!=null) {
//	    		    	temp = l1.val+1;
//	    		    }else{
//	    		    	System.out.println("111");
//	    		    	flag2=false;
//	    		    	 temp = 1;
//	    		    }
//	    		   if(temp<10) {
//	    			   flag=false;
//	    			   ListNode newNode3 = new ListNode(temp);
//	    			   pre.next = newNode3;
//	    			   pre = newNode3;
//	    			   size++;
//	    		   }else {
//	    			   flag=true;
//	    			   int temp1 = temp%10;
//	    			   ListNode newNode3 = new ListNode(temp1);
//	    			   pre.next = newNode3;
//	    			   pre = newNode3;
//	    			   size++;
//	    			   l1 = l1.next;
//	    		   }
//	    	   }
//	    	   if(flag2)
//	    		   pre.next = l1.next;
//	    	   else 
//	    		   pre.next = l1;
//	       }
//         boolean flag3=false;
//	       if(l2!=null) {
//	    	   while(flag) {
//	    		   flag3=true;
//                   if(l2!=null)
//	    		        temp = l2.val+1;
//                   else {
//                	   temp = 1;
//                	   flag3=false;
//                   }
//                      
//	    		   if(temp<10) {
//	    			   flag=false;
//	    			   ListNode newNode3 = new ListNode(temp);
//	    			   pre.next = newNode3;
//	    			   pre = newNode3;
//	    			   size++;
//	    		   }else {
//	    			   flag=true;
//	    			   int temp1 = temp%10;
//	    			   ListNode newNode3 = new ListNode(temp1);
//	    			   pre.next = newNode3;
//	    			   pre = newNode3;
//	    			   size++;
//	    			   l2=l2.next;
//	    		   }
//	    	   }
//	    	   if(flag3)
//	    		   pre.next = l2.next;
//	    	   else 
//	    		   pre.next = l2;
//	       }
//	       if(l1==null&& l2==null) {
//	    	   if(flag) {
//	    		   ListNode newNode3 = new ListNode(1);
//    			   pre.next = newNode3;
//    			   pre = newNode3;
//	    	   }
//	       }
//	      
//	       return l3;
//    }
//	public static ListNode  addTwoNumbers(ListNode l1, ListNode l2) {
//	    ListNode dummyHead = new ListNode(0);
//	    ListNode p = l1, q = l2, curr = dummyHead;
//	    int carry = 0;
//	    while (p != null || q != null) {
//	        int x = (p != null) ? p.val : 0;
//	        int y = (q != null) ? q.val : 0;
//	        int sum = carry + x + y;
//	        carry = sum / 10;
//	        curr.next = new ListNode(sum % 10);
//	        curr = curr.next;
//	        if (p != null) p = p.next;
//	        if (q != null) q = q.next;
//	    }
//	    System.out.println(carry);
//	    if (carry > 0) {
//	        curr.next = new ListNode(carry);
//	    }
//	    while(dummyHead.next!=null) {
//	    	dummyHead=dummyHead.next;
//	    	System.out.println(dummyHead.val+"->");
//	    }
//	    return dummyHead.next;
//	}
	public static void num(ListNode l1,ListNode l2){
		ListNode l3 = new ListNode(0);
		ListNode pre=l3;
		int carry=0;
		while(l1!=null||l2!=null) {
			int x=(l1!=null)?l1.val:0;
			int y=(l2!=null)?l2.val:0;
			int sum = carry+x+y;
			carry=sum/10;
			pre.next=new ListNode(sum%10);
			pre=pre.next;
			if(l1!=null)l1=l1.next;
			if(l2!=null)l2=l2.next;
		}
		if(carry>0)
			pre.next=new ListNode(carry);
		while(l3.next!=null) {
			l3=l3.next;
			System.out.print(l3.val+"->");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l1 = sc.nextLine();
		String l2 = sc.nextLine();
		create(l1,l2);
	}

}
