import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("user") != null){
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);

        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean alreadyLoggedIn = false;
        boolean validAttempt = username.equals("admin") && password.equals("password");
        if(validAttempt){
           session.setAttribute("user", username);
           session.setAttribute("alreadyLoggedIn", alreadyLoggedIn);
            response.sendRedirect("/profile");
        }else{
            response.sendRedirect("/login");
        }

    }


}
