import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AlarmTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsAlarmState() {
		//fail("Not yet implemented");
		
		Alarm testAlarm = new Alarm();
		
			assertEquals(false,testAlarm.isAlarmState());
		
	}

}
