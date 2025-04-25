
package webCourse;

import java.io.*;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebCourseServlet
 */
@WebServlet("/WebCourseServlet")
public class WebCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebCourseServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintStream output = new PrintStream(response.getOutputStream());
		output.println("<html><body>");
		
		String filePath = getServletContext().getRealPath("/Course.in");
		Scanner inputFile = new Scanner(new File(filePath));

	    List<Course> courseArrayList = new ArrayList<>();
	    while (inputFile.hasNext()) {
	        Course courseObj = new Course();
	        courseObj.setCourse_no(inputFile.next());
	        courseObj.setCourse_name(inputFile.next());
	        Course.setCredits(inputFile.nextInt());
	        courseObj.setMax_enrl(inputFile.nextInt());
	        courseArrayList.add(courseObj);
	    }
	    
		output.println("<table border=\"1\"><tbody>");
		output.println("<tr><th>Course Number</th><th>Course Name</th><th>Max Enrolment</th><th>Credits</th><th>Total Course Fees</th></tr>");
		
		for(Course course : courseArrayList) {
			output.printf("<tr><td>%s</td><td>%s</td><td>%d</td><td>%d</td><td>%.2f$</td></tr>",
					course.getCourse_no(),
					course.getCourse_name(),
					course.getMax_enrl(),
					Course.getCredits(),
					course.CalculateTotalFees()
			);
		}
	
		output.println("</tbody></table>");
		
		output.printf("<p>The Total of Billing is: %.2f$</p>", courseArrayList.stream().mapToDouble(Course::CalculateTotalFees).sum());
		
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
