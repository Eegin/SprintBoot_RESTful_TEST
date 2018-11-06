package hello;

public class Greeting {
    private final long id;
    private final String content;
    private String type;
    private Value value;

    public Greeting(long id, String content)
    {
        this.id = id;
        this.content = content;
        this.value = new Value();
        value.setId(id);
        value.setQuote(content);
    }

    public long getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
