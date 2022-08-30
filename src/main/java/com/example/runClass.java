package com.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

public class runClass {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8000);
        tomcat.getConnector();
        Context context = tomcat.addContext("",null);
        Wrapper servlet =  Tomcat.addServlet(context,"servletText",new servletText());
        servlet.setLoadOnStartup(1);
        servlet.addMapping("");
        tomcat.start();
    }
}
