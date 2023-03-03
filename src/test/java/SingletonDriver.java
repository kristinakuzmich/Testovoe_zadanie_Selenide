import com.codeborne.selenide.Selenide;
public class SingletonDriver {
    private static SingletonDriver instanceOfSingletonDriver=null;
    private SingletonDriver(){
        Selenide.open("http://192.168.166.198:8080/fos/");
    }
    public static SingletonDriver getInstanceOfSingletonDriver(){
        if(instanceOfSingletonDriver==null){
            instanceOfSingletonDriver = new SingletonDriver();
        }
        return instanceOfSingletonDriver;
    }
}