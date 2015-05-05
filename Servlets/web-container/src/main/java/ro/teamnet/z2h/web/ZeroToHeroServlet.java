/**
 * ZeroToHeroServlet.java
 *
 * Copyright (c) 2014 Teamnet. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 **/

package ro.teamnet.z2h.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ZeroToHeroServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
<<<<<<< HEAD
        String res=handleRequest(req);
        PrintWriter out = resp.getWriter();
        out.println(res);

    }

    private String handleRequest(HttpServletRequest req){
        String x = req.getParameter("first");
        String y = req.getParameter("last");
        String response="Hello <b>"+x+" "+y+"</b>! Enjoy Zero To Hero!!!";

        return response;
=======
        resp.getWriter().write(handleRequest(req));
    }

    private String handleRequest(HttpServletRequest req){
        return "Hello <b> "+ req.getParameter("firstName") +" "+ req.getParameter("lastName") +"</b>! Enjoy Zero To Hero!!!";
>>>>>>> a1fa891976324a8f77438521b9887049a5988bb4
    }

}
