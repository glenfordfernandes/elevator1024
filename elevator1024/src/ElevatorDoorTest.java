import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ElevatorDoorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToggleOpenDoor() {
		//fail("Not yet implemented");
		ElevatorDoor eDoor = new ElevatorDoor();
		
		if(eDoor.toggleOpenDoor())
		{
			assertEquals(false,eDoor.toggleOpenDoor());
		}
		else
		{
			assertEquals(true,eDoor.toggleOpenDoor());
		}
		
	}
	
	@Test
	public void testGetDoorState()
	{
		ElevatorDoor eDoor = new ElevatorDoor();
		
		assertEquals(false,eDoor.getDoorState());
		
	}

}
