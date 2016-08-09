

public class Node {
	
	Node next;
	Object value;


public Node(Object value)
{
	next = null;
	this.value = value;
}
public Object getData()
{
	return value;
}
public void setData(Object val)
{
	value = val;
}
public Node getNext()
{
	return next;
}
public void setNext(Node nextVal)
{
	next = nextVal;
	
}
public void displayNode()
{
	System.out.println(value);
}
}


