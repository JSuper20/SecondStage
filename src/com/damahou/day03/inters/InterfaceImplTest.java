package com.damahou.day03.inters;

/**
 * @Program SecondStage
 * @ClassName InterfaceImplTest
 * @Package com.damahou.day03.inters
 * @Description test
 * @Author DaMaHou
 * @CreateDate 2023-07-02 16:32
 * @ModifyBy
 * @ModifyDate
 * @Version 1.0
 */
public class InterfaceImplTest {
    public static void main(String[] args) {
        Interface01Impl inter = new Interface01Impl();
        // 如果继承的类和实现的接口中有相同的方法声明，但代码逻辑不一样，优先使用直接父类中的逻辑
        inter.show();
    }
}


/**
 * 当一个类继承自一个类，且实现了一个接口；被继承的类与接口有一个相同的方法，接口是抽象方法；在Java中，如果一个类继承另一个类并实现一个接口，
 * 并且超类和接口具有相同名称的方法，则子类不需要再次实现该方法。这是因为该方法已在超类中实现。
 * 即 接口的抽象方法，由被继承的类实现，而进行继承和实现的类不需要进行抽象方法的实现，即可达到实现接口抽象方法的效果；也可以在实现类中进行重写。
 */
class Interface01Impl extends Fu implements Interface {
    /*@Override
    public void show() {
        System.out.println("实现类中重新的show方法");
    }*/
}
