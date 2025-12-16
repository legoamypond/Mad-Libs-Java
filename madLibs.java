import java.util.Scanner;
public class madLibs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name");
        String name0 = input.nextLine();
        String name1 =  name0.substring(0,1);
        String nameRest = name0.substring(1);
        String name1Up =  name1.toUpperCase();
        String name = name1Up + nameRest;
        

        /* 
        System.out.println("Enter a verb");
        String verb01 = input.nextLine();
        String verb1 = verb01.toLowerCase();

        System.out.println("Enter a shape");
        String shape01 = input.nextLine();
        String shape = shape01.toLowerCase();

        System.out.println("Enter a food");
        String food = input.nextLine();
        

        System.out.println("Enter a liquid");
        String liquid = input.nextLine();

        System.out.println("Enter a verb");
        String verb2 = input.nextLine();

        System.out.println("Enter a noun");
        String noun1 = input.nextLine();

        System.out.println("Enter ANOTHER VERB");
        String verb3 = input.nextLine();

        System.out.println("Verb Please");
        String verb4 = input.nextLine();

        System.out.println("Enter a number");
        String num = input.nextLine();

        System.out.println("Enter an ajective");
        String adjective1 = input.nextLine();

        System.out.println("Enter a noun");
        String noun2 = input.nextLine();

        System.out.println("Enter an ajective");
        String ajective2 = input.nextLine();

        
        String output = String.format("Let's help %s %s their first cake!\nGet out the %s of cake mix\nGet out one %s, a cup of %s, some vanilla extract, and flour\n%s it all together!\nUse a %s to %s the cake less dense.\nOil the pan\nPour batter in the pan and %s for %s minutes for your %s cake to bake.\nTake the cake out of the %s. Carfel it is %s!\nEnjoy",name,verb1,shape,food,liquid,verb2,noun1,verb3,verb4,num,adjective1,noun2,ajective2); 
        */
        //System.out.println(output);
        
    }

    }
