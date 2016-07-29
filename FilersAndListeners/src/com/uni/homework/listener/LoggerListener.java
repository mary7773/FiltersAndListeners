package com.uni.homework.listener;

import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Application Lifecycle Listener implementation class LoggerListener
 *
 */
@WebListener
public class LoggerListener implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public LoggerListener() {
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent event)  { 
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent event)  { 
    	
    	HttpServletRequest request = (HttpServletRequest) event.getServletRequest();
    	
    	System.out.println("Local IP address is: " + request.getLocalAddr());
    	
    	System.out.println("Request type: " + request.getMethod());
    	
    	

    	HttpSession session = request.getSession();  	
    	System.out.println("Session ID: " +session.getId());
    	
    	Date date = new Date();
    	System.out.println("Date of the reuest: " + date.toString());
    }
	
}
