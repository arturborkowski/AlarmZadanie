package AlarmPackage;

public class Police implements AlarmListener {

	@Override
	public void alarmTurnedOn(EnteredPinEvent event) {
		System.out.println("PIN NIEPOPRAWNY! DZWONI� PO POLICJ�!");

	}

	@Override
	public void alarmTurnedOff(EnteredPinEvent event) {
		System.out.println("PIN POPRAWNY! ODWO�UJ� POLICJ�!");

	}

}
