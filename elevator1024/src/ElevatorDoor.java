
public class ElevatorDoor  {

	boolean eDoorState = false;
	
	public boolean toggleOpenDoor()
	{
		if(this.eDoorState)
		{
			this.eDoorState = false;
			System.out.println("Elevator door closed");
		}
		else
		{
			this.eDoorState = true;
			System.out.println("Elevator door opened");
		}
		
		return eDoorState;
	}
	
	public boolean getDoorState()
	{
		return eDoorState;
	}
	
	
	
	
}
