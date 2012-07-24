
public abstract class OtherButtons {
	Alarm alarm;
	StopButton stpBtn;
	Elevator elevator;
	public void press()
	{
		if(this.alarm.alarmState)
		{
			this.alarm.alarmState = false;
			
		}
		else
		{
			this.alarm.alarmState = true;
		}
	}
	public void elevStop()
	{
		this.elevator.elevState = false;
	}
	
}
