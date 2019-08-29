package character;

import Behaviors.WeaponBehavior;

public class Queen extends Character {
	
	public Queen(WeaponBehavior w) {
		weapon = w;
	}
	
	public void fight() {
		System.out.println("I'm the Queen");
	}
}
