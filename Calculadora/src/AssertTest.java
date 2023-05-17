import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	public void test() {
		Date date1 = new Date();
		Date date2 = new Date();
		assertEquals(date1, date2);
		assertSame(date1, date2);
	}

}
