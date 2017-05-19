package cn.wasis.util;

import java.util.List;
/**
 * 分页方法类
 * @author Mr.Yan
 */
public class Page<T> {

    private Integer totalSize;  //总记录数
    private Integer totalPages; //总页数
    private Integer pageNo;    ///当前页码
    private Integer pageSize;   //每页显示多少条数据
    private List<T> items;      //当前页的数据
    private Integer start;      //获取当前页起始行数

    /**
     * @param pageNo 当前页码
     * @param pageSize 每页显示的数据量
     * @param totalSize 总记录数
     */
    public Page(Integer pageNo, Integer pageSize, Integer totalSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalSize = totalSize;

        //计算总页数
        totalPages = totalSize / pageSize;
        if(totalSize % pageSize != 0) {
            totalPages++;
        }
        
        // 修复表中为空的bug
        // 用三目运算符进行判断
        totalPages = totalPages == 0 ? 1:totalPages;
       
        
        if(pageNo > totalPages) {
            this.pageNo = totalPages;
        }
        if(pageNo <= 0) {
            this.pageNo = 1;
        }

        start = (this.pageNo - 1) * pageSize;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public List<T> getItems() {
        return items;
    }

    public Integer getStart() {
        return start;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }
}
