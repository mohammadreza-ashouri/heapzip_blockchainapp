package heapzip;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Block> blockChainList=new ArrayList<>();

        Block genesis =new Block("HeapZip Blockchain!", 0);

        blockChainList.add(genesis);


        Block blockX = new Block("Hello",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);



        Block blockY = new Block("to",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);



        Block blockZ = new Block("HeapZip Channel!",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);


        //--------------------------------

        System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  ");
        System.out.println( "  Creating a simple blockchain in Java ");
        System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  ");

        blockChainList.forEach(System.out::println);

        System.out.println(" $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  ");


    }




}
