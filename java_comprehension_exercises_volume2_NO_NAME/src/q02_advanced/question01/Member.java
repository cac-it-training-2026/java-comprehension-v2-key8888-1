package q02_advanced.question01;

import java.util.List;

public class Member {
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 * @param coupons
	 */
	public Member(int id, String password, String name, int age, int rank, List<Coupon> coupons) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = coupons;

		Coupon cu[] = { new Coupon(1, 0.5, "最初の特典"), new Coupon(2, 0.25, "今月の特典") };
		coupons.add(cu[0]);
		coupons.add(cu[1]);

	}

	public Member() {
		super();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}

}
