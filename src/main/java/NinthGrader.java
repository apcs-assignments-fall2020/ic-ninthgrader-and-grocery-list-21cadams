public class NinthGrader extends Student {
    
    public NinthGrader(String a, String b) {
        super(a, b, 2024);
    }

    public NinthGrader(){
        super("John",  "Smith", 2024);
    }

    public void doSomething() {
        System.out.println("I am studdying physics.");
    }

    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() +"(Ninth Grader)";
        return str;
    }
}