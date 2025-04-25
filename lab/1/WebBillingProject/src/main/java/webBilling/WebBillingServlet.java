package webBilling;

import java.io.*;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebBillingServlet
 */
@WebServlet("/WebBillingServlet")
public class WebBillingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebBillingServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintStream output = new PrintStream(response.getOutputStream());
		output.println("<html><body>");
		
		List<Billing> billingList = new ArrayList<>();
		Billing newBilling1 = new Billing();
		newBilling1.setClient_LName("Johnston");
		newBilling1.setClient_FName("Jane");
		newBilling1.setProduct_name("Chair");
		newBilling1.setPrd_Price(99.99);
		newBilling1.setPrt_Qty(2);
		billingList.add(newBilling1);
		
		Billing newBilling2 = new Billing();
		newBilling2.setClient_LName("Fikhali");
		newBilling2.setClient_FName("Samuel");
		newBilling2.setProduct_name("Table");
		newBilling2.setPrd_Price(139.99);
		newBilling2.setPrt_Qty(1);
		billingList.add(newBilling2);
		
		Billing newBilling3 = new Billing();
		newBilling3.setClient_LName("Samson");
		newBilling3.setClient_FName("Amina");
		newBilling3.setProduct_name("KeyUSB");
		newBilling3.setPrd_Price(14.99);
		newBilling3.setPrt_Qty(2);
		billingList.add(newBilling3);
		
		output.println("<table border=\"1\"><tbody>");
		output.println("<tr><th>client_LName</th><th>client_FName</th><th>product_Name</th><th>prd_Price</th><th>prd_Qty</th><th>Total Billing</th></tr>");
		
		for(Billing bill : billingList) {
			output.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%.2f$</td><td>%d</td><td>%.2f$</td></tr>",
					bill.getClient_LName(), 
					bill.getClient_FName(), 
					bill.getProduct_name(), 
					bill.getPrd_Price(), 
					bill.getPrt_Qty(), 
					bill.CalculateBilling()
			);
		}
	
		output.println("</tbody></table>");
		output.printf("<p>The Total of Billing is: %.2f$</p>", newBilling1.CalculateBilling() + newBilling2.CalculateBilling() + newBilling3.CalculateBilling());
		
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
