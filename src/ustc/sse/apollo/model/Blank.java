package ustc.sse.apollo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author unigo
 * 填空
 */
@Entity
public class Blank {

	@Id
	@GeneratedValue
	private int id;
	
	private int problemNo;
	
	private String problemTitle;
	
}
