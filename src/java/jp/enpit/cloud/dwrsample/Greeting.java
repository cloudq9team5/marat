package jp.enpit.cloud.dwrsample;

public class Greeting{
    public String sayHello(String name, int age){
        return String.format("Hello, %s (%d)", name, age);
    }
}