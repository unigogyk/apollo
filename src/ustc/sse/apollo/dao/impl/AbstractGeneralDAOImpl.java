package ustc.sse.apollo.dao.impl;


import java.lang.reflect.ParameterizedType;

import org.apache.log4j.Logger;

/**
 * @author unigo
 */
public class AbstractGeneralDAOImpl<T>{
	
	Logger logger = Logger.getLogger(this.getClass());

	protected final Class<T> persistenceClass;
	
	@SuppressWarnings("unchecked")
	public AbstractGeneralDAOImpl() {
		this.persistenceClass = (Class<T>) ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

		if (logger.isInfoEnabled()) {
			logger.info("解析泛型参数 T : " + getPersistenceClass().getName());
		}
	}
	
	public final Class<T> getPersistenceClass() {
		return persistenceClass;
	}
}
