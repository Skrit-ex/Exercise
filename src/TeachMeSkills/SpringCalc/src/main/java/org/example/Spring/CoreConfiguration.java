package org.example.Spring;

import org.example.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "org.example")
public class CoreConfiguration {

//@Bean
//public Application consoleApplication(ConsoleWriter consoleWriter,
//                                      ConsoleReader consoleReader,
//                                      OperationService operationService){
//    return new ConsoleApplication(consoleWriter,consoleReader,operationService);
//}
//@Bean
//    public ConsoleReader consoleReader(){
//    return new ConsoleReader();
//}
//@Bean
//    public ConsoleWriter consoleWriter(){
//    return new ConsoleWriter();
//}
@Bean
    public Scanner scanner(){
    return new Scanner(System.in);
}
//@Bean
//    public OperationStorage operationStorage(){
//    return new InMemoryStorage();
//}
//@Bean
//    public OperationService operationService(OperationStorage operationStorage){
//    return new OperationService(operationStorage);
//}

}
