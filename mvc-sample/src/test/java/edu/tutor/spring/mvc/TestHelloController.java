package edu.tutor.spring.mvc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class TestHelloController
{

	@Test
	public void testDefaultViewName() throws Exception
	{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
	}

}
