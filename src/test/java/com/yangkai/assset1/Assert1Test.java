package com.yangkai.assset1;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Assert1Test {

	
	
	//断言为真 假报异常
	@Test
	public void testIsTrue() {
		
		String pwd1="111";
		String pwd2="112";
		Assert1.isTrue(pwd1.equals(pwd2), "断言为真 假报异常");
		
		
		/*String pwd3="111";
		String pwd4="111";
		Assert1.isTrue(pwd3.equals(pwd4), "断言为真 真不报异常");*/
	}
	
	
	
	
	

	// 断言为假；真报异常
	@Test
	public void testIsFalse() {
		Assert1.isFalse(2>1, "断言为假；真报异常");
	}

	
	
	
	
	 // 断言对象不为空；空则报异常
	@Test
	public void testIsNotNull() {
		Assert1.isNotNull(null, "断言对象不为空；空则报异常");
		//Assert1.isNotNull("yxy", "断言对象不为空；不空则不报异常");
	}

	
	
	
	
	
	//断言对象必须空；不空则报异常
	@Test
	public void testIsNull() {
		Assert1.isNull("yxy", "断言对象必须空；不空则报异常");
	//	Assert1.isNull(null, "断言对象必须空；空则不报异常");
	}

	
	
	
	//* 断言 List 或 Set 集合不为空，没有元素也算空；
	@Test
	public void testIsNotEmpty() {
		Assert1.isNotEmpty(null, "断言 List 或 Set 集合不为空,,空则报异常");
		
		
	/*	Set s=new HashSet<>();
		s.add(1);
		Assert1.isNotEmpty(s, "断言 List 或 Set 集合不为空,,不空则报异常");*/
	}

	
	//断言 Map 集合不为空，没有元素也算空；
	@Test
	public void testIsNotEmptymap() {
		
	 Assert1.isNotEmptymap(null, "断言 Map 集合不为空.空则报异常");
		
		/*Map map=new HashMap<>();
		map.put("s", "我爱你");
		Assert1.isNotEmptymap(map, "断言 Map 集合不为空.不空则报异常");*/
	}

	
	
	/**
	 * (7) 断言字符串必须有值，去掉空格后，长度必须大于 0；
	 * @Title: isNotEmpty 
	 * @Description: TODO
	 * @param map
	 * @param message
	 * @return: void
	 */
	@Test
	public void testHasTextStringString() {
		Assert1.hasText("", "断言字符串必须有值，去掉空格后，长度必须大于 0,有空格或者小于0就报异常");
	}

	
	/**
	 * ) 断言值必须是正数(值大于 0)；
	 * @Title: hasText 
	 * @Description: TODO
	 * @param src
	 * @param message
	 * @return: void
	 */
	@Test
	public void testHasTextBooleanString() {
		Assert1.hasText(1-2>-3, "断言值必须是正数(值大于 0)；报异常");
	}

	
	@Test
	public void test01() {
		BigDecimal b1=new BigDecimal("66");
		BigDecimal b2=new BigDecimal("33.0");
		//  +
		//System.out.println(b1.add(b2));
		
		
		//   /
		//System.out.println(b1.divide(b2));
		
		
		//   *
		//System.out.println(b1.multiply(b2));
		
		//   -
		System.out.println(b1.subtract(b2));
		
		
	}
	
	
}
