# designPattern
## java设计模式
## 编程设计模式六大原则
开闭原则（Open Close Principle）:对扩展开放,对修改关闭.在程序需要进行拓展的时候,不能去修改原有的代码,实现一个热插拔的效果.简言之,是为了使程序的扩展性好,易于维护和升级.想要达到这样的效果,我们需要使用接口和抽象类,后面的具体设计中我们会提到这点.  
里氏代换原则（Liskov Substitution Principle）:里氏代换原则是面向对象设计的基本原则之一. 里氏代换原则中说,任何基类可以出现的地方,子类一定可以出现.LSP是继承复用的基石,只有当派生类可以替换掉基类,且软件单位的功能不受到影响时,基类才能真正被复用,而派生类也能够在基类的基础上增加新的行为.里氏代换原则是对开闭原则的补充.实现开闭原则的关键步骤就是抽象化,而基类与子类的继承关系就是抽象化的具体实现,所以里氏代换原则是对实现抽象化的具体步骤的规范.  
依赖倒转原则（Dependence Inversion Principle）:这个原则是开闭原则的基础,具体内容:针对接口编程,依赖于抽象而不依赖于具体.  
接口隔离原则（Interface Segregation Principle）:使用多个隔离的接口,比使用单个接口要好.它还有另外一个意思是:降低类之间的耦合度.由此可见,其实设计模式就是从大型软件架构出发、便于升级和维护的软件设计思想,它强调降低依赖,降低耦合.  
迪米特法则,又称最少知道原则（Demeter Principle）:一个实体应当尽量少地与其他实体之间发生相互作用,使得系统功能模块相对独立.  
合成复用原则（Composite Reuse Principle）:尽量使用合成/聚合的方式,而不是使用继承.  
### 创建模式
创建型模式(creational pattern)对类的实例化过程进行了抽象,能够将软件模块中对象的创建和对象的使用分离.  
为了使软件的结构更加清晰,外界对于这些对象只需要知道它们共同的接口,而不清楚其具体的实现细节,使整个系统的设计更加符合单一职责原则.  
创建型模式在创建什么(What),由谁创建(Who),何时创建(When)等方面都为软件设计者提供了尽可能大的灵活性.  
创建型模式隐藏了类的实例的创建细节,通过隐藏对象如何被创建和组合在一起达到使整个系统独立的目的.  
#### singleton单例模式(懒汉/饿汉)
保证一个类只有一个实例,并提供一个访问它的全局访问点
#### factory工厂模式(工厂方法/抽象方法)
工厂模式的主要功能就是帮助我们实例化对象
#### builder
汽车由车轮 方向盘 发动机很多部件组成,同时,将这些部件组装成汽车也是一件复杂的工作,builder模式就是将这两种情况分开进行
#### prototype(原型)
用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象

#### 结构模式
关注于对象的组成以及对象之间依赖关系,描述如何将类或者对象结合在一起形成更大的结构
就像搭积木,可以通过简单积木的组合形成复杂的;功能更为强大的结构
#### adapter(适配器)
使用类再生的两个方式:组合(new)和继承(extends)

#### proxy(代理)

#### facade(门面)

#### composite(组合)

#### decorator(装饰器)

#### bridge(桥连)

#### flyweight(共享元)

#### 行为模式
关注于对象的行为问题,是对在不同的对象之间划分责任和算法的抽象化,不仅仅关注类和对象的结构,而且重点关注它们之间的相互作用
#### command(命令)

#### observer(观察者)

#### iterator(迭代器模式)
这个模式已经被整合入java的Collection,在大多数场合下无需自己创造一个Iterator,只要将对象装入Collection中,
直接使用Iterator进行对象遍历

#### template(模板方法)

#### strategy(策略)
不同算法各自封装,用户端可以随意挑选需要的算法

#### chain of responsibility(职责链)
各司其职的类串成一串,如果自己能完成则不推委下一个

#### Mediator(中介)

#### state(状态)
状态是编程中经常遇到的实例,将状态对象化,设立状态变换器,便可在状态中轻松切换

#### memento(备忘录)
很简单的一个模式,就是在内存中保留原来数据的拷贝

#### interpreter(解释器)
主要用来对语言的分析,应用机会不多

#### vistor(访问者)
访问者在进行访问时,完成一系列实质性的操作,而且还可以扩展