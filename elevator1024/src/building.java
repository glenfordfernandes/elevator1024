import java.util.ArrayList;


public class building {
	ArrayList<Floor> floors = new ArrayList<Floor>();
	Floor floorObj;
	//Elevator elevator = new Elevator();
	int totalFloors;
	int i;
	Elevator elevator;
	public building(int noFloors)
	{
		this.totalFloors = noFloors;
		for(i=0;i<noFloors;i++)
		{
			
			Floor floor = new Floor(i);
			//System.out.println(floor.floorNo);
			floors.add(floor);
		}
		
		System.out.println("Building with "+ noFloors +" floors created");
		elevator = new Elevator(totalFloors);
	}

}
