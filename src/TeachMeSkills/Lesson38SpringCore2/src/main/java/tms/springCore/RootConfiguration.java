package tms.springCore;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "tms.springCore")
@EnableAspectJAutoProxy
public class RootConfiguration {
}
