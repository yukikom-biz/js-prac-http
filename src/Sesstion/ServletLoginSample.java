package Sesstion;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ServletLoginSample")
public class ServletLoginSample extends HttpServlet {
    private static final String PASS = "jack";
    private static final String USER = "jack";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter isCheckStatus = response.getWriter();
        isCheckStatus.println("POST: ok");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");
        if (action.equals("login")){
            String name = request.getParameter("name");
            String passWord = request.getParameter("pw");
            if (name.equals(USER)&&passWord.equals(PASS)){
                HttpSession session = request.getSession();
                session.setAttribute("isLogin","true");
                out.println("<html><head><title>Login</title></head></html>");
                out.println("<h1>ok</h1>");
                out.println("</body></html>");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter isCheckStatus = response.getWriter();
        isCheckStatus.println("GET: ok");
    }
}
