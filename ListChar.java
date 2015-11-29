package cs2s03;

class ListChar implements MyStack {
	private ListChar tail; 
	private char head;
	
	public ListChar(char c, ListChar tail) { // Constructor
		this.head = c; 
		this.tail = tail; } 
	
    public ListChar() {
    	this.head = 0;
    	this.tail = null;
    }
    
	@Override
	public boolean isEmpty() { // checks if the stack is empty
		return this.head == 0; }
	
	@Override
	public void push(char c) { // adds a character to the stack
		// sets the current stack of elements to be the tail
		this.tail = new ListChar(this.head,this.tail); 
		this.head = c; // sets the head to the char being pushed in
	}
	
	@Override
	public void pop() { // pops the head
		if (this.head == 0) {return;} // does nothing if the list is empty
		if (!isEmpty()) {
			if (this.tail != null) {
				this.head = this.tail.head;
				this.tail = this.tail.tail;}
			else if (this.tail == null){this.head = 0;}
		} 
	}

	@Override
	public char top() throws EmptyContainerException { // returns the head (i.e. the top)
		if (isEmpty()) { throw new EmptyContainerException("The list is empty.");}
		return this.head; 
	} // returns the head of the stack
	
	@Override
	public boolean equals(Object obj) { // tests equality with obj
		if (obj instanceof ListChar) { // if the object is of type ListChar
			if (this == obj) {return true;} 
		}	
		return false; // return false if obj is the wrong type or != to the stack it's
		              // being compared to
	}
	
	@Override
	public String toString() { // displays the obj as a string
		if (isEmpty()) {return "";} // returns an empty string if the stack is empty
		String ListOfElements = ""; 
		while (this.isEmpty() == false) { // while the stack is not empty
			ListOfElements += this.head; // concatenate the char head and the string
			pop();
		}
		return ListOfElements; // return the string representation 
	}
} 

