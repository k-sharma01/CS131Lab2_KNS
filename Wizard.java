/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley, Kirin Sharma
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */

public class Wizard implements Lockable {
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		name = "";
		health = 0;
		key = 0;
		locked = false;
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		setName(name);
		setHealth(500);
		key = 0;
		locked = false;
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if (isLocked())
		{
			return;
		}
		else
		{
			health -= power;
		}
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
	/**
	 * Setter for key
	 * @param key
	 */
	public void setKey(int key)
	{
		if (key > 0 && this.key == 0)
		{
			this.key = key;
		}
	} // end setKey
	
	/**
	 * This method locks the wizard if the key passed in is correct
	 * @param key
	 */
	public void lock(int key)
	{
		if (key == this.key)
		{
			locked = true;
		}
	} // end lock
	
	/**
	 * This method unlocks the wizard if the key passed in is correct
	 * @param key
	 */
	public void unlock(int key)
	{
		if (key == this.key)
		{
			locked = false;
		}
	} // end unlock
	
	/**
	 * Getter for locked
	 * @return
	 */
	public boolean isLocked()
	{
		return locked;
	} // end isLocked
	
}//end class
