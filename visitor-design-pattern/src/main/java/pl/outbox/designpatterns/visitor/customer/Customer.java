package pl.outbox.designpatterns.visitor.customer;


public abstract class Customer {

    public abstract <T> T accept(CustomerVisitor<T> visitor);

}