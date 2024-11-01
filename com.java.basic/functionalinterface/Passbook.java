package functionalinterface;

@FunctionalInterface
public interface Passbook {

    String printMyPassbook(String customerName, Integer amount, String currency);
}
