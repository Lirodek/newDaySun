package LinkedList;

class LinkedList {
	Node head;
	LinkedList(){
		head = null;
	}
	public boolean isEmpty() {
		return this.head == null; 
	}
	public void insertFirst(String data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = head;
		head = newNode;
	}
	public void insertLast(String data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = null;
		if(isEmpty()) head = newNode;
		else {
			Node temp = head;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	public Node searchNode(String data) {
		Node temp = head;
		while(temp!=null) {
			if(temp.data.equals(data)) return temp;
			else temp=temp.link;
		}
		return temp;
	}
	public void insertNode(Node prev, String data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = prev;
		prev.link = newNode;
	}
	public void deleteNode(String data) {
		Node prev = head;
		Node temp = head.link;
		
		if(head.data.equals(data)) {
			head = prev.link;
			prev.link = null;
		}
		else {
			while(temp!=null) {
				if(temp.data.equals(data)) {
					if(temp.link==null)
						prev.link=null;
					else{
						prev.link = temp.link;
						temp.link = null;
					}
					return;
				}
				prev = prev.link;
				temp = temp.link;
			}
		}
	}
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data+" ");
			temp = temp.link;
		}
		System.out.println();
	}
}

