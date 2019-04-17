package org.katheer.test;

import org.katheer.bean.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        @Autowired annotation --> byType
        --------------------------------
        @Autowired used above properties and methods.
        This annotation internally uses byType mechanism only.
        If two beans with same type exists, we will get exception.

        To overcome this issue @Qualifier is used.
        @Qualifier can be used before properties, arguments and setter methods.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("org" +
                "/katheer/resource/applicationContext.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
        emp1.showEmployeeDetails();
    }
}
