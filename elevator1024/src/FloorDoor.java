
public class FloorDoor implements Door{

	boolean fDoorState = false;
	
	public boolean toggleOpenDoor()
	{
		if(this.fDoorState)
		{
			this.fDoorState = false;
			System.out.println("Floor door closed");
		}
		else
		{
			this.fDoorState = true;
			System.out.println("Floor door opened");
		}
		
		return fDoorState;
	}
	
}
