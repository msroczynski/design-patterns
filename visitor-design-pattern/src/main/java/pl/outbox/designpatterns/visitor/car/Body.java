package pl.outbox.designpatterns.visitor.car;

class Body implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}