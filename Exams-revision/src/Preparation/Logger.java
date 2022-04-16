package Preparation;

public class Logger {
    private String format = "Hello";


    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }

    void display() {
        System.out.println(format);
    }
}

