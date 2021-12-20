package builderPattern;

public class BuilderSoup {
    String oil;
    String water;
    String tomato;

    private BuilderSoup(String oil, String water, String tomato) {
        this.oil = oil;
        this.water = water;
        this.tomato = tomato;
    }

    public static class Cook {
        String oil;
        String water;
        String tomato;

        public Cook(String oil, String water) {
            this.oil = oil;
            this.water = water;
        }

        public Cook withTomato(String tomato) {
            this.tomato = tomato;
            return this;
        }

        public BuilderSoup build() {
            return new BuilderSoup(oil, water, tomato);
        }

        @Override
        public String toString() {
            return oil + water + tomato;
        }

    }
}