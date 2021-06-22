package _03_tea_maker;

import _03_tea_maker.Kettle.Water;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup cup = new Cup();
		TeaBag teabag = new TeaBag(TeaBag.PASSION_FRUIT);
		Kettle kettle = new Kettle();
		kettle.boil();
		cup.makeTea(teabag, kettle.getWater());
	}

}
