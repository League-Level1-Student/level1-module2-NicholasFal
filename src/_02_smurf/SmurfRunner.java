package _02_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy = new Smurf("Handy");
		Smurf papa = new Smurf("Papa");
		Smurf smurfette = new Smurf("Smurfette");
		handy.eat();
		String handyName = handy.getName();
		System.out.println(handyName);
		String papaName = papa.getName();
		String papaHatColor = papa.getHatColor();
		String papaGender = papa.isGirlOrBoy();
		String smurfetteName = smurfette.getName();
		String smurfetteHatColor = smurfette.getHatColor();
		String smurfetteGender = smurfette.isGirlOrBoy();
		System.out.println(papaName);
		System.out.println(papaHatColor);
		System.out.println(papaGender);
		System.out.println(smurfetteName);
		System.out.println(smurfetteHatColor);
		System.out.println(smurfetteGender);
	}

}
