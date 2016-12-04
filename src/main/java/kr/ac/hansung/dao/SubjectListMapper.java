package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import kr.ac.hansung.model.SubjectList;;

// �̼� ���� �� ��������
public class SubjectListMapper {
	public SubjectList mapRow(ResultSet rs, int rowNum) throws SQLException {

		SubjectList list = new SubjectList();
		list.setYear(rs.getInt("Year")); // �����⵵
		list.setSemester(rs.getInt("Semester")); // �б�
		list.setCourseName(rs.getString("CourseName")); // ������
		list.setCourseGrade(rs.getInt("CourseGrade")); // ����
		list.setClassify(rs.getString("ClassifyGrade")); // ���к� ����
		
		return list;
	}
}
