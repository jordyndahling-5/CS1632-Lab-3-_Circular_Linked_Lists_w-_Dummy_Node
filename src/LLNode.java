public class LLNode<T> {
    protected T data;
    protected LLNode<T> next;
    private LLNode() {}
    public LLNode(T d) { data = d; next = null;}
    public LLNode(T d, LLNode<T> n) {
        data = d;
        next = n;
    }
    public T getData() {
        return data;
    }
    public LLNode<T> getNext() {
        return next;
    }
    public void setData(T d) {
        data = d;
    }
    public void setNext(LLNode<T> n) {
        next = n;
    }
}
