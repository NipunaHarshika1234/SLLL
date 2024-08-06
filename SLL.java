public class SLL{
	Node head;
	
	public static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void printList(){
		Node nipuna = head;
		
		while(nipuna != null){
			System.out.print(nipuna.data + " ");
			nipuna = nipuna.next;
		}
		System.out.println();
	}
	
	public void insertLast(int d){
		Node newNode = new Node(d);
		
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	
	public void insertFront(int f){
		Node newNode = new Node(f);
		
		newNode.next = head;
		head = newNode;
	}
	
	public void dropMiddle(Node del){
		if(head == del){
			head = head.next;
		}else{
			Node current = head;
			while(current.next != del){
				current = current.next;
			}
			if(del.next == null){
				current.next = null;
			}
			else{
				current.next = current.next.next;
			}
		}
	}
	
	public static void main(String[] args){
		SLL nirmala = new SLL();
		
		nirmala.head = new Node(9);
		Node second = new Node(21);
		Node third = new Node(16);
		
		nirmala.head.next = second;
		second.next = third;
		
		
		System.out.println();
		nirmala.printList();
		
		System.out.println();
		System.out.println("insert 15 to last");
		nirmala.insertLast(15);
		nirmala.printList();
		
		System.out.println();
		System.out.println("insert 5 to front");
		nirmala.insertFront(5);
		nirmala.printList();
		
		System.out.println();
		System.out.println("remove 21 in list");
		nirmala.dropMiddle(second);
		nirmala.printList();
	}
	
	
}