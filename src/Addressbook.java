import java.util.ArrayList;


public class Addressbook {
	
	private ArrayList<BuddyInfo> buddiesCollection = new ArrayList();
	
	/**
	 * 
	 */
	public Addressbook() {
		
	}

	/**
	 * @return the buddies
	 */
	private ArrayList<BuddyInfo> getBuddies() {
		return buddiesCollection;
	}

	/**
	 * @param buddies the buddies to set
	 */
	private void setBuddies(ArrayList<BuddyInfo> buddies) {
		buddiesCollection = buddies;
	}

	/**
	 * @param BuddyInfo object
	 */
	private void addBuddy(BuddyInfo buddy) {
		buddiesCollection.add(buddy);
	}
	
	/**
	 * @param BuddyInfo object
	 */
	private void removeBuddy(BuddyInfo buddy) {
		for (BuddyInfo bud: buddiesCollection) {
			if (bud.equals(buddy)){
				buddiesCollection.remove(buddy);
			}
		}
	}
	
	/**
	 * 
	 * @param int index
	 */
	private void removeBuddy(int index) {
		buddiesCollection.remove(index);
	}
	
	public static void main(String[] args) {
		System.out.println("Address book");
		BuddyInfo buddy1 = new BuddyInfo("555", "321 Bank", "John");
		Addressbook book = new Addressbook();
		book.addBuddy(buddy1);
		book.removeBuddy(0);
	}
	
}