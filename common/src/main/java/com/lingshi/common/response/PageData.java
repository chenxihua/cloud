package com.lingshi.common.response;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: PageData
 * @Create By: chenxihua
 * @Date: 2019/9/11 15:08
 *
 *  pageData 可以放到 Result 的 Data 里面封装起来, 返回给前端页面
 *
 */
public class PageData<M> implements Serializable {


    private Integer currentPage;
    private Integer pageSize;

    private Long total;
    private List<M> rows;

    public PageData(){
    }

    public PageData(List<M> rows, Long total, Integer pageSize, Integer currentPage){
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.total = total;
        this.rows = rows;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<M> getRows() {
        return rows;
    }

    public void setRows(List<M> rows) {
        this.rows = rows;
    }
}
