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
        assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
	}

	@Test
	public void testViewValue() throws Exception
	{		
        HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertNotNull("view model", modelAndView.getModel());
        String nowValue = (String) modelAndView.getModel().get("now");
        assertNotNull("view value \"now\"", nowValue);
    }

}
