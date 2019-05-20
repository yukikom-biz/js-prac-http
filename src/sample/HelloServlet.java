package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")

public class HelloServlet extends HttpServlet {
    public static final long serialViersionUID = 1L;

    public HelloServlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("Server at:").append(req.getContextPath());
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>HelloServlet</title></head></html>");
        out.println("<h1>helloServlet</h1>");
        out.println("<h2 style=\"color:red\">Are You Ready??</h2>");
        out.println("</body></html>");
    }
}
