import java.util.ArrayList;


public class Person {

    private String name;
    private int age;
    private String gender;
    String[] interests;

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }

    public int getAge() {
        return age;
    }

    public String getGender(){ return gender; }

    public String getName() {
        return name;
    }

    public String[] getInterests(){return interests;}


    public String Hello() {
        int len = interests.length - 1;
        String lastText = interests[len];
        int lengthOfArray = interests.length;

        ArrayList last = new ArrayList();

        for(int i=0; i< lengthOfArray - 1; i++){
            last.add(interests[i]);
        }

        String text = last.toString();
        text = text.substring(1, text.length() - 1);

        String txt="Hello, My name is "+ name+" and I am " + age +" years old." +
                " My interests are being a "+ text + " and " + lastText + ".";
       return txt;
    }

}
