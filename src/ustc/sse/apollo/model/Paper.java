package ustc.sse.apollo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author unigo
 * 试卷
 */
@Entity
public class Paper {
	
	@Id
	@GeneratedValue
	private int id;

	//试卷名称
	private String paperName;
	
	//科目名称
	private String courseName;
	
	//科目代码
	private String courseNo;
	
	//试卷分值
	private int paperValue;
	
	//考试时长
	private int examDuration;
	
	//开始时间
	private Date examStartTime;
	
	//结束时间
	private Date examEndTime;
	
	//考试须知
	private String notice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaperName() {
		return paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public int getPaperValue() {
		return paperValue;
	}

	public void setPaperValue(int paperValue) {
		this.paperValue = paperValue;
	}

	public int getExamDuration() {
		return examDuration;
	}

	public void setExamDuration(int examDuration) {
		this.examDuration = examDuration;
	}

	public Date getExamStartTime() {
		return examStartTime;
	}

	public void setExamStartTime(Date examStartTime) {
		this.examStartTime = examStartTime;
	}

	public Date getExamEndTime() {
		return examEndTime;
	}

	public void setExamEndTime(Date examEndTime) {
		this.examEndTime = examEndTime;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}
	
	
	
}
