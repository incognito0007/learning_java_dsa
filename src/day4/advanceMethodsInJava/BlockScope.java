package day4.advanceMethodsInJava;

public class BlockScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a before going inside the block - " + a);

        {
            a = 990;
            //values initialised outside the block can only be modified in this block and can be used here also (inside this block)

            System.out.println("a inside the block - " + a);

            int c = 70;
            //values initialised inside the block will remain inside the block, you cannot use this value outside of this block
            System.out.println("c in block - " + c);
        }

        System.out.println("a outside the block - " + a);

        int c = 85; //this is correct as c was only created for the block so it can be initialised again as new variable in main
        System.out.println("c outside block - " + c);

        //CONCLUSION --> Anything that is defined outside the block cannot be defined again inside the block but can be used again inside the block, Whereas anything that is defined inside the block can only be used inside the block.
    }
}
