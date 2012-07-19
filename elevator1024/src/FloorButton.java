
public class FloorButton {

	int fno;
	Elevator elevObj;
	elevatorPanel epanel;
	boolean pressed = false;
	
	public FloorButton(int fno,elevatorPanel epanel) {
		// TODO Auto-generated constructor stub
		this.fno = fno;
		this.epanel = epanel;
	}
	
	
	public int getFButnNo()
	{
		return this.fno; 
	}
	
	public boolean fBtnPress()
	{
		if(this.pressed)
		{
			this.pressed = false;
			
			
		}
		else
		{
			this.pressed= true;
			this.elevObj.currentFloor = this.fno;
		}
		
		return this.pressed;
	}

}
