package com.myweb.util.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	
	//세션팩토리의 생성과, 설정파일의 위치 저장..
	
	private static SqlSessionFactory slqSessionFactory;
	
	//클래스가 실행될 당시에 단한번만 동작됨
	static {
		
		try {
			
			String resoucePath="mybatis/config/mybatis-config.xml"; //설정파일의 위치
			InputStream inputStream=Resources.getResourceAsStream(resoucePath);
			
			slqSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println("세션팩토리 생성됨");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("세션팩토리 오류");
		}
		
	}

	//getter메서드
	public static SqlSessionFactory getSlqSessionFactory() {
		return slqSessionFactory;
	}


}
