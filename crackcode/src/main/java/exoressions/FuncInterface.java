package exoressions;

public interface FuncInterface {
    // A sample functional interface (An interface with
// single abstract method
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun() {
        System.out.println("Hello");
    }
}
