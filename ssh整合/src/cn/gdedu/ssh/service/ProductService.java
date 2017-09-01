package cn.gdedu.ssh.service; 

import org.springframework.transaction.annotation.Transactional;

import cn.gdedu.ssh.dao.ProductDao;
import cn.gdedu.ssh.domain.Product;

/**
 *
 * 项目名称：ssh整合
 * 类名称：ProductService
 * 类描述：商品管理的业务层的类(其实可以创建成接口)
 * 创建人：rain
 * 创建时间：2017年9月1日 上午9:48:08
 * 修改人：rain
 * 修改时间：2017年9月1日 上午9:48:08
 * 修改备注：
 * @version
 *
 */
@Transactional
public class ProductService {
	//业务层注入Dao的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	//业务层保存商品的方法
	public void save(Product product) {
		System.out.println("Service中的save方法执行了...");
		productDao.save(product);
	}	
}
