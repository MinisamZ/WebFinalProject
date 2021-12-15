package project.view.servlet;

import project.view.Session;
import project.view.db.ArticlesDao;
import project.view.model.Articles;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArticlesPageServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void generateView(HttpServletRequest request,
                             HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        ResultSet resultSet = null;
        PrintWriter out = response.getWriter();
        String categorie = request.getParameter("categorie");
        System.out.println(categorie);

        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>Блог онлайн</title>\n" +
                "  <!-- Bootstrap CSS (jsDelivr CDN) -->\n" +
                "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                "  <!-- Bootstrap Bundle JS (jsDelivr CDN) -->\n" +
                "  <script defer src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\n" +
                "  <!-- Google Fonts -->\n" +
                "  <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\">\n" +
                "  <!-- Custom -->\n" +
                "  <style type=\"text/css\">\n" +
                "  html, body, div, span, applet, object, iframe,\n" +
                "h1, h2, h3, h4, h5, h6, p, blockquote, pre,\n" +
                "a, abbr, acronym, address, big, cite, code,\n" +
                "del, dfn, em, img, ins, kbd, q, s, samp,\n" +
                "small, strike, strong, sub, sup, tt, var,\n" +
                "b, u, i, center,\n" +
                "dl, dt, dd, ol, ul, li,\n" +
                "fieldset, form, label, legend,\n" +
                "table, caption, tbody, tfoot, thead, tr, th, td,\n" +
                "article, aside, canvas, details, embed,\n" +
                "figure, figcaption, footer, header, hgroup,\n" +
                "menu, nav, output, ruby, section, summary,\n" +
                "time, mark, audio, video {\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "  border: 0;\n" +
                "  font-size: 100%;\n" +
                "  font: inherit;\n" +
                "  vertical-align: baseline; }\n" +
                "/* HTML5 display-role reset for older browsers */\n" +
                "article, aside, details, figcaption, figure,\n" +
                "footer, header, hgroup, menu, nav, section {\n" +
                "  display: block; }\n" +
                "body {\n" +
                "  line-height: 1; }\n" +
                "ol, ul {\n" +
                "  list-style: none; }\n" +
                "blockquote, q {\n" +
                "  quotes: none; }\n" +
                "blockquote:before, blockquote:after,\n" +
                "q:before, q:after {\n" +
                "  content: '';\n" +
                "  content: none; }\n" +
                "table {\n" +
                "  border-collapse: collapse;\n" +
                "  border-spacing: 0; }\n" +
                "h1 {\n" +
                "  font-size: 48px;\n" +
                "  font-weight: bold; }\n" +
                "h2 {\n" +
                "  font-size: 34px;\n" +
                "  font-weight: bold; }\n" +
                "h3 {\n" +
                "  font-size: 20px;\n" +
                "  font-weight: bold; }\n" +
                "h4 {\n" +
                "  font-size: 16px;\n" +
                "  font-weight: bold; }\n" +
                "h5 {\n" +
                "  font-size: 14px;\n" +
                "  font-weight: bold; }\n" +
                "h6 {\n" +
                "  font-size: 12px;\n" +
                "  font-weight: bold; }\n" +
                "body {\n" +
                "  font-family: 'Roboto', sans-serif; }\n" +
                "#header {\n" +
                "  margin-bottom: 25px; }\n" +
                "  #header .header__top {\n" +
                "    padding: 37px 0; }\n" +
                "    #header .header__top .header__top__logo {\n" +
                "      float: left; }\n" +
                "    #header .header__top .header__top__menu {\n" +
                "      padding-top: 15px;\n" +
                "      text-align: right; }\n" +
                "      #header .header__top .header__top__menu ul > li {\n" +
                "        display: inline-block;\n" +
                "        margin-right: 35px; }\n" +
                "        #header .header__top .header__top__menu ul > li > a {\n" +
                "          font-size: 20px;\n" +
                "          text-decoration: none;\n" +
                "          color: black; }\n" +
                "          #header .header__top .header__top__menu ul > li > a:hover {\n" +
                "            border-bottom: 2px solid #333; }\n" +
                "  #header .header__bottom {\n" +
                "    height: 50px;\n" +
                "    background-color: black;\n" +
                "    line-height: 50px; }\n" +
                "    #header .header__bottom nav ul > li {\n" +
                "      display: inline-block;\n" +
                "      margin-right: 34px; }\n" +
                "      #header .header__bottom nav ul > li > a {\n" +
                "        color: white;\n" +
                "        font-size: 20px;\n" +
                "        text-decoration: none;\n" +
                "        padding: 3px 10px; }\n" +
                "        #header .header__bottom nav ul > li > a:hover {\n" +
                "          border-top: 2px solid white;\n" +
                "          border-bottom: 2px solid white; }\n" +
                ".block {\n" +
                "  border-radius: 25px;\n" +
                "  background-color: #ebebeb;\n" +
                "  padding: 36px 42px;\n" +
                "  margin-bottom: 25px; }\n" +
                "  .block > h3 {\n" +
                "    font-weight: normal; }\n" +
                "  .block > a {\n" +
                "    float: right;\n" +
                "    font-size: 20px;\n" +
                "    color: black;\n" +
                "    text-decoration: none;\n" +
                "    font-weight: 300; }\n" +
                "    .block > a:hover {\n" +
                "      border-bottom: 1px solid #333; }\n" +
                "  .block .block__content {\n" +
                "    padding-top: 40px; }\n" +
                ".articles.articles__horizontal {\n" +
                "  font-size: 0;\n" +
                "  margin: -12px; }\n" +
                "  .articles.articles__horizontal .article {\n" +
                "    margin-bottom: 22px;\n" +
                "    display: inline-block;\n" +
                "    vertical-align: top;\n" +
                "    width: 50%;\n" +
                "    font-size: 16px;\n" +
                "    padding: 12px; }\n" +
                ".articles.articles__vertical .article {\n" +
                "  margin-bottom: 22px; }\n" +
                ".articles .article:last-child {\n" +
                "  margin-bottom: 0; }\n" +
                ".articles .article:after {\n" +
                "  visibility: hidden;\n" +
                "  display: block;\n" +
                "  font-size: 0;\n" +
                "  content: \" \";\n" +
                "  clear: both;\n" +
                "  height: 0; }\n" +
                ".articles .article .article__image {\n" +
                "  width: 125px;\n" +
                "  height: 125px;\n" +
                "  overflow: hidden;\n" +
                "  background-color: black;\n" +
                "  float: left;\n" +
                "  background-repeat: no-repeat;\n" +
                "  background-size: cover;\n" +
                "  background-position: center center; }\n" +
                ".articles .article .article__info {\n" +
                "  margin-left: 125px;\n" +
                "  padding-left: 21px; }\n" +
                "  .articles .article .article__info > a {\n" +
                "    color: black;\n" +
                "    font-size: 18px;\n" +
                "    font-weight: normal;\n" +
                "    text-decoration: none; }\n" +
                "    .articles .article .article__info > a:hover {\n" +
                "      border-bottom: 2px solid #333; }\n" +
                "  .articles .article .article__info > .article__info__meta {\n" +
                "    font-size: 14px;\n" +
                "    font-weight: 300;\n" +
                "    margin-top: 9px;\n" +
                "    margin-bottom: 13px; }\n" +
                "    .articles .article .article__info > .article__info__meta a {\n" +
                "      color: black;\n" +
                "      text-decoration: none; }\n" +
                "      .articles .article .article__info > .article__info__meta a:hover {\n" +
                "        border-bottom: 1px solid #333; }\n" +
                "  .articles .article .article__info > .article__info__preview {\n" +
                "    font-size: 16px;\n" +
                "    font-weight: 300; }\n" +
                "#footer {\n" +
                "  background-color: #ebebeb;\n" +
                "  padding: 37px 0; }\n" +
                "  #footer .footer__logo {\n" +
                "    float: left; }\n" +
                "  #footer .footer__menu {\n" +
                "    padding-top: 15px;\n" +
                "    text-align: right; }\n" +
                "    #footer .footer__menu ul > li {\n" +
                "      display: inline-block;\n" +
                "      margin-right: 35px; }\n" +
                "      #footer .footer__menu ul > li > a {\n" +
                "        font-size: 20px;\n" +
                "        text-decoration: none;\n" +
                "        color: black;\n" +
                "        font-weight: 300; }\n" +
                "        #footer .footer__menu ul > li > a:hover {\n" +
                "          border-bottom: 1px solid #333; }\n" +
                ".full-text {\n" +
                "  font-size: 18px;\n" +
                "  color: #3a3a3a;\n" +
                "  line-height: 1.7em; }\n" +
                "  .full-text p {\n" +
                "    text-indent: 0;\n" +
                "    margin: 0 0 26px 0; }\n" +
                "  .full-text h1, .full-text h2, .full-text h3, .full-text h4, .full-text h5, .full-text h6 {\n" +
                "    margin: 52px 0 26px 0; }\n" +
                ".form .form__group {\n" +
                "  margin-bottom: 20px; }\n" +
                "  .form .form__group:last-child {\n" +
                "    margin-bottom: 0; }\n" +
                ".form .form__control {\n" +
                "  width: 100%;\n" +
                "  padding: 10px;\n" +
                "  font-size: 16px;\n" +
                "  outline: none; }\n" +
                ".form textarea.form__control {\n" +
                "  min-height: 100px; }\n" +
                ".form input[type=\"submit\"].form__control {\n" +
                "  background-color: black;\n" +
                "  color: white;\n" +
                "  border: 3px solid white;\n" +
                "  width: 250px;\n" +
                "  opacity: 0.7; }\n" +
                "  .form input[type=\"submit\"].form__control:hover {\n" +
                "    cursor: pointer;\n" +
                "    opacity: 1; }\n" +
                "  .img{\n" +
                "    margin-top: -20px;\n" +
                "  }\n" +
                "  .another-element {\n" +
                "      @include float-right;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div id=\"wrapper\">\n" +
                "    <header id=\"header\">\n" +
                "  <div class=\"header__top\">\n" +
                "    <div class=\"container\">\n" +
                "      <div class=\"header__top__logo\">\n" +
                "        <img src=\" https://images-ext-2.discordapp.net/external/XLOMh2NHrsVPCi6sDXF14DBgW-nZ1J3hFcgUJ0hO8g0/https/www.astronews.ru/img/logo.png\" class=\"img\">\n" +
                "      </div>\n" +
                "      <nav class=\"header__top__menu\">\n" +
                "        <ul>\n" +
                "          <li><a href=\"/main\">Главная</a></li>\n" +
                "          <li><a href=\"/about_me\">Обо мне</a></li>\n" +
                "          <li><a href=\"http://vk.com/gorgulev2266\" target=\"_blank\">Я Вконтакте</a></li>\n" +
                "        </ul>\n" +
                "      </nav>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "    <div class=\"header__bottom\">\n" +
                "    <div class=\"container\">\n" +
                "      <nav>\n" +
                "        <ul>\n" +
                "        <li><a href=\"/articles?categorie=1\" >Космос</a></li>\n" +
                "        <li><a href=\"/articles?categorie=2\" >Программирование</a></li>\n" +
                "        <li><a href=\"/articles?categorie=3\" >Игры</a></li>\n" +
                "\t\t<li> </li><li> </li><li> </li><li> </li><li> </li><li> </li><li> </li><li> </li><li> </li><li> </li><li> </li><li> </li><li> </li>\n");
        Session s = new Session();
        out.println(s.checkAccess(request) +
                "\t\t</ul>\t\t\n" +
                "      </nav>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</header>\n");

        out.println(" <div id=\"content\">\n" +
                "        <div class=\"container\">\n" +
                "          <div class=\"row\">\n" +
                "            <section class=\"content__left col-md-8\">\n" +
                "              <div class=\"block\">\n" +
                "                <a href=\"/articles\">Все записи</a>\n" +
                "                <h3>Все статьи</h3>\n" +
                "                <div class=\"block__content\">\n" +
                "                  <div class=\"articles articles__horizontal\">\n");
        resultSet = ArticlesDao.request("SELECT * FROM `articles` ORDER BY `pubdate` DESC");
        try {
            while (resultSet.next()) {
                Articles c = new Articles();
                c.id = resultSet.getString("id");
                c.title = resultSet.getString("title");
                c.image = resultSet.getString("image");
                c.text = resultSet.getString("text");
                c.categorie_id = resultSet.getString("categorie_id");
                out.println("<article class=\"article\">\n" +
                        "<div class=\"article__image\" style=\"background-image: url(" + c.image + ");\"></div>\n" +
                        "<div class=\"article__info\">\n" +
                        "<a href=\"/article?id=" + c.id + "\"> " + c.title + "</a>\n" +
                        "<div class=\"article__info__meta\">\n" +
                        "<small>Категория: <a href=\"/articles?categorie=" + c.categorie_id + "\"> ");
                switch (c.categorie_id) {
                    case ("1"):
                        out.println(" Космос");
                        break;
                    case ("2"):
                        out.println(" Программирование");
                        break;
                    case ("3"):
                        out.println(" Игры");
                        break;
                    default:
                        out.println(" Программирование ");
                        break;
                }
                out.println("</a></small>\n" +
                        "</div>\n" +
                        "<div class=\"article__info__preview\"> " + c.text.substring(0, 99) + "...</div>\n" +
                        "</div>\n" +
                        "</article>\n");


            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        out.println(
                "                </div>\n" +
                        "              </div>\n" +
                        "            </section>\n" +
                        "<section class=\"content__right col-md-4\">\n" +
                        "            <div class=\"block\">\n" +
                        "  <h3>Мы знаем</h3>\n" +
                        "  <div class=\"block__content\">\n" +
                        "    <iframe style=\"background:transparent !important\" scrolling=\"no\" frameborder=\"0\" allowtransparency=\"true\" width=\"320\" height=\"320\" src=\"//ra.revolvermaps.com/w/6/a/c2.php?i=02op3nb0crr&amp;m=7&amp;s=320&amp;c=e63100&amp;cr1=ffffff&amp;f=arial&amp;l=0&amp;bv=90&amp;lx=-420&amp;ly=420&amp;hi=20&amp;he=7&amp;hc=a8ddff&amp;rs=80\"></iframe>\n" +
                        "  </div>\n" +
                        "</div>\n" +
                        "<div class=\"block\">\n" +
                        "  <h3>Топ читаемых статей</h3>\n" +
                        "  <div class=\"block__content\">\n" +
                        "    <div class=\"articles articles__vertical\">\n");

        resultSet = ArticlesDao.request("SELECT * FROM `articles` ORDER BY `views` DESC LIMIT 3");
        try {
            while (resultSet.next()) {
                Articles c = new Articles();
                c.id = resultSet.getString("id");
                c.title = resultSet.getString("title");
                c.image = resultSet.getString("image");
                c.text = resultSet.getString("text");
                c.categorie_id = resultSet.getString("categorie_id");
                out.println("<article class=\"article\">\n" +
                        "<div class=\"article__image\" style=\"background-image: url(" + c.image + ");\"></div>\n" +
                        "<div class=\"article__info\">\n" +
                        "<a href=\"/article?id=" + c.id + "\"> " + c.title + "</a>\n" +
                        "<div class=\"article__info__meta\">\n" +
                        "<small>Категория: <a href=\"/articles?categorie=" + c.categorie_id + "\"> Программирование</a></small>\n" +
                        "</div>\n" +
                        "<div class=\"article__info__preview\"> " + c.text.substring(0, 50) + "...</div>\n" +
                        "</div>\n" +
                        "</article>\n");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        out.println("</div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "</section>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <footer id=\"footer\">\n" +
                "  <div class=\"container\">\n" +
                "    <div class=\"footer__logo\">\n" +
                "        <img src=\" https://images-ext-2.discordapp.net/external/XLOMh2NHrsVPCi6sDXF14DBgW-nZ1J3hFcgUJ0hO8g0/https/www.astronews.ru/img/logo.png\" class=\"img\">\n" +
                "    </div>\n" +
                "    <nav class=\"footer__menu\">\n" +
                "      <ul>\n" +
                "        <li><a href=\"/main\">Главная</a></li>\n" +
                "        <li><a href=\"/about_me\">Обо мне</a></li>\n" +
                // not work
                "        <li><a href=\"http://vk.com/gorgulev2266 \">Я Вконтакте</a></li>\n" +
                "        <li><a href=\"/copyright\">Правообладателям</a></li>\n" +
                "      </ul>\n" +
                "    </nav>\n" +
                "  </div>\n" +
                "</footer>  </div>\n" +
                "</body>\n" +
                "</html>");

    }
}
