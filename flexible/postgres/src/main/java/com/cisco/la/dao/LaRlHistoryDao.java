package com.cisco.la.dao;
import com.cisco.la.entity.LaRlHistory;
import java.util.List;
import com.cisco.la.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface LaRlHistoryDao{
	/**
	 * 获得LaRlHistory数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLaRlHistoryRowCount(Assist assist);
	/**
	 * 获得LaRlHistory数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LaRlHistory> selectLaRlHistory(Assist assist);
	/**
	 * 获得一个LaRlHistory对象,以参数LaRlHistory对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LaRlHistory selectLaRlHistoryByObj(LaRlHistory obj);
	/**
	 * 通过LaRlHistory的id获得LaRlHistory对象
	 * @param id
	 * @return
	 */
    LaRlHistory selectLaRlHistoryById(Object id);
	/**
	 * 插入LaRlHistory到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaRlHistory(LaRlHistory value);
	/**
	 * 插入LaRlHistory中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLaRlHistory(LaRlHistory value);
	/**
	 * 批量插入LaRlHistory到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaRlHistoryByBatch(List<LaRlHistory> value);
	/**
	 * 通过LaRlHistory的id删除LaRlHistory
	 * @param id
	 * @return
	 */
    int deleteLaRlHistoryById(Object id);
	/**
	 * 通过辅助工具Assist的条件删除LaRlHistory
	 * @param assist
	 * @return
	 */
    int deleteLaRlHistory(Assist assist);
	/**
	 * 通过LaRlHistory的id更新LaRlHistory中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLaRlHistoryById(LaRlHistory enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaRlHistory中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLaRlHistory(@Param("enti") LaRlHistory value, @Param("assist") Assist assist);
	/**
	 * 通过LaRlHistory的id更新LaRlHistory中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLaRlHistoryById(LaRlHistory enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaRlHistory中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLaRlHistory(@Param("enti") LaRlHistory value, @Param("assist") Assist assist);
}