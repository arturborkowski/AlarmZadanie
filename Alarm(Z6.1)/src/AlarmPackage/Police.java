package AlarmPackage;

public class Police implements AlarmListener {

	@Override
	public void alarmTurnedOn(EnteredPinEvent event) {
		System.out.println("PIN NIEPOPRAWNY! DZWONIÊ PO POLICJÊ!");

	}

	@Override
	public void alarmTurnedOff(EnteredPinEvent event) {
		System.out.println("PIN POPRAWNY! ODWO£UJÊ POLICJÊ!");

	}

}
