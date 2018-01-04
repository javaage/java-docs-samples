package com.cisco.la.dao;
import com.cisco.la.entity.LaCrsHistory;
import java.util.List;
import com.cisco.la.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface LaCrsHistoryDao{
	/**
	 * 获得LaCrsHistory数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getLaCrsHistoryRowCount(Assist assist);
	/**
	 * 获得LaCrsHistory数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<LaCrsHistory> selectLaCrsHistory(Assist assist);
	/**
	 * 获得一个LaCrsHistory对象,以参数LaCrsHistory对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    LaCrsHistory selectLaCrsHistoryByObj(LaCrsHistory obj);
	/**
	 * 通过LaCrsHistory的id获得LaCrsHistory对象
	 * @param id
	 * @return
	 */
    LaCrsHistory selectLaCrsHistoryById(Object id);
	/**
	 * 插入LaCrsHistory到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaCrsHistory(LaCrsHistory value);
	/**
	 * 插入LaCrsHistory中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyLaCrsHistory(LaCrsHistory value);
	/**
	 * 批量插入LaCrsHistory到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertLaCrsHistoryByBatch(List<LaCrsHistory> value);
	/**
	 * 通过LaCrsHistory的id删除LaCrsHistory
	 * @param id
	 * @return
	 */
    int deleteLaCrsHistoryById(Object id);
	/**
	 * 通过辅助工具Assist的条件删除LaCrsHistory
	 * @param assist
	 * @return
	 */
    int deleteLaCrsHistory(Assist assist);
	/**
	 * 通过LaCrsHistory的id更新LaCrsHistory中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateLaCrsHistoryById(LaCrsHistory enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaCrsHistory中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateLaCrsHistory(@Param("enti") LaCrsHistory value, @Param("assist") Assist assist);
	/**
	 * 通过LaCrsHistory的id更新LaCrsHistory中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyLaCrsHistoryById(LaCrsHistory enti);
 	/**
	 * 通过辅助工具Assist的条件更新LaCrsHistory中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyLaCrsHistory(@Param("enti") LaCrsHistory value, @Param("assist") Assist assist);
}