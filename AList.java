package cs2s03;

public class AList {
	private char head;
	private int priority;
	private AList tail;
	
	public AList(char a, final int b, final AList ll) {
		this.head = a;
		this.priority = b;
		this.tail = ll;
	}
	
	AList() {
		this.head =  0;
		this.tail = null;
	}
	
	public int getPriority() {return priority;}
	
	public char getHead() {return head;}
	
	public AList getTail() {return tail;}
	
	public AList setTail(AList current) {this.tail = current;return this.tail;}
	
	@Override
	public String toString(){
		if (isEmpty()) {return "";}
		String Elements = "";
		AList temp = this;
		while(temp != null){
			Elements += temp.head;
			temp = temp.tail;
		}
		return Elements;
	}

	@Override
	public boolean equals(Object obj) { 
		if (obj instanceof AList) { 
			if (this == obj) {return true;} 
		}	
		return false; 
	}
	
	public boolean checkPriority(int p, AList next){
		if (p == next.getPriority()) {return false;}
		return (p < next.getPriority());
	}
	
	public boolean isEmpty() {return this.head == 0;}
}
