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
}
