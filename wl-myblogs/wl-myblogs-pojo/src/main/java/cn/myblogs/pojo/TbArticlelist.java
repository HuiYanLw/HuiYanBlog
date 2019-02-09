package cn.myblogs.pojo;

import java.io.Serializable;

public class TbArticlelist implements Serializable{
	private static final long serialVersionUID = -1L;
	private Integer a_id;
	private String a_title;
	private String cl_content;
	private Integer a_like;
	private Integer a_read;
	private String a_time;
	private Integer a_groom;
	private Integer cl_id;
	
	private String a_writer;
	private String a_summary;
	private String a_content;
	private String a_img;
	private String cl_category;
	public Integer getA_id() {
		return a_id;
	}
	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}
	public String getA_title() {
		return a_title;
	}
	public void setA_title(String a_title) {
		this.a_title = a_title;
	}
	public String getCl_content() {
		return cl_content;
	}
	public void setCl_content(String cl_content) {
		this.cl_content = cl_content;
	}
	public Integer getA_like() {
		return a_like;
	}
	public void setA_like(Integer a_like) {
		this.a_like = a_like;
	}
	public Integer getA_read() {
		return a_read;
	}
	public void setA_read(Integer a_read) {
		this.a_read = a_read;
	}
	public String getA_time() {
		return a_time;
	}
	public void setA_time(String a_time) {
		this.a_time = a_time;
	}
	public Integer getA_groom() {
		return a_groom;
	}
	public void setA_groom(Integer a_groom) {
		this.a_groom = a_groom;
	}
	public Integer getCl_id() {
		return cl_id;
	}
	public void setCl_id(Integer cl_id) {
		this.cl_id = cl_id;
	}
	public String getA_writer() {
		return a_writer;
	}
	public void setA_writer(String a_writer) {
		this.a_writer = a_writer;
	}
	public String getA_summary() {
		return a_summary;
	}
	public void setA_summary(String a_summary) {
		this.a_summary = a_summary;
	}
	public String getA_content() {
		return a_content;
	}
	public void setA_content(String a_content) {
		this.a_content = a_content;
	}
	public String getA_img() {
		return a_img;
	}
	public void setA_img(String a_img) {
		this.a_img = a_img;
	}
	public String getCl_category() {
		return cl_category;
	}
	public void setCl_category(String cl_category) {
		this.cl_category = cl_category;
	}
	
}
