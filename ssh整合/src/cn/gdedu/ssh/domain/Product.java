package cn.gdedu.ssh.domain; 
/**
* @ClassName: Product 
* @Description: 商品实体类
* @author (作者)  
* @date 2017年9月1日 上午11:03:02 
* @version V1.0
 */
public class Product {
	private Integer pid;
	private String pname;
	private Double price;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}	
}
