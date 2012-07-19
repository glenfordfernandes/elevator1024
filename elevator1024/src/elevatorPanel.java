import java.util.ArrayList;


public class elevatorPanel  {
	int totalFButtons;
	DoorOpen opDrButtn = new DoorOpen();
	ArrayList<FloorButton> ePanel = new ArrayList<FloorButton>();
	OtherButtons OthrButtns;
	
	public elevatorPanel(int noFloors)
	{
		
		for(int fno=1; fno<=noFloors;fno++)
		{
			FloorButton flr = new FloorButton(fno, this);
			ePanel.add(flr);
			this.totalFButtons ++;
		}
		
		System.out.println("Epanel with "+ this.totalFButtons +" buttons created");
		
	}
	
	public int getTotalbuttns()
	{
		return this.totalFButtons;
				
	}
	
}
