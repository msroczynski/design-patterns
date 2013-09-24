package pl.outbox.designpatterns.visitor.car;

interface CarElement {
    void accept(CarElementVisitor visitor);
}