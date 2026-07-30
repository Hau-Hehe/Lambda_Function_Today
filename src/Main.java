//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal cat2 = (name, lastName) -> {
            System.out.println(name + " " + lastName);
        };

        cat2.speak("tom", "Jerry");
    }
}