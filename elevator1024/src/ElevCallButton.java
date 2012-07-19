
public class ElevCallButton {

	int fno;
	boolean state = false;
	ElevatorDoor elevDoor;
	
	public ElevCallButton(int fno) {
		// TODO Auto-generated constructor stub
		this.fno = fno;
		elevDoor = new ElevatorDoor();
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
			System.out.println("The Elevator is called at "+ this.fno);
			this.elevDoor.toggleOpenDoor();
			this.elevDoor.toggleOpenDoor();
		}
	}
	
}
