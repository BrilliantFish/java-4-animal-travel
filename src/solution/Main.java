package solution;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAnswer("One cock sells 5 yuan, one hen 3 yuan, and one yuan for three chickens. If you want to buy 100 of them with 100 yuan, how should you buy them?");
        System.out.println(animal.getAnswer());
        animal.solute();

        Travel travel = new Travel();
        travel.setAnswer("From Wuhan to Beijing you can choose from 4 means of transportation, including driving a car, taking bus, train, or plane. Driving costs 500 yuan, bus 300 yuan, train 400 yuan, and plane 1000 yuan. With the budget of 500 yuan, which vehicles Xiaoming can choose to get there?");
        System.out.println(travel.getAnswer());
        travel.solute();
    }
}
