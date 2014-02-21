package ustc.sse.apollo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ustc.sse.apollo.dao.PaperDao;
import ustc.sse.apollo.model.Paper;

@Repository
public class PaperDaoImpl extends AbstractSpringDAO<Paper> implements PaperDao {

	@Override
	public List<Paper> listAllPaper() {
		List<Paper> list = new ArrayList<Paper>();
		try{
			list = findAllEntity();
		} catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void delPaper(Paper paper) {
		try{
			delEntity(paper);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void updatePaper(Paper paper) {
		try{
			updateEntity(paper);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public Paper findPaperById(int id) {
		Paper paper = null;
		try{
			paper = findById(id);
		} catch(Exception e){
			e.printStackTrace();
		}
		return paper;
	}

	@Override
	public void addPaper(Paper paper) {
		try{
			addEntity(paper);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
