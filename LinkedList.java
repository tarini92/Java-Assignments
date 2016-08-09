

public class LinkedList {
	
	private Node first = null;
	Node head;
	int count;
	
	public LinkedList()
	{
		head = null;
		count = 0;
	}
public static void main(String args[])
{
	LinkedList bookList = new LinkedList();
	//System.out.println(bookList);
	bookList.append("Harry Potter I");
	System.out.println(bookList);
	bookList.insert(0, "Hamlet");
	System.out.println(bookList);
	bookList.insert(0, "Cosmos");
	System.out.println(bookList);
	bookList.insert(1, "Java");
	System.out.println(bookList);
	bookList.remove(1);
	System.out.println(bookList);
	bookList.insert(1, "C++");
	bookList.insert(2, "LISP");
	bookList.insert(2, "Calvin & Hobbes");
	System.out.println(bookList);
	int pos = bookList.find("LISP");
	bookList.remove(pos);
	System.out.println(bookList);
	// autoboxing and unboxing
	//bookList.clear();
	bookList.append(1);
	bookList.append(1);
	bookList.append(2);
	bookList.append(3);
	System.out.println(bookList);
	pos = bookList.find(2);
	bookList.remove(pos);
	System.out.println(bookList);
	
}

public void insertFirst(int data) {
	
    Node n = new Node(data);
    n.next = first;
    first = n;
}

public Node deleteFirst() {
    Node temp = first;
    first = first.next;
    return temp;
}

public void displayList() {
    Node current = first;
    while (current != null) {
        current.displayNode();
        current = current.next;
    }
}

public boolean isEmpty() {
    return (first == null);
}

public void insert(int pos,Object obj)
{
Node current = head;
if(pos==0)
{
	head = new Node(obj);
	head.next = current;;
}

else
	
{
	
	Node temp = null;
	int i = 0;
	while(i!=pos)
	{
		temp = current;
		current = current.getNext();
		i++;
	}
	temp.next = new Node(obj);
	temp.next.next = current;
	
	
}
}
public void remove(int pos)
{
	Node prev=null;
	Node current = head;
	int i=0;
	if(pos==0)
	{
		head = current.getNext();
		
	}
	else 
	{
	while(i!=pos)
	{
		prev = current;
		current = current.getNext();
		i++;
	}
	//current = current.getNext();
	prev.setNext(prev.getNext().getNext());
	
	}
}
public Object get(int pos)
{
	int i=0;
	Node current = head;
	while(i!=pos)
	{
		current = current.getNext();
		i++;
	}
	return current;
}
public int find(Object obj)
{
	Node current = head;
	if(current.getData()==null)
	{
		return -1;
	}
	else
	{
		int i=0;
	while(current.getNext()!=null)
	{
		
		if(obj==current.getData())
			return i;
		current = current.getNext();
		i++;
		
	}
	return -1;
	}
}

public int size()
{
	Node current = head;
	if(current==null)
	{
		return 0;
		
	}
	else
	{
		while(current.getNext()!=null)
		{
			current = current.getNext();
			count++;
		}
		return count;
	}
	
}
/*public void clear()
{
	
}*/

public void append(Object obj)
{
if(head==null)
{
head = new Node(obj);
//System.out.println(obj);
}
else
{
Node temp = new Node(obj);
Node current = head;
while(current.getNext()!=null)
{
	current = current.getNext();
}
current.setNext(temp);
temp.setNext(null);
}

}
public String toString()
{
	String result = "";
    Node current = head;
    while(current.getNext() != null){
        current = current.getNext();
        result += current.value + ", ";
    }
    return "bookList: " + result;	
}
}
