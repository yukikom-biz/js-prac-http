package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletRequestConfirmation")
public class ServletRequestConfirmation extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTf-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>RequestInfo</title></head></html>");
        out.println("<h1>RequestInfo</h1>");
        out.println("<h2 style=\"color:red\">Are You Ready??</h2>");
        out.println("<input type=\"Submit\" value=\"Off Course\">");
        out.println("<h1>Request Information</h1>");

        //Info
        out.println("remote IP: " + request.getRemoteAddr());
        out.println("<br>");

        out.println("request URL: " + request.getRequestURL());
        out.println("<br>");

        out.println("HTTP: " + request.getMethod());
        out.println("<br>");

        out.println("Agent: " + request.getHeaders("User-Agent"));
        out.println("<br>");

        out.println("Accept Files: " + request.getHeaders("Accept"));
        out.println("<br>");

        out.println("Accept Language: " + request.getHeaders("Accept-Language"));
        out.println("<br>");

        out.println("Referer: " + request.getHeaders("Referer"));
        out.println("<br>");


        out.println("</body></html>");
    }
}
