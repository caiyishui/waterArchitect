# waterArchitect
architect
设计模式的汇总

##1.模板方法：定义一个算法框架，集体的实现在子类中实现，使子类可以不改变算法的结构即可重定义算法的末些特定步骤。
AbstractClass:抽象类，定义算法的结构，还可以提供通用的实现
ConcreteClass:具体实现类，选择性的重定义算法中的某些特定步骤
主要相关类在：templateexample 和templatemethod的包下，安卓中比较典型的使用的例子就是Ayntask的异步任务，以及activity的生命周期等等，一个比较典型的特点就是在模板方法中抽象类中定义一个final 的方法，用来固定所有的方法的顺序，具体是实现类都可以在子类去实际实现

##2.简单工厂
在simplefactory的包下面
SimpleFactory里面就是提供创建接口的实例
提供一个创建对象实例的功能，不需要关心具体实现。
好处：客户端和模块的耦合度
可以根据具体的情况产生具体的实现类
应用场景bitmapFactory

扩展根据不同参数和配置文件产生不同的实例

相关模式：抽象工厂，工厂方法模式


![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/architect_1.png)

##3.Facade 门面模式
定义：为子系统的一组接口提供一个一致的界面，Facade模式定义了一个高层接口-统一的界面
facade包下面 是类的统一实现
facadeApi包下面是接口实现类的外观


优点：松散耦合 ，简单易用
本质：封装交互，简化调用


举例：Okhttp 缓j存框架，图片加载框架


相关模式，中介者模式、单例组合
![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/facade_1.png)

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/facade_2.png)


##4.适配器模式
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

##5.单例模式
（控制对象的个数）
控制对象的个数

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/singleton.png)


配置文件的（资源）

5.1.懒汉式 --要用的时候采用问你有没有，能拖就拖 synchronized 有线程效率的问题
代码singletonlazy包下面

5.2.饿汉式 --无法像构造传参，但是没有线程同步问题，和效率问题
代码在singletonhungry

5.3.双重检查 --在方法new的里面加对象的同步锁，并要在同步锁里面要加判断空。

代码在singletonddoublecheck

这个里面私有实例最好加上volatile这个关键点

1.4以后出现的，这个作用，当instance 在其他线程有改变了，就会通知另外的线程
但是这个关键字，这个会屏蔽掉虚拟机的一些代码优化。


5.4.通过枚举的实例去调用
在<Effective java><java 高效编程>提到枚举

singletonenum
下，通过枚举的实例直接去调用实现单例

5.5.静态内部类的方式

代码在singletondinnerclass

既能做到延迟加载，又能实现线程安全


##6.工厂方法模式
定义：定义一个创建对象的接口(Creator)，让子类决定实例化哪一个类(ConcreateCreator)，
工厂方法使一个类的实例化延迟到创建器的子类中（ConcreteCreator）

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/factorymethod.png)

工厂方法模式，比简单工厂扩展性更强

包factoryfun

安卓中：CursorFactory,LayoutInflater.Factory

框架：做了部分工作，定义接口（jdbc）

框架只完成一定功能

导出数据的框架

不确定的：要导出的什么文件不确定

##7.抽象工厂模式（产品簇的问题，配套）

生产一系列的有关系的产品

抽象工厂的角色：

AbstractFactory 抽象工厂y
ConcreateFactory 具体的工厂
AbstractProduct 产品接口
ConCreteProduct 具体的产品实现
Client 客户端

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/abstactfactory.png)

提供一系列相关或相互依赖对象的接口，而无须指定具体的类

好的系统不是设计出来的，是迭代出来的

应用场景：套餐 跨平台

优点：切换产品簇方便，

缺点：类层次过于复杂

##8.生产器模式

定义：将复杂对象的构建与它表示进行分离，使得通过同样的构建过程，有不同的表示。

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/create.png)

Builder 生成器接口，定义创建一个product对象所需的各个部件的操作
ConcreateBuilder 具体的生成器实现。
Director 指导者 主要来使用builder接口，以一个统一的过程来构建所需要的product对象
Product  产品

