package javakurs;

public class MainList {
    private Element head, end;

    private static class Element {
        private Object obj;
        private Element next;
    }

    public void add(Object obj) {
        if(obj == null) return;

        Element neu = new Element();
        neu.obj = obj;

        if(head == null) head = end = neu;
        else {
            end.next = neu;
            end = neu;
        }
    }

    public Iterator iterator() {
        class IteratorImpl implements Iterator {
            private Element e = head;

            @Override
            public boolean hasNext() {
                return e != null;
            }

            @Override
            public Object next() {
                if(e == null) return null;

                Object obj = e.obj;
                e = e.next;

                return obj;
            }
        }

        return new IteratorImpl();
    }
}
