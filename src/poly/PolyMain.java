package poly;

public class PolyMain {
    public static void main(String[] args) {
        Parent parent = new Child();

        Child child1 = (Child) parent;

        child1.childMethod();
        child1.parentMethod();

        ((Child) parent).childMethod();

        Child originalChild = new Child();

        originalChild.parentMethod();

        System.out.println("------------------------------------");

        call(parent);
    }

    //참조 값에 있는 인스턴스 안 클래스 확인 후 안전한 다운캐스팅
    static Child call(Parent parent) {
        parent.parentMethod();
        if(parent instanceof Child) {
            System.out.println("다운캐스팅을 실행합니다.");
            Child child = (Child) parent;
            child.childMethod();
            return child;
        }
        return null;
    }
}
