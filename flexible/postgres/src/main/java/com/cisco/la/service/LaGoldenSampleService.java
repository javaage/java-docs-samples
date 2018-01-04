package com.cisco.la.service;
import java.util.List;
import com.cisco.la.entity.LaGoldenSample;
import com.cisco.la.common.Assist;
public interface LaGoldenSampleService{
	/**
	 * 获得LaGoldenSample数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLaGoldenSampleRowCount(Assist assist);
	/**
	 * 获得LaGoldenSample数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LaGoldenSample> selectLaGoldenSample(Assist assist);
	/**
	 * 获得一个LaGoldenSample对象,以参数LaGoldenSample对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LaGoldenSample selectLaGoldenSampleByObj(LaGoldenSample obj);
	/**
	 * 通过LaGoldenSample的id获得LaGoldenSample对象
	 * @param id
	 * @return
	 */
    LaGoldenSample selectLaGoldenSampleById(Object id);
	/**
	 * 插入LaGoldenSample到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaGoldenSample(LaGoldenSample value);
	/**
	 * 插入LaGoldenSample中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLaGoldenSample(LaGoldenSample value);
	/**
	 * 批量插入LaGoldenSample到数据库
	 * @param value
	 * @return
	 */
    int insertLaGoldenSampleByBatch(List<LaGoldenSample> value);
	/**
	 * 通过LaGoldenSample的id删除LaGoldenSample
	 * @param id
	 * @return
	 */
    int deleteLaGoldenSampleById(Object id);
	/**
	 * 通过辅助工具Assist的条件删除LaGoldenSample
	 * @param assist
	 * @return
	 */
    int deleteLaGoldenSample(Assist assist);
	/**
	 * 通过LaGoldenSample的id更新LaGoldenSample中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLaGoldenSampleById(LaGoldenSample enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaGoldenSample中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLaGoldenSample(LaGoldenSample value,  Assist assist);
	/**
	 * 通过LaGoldenSample的id更新LaGoldenSample中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLaGoldenSampleById(LaGoldenSample enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaGoldenSample中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLaGoldenSample(LaGoldenSample value, Assist assist);
}