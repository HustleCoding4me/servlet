package hello.servlet.basic.request;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;

@WebServlet(name="requestParamServlet",urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(" 전체 파라미터 조회  start= ");

        req.getParameterNames().asIterator().forEachRemaining(name -> System.out.println(name + "=" + req.getParameter(name)));

        System.out.println(" 전체 파라미터 조회 end= ");

        System.out.println("[단일 파라미터 조회] start");
        String age = req.getParameter("age");
        System.out.println("age = " + age);

    }
}
