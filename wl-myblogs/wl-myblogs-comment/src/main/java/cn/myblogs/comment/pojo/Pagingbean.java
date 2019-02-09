package cn.myblogs.comment.pojo;

import java.io.Serializable;
import java.util.List;


public class Pagingbean<T> implements Serializable{
	private static final long serialVersionUID=-1l;
	private int totanumber;
	private List<T> objected;
	public int getTotanumber() {
		return totanumber;
	}
	public void setTotanumber(int totanumber) {
		this.totanumber = totanumber;
	}
	public List<T> getObjected() {
		return objected;
	}
	public void setObjected(List<T> objected) {
		this.objected = objected;
	}
}
