package hibernateFirst.project.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import hibernateFirst_project.entity.Ids.StudentsId;

@Entity
@Table(name="student")
public class Student {

	@EmbeddedId
	private StudentsId studentId;
	@Column(name="student_name")
	private String name;
	private int age;
	//private String country;
	
	@ManyToOne
	@JoinColumns(value = {@JoinColumn(name = "contry_name",referencedColumnName ="contry" ),
	@JoinColumn(name = "name_id", referencedColumnName = "name")})
	private Student student;
	
	public Student(StudentsId studentId, String name, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		
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


	public Student() {
		
	}


	public StudentsId getStudentId() {
		return studentId;
	}


	public void setStudentId(StudentsId studentId) {
		this.studentId = studentId;
	}


	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ",  age ="+age+" ]";
	}


	

	

	
	
	
}
