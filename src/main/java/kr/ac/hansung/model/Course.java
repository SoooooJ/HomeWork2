package kr.ac.hansung.model;

public class Course {
	int year; // �г�
	int semester; // �б�
	int totalGrade; // �� �̼� ����

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
