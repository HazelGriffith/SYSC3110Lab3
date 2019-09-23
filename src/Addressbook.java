import java.util.ArrayList;


public class Addressbook {
	
	private ArrayList<BuddyInfo> buddiesCollection;
	
	/**
	 * 
	 */
	public Addressbook() {
		this.buddiesCollection = new ArrayList<>();
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
	public void addBuddy(BuddyInfo buddy) {
		if (buddy != null) {
			buddiesCollection.add(buddy);
		}
	}
	
	/**
	 * @param BuddyInfo object
	 */
	public void removeBuddy(BuddyInfo buddy) {
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
	public BuddyInfo removeBuddy(int index) {
		if (index >= 0 && index < this.buddiesCollection.size()) {
			return this.buddiesCollection.remove(index);
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		BuddyInfo buddy1 = new BuddyInfo("555", "321 Bank", "John");
		Addressbook book = new Addressbook();
		book.addBuddy(buddy1);
		book.removeBuddy(0);
	}
	
}