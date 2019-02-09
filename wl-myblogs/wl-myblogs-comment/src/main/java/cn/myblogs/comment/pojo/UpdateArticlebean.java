package cn.myblogs.comment.pojo;

import java.io.Serializable;
import java.util.List;

import cn.myblogs.pojo.TbArticle;
import cn.myblogs.pojo.TbClassify;



public class UpdateArticlebean implements Serializable{
	private static final long serialVersionUID=-1l;
	private List<TbClassify> classifyes;
	private TbArticle tbArticle;
	public List<TbClassify> getClassifyes() {
		return classifyes;
	}
	public void setClassifyes(List<TbClassify> classifyes) {
		this.classifyes = classifyes;
	}
	public TbArticle getTbArticle() {
		return tbArticle;
	}
	public void setTbArticle(TbArticle tbArticle) {
		this.tbArticle = tbArticle;
	}
	
}
