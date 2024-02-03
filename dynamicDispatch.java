// Dynamic Method Disptch 
// Super class no Refference bane ane Sub class no object bane
// therefore Sub class ni Overload thayel method j Access thase...
class phone
{
    void audio()
    {
        System.out.println("Audio is Play...");
    }
    void Camera()
    {
        System.out.println("Camera Accessed...");
    }
};
class Samsung extends phone
{
    void audio()
    {
        System.out.println("audio play");
    }
    void message()
    {
        System.out.println("Messager accessed");
    }
};
public class dynamicDispatch {
    public static void main(String[] args) {
        phone o = new Samsung();  
        o.audio();      // sub class method run
        o.Camera();
        // o.message(); // not allowed because this method in sub class  
        Samsung s = new Samsung();
        s.message();

    }
}
