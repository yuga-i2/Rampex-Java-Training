public class Restaurant {

    private int id;
    private String name;
    private String location;
    private double rating;

    public Restaurant() {}

    public Restaurant(int id, String name, String location, double rating) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + location + " " + rating;
    }

    @Override
    public boolean equals(Object obj) {

        Restaurant r = (Restaurant) obj;

        return this.id == r.id;
    }
}