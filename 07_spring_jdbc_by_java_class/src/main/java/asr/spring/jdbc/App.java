package asr.spring.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import asr.spring.jdbc.entity.Address;
import asr.spring.jdbc.entity.Student;
import asr.spring.jdbc.service.StudentServiceImpl;

@ComponentScan(basePackages="asr.spring.jdbc")
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        StudentServiceImpl studentService = context.getBean(StudentServiceImpl.class);
        
        //Insert new record into data base 
        
//        Address address=new Address("Phq wali gali","Jaipur",302012,"Rajasthan","India");
//        String[] sub= {"english","hindi","science","math","physics"};
//        Student student=new Student("Anish",25,sub,address) ;
//        
//        
//        String response = studentService.saveStudent(student);
//        
//        System.out.println(response);
        
        
        //Get student object using studentId
        
//        Student student = studentService.getStudent(1);
//        System.out.println(student);
        
    }
}
