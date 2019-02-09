package cn.myblogs.comment.util;


  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletRequestWrapper; 

public class XssAndSqlHttpServletRequestWrapper extends HttpServletRequestWrapper {

	HttpServletRequest orgRequest = null;  
    
    public XssAndSqlHttpServletRequestWrapper(HttpServletRequest request) {  
        super(request);  
        orgRequest = request;  
    }  
  
    /** 
     * 覆盖getParameter方法，将参数名和参数值都做xss & sql过滤。<br/> 
     * 如果需要获得原始的值，则通过super.getParameterValues(name)来获取<br/> 
     * getParameterNames,getParameterValues和getParameterMap也可能需要覆盖 
     */  
    @Override  
    public String getParameter(String name) {  
        String value = super.getParameter(xssEncode(name));  
        if (value != null) {  
            value = xssEncode(value);  
        }  
        return value;  
    }  
  
    public String[] getOrivalue(String name) {
    	String[] parameter=super.getParameterValues(name);
    	return parameter;
    }
    /** 
     * 覆盖getHeader方法，将参数名和参数值都做xss & sql过滤。<br/> 
     * 如果需要获得原始的值，则通过super.getHeaders(name)来获取<br/> 
     * getHeaderNames 也可能需要覆盖 
     */  
    @Override  
    public String getHeader(String name) {  
  
        String value = super.getHeader(xssEncode(name));  
        if (value != null) {  
            value = xssEncode(value);  
        }  
        return value;  
    }  
  
    /** 
     * 将容易引起xss & sql漏洞的半角字符直接替换成全角字符 
     *  
     * @param s 
     * @return 
     */  
    private static String xssEncode(String s) {  
        if (s == null || s.isEmpty()) {  
            return s;  
        }else{  
            s = stripXSSAndSql(s);  
        }  
        StringBuilder sb = new StringBuilder(s.length() + 16);  
        for (int i = 0; i < s.length(); i++) {  
            char c = s.charAt(i);  
            switch (c) {  
            case '>':  
                sb.append("＞");// 转义大于号  
                break;  
            case '<':  
                sb.append("＜");// 转义小于号  
                break;  
            case '\'':  
                sb.append("＇");// 转义单引号  
                break;  
            case '\"':  
                sb.append("＂");// 转义双引号  
                break;  
            case '&':  
                sb.append("＆");// 转义&  
                break;  
            case '#':  
                sb.append("＃");// 转义#  
                break;  
            default:  
                sb.append(c);  
                break;  
            }  
        }  
        return sb.toString();  
    }  
  
    /** 
     * 获取最原始的request 
     *  
     * @return 
     */  
    public HttpServletRequest getOrgRequest() {  
        return orgRequest;  
    }  
  
    /** 
     * 获取最原始的request的静态方法 
     *  
     * @return 
     */  
    public static HttpServletRequest getOrgRequest(HttpServletRequest req) {  
        if (req instanceof XssAndSqlHttpServletRequestWrapper) {  
            return ((XssAndSqlHttpServletRequestWrapper) req).getOrgRequest();  
        }  
  
        return req;  
    }  
  
    /** 
     *  
     * 防止xss跨脚本攻击（替换，根据实际情况调整） 
     */  
  
    public static String stripXSSAndSql(String value) {  
    	if (value == null || "".equals(value)) {

            return value;

       }
       //建议下面片段使用StringBuffer对象处理。
       value = value. replaceAll ("<", "<"). replaceAll (">", ">");

       value = value.replaceAll("\\(", "(").replace("\\)", ")");

       value = value. replaceAll ("'", "'");

       value = value.replaceAll("eval\\((.*)\\)", "");

       value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");

       value = value.replace("script", "");

       return value;

    }  
  
}  
