package cn.myblogs.pojo;

import java.io.Serializable;

public class TbClassifyNumber implements Serializable{
	private static final long serialVersionUID=-1l;
    private Integer cl_id;

    private String cl_category;

    private String cl_content;
    
    private Integer cl_number;

	public Integer getCl_id() {
		return cl_id;
	}

	public void setCl_id(Integer cl_id) {
		this.cl_id = cl_id;
	}

	public String getCl_category() {
		return cl_category;
	}

	public void setCl_category(String cl_category) {
		this.cl_category = cl_category;
	}

	public String getCl_content() {
		return cl_content;
	}

	public void setCl_content(String cl_content) {
		this.cl_content = cl_content;
	}

	public Integer getCl_number() {
		return cl_number;
	}

	public void setCl_number(Integer cl_number) {
		this.cl_number = cl_number;
	}

	
}
