package com.kevintest.log;

import java.io.IOException;  

import javax.servlet.ServletConfig;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import org.apache.log4j.Logger;  

/** 
 * Servlet implementation class Log4JTestServlet 
 */  
@WebServlet("/Log4JTestServlet")  
public class Log4JTestServlet extends HttpServlet {  
    private static final long serialVersionUID = 1L;  
   // private static Logger logger = Logger.getLogger(Log4JTestServlet.class);    
    private static Logger logger=Logger.getLogger(Log4JTestServlet.class);

    /** 
     * @see HttpServlet#HttpServlet() 
     */  
    public Log4JTestServlet() {  
        super();  
    }  

    /** 
     * @see Servlet#init(ServletConfig) 
     */  
    public void init(ServletConfig config) throws ServletException {  
    }  

    /** 
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response) 
     */  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        
    	logger.debug("This is debug message.");    
        logger.info("This is info message.");    
        logger.error("This is error message."); 

    }  

    /** 
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
     */  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        doGet(request,response);  
    }  

}