package sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet("/PostPayment")
public class PostPayment extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.println("Post: ok");

        String payment = request.getParameter("pay");
        String[] snsVals = request.getParameterValues("SNS");

        String selectedPayment;
        selectedPayment = Objects.requireNonNullElse(payment, "is Null");

        StringBuilder selectedSnss = new StringBuilder();
        if(snsVals == null){
            selectedSnss = new StringBuilder("is null");
        }else {
            for (String snsVal : snsVals) {
                selectedSnss.append(snsVal);
            }
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Payments</title></head></html>");
        out.println("<h1>Payments</h1>");
        out.println("<h2 style=\"color:red\">Are You Ready??</h2>");
        out.println("<h2 style=\"color:red\">" +  selectedPayment + "</h2>" );
        out.println("<h2 style=\"color:red\">" + selectedSnss + "</h2>" );
        out.println("</body></html>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("GET: ok");
    }
}
