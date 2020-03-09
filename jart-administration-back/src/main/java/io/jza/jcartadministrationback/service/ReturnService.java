package io.jza.jcartadministrationback.service;

import com.github.pagehelper.Page;
import io.jza.jcartadministrationback.po.Return;

public interface ReturnService {

    Page<Return> search(Integer pageNum);
}
