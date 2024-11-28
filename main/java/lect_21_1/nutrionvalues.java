package lect_21_1;

public class nutrionvalues {

    int portionsize;
    int portionamount;
    double protein;
    double fat;
    double carbohydrates;
    double natrium;

    private nutrionvalues(int ps, int pa, double pro, double fat, double carb, double na){
        this.portionsize = ps;
        this.portionamount = pa;
        this.protein = pro;
        this.fat = fat;
        this.carbohydrates = carb;
        this.natrium = na;
    }

    public static class nutrionBuilder {

        int portionsize;
        int portionamount;
        double protein;
        double fat;
        double carbohydrates;
        double natrium;

        public nutrionBuilder(int portionsize, int portionamount){
            this.portionsize = portionsize;
            this.portionamount = portionamount;
        }

        public nutrionBuilder withProtein(double protein){
            this.protein = protein;
            return this;
        }

        public nutrionBuilder withFat(double fat){
            this.fat = fat;
            return this;
        }

        public nutrionBuilder withCarbs(double carbs){
            this.carbohydrates = carbs;
            return this;
        }
        public nutrionBuilder withNatrium(double natrium){
            this.natrium = natrium;
            return this;
        }

        public nutrionvalues build(){
            return new nutrionvalues(portionsize, portionamount, protein, fat, carbohydrates,natrium );
        }
    }

    public static void main(String[] args) {
        nutrionvalues nut = new nutrionBuilder(500,3).withCarbs(30).withFat(20).withProtein(44).withNatrium(12).build();
        System.out.println(nut.carbohydrates);
        nutrionvalues nut2 = new nutrionBuilder(500,3).withFat(20).withProtein(44).withNatrium(12).build();
        System.out.println(nut2.carbohydrates);
    }
}
