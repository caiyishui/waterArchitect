# waterArchitect
architect
设计模式的汇总

1.模板方法：定义一个算法框架，集体的实现在子类中实现，使子类可以不改变算法的结构即可重定义算法的末些特定步骤。
AbstractClass:抽象类，定义算法的结构，还可以提供通用的实现
ConcreteClass:具体实现类，选择性的重定义算法中的某些特定步骤
主要相关类在：templateexample 和templatemethod的包下，安卓中比较典型的使用的例子就是Ayntask的异步任务，以及activity的生命周期等等，一个比较典型的特点就是在模板方法中抽象类中定义一个final 的方法，用来固定所有的方法的顺序，具体是实现类都可以在子类去实际实现

2.简单工厂
在simplefactory的包下面
SimpleFactory里面就是提供创建接口的实例
提供一个创建对象实例的功能，不需要关心具体实现。
好处：客户端和模块的耦合度
可以根据具体的情况产生具体的实现类
应用场景bitmapFactory
![image](https://github.com/caiyishui/waterArchitect/raw/简单工厂类结构示意图.png )
