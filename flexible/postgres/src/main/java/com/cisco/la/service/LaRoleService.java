package com.cisco.la.service;
import java.util.List;
import com.cisco.la.entity.LaRole;
import com.cisco.la.common.Assist;
public interface LaRoleService{
	/**
	 * 获得LaRole数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLaRoleRowCount(Assist assist);
	/**
	 * 获得LaRole数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LaRole> selectLaRole(Assist assist);
	/**
	 * 获得一个LaRole对象,以参数LaRole对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LaRole selectLaRoleByObj(LaRole obj);
	/**
	 * 通过LaRole的id获得LaRole对象
	 * @param id
	 * @return
	 */
    LaRole selectLaRoleById(String id);
	/**
	 * 插入LaRole到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaRole(LaRole value);
	/**
	 * 插入LaRole中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLaRole(LaRole value);
	/**
	 * 批量插入LaRole到数据库
	 * @param value
	 * @return
	 */
    int insertLaRoleByBatch(List<LaRole> value);
	/**
	 * 通过LaRole的id删除LaRole
	 * @param id
	 * @return
	 */
    int deleteLaRoleById(String id);
	/**
	 * 通过辅助工具Assist的条件删除LaRole
	 * @param assist
	 * @return
	 */
    int deleteLaRole(Assist assist);
	/**
	 * 通过LaRole的id更新LaRole中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLaRoleById(LaRole enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaRole中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLaRole(LaRole value,  Assist assist);
	/**
	 * 通过LaRole的id更新LaRole中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLaRoleById(LaRole enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaRole中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLaRole(LaRole value, Assist assist);
}