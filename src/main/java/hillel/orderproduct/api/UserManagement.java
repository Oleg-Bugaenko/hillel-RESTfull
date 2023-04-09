package hillel.orderproduct.api;

import hillel.orderproduct.entity.Order;
import hillel.orderproduct.service.OrderService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("orders")
public class UserManagement {

    @Inject
    private OrderService orderService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Order getOrderById(@PathParam("id") Integer id){
        return orderService.getOrderById(id);
    }

    @POST
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public void addOrder(Order order) {
        orderService.addOrder(order);
    }



}
