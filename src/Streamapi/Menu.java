package Streamapi;

public class Menu {
    private String name;
    private int calories;
    private String type;

    public Menu(String name, int calories, String type) {
        this.name = name;
        this.calories = calories;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", type='" + type + '\'' +
                '}';
    }
}

