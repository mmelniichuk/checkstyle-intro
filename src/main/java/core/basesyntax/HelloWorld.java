package core.basesyntax;

public class HelloWorld {
    private String name;
    private int variable;
    private int age;
    private int size;

    private String getFromOneToTen() {
        String result = "";

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                result = result + i + " ";
            }
        }
        return result;
    }

    private void sayHello(String hello) {
        System.out.println("Hello, Mate! I am happy to see you! "
                            + "This class looks weird! Your task is to fix the "
                            + "checkstyle in this file." + " Your goal is to run "
                            + "`mvn clean package` and receive `BUILD SUCCESS` message");
        System.out.println(hello);
    }
}

