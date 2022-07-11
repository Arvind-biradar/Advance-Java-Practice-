package manyToMany;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Student1")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private long  mobileNo;
	private String Education;

	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="student_teacher",
	joinColumns=@JoinColumn(name="student_Id"),
    inverseJoinColumns=@JoinColumn(name="teacher_Id")
	)
	private List<Teacher> teacher;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getEducation() {
		return Education;
	}


	public void setEducation(String education) {
		Education = education;
	}


	public List<Teacher> getTeacher() {
		return teacher;
	}


	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	
	
	
	
	
	
}
