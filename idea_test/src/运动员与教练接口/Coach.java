package 运动员与教练接口;

public abstract class Coach extends Human {
    Coach(){}
    Coach(String name, String age){
        super(name, age);
    }

    public abstract void teach();
}
