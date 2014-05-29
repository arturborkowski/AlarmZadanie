package AlarmPackage;

import java.util.Date;

public class EnteredPinEvent {
	
	private Alarm alarm;
	private Date eventDate;
	
	public EnteredPinEvent(Alarm alarm) {
		this.alarm = alarm;
		eventDate = new Date();

	}
	
	
	public Alarm getAlarm() {
		return alarm;
	}
	
	
	public Date getDate() {
		return eventDate;
	}

}
