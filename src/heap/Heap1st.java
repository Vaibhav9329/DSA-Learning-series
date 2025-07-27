package heap;

import java.util.ArrayList;

public class Heap1st {
    public static void main(String[] args) throws Exception {
        Heap<Integer> hp = new Heap<>();

        hp.insert(34);
        hp.insert(45);
        hp.insert(22);
        hp.insert(89);
        hp.insert(76);

        ArrayList list = hp.heapSort();
        System.out.println(list);

//        System.out.println(hp.remove());
//        System.out.println(hp.remove());
//        System.out.println(hp.remove());
//        System.out.println(hp.remove());
//        System.out.println(hp.remove());

    }
}

class Heap<I extends Comparable> {
        private ArrayList<I> list;

        public Heap(){
            list  = new ArrayList<>();
        }

        private void swap(int first, int second){
            I temp = list.get(first);
            list.set(first, list.get(second));
            list.set(second, temp);
        }

        private int parent(int index){
            return (index - 1)/2;
        }
        private int left(int index){
            return (index * 2+1);
        }
        private int right(int index){
            return (index*2+2);
        }

        public void insert(I value){
            list.add(value);
            upheap(list.size()-1);
        }

        private void upheap(int index){
            if(index == 0){
                return;
            }
            int p = parent(index);
            if(list.get(index).compareTo(list.get(p)) < 0){
                swap(index, p);
                upheap(p);
            }
        }

        public  I remove() throws Exception{
            if(list.isEmpty()){
                throw  new Exception("removing from an empty heap!");
            }
            I temp = list.get(0);
            I last = list.remove(list.size()-1);
            if(!list.isEmpty()){
                list.set(0,last);
                downheap(0);
            }
            return temp;
        }

        private void downheap(int index){
            int min = index;
            int left = left(index);
            int right = right(index);

            if(left < list.size() && list.get(min).compareTo(list.get(left))>0){
                min = left;
            }

            if(right < list.size() && list.get(min).compareTo(list.get(right))>0){
                min = right;
            }

            if(min != index ){
                swap(min,index);
                downheap(min);
            }
        }


        public  ArrayList<I> heapSort() throws Exception{
            ArrayList<I> data = new ArrayList<>();
            while (!list.isEmpty()){
                data.add(this.remove());
            }
            return data;
        }
}
