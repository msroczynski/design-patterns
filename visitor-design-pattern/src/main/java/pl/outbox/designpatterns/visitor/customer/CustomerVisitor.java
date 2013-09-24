package pl.outbox.designpatterns.visitor.customer;

public interface CustomerVisitor<T> {
    T visit(NormalCustomer customer);
    T visit(VipCustomer customer);
    T visit(GroupCustomer customer);
}