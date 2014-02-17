package ustc.sse.apollo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import ustc.sse.apollo.util.BusinessException;


/**
 * @author unigo
 *
 */
public class AbstractSpringDAO<T> extends AbstractGeneralDAOImpl<T>{
	
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	/**
	 * 添加一个对象
	 * @param entity
	 * @return
	 * @throws BusinessException
	 */
	public T addEntity(T entity) throws BusinessException{
		try{
			getHibernateTemplate().save(entity);
			return entity;
		} catch (Exception e){
			throw new BusinessException("保存 " + entity.getClass().getName()    
					+ " 实例到数据库失败", e);
		}
	}
	
	/**
	 * 删除一个对象
	 * @param entity
	 * @throws BusinessException
	 */
	public void delEntity(T entity) throws BusinessException{
		try{
			getHibernateTemplate().delete(entity);
		} catch(Exception e){
			throw new BusinessException("从数据库删除 " + entity.getClass().getName()    
					+ " 实例失败", e);
		}
	}
	
	/**
	 * 更新对象
	 * @param entity
	 * @return
	 * @throws BusinessException
	 */
	public T updateEntity(T entity) throws BusinessException{
		try{
			getHibernateTemplate().update(entity);
			return entity;
		} catch(Exception e){
			throw new BusinessException("更新 " + entity.getClass().getName()    
					+ " 实例到数据库失败", e);
		}
	}
	
	/**
	 * 查找所有对象
	 * @return
	 * @throws BusinessException
	 */
	public List<T> findAllEntity() throws BusinessException{
		try{
			return getHibernateTemplate().loadAll(getPersistenceClass());
		} catch(Exception e){
			throw new BusinessException();
		}
	}
}
