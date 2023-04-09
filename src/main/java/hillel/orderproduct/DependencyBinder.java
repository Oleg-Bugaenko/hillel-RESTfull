package hillel.orderproduct;

import hillel.orderproduct.service.OrderRepository;
import hillel.orderproduct.service.OrderService;
import jakarta.inject.Singleton;
import org.glassfish.jersey.internal.inject.AbstractBinder;

public class DependencyBinder extends AbstractBinder {

    @Override
    protected void configure() {
        bind(OrderRepository.class)
                .to(OrderService.class)
                .in(Singleton.class);
    }
}
