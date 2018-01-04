package com.cisco.la.dao;
import com.cisco.la.entity.LaUser;
import java.util.List;
import com.cisco.la.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface LaUserDao{
	/**
	 * 获得LaUser数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLaUserRowCount(Assist assist);
	/**
	 * 获得LaUser数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LaUser> selectLaUser(Assist assist);
	/**
	 * 获得一个LaUser对象,以参数LaUser对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LaUser selectLaUserByObj(LaUser obj);
	/**
	 * 通过LaUser的id获得LaUser对象
	 * @param id
	 * @return
	 */
    LaUser selectLaUserById(String id);
	/**
	 * 插入LaUser到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaUser(LaUser value);
	/**
	 * 插入LaUser中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLaUser(LaUser value);
	/**
	 * 批量插入LaUser到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaUserByBatch(List<LaUser> value);
	/**
	 * 通过LaUser的id删除LaUser
	 * @param id
	 * @return
	 */
    int deleteLaUserById(String id);
	/**
	 * 通过辅助工具Assist的条件删除LaUser
	 * @param assist
	 * @return
	 */
    int deleteLaUser(Assist assist);
	/**
	 * 通过LaUser的id更新LaUser中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLaUserById(LaUser enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaUser中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLaUser(@Param("enti") LaUser value, @Param("assist") Assist assist);
	/**
	 * 通过LaUser的id更新LaUser中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLaUserById(LaUser enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaUser中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLaUser(@Param("enti") LaUser value, @Param("assist") Assist assist);
}