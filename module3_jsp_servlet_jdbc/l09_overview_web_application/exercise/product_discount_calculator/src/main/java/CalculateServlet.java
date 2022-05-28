import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateServlet", value = "/calculate")
public class CalculateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float dPercent = Float.parseFloat(request.getParameter("dPercent"));
        float dAmount = listPrice * dPercent * 0.01f;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2> Giá sản phẩm: " + listPrice+ "</h2>");
        writer.println("<h2> Chiếc khấu: " + dAmount + "</h2>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
