package project.view;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class MainPageServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void generateView(HttpServletRequest request,
                             HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html lang=\"en\"><head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>Блог онлайн</title>\n" +
                "\n" +
                "  <!-- Bootstrap Grid -->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"/media/assets/bootstrap-grid-only/css/grid12.css\">\n" +
                "\n" +
                "  <!-- Google Fonts -->\n" +
                "  <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\">\n" +
                "\n" +
                "  <!-- Custom -->\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"/media/css/style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "  <div id=\"wrapper\">\n" +
                "\n" +
                "    <header id=\"header\">\n" +
                "  <div class=\"header__top\">\n" +
                "    <div class=\"container\">\n" +
                "      <div class=\"header__top__logo\">\n" +
                "        <h1>Блог онлайн</h1>\n" +
                "      </div>\n" +
                "      <nav class=\"header__top__menu\">\n" +
                "        <ul>\n" +
                "          <li><a href=\"/\">Главная</a></li>\n" +
                "          <li><a href=\"/pages/about_me.php\">Обо мне</a></li>\n" +
                "          <li><a href=\"http://vk.com/gorgulev2266\" target=\"_blank\">Я Вконтакте</a></li>\n" +
                "        </ul>\n" +
                "      </nav>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "    <div class=\"header__bottom\">\n" +
                "    <div class=\"container\">\n" +
                "      <nav>\n" +
                "        <ul>\n" +
                "                      <li><a href=\"/articles.php?categorie=1\">Космос</a></li>\n" +
                "\n" +
                "                        <li><a href=\"/articles.php?categorie=2\">Программирование</a></li>\n" +
                "\n" +
                "                        <li><a href=\"/articles.php?categorie=3\">Игры</a></li>\n" +
                "\n" +
                "                    </ul>\n" +
                "      </nav>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</header>\n" +
                "    <div id=\"content\">\n" +
                "      <div class=\"container\">\n" +
                "        <div class=\"row\">\n" +
                "          <section class=\"content__left col-md-8\">\n" +
                "            <div class=\"block\">\n" +
                "              <a href=\"/articles.php\">Все записи</a>\n" +
                "              <h3>Новейшее_в_блоге</h3>\n" +
                "              <div class=\"block__content\">\n" +
                "                <div class=\"articles articles__horizontal\">\n" +
                "                                      <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test10.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=59\"> What is Lorem Ipsum?</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=2\"> Программирование</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the ...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test7.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=58\"> SpaceX вывела в космос еще одну партию спутников Starlink</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">Американская компания Илона Маска SpaceX вывела на орбиту 60 интернет-спутников Starlink.Источник: S...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test6.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=57\"> Базз Лайтер на орбите и часы из метеорита</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">60-летие полета Юрия Гагарина в космос, регулярные информационные поводы от Илона Маска и Джеффа Без...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test5.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=55\"> Полет в космос с богатейшим человеком мира </a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">Место на космическом корабле New Shepard для полета в космос с богатейшим человеком мира Джеффом Без...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test2.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=3\"> НАСА научит астронавтов стирать одежду в космосе</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">НАСА объединилось с крупным производителем стирального порошка, чтобы разработать методы стирки одеж...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test3.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=2\"> Where can I get some?</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=2\"> Программирование</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alter...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test1.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=1\"> What is Lorem Ipsum?</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=2\"> Программирование</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the ...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                     \n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div class=\"block\">\n" +
                "              <a href=\"/articles.php?categorie=1\">Все записи</a>\n" +
                "              <h3>Космос [Новейшее]</h3>\n" +
                "              <div class=\"block__content\">\n" +
                "                <div class=\"articles articles__horizontal\">\n" +
                "\n" +
                "                                      <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test7.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=58\"> SpaceX вывела в космос еще одну партию спутников Starlink</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">Американская компания Илона Маска SpaceX вывела на орбиту 60 интернет-спутников Starlink.Источник: S...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test6.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=57\"> Базз Лайтер на орбите и часы из метеорита</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">60-летие полета Юрия Гагарина в космос, регулярные информационные поводы от Илона Маска и Джеффа Без...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test5.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=55\"> Полет в космос с богатейшим человеком мира </a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">Место на космическом корабле New Shepard для полета в космос с богатейшим человеком мира Джеффом Без...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test2.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=3\"> НАСА научит астронавтов стирать одежду в космосе</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">НАСА объединилось с крупным производителем стирального порошка, чтобы разработать методы стирки одеж...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                     \n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "\n" +
                "            <div class=\"block\">\n" +
                "              <a href=\"/articles.php?categorie=2\">Все записи</a>\n" +
                "              <h3>Программирование [Новейшее]</h3>\n" +
                "              <div class=\"block__content\">\n" +
                "                <div class=\"articles articles__horizontal\">\n" +
                "\n" +
                "                                      <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test10.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=59\"> What is Lorem Ipsum?</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=2\"> Программирование</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the ...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test3.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=2\"> Where can I get some?</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=2\"> Программирование</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alter...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                                        <article class=\"article\">\n" +
                "                      <div class=\"article__image\" style=\"background-image: url(/static/images/test1.jpg);\"></div>\n" +
                "                      <div class=\"article__info\">\n" +
                "                        <a href=\"/article.php?id=1\"> What is Lorem Ipsum?</a>\n" +
                "                        <div class=\"article__info__meta\">\n" +
                "                                                    <small>Категория: <a href=\"/articles.php?categorie=2\"> Программирование</a></small>\n" +
                "                        </div>\n" +
                "                        <div class=\"article__info__preview\">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the ...</div>\n" +
                "                      </div>\n" +
                "                    </article>\n" +
                "                     \n" +
                "\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </section>\n" +
                "          <section class=\"content__right col-md-4\">\n" +
                "            <div class=\"block\">\n" +
                "  <h3>Мы_знаем</h3>\n" +
                "  <div class=\"block__content\">\n" +
                "    <iframe style=\"background:transparent !important\" scrolling=\"no\" frameborder=\"0\" allowtransparency=\"true\" width=\"320\" height=\"320\" src=\"//ra.revolvermaps.com/w/6/a/c2.php?i=02op3nb0crr&amp;m=7&amp;s=320&amp;c=e63100&amp;cr1=ffffff&amp;f=arial&amp;l=0&amp;bv=90&amp;lx=-420&amp;ly=420&amp;hi=20&amp;he=7&amp;hc=a8ddff&amp;rs=80\"></iframe><script type=\"text/javascript\" src=\"//ra.revolvermaps.com/0/0/6.js?i=02op3nb0crr&amp;m=7&amp;s=320&amp;c=e63100&amp;cr1=ffffff&amp;f=arial&amp;l=0&amp;bv=90&amp;lx=-420&amp;ly=420&amp;hi=20&amp;he=7&amp;hc=a8ddff&amp;rs=80\" async=\"async\"></script>\n" +
                "  </div>\n" +
                "</div>\n" +
                "\n" +
                "<div class=\"block\">\n" +
                "  <h3>Топ читаемых статей</h3>\n" +
                "  <div class=\"block__content\">\n" +
                "    <div class=\"articles articles__vertical\">\n" +
                "\n" +
                "              <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(/static/images/test3.jpg);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=2\"> Where can I get some?</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "                            <small>Категория: <a href=\"/articles.php?categorie=2\"> Программирование</a></small>\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">There are many variations of passages of Lorem Ips...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "                <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(/static/images/test7.jpg);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=58\"> SpaceX вывела в космос еще одну партию спутников Starlink</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "                            <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">Американская компания Илона Маска SpaceX вывела на...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "                <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(/static/images/test5.jpg);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=55\"> Полет в космос с богатейшим человеком мира </a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "                            <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">Место на космическом корабле New Shepard для полет...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "                <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(/static/images/test2.jpg);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=3\"> НАСА научит астронавтов стирать одежду в космосе</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "                            <small>Категория: <a href=\"/articles.php?categorie=1\"> Космос</a></small>\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">НАСА объединилось с крупным производителем стираль...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "                <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(/static/images/test1.jpg);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=1\"> What is Lorem Ipsum?</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "                            <small>Категория: <a href=\"/articles.php?categorie=2\"> Программирование</a></small>\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">Lorem Ipsum is simply dummy text of the printing a...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "         \n" +
                "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>\n" +
                "<div class=\"block\">\n" +
                "  <h3>Комментарии</h3>\n" +
                "  <div class=\"block__content\">\n" +
                "    <div class=\"articles articles__vertical\">\n" +
                "\n" +
                "              <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(https://gravatar.com/avatar/a0400e6a9bf925baf4a6593f980171d5?s=125);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=55\"> Alex</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">Wow...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "                <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(https://gravatar.com/avatar/052022152af6c8d9995b33b3b29a953a?s=125);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=58\"> Александр</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">ываолфыафргщцдымоот...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "                <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(https://gravatar.com/avatar/30f26e7db49bb5cbd063c9191cf38bfd?s=125);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=2\"> Алекс</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">агаага\n" +
                "...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "                <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(https://gravatar.com/avatar/0df6d851acc1e0642ce3274b088d728a?s=125);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=2\"> Павел</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">Но зачем?...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "                <article class=\"article\">\n" +
                "          <div class=\"article__image\" style=\"background-image: url(https://gravatar.com/avatar/af0a1c0b3dd800dc783f1d6dad8ab6d9?s=125);\"></div>\n" +
                "          <div class=\"article__info\">\n" +
                "            <a href=\"/article.php?id=2\"> Лол</a>\n" +
                "            <div class=\"article__info__meta\">\n" +
                "            </div>\n" +
                "            <div class=\"article__info__preview\">Лол...</div>\n" +
                "          </div>\n" +
                "        </article>\n" +
                "         \n" +
                "\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>          </section>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "\n" +
                "    <footer id=\"footer\">\n" +
                "  <div class=\"container\">\n" +
                "    <div class=\"footer__logo\">\n" +
                "      <h1>Блог онлайн</h1>\n" +
                "    </div>\n" +
                "    <nav class=\"footer__menu\">\n" +
                "      <ul>\n" +
                "        <li><a href=\"/\">Главная</a></li>\n" +
                "        <li><a href=\"/pages/about_me.php\">Обо мне</a></li>\n" +
                "        <li><a href=\"http://vk.com/gorgulev2266 \">Я Вконтакте</a></li>\n" +
                "        <li><a href=\"/pages/copyright.php\">Правообладателям</a></li>\n" +
                "      </ul>\n" +
                "    </nav>\n" +
                "  </div>\n" +
                "</footer>  </div>\n" +
                "\n" +
                "\n" +
                "</body></html>");

    }
}