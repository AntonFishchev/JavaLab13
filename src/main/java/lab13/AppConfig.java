//package lab13;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//
//@Configuration
//@ComponentScan ("lab13")
//public class AppConfig {
//
//    @Bean(name = "productService")
//    public ProductService productService () {
//        return new ProductService();
//    }
//
//    @Bean(name = "cart")
//    public Cart cart () {
//        return new Cart();
//    }
//
//    @Bean(name = "orderService")
//    public OrderService orderService () {
//        Cart cart = new Cart();
//        return new OrderService(cart);
//    }
//
//}
