public class Main {

    enum Season {
        Spring(10), Summer(25), Autumn(15), Winter(-5);
        private int avgTemperature;

        Season(int avgTemperature) {
            this.avgTemperature = avgTemperature;
        }

        public int getAvgTemperature() {
            return avgTemperature;
        }

        public String getDescription() {
            switch (this) {
                case Spring:
                    return "Прохладное время года";
                case Summer:
                    return "Теплое время года";
                case Autumn:
                    return "Прохладное время года";
                case Winter:
                    return "Холодное время года";
                default:
                    return "";
            }
        }
    }

    public static void main(String[] args) {
        Season myFavouriteSeason = Season.Summer;
        System.out.println("Мое любимое время года - " + myFavouriteSeason);
        System.out.println("Средняя температура в этом времени года - " + myFavouriteSeason.getAvgTemperature());
        System.out.println("Описание времени года - " + myFavouriteSeason.getDescription());

        for (Season s : Season.values()) {
            System.out.printf("%s, средняя температура - %d, описание - %s\n", s, s.getAvgTemperature(), s.getDescription());
        }
    }
}
