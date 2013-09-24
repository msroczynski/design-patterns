package pl.outbox.designpatterns.visitor.car;

class Engine implements CarElement {
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}