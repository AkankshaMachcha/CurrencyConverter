package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Currency;
import model.CurrencyInfo;

/**
 * Servlet implementation class CurrencyControler
 */
@WebServlet("/CurrencyControler")
public class CurrencyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CurrencyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @param <HttpSession>
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double Amount =Double.parseDouble(request.getParameter("currencyvalue"));
		String Currency1 = request.getParameter("Currency1");
		String Currency2 = request.getParameter("Currency2");
		HttpSession session= request.getSession();
		Currency c=new Currency();
		ArrayList<Currency> lst=c.AssignValue();
		c.display(lst);
		CurrencyInfo ci=new CurrencyInfo();
		System.out.println("Currency 1:"+Currency1);
		System.out.println("Currency 2:"+Currency2);
		Double price=ci.convertCurrency(lst, Currency1, Currency2, Amount);
		
////		PrintWriter out=response.getWriter();
////		out.write(Amount+" "+Currency1+" "+Currency2+" = "+price);
//		response.sendRedirect( "index.jsp?price="+price+"Currency1="+Currency1+"Currency2="+Currency2+"Amount="+Amount );
//		
//		
//		
		
	
		request.setAttribute("price", price);
		request.setAttribute("Currency1",Currency1);
		request.setAttribute("Currency2",Currency2);
		request.setAttribute("Amount", Amount);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
