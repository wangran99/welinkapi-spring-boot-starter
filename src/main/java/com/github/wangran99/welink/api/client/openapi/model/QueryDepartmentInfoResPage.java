package com.github.wangran99.welink.api.client.openapi.model;

import java.util.List;
import lombok.Data;

/**
 * @author ：Wang
 * @date ：Created in 2020/8/4 9:21
 * @description：
 */
@Data
public class QueryDepartmentInfoResPage {
    private int pageNo;
    private int pageSize;
    private int hasMore;
    List<DeptDetailRes> data;
}
