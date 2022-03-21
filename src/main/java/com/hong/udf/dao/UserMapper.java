package com.hong.udf.dao;

import com.hong.udf.entity.User;
import org.apache.ibatis.annotations.Select;

/**
 * Description     :
 */
public interface UserMapper {

	@Select("select * from user where id = #{id}")
	User selectById(Integer id);
}
