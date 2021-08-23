package builderPattern;

public class BuilderCrackedWheat {
    private final String oil;
    private final String crackedWheat;
    private final String water;
    private final String tomato;
    private final String pepper;
    private final String cherryTomato;
    private final Integer portion;

    public BuilderCrackedWheat(String oil, String crackedWheat, String water, String tomato, String pepper, String cherryTomato, Integer number) {
        this.oil = oil;
        this.crackedWheat = crackedWheat;
        this.water = water;
        this.tomato = tomato;
        this.pepper = pepper;
        this.cherryTomato = cherryTomato;
        this.portion = number;
    }

    public static class Cook {

        private String oil;
        private String crackedWheat;
        private String water;
        private String tomato;
        private String pepper;
        private String cherryTomato;
        private Integer portion;

        public Cook(String oil, String crackedWheat, String water) {
            this.oil = oil;
            this.crackedWheat = crackedWheat;
            this.water = water;
        }

        public Cook withTomato(String item) {
            System.out.println("Added " + item + " tomatoe");
            this.tomato = item;
            return this;
        }

        public Cook withPepper(String item) {
            System.out.println("Added " + item + " pepper");
            this.pepper = item;
            return this;
        }

        public Cook withPortion(Integer portion){
            System.out.println("Created for " + portion + " portion");
            this.portion = portion;
            return this;
        }

        public BuilderCrackedWheat build() {
            System.out.println("Created bulgur food successfuly !");
            return new BuilderCrackedWheat(oil, crackedWheat, water, pepper, tomato, cherryTomato, portion);
        }
    }

    @Override
    public String toString() {
        return "oil: " + oil + ", crackedWheat: " + crackedWheat + ", water: " + water + ", withPepper :" + pepper + ", withTomato :" + tomato + ", portion: " + portion;
    }
}

class TestBuilderPattern{
    public static void main(String[] args) {
        BuilderCrackedWheat builderPattern = new BuilderCrackedWheat.Cook("5 gr", "300 gr", "450 gr")
                .withTomato("100 gr")
                .withPepper("25 gr")
                .withPortion(3)
                .build();
        System.out.println(builderPattern.toString());
    }
}