package com.yangkai.assset1;

import java.util.Collection;
import java.util.Map;

/**
 * 
 * @ClassName: Assert1 
 * @Description: 断言类
 * @author: 嫌疑人:杨某 
 * @date: 2019年7月12日 下午6:51:43
 */
public class Assert1 {

	/**
	 * @Title: isTrue
	 * @Description: 断言为真（就是表达结果或参数必须为真， 否则抛出自己的自定义 异常）；
	 * @param exp
	 * @param message
	 * @return: void
	 */	
	public static void isTrue(boolean exp,String message) {
		if(!exp) {
			throw new RuntimeException(message);
		}
	}
	
	
	/**
	 *   断言为假；
	 * @Title: isFalse 
	 * @Description: TODO
	 * @param exp
	 * @param message
	 * @return: void
	 */
	public static void isFalse(boolean exp,String message) {
		if(exp) {
			throw new RuntimeException(message);
		}
	}
	
	
	/**
	 * @Title: isNotNull 
	 * @Description:  // 断言对象不为空；
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNotNull(Object obj,String message) {
		if(obj==null) {
			throw new RuntimeException(message);
		}
	}
	
	
	
	/**
	 * 
	 * @Title: isNotNull 
	 * @Description:  // 断言对象必须空；；
	 * @param obj
	 * @param message
	 * @return: void
	 */
	public static void isNull(Object obj,String message) {
		if(obj!=null) {
			throw new RuntimeException(message);
		}
	}
	
	
	/**
	 * 断言 List 或 Set 集合不为空，没有元素也算空；
	 */
	public static void isNotEmpty(Collection c,String message) {
		if(c==null||c.size()==0) {
			throw new RuntimeException(message);
		}
	}
	
	//断言 Map 集合不为空，没有元素也算空；
	public static void isNotEmptymap(Map map,String message) {
		if(map==null||map.isEmpty()) {
			throw new RuntimeException(message);
		}
	}
	
	
	/**
	 * (7) 断言字符串必须有值，去掉空格后，长度必须大于 0；
	 * @Title: isNotEmpty 
	 * @Description: TODO
	 * @param map
	 * @param message
	 * @return: void
	 */
	public static void hasText(String str,String message) {
		if(str==null||str.trim().length()<=0) {
			throw new RuntimeException(message);
		}
	}
	
	
	/**
	 * ) 断言值必须是正数(值大于 0)；
	 * @Title: hasText 
	 * @Description: TODO
	 * @param src
	 * @param message
	 * @return: void
	 */
	public static void hasText(boolean Str,String message) {
		
		if(!Str) {
			throw new RuntimeException(message);
		}
		
		/*  String Str = "";
			if((str.matches("[0-9]+"))&&(Integer.parseInt(str)>0)) {
		            //如果以上条件成立，则str是正整数，可以将str转为int类型，得到一个正整数n
		                int n = Integer.parseInt(str);
			}*/
	}
	
	
}
