/**
 * HotDrinksVendingMachine
 */
public class HotDrinksVendingMachine {

    private String name;
    private int temperature;

    public String getName(){
        return name;
    }

    public void setName(String name){
       this.name = name;
    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature){
       this.temperature = temperature;
    }

    @Override
    public String toString() {
    return "ГорячийНапиток{" +
    "Название='" + name + '\'' +
    ", температура=" + temperature +
    '}';
    }

    public class HotDrink extends HotDrinksVendingMachine {
        private int volume;
      
        public int getVolume(){
            return volume;
        }
    
        public void setVolume(int volume){
           this.volume = volume;
        }
    }

}