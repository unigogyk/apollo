package ustc.sse.apollo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ustc.sse.apollo.dao.PaperDao;
import ustc.sse.apollo.model.Paper;
import ustc.sse.apollo.service.PaperService;

@Service
public class PaperServiceImpl implements PaperService {
	private PaperDao paperDao;

	public PaperDao getPaperDao() {
		return paperDao;
	}

	@Autowired
	public void setPaperDao(PaperDao paperDao) {
		this.paperDao = paperDao;
	}

	@Override
	public List<Paper> listAllPaper() {
		return paperDao.listAllPaper();
	}

	@Override
	public void delPaper(Paper paper) {
		paperDao.delPaper(paper);
	}

	@Override
	public void updatePaper(Paper paper) {
		paperDao.updatePaper(paper);
	}

	@Override
	public Paper findPaperById(int id) {
		return paperDao.findPaperById(id);
	}

	@Override
	public void addPaper(Paper paper) {
		paperDao.addPaper(paper);
	}
	
	
	
}
