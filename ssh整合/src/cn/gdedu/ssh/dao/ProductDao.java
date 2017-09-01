package cn.gdedu.ssh.dao; 

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.gdedu.ssh.domain.Product;

/**
 *
 * 项目名称：ssh整合
 * 类名称：ProjectDao
 * 类描述：商品管理的Dao类
 * 创建人：rain
 * 创建时间：2017年9月1日 上午9:47:52
 * 修改人：rain
 * 修改时间：2017年9月1日 上午9:47:52
 * 修改备注：
 * @version
 *
 */
public class ProductDao extends HibernateDaoSupport{
	//DAO中的保存商品的方法
	public void save(Product product) {
		//调用sessionFactory中的getHibernateTemplate的方法.
		this.getHibernateTemplate().save(product);
		System.out.println("DAO中的save方法执行了...");
	}

}
