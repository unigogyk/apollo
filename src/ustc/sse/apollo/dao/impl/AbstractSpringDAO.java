package ustc.sse.apollo.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

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
	 * 删除某一类集合
	 * @param entities
	 * @throws BusinessException
	 */
	public void delCollection(Collection<T> entities) throws BusinessException{
		try{
			getHibernateTemplate().deleteAll(entities);
		} catch(Exception e){
			throw new BusinessException("该集合已删除");
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
	 * 根据ID查找对象
	 * @param id
	 * @return
	 * @throws BusinessException
	 */
	public T findById(int id) throws BusinessException{
		try{
			return (T)getHibernateTemplate().get(getPersistenceClass(), id);
		}catch(Exception e){
			throw new BusinessException("查找对象" + getPersistenceClass().getName()    
					+ "失败",e);
		}
	}
	
	/**
	 * 根据已定义的查询语句查询数据库并返回查询结果所包含的业务对象集合
	 * @param hql
	 * @return
	 * @throws BusinessException
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByHql(String hql) throws BusinessException{
		try{
			return getHibernateTemplate().findByNamedQuery(hql);
		} catch(Exception e){
			throw new BusinessException("自定义查询失败", e);
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
	
	/**
	 * 查找符合某个条件的对象
	 * @param entity
	 * @return
	 * @throws BusinessException
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByExample(T entity) throws BusinessException{
		try{
			return getHibernateTemplate().findByExample(entity);
		} catch(Exception e){
			throw new BusinessException("从数据库查找" + entity.getClass().getName()    
					+ "失败",e);
		}
	}
	
	
}
