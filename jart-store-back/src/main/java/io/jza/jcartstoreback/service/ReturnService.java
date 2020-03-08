package io.jza.jcartstoreback.service;

import com.github.pagehelper.Page;
import io.jza.jcartstoreback.po.Return;

public interface ReturnService {

    Integer create(Return aReturn);

    Page<Return> getPageByCustomerId(Integer customerId,Integer pageNum);
}
