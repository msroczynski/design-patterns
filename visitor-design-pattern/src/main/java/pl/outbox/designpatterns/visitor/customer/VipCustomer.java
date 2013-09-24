package pl.outbox.designpatterns.visitor.customer;


public class VipCustomer extends Customer {
    @Override
    public <T> T accept(CustomerVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
