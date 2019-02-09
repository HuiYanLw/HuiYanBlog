package cn.myblogs.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.myblogs.comment.util.WordFilter;


public class SendWordInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request=(HttpServletRequest) arg0;
		HttpServletResponse response=(HttpServletResponse) arg1;
		String mName = request.getParameter("username");
		String mContent = request.getParameter("content");
		String name = WordFilter.getBadWord(mName);
		String content = WordFilter.getBadWord(mContent);
		boolean isName = WordFilter.isContains(mName);
		boolean isContent = WordFilter.isContains(mContent);
		String badword=name+" ; "+content;
		if(!isName&&!isContent){
			request.setAttribute("username", mName);
			request.setAttribute("content", mContent);
			return true;
		}else{
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().write(badword);
		}
		return false;
	}

}
