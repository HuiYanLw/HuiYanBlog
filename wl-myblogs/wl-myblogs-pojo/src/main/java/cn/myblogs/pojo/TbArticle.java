package cn.myblogs.pojo;

import java.io.Serializable;

public class TbArticle implements Serializable{
	private static final long serialVersionUID=-1l;
    private Integer aId;

    private String aTitle;

    private String aWriter;

    private String aSummary;

    private String aTime;

    private Integer aRead;

    private Integer clId;

    private Integer aLike;

    private Integer aGroom;

    private String aImg;

    private String aContent;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle == null ? null : aTitle.trim();
    }

    public String getaWriter() {
        return aWriter;
    }

    public void setaWriter(String aWriter) {
        this.aWriter = aWriter == null ? null : aWriter.trim();
    }

    public String getaSummary() {
        return aSummary;
    }

    public void setaSummary(String aSummary) {
        this.aSummary = aSummary == null ? null : aSummary.trim();
    }

    public String getaTime() {
        return aTime;
    }

    public void setaTime(String aTime) {
        this.aTime = aTime == null ? null : aTime.trim();
    }

    public Integer getaRead() {
        return aRead;
    }

    public void setaRead(Integer aRead) {
        this.aRead = aRead;
    }

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public Integer getaLike() {
        return aLike;
    }

    public void setaLike(Integer aLike) {
        this.aLike = aLike;
    }

    public Integer getaGroom() {
        return aGroom;
    }

    public void setaGroom(Integer aGroom) {
        this.aGroom = aGroom;
    }

    public String getaImg() {
        return aImg;
    }

    public void setaImg(String aImg) {
        this.aImg = aImg == null ? null : aImg.trim();
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent == null ? null : aContent.trim();
    }
}