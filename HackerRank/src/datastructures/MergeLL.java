package datastructures;

class Node {

	Node next;
	int data;

	Node(){
		
	}
	Node(int val) {
		this.data = val;
		this.next = null;
	}

	@Override
	public String toString() {
		Node cur = this;
		String str = "";

		while (cur != null) {
			str += cur.data + "->";
			cur = cur.next;
		}

		return str;
	}
}

class MergeLL {
	
	static Node mergeLists2(Node headA, Node headB) {
		
		if (headA == null){
			return headB;
		}
		if (headB == null){
			return headA;
		}
		
		if (headA.data < headB.data) {
			headA.next = mergeLists2(headA.next, headB);
			return headA;
		}else{
			headB.next = mergeLists2(headA, headB.next);
			return headB;
		}
		
	}

	static Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method 
	    Node currA = headA;
	    Node currB = headB;

	    Node newHead = new Node();    
	    Node newCurr = newHead;
	    
	    while(!(currA == null && currB == null)){        
	            
	        if (currA != null && currB != null){
	            if (currA.data < currB.data){
	                Node n = new Node();
	                n.data = currA.data;
	                newCurr.next = n;
	                newCurr = newCurr.next;
	                currA = currA.next;
	            }else{
	                Node n = new Node();
	                n.data = currB.data;
	                newCurr.next = n;
	                newCurr = newCurr.next;
	                currB = currB.next;
	            }
	        } else if (currA != null && currB == null){
	            Node n = new Node();
	            n.data = currA.data;
	            newCurr.next = n;
	            newCurr = newCurr.next;
	        } else if (currA == null && currB != null){
	            Node n = new Node();
	            n.data = currB.data;
	            newCurr.next = n;
	            newCurr = newCurr.next;
	        }          
	        if (newHead.data == 0){
	            newHead = newHead.next;
	        }
	    }  
	    
	    return newHead;
	}
	
	public static Node merge(Node n1, Node n2) {

		Node result = null;

		if (n1 != null && n2 != null) {
			if (n1.data < n2.data) {
				result = n1;
				result.next = merge(n1.next, n2);
			} else {
				result = n2;
				result.next = merge(n1, n2.next);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n3 = new Node(3);
		Node n5 = new Node(5);
		Node n7 = new Node(7);
		Node n9 = new Node(9);

		n1.next = n3;
		n3.next = n5;
		n5.next = n7;
		n7.next = n9;
		n9.next = null;

		Node n2 = new Node(2);
		Node n4 = new Node(4);
		Node n6 = new Node(6);
		Node n8 = new Node(8);
		Node n10 = new Node(10);

		n2.next = n4;
		n4.next = n6;
		n6.next = n8;
		n8.next = n10;
		n10.next = null;

		System.out.println("Merge : " + mergeLists2(n1, n2));
	}
}