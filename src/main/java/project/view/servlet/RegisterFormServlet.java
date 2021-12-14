package project.view.servlet;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class RegisterFormServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void generateView(HttpServletRequest request,
                             HttpServletResponse response)
            throws IOException {

        // Set page title

        // Specify the content type is HTML
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            // Generate the HTML response
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Register</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Register</h1>");

            out.println("<form action=\"Register\" method=\"post\">");
            out.println("<table>");
            out.println("<tr><td>User Name: </td><td><input type=\"text\" name=\"uname\"></td></tr>");
            out.println("<tr><td>Password: </td><td><input type=\"password\" name=\"password\"></td></tr>");
            out.println("<tr><td>Email: </td><td><input type=\"text\" name=\"email\"></td></tr>");
            out.println("<tr><td>phone: </td><td><input type=\"text\"name=\"phone\"></td></tr>");
            out.println("<tr><td></td><td><input type=\"submit\" value=\"register\"></td></tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
