package com.cisco.la.mapper;

import com.cisco.la.model.RoleHistoryModel;
import com.cisco.la.model.RoleHistoryModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleHistoryModelMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.la_rl_history
	 * @mbg.generated  Mon Jan 08 10:27:08 CST 2018
	 */
	long countByExample(RoleHistoryModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.la_rl_history
	 * @mbg.generated  Mon Jan 08 10:27:08 CST 2018
	 */
	int deleteByExample(RoleHistoryModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.la_rl_history
	 * @mbg.generated  Mon Jan 08 10:27:08 CST 2018
	 */
	int insert(RoleHistoryModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.la_rl_history
	 * @mbg.generated  Mon Jan 08 10:27:08 CST 2018
	 */
	int insertSelective(RoleHistoryModel record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.la_rl_history
	 * @mbg.generated  Mon Jan 08 10:27:08 CST 2018
	 */
	List<RoleHistoryModel> selectByExample(RoleHistoryModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.la_rl_history
	 * @mbg.generated  Mon Jan 08 10:27:08 CST 2018
	 */
	int updateByExampleSelective(@Param("record") RoleHistoryModel record,
			@Param("example") RoleHistoryModelExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.la_rl_history
	 * @mbg.generated  Mon Jan 08 10:27:08 CST 2018
	 */
	int updateByExample(@Param("record") RoleHistoryModel record, @Param("example") RoleHistoryModelExample example);
}