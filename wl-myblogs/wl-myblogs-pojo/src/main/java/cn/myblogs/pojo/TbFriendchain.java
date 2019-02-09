package cn.myblogs.pojo;

import java.io.Serializable;

public class TbFriendchain implements Serializable{
	private static final long serialVersionUID=-1l;
    private Integer fId;

    private String fName;

    private String fUrl;

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfUrl() {
        return fUrl;
    }

    public void setfUrl(String fUrl) {
        this.fUrl = fUrl == null ? null : fUrl.trim();
    }
}