最简单的类模型
在concreatebuilder包下

concreatebuilder1 包是使用构建器模式实现导出文件的业务实现

Builder 构建的是零件  Derector  负责组装零件

需求：虽然文件的格式不一样，但是导出文件的内容格式相同

再举个例子，买保险

concreatebuilder2 

生成器模式的另外一个使用场景，在复杂的对象的构建过程中，约束产品的构建过程。

concreatebuilder3使用静态内部类形式

优点：同样的步骤构建出不同的产品，把构建的过程独立出来，使得他与具体的产品表现松散耦合，构建过程可以复用，具体的产品表现也可以灵活切换。

相关模式：

Android应用： AlertDialog.Builder


##9.原型模式
Prototype

定义：拷贝原型实例来指定创建对象的种类，并通过拷贝这些原型创建新的对象

重点就是对象创建和拷贝

Prototype 接口，声明一个克隆自身的接口，谁想克隆自己，实现该接口

java中哪些克隆默认为浅克隆，要深克隆，需要自己实现深克隆

克隆结合接口使用，new 必须指定实际类型，而克隆只需要接口即可

优点：可对客户端隐藏具体的实现类型
运行时动态改变具体的实现类型

缺点：
实现克隆方法

使用场景：面向接口编程，通过原型就可以创建出对象


![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/yuanxing.png)



##10中介者模式 Mediator

定义：交互

封装一系列对象的交互
使得各个对象不需要相互引用，是他们松散耦合，而且可以独立的进行交互

Mediator：中介者接口，定义各个同事之间交互需要的方法
ConcreteMediator：具体的中介者实现
Colleague：同事（cpu，声卡，网卡）。会持有中介者对象
ConcreteColleague：具体的同事类

广义：
部门-员工

交互：
部门之间进行合并

部门之间进行合作
人员离职
人员调动

优点：
松散耦合，防止牵一发而动全身
集中控制交互
多对多变成一对多
 
 缺点：所有的交互工作集中到中介者上
 
 场景:一组对象交互复杂，会导致相互依赖，结构复杂
 
 相关：观察者模式
 
 系统里面KeyguardView



##11。代理模式

定义：为其他对象提供一种代理以控制对这个对象访问。核心：控制访问的问题
###1.虚代理：根据需要来穿件开销很大的对象，该对象只有再需要的时候才会被真正创建和使用
角色：
Proxy：代理对象
Subject： 目标接口
RealSubject：具体的目标对象

这里有个关系，就是代理对象，和具体的目标对象，实现的相同的目标接口，方便使用的人分不清是具体哪个对象，可以使用目标对象同样的方法
注意代理对象需要，持有被代理对象的引用（虚代理）

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/jingtaidaili.png)

举个例子
用户类里面有很多的属性
用户表
如果有3个属性，

如果常用的只有3个，其余的没有必要加载到内存中
10000条
类结构示意图

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/jtdaili-1.png)


###2.保护代理
在对象访问时进行权限检查
静态代理的缺点：代理必须要实现目标接口，目标接口发生变化，代理也需要修改

##动态代理
代理类实现InvocationHandler接口
将代理对象和目标对象进行绑定 Proxy.newProxyIntance

实现invoke方法，具体判断当前调用的是什么方法，然后进行相应的处理

jdk1.3后，通过反射机制和和动态生成的技术，动态生成被代理的接口的实现对象



#IOC  控制反转

@Override
@Target(ElementType.METHOD) 在方法上使用
@Retention(RetentionPplicy.SOURCE)保留政策，源码级别，编译成class文件就不存在了
确保方法的重写


@Target(ElementType.TYPE) 在类上使用
@Retention(RetentionPplicy.RUNTIME)再运行时使用

##12 状态模式

![image](https://github.com/caiyishui/waterArchitect/blob/master/raw/state.png)

主要解決的问题是：状态太多，判断太多，很难维护
这种思想主要解决了：
优点：
简化了逻辑控制
分离了状态和行为，只需要关心状态的切换，而不需要关注切换之后的状态需要干什么
显示化了状态的切换
更好的扩展
