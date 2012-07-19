import java.util.ArrayList;


public class elevatorPanel  {
	int totalFButtons=0;
	DoorOpen opDrButtn = new DoorOpen();
	ArrayList<FloorButton> ePanel = new ArrayList<FloorButton>();
	OtherButtons OthrButtns;
	
	public elevatorPanel()
	{
		
		for(int fno=1; fno<=5;fno++)
		{
			FloorButton flr = new FloorButton(fno, this);
			ePanel.add(flr);
			this.totalFButtons ++;
		}
		
	}
	
	public int getTotalbuttns()
	{
		return this.totalFButtons;
				
	}
	
}
