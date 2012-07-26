
public class ElevCallButton {

	int fno;
	boolean state = false;
	//ElevatorDoor elevDoor;
	Door eDoor;
	Door fDoor;
	public ElevCallButton(int fno) {
		// TODO Auto-generated constructor stub
		this.fno = fno;
		//elevDoor = new ElevatorDoor();
		eDoor = new ElevatorDoor();
		fDoor = new FloorDoor();
	}

	public void press()
	{
		if(this.state)
		{
			this.state = false;
		}
		else
		{
			this.state = true;
			System.out.println("The Elevator is called at floor "+ this.fno);
			this.eDoor.toggleOpenDoor();
			this.fDoor.toggleOpenDoor();
			this.eDoor.toggleOpenDoor();
			this.fDoor.toggleOpenDoor();
		}
	}
	
}
