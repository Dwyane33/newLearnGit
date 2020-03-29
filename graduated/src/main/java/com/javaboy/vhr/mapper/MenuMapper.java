package com.javaboy.vhr.mapper;

import com.javaboy.vhr.model.Menu;
import com.javaboy.vhr.model.Role;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenuByHrId(Integer hrId);

    List<Menu> getAllMenusWithRole();
}