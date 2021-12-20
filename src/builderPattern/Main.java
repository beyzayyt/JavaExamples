package builderPattern;

public class Main {
    public static void main(String[] args) {
        BuilderCrackedWheat builderPattern = new BuilderCrackedWheat.Cook("5 gr", "300 gr", "450 gr")
                .withTomato("100 gr")
                .withPepper("25 gr")
                .withPortion(3)
                .build();
        System.out.println(builderPattern.toString());

    }
}


