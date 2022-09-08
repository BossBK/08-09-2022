
/* Question - To camparing object values using equals method*/


package com.equals.demo;

import java.util.Objects;

public class Student {
	
	public String Name;
	public int Rollno;
	public String Standeard;
	public String Section;
	public String Performance;
	
	
	public Student() {
		
	}
	
	public Student(String Name, int Rollno, String Standeard, String Section, String Performance ) {
		
		this.Name = Name;
		this.Rollno = Rollno;
		this.Standeard = Standeard;
		this.Section = Section;
		this.Performance = Performance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getStandeard() {
		return Standeard;
	}

	public void setStandeard(String standeard) {
		Standeard = standeard;
	}

	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public String getPerformance() {
		return Performance;
	}

	public void setPerformance(String performance) {
		Performance = performance;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		
		return Objects.equals(Name, other.Name) && Objects.equals(Performance, other.Performance)
				&& Rollno == other.Rollno && Objects.equals(Section, other.Section)
				&& Objects.equals(Standeard, other.Standeard);
	}
	
	
	
}
