package project_1.BMI_calculator;

public class BMI {
    private String name;
    private Integer age;
    private Double weight;
    private Double height;

    public BMI(String name, Integer age, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, Double weight, Double height) {
        this(name, 21, weight, height);
    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getHeight() {
        return height;
    }
    public Double getBMI(){
        Double bmi = getWeight()/(getHeight()*getHeight());
        return bmi;
    }
    public String getStatus(){
        String result = "";
        Double bmi = getBMI();
        if(bmi < 18.5)
            result += "Under Weight";
        else if(bmi < 24.9)
            result += "Normal";
        else if(bmi < 29.9)
            result += "Over Weight";
        else if(bmi < 34.9)
            result += "Obesity(Class 1)";
        else if(bmi < 39.9)
            result += "Obesity(Class 2)";
        else
            result += "Extreme obesity";
        return result;
    }
}
