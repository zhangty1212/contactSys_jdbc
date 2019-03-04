package gz.itcast.contactSys_web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 设置utf-8 编码，避免前端页面中文乱码问题；
		response.setContentType("text/html;charset=UTF-8");
		//response.setHeader("Content-type", "text/html; charset=UTF-8"); 
		response.getWriter().append("Served at: ").append(request.getContextPath() + "<br/>");
		response.getWriter().write(getServletName() + "<br/>");
		response.getWriter().write(request.getMethod() + "<br/>");
		response.getWriter().write("后台返回用户名" + "<br/>");
		response.getWriter().write("-----------------------------------------" + "<br/>");
		response.getWriter().write(request.getParameter("usrname"));
		response.getWriter().write("<br/>");
		response.getWriter().write("-----------------------------------------" + "<br/>");
		response.getWriter().write("后台返回密码" + "<br/>");
		response.getWriter().write("-----------------------------------------" + "<br/>");
		response.getWriter().write(request.getParameter("passward"));

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		//request.setCharacterEncoding("utf-8");
		//response.setHeader("Content-type", "text/html; charset=UTF-8"); 
		response.getWriter().append("Served at: ").append(request.getContextPath() + "<br/>");
		response.getWriter().write(getServletName() + "<br/>");
		response.getWriter().write(request.getMethod() + "<br/>");
		response.getWriter().write("后台返回用户名" + "<br/>");
		response.getWriter().write("-----------------------------------------" + "<br/>");
		response.getWriter().write(request.getParameter("usrname"));
		response.getWriter().write("<br/>");
		response.getWriter().write("-----------------------------------------" + "<br/>");
		response.getWriter().write("后台返回密码" + "<br/>");
		response.getWriter().write("-----------------------------------------" + "<br/>");
		response.getWriter().write(request.getParameter("passward"));
	}

}
