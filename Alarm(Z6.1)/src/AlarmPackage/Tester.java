package AlarmPackage;

public class Tester {

	public static void main(String[] args) {
		
		Alarm nowy = new Alarm();
		
		nowy.addListener(new Dogs());
		nowy.addListener(new Police());
		nowy.addListener(new Bars());
		nowy.addListener(new SoundAlert());
		
		nowy.enterPin("12");
		
		
		System.out.println();
		
		nowy.enterPin("1234");

	}

}
