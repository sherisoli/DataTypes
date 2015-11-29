package cs2s03;

import cs2s03.AList;

class AListPQueue implements MyPriorityQueue {
	private AList Items;
	
	public AListPQueue() {Items= new AList();}
	
	public AListPQueue(AList items) {Items= items;}

	@Override
	public char next() throws EmptyContainerException {
		if(Items != null) {return Items.getHead();}
		else {throw new EmptyContainerException("This list is empty");}
	}

	@Override
	public void deleteItem() {
		if (Items.getHead() == 0) {return;}
		if (!isEmpty()) {Items = Items.getTail();}
	}

	public void insertItem(int i, char c) {
		if(isEmpty()) {Items = new AList(c, i, null);}
		else {
			if(i > Items.getPriority()) {Items = new AList(c, i, Items);}
			
			if(i < Items.getPriority()) { 
				AList initial = Items;
				
				while (initial.checkPriority(i, initial.getTail())) {
					initial = initial.getTail();
				} 
				if (i == initial.getTail().getPriority()){
					if(c > initial.getHead()){
						initial = initial.getTail();
						AList newNode = new AList(c, i, initial.getTail());
						initial.setTail(newNode);
					}
					else {
						AList newNode = new AList(c, i, initial.getTail());
						initial.setTail(newNode);
					}
				}
				else{
					AList newNode = new AList(c, i, initial.getTail());
					initial.setTail(newNode);
				}
			}
		}
	}
	
	@Override
	public String toString(){
		if (isEmpty()) {return "";}
		return Items.toString();	
	}
	
	@Override
	public boolean equals(Object obj) { // tests equality of obj and the structure it's being called on
		if (obj instanceof SnocList) { // if the object is of type ListChar
			if (this == obj) {return true;} 
		}	
		return false; // return false if obj is the wrong type or not equal to what it is called on
	}
	
	public boolean isEmpty() {
		return Items == new AList();
	}

}
