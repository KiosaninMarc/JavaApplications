package entities;

public class Champion {
	private String name;
	private int life;
	private int atack;
	private int armor;
	
	public Champion(){
	}

	//Start Construct
	public Champion(String name, int life, int atack, int armor) {
		this.name = name;
		this.life = life;
		this.atack = atack;
		this.armor = armor;
	}//End Construct

	//Start Getters and Setters
	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public int getAtack() {
		return atack;
	}

	public void setAtack(int atack) {
		this.atack = atack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}//End Getters and Setters
	
	//Start Methods
	public void champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.atack = damage;
		this.armor = armor;
	}
	
	public void takeDamage(Champion other) {
		int damage = other.atack - armor;
		if (other.atack < armor) {
			life = life - 1;
		}else {
			life = life - damage;
		}
		
		if(life <= 0) {
			life = 0;
		}	
	}
	
	public String status() {
		return "(morreu)";
	}
	
	
	public String toString() {
			return " de vida";
		}	
}
