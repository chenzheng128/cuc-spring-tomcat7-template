package cuc;

import javax.persistence.*;

@Entity
public class Student {
	
	public Student()
	{
		
	}
	public Student(String name, String stuId) {
		super();
		this.name = name;
		this.stuId = stuId;
	}

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String stuId;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	
	public static void main(String argvs[]){
		System.out.println("hello my student.!");
	}

}
