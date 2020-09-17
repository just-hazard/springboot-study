package just.hazard.springboot;

import just.hazard.springboot.listener.StartingListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);
        springApplication.addListeners(new StartingListener());
        springApplication.run(args);
//        Tomcat tomcat = new Tomcat();
//        tomcat.setPort(8080);
//
//        Context context = tomcat.addContext("/", "/");
//
//        HttpServlet servlet = new HttpServlet() {
//            @Override
//            protected void doGet(HttpServletRequest re q, HttpServletResponse resp) throws ServletException, IOException {
//                PrintWriter writer = resp.getWriter();
//                writer.println("<html><head><title>");
//                writer.println("Hi");
//                writer.println("</title></head>");
//                writer.println("<body><h1>justhis</h1></body>");
//                writer.println("</html>");
//            }
//        };
//        String servletName = "justhis";
//        tomcat.addServlet("/",servletName,servlet);
//        context.addServletMappingDecoded("/hello",servletName);
//
//        tomcat.start();
//        tomcat.getServer().await();

    }

}
