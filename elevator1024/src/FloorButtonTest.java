import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FloorButtonTest {

	/*
	@Before
	public void setUp() throws Exception {
	}
*/
	@Test
	public void testGetFButnNo() {
		//fail("Not yet implemented");
		elevatorPanel epanel = null;
		FloorButton fb = new FloorButton(5,epanel);
		
		assertEquals(5,fb.getFButnNo());
	}
	
	@Test
	public void testFBtnPress()
	{
		elevatorPanel epanel = null;
		FloorButton fb = new FloorButton(5,epanel);
		
		assertEquals(true,fb.fBtnPress());
	}
}
