package com.example.threadpool.bean;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * 字典转码类
 * @author jy
 *
 */
@Data
@ToString
public class TransDic {
	
//	private String key,value,dic;
	private String key,value;
	
	public TransDic(String key, String value) {
		super();
//		输出属性（+Dic）
		this.key = key;
//		翻译后的值
		this.value = value;

	}
/*	public TransDic(String key, String value, String dic) {
		super();
//		输出属性（+Dic）
		this.key = key;
//		翻译后的值
		this.value = value;
//		字典码
		this.dic = dic;
	}
*/
	
}
