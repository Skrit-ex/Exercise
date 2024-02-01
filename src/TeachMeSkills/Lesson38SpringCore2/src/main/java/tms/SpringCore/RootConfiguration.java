package tms.SpringCore;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "tms.SpringCore")
@EnableAspectJAutoProxy
public class RootConfiguration {
}
