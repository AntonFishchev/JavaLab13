package lab13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ProductService productService = context.getBean("productService", ProductService.class);
        //productService.printAll();
        Cart cart = context.getBean("cart", Cart.class);

        cart.add(productService.findByTitle("Молоко"));
        cart.add(productService.findByTitle("Сыр"));
        cart.add(productService.findByTitle("Яица"));
        cart.add(productService.findByTitle("Пельмени"));
        cart.add(productService.findByTitle("Хлеб"));

        OrderService orderService = context.getBean("orderService", OrderService.class);
        orderService.order();
    }
}
