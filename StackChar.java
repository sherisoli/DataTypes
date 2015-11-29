package cs2s03;
import java.util.ArrayList;

class StackChar implements MyStack {
	@SuppressWarnings("rawtypes")
	private ArrayList top; 
	
	@SuppressWarnings("rawtypes")
	public StackChar() { // Constructor for empty stack
		top = new ArrayList();
	}
	
	@Override
	public boolean isEmpty() {  // checks if the stack is empty
		return top.size() == 0;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void push(char c) { // adds a character to the stack
		top.add(c);	
	}
	
	@Override
	public void pop() { // pops the top
		if (!isEmpty()) {top.remove(top.size()-1);} // removes the last element (i.e. the top)
	// do nothing if it's empty
	}
	
	@Override
	public char top() throws EmptyContainerException { // returns the top
		if (isEmpty()) {throw new EmptyContainerException("The list is empty.");}
		return (char) top.get(top.size()-1); 
	}
	
	@Override
	public boolean equals(Object obj) { // tests equality of obj and the structure it's being called on
		if (obj instanceof StackChar) { // if the object is of type StackChar
			if (top == obj) {return true;} 
		}	
		return false; // return false if obj is the wrong type or not equal to what it is called on
	}
	
	@Override
	public String toString() { 		// displays the obj as a string
		if (isEmpty()) {return "";} // returns an empty string if the stack is empty
		String ListOfElements = ""; 
		while (isEmpty() == false) { // while the stack is not empty
			ListOfElements += top.get(top.size()-1); // concatenate the char head and the string
			pop();
		}
		return ListOfElements; // return the string representation 
	}	
}