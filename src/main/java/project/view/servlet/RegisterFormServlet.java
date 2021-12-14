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
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // Generate the HTML response
            out.println("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>Sign up</title>\n" +
                    "<!-- CSS-->\n" +
                    "  <link href=\" \" rel=\"stylesheet\">\n" +
                    "<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n" +
                    "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n" +
                    "<link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@100&display=swap\" rel=\"stylesheet\">\n" +
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
                    "  body {   font-family: 'Roboto', sans-serif; }\n" +
                    "</style>\n" +
                    "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "  <div class=\"border\" style=\"border:none\">\n" +
                    "<header>\n" +
                    " \n" +
                    "        <br>\n" +
                    "        <h2 >Регистрация</h2>\n" +
                    "        <br>\n" +
                    "</header>\n" +
                    "<main>\n" +
                    "  <form action=\"Register\" method=\"post\">\n" +
                    "    <label for=\"name\" >User Name:</label><br>\n" +
                    "      <input type=\"text\"  id=\"name\" name=\"uname\" placeholder=\"Введите имя\" ><br>\n" +
                    "       <br>\n" +
                    "    <label for=\"password\" >Password:</label><br>\n" +
                    "      <input type=\"password\"  id=\"password\" name=\"password\" placeholder=\"Введите пароль\"><br><br>\n" +
                    "         <label for=\"email\" >Email:</label><br>\n" +
                    "      <input type=\"text\"  id=\"email\" name=\"email\" placeholder=\"Введите почтовый адрес\"><br><br>\n" +
                    "        <label for=\"name\" >Phone:</label><br>\n" +
                    "      <input type=\"text\"  id=\"phone\" name=\"phone\" placeholder=\"Введите телефон\"><br>\n" +
                    "  </form> \n" +
                    "</main>\n" +
                    "<footer>\n" +
                    "  <br>\n" +
                    "  <button type=\"submit\" value=\"register\" class=\"btn btn-danger\">Регистрация</button>\n" +
                    " <br>\n" +
                    " <br>\n" +
                    " <p class=\"login\">Уже есть аккаунт? <a href=\"/login\" > Вход</a></p>\n" +
                    "</footer>\n" +
                    "</div>\n" +
                    "</body>\n" +
                    "</html>");
        } finally {
            out.close();
        }
    }
}
