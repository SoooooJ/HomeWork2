package kr.ac.hansung.model;

public class Course {
	int year; // 학년
	int semester; // 학기
	int totalGrade; // 총 이수 학점

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public void setTotalGrade(int totalGrade) {
		this.totalGrade = totalGrade;
	}

	public int getTotalGrade() {
		return totalGrade;
	}
}
