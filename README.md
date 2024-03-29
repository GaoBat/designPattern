# 菜鸟:https://www.runoob.com/design-pattern/design-pattern-tutorial.html
# https://www.cnblogs.com/fengmo2427/p/16130648.html
# designPattern
## java设计模式
## 编程设计模式六大原则
开闭原则（Open Close Principle）:对扩展开放,对修改关闭.在程序需要进行拓展的时候,不能去修改原有的代码,
实现一个热插拔的效果.简言之,是为了使程序的扩展性好,易于维护和升级.想要达到这样的效果,我们需要使用接口和抽象类,
后面的具体设计中我们会提到这点.  

里氏代换原则（Liskov Substitution Principle）:里氏代换原则是面向对象设计的基本原则之一. 
里氏代换原则中说,任何基类可以出现的地方,子类一定可以出现.LSP是继承复用的基石,只有当派生类可以替换掉基类,
且软件单位的功能不受到影响时,基类才能真正被复用,而派生类也能够在基类的基础上增加新的行为.
里氏代换原则是对开闭原则的补充.实现开闭原则的关键步骤就是抽象化,而基类与子类的继承关系就是抽象化的具体实现,
所以里氏代换原则是对实现抽象化的具体步骤的规范.  

依赖倒转原则（Dependence Inversion Principle）:这个原则是开闭原则的基础,具体内容:针对接口编程,依赖于抽象而不依赖于具体.
  
接口隔离原则（Interface Segregation Principle）:使用多个隔离的接口,比使用单个接口要好.
它还有另外一个意思是:降低类之间的耦合度.由此可见,其实设计模式就是从大型软件架构出发、
便于升级和维护的软件设计思想,它强调降低依赖,降低耦合.  

迪米特法则,又称最少知道原则（Demeter Principle）:一个实体应当尽量少地与其他实体之间发生相互作用,使得系统功能模块相对独立. 
 
合成复用原则（Composite Reuse Principle）:尽量使用合成/聚合的方式,而不是使用继承.  

### 创建模式
创建型模式(creational pattern)对类的实例化过程进行了抽象,能够将软件模块中对象的创建和对象的使用分离.  
为了使软件的结构更加清晰,外界对于这些对象只需要知道它们共同的接口,而不清楚其具体的实现细节,使整个系统的设计更加符合单一职责原则.  
创建型模式在创建什么(What),由谁创建(Who),何时创建(When)等方面都为软件设计者提供了尽可能大的灵活性.  
创建型模式隐藏了类的实例的创建细节,通过隐藏对象如何被创建和组合在一起达到使整个系统独立的目的. 
 
