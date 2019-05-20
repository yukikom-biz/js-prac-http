package Sesstion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletCustomer")
public class ServletCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String place = request.getParameter("place");
        String tell = request.getParameter("tell");

        HttpSession session = request.getSession(false);
        String isName = (String) session.getAttribute("name");

        if (session == null || isName == null) {
            //empty sesstion is not null.
            //sesstio,cookie n is file.
            session = request.getSession();
//            session.setAttribute("name",name);
//            session.setAttribute("place",place);
//            session.setAttribute("tell",tell);
            PlusBean plusBean = new PlusBean(name, place, tell);
            request.setAttribute("plus" , plusBean);

            out.println("<html><head><title>Sesstion</title></head></html>");
            out.println("<h1>done</h1>");
            out.println("<a href=\"http://localhost:8080/webAppTest_war_exploded/Sesstion/customer.html\">re load</a>");
            out.println("</body></html>");

            out.println("<p>name: " + plusBean.getName() + "</p>");
            out.println("<p>place: " + plusBean.getPlace() + "</p>");
            out.println("<p>tell: " + plusBean.getTell() + "</p>");
        }else{
//            session.setAttribute("name",name);
//            session.setAttribute("place",place);
//            session.setAttribute("tell",tell);

            out.println("<html><head><title>Sesstion</title></head></html>");
            out.println("<h1>already done</h1>");
            out.println("<a href=\"http://localhost:8080/webAppTest_war_exploded/Sesstion/customer.html\">re load</a>");
            out.println("</body></html>");

        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        PlusBean bean = (PlusBean) request.getAttribute("plus");

        out.println("<html><head><title>Sesstion</title></head></html>");

        if (session == null){
            out.println("<h1>Nothing is defined</h1>");
        }else {
//            String name = (String) session.getAttribute("name");
//            String place = (String) session.getAttribute("place");
//            String tell = (String) session.getAttribute("tell");

            out.println("<h1>info</h1>");
            out.println("<p>name: " + bean.getName() + "</p>");
            out.println("<p>place: " + bean.getPlace() + "</p>");
            out.println("<p>tell: " + bean.getTell() + "</p>");
            out.println("<h1>End of info</h1>");
        }


        out.println("<a href=\"http://localhost:8080/webAppTest_war_exploded/Sesstion/customer.html\">re load</a>");
        out.println("</body></html>");

    }
}
