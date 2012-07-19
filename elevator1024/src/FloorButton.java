
public class FloorButton {

	int fno;
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
			
		}
		
		return this.pressed;
	}

}