#### 1.singleton单例模式(懒汉/饿汉)
![image](https://github.com/GaoBat/designPattern/blob/main/img/singleton.png)
保证一个类只有一个实例,并提供一个访问它的全局访问点
单例模式只允许创建一个对象，因此节省内存，加快对象访问速度，因此对象需要被公用的场合适合使用，如多个模块使用同一个数据源连接对象等等。
如： 
1.需要频繁实例化然后销毁的对象。 
2.创建对象时耗时过多或者耗资源过多，但又经常用到的对象。 
3.有状态的工具类对象。 
4.频繁访问数据库或文件的对象。 
以下都是单例模式的经典使用场景： 
1.资源共享的情况下，避免由于资源操作时导致的性能或损耗等。如上述中的日志文件，应用配置。 
2.控制资源的情况下，方便资源之间的互相通信。如线程池等。

#### 2.factory工厂模式(工厂方法/抽象方法)
![image](https://github.com/GaoBat/designPattern/blob/main/img/factorymethod.png)
![image](https://github.com/GaoBat/designPattern/blob/main/img/abstractFactory.png)
工厂模式的主要功能就是帮助我们实例化对象,new时可以考虑是否使用工厂模式
如果你不想让某个子系统与较大的那个对象之间形成强耦合，而是想运行时从许多子系统中进行挑选的话，那么工厂模式是一个理想的选择
将new操作简单封装，遇到new的时候就应该考虑是否用工厂模式;
需要依赖具体环境创建不同实例，这些实例都有相同的行为,这时候我们可以使用工厂模式，简化实现的过程，同时也可以减少每种对象所需的代码量
有利于消除对象间的耦合，提供更大的灵活性
当创建对象逻辑比较复杂时，可以考虑使用工厂模式，封装对象的创建过程，将对象的创建和使用相分离。下面两种情况可视为创建逻辑复杂
类似规则配置解析的例子，代码中存在 if-else 分支判断，动态地根据不同的类型创建不同的对象。针对这种情况。
考虑使用工厂模式，将这一大坨 if-else创建对象的代码抽离出来，放到工厂类中。
尽管不需要根据不同的类型创建不同的对象，但是，单个对象本身的创建过程比较复杂，比如要组合其他类对象，做各种初始化操作。
在这种情况下，也可以考虑使用工厂模式，将对象的创建过程封装到工厂类中。
对于第一种情况，当每个对象的创建逻辑都比较简单的时候，推荐使用简单工厂模式，将多个对象的创建逻辑放到一个工厂类中。
当每个对象的创建逻辑都比较复杂的时候，为了避免设计一个过于庞大的简单工厂类，推荐使用工厂方法模式，将创建逻辑拆分得更细，
每个对象的创建逻辑独立到各自的工厂类中。
同理，对于第二种情况，因为单个对象本身的创建逻辑就比较复杂，所以，建议使用工厂方法模式。
置于抽象工厂模式，使用场景不多。如果碰到一个工厂需要承担多种不同类型的对象创建时，可以考虑使用

#### 3.builder(建造者)
![image](https://github.com/GaoBat/designPattern/blob/main/img/builder.png)
汽车由车轮 方向盘 发动机很多部件组成,同时,将这些部件组装成汽车也是一件复杂的工作,将一个复杂对象的构建与它的表示分离
builder模式就是将这两种情况分开进行
代码量变多,但是可读性和可维护性更友好
https://blog.csdn.net/xu404741377/article/details/73699523?spm=1001.2101.3001.6650.1&utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-73699523-blog-115385606.pc_relevant_default&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7ECTRLIST%7ERate-1-73699523-blog-115385606.pc_relevant_default&utm_relevant_index=2

#### 4.prototype(原型)
用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象
![image](https://github.com/GaoBat/designPattern/blob/main/img/prototype.png)
(1)类初始化需要消化非常多的资源,这个资源包括数据、硬件资源等,通过原型拷贝避免这些消耗。
(2)通过new一个对象需要非常繁琐的数据准备或访问权限,可以使用原型模式。
(3)一个对象需要提供给其他对象访问,而且各个调用者可能需要修改其值,可以考虑使用原型模式拷贝多个对象供调用者使用,即保护性拷贝

#### 结构模式
关注于对象的组成以及对象之间依赖关系,描述如何将类或者对象结合在一起形成更大的结构
就像搭积木,可以通过简单积木的组合形成复杂的;功能更为强大的结构

#### 5.adapter(适配器)
![image](https://github.com/GaoBat/designPattern/blob/main/img/adapter.png)
使用类再生的两个方式:组合和继承
将两个不兼容的类纠合在一起使用，属于结构型模式,需要有 Adaptee(被适配者)和 Adaptor(适配器)两个身份
适配器模式的应用场景:
适配器模式（Adapter Pattern）是指将一个类的接口转换成客户期望的另一个接口，使原本的接口不兼容的类可以一起工作，属于结构型设计模式。
适配器适用于以下几种业务场景：
1、已经存在的类，它的方法和需求不匹配（方法结果相同或相似）的情况。
2、适配器模式不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品、不同厂家造成功能类似而接口不相同情况下的解决方案。有点亡羊补牢的感觉。
生活中也非常的应用场景，例如电源插转换头、手机充电转换头、显示器转接头。
https://blog.csdn.net/u011077231/article/details/129164693
https://blog.csdn.net/CoderPOPO/article/details/89062434
http://www.blogjava.net/dreamstone/archive/2007/01/07/92268.html

#### 6.proxy(代理)
![image](https://github.com/GaoBat/designPattern/blob/main/img/proxy.png)
代理(proxy)是一种设计模式,提供了对目标对象另外的访问方式:即通过代理对象访问目标对象
这样的好处是:可以在目标对象实现的基础上,增强额外的功能操作,即扩展目标对象的功能
这里使用到编程中的一个思想:不要随意去改变别人已经写好的代码或者方法
如果需要修改,可以通过代理的方式来扩展该方法
静态代理
缺点:每一个目标对象，都需要匹配一个代理类，并且目标对象方法变更，代理类必须同步更新。
jdk动态代理
cglib动态代理

#### 7.facade(门面)
![image](https://github.com/GaoBat/designPattern/blob/main/img/facade.png)
外观模式:为子系统的接口提供一组统一的入口.外观模式定义了一个高层接口,这个接口使得子系统更加容易使用
外观模式是迪米特法则的一种具体实现,通过引入一个外观角色降低原有系统的复杂度,同时降低客户类与子系统的耦合度.
Facade模式主要用于简化客户调用各种子系统的过程和解耦它们的联系，还可以用于开发时各种模块的划分，
比如提供Facade模块暴露给客户我们复杂的底层处理功能。
Facade模式，又叫做门面模式，指的是针对于庞大的类之间错综复杂的关系而提出的一种想法，
就相当于我们开发web应用程序的时候使用的controller，service，dao层一样，把底部的与数据库交互的类以及对数据进行操作的类给封装起来，
对外只提供contorller的数据接口，而这个controller就相当于是一个窗口。所以，我觉得，窗口模式，更多的是一种思维方式，
同样的工具类的思维方式也是同这个相似。
优点：
1、减少系统相互依赖。
2、提高灵活性。
3、提高了安全性。
缺点：不符合开闭原则，如果要改东西很麻烦，继承重写都不合适。
使用场景：
1、为复杂的模块或子系统提供外界访问的模块。
2、子系统相对独立。
3、预防低水平人员带来的风险。

#### 8.composite(组合)
![image](https://github.com/GaoBat/designPattern/blob/main/img/composite.png)
将对象组合成树形结构以表示“部分-整体”的层次结构。Composite使得用户对单个对象和组合对象的使用具有一致性。

#### 9.decorator(装饰器)
![image](https://github.com/GaoBat/designPattern/blob/main/img/decorator.png)
动态的给一个对象添加一些额外的职责.就增加功能来说,装饰模式比生成子类更加灵活
假如现在有一块蛋糕， 加上奶油就是奶油蛋糕。如果继续再加上草莓，就是草莓蛋糕，再加点蜡烛，就变成了生日蛋糕。不论是蛋糕、奶油蛋糕、草莓蛋糕还是生日蛋糕，它们的核心都是蛋糕。
像这样不断地为对象添加装饰的设计模式被称为Decorator模式。
这个添加的过程有点类似于套娃。就是一个很原始的对象，一直在它外层套东西，不断地装饰它。

#### 10.bridge(桥接)
![image](https://github.com/GaoBat/designPattern/blob/main/img/bridge.png)
不同对象间的组合产生不同的结果，将抽象和实现进行分离，当然，如果要扩展功能的，只要实现相应的接口，继承对应的类。
它的主要特点是把抽象（abstraction）与行为实现（implementation）分离开来，让系统更加符合“单一职责原则”。
从而可以保持各部分的独立性以及应对它们的功能扩展。与多层继承方案不同，它将两个独立变化的维度设计为两个独立的继承等级结构，
并且在抽象层建立一个抽象关联，该关联关系就像一条桥一样，将两个独立继承结构的类联接起来，故名桥接模式。
https://blog.csdn.net/whiteBearClimb/article/details/103845374
https://www.jianshu.com/p/f4bd9dc5bbb5
#### 11.flyweight(共享元)
![image](https://github.com/GaoBat/designPattern/blob/main/img/flyweight.png)
享元（Flyweight）模式的定义：运用共享技术来有効地支持大量细粒度对象的复用。
它通过共享已经存在的又橡来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
享元模式的主要优点是：相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
其主要缺点是：
为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
读取享元模式的外部状态会使得运行时间稍微变长。

#### 行为模式
关注于对象的行为问题,是对在不同的对象之间划分责任和算法的抽象化,不仅仅关注类和对象的结构,而且重点关注它们之间的相互作用

#### 12.command(命令)
![image](https://github.com/GaoBat/designPattern/blob/main/img/command.png)
命令模式可以将请求发送者和接收者完全解耦，发送者与接收者之间没有直接引用关系，发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求.
定义:将一个请求封装为一个对象，从而让我们可用不同的请求对客户进行参数化；对请求排队或者记录请求日志，以及支持可撤销的操作.

#### 13.observer(观察者)
![image](https://github.com/GaoBat/designPattern/blob/main/img/observer.png)

#### 14.iterator(迭代器模式)
这个模式已经被整合入java的Collection,在大多数场合下无需自己创造一个Iterator,只要将对象装入Collection中,
直接使用Iterator进行对象遍历

#### 15.template(模板方法)
![image](https://github.com/GaoBat/designPattern/blob/main/img/template.png)

#### 16.strategy(策略)
![image](https://github.com/GaoBat/designPattern/blob/main/img/strategy.png)
不同算法各自封装,用户端可以随意挑选需要的算法

#### 17.chain of responsibility(职责链)
![image](https://github.com/GaoBat/designPattern/blob/main/img/chainofresponsibility.png)
各司其职的类串成一串,如果自己能完成则不推委下一个

#### 18.mediator(中介)
![image](https://github.com/GaoBat/designPattern/blob/main/img/mediator.png)

#### 19.state(状态)
![image](https://github.com/GaoBat/designPattern/blob/main/img/state.png)
状态是编程中经常遇到的实例,将状态对象化,设立状态变换器,便可在状态中轻松切换

#### 20.memento(备忘录)
![image](https://github.com/GaoBat/designPattern/blob/main/img/memento.png)
很简单的一个模式,就是在内存中保留原来数据的拷贝

#### 21.interpreter(解释器)
![image](https://github.com/GaoBat/designPattern/blob/main/img/interpreter.png)
主要用来对语言的分析,应用机会不多

#### 22.vistor(访问者)
![image](https://github.com/GaoBat/designPattern/blob/main/img/visitor.png)
访问者在进行访问时,完成一系列实质性的操作,而且还可以扩展
