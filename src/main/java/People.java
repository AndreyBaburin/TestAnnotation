public class People {
    private int age;

    public People(int age) {
        this.age = age;
    }
@AgeLimit(minAge = 19, maxAge = 59)
    public void driveCar (){
        System.out.println("Я могу водить машину");
    }

    @AgeLimit(minAge = 18)
    public void drinkAlcohol(){
        System.out.println("Я могу пить алкоголь");
    }
}
