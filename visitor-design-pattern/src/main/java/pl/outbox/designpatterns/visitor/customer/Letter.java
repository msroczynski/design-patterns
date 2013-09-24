package pl.outbox.designpatterns.visitor.customer;


public class Letter {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String title;
    private String description;

    public Letter(String title, String description) {
        setTitle(title);
        setDescription(description);
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getDescription();
    }


}
