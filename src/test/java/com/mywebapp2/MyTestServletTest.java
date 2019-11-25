package com.mywebapp2;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class MyTestServletTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @org.junit.Test
    public void myStatus() {

        MyTestServlet myt = new MyTestServlet();
        String str = myt.myStatus();
        assertEquals(str,"ACTIVE");

    }

   /* @org.junit.Test
    public void doGet() throws ServletException, IOException{
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

       when(response.getWriter()).thenReturn(pw);

        MyTestServlet myt = new MyTestServlet();
        myt.doGet(request, response);
        String result = sw.getBuffer().toString().trim();
        System.out.println(result);
        assertEquals(result,"My first servlet call - GET");


    }*/
}