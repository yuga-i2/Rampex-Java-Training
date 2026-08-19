class House {
    String owner;
    String colour;
    public static void main(String[] args) {
        House h1 = new House();
        h1.owner = "Yuga";
        h1.colour = "White";
        House h2 = new House();
        h2.owner = "Rahul";
        h2.colour = h1.colour;
        System.out.println("The house owner is " + h2.owner +" and the house colour is " +
        h2.colour);
    }
}