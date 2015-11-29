package cs2s03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestingA4 {
	
	// ListChar Exception Test 1
	@Test(expected = EmptyContainerException.class)
	public void ListChar_ExceptionTest1() throws EmptyContainerException {
		ListChar ListChar1 = new ListChar(); ListChar1.top();
	}
	// ListChar Exception Test 2
	@Test(expected = EmptyContainerException.class)
	public void ListChar_ExceptionTest2() throws EmptyContainerException {
		ListChar ListChar2 = new ListChar('a',null); 
		ListChar2.pop(); ListChar2.top(); 
	}
	// ListChar Exception Test 3
	@Test(expected = EmptyContainerException.class)
	public void ListChar_ExceptionTest3() throws EmptyContainerException {
	ListChar ListChar3 = new ListChar('a', new ListChar('b',null)); 
	ListChar3.pop(); ListChar3.pop(); ListChar3.top();
	}
	
	// StackChar Exception Test 1
	@Test(expected = EmptyContainerException.class)
	public void StackChar_ExceptionTest1() throws EmptyContainerException {
	StackChar StackChar1 = new StackChar(); 
	StackChar1.top();
	}

	// StackChar Exception Test 2
	@Test(expected = EmptyContainerException.class)
	public void StackChar_ExceptionTest2() throws EmptyContainerException {
		StackChar StackChar2 = new StackChar(); 
		StackChar2.push('a'); StackChar2.pop(); StackChar2.top();
	}
	
	// StackChar Exception Test 3
	@Test(expected = EmptyContainerException.class)
	public void StackChar_ExceptionTest3() throws EmptyContainerException {
		StackChar StackChar2 = new StackChar(); 
		StackChar2.push('a'); StackChar2.push('b'); 
		StackChar2.pop(); StackChar2.pop(); StackChar2.top();
	}
		
	// SnocQueue Exception Test 1
	@Test(expected = EmptyContainerException.class)
	public void SnocQueue_ExceptionTest1() throws EmptyContainerException {
		SnocQueue SQueue1 = new SnocQueue(); SQueue1.peek();
	}
	
	@Test
	public void testListChar() {
		
		// ListChar Test 4 (Length: 15)
		ListChar List4 = new ListChar();
		List4.push('!'); List4.push('d'); List4.push('e'); List4.push('r');
		List4.push('i'); List4.push('T'); List4.push('s'); List4.push('I');
		List4.push('e'); List4.push('n'); List4.push('i'); List4.push('r');
		List4.push('e'); List4.push('h'); List4.push('S');
		assertEquals("This should be SherineIsTired!", "SherineIsTired!", List4.toString());
		
		// ListChar Test 5 (Length: 15)
		ListChar List5 = new ListChar();
		List5.push('y'); List5.push('p'); List5.push('m'); List5.pop();
		List5.push('p'); List5.push('a'); List5.push('s'); List5.pop();
		List5.push('H'); List5.push('n'); List5.push('i'); List5.pop();
		List5.pop(); List5.push('I'); List5.pop();
		assertEquals("This should be Happy", "Happy", List5.toString());
		
		// ListChar Test 6 (Length: 15)
		ListChar List6 = new ListChar('e', new ListChar('f', new ListChar('g', null)));
		List6.push('d'); List6.push('m'); List6.pop(); List6.pop(); List6.push('d');
		List6.push('c'); List6.push('q'); List6.pop(); List6.push('b'); List6.push('a'); 
		List6.push('b'); List6.push('z'); List6.pop(); List6.pop();
		assertEquals("This should be abcdefg", "abcdefg", List6.toString());
		
		// ListChar Test 7
		ListChar List7 = new ListChar('a',null); List7.pop(); // Tests pop
		assertEquals("This should be true", true, List7.isEmpty()); // Tests isEmpty()
		
		// ListChar Test 8
		ListChar List8 = new ListChar(); List8.pop(); // Tests pop when empty
		assertEquals("This should be empty", "", List7.toString()); // Tests toString() when empty
		
		// ListChar Test 9
		ListChar List9 = new ListChar();
		assertEquals("This should be true", true, List9.isEmpty()); // Testing isEmpty()
		assertEquals("This should be an empty string", "", List9.toString()); // Testing toString()
		List9.push('c'); List9.push('b'); List9.push('a');
		assertEquals("This should be abc", "abc", List9.toString()); // Testing push()
		
		// ListChar Test 10
		ListChar List10 = new ListChar('a', new ListChar('p',null));
		List10.pop();
		assertEquals("should be", "p", List10.toString());
	}
	
	@Test
	public void testStackChar() throws EmptyContainerException{

		// StackChar Test 4 (Length:15)
		StackChar Array4 = new StackChar(); 
		Array4.push('a'); Array4.push('w'); Array4.push('e'); Array4.push('s'); 
		Array4.push('o'); Array4.push('m'); Array4.push('e'); Array4.push('l'); 
		Array4.pop(); Array4.pop(); Array4.push('i'); Array4.push('f'); 
		Array4.pop(); Array4.push('e'); 
		assertEquals("This should be eimosewa", "eimosewa", Array4.toString());
		
		// StackChar Test 5 (Length:15)
		StackChar Array5 = new StackChar(); 
		Array5.push('a'); Array5.push('b'); Array5.push('c'); Array5.push('d'); 
		Array5.pop(); Array5.push('e'); Array5.push('f'); Array5.push('g'); 
		Array5.push('h'); Array5.pop(); Array5.pop(); Array5.push('i'); 
		Array5.push('j'); Array5.pop(); Array5.push('k'); 
	    assertEquals("This should be false", false, Array5.isEmpty());
	    
		// StackChar Test 6 (Length:15)
		StackChar Array6 = new StackChar(); 
	    Array6.push('a'); Array6.push('b'); Array6.push('l'); 
		Array6.push('d'); Array6.pop(); Array6.push('n'); 
		Array6.push('g'); Array6.push('u'); Array6.push('e'); 
		Array6.pop(); Array6.pop(); Array6.push('f'); 
		Array6.push('g'); Array6.pop(); Array6.push('n'); 
	    assertEquals("This should be n", 'n', Array6.top());
	    
		// StackChar Test 7
	    StackChar Array7 = new StackChar();
	    assertEquals("This should be empty", "", Array7.toString());
		
	    // StackChar Test 8
		StackChar Array8 = new StackChar(); 
		Array8.push('q'); Array8.pop(); Array8.push('r');
	    assertEquals("This should be r", "r", Array8.toString());
		
	    // StackChar Test 9
		StackChar Array9 = new StackChar();
		assertEquals("This should be true", true, Array9.isEmpty()); // Test isEmpty()
		
		// StackChar Test 10
		StackChar Array10 = new StackChar(); 
		Array10.push('3'); Array10.push('0'); Array10.push('s'); Array10.push('2');
		assertEquals("This should be 2s03", "2s03", Array10.toString());	
	  }
		
	@Test
	public void testSnocList() throws EmptyContainerException {
		
		// SnocList Test 4 (Length:15)
		SnocList List4 = new SnocList('c', new SnocList ('b', new SnocList('a',null)));
		List4.add('d');List4.add('e');List4.add('f');List4.add('g');List4.add('h');
		List4.add('i');List4.add('j');List4.add('k');List4.add('l');List4.add('m');
		List4.add('n');List4.add('o');List4.add('p');List4.add('q');List4.add('r');
		assertEquals("This should be abcdefghijklmnopqr", "abcdefghijklmnopqr", List4.toString());
		
		// SnocList Test 5 (Length:15)
		SnocList List5 = new SnocList();
		List5.add('a'); List5.add('b'); List5.add('c'); List5.add('d');
		List5.add('e'); List5.add('s'); List5.remove(); List5.remove();
		List5.remove(); List5.add('t'); List5.add('u'); List5.add('v');
		List5.add('w'); List5.remove(); List5.remove();
		assertEquals("This should be stuvw", "stuvw", List5.toString());
		
		// SnocList Test 6 (Length:15)
		SnocList List6 = new SnocList();
		List6.add('e'); List6.add('s'); List6.remove(); List6.remove();
		List6.add('a'); List6.add('t'); List6.add('u'); List6.add('v');
		List6.add('w'); List6.remove(); List6.remove(); List6.remove();
		List6.remove(); List6.remove(); List6.add('t'); List6.remove();
		assertEquals("This should be empty", "", List6.toString());
		
		// SnocList Test 7
		SnocList List7 = new SnocList('c', new SnocList ('b', new SnocList('a',null)));
		assertEquals("This should be false", false, List7.isEmpty());
		
		// SnocList Test 8
		SnocList List8 = new SnocList('c', new SnocList ('b', new SnocList('a',null)));
		assertEquals("This should be a", 'a', List8.getHead());
		
		// SnocList Test 9
		SnocList List9 = new SnocList('c', new SnocList ('b', new SnocList('a',null)));
		assertEquals("This should be bc", "bc", List9.getTail().toString());
		
		// SnocList Test 10
		SnocList List10 = new SnocList('c', new SnocList ('b', new SnocList('a',null)));
		SnocList Opposite = new SnocList('a', new SnocList ('b', new SnocList('c',null)));
		assertEquals("This should be bc", false, List10.equals(Opposite));
	}	
	
	@Test
	public void testSnocQueue() throws EmptyContainerException {
		
		// SnocQueue Test 4 (Length:15)
		SnocQueue Queue4 = new SnocQueue(); 
		Queue4.enqueue('a'); Queue4.enqueue('b'); Queue4.enqueue('a');
		Queue4.enqueue('s');Queue4.enqueue('h');Queue4.enqueue('e'); 
		Queue4.dequeue(); Queue4.dequeue(); Queue4.enqueue('r');
		Queue4.enqueue('i');Queue4.dequeue(); Queue4.enqueue('!'); 
		Queue4.enqueue('!');Queue4.enqueue('!');Queue4.enqueue('!');
		assertEquals("This should be sheri!!!!", "sheri!!!!", Queue4.toString());
	  
		// SnocQueue Test 5 (Length:15)
		SnocQueue Queue5 = new SnocQueue(); 
		Queue5.enqueue('a'); Queue5.enqueue('b'); Queue5.enqueue('c');
		Queue5.enqueue('d');Queue5.enqueue('e');Queue5.enqueue('f'); 
		Queue5.dequeue(); Queue5.dequeue(); Queue5.enqueue('g');
		Queue5.enqueue('h');Queue5.dequeue(); Queue5.enqueue('i'); 
		Queue5.enqueue('j');Queue5.enqueue('k');Queue5.enqueue('l');
		assertEquals("This should be false", false, Queue5.isEmpty());
		
		// SnocQueue Test 6 (Length:15)
		SnocQueue Queue6 = new SnocQueue();
		Queue6.enqueue('a'); Queue6.enqueue('b'); Queue6.enqueue('a');
		Queue6.enqueue('x');Queue6.enqueue('l');Queue6.enqueue('a'); 
		Queue6.dequeue(); Queue6.dequeue(); Queue6.enqueue('m');
		Queue6.enqueue('l');Queue6.dequeue(); Queue6.enqueue('b'); 
		Queue6.enqueue('i');Queue6.enqueue('p');Queue6.enqueue('o');
		assertEquals("This should be x", 'x', Queue6.peek());
		
		// SnocQueue Test 7
		SnocQueue Queue7 = new SnocQueue();
		Queue7.enqueue('x'); Queue7.enqueue('x'); Queue7.enqueue('y');
		assertEquals("This should be xxy", "xxy", Queue7.toString());
		
		// SnocQueue Test 8
		SnocQueue Queue8 = new SnocQueue();
		Queue8.enqueue('a'); Queue8.dequeue();
		assertEquals("This should be empty", "", Queue8.toString());
		
		// SnocQueue Test 9
		SnocQueue Queue9 = new SnocQueue(new SnocList ('a', new SnocList('p',null)));
		Queue9.enqueue('c'); Queue9.dequeue(); Queue9.enqueue('a'); Queue9.enqueue('l');
		assertEquals("This should be acal", "acal", Queue9.toString());
		
		// SnocQueue Test 10
		SnocQueue Queue10 = new SnocQueue();
		assertEquals("This should be empty", "", Queue10.toString());
	}
	
	@Test
	public void testAList(){
		
		// AList Test 1
		AList List1 = new AList('a', 1, new AList('c', 5, null));
		AList Tail1 = new AList('d', 8, null); List1.setTail(Tail1);
		assertEquals("This should be 1", 1, List1.getPriority());

		// AList Test 2 
		AList List2 = new AList('s', 1, new AList('h', 5, null));
		List2.setTail(null);
		assertEquals("This should be s", "s", List2.toString());

		// AList Test 3
		AList List3 = new AList('o', 1, new AList('m', 5, new AList('g', 10, null)));
		AList Opposite = new AList('g', 1, new AList('m', 5, new AList('o', 10, null)));
		assertEquals("This should be false", false, List3.equals(Opposite));

		// AList Test 4
		AList List4 = new AList('a', 1, null);
		assertEquals("This should be a", "a", List4.toString());

		// AList Test 5
		AList List5 = new AList('a', 1, new AList('b', 5, null));
		assertEquals("This should be ab", "ab", List5.toString()); 

		// AList Test 6
		AList List6 = new AList('a', 1, new AList('c', 5, null));
		assertEquals("This should be a", 'a', List6.getHead());
		
		// AList Test 7
		AList List7 = new AList('a', 1, new AList('c', 5, null));
		AList Tail7 = new AList('d', 6, null); List7.setTail(Tail7);
		assertEquals("This should be ad", "ad", List7.toString());
		
		// AList Test 8
		AList List8 = new AList('a', 3, new AList('c', 5, null));
		assertEquals("This should be 3", 3, List8.getPriority());

		// AList Test 9
		AList List9 = new AList();
		assertEquals("This should be empty", "", List9.toString());
		
		// AList Test 10
		AList List10 = new AList();
		assertEquals("This should be true", true, List10.isEmpty());
	}
	
	@Test
	public void testAListPQueue(){
		
		// AListPQueue Test 1 (Length:15)
		AList List1 = new AList('a',1,null);
		AListPQueue PQueue1 = new AListPQueue (List1);
		PQueue1.insertItem(7,'o'); PQueue1.insertItem(6,'t'); PQueue1.insertItem(20,'i');
		PQueue1.insertItem(12,'r'); PQueue1.insertItem(18,'e'); PQueue1.insertItem(8,'d');
		PQueue1.insertItem(10, 'h'); PQueue1.insertItem(7, 'e'); PQueue1.insertItem(6, 'l');
		PQueue1.insertItem(6, 'p'); PQueue1.insertItem(2, 'm'); PQueue1.insertItem(1, 'e');
		PQueue1.insertItem(1, '!'); PQueue1.deleteItem(); PQueue1.deleteItem();
		PQueue1.deleteItem(); PQueue1.deleteItem();
		assertEquals(PQueue1.toString(), "doetplm!ea");
		
		// AListPQueue Test 2 (Length:15)
		AList List2 = new AList('a',1,null);
		AListPQueue PQueue2 = new AListPQueue (List2);
		PQueue2.insertItem(4,'a'); PQueue2.insertItem(18,'f'); PQueue2.insertItem(20,'j');
		PQueue2.insertItem(17,'b'); PQueue2.insertItem(33,'g'); PQueue2.insertItem(8,'k');
		PQueue2.insertItem(20, 'c'); PQueue2.insertItem(6, 'h'); PQueue2.insertItem(6, 'l');
		PQueue2.insertItem(6, 'd'); PQueue2.insertItem(2, 'i'); PQueue2.insertItem(1, 'm');
		PQueue2.insertItem(3, 'e'); PQueue2.deleteItem(); PQueue2.deleteItem();
		PQueue2.deleteItem(); PQueue2.deleteItem();
		assertEquals(PQueue2.toString(), "bkdhlaeiam");

		// AListPQueue Test 3 (Length:15)
		AListPQueue PQueue3 = new AListPQueue();
		PQueue3.insertItem(20,'a'); PQueue3.insertItem(19,'f'); PQueue3.insertItem(18,'j');
		PQueue3.insertItem(17,'b'); PQueue3.insertItem(16,'g'); PQueue3.insertItem(15,'k');
		PQueue3.insertItem(14, 'c'); PQueue3.insertItem(13, 'h'); PQueue3.insertItem(12, 'l');
		PQueue3.insertItem(11, 'd'); PQueue3.insertItem(10, 'i'); PQueue3.insertItem(9, 'm');
		PQueue3.insertItem(8, 'e'); PQueue3.deleteItem(); PQueue3.deleteItem();
		PQueue3.deleteItem(); PQueue3.deleteItem();
		assertEquals(PQueue3.toString(), "gkchldime ");
		
		// AListPQueue Test 4
		AListPQueue PQueue4 = new AListPQueue ();
		PQueue4.insertItem(5,'a'); PQueue4.insertItem(4,'b'); PQueue4.insertItem(3,'c');
		assertEquals(PQueue4.toString(), "abc ");
		
		// AListPQueue Test 5
		AListPQueue PQueue5 = new AListPQueue ();
		PQueue5.insertItem(5,'a');
		assertEquals(false, PQueue5.isEmpty());
		
		// AListPQueue Test 6
		AListPQueue PQueue6 = new AListPQueue ();
		PQueue6.insertItem(5,'a');PQueue6.insertItem(3,'b');PQueue6.deleteItem();
		assertEquals("b ", PQueue6.toString());
		
		// AListPQueue Test 7
		AListPQueue PQueue7 = new AListPQueue ();
		PQueue7.insertItem(5,'a');PQueue6.insertItem(3,'b');PQueue6.deleteItem();
		assertEquals(false, PQueue7.isEmpty());		
	}
}
