package webHelloWorld;
import java.io.*;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
* Servlet implementation class WebHello
*/
@WebServlet("/WebHello")
public class WebHello extends HttpServlet {
	private static final long serialVersionUID = 1L;
   /**
    * Default constructor.
    */
   public WebHello() {
       // TODO Auto-generated constructor stub
   }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintStream output = new PrintStream(response.getOutputStream());
		output.println("<html><body>");
		output.println("<p>Hello World, So cool to develop Weeb Services</p>");
		output.println("<h1>Vanier College</h1>");
		
		// Table
		double prdPrice = 5.99;
		int prdQty = 6;
		double totalBilling;
		totalBilling =  prdPrice * prdQty;
		
		output.println("<table border=\"1\"><tbody>");
		output.println("<tr><th>Prd Price</th><th>Prd Qty</th><th>Total Billing</th></tr>");
		output.printf("<tr><td>%.2f</td><td>%d</td><td>%.2f</td></tr>", prdPrice, prdQty, totalBilling);
		output.println("</tbody></table>");
		output.println("<br>");
		
		// University
		University[] universityArr = {
				new University("Toronto Uni", 2022, 6),
				new University("Montreal Uni", 2024, 3)
		};
		output.println("<h2>Using Array of Objects of two records and print using a for loop</h2>");
		for(University uni: universityArr) {
			output.printf("<div>University %s</div>",uni.toString());
		}
		output.println("<br>");
		
		List<University> universityList = new ArrayList<>();
		universityList.add(new University("Toronto Uni", 2022, 6));
		universityList.add(new University("Montreal Uni", 2024, 3));
		output.println("<h2>Using ArrayList of two records</h2>");
		universityList.forEach(uni -> output.printf("<div>University %s</div>", uni));
		output.println("<br>");
		
		output.println("<h2>Use HashMap of two record where name is key</h2>");
		Map<String, University> universityHashMap = new HashMap<>();
		universityHashMap.put("Toronto Uni",new University("Toronto Uni", 2022, 6));
		universityHashMap.put("Montreal Uni",new University("Montreal Uni", 2024, 3));
		universityHashMap.forEach((key, value) -> output.printf("<div>%s %s</div>", key, value));		
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


