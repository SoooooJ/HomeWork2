package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import kr.ac.hansung.model.SubjectList;;

// 이수 구분 별 학점내용
public class SubjectListMapper {
	public SubjectList mapRow(ResultSet rs, int rowNum) throws SQLException {

		SubjectList list = new SubjectList();
		list.setYear(rs.getInt("Year")); // 수강년도
		list.setSemester(rs.getInt("Semester")); // 학기
		list.setCourseName(rs.getString("CourseName")); // 수강명
		list.setCourseGrade(rs.getInt("CourseGrade")); // 학점
		list.setClassify(rs.getString("ClassifyGrade")); // 구분별 학점
		
		return list;
	}
}
