package io.jza.jcartstoreback.dao;

import com.github.pagehelper.Page;
import io.jza.jcartstoreback.po.Return;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnMapper {
    int deleteByPrimaryKey(Integer returnId);

    int insert(Return record);

    int insertSelective(Return record);

    Return selectByPrimaryKey(Integer returnId);

    int updateByPrimaryKeySelective(Return record);

    //custom
    Page<Return> getPageByCustomerId(@Param("customerId") Integer customerId);

    int updateByPrimaryKey(Return record);
}