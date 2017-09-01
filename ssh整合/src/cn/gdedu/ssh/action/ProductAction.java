package cn.gdedu.ssh.action; 

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.gdedu.ssh.domain.Product;
import cn.gdedu.ssh.service.ProductService;

/**
 *
 * 项目名称：ssh整合
 * 类名称：ProductAction
 * 类描述：商品管理的Action类
 * 创建人：rain
 * 创建时间：2017年9月1日 上午9:47:38
 * 修改人：rain
 * 修改时间：2017年9月1日 上午9:47:38
 * 修改备注：
 * @version
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	private static final long serialVersionUID = 1L;
	/**
	 * 模型驱动使用的类
	 */
	private Product product=new Product();
	@Override
	public Product getModel() {
		return this.product;
	}
	
	/**
	 * Struts和Spring整合过程中按名称自动注入的业务层类
	 */
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	//保存商品的执行的方法:save
	public String save(){
		System.out.println("Action中的save方法执行了...");
		productService.save(product);
		return NONE;
	}
		
}
