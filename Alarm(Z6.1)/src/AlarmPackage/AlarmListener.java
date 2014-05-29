package AlarmPackage;

public interface AlarmListener {
	
	public void alarmTurnedOn(EnteredPinEvent event);
	public void alarmTurnedOff(EnteredPinEvent event);

}
