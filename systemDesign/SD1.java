package systemDesign;

public class SD1 {
    public static void main(String[] args) {
        //game design
        boolean jump= true;          //its basically all about writing a code in KISS way
        boolean run = true;          // to make it more readable and efficient to understand.
        boolean fly= false;
        boolean weapon = false;

        //god mode - all 4 powers
        //legend mode - run and weapon
        //else regular mode


        //bad implemantation
        if(jump==true){
            if(run==true){
                if(fly==true){
                    if(weapon==true){
                        System.out.println("god mode activated");
                    }
                }
            }
        }
        else if(run==true){
            if(weapon==true){
                System.out.println("legend mode activated");
            }
        }
        else{
            System.out.println("run mode activated");
        }
        //good implementation
        if(jump && run && weapon){
            System.out.println("god mode active");
        }
        else if(run && weapon){
            System.out.println("legend mode active");
        }
        else{
            System.out.println("regular mode active");
        }
    }
}
