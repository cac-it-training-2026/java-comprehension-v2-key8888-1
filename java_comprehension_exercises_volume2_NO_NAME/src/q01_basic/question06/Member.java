package q01_basic.question06;

public class Member extends AbstMember {
	private int id;
	private String password;
	private int age;
	private int rank;

	public Member() {
		super();
	}

	/**
	 * @param id
	 * @param password
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	@Override
	public void buyItem() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.name + "purchased the item at 50% off");
	}

	@Override
	public void showMember() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + this.id);
		System.out.println("password:" + this.password);
		System.out.println("name:" + this.name);
		System.out.println("age:" + this.age);
		System.out.println("rank:" + this.rank);
		System.out.println("*****************");
	}

}
