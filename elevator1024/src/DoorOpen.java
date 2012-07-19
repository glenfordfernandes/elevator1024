
public class DoorOpen {
	
	ElevatorDoor eDoor = new ElevatorDoor();
	public boolean press()
	{
		eDoor.toggleOpenDoor();
		return eDoor.eDoorState;
	}
	
}
