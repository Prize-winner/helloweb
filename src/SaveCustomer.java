import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 宁三水
 * @version 1.0
 * @descript ${PACKAGE_NAME}
 * @date 2019/6/10
 */
@WebServlet(name = "SaveCustomer",urlPatterns = "/saveCustomer")
public class SaveCustomer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        System.out.println(name+"---"+age);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
