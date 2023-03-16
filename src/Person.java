public class Person {
   private String name;
  private int number;
   private String tachersName;
   private int startingDay;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number>0) {
            this.number = number;
        }
    }

    public String getTachersName() {
        return tachersName;
    }

    public void setTachersName(String tachersName) {
        this.tachersName = tachersName;
    }

    public int getStartingDay() {
        return startingDay;
    }

    public void setStartingDay(int startingDay) {
        this.startingDay = startingDay;
    }

    public void setName(String name) {
        this.name = name;


    }
}

