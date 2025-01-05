import java.util.ArrayList;
class MinStack {
    ArrayList<Integer> list;
    ArrayList<Integer> list1;
    public MinStack() {
        list = new ArrayList<>();
        list1 = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
        if (list1.isEmpty() || list1.get(list1.size() - 1) >= val) {
            list1.add(val);
        }
    }
    
    public void pop() {
        int n = list.size() - 1;
        if (list.get(n).equals(list1.get(list1.size() - 1))) {
            list1.remove(list1.size() - 1);
        }
        list.remove(n);
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        return list1.get(list1.size() - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */