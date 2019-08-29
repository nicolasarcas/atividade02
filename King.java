package character;

import Behaviors.WeaponBehavior;

public class King extends Character {

	public King(WeaponBehavior w) {
		weapon = w; 
	}
	@Override
	public void fight() {
		System.out.println("I'm the King");

	}

}
