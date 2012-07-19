
public class ElevatorDoor  {

	boolean eDoorState = false;
	
	public boolean toggleOpenDoor()
	{
		if(this.eDoorState)
		{
			this.eDoorState = false;
			
		}
		else
		{
			this.eDoorState = true;
		}
		
		return eDoorState;
	}
	
	public boolean getDoorState()
	{
		return eDoorState;
	}
	
	
	
	
}
