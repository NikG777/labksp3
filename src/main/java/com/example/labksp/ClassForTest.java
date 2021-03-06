package com.example.labksp;

import com.example.labksp.Hobby.Hobby;
import com.example.labksp.Hobby.HobbyRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
//класс для теста
@Service
@EnableAutoConfiguration
public class ClassForTest {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ClassForTest.class);
        HobbyRepository repository = context.getBean(HobbyRepository.class);

        // save a couple of customers
       // repository.save(new Places("Mirea", "Mirea","Mirea"));
       // repository.save(new Places("Mirea1", "Mirea1","Mirea1"));


        // fetch all customers
        Iterable<Hobby> placess = repository.findAll();

        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Hobby hobby : placess) {
            System.out.println(hobby);
        }
        System.out.println();
        long is = 1;
//         Places customer = repository.findById(is);
//        repository.findByName("Mirea1");
////        System.out.println("Customer found with findOne(1L):");
////        System.out.println("--------------------------------");
//           System.out.println(customer.toString());
//        System.out.println(repository.findByName("Mirea1"));
//        System.out.println();

    }
}
