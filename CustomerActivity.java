package nohello;
// complete
public class CustomerActivity extends Person{
	String phoneNumber;
	String[] listService = {"Internet banking","e-ticketing","e-wallet"};
	// constructors
	public CustomerActivity() {
		super("YES", 23);
		phoneNumber = "0109";
	}
	public CustomerActivity(int i) {
		super("YES", 23+i);
		phoneNumber = "0109";
	}
	public CustomerActivity(String p) {
		super("YES", 23);
		phoneNumber = p;
	}
	public CustomerActivity(String p, String n) {
		super(n, 23);
		phoneNumber = p;
	}
	// set method
	public void setPhoneNumber(String p) {
		phoneNumber = p;
	}
	// get method
	public String getPhoneNumber() {
		return phoneNumber;
		}
	// show Activity, show array contains
	public void showActivity() {
		for(int i=0; i<listService.length;i++ ) {
			System.out.println(listService[i]);
		}
	}
	// to String
	public String toString() {
		return super.toString() + "PhoneNumber = "+ getPhoneNumber();
	}
}
