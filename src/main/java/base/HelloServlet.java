package base;

import model.User;

import java.io.*;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/servlet-1")
public class HelloServlet extends HttpServlet {
    private final List<User> users = new ArrayList<>();


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        int id = Integer.parseInt(request.getParameter("id"));
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = new User.Builder()
                .setId(id)
                .setLogin(login)
                .setPassword(password)
                .build();
        if (!users.contains(user)) { users.add(user); }




        PrintWriter pw = response.getWriter();
        pw.println("<html>");

        for (User user1 : users) {
            pw.println(user1);
            pw.println("</br>");
        }
        pw.println("</html>");
    }



    public void destroy() {
    }
}