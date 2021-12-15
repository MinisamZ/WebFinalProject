package project.view;

import project.view.model.Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class Session {


    public String checkAccess(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Member access = (Member) session.getAttribute("member");
        String str = "";

        if (access != null) {
            str += "<li><a href=\" \" >\"" + access.getUname() + "\"</a></li>\n" +
                    "<li><a href=\"/logout\" >Выход</a></li>";

        } else {
            str += "<li><a href=\"/login\" >Войти</a></li>\n" +
                    "<li><a href=\"/register\" >Зарегестрироваться</a></li>\n";
        }

        return str;
    }
}
