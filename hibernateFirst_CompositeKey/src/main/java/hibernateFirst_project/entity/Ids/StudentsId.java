package hibernateFirst_project.entity.Ids;

import java.io.Serializable;
import java.util.Objects;

public class StudentsId implements Serializable{

	private String name;
	private String country;
	
	
	public StudentsId() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentsId(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public int hashCode() {
		return Objects.hash(country, name);
	}


	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentsId other = (StudentsId) obj;
		return Objects.equals(country, other.country) && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "StudentsId [name=" + name + ", country=" + country + "]";
	}
	
	
}
