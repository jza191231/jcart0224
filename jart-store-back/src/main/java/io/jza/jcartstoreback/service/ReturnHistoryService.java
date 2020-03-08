package io.jza.jcartstoreback.service;

import io.jza.jcartstoreback.po.OrderHistory;
import io.jza.jcartstoreback.po.ReturnHistory;

import java.util.List;

public interface ReturnHistoryService {

    List<ReturnHistory> selectByReturnId(Integer returnId);

}
