package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Simple Hello World servlet class. All servlets must extend HttpServlet
 * Notice we are using Annotations instead of web.xml
 */

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    // Just send to the GET handler
    doGet(request, response);
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    response.setHeader("Cache-Control", "no-cache");
    response.setContentType("text/plain");
    PrintWriter out = response.getWriter();

    // Get request param
    String parameter = request.getParameter("id");

    // Get context param (from web.xml)
    String version = getServletContext().getInitParameter("version");

    out.println("Hello World:  id=" + parameter);
    out.println("Version: " + version);
  }

}