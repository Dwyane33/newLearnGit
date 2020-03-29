package com.javaboy.vhr.service;

import com.javaboy.vhr.mapper.MenuMapper;
import com.javaboy.vhr.model.Hr;
import com.javaboy.vhr.model.Menu;
import com.javaboy.vhr.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;

import java.security.Security;
import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    public List<Menu> getMenuByHrId(){
        return menuMapper.getMenuByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    };

    //@Cacheable
    public List<Menu> getAllMenusWithRole(){

        return menuMapper.getAllMenusWithRole();
    }
}
