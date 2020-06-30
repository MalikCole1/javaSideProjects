package RecipeDatabase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            //Name of Recipe
            System.out.println("Recipe Name: ");
            String name = sc.nextLine();

            //Ingredients
            System.out.println("How many Ing:");
            String num = sc.nextLine();
            int numI = Integer.parseInt(num);
            String[] ing = new String[numI];


            System.out.println("Ingredients: ");
            for (int i = 0; i < numI; i++) {
                String ingS = sc.nextLine();
                ing[i]= ingS;
            }

            //Instructions
            System.out.println("How many Instr:");
            String numIst = sc.nextLine();
            int numIstr = Integer.parseInt(numIst);
            String[] instrustion = new String[numIstr];

            System.out.println("Instrutions: ");
            for (int i = 0; i < numIstr; i++) {
                String instrS = sc.nextLine();
                instrustion[i] = instrS;
            }

            Recipe recipe = new Recipe(name,ing,instrustion);


            System.out.println("Quit (y/n):");
            String response = sc.nextLine();
            if(response.equals("y")){
                break;
            }
        }

    }
}
