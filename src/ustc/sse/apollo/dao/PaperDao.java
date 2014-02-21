package ustc.sse.apollo.dao;

import java.util.List;

import ustc.sse.apollo.model.Paper;

public interface PaperDao {
	
	/**
	 * 查找所有试卷
	 */
	public List<Paper> listAllPaper();
	
	/**
	 * 删除试卷
	 */
	public void delPaper(Paper paper);
	
	/**
	 * 更新试卷
	 */
	public void updatePaper(Paper paper);
	
	/**
	 * 根据ID查找试卷
	 */
	public Paper findPaperById(int id);
	
	/**
	 * 添加试卷
	 */
	public void addPaper(Paper paper);
}
