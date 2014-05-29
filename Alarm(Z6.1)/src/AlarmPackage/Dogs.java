package AlarmPackage;

public class Dogs implements AlarmListener {

	@Override
	public void alarmTurnedOn(EnteredPinEvent event) {
		System.out.println("PIN NIEPOPRAWNY! SPUSZCZAM PSY!");

	}

	@Override
	public void alarmTurnedOff(EnteredPinEvent event) {
		System.out.println("PIN POPRAWNY! ZAMYKAM PSY!");
	}

}
