package cn.myblogs.pojo;

import java.io.Serializable;

public class TbClassify implements Serializable{
	private static final long serialVersionUID=-1l;
    private Integer clId;

    private String clCategory;

    private String clContent;

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public String getClCategory() {
        return clCategory;
    }

    public void setClCategory(String clCategory) {
        this.clCategory = clCategory == null ? null : clCategory.trim();
    }

    public String getClContent() {
        return clContent;
    }

    public void setClContent(String clContent) {
        this.clContent = clContent == null ? null : clContent.trim();
    }
}