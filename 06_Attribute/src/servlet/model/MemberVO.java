package servlet.model;

public class MemberVO {
	private String name;
	private int age;
	private String addr;
	
	public MemberVO() {}
	public MemberVO(String name, int age, String addrd) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddrd() {
		return addr;
	}

	public void setAddrd(String addrd) {
		this.addr = addrd;
	}

	@Override
	public String toString() {
		return "MemberVo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}
