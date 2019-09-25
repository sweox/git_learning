package _1;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class Class1Test
{
	@Test
	public void testLinkedListSpyWrong() {
		// Lets mock a LinkedList
		List<String> list = new LinkedList<>();
		List<String> spy = Mockito.spy(list);
		List<String>  listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("foo");

		// this does not work
		// real method is called so spy.get(0)
		// throws IndexOutOfBoundsException (list is still empty)
//		when(spy.get(0)).thenReturn("foo");

//		assertEquals("foo", spy.get(0));
		assertEquals("foo", listMock.get(0));
	}

}
