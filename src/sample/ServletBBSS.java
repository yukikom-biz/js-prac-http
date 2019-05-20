package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/ServletBBSS")
public class ServletBBSS extends HttpServlet {
    private ArrayList<String> messages;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String message = request.getParameter("message");

        if (messages==null){
            messages = new ArrayList<String>();
        }

        messages.add(message);

        out.println("<html><head><title>BBSS</title></head></html>");

        out.println("<h1>Message</h1>");
        out.println("<form action=\"ServletBBSS\" method=\"post\">" +
                "    <textarea name=\"message\" id=\"non\" cols=\"30\" rows=\"10\">input some message</textarea>" +
                "    <input type=\"submit\" value=\"Send\">" +
                "</form>");

        for (String mes : messages) {
            if (mes == null){
                out.println("<p>No Message</p>");
            }else {
                out.println("<p>" + mes + "</p>");
                out.println("<hr><br>");
            }
        }

        out.println("</body></html>");

    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
