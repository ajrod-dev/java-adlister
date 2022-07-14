import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet{

    private int counter;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String count = req.getParameter("reset");
        if(count == null){
            counter++;
        }else {
            counter = 0;
            res.sendRedirect("/count");
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Page count: " + counter);


    }

}
