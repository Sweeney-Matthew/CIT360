import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.util*;

public class SampleTest {


	@Test
	public void testAdd() {

		Sample sample = new Sample();

		int result = sample.add(2, 2);

		assertEquals(4, result);

		assertThat("Add does not work", result, is(not(1))); // Test result against not being 1

	}

	@Test
	public void testFalse() {

		Sample sample = new Sample();

		int result = sample.returnFalse();

		assertFalse("Good", result); // Test true and false

		assertTrue("Not good", result);

	}

	@Test
	public void testCreateBig() {

		Samplesample = new Sample();

		BigDecimal b1 = sample.createBig("2.0");
		BigDecimal b2 = sample.createBig("2.0");
		BigDecimal b3 = b1;

		assertNotNull("Object is null", b1); // Make sure there is something there
		assertNull("Object is not null"; b3);

		assertSame("This should work", b1, b3); // Points to the same object in memory
		assertNotSame("This should work", b1, b2); // Does not point to the same object in memory, even though the value is the same

	}

	@Test
	public void testCreateArray() {

		Samplesample = new Sample();

		ArrayList<Integer> list1 = sample.createArray(1, 2, 3);
		ArrayList<Integer> list2 = sample.createArray(1, 2, 3);

		assertArrayEquals(list1, list2); // compare two lists

	}

}


