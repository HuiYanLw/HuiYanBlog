package cn.myblogs.pojo;

import java.io.Serializable;

public class TbMood implements Serializable{
	private static final long serialVersionUID=-1l;
    private Integer moId;

    private String moContent;

    private String moTime;

    public Integer getMoId() {
        return moId;
    }

    public void setMoId(Integer moId) {
        this.moId = moId;
    }

    public String getMoContent() {
        return moContent;
    }

    public void setMoContent(String moContent) {
        this.moContent = moContent == null ? null : moContent.trim();
    }

    public String getMoTime() {
        return moTime;
    }

    public void setMoTime(String moTime) {
        this.moTime = moTime == null ? null : moTime.trim();
    }
}