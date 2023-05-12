package com.tmf.inventory.SpringHibernateIntegrationBackend;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tmf.inventory.SpringHibernateIntegrationBackend.config.SessionFactoryConfig;
import com.tmf.inventory.SpringHibernateIntegrationBackend.models.Course;
import com.tmf.inventory.SpringHibernateIntegrationBackend.services.CourseService;
import com.tmf.inventory.SpringHibernateIntegrationBackend.services.CourseServiceImplementation;

public class App 
{
	public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SessionFactoryConfig.class);
        CourseService service = ctx.getBean(CourseServiceImplementation.class);
        
        
        
        
        
        
    }
}
