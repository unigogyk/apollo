/**
 * 
 */
package ustc.sse.apollo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * @author unigo
 * 完型填空
 */

@Entity
public class Cloze {

	@Id
	@GeneratedValue
	private int id;
	
	@Lob
	private String problemTitle;
	
	private int problemValue;
}
