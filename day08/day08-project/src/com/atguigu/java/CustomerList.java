package com.atguigu.java;

/**
 * Customer 对象的管理模块
 */
public class CustomerList {
	
	private Customer[] customers; //用于保存 Customer 对象  {new Customer(), null, null}
	private int total = 0; //用于记录数组中有效元素的个数  
	
	/**
	 * 用于初始化数组并指明长度
	 */
	public CustomerList(int totalCustomer){
		customers = new Customer[totalCustomer];
	}

	/**
	 * 添加 Customer 对象到数组中
	 * @param customer
	 * @return
	 */
	public boolean addCustomer(Customer customer){
		if(total >= customers.length){
			return false;
		}
		
		customers[total++] = customer;
		return true;
	}
	
	/**
	 * 替换数组中的 Customer 对象
	 * @param index : 索引值
	 * @param customer
	 * @return
	 */
	public boolean replaceCustomer(int index, Customer customer){
		if(index < 0 || index >= total){
			return false;
		}
		
		customers[index] = customer;
		return true;
	}
	
	/**
	 * 删除数组中 index 索引位置的对象
	 * @param index
	 * @return
	 */
	public boolean deleteCustomer(int index){
		if(index < 0 || index >= total){
			return false;
		}
	
		for(int i = index; i < total - 1; i++){//覆盖方式
			customers[i] = customers[i+1];
		}
		
		customers[--total] = null;
		return true;
	}
	
	/**
	 * 获取所有有效元素的数组
	 * @return
	 */
	public Customer[] getAllCustomers(){
		Customer[] custs = new Customer[total];
		
		for(int i = 0; i < total; i++){
			custs[i] = customers[i];
		}
		
		return custs;
	}
	
	/**
	 * 获取指定索引位置的对象
	 * @param index
	 * @return
	 */
	public Customer getCustomer(int index){
		if(index < 0 || index >= total){
			return null;
		}
		
		return customers[index];
	}
	
	//单元测试
	public static void main(String[] args) {
		CustomerList cl = new CustomerList(10);
		
		Customer customer = new Customer("玉鹏", '男', 18, "010-123456", "abc@abc.com");
		boolean b = cl.addCustomer(customer);
		
		if(b){
			System.out.println("添加成功");
		}else{
			System.out.println("添加失败");
		}
		
		Customer[] customers = cl.getAllCustomers();
		
		for (Customer cust : customers) {
			System.out.println(cust.getName() + "," + cust.getAge());
		}
	}
}
