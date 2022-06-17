package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.QuietServletException;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    String firstName = request.getParameter("first-name-input");
    String lastName = request.getParameter("last-name-input");
    String email = request.getParameter("email-input");

    // Get the value entered in the form.
    String question = request.getParameter("question-input");

    String postBody = String.format("Question: %s | First Name: %s | Last Name: %s | Email: %s", question, firstName, lastName, email);

    // Print the value so you can see it in the server logs.
    System.out.println("Submission: | " + postBody);

    response.sendRedirect("https://capable-sled-352202.appspot.com/");

    // Write the value to the response so the user can see it.
    // response.getWriter().println("You submitted: " + postBody);
  }
}