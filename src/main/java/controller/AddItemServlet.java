package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HouseList;

/**
 * Servlet implementation class AddItemServlet
 */
@WebServlet("/addItemServlet")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		double price = Double.parseDouble(request.getParameter("price"));
		int numRooms = Integer.parseInt(request.getParameter("numRooms"));
		double numBaths =  Double.parseDouble(request.getParameter("numBaths"));
		boolean a_c = "on".equals(request.getParameter("a_c"));
		boolean basement = "on".equals(request.getParameter("basement"));
		boolean pool = "on".equals(request.getParameter("pool"));
		Integer stories = Integer.parseInt(request.getParameter("stories"));
		
		HouseList li = new HouseList(address, city, price, numRooms, numBaths, a_c, basement, pool, stories);
		HouseListHelper dao = new HouseListHelper();
		dao.insertItem(li);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
