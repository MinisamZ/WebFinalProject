package project.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class TestFormServlet extends HttpServlet {
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
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();


        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in, "Cp866"));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out, "Cp866"), true);

        System.out.println("out + " + out.toString());
        System.out.println("br + " + br.toString());
        System.out.println("pw + " + pw.toString());

        try {
            out.println("Привет");
        } finally {
            out.close();
        }

    }
}