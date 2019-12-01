package CompositePattern;


public class Client {
    public static void main(String[] args) {
        Branch root = new Branch("根");
        root.add(new Leaf("叶子"));

        Branch branch1 = new Branch("树枝");
        branch1.add(new Leaf("叶子"));
        branch1.add(new Leaf("叶子"));

        Branch branch2 = new Branch("树枝");
        branch2.add(new Leaf("叶子"));
        branch2.add(new Leaf("叶子"));

        Branch branch3 = new Branch("树枝");
        branch3.add(new Leaf("叶子"));
        branch3.add(new Leaf("叶子"));

        branch1.add(branch2);
        branch1.add(branch3);

        root.add(branch1);

        root.show(1);
    }
}
