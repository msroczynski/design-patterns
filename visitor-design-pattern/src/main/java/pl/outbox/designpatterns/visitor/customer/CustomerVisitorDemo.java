package pl.outbox.designpatterns.visitor.customer;

import pl.outbox.designpatterns.visitor.customer.*;

public class CustomerVisitorDemo {
    public static void main(String[] args) {
           VipCustomer customer = new VipCustomer();
           System.out.println(new LetterService().generateInvitationLetter(customer));
    }
}