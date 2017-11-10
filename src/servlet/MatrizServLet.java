package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MatrizDB;



/**
 * Servlet implementation class MatrizServLet
 */
public class MatrizServLet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MatrizServLet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		
		String m11 = request.getParameter("m1");
		String m22 = request.getParameter("m2");
		String m33 = request.getParameter("m3");
		String m44 = request.getParameter("m4");
		
		int m1 = Integer.parseInt(m11);
		int m2 = Integer.parseInt(m22);
		int m3 = Integer.parseInt(m33);
		int m4 = Integer.parseInt(m44);
		   
		
		HttpSession session = request.getSession();
		int res = MatrizDB.addMatriz(m1,m2,m3,m4);
		
		session.setAttribute("r", res);

		response.sendRedirect("paginas/resp.jsp");
	}

}
