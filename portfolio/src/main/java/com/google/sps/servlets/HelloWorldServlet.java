package com.google.sps.servlets;

import java.io.IOException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/fact")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    response.setContentType("text/html;");

    ArrayList<String> facts = new ArrayList<String>();
    facts.add("I am the Director of SWE at Baruch AIS at Baruch College");
    facts.add("I started coding during the COVID-19 pandemic");
    facts.add("I was the Google Developer Student Club President at Baruch College");
    facts.add("My favorite languages to code in are Python and JavaScript");
    facts.add("I am a Software Engineer Intern at SeatGeek");
    facts.add("I love to play PC games such as Valorant or League of Legends");
    facts.add("I love to develop games for fun");
    facts.add("I have won 2 hackathons");
    facts.add("React is my favorite JavaScript framework");
    facts.add("My dream job is to be working as a Software Engineer at Google :)");
    facts.add("My first programming language was Java");

    String json = new Gson().toJson(facts);

    response.getWriter().println(json);
  }
}
