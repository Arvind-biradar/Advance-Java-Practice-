package manyToMany;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="Teacher1")
public class Teacher {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int teacher_id;
	
	private String teacherName;
	private int Experience;
	private String subject;
	
	@ManyToMany(mappedBy="teacher", cascade=CascadeType.ALL)
	private List<Student> student;

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
}
