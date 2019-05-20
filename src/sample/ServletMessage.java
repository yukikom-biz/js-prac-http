package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletMessage")
public class ServletMessage extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String messageBody = request.getParameter("message-body");
        String fontSize = request.getParameter("font-size"); //BIG,MID,SML

        out.println("<html><head><title>Message</title></head></html>");
        out.println("<h1>Message</h1>");
        out.println("<h2 style=\"color:red\">Are You Ready??</h2>");

        out.println("<h1>MessageBody</h1>");
        switch (fontSize){
            case "BIG":
                out.println("<h1>");
                out.println(messageBody);
                out.println("</h1>");
                break;
            case "MID":
                out.println("<h3>");
                out.println(messageBody);
                out.println("</h3>");
                break;
            case "SML":
                out.println("<h5>");
                out.println(messageBody);
                out.println("</h5>");
                break;
        }
        out.println("</body></html>");
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
