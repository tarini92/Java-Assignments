
public class NodeGen<T> {
	
	NodeGen<T> next;
	T value;


public NodeGen(T val)
{
	next = null;
	this.value = val;
}
public T getData()
{
	return value;
}
public void setData(T val)
{
	value = val;
}
public NodeGen<T> getNext()
{
	return next;
}
public void setNext(NodeGen<T> nextVal)
{
	next = nextVal;
	
}
public void displayNode()
{
	System.out.println(value);
}
}