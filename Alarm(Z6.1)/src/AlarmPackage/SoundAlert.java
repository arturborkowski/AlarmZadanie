package AlarmPackage;

public class SoundAlert implements AlarmListener {

	@Override
	public void alarmTurnedOn(EnteredPinEvent event) {
		System.out.println("PIN NIEPOPRAWNY! W£¥CZAM ALARM!");
	}

	@Override
	public void alarmTurnedOff(EnteredPinEvent event) {
		System.out.println("PIN POPRAWNY! WY£¥CZAM ALARM!");
	}

}
