
public class LinkedStack {

	LinkedList l1 = new LinkedList();
	
	public void push(int data) {
	    l1.insertFirst(data);
	}

	public void pop() {
	    while(!l1.isEmpty()){
	    l1.deleteFirst();
	    }
	}

	public void displayStack() {
	    System.out.println("  ");
	    l1.displayList();
	  }
	
}

