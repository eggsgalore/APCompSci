package pkg;

public class Movie{
    String name;
    double rating;
    int num;
    int revenue;
    
    public Movie(){
        name = new String("avengers");
        rating = 8.0;
        num = 33;
        revenue = 623357910;
    }
    public Movie(String name, double rating, int num, int revenue){
        this.name = name;
        this.rating = rating;
        this.num = num;
        this.revenue = revenue;
    }
    
    
    public void movieToString(){
        System.out.println("-----------------------------");
        System.out.println("Movie : " + name);
        System.out.println("Rating : " + rating);
        System.out.println("Number of Ratings : " + num);
        System.out.println("Revenue : " + revenue);

    }
    public String getMovieName(){
        return name;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double r){
        num += 1;
        double newr = ((rating*(num-1))+r)/num;
        rating = newr;
    }
    public boolean compareRatings(Movie a){
        if (a.rating > rating){
            return false;
        }
        else{
            return true;
        }
    }
    public String revenueToString(){
        String rev = new String(String.valueOf(revenue));
        System.out.print(rev);
        return("623,357,910");
        
    }
    public void pirateMovie(){

    }
}