package com.javaboy.vhr.mapper;

import com.javaboy.vhr.model.Hr;
import com.javaboy.vhr.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);

    List<Role> getHrRolesById(Integer id);
}