package kr.ac.hansung.model;

public class SubjectList {

	private int year; 	// 수강년도
	private int semester; // 학기
	private String courseName; // 수강명
    private int courseGrade; // 학점
	private String ClassifyGrade; // 구분별 학점

	public SubjectList() {
	}

	public SubjectList(int year, int semester, int courseGrade) {
	}

	public SubjectList(int year, int semester, String courseName, int courseGrade, String classify) {
		
		this.year = year;
		this.semester = semester;
		this.courseName = courseName;
		this.courseGrade = courseGrade;
		this.ClassifyGrade = classify;	
	}

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

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getCourseGrade() {
		return courseGrade;
	}

	public void setCourseGrade(int courseGrade) {
		this.courseGrade = courseGrade;
	}

	public String getClassify() {
		return ClassifyGrade;
	}

	public void setClassify(String ClassifyGrade) {
		this.ClassifyGrade = ClassifyGrade;
	}

	
}