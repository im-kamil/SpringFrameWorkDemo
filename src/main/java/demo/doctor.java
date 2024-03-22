package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope(scopeName="prototype")
public class doctor implements Staff , BeanNameAware {
    @Override
    public String toString() {
        return "doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    //    private String qualification;
//    public String getQualification() {
//        return qualification;
//    }
//    public  doctor(String qualification) {
//        this.qualification = qualification;
//    }
    private String qualification;
    public void assist(){
        System.out.println("Doctor is assisting");

    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SetBeanName method is called");
    }
}

