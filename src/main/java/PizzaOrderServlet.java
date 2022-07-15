import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        request.getRequestDispatcher("/pizza-order.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String pepperoni = request.getParameter("pepperoni");
        String ham = request.getParameter("ham");
        String sausage = request.getParameter("sausage");
        String pineapple = request.getParameter("pineapple");
        String jalapenos = request.getParameter("jalapenos");

        ArrayList<String> toppings = new ArrayList<>();
        if(pepperoni != null){
            toppings.add(pepperoni);
        }
        if(ham != null){
            toppings.add(ham);
        }
        if(sausage != null){
            toppings.add(sausage);
        }
        if(pineapple != null){
            toppings.add(pineapple);
        }
        if(jalapenos != null){
            toppings.add(jalapenos);
        }
        System.out.println("Crust: " + crust + "; \nSauce: " + sauce + ";\nSize: " +   size + ";\nToppings: " +   toppings);

    }
}
