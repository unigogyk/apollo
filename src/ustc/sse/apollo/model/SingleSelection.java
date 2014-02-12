package ustc.sse.apollo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author unigo
 * 单选题
 */
@Entity
public class SingleSelection {

	@Id
	@GeneratedValue
	private int id;
	
	//题号
	private int problemNo;
	
	//题目
	private String problemTitle;
	
	//选项
	private String answerA;
	
	private String answerB;
	
	private String answerC;
	
	private String answerD;
	
	//正确答案
	private char rightAnswer;
	
	//分值
	private int problemValue;
}
