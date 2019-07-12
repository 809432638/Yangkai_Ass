package com.yangkai.assset1;

/**
 * 
 * @ClassName: CmsAssert1Exception 
 * @Description: 自定义异常
 * @author: 嫌疑人:杨某 
 * @date: 2019年7月12日 下午6:50:31
 */
public class CmsAssert1Exception extends RuntimeException{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @Title:CmsAssert1Exception
	 * @Description:无参构造方法
	 */
	public CmsAssert1Exception() {
		super();
	}
	
	/**
	 * 
	 * @Title:CmsAssert1Exception
	 * @Description:有参构造方法
	 * @param message
	 */
	public CmsAssert1Exception(String message) {
		super(message);
	}
	
	
	
}
