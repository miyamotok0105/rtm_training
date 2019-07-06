package Sample.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//import java.io.PrintWriter;
import Sample.model.Health;
import Sample.model.HealthCheckLogic;

@WebServlet("/healthCheck")
public class HealthCheck extends HttpServlet {
    @Override

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do get!!!!!!!!!!!");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
        dispatcher.forward(req, resp);
        resp.getWriter().append("Served at: ").append(req.getContextPath());

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("do post!!!!!!!!!!!");

        String weight = req.getParameter("weight");
        String height = req.getParameter("height");
        Health health = new Health();
        health.setHeight(Double.parseDouble(height));
        health.setWeight(Double.parseDouble(weight));

        HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
        healthCheckLogic.execute(health);

        //リクエストスコープにオブジェクトを保存。
        req.setAttribute("health", health);
        //ページを表示
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
        dispatcher.forward(req, resp);
//        resp.getWriter().append("Served at: ").append(req.getContextPath());
    }

}
