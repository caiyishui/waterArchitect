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

扩展根据不同参数和配置文件产生不同的实例

相关模式：抽象工厂，工厂方法模式


![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/architect_1.png)

3.Facade 门面模式
定义：为子系统的一组接口提供一个一致的界面，Facade模式定义了一个高层接口-统一的界面
facade包下面 是类的统一实现
facadeApi包下面是接口实现类的外观


优点：松散耦合 ，简单易用
本质：封装交互，简化调用


举例：Okhttp 缓j存框架，图片加载框架


相关模式，中介者模式、单例组合
![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/facade_1.png)

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/facade_2.png)


4.适配器模式
将一个接口转换成客户端想要的接口，是原本由于接口不兼容而不能一起工作的那些接口继续工作
适配器模式：
Adapter 适配器
Target
Adaptee
Client
Adapter将Adaptee适配成了Client需要的Target

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/adapter_1.png)

Android 使用适配器

Client : ListView（负责显示）
Target : 数据（getCount、getView API方法）这个即使listview需要显示的数据
Adaptee :  游标数据、Map数据、List数据、数组
Adapter : CursorAdapter、SimpleAdapter、ArrayAdapter

An Adapter object acts as a bridge between an {@link AdapterView} and the
 * underlying data for that view.
适配器对象是视图和数据之间的桥梁


The Adapter provides access to the data items.
The Adapter is also responsible for making a {@link android.view.View} for
each item in the data set.

适配器为每一个条目提供了获取数据的方法
两个关键字：View Data （Client、Target）
并不是拘泥于单纯的适配器模式类结构，而是对模式思想的一种特有的实现

作用：
提高代码的扩展性
代码复用
缺点：让系统变的凌乱，加大了学习难度

5.单例模式
（控制对象的个数）
控制对象的个数

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/singleton.png)


配置文件的（资源）

1.懒汉式 --要用的时候采用问你有没有，能拖就拖 synchronized 有线程效率的问题
代码singletonlazy包下面

2.饿汉式 --无法像构造传参，但是没有线程同步问题，和效率问题
代码在singletonhungry

3.双重检查 --在方法new的里面加对象的同步锁，并要在同步锁里面要加判断空。

代码在singletonddoublecheck

这个里面私有实例最好加上volatile这个关键点

1.4以后出现的，这个作用，当instance 在其他线程有改变了，就会通知另外的线程
但是这个关键字，这个会屏蔽掉虚拟机的一些代码优化。


4.通过枚举的实例去调用
在<Effective java><java 高效编程>提到枚举

singletonenum
下，通过枚举的实例直接去调用实现单例

5.静态内部类的方式

代码在singletondinnerclass

既能做到延迟加载，又能实现线程安全


