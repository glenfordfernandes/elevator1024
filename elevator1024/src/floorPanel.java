
public class floorPanel {
	
	int fno;
	ElevCallButton ecallBtn; 
	
	
	public floorPanel(int fNo)
	{
		this.fno = fNo;
		ecallBtn = new ElevCallButton(this.fno);
	}
	
	//System.out.println(this.fno);
	 
	
	
	
}
