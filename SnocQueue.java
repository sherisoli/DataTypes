package cs2s03;

public class SnocQueue implements MyQueue{
	
	SnocList Items;
	
	public SnocQueue(SnocList x){
		Items = x;
	}
	
	public SnocQueue(){
		Items = new SnocList();
	}
	
	public char peek() throws EmptyContainerException { // front 
		if(isEmpty()) {throw new EmptyContainerException("This list is empty.");}
		return Items.getHead();
	}
	
	public void dequeue() { // front
		Items.remove();
	}

	public void enqueue(char c) throws EmptyContainerException { // back
		Items.add(c);
	}

	public boolean isEmpty(){
		if(Items.toString().length() == 1)			
			return Items.toString().charAt(0) == 0;
		if(Items.toString().length() == 0)
			return true;
		return false;
	}
	@Override
	public String toString() { // you must implement this
		return Items.toString();}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof SnocQueue) {
			if(obj.toString().equals(toString())) {return true;}
		}
		return false;
	}
}