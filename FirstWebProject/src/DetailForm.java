import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class DetailForm extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		System.out.println("Fname : "+fname);
		
		PrintWriter pw  = res.getWriter();
		
		if(fname.equals("juned")) {
			System.out.println("Success!!");
			pw.print("<html><body><h1>"
					+ "Welcome "+fname
					+ "<br><a href = 'Index.html'>Back</a>"
					+ "</h1></body></html>");
		}else {
			System.out.println("UnSuccess!!");
			pw.print("<html><body><h1>"
					+ "Wrong Input."
					+ "<br><a href = 'Index.html'>Back</a>"
					+ "</h1></body></html>");
		}
		
	}

}
