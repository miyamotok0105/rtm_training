package Sample;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/forward")
public class ForwardSampleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("hello!!forward!!");
        out.print("</body>");
        out.print("</html>");
        resp.getWriter().append("Served at: ").append(req.getContextPath());

    }
}
