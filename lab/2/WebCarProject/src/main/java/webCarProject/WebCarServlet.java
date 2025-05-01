package webCarProject;

import java.util.*;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebCarServlet
 */
@WebServlet("/WebCarServlet")
public class WebCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebCarServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintStream output = new PrintStream(response.getOutputStream());
		output.println("<html><body>");
		
		Map<String, Car> myCarHashMap = new HashMap<>();
		myCarHashMap.put("Ford", new Car("K1245", "Ford", 35000));
		myCarHashMap.put("Honda", new Car("M198754", "Ford", 35000));
		myCarHashMap.put("Hyundai", new Car("M98524M4", "Hyundai", 25000));
		myCarHashMap.put("Nissan", new Car("S741582", "Nissan", 30000));
		
		output.println("<table border=\"1\"><tbody>");
		output.println("<tr><th>vin</th><th>desc</th><th>price</th></tr>");
		myCarHashMap.forEach((key, value) -> output.printf("<tr><th>%s</th><th>%s</th><th>%.2f$</th></tr>", value.getVin(), value.getDesc(), value.getPrice()));
		output.println("</tbody></table>");
		
		output.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
