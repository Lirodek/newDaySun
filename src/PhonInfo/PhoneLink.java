package PhonInfo;

public class PhoneLink {
	static private PhoneInfo head;
	private PhoneInfo temp;
	public PhoneLink() {
		head = new PhoneInfo();
		temp = head;
	}
	public void add(PhoneInfo node) {
		PhoneInfo lastadd = head;
		while(lastadd.next!=null) {
			lastadd=lastadd.next;
		}
		lastadd.next = node;
		node.next=null;
		temp=node;
	}
	public PhoneInfo search(String name) {
		PhoneInfo pl = head;
		PhoneInfo pre = null;
		while(pl.next !=null) {
			pre=pl;
			pl=pl.next;
			if(pl.name.equals(name)) {
				temp = pl;
				return pl;
			}
		}
		return pl;
	}
	public void delete(String name) {
		PhoneInfo pl = head;
		PhoneInfo pre = null;
		while(pl.next!=null) {
			pre = pl;
			pl = pl.next;
			if(pl.name.equals(name)) {
				pre.next = pl.next;
				temp = pl.next;
			}
		}
	}
	public PhoneInfo update(String name) {
		PhoneInfo pl = head;
		PhoneInfo pre = null;
		while(pl.next!=null) {
			pre = pl;
			pl = pl.next;
			if(pl.name.equals(name)) {
				temp = pl;
				return pl;
			}
		}
		return pl;
	}
	public void showAll() {
		System.out.println("-----------------");
		PhoneInfo pl = head.next;
		System.out.println("=================");
		while(pl!=null) {
			System.out.println(pl);
			pl= pl.next;
		}
		System.out.println("-----------------");
	}
}
