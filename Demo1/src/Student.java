
public class Student {
	private String stuNo;
	private String name;
	private String age;
	private String sex;
	public Student(String stuNo, String name, String age, String sex) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
