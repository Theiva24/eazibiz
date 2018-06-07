package com.eazibiz.demoone.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SampleFilter implements Filter{

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
	System.out.println("reached");
		String val=arg0.getParameter("username");
		
		if(val.equals("admin"))
		{
			arg2.doFilter(arg0, arg1);
			/*rd=arg0.getRequestDispatcher("/WEB-INF/lib/pages/welcome.jsp");*/
		}
		else
		{
			RequestDispatcher rd=arg0.getRequestDispatcher("/WEB-INF/lib/pages/error.jsp");
			rd.forward(arg0, arg1);
		}
		
	}

}
