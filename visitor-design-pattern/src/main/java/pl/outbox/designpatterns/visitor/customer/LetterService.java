package pl.outbox.designpatterns.visitor.customer;

public class LetterService implements CustomerVisitor<Letter> {
    @Override
    public Letter visit(NormalCustomer customer) {
        return new Letter("Hello customer!", "This is a invitation letter for the normal customer.");
    }

    @Override
    public Letter visit(VipCustomer customer) {
        return new Letter("Hello VIP customer!", "This is a invitation letter for the VIP customer.");
    }

    @Override
    public Letter visit(GroupCustomer customer) {
        return new Letter("Hello Group customer!", "This is a invitation letter for the group customer.");
    }

    public Letter generateInvitationLetter(Customer customer){
        return customer.accept(this);
    }

}
