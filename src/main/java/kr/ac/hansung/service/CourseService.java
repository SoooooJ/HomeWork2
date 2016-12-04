package kr.ac.hansung.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.model.Course;
import kr.ac.hansung.model.SubjectList;

@Service
public class CourseService {

	private CourseDAO courseDao;

	@Autowired 
	public void setCourseDao(CourseDAO courseDao) {
		this.courseDao = courseDao;
	}

	// 학년도, 학기별 조회
	public List<Course> getSearchSemester() {
		// xx년도, x학기 리스트
		List<Course> course = getSearchSemester();

		for (Course sl : course) {
			int totalGrade = courseDao.getSearchSemester(sl.getYear(), sl.getSemester());
			sl.setTotalGrade(totalGrade);
		}

		return course;
	}

	// 수강했던 과목 리스트
	private List<Course> getSemestersLists() {
		List<Course> course = courseDao.getSearchSemesterDetail();
		return course;
	}

	// 학년도, 학기별 조회 상세보기 클릭
	public List<SubjectList> getCoursesBySemesterDetail(int year, int semester) {
		List<SubjectList> subjectlist = courseDao.getCourse(year, semester);
		return subjectlist;
	}


}