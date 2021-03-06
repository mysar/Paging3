package cn.wasis.util;

import java.util.List;
/**
 * 对分页结果的封装  
 * 修改分页无数据时的start=-5的bug
 */
public class Page2<T> {

    //总页数
    private int totalPage;
    //当前页码
    private int pageNo;
    //当前页数据
    private List<T> items;
    //总条数
    private int totals;
    //每页显示的数据量
    private int pageSize = 3;
    //当前页的起始行号
    private int start;

    public Page2(int totals,int pageNo) {
        if(pageNo < 1) {
            pageNo = 1;
        }
        this.totals = totals;


        //获取总页数
        totalPage = totals / pageSize;
         if(totals % pageSize != 0) {
             totalPage++;
         }

      totalPage = totalPage == 0 ?1:totalPage;
         if(pageNo > totalPage) {
             pageNo = totalPage;
         }
        this.pageNo = pageNo;

        //计算当前页的起始行数
        start = (pageNo - 1) * pageSize;
    }






    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }
}