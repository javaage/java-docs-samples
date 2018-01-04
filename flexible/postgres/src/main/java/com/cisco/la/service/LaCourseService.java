package com.cisco.la.service;
import java.util.List;
import com.cisco.la.entity.LaCourse;
import com.cisco.la.common.Assist;
public interface LaCourseService{
	/**
	 * 获得LaCourse数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLaCourseRowCount(Assist assist);
	/**
	 * 获得LaCourse数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LaCourse> selectLaCourse(Assist assist);
	/**
	 * 获得一个LaCourse对象,以参数LaCourse对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LaCourse selectLaCourseByObj(LaCourse obj);
	/**
	 * 通过LaCourse的id获得LaCourse对象
	 * @param id
	 * @return
	 */
    LaCourse selectLaCourseById(Object id);
	/**
	 * 插入LaCourse到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaCourse(LaCourse value);
	/**
	 * 插入LaCourse中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLaCourse(LaCourse value);
	/**
	 * 批量插入LaCourse到数据库
	 * @param value
	 * @return
	 */
    int insertLaCourseByBatch(List<LaCourse> value);
	/**
	 * 通过LaCourse的id删除LaCourse
	 * @param id
	 * @return
	 */
    int deleteLaCourseById(Object id);
	/**
	 * 通过辅助工具Assist的条件删除LaCourse
	 * @param assist
	 * @return
	 */
    int deleteLaCourse(Assist assist);
	/**
	 * 通过LaCourse的id更新LaCourse中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLaCourseById(LaCourse enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaCourse中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLaCourse(LaCourse value,  Assist assist);
	/**
	 * 通过LaCourse的id更新LaCourse中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLaCourseById(LaCourse enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaCourse中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLaCourse(LaCourse value, Assist assist);
}