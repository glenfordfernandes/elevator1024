
public class Elevator {

	boolean elevState = true;
	int currentFloor = 0;
	//elevatorPanel elevpanel;
	ElevatorDoor elevDoorObj;
	elevatorPanel elevpanel;
	int totalButtons;
	
	
	public Elevator(int noFloors) {
		// TODO Auto-generated constructor stub
		this.totalButtons = noFloors;
		elevDoorObj = new ElevatorDoor();
		elevpanel = new elevatorPanel(this.totalButtons);
	}

	

	public boolean isElevState() {
		return elevState;
	}
	
	
}
