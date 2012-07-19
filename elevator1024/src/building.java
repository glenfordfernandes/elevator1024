import java.util.ArrayList;


public class building {
	ArrayList<Floor> floors = new ArrayList<Floor>();
	Floor floorObj;
	Elevator elevator;
	
	public building(int noFloors)
	{
		for(int i=1;i<=noFloors;i++)
		{
			Floor floor = new Floor(i);
			floors.add(floor);
		}
	}
	
}
