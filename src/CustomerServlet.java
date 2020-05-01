import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList=DBUtils.getList();
        request.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/jsps/displayListCustomer.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList=DBUtils.getList();
        request.setAttribute("customerList",customerList);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/jsps/displayListCustomer.jsp");
        requestDispatcher.forward(request,response);
    }
}
