package character;

import Behaviors.WeaponBehavior;

public class Knight extends Character {

	public Knight(WeaponBehavior w) {
		weapon = w;
	}
		
	@Override
	public void fight() {
		System.out.println("I'm the Knight");
	}

}
