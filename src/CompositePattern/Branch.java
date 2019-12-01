package CompositePattern;

import java.util.ArrayList;

public class Branch extends Component {
    ArrayList<Component> components = new ArrayList<Component>();

    private String name;

    Branch(String name){
        this.name = name;
    }

    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component){
        components.remove(component);
    }

    public void show(int depth){
        System.out.println(repeat("-",depth)+name);
        for (Component component:components){
            component.show(depth+3);
        }
    }

    public String repeat(String str,int count){
        String finalStr = "";
        for(int i=0;i<count;i++){
            finalStr += str;
        }
        return finalStr;
    }
}
