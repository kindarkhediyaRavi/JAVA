// Possible Inherite in Interface [ Single, Multilevel, Multiple, Hierarchy, Hybrid  ]
// Interface
interface I1 {
    void man(int m);
    abstract void boys();  // Interface in abstract method is allowed...
};
interface I2 {
    void woman(int w);
};
interface I3 extends I2{
    void childran(int c);
};
interface I4 extends I1,I3{  
    void totalPerson(int t);
}


// Class in implement Interface
class Person implements I4{       // When "I2" interface implement then childran() method is not Complasary 
    @Override
    public void woman(int w){     // But "I3" interface implement then childran() method Complasary
        System.out.println("Total woman in Village " + w);
    }
    public void boys(){
        System.out.println("Abstract method called...");
    }
    public void man(int m){
        System.out.println("Total Man in Village " + m);
    }
    public void childran(int c){
        System.out.println("Total childran in Village " + c);
    }
    public void totalPerson(int t){
        System.out.println("Total Person in Village " + t);
    }
};

public class interfaceInheritance {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.man(250);
        p.woman(225);
        p.childran(150);
        p.boys();
        
        p.totalPerson(650);
    }
}
