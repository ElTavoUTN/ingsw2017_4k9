package tp5ingsw4k9;

import Vista.Principal;

public class TP5IngSw4k9 {

    public static void main(String[] args){
        if (args.length == 0){
            Principal actual = new Principal();
            actual.setVisible(true);
            System.out.println("Pantalla principal");
        }
    }
}
