import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculator", urlPatterns = {"/calculation"})
public class ServletCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float sum1 = Float.parseFloat(request.getParameter("sum1"));
        float sum2 = Float.parseFloat(request.getParameter("sum2"));
        char operator = request.getParameter("operator").charAt(0);
        float result = 0;
        switch (operator){
            case '+':
                result = sum1 + sum2;
                break;
            case '-':
                result = sum1 - sum2;
                break;
            case '*':
                result = sum1 * sum2;
                break;
            case '/':
                try {
                    result = sum1 / sum2;
                }catch (ArithmeticException e){
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("!!!");
        }
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Result: " + result);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
