package functionalinterface;

public class PrintPassbook {

    public static void main(String[] args) {

        Passbook passbook = (name,amount,currency) -> { return "Amount in Mr./Mrs " + name + "'s account is " + amount + " " + currency;};

        String message1 = passbook.printMyPassbook("Hary",1000,"Dollers");
        String message2 = passbook.printMyPassbook("Rahul",1500,"Rupees");
        String message3 = passbook.printMyPassbook("Lee Tan u",2500,"Yen");

        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message3);


    }
}
