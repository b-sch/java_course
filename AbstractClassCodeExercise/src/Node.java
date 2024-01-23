public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightlink;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        rightlink = listItem;
        return rightlink;
    }

    @Override
    ListItem previous() {
        return leftlink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        leftlink = listItem;
        return leftlink;
    }

    @Override
    void compareTo(ListItem listItem) {
    }


}
