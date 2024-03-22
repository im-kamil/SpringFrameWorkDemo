package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("spring.xml");
//       doctor doctor = context.getBean(doctor.class);
//        Nurse nurse= context.getBean(Nurse.class);
//       doctor.assist();
//        nurse.assist();
         doctor doctor= context.getBean(doctor.class);
         doctor.assist();
         doctor.setQualification("MBBS");
        System.out.println(doctor);
//        Staff staff= context.getBean(Nurse.class);
//        doctor staff= context.getBean(doctor.class);
//        Nurse staff= context.getBean(Nurse.class);
        /* System.out.println(staff.getQualification()); */

    }
}
