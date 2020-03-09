package io.jza.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import io.jza.jcartadministrationback.po.Administrator;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);

    //CUSTOM
    Administrator selectByUsername(@Param("username") String username);

    Administrator selectByEmail(@Param("email") String email);

    int batchDelete(@Param("administratorIds") List<Integer> administratorIds);

    Page<Administrator> selectList();
}