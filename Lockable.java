/**
 * This is an interface for lockable objects
 * @author Kirin Sharma
 * @version 1.0
 * Lab 2
 * CS131ON
 */

public interface Lockable {
	
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean isLocked();

} // end class
