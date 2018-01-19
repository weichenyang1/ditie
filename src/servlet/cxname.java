package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.imp.SubwayServiceImp;

/**
 * Servlet implementation class cxname
 */
@WebServlet("/cxname")
public class cxname extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  SubwayServiceImp su = new SubwayServiceImp();
       
   
    public cxname() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		int n = su.cxname(name);
		if(n == -1){
			response.getWriter().write("可以使用");
		}else{
			response.getWriter().write("线路名已存在");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
