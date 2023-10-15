package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.HouseList;

/**
 * Servlet implementation class editItemServlet
 */
@WebServlet("/editItemServlet")
public class EditItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HouseListHelper dao = new HouseListHelper();
		
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		double price = Double.parseDouble(request.getParameter("price"));
		int numRooms = Integer.parseInt(request.getParameter("numRooms"));
		double numBaths =  Double.parseDouble(request.getParameter("numBaths"));
		boolean a_c = "on".equals(request.getParameter("a_c"));
		boolean basement = "on".equals(request.getParameter("basement"));
		boolean pool = "on".equals(request.getParameter("pool"));;
		Integer stories = Integer.parseInt(request.getParameter("stories"));
		Integer tempId = Integer.parseInt(request.getParameter("id"));
				
		HouseList itemToUpdate = dao.searchForItemById(tempId);
		itemToUpdate.setAddress(address);
		itemToUpdate.setCity(city);
		itemToUpdate.setPrice(price);
		itemToUpdate.setNumRooms(numRooms);
		itemToUpdate.setNumBaths(numBaths);
		itemToUpdate.setAC(a_c);
		itemToUpdate.setBasement(basement);
		itemToUpdate.setPool(pool);
		itemToUpdate.setStories(stories);
				
		dao.updateItem(itemToUpdate);

		getServletContext().getRequestDispatcher("/viewAllItemsServlet").forward(request, response);


	}

}
