package MVC;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletCircle")
public class ServletCircle extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("html/");
        String radius = request.getParameter("radius");
        String calcType = request.getParameter("calcType");

        int radiusInt = Integer.parseInt(radius);
        double result = 0d;
//        Circle circle = new Circle(radiusInt,calcType);

//        Calc calc = new Calc();
        if (calcType.equals("cL")){
            result = Calc.calcLength(radiusInt);
        }else if (calcType.equals("cS")){
            result = Calc.calcSurface(radiusInt);
//        }else {
//            result
        }

        Circle circle = new Circle(radiusInt, calcType, result);
        request.setAttribute("circle",circle);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/MVC/circleResult.jsp");
        requestDispatcher.forward(request,response);
    }

//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
