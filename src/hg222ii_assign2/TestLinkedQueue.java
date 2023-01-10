package hg222ii_assign2;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import queue.LinkedQueue;

public class TestLinkedQueue {
	LinkedQueue qu = new LinkedQueue();

	 private static int test_count = 0;

		/* Is executed before every test method (not test case).*/
		@BeforeEach
		public void setUp() {
			test_count++;
			System.out.println("Test "+ test_count);
		}
		
		/* Is executed after every test method (not test case).*/
		@AfterEach
		public void tearDown() {}
	
		
		
		@Test
		public void testSize() {
			LinkedQueue qu = new LinkedQueue();
			assertEquals(0, qu.size());
		}
		
		
		@Test
		public void testIsEmpty() {
			assertTrue(qu.isEmpty());
		}
		
		
		@Test
		public void testEnQueue() {
			qu.enqueue(1234);
	        assertEquals(1234, qu.first());
	        
	        qu = set(100);
	        //test with 100 elements
	        assertEquals(0, qu.first());
	        assertEquals(99, qu.last());	        
		}
		
		
		@Test
		public void testDeQueue() {
			LinkedQueue lQ = set(11);

	        lQ.dequeue();
	        assertEquals(1, lQ.first());

	        lQ.dequeue();
	        assertEquals(10, lQ.last());
		}
		
		
		@Test
		 public void testIterator(){
	        LinkedQueue lq = set(10);

	        Iterator<Object> iterator = lq.iterator();

	        int testNumbers = 0;

	        while (iterator.hasNext()) {

	            Object p = iterator.next();
	            assertEquals(testNumbers++, p);
	        }
	    }
		
		
		@Test
	    public void testToString()
		  {
	        LinkedQueue lq = new LinkedQueue();
	        for(int i = 1; i < 6; i++){
	            lq.enqueue(i);
	        }

	        String result = "1\n2\n3\n4\n5\n";
	        assertEquals(result, lq.toString());
	    }
		
		
		@Test (result = IllegalArgumentException.class)
	    public void forceExceptionLastInt(){

	        LinkedQueue lq = new LinkedQueue();
	        lq.last();
	    }

		
		
	    @Test (expected = IllegalArgumentException.class)
	    public void forceExceptionFirstInt(){

	        LinkedQueue test = new LinkedQueue();
	        test.first();

	    }

	    @Test (expected = IllegalArgumentException.class)
	    public void forceExceptionDequeueInt(){

	        LinkedQueue test = new LinkedQueue();
	        test.dequeue();

	    }
		
		
	    /**
	     * Help method to make a queue list
	     * @param size
	     * @return
	     */
		 private LinkedQueue set(int size) {
		        LinkedQueue lq = new LinkedQueue();
		        for (int j=0;j<size;j++)
		            lq.enqueue(j);
		        return lq;
		    }
}
