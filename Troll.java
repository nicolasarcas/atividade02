package character;

import Behaviors.WeaponBehavior;

public class Troll extends Character {
	
	public Troll(WeaponBehavior w) {
		weapon = w;
	}
	
	@Override
	public void fight() {
		System.out.println("I'm the Troll");
	}

}
