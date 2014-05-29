package AlarmPackage;

import java.util.ArrayList;
import java.util.List;

public class Alarm {
	/**
	 * Lista "s�uchaczy" alarmu, czyli operacji, kt�re si� wykonaj� 
	 * w momencie w��czenia alarmu
	 */
	private List<AlarmListener> listeners;
	/**
	 * Wz�r PINu
	 */
	private String pinPattern;
	
	
	
	/**
	 * Konstruktor domy�lny tworz�cy obiekt listy
	 * i ustawiaj�cy PIN na 1234
	 */
	public Alarm() {
		listeners = new ArrayList<AlarmListener>();
		this.pinPattern = "1234";
	}
	
	/**
	 * Kostruktor tworz�cy w�asny wz�r PINu oraz obiekt listy
	 * @param pinPattern
	 */
	public Alarm(String pinPattern) {
		listeners = new ArrayList<AlarmListener>();
		this.pinPattern = pinPattern;
	}
	
	
	
	public void addListener(AlarmListener listener){
		listeners.add(listener);
	}
	
	public void removeListener(AlarmListener listener){
		listeners.remove(listener);
	}
	
	
	public void enterPin(String pin){
		if(pin.equals(pinPattern)) {
			correctPinEntered();
		}
		else
			wrongPinEntered();	
	}
	
	
	private void wrongPinEntered(){
		if(listeners != null){
			for(AlarmListener x: listeners) {
				x.alarmTurnedOn(new EnteredPinEvent(this));
			}
		}
	
	}
	private void correctPinEntered(){
		if(listeners != null) {
			for(AlarmListener x: listeners) {
				x.alarmTurnedOff(new EnteredPinEvent(this));
			}
		}
		System.out.println("Brawo! Poda�e� prawi�owy pin! Otwieram sejf....");		
		
	}

}
