package webFacultyProject;

import java.io.*;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebFacultyServlet
 */
@WebServlet("/WebFacultyServlet")
public class WebFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebFacultyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintStream output = new PrintStream(response.getOutputStream());
		output.println("<html><body>");
		
		Map<Integer, Faculty> myFacultyHashMap = new HashMap<>();
		myFacultyHashMap.put(370, new Faculty(370,"Denkan","Anais",95000,1.5));
		myFacultyHashMap.put(212, new Faculty(212,"Smith","Neal",40000,3));
		myFacultyHashMap.put(101, new Faculty(101,"Robertson","Myra",60000,2.5));
		myFacultyHashMap.put(857, new Faculty(857,"Flilipo","Paul",30000,5));
		myFacultyHashMap.put(315, new Faculty(315,"Arlec","Lisa",55000,1.5));
		myFacultyHashMap.put(365, new Faculty(365,"Kirach","Sarah",90000,1.5));
		
		output.println("<table border=\"1\"><tbody>");
		output.println("<tr><th>f_id</th><th>f_Lname</th><th>f_Fname</th><th>f_Salary</th><th>Total</th></tr>");
		myFacultyHashMap.forEach((key, value) -> output.printf("<tr><th>%d</th><th>%s</th><th>%s</th><th>%.2f$</th><th>%.2f$</th></tr>", value.getF_id(), value.getF_Lname(), value.getF_Fname(), value.getF_salary(), value.getF_salary()* value.getF_bonusRate()));
		output.println("</tbody></table>");
		output.println("<br>");
		
		output.printf("<p>The Total of Billing is: %.2f$</p>", myFacultyHashMap.values().stream().mapToDouble(Faculty::Calculate_Total).sum());
		
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
