package AlarmPackage;

public class Bars implements AlarmListener {

	@Override
	public void alarmTurnedOn(EnteredPinEvent event) {
		System.out.println("PIN NIEPOPRAWNY! OPUSZCZAM KRAT�!");
	}

	@Override
	public void alarmTurnedOff(EnteredPinEvent event) {
		System.out.println("PIN POPRAWNY! PODNOSZ� KRAT�!");
	}

}
