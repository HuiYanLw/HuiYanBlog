package cn.myblogs.comment.util;

import java.io.Serializable;


/**
 * 
 */
public class BlogsResult implements Serializable{
	private static final long serialVersionUID=1L;
    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;
    
    //构建其他状态的taotaoresult对象
    public static BlogsResult build(Integer status, String msg, Object data) {
        return new BlogsResult(status, msg, data);
    }

    public static BlogsResult ok(Object data) {
        return new BlogsResult(data);
    }

    public static BlogsResult ok() {
        return new BlogsResult(null);
    }

    public BlogsResult() {

    }

    public static BlogsResult build(Integer status, String msg) {
        return new BlogsResult(status, msg, null);
    }

    public BlogsResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public BlogsResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
