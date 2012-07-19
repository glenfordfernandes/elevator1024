import java.util.ArrayList;


public class elevatorPanel  {
	int totalFButtons=0;
	DoorOpen opDrButtn = new DoorOpen();
	ArrayList<FloorButton> ePanel = new ArrayList<FloorButton>();
	ArrayList<Floor> floors = new ArrayList<Floor>();
	
	public elevatorPanel()
	{
		
		for(int fno=1; fno<=5;fno++)
		{
			/* NOT WORKIN CODE 
			 * 
			 */
				
			FloorButton flr = new FloorButton(fno, this);
			//ePanel.add(new FloorButton(fno));
			ePanel.add(flr);
			//ePanel.add(new DoorOpen());
			//ePanel.add(new StopButton());
			//ePanel.add(new Alarm());
			/* */
			
			Floor floor = new Floor(fno);//CREATING NEW FLOOR OBJECTS 
			floors.add(floor);
			
			this.totalFButtons ++;
			
		}
		
	}
	
	public int getTotalbuttns()
	{
		return this.totalFButtons;
				
	}
	
}
