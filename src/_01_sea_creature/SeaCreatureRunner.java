package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature spongebob = new SeaCreature("Spongebob");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		spongebob.eat();
		spongebob.laugh();
		String patrickName = patrick.getName();
		patrick.eat();
		patrick.laugh();
		String squidwardName = squidward.getName();
		squidward.eat();
		squidward.laugh();
		System.out.println(patrickName);
		System.out.println(squidwardName);
	}
	

}
