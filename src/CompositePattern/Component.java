package CompositePattern;

public abstract class Component {
    protected String name;
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void show(int depth);
}
