package cs2s03;

public class SnocList {
	
	private char head;
	private SnocList tail;
	
	public SnocList(char c, SnocList Tail) throws EmptyContainerException {
		if (Tail == null) { this.head = c; this.tail = Tail;}
		else { //REORDER
		this.head = Tail.head; // head = Tail's head
		Tail.remove(); // removes Tail's head 
		Tail.add(c); // adds c as Tail's new head
		this.tail = Tail;} // tail = Tail
		
	}
	
	public SnocList(){  // Construct empty SnocList
		this.head = 0;
		this.tail = null;
	}
	
	public boolean isEmpty() {return head == 0;} // Checks if the list is empty
	
	public char getHead() {return head;} 
	
	public SnocList getTail() {return tail;}
	
	public void add(char a) throws EmptyContainerException { // adds a character to the list
		if(isEmpty()){head = a;}
		else if (tail == null) {tail = new SnocList(a, null);}
		else {tail.add(a);}
	}
	
	public void remove() { // removes a character from the list
		if (!isEmpty()) {
			if (tail != null) {
				head = tail.head;
				tail = tail.tail;}
			else if (tail == null) {head = 0;}
			}
		else {return;}
	}
	
	@Override
	public boolean equals(Object obj) { 
		if (obj instanceof SnocList) { // if the object is of type SnocList
			if (this == obj) {return true;} 
		}	
		return false; // return false if obj is the wrong type or != to this
	}
	
	@Override
	public String toString(){
		if (isEmpty()) {return "";} // return empty string if the stack is empty
		if (!isEmpty() & tail == null) {return head + "";} // i.e there is one element in stack
		else {return head + tail.toString();}
	}

}


