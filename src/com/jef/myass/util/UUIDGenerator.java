package com.jef.myass.util;

import java.util.UUID;

/**
 * @类名: UUIDGenerator
 * @描述: 全球唯一标识生成器 该类用户生成全球唯一标识 UUIDGenerator
 * @版本: v1.0
 * @创建日期: 2018-2-28
 * @作者: 胡荣
 * @JDK: 1.6
 */

public class UUIDGenerator {

	/**
	 * createUUID
	 * 
	 * @描述: 随机生成UUID
	 * @作者: 胡荣
	 * @创建时间: 2018-2-28
	 * "经管学院,体教学院,管理学院,理学院,化学学院,生科学院,食品学院,"
			+ "材料学院,环化学院,机电学院,建筑学院,信息学院"
	 * @return UUID
	 */

	public static String createUUID() {
		return UUID.randomUUID().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(createUUID());
	}
}
