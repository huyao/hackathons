package hackathons;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Player {
	private int health;
	private int maxHealth;
	private int damage;
	private int attack;
	private String name;
	private int dodge;
	private int critical;
	private int initiative; 
	private int winMatch;
	
	
	
	public void printInfo(){
		System.out.println("Candidate 1:"+getName());
		System.out.println("Health:"+getMaxHealth());
		System.out.println("Damage:"+getDamage());
		System.out.println("Attacks:"+getAttack());
		
	}
	
	public Player(List list) {
		this.setName((String) list.get(0));
		this.setMaxHealth((int)list.get(1));
		this.setDamage((int)list.get(2));
		this.setAttack((int)list.get(3));
		this.setInitiative((int)list.get(6));
	}

	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDodge() {
		return dodge;
	}
	public void setDodge(int dodge) {
		this.dodge = dodge;
	}
	public int getCritical() {
		return critical;
	}
	public void setCritical(int critical) {
		this.critical = critical;
	}
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	public int getWinMatch() {
		return winMatch;
	}
	public void win() {
		this.winMatch++;
	}
	
	public int roll(){
		Random r = new Random();
		return r.nextInt(initiative);
	}
	
	public void attack(Player defender){
		int currentDefenderHealth = defender.getHealth();
		defender.setHealth(defender.getHealth() - getDamage());
		System.out.println("Candidate 1:"+getName() + " hits candidate "
		   +defender.getName() + " for "+getDamage() +"("+currentDefenderHealth+"->"+defender.getHealth()+")");
		
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	

}
