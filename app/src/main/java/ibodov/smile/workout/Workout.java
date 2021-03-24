package ibodov.smile.workout;

public class Workout {

    //Каждый объект Workout содержит поля названия (name) и описания (description) приложения
    private String name;
    private String description;

    public static final Workout[] workouts = {
      new Workout("The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
      new Workout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
      new Workout("The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
      new Workout("Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Get-методы для чтения приватных переменных.

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString() { //В качестве строкового представления объекта Workout используется его имя/
        return this.name;
    }
}
