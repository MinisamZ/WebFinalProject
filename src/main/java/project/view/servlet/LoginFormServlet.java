package project.view.servlet;

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
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Generate the HTML response
            out.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>login</title>\n" +
                    "<!-- CSS-->\n" +
                    "  <link href=\" \" rel=\"stylesheet\">\n" +
                    "<!-- Bootstrap CSS (jsDelivr CDN) -->\n" +
                    "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                    "  <!-- Bootstrap Bundle JS (jsDelivr CDN) -->\n" +
                    "  <style>\n" +
                    "  .border{\n" +
                    "\tmargin-top: 50px;\n" +
                    "\tborder: none; \n" +
                    "\tpadding-left: 50px;\n" +
                    "    background: none;\n" +
                    "    width: 300px;\n" +
                    "        margin-left: auto;\n" +
                    "    margin-right: auto;\n" +
                    "  }\n" +
                    "  h2, form,p,{\n" +
                    "    text-align: center;\n" +
                    "  }\n" +
                    "  .btn{\n" +
                    "       position: absolute;\n" +
                    "       width: 190px;\n" +
                    "  }\n" +
                    "    body {   font-family: 'Roboto', sans-serif; }\n" +
                    "</style>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "  <div class=\"border\">\n" +
                    "<header>\n" +
                    "        <br>\n" +
                    "        <h2 >Вход</h2>\n" +
                    "        <br>\n" +
                    "</header>\n" +
                    "<main>\n" +
                    "  <form action = \"Login\" method = \"post\">\n" +
                    "    <label for=\"uname\" >Username:</label><br>\n" +
                    "      <input type=\"text\"  id=\"uname\" name=\"uname\" placeholder=\"Enter Username\" ><br>\n" +
                    "       <br>\n" +
                    "    <label for=\"password\" >Пароль:</label><br>\n" +
                    "      <input type=\"password\"  id=\"password\" name=\"password\" placeholder=\"Введите пароль\"><br><br>\n" +
                    "</main>\n" +
                    "<footer>\n" +
                    "  <br>\n" +
                    "  <button type=\"submit\" class=\"btn btn-danger\">Вход</button>\n" +
                    " <br>\n" +
                    " <br>\n" +
                    " <p class=\"login\">Нет аккаунта? <a href=\"/register\" > Регистрация</a></p>\n" +
                    "</footer>\n" +
                    "</div>\n" +
                    "</body>\n" +
                    "</html>");
        } finally {
            out.close();
        }

    }
}

