import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleLoginServlet",urlPatterns = "/login")
public class SimpleLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("user");
        String password=request.getParameter("pass");
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        if(username.equals("admin")&&password.equals("123456")){
            printWriter.println("<h1>Welcome "+username+"</h1>");
        }else{
            printWriter.println("<h1>Login error</h1>");
        }
        printWriter.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("user");
        String password=request.getParameter("pass");
        PrintWriter printWriter=response.getWriter();
        printWriter.println("<html>");
        if(username.equals("admin")&&password.equals("123456")){
            printWriter.println("<h1>Welcome "+username+"</h1>");
        }else{
            printWriter.println("<h1>Login error</h1>");
        }
        printWriter.println("</html>");
    }
}
