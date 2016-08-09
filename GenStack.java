
public class GenStack<T> {

	private NodeGen<T> first = null;
	
	public void push(T data) {
		
	    NodeGen<T> n = new NodeGen<T>(data);
	    n.next = first;
	    first = n;
	}

	public NodeGen<T> pop() {
	    NodeGen<T> temp = first;
	    first = first.next;
	    return temp;
	}

	public void displayList() {
	    NodeGen<T> current = first;
	    while (current != null) {
	        current.displayNode();
	        current = current.next;
	    }
	}
	
	public static void main(String[] args)
	{
		GenStack<Integer> gen = new GenStack<Integer>();
		gen.push(1);
		gen.push(2);
		gen.push(3);
		gen.push(4);
		gen.push(5);
		gen.displayList();
		gen.pop();
		gen.pop();
		
		gen.displayList();
		
		GenStack<String> gen1 = new GenStack<String>();
		gen1.push("Here");
		gen1.push("is");
		gen1.push("Generics");
		gen1.displayList();
		gen1.pop();
		gen1.displayList();
		
		
	}
}
