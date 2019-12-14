package JAVA数据结构;

import java.util.HashMap;

public class LRU2 {
    private int cap;
    private node head=null;
    private node first=head,last=head;
    private HashMap<Integer,node> map = new HashMap<>(5);
    class node{
        int key;
        int value;
        node(){
        }
        node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public LRU2(int cap){
        this.cap = cap;
    }
    public void put(int key,int value){
        node no = map.get(key);
        if(no==null){

        }
        else{

        }
    }
    public static void main(String[] args){
        LRU2 cache = new LRU2(5);

    }
}
