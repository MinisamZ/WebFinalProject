package project.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginFormServlet extends HttpServlet {
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
            out.println("<title>Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Login</h1>");
            out.println("<form action = \"Login\" method = \"post\">");
            out.println("<div class=\"container\">");
            out.println("<label for=\"uname\"><b> Username </b></label>");
            out.println("<input type = \"text\" placeholder = \"Enter Username\" name = \"uname\" required = \"\">");
            out.println("<br>");
            out.println("<br>");
            out.println("<label for=\"password\"><b> Password </b></label>");
            out.println("<input type = \"password\" placeholder = \"Enter Password\" name = \"password\" required = \"\" >");
            out.println("<button type = \"submit\"> Login </button>");
            out.println("</div >");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }

    }
}

