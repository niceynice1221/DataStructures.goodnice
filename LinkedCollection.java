public class LinkedCollection {
    private int size;
    private LinkedNode first;

    private static class LinkedNode {
        Object element;
        LinkedNode next;

        public LinkedNode(Object obj, LinkedNode node) {
            this.element = obj;
            this.next = node;
        }
    }

    public LinkedCollection() {
        size = 0;
        first = null;
    }

    int size() {
        return size;
    }

    public void addF(Object obj) {
        // first = new LinkedNode(obj, first);
        LinkedNode p = new LinkedNode(obj, null);
        p.next = first;
        first = p;
        size++;
    }

    public String toString() {
        String ans = "";
        LinkedNode p = this.first;
        while (p != null) {
            ans = ans + p.element + ", ";
            p = p.next;
        }
        return ans;
    }

    public void addL(Object obj){
      LinkedNode node = new LinkedNode(obj , null);
      if(first == null)
      {
        first = node;
      }
      else
      {
        LinkedNode p = this.first;
        while(p.next != null)
        {
          p = p.next;
        }
       p.next = node;
      }
      size++;
  }
   
  public boolean contains(Object obj)
    {
      LinkedNode p = this.first;
        while(p !=null )
        {
          if(p.element.equals(obj))
          {
             return true;

          }
           p = p.next;
         }
      return  false;
     }

     public boolean isEmpty(){
       if(first == null)
       {
         return true;
       }
       return false;
     }

     public void remove(Object obj)
     {
       LinkedNode p = this.first;
       if(p.element.equals(obj))
       {
         first = p.next;
         size--;
       }
       else
       {
           while(p.next != null && !p.next.element.equals(obj))
           {
             p = p.next;
           }
           if(p.next != null)
           {
             p.next = p.next.next;
             size--;
           }
           else
           {
             System.out.println("no such data");
           }
       }
     }

}



