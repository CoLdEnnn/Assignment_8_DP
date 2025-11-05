package hero;

public class Builder {
    String name;
    int role;

    public Builder name(String name) {
        this.name = name;
        return this;
    }
    public Builder role(int role) {
        this.role = role;
        return this;
    }
    public Hero build() {
        return new Hero(this);
    }
}
