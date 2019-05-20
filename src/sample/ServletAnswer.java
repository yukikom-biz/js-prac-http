package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletAnswer")
public class ServletAnswer extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Answer is ..?</title></head></html>");
        out.println("<h1>Answer is ..</h1>");
        String ans = (String) request.getAttribute("ANS");
        if (ans.equals("3")){
            out.println("<p>Good answer</p>");
        }else {
            out.println("<p>Not Good Bat....</p><p>If possibly you should Go Back Page and Answer again.</p>");
            out.println("<a href=\"question.html\">Go Back</a>");
        }
        out.println("</body></html>");
    }
}
