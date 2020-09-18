package just.hazard.springboot.entity;

public class Hateoas {

    private String prefix;

    private String name;

    @Override
    public String toString() {
        return "Hateoas{" +
                "prefix='" + prefix + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
