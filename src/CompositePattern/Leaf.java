package CompositePattern;

public class Leaf extends Component {
    private String name;

    Leaf(String name){
        this.name = name;
    }


    public void add(Component component){
        System.out.println("叶子节点无法继续添加新的节点！");
    }

    public void remove(Component component){
        System.out.println("叶子节点无法继续删除节点！");
    }

    public void show(int depth){
        System.out.println(repeat("-",depth)+name);
    }

    public String repeat(String str,int count){
        String finalStr = "";
        for(int i=0;i<count;i++){
            finalStr += str;
        }
        return finalStr;
    }
}
