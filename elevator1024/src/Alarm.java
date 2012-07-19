
public class Alarm {

	boolean alarmState = false;

	public boolean isAlarmState() {
		return alarmState;
	}

	public void setAlarmState(boolean alarmState) {
		this.alarmState = alarmState;
	}
	
	public void press()
	{
		if(this.alarmState)
		{
			this.alarmState = false;
			
		}
		else
		{
			this.alarmState = true;
		}
	}
		
}
