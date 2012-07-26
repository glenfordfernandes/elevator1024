/*
 * This class in not used in the elevator design. its been kept as it was a part of the original 
 * design....
 * 
 */
public class DoorOpen {
	
	ElevatorDoor eDoor = new ElevatorDoor();
	public boolean press()
	{
		eDoor.toggleOpenDoor();
		return eDoor.eDoorState;
	}
	
}
