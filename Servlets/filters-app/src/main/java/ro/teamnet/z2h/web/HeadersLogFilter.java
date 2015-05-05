/**
 * HeadersLogFilter.java
 *
 * Copyright (c) 2014 Teamnet. All Rights Reserved.
 *
 * This source file may not be copied, modified or redistributed,
 * in whole or in part, in any form or for any reason, without the express
 * written consent of Teamnet.
 **/

package ro.teamnet.z2h.web;


import ro.teamnet.z2h.file.LogFileWriter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

public class HeadersLogFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * This filter  logs current request headers to filesystem
     * @param request - Client request
     * @param response - Client response
     * @param chain - Filters chain
     * @throws IOException
     * @throws ServletException
     */

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //TODO completeaza cu cod astfel incat sa poti loga headerele de pe request intr-un fisier.
        // Clasa care va scrie intr-un fisier de log este LogFileWriter metoda   logHeader
        Enumeration<String> en=request.getParameterNames();

        while(en.hasMoreElements()){
            String s1=(String)en.nextElement();
            String val=request.getParameter(s1);
            LogFileWriter.logHeader(s1,val);
        }

        chain.doFilter(request, response);
    }


    public void destroy() {

    }
}
