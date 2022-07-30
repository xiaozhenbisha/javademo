# 第1章 概述

本章介绍编程基本知识和Java编程的基本知识。本章涉及：

计算机中指令与数据的表示方法；

程序执行的基本原理；

程序设计语言的分类；

Java的历史和发展现状；

Java的三个版本；

Java的体系结构概况。

## **1.1编程概述**

### 一、计算机与程序

我们通常所说的计算机指的是电子计算机，也称电子数字计算机。是一种能够高速地进行数值计算和逻辑计算，并具有存储记忆功能的电子设备，是一种按程序自动进行信息处理的工具。计算机具有多种功能，如数据采集、识别、转换、控制、人工智能等，广泛用于科学计算、数据处理、办公自动化、过程控制、辅助设计与辅助制造以及人工智能等领域。

现代电子计算机的功能很强大，但它的基本功能是计算。正是因此，我们才把它称作“计算机”，而不是其它的什么东西。自有人类活动的开始，人类对计算的需求就存在。在人类探索自然的过程中，有大量繁琐的计算任务需要解决，而仅凭人力不仅费时费力，甚至在某些情况下无法完成计算任务。这样的现实激发了人类对计算工具的研究。计算机就是人类为了完成复杂繁琐的计算任务，在长期的生产生活过程中研制出来的计算工具。

计算机的核心部件是中央处理器（CPU，Central Processing Unit）。CPU是一块超大规模的集成电路，是一台计算机的运算核心（Core）和控制核心（ Control Unit）。它的功能主要是解释和执行计算机指令以及处理数据。

计算机中的指令和数据都是二进制数形式表示的，也就是说计算机存储器中存储的程序和数据都是二进制数形式的，中央处理器及其它电路处理的也都是二进制数。这是因为计算机硬件是电子器件，而制造和使用具有两个稳定状态的电子器件比较简单。我们把具有两个稳定状态的电子器件称为双稳态元件，使用双稳态元件的其中一个状态表示0，另一个状态表示1，则可以很方便地用表示和处理二进制数。此外，操控双稳态元件的电路设计容易、运算简单、工作可靠且逻辑性强。

**(1)指令与指令的表示**

计算机中无论简单还是复杂的操作，最终都能分解为一系列最基本的操作，每一个基本操作都有一条指令与之对应。人们用指令指示计算机执行某种操作，用一系列的指令来描述复杂的操作的实现过程，而这一系列的指令，实际上就是程序。所以说，计算机程序是由一系列指令构成的。计算机的CPU能够执行的所有指令的集合称为指令系统，CPU的指令系统标志着它的处理能力。

计算机系统中，指令采用二进制数表示，用来规定计算机执行的操作及操作对象所在的位置。指令由操作码和操作数两部分组成，如图1.1所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/11.png)

**图1.1 指令格式**

操作码是用来指明计算机应该执行何种操作的二进制代码。比如加法、减法、跳转等各种基本操作，都有一个操作码与之对应，不同的芯片产品，操作码有所区别。操作数是用来指明该操作处理的数据或数据所在储存单元的地址。

```
例如，某CPU的指令代码（二进制数据）为00110000 00011000，其中前面八位二进制数00110000表示加法指令，后面八位二进制数00110000表示要加数据存放的地址；又如，指令代码（二进制数据）11000000 00010001，其中前面八位二进制数11000000表示跳转指令，后面八位二进制数00010001表示跳转的具体地址。
```

每种不同类型的CPU都有自己独特的一组指令，指令种类很多，包括数据传送指令、算术运算指令、逻辑运算指令、移位指令、控制转移指令和输入/输出指令等。各种指令的最终表示方法都是形如上述实例的二进制数的表示形式。表示指令的二进制位串在存储器中存储，并在执行程序时被CPU转换成电信号完成各种操作。 二进制数难写也难记，所以后来人们使用“助记符”帮助写程序。

```
例如，指令代码（八进制数据）030030，对应助记符为ADD 30，其中前面三位八进制数030表示加法指令，后面三位八进制数030表示要加数据存放的地址； 又如，指令代码（八进制数据）140021，对应肋记符为JMP 021，其中前面三位八进制数140表示跳转指令，后面二位八进制数表示跳转的具体地址。
```

写程序的时候使用助记符写就可以了，这样就简单多了。需要注意的是，用助记符写的程序最终还是要变成二进制的指令才能驱动CPU运行。这个转换可以手工转换，也可以用事先编制好的二进制翻译程序（此原始的翻译程序早期都是手工编写的0、1代码）转换。

**(2)数据的表示**

计算机的基本功能是计算和处理数据。这里所说的**数据**是指以任何格式表示的信息，该格式需经由创建和使用数据的双方达成共识。数据有两种形式：一种是**数值数据**，如我们熟悉的整数、实数等；另一种是**非数值数据**，如各种字母、符号、声音、图像等。早期计算机所处理的数据几乎都是数字或文本，现代计算机也可以处理诸如音频、视频、图形和图像等多媒体数据。

但是，当今的计算机并不能直接识别和处理原始数据——如十进制数或文本等；更不能直接处理物理实体——如一个照片或一段音乐等。这些原始数据或实体需要经过适当的编码，转换成二进制形式的数据之后，才能够被计算机识别和处理。

### 二、程序设计语言的分类

程序设计语言是学习计算机技术的基础，它经历了较长的发展过程，也有许多不同的分类方法。

**(1)按发展过程分类**

**A.机器语言**

机器语言是以二进制代码的形式组成的机器指令序列，不同的机器有不同的机器语言，存储安排也由语言本身控制。这种语言编制的程序运行效率极高，但程序很不直观，编写很简单的功能就需要大量代码，重用性差，而且编写效率较低，很容易出错。

**B.汇编语言**

汇编语言比机器语言直观，它将机器指令进行了符号化，并增加了一些功能，如宏、符号地址等，存储空间的安排由机器完成，编程工作相对机器语言有了极大的简化，使用起来方便了很多，错误也相对减少。但不同的指令集的机器仍有不同的汇编语言，程序重用性也很低。

**C.高级语言**

高级语言是与机器不相关的一类程序设计语言，读写起来更接近人类的自然语言，因此，用高级语言开发的程序可读性较好，便于维护。同时，由于高级语言并不直接和硬件相关，其编制出来的程序和移植性和重用性也要好得多。常见的高级语言有Pascal、C和Basic等，现代应用程序设计多数都是使用高级语言。Java就是高级语言的一种。

机器语言、汇编语言和高级语言之间的差别如表1-1所示。

**表1-1 机器语言、汇编语言和高级语言的差别**

![image-20220719231041750](C:\Users\wzn\AppData\Roaming\Typora\typora-user-images\image-20220719231041750.png)

一种还未成熟的语言。它具有一定的智能，更接近于日常语言，它对语言的概括更为抽象，从而使语言也更为简洁。

**(2)按执行方式分类**

**A.编译执行的语言**

编译执行是在编写完程序之后，通过特定的工具软件将源代码经过目标代码转换成机器代码，即可执行程序，然后直接交操作系统执行，也就是说程序是作为一个整体来运行的。这类程序语言的优点是执行速度比较快，另外，编译链接之后可以独立在操作系统上运行，不需要其它应用程序的支持；缺点是不利于调试，每次修改后都要执行编译链接等步骤，才能看到其执行结果。

**B.解释执行的语言**

解释执行是程序读入一句执行一句，而不需要整体编译链接，这样的语言与操作系统的相关性相对较小，但运行效率低，而且需要一定的软件环境来做源代码的解释器。当然，有些解释执行的程序并不是使用源代码来执行的，而是需要预先编译成一种解释器能够识别的格式，再解释执行。

**(3)按思维模式分类**

**A.面向过程的语言**

所谓面向过程就是以要解决的问题为思考的出发点和核心，并使用计算机逻辑描述需要解决的问题和解决的方法。针对这两个核心目标，面向过程的程序设计语言注重高质量的数据结构和算法，研究采用什么样的数据结构来描述问题，以及采用什么样的算法来高效的解决问题。在20世纪70年代和80年代，大多数流行的高级语言都是面向过程的程序设计语言，如Basic、Fortran、Pascal和C等。

**B.面向对象的语言**

面向对象（Object Oriented）不仅仅是一种程序设计语言的概念，应该说是一种全新的思维方式。面向对象的基本思想就是以一种更接近人类一般思维的方式去看待世界，把世界上的任何一个个体都看成是一个对象，每个对象都有自己的特点，并以自己的方式做事，不同对象之间存在着通讯和交互，以此构成世界的运转。用计算机专业的术语来说，对象的特点就是它们的属性，而能做的事就是他们的方法。常见的面向对象的程序设计语言包括C++和Java等。面向对象方法大大提高了程序的重用性，而且从相当程序上降低了程序的复杂度，使得计算机程序设计能够对付越来越复杂的应用需求。其中最为突出的是Java语言，以其严谨、可靠和跨平台性成为现代程序设计，尤其是网络应用程序的主流语言。

### 三、TIOBE 编程语言社区排行榜

TIOBE 编程语言社区排行榜是编程语言流行趋势的一个指标，每月更新，这份排行榜排名基于互联网上有经验的程序员、 课程和第三方厂商的数量。排名使用著名的搜索引擎（诸如 Google、MSN、Yahoo!、Wikipedia、YouTube 以及 Baidu 等）进行计算。

该指数可以用来检查你的编程技能是否仍然是最新的或做出什么开始建立一个新的软件系统时，编程语言应采取的战略决策。TIOBE 2016年3月编程语言排行榜如图1.2所示。从TIOBE的统计可以看到，Java、C、C++稳居前三。

![image-20220719231146690](C:\Users\wzn\AppData\Roaming\Typora\typora-user-images\image-20220719231146690.png)

## **1.2 Java历史与发展**

### Java的历史与发展

Java平台和语言最开始只是Sun Microsystems公司（简称 Sun公司）在1990年12月开始研究的一个内部项目。Sun公司的一个叫做帕特里克·诺顿的工程师被Sun自己开发的C++和C语言编译器搞得焦头烂额，因为其中的API极其难用。帕特里克决定改用NeXT，同时他也获得了研究公司的一个叫做“Stealth 计划”的项目的机会。

“Stealth 计划”后来改名为“Green计划”，詹姆斯·高斯林和麦克·舍林丹也加入了帕特里克的工作小组。他们和其他几个工程师一起在加利福尼亚州门罗帕克市沙丘路的一个小工作室里面研究开发新技术，瞄准下一代智能家电（如微波炉）的程序设计，Sun公司预料未来科技将在家用电器领域大显身手。团队最初考虑使用C++语言，但是很多成员包括Sun 的首席科学家比尔·乔伊，发现C++和可用的API在某些方面存在很大问题。

工作小组使用的是内嵌类型平台，可以用的资源极其有限。很多成员发现C++太复杂以至很多开发者经常错误使用。他们发现C++缺少垃圾回收系统，还有可移植的安全性、分布程序设计、和多线程功能。最后，他们想要一种易于移植到各种设备上的平台。

根据可用的资金，比尔·乔伊决定开发一种集C语言和Mesa语言大成的新语言，在一份报告上，乔伊把它叫做“未来”，他提议Sun公司的工程师应该在C++的基础上，开发一种面向对象的环境。最初，高斯林试图修改和扩展C++的功能，他自己称这种新语言为 C++ ++ --，但是后来他放弃了。他将要创造出一种全新的语言，被他命名为“Oak”（橡树），以他的办公室外的树而命名。

就像很多开发新技术的秘密的工程一样，工作小组没日没夜地工作到了1992年的夏天，他们能够演示新平台的一部分了，包括Green操作系统，Oak的程序设计语言，类库，和其硬件。最初的尝试是面向一种类PDA设备，被命名为Star7，这种设备有鲜艳的图形界面和被称为 “Duke”的智能代理来帮助用户。1992年12月3日，这台设备进行了展示。

同年11月，Green计划被转化成了“FirstPerson有限公司”，一个Sun公司的全资子公司，团队也被重新安排到了帕洛阿尔托。FirstPerson团队对建造一种高度互动的设备感兴趣，当时代华纳发布了一个关于电视机顶盒的征求提议书时（Request for proposal）， FirstPerson改变了他们的目标，作为对征求意见书的响应，提出了一个机顶盒平台的提议。但是有线电视业界觉得FirstPerson的平台给予用户过多地控制权，因此FirstPerson的投标败给了SGI。与3DO公司的另外一笔关于机顶盒的交易也没有成功，由于他们的平台不能在 电视工业产生任何效益，公司再并回Sun公司。

1994年6月、7月间，在经历了一场历时三天的脑力激荡的讨论后，约翰·盖吉、詹姆斯·高斯林、比尔·乔伊、帕特里克·诺顿、韦恩·罗斯因和埃里克·斯库米，团队决定再一次改变了努力的目标，这次他们决定将该技术应用于万维网。他们认为随着Mosaic浏览器的到来，因特网正在向同样的高度互动的远景演变，而这一远景正是他们在有线电视网中看到的 。作为原型，帕特里克·诺顿写了一个小型万维网浏览器，Web Runner，后来改名为Hot Java 。同年，Oak改名为Java。商标搜索显示，Oak已被一家显卡制造商注册，因此团队找到了一个新名字。这个名字是在很多成员常去的本地咖啡馆中杜撰出来的。名字是不是首字母缩写还不清楚，很大程度上来说不是。虽然有人声称是开发人员名字的组合：James Gosling（詹姆斯·高斯林）Arthur Van Hoff（阿瑟·凡·霍夫）Andy Bechtolsheim（安迪·贝克托克姆），或“Just Another Vague Acronym”（只是另外一个含糊的缩写）。还有一种比较可信的说法是这个名字是出于对咖啡的喜爱，所以以Java咖啡来命名。类文件的前四个字节如果用十六进制阅读的话，分别为“CA FE BA BE”，就会拼出两个单词“CAFE BABE”（咖啡宝贝）。

Java是印度尼西亚爪哇岛的英文名称，因盛产咖啡而闻名。其中许多库类名称多与咖啡有关，如JavaBeans（咖啡豆）、NetBeans（网络豆）及ObjectBeans（对象豆），等等。它的表示也正是一杯正冒着热气的咖啡。

### **Java的历史：**

1991年4月，Sun公司开发了一种名为OaK的语言来对其只能消费产品（如电视机、微波炉等）进行控制。

1995年5月，Sun公司正式以Java来命名这种自己开发的语言。

1998年12月，Sun公司发布了全新的Java 1.2版，标志着Java进入了Java 2.0（Java two）时代，Java也被分成了现在的J2SE、J2EE和J2ME三大平台。这三大平台至今仍满足着不断增长的市场需求。

2002年2月，Sun公司发布了JDK 1.4，JDK 1.4的诞生明显提升了Java的性能。

2002年6月，Sun公司公开Java SE 6.0.同年公开了Java语言的源代码。

2004年9月30日18:00PM，J2SE1.5发布，成为Java语言发展史上的又一里程碑。为了表示该版本的重要性，J2SE1.5更名为Java SE 5.0。

2005年6月，Java One大会召开，SUN公司公开Java SE 6。此时，Java的各种版本已经更名，以取消其中的数字“2”，J2EE更名为Java EE，J2SE更名为Java SE，J2ME更名为Java ME。

2006年12月，SUN公司发布JRE6.0。

2009年4月，Oracle公司以74亿美元收购Sun公司，取得Java的版权。

2010年9月，JDK 7.0发布，增加了简单闭包功能。

2010年11月，由于Oracle对于Java社区的不友善，因此Apache扬言将退出JCP。

2011年7月，Oracle公司发布Java 7.0的正式版。

2014年3月19日，Oracle公司发布java8.0的正式版。

### **Java的三个版本**

目前，共有3个独立的版本，用于开发不同类型的应用程序。

Java SE. Java SE的全称是 Java Platform Standard Edition（Java平台标准版），是Java技术的核心，主要用于桌面应用程序的开发。

Java EE. Java EE的全称是 Java Platform Enterprise Edition（Java平台企业版），主要应用于网络程序和企业级应用的开发。任何Java学习者都需要从JavaSE开始入门， JavaSE是Java语言的核心，而JavaEE是在JavaSE的基础上扩展的。

Java ME. Java ME的全称是 Java Platform Micro Edition（Java平台微型版），主要用于手机游戏、PDA、机顶盒等消费类设备和嵌入式设备中。

## **1.3 Java体系结构**

### Java体系结构概览

本课程讲解Java SE平台的核心技术。Java SE Development Kit 8 Documentation对Java SE体系结构做了清晰的介绍，如图1.3所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/a.png)

这个图虽然比较详细，但是不容易理解。为了便于理解，我们介绍一种简化的体系结构。这里认为完整的Java体系结构包括四个组件：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java编程语言

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java类文件格式

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java应用程序编程接口（API, Application Programming Interfaces）

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java虚拟机

![image-20220719231510665](C:\Users\wzn\AppData\Roaming\Typora\typora-user-images\image-20220719231510665.png)

其中，Java虚拟机（JVM）与核心类（API）的组合形成**Java平台**,也称**Java运行时环境（JRE, Java Runtime Environment）**，位于所用的操作系统平台之上。**Java类文件**和**Java编程语言**组成了Java应用程序。Java应用程序运行在Java运行时环境之上。我们编程人员要完成的工作是用Java编程语言编写应用程序。在编写应用程序的时候可能会调用Java核心类（API）或者Java扩展类库中的文件。另外，在图1.2中，JRE与操作系统之间有本地方法。本地方法是连接**Java虚拟机（JVM）** 和真实系统的关口，它提供对资源的访问，如网络、视窗系统和主机文件系统等。它是在主机平台上用**本地编译语言（如 C/C++ 等）**实现的。

需要注意的是，在实际的 Java 平台中，核心类和支持文件（JRE）与Java虚拟机（JVM）通常实现为不同的实体。 考虑一种常见的情况：当我们在 Windows 系统平台上用 JDK 开发 Java 程序的时候，会用解释器 Java.exe 去执行 Java Application 程序。此时，当我们用启动这个Java解释器的时候，实际上会同时启动了JVM和JRE。

### Java 虚拟机（JVM)

Java 源程序经过编译后生成二进制形式的字节码文件需要由 Java 虚拟机（JVM）去执行， JVM 是执行 Java 程序的引擎。我们可以认为 JVM 是在一台计算机上由软件模拟，也可用硬件实现的假想的计算机，它定义了指令集（相当于中央处理器 CPU）、寄存器、类文件结构栈、垃圾收集堆、内存区域等。而 Java 程序编译后得到的二进制形式的字节码实际上就是JVM指令。

通常见到的 JVM 是在主机操作系统上由软件实现的，在这中情况下， JVM 实际上是操作系统平台上的用本地语言（如C/C++等）编写的一个程序。JVM 在运行的时候会有如图1.5所示的结构：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/c.png)

这里， Java 虚拟机是主机操作系统上运行的一个程序，它主要包括两个模块，一个是类装载器，一个是执行引擎。类装载器负责加载应用程序的类文件和 Java API 的类文件。执行引擎负责执行类装载器装载进来的字节码指令和数据。Java 字节码文件中的指令格式和数据格式都是专有的，与本地主机系统平台的指令格式或数据格式往往不相同，因而这样的二进制形式的文件不能直接驱动本地主机系统工作，执行引擎的功能就是把 Java 的字节码文件中的指令和数据转换成本地主机系统能够识别的指令和数据的格式，然后把它交给本地主机系统去执行。当然，如果需要的话，执行引擎在程序执行过程中有可能会调用本地方法访问主机操作系统资源。这里的本地方法，往往就是用本地语言（如 C/C++ 等）编写的动态链接库。

这里要注意的是，当 JVM 是在主机操作系统上由软件实现时， JVM 实际上是用 C/C++ 之类的本地语言编写的程序。这个 JVM 程序是和具体的主机平台相关的，不同的系统平台需要安装不同版本的虚拟机程序。通常说的 Java 程序的平台无关性是指我们在把 Java 源程序编译成字节码文件之后，这个字节码文件可以放到任何的系统平台上的 JVM 上运行。Java 程序平台无关，而 JVM 平台相关。下面的图1.6说明了这个问题。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/d.png)

### Java 类文件

JVM 无法直接执行我们用 Java 语言编写的源程序，我们需要用 Java编译器把 Java 语言编写的源程序编译为字节码文件。编译时，Java 编译器会为源程序中的每个类单独生成一个类文件。例如，如果源程序中定义了三个类，那么编译之后会生成三个类文件，每个类文件的文件名和源程序中对应的类名相同。在 Java 类文件中存储的是称为**字节码**的二进制代码，这些字节码是JVM的指令，符合Java虚拟机规范。由于所有的JVM全部遵守Java虚拟机规范，也就是说所有的JVM环境都是一样的，这样一来，字节码文件在各种JVM上都可以运行。

可以想象，Java 类文件实际上不一定非要用 Java 语言编写源程序然后用 Java 编译器编译得到，实际上还有许多其它的办法得到。例如，一种比较笨的办法是我们可以手工编写类文件——我们直接编辑二进制的文件，让我们编写的二进制文件符合 JVM 规定的类文件格式，这样我们就可以手工得到类文件了。当然，我们可以用其它语言比如 C 语言得到类文件，只要让我们的 C 程序生成符合类文件格式的二进制文件就可以了。总之，不管怎么得到类文件，只要这个文件中的二进制代码符合JVM的字节码规范，那么就可以在 JVM 上运行。

### Java 编程语言、Java API 和 Java程序

有编程经验的人都知道，实际上，编程语言本身提供的功能往往是很有限的，很多常用功能往往是通过应用程序编程接口（API）来提供的， Java 也是这样的。 Java 应用程序编程接口（API， Application Programming Interface）是预先编好的代码，这些代码能够完成常用的功能，比如数据的输入输出、图形用户界面编程等等。Java API 的代码以类和接口的形式组成类似主题的包，供我们编程使用。下面的表1-2列出了一些常用的系统包：

**表1-2 常用系统包**

|  Java API 包  |                             功能                             |
| :-----------: | :----------------------------------------------------------: |
|  java.applet  |          提供对通用Applet的支持，是所有Applet的基类          |
|   java.awt    | 提供组建标准图形用户界面(GUI)的系统类。包含了众多的图形组件、方法和事件 |
|   java.lang   |                    包含java语言的核心类库                    |
|   java.net    |                    实现java网络功能的类库                    |
|    java.io    |                        包含输入输出类                        |
| java.security |                      支持java程序安全性                      |
|   java.util   |                      提供各种实用工具类                      |

Java API 是Java 编程的基础结构之一，是 Java 平台的一个组成部分（如前所述，Java API 和 JVM 共同组成了 Java 运行时环境，也称 Java 平台），任何实现 Java 平台的人或组织都要给出 Java API 的具体实现。具体用什么办法得到 Java　API 由实现 Java 平台的人去决定，最终的二进制代码只要符合 JVM 规范就成。由此可见， Java API 的类文件天生就与主机平台密切相关，不同的主机平台上的 Java API文件是不同的，但是完成的功能却是相同的。正是由于在每个特定的主机平台上明确地实现了 Java 虚拟机和 Java API，才使得 Java 程序本身能够具有平台无关性。

在实际运行 Java 程序时，虚拟机装载程序的类文件和所使用的 Java API 类文件。所有被装载的类文件（包括从应用程序中和从 Java API 中提取的）和所有已经装载的动态链接库（包含本地方法）共同组成了在 Java 虚拟机上运行的整个程序。



## **1.4拓展阅读**

### Sun Microsystems被Oracle收购的背后影响

2009年Oracle收购Sun。人们当时就在猜测谷歌可能也是此次竞购的买家。谷歌当初有意收购Sun在很大程度上是为了实现其提升自有软件平台的野心。假如当初谷歌得到Java，他们无疑会为其提供特殊的发展空间。而最终，机会就这样从指尖溜走了。

早在2009年，Oracle公司就斥资74亿美元收购了在Unix服务器硬件领域光彩夺目的制造企业Sun Microsystems。许多人当时都在猜测谷歌是否也是此次竞购的买家之一。谷歌的资金储备无疑是雄厚的，不过真正的问题在于收购的理由：许多分析人士都认为Sun公司的黄金时期已成往事，谷歌并没有充分的理由将其招至麾下。

当然，现在Oracle公司已经拥有了与Java相关的一切专利及版权(Java这项技术最初正是由Sun公司所创立的)，而谷歌也极有可能为自己的犹豫付出代价：尽管并未取得授权，谷歌的Android系统中仍然用到了Java技术。根据目前的情况来看，Oracle公司的赢面相当大，无论是即时生效的罚款裁决、还是根据Android平台的实际盈利按百分比计费，当初付出的74亿美元收购金额中的很大一部分恐怕都要由谷歌来承担了。

Oracle公司从Android盈利中强插一脚的现状并非谷歌应当收购Sun公司的惟一理由。换句话说，这实际上应该被称为战略失误。这种失误不仅使谷 歌费尽心力所打造的标准化软件开发平台在竞争前景方面蒙上了一层阴影，更动摇了近年来苹果及Android得以借势腾飞的这场设备革命的根基。

历史上由并购活动所造成的巨大失误屡见不鲜。微软在这方面可谓“久经考验”了。网络电视并购事件最终带给我们的是微软IP电视，即Mediaroom的领先地位。当然，这里所谓的“领先”是指我们等了八年以上才见到真正可行的IP电视平台搭建技术，只是因为这套技术要保证能被微软的其它电视及视频相关技术所兼容。说到这，合并史上的典型失败案例该登场了：微软斥资5亿美元收购Danger公司。这家公司的创始人之一安迪·鲁宾（Andy Rubin）如今在为谷歌工作，而他所负责的正是Android项目。Danger公司的资源一直集中在前途未卜的KIN上，这是一款曾经对微软Windows Phone 7造成过相当威胁的设备。

不过平心而论，并购也并不总是带来灾难。谷歌对YouTube耗资10亿美元的收购就是标准的成功范例。当然，带宽成本的局限使得谷歌很难从YouTube项目本身上盈利，但YouTube作为互联网视频提供者中的领军品牌，肯定能够在其它诸多方面向谷歌回馈丰厚的利润。而且连IP电视及智能手机也将支持访问YouTube当作一项基本功能。

谷歌当初有意收购Sun Microsystems公司在很大程度上是为了实现其提升自有软件平台的野心。Solaris系统对谷歌意义有限，而且有可能会被那些关注客户硬件情况的买家（Oracle公司就是主要候选人之一）单独拍下。Sun公司的软件才是重中之重，他们自主研发或是拥有的软件能够为任何一家企业在.NET或是Objective-C/Cocoa方面提供进行开发所必备的强大API；不仅如此，这些软件同时提供了强大的办公套件，能够以特殊的方式对自己的在线文字处理工具进行补充及增强。这两个方面对微软来说绝对是实实在在的威胁，因为它们所针对的正是微软公司立足的根本（即Windows系统平台及Office办公软件）。

假如当初是谷歌拍到了Java，他们无疑会为其提供特殊的发展空间，类似一款API，旨在帮助这项已经相当流行的技术进一步普及。大多数刚刚走出校门的程序员对这款平台非常熟悉，而且Java在包括电视及移动设备在内的诸多领域都具备深厚的覆盖基础。当然，谷歌同时也不会停止对其它开发技术的支持或是放缓将应用程序客户端推向网络接口的脚步。无论如何，即使在客户端领域，本地应用程序也还有不少潜力可供挖掘。Andy Rubin以及Android团队很清楚这一点，这也是他们在开发技术方面选择了Java，而不是像Palm在Web OS项目中那样选择HTML/CSS/JavaScript之类的原因。

这样一种定位如今可以说恰逢其时。微软眼下正积极筹备自己的手机及平板设备，而确定要应用在这些设备上的未来计算平台都不是微软自家出品。

进一步来说，微软正为其用户界面战略酝酿一套大规模的改革方案，这其实给那些与微软公司向来保持亲密合作关系的开发商们带来了不小的压力。微软最近发布的Windows 8新基础概念吸引了很多人。开始屏幕将支持那些由HTML、CSS以及JavaScript所编写的应用程序，这不仅颇具趣味性、更是一种重大进步。而Windows开发商们则注意到，.NET似乎成了被遗弃的孤儿。那些由.NET所开发的应用程序在全新的Windows 8桌面系统上将无法继续保持任何具有倾向性的特权。更让人费解的是，微软拒绝对上述情况做出明确回应，无论是证实还是否认。

也许，正如许多人所主张的，这完全是对谣传的一种肆意夸大。然而，微软公司在与开发商的交流方面一直做得很到位，像这样不同于以往的“失误”反而进一步加剧了.NET将被打入冷宫这类传言的可信程度。正如Tim Anderson最近在The Register网站上所指出，“在外界看来，好像微软的服务器及工具部门在向一个方向努力，而Windows团队则将目标定在了另一个方向。”作为一名曾在微软就职过的前员工，我得说公司内部不同产品的开发团队之间在配合方面的表现糟糕到不能解释。由此看来，.NET开发社区中弥漫着的悲观氛围似乎确实具有合理性。

微软的痛苦大概会成为谷歌的快乐。祸起萧墙的微软实际上是给竞争对手提供了一个千载难逢的机会；而抓住这个机会的谷歌打造了一个平台，一个足以当作备选方案的可靠平台。

谷歌希望自身成为应互联网时代之需所诞生的平台，这在其对浏览器的重视程度方面就得到了体现；但显然，Android系统的成功让谷歌在成功之路上又迈进了一大步。每家提供平台的企业都需要一款标准API。苹果有Objective-C及Cocoa。微软有.NET，虽然其公司内部的团队也不爱用这套东西。而谷歌呢，谷歌本来有机会获得Java。鉴于谷歌在开源社区中的群众基础相当不错，他们其实本可以将Java纳入麾下并直接为开发工作提供助力的，但最终，机会就这样从指尖溜走了。

## 动手项目1-1：了解Java

**所需时间：**30分钟。

**项目目标：**了解Java技术概况。

**过程描述：**浏览Java官网，了解Java概况。

（1）用浏览器浏览Java官网。

Java官网网址是http://www.oracle.com/technetwork/java/index.html

（2）解释下述名词：Java SE、Java EE、Java ME、Java DB。

## **1.6小结**

### 小结

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 计算机硬件能够直接执行的程序是机器语言程序。机器语言是以二进制代码的形式组成的机器指令序列。计算机中的指令和数据都是二进制数形式表示的，也就是说计算机存储器中存储的程序和数据都是二进制数形式的，中央处理器及其它电路处理的也都是二进制数。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 程序设计语言的分类：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/10.png)

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java的历史与发展：

1995年5月，Sun公司正式以Java来命名其公司新开发的语言。

1998年12月，Sun公司发布了全新的Java 1.2版，标志着Java进入了Java 2时代。

2005年6月，Sun公司公开Java SE 6。此时，Java的各种版本已经更名，以取消其中的数字“2”，J2EE更名为Java EE，J2SE更名为Java SE，J2ME更名为Java ME。

2009年4月，Oracle公司以74亿美元收购Sun公司，取得Java的版权。

2014年3月19日，Oracle公司发布java8.0的正式版。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java的三个开发平台：

Java SE，是Java技术的核心，主要用于桌面应用程序的开发。

Java EE，主要应用于网络程序和企业级应用的开发。

Java ME，主要用于手机游戏、PDA、机顶盒等消费类设备和嵌入式设备中。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java体系结构包括四个组件

(1) Java编程语言

(2) Java类文件格式

(3) Java应用程序编程接口（API, Application Programming Interfaces）

(4) Java虚拟机

## **1.7 思考题**

**1.为什么机器语言程序是计算机能够直接执行的程序？**【隐藏】

**答：**计算机中，无论简单还是复杂的操作，最终都能分解为一系列最基本的操作，每一个基本操作都有一条指令与之对应。计算机中的指令和数据都是二进制数形式表示的，也就是说计算机存储器中存储的指令和数据都是二进制数形式的，中央处理器及其它电路处理的也都是二进制数。而机器语言是直接用二进制数表示指令和数据的计算机语言，因此使用机器语言编写的程序可以被计算机的中央处理器（CPU）直接执行。

**2.程序设计与语言有哪些分类方法？不同类别的程序设计语言有何特点？**【隐藏】

**答：**(1)按发展过程分类：早期使用二进制形式的机器语言编程，后来使用助记符形式的汇编语言编程，再后来使用接近人类自然语言的高级语言编程。

(2)按执行方式分类：解释执行语言是读入一条语句就解释一条语句然后执行一条语句；而编译执行的语言是把源程序的语句全部编译成二进制的机器代码后，加载编译后的机器代码执行。

(3)按思维模式分类：面向过程的语言以要解决的问题为思考的出发点和核心，并使用计算机逻辑描述需要解决的问题和解决的方法；而面向对象的语言以一种更接近人类一般思维的方式去编写程序。

**3.程序的解释执行和编译执行有什么不同？它们相比较，各自有哪些优缺点？**【隐藏】

**答：**编译执行是在编写完程序之后，通过特定的工具软件将源代码经过目标代码转换成机器代码，即可执行程序，然后直接交操作系统执行，也就是说程序是作为一个整体来运行的。这类程序语言的优点是执行速度比较快，另外，编译链接之后可以独立在操作系统上运行，不需要其它应用程序的支持；缺点是不利于调试，每次修改后都要执行编译链接等步骤，才能看到其执行结果。

解释执行是程序读入一句执行一句，而不需要整体编译链接，这样的语言与操作系统的相关性相对较小，但运行效率低，而且需要一定的软件环境来做源代码的解释器。当然，有些解释执行的程序并不是使用源代码来执行的，而是需要预先编译成一种解释器能够识别的格式，再解释执行。

**4.TIOBE 编程语言社区排行榜说明了怎样的事实？**【隐藏】

**答：**从TIOBE的统计可以看到，编程语言使用广泛程序上，Java、C、C++稳居前三。

**5.Java体系结构由哪些基本组成部分组成？各组成部分有怎样的功能？它们是如何协同工作的？**【隐藏】

**答：**完整的Java体系结构包括四个组件：Java编程语言、Java类文件格式、Java应用程序编程接口（API, Application Programming Interfaces）和 Java虚拟机。它们之间的关系如下图所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/r.png)

**6.API是什么？编程时为什么要使用API？**【隐藏】

**答：**有编程经验的人都知道，实际上，编程语言本身提供的功能往往是很有限的，很多常用功能往往是通过应用程序编程接口（API）来提供的。所谓API，就是预先编好的代码，这些代码能够完成常用的功能，比如数据的输入输出、图形用户界面编程等等。API随运行时平台一起安装到计算机上，为用户程序的执行提供基本的支持。

**7.Java有哪些常见的API包？它们包含的代码的主要功能是什么？**【隐藏】

**答：**

| **Java API 包** | **功能**                                                     |
| --------------- | ------------------------------------------------------------ |
| java.applet     | 提供对通用 Applet 的支持，是所有 Applet 的基类               |
| java.awt        | 提供组建标准图形用户界面（GUI）的系统类。包含了众多的图形组件、方法和事件 |
| java.net        | 实现 Java 网络功能的类库                                     |
| java.io         | 包含输入输出类                                               |
| java.security   | 支持 Java 程序安全性                                         |
| java.util       | 提供各种实用工具类                                           |

# **第2章 Eclipse集成开发环境**

本章介绍Java的开发环境和运行环境，以及Java开发环境和运行环境的安装和配置。此外，本章还会使用Eclipse开发一个简单的Java程序。本章涉及：

JDK的安装和配置；

Java SE Documentation的下载和使用；

Eclipse的安装和配置；

Eclipse的基本使用方法；

使用Eclipse开发一个简单的Java程序。

## **2.1 JDK的下载、安装和配置**

### 主体内容

JDK 的全称是Java SE Development Kit，即Java标准版开发包，是Java官网提供的一个用于开发Java应用程序的开发包。JDK提供了开发Java程序所需的各种工具（诸如Java编译器、Java虚拟机等程序）和资源，同时也提供了运行Java程序的Java运行时环境。

### 活动1：观看关于JDK的下载、安装和设置环境变量的视频

**1.登录Java官网：**

http://www.oracle.com/technetwork/java/index.htm ，选择“Downloads/Java SE”，在新页面中选择“Java Platform (JDK) 8u91 / 8u92”下载JDK，在新页面中选择“Accept License Agreement”，选择相应主机平台上的JDK安装程序下载。

**2.下载JDK8。下载过程中需要注册Oracle账户。**

**3.安装JDK8。解释安装选项的含义 。**

**4.设置环境变量。**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 使用控制面板配置环境变量：控制面板\系统和安全\系统，左侧的选项列表中选择“高级系统设置”，打开“系统属性”对话框，在“高级”标签页中选择“环境变量”，在弹出的“环境变量”对话框中设置系统环境变量。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 配置JAVA_HOME、Path、CLASSPATH。

**5.测试安装及配置。**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 若要打开「开始」菜单，请单击屏幕左下角的「开始」按钮 。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 左边窗格的底部是搜索框，通过键入搜索项可在计算机上查找程序和文件。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 在搜索框中键入命令：cmd，然后按“Enter”键，打开命令提示符窗口。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 在命令提示符窗口中输入：

set 然后回车，查看环境变量的设置是否正常。

javac 然后回车，根据结果判断安装、配置是否正常。

### **活动1的解析：**安装JDK和配置环境变量中的一些概念

**(1)环境变量**

环境变量（Environment Variables）是指在操作系统中用来指定操作系统运行环境的一些参数的变量，如：临时文件夹位置和系统文件夹位置等的变量。

环境变量相当于给系统或用户应用程序设置的一些参数，具体起什么作用这当然和具体的环境变量相关。比如path，是告诉系统，当要求系统运行一个程序而没有告诉它程序所在的完整路径时，系统除了在当前目录下面寻找此程序外，还应到哪些目录下去寻找；再如tc或vc++中，set include=path1;path2; 是告诉编译程序到哪里去找.h类型的文件；当然不仅仅是指定什么路径，还有其它的作用的，如set dircmd=/4 设置一个环境变量的作用是在使用dir命令时会把/4作为缺省的参数添加到你的dir命令之后，就像你的每个命令都加了/4参数，它实际上是给命令解释程序command设置的一个环境变量，并且是给dir这个内部命令设置的。

**(2)JDK的环境变量**

**path：**设置JDK命令搜索路径。告诉操作系统，当要运行的JDK提供的工具程序没在当前目录时，到path包含的路径中去寻找相应的程序。

**JAVA_HOME：**设置JDK的安装路径。

**CLASSPAHT：**在于告诉Java执行环境，在哪些目录下可以找到您所要执行的Java程序所需要的类或者包。JVM和其它JDK工具通过依次搜索平台库、库扩展和类路径来查找类。当我们在编译或执行Java程序时可能会遇到类似“java.lang.ClassNotFoundException:ClassName.class”的错误，这时就要检查classpath环境变量的设置是否合适，确保JVM能够找到Java程序中引用的类包。

**本例设置系统环境变量：**

Set Path=%Path%; C:\Program Files\Java\jdk1.8.0_92\bin;

Set JAVA_HOME= C:\Program Files\Java\jdk1.8.0_92

Set CLASSPATH=.;%JAVA_HOME%\lib; %JAVA_HOME%\lib\tools.jar

**其中，点（.）表示当前路径。**

**PS：**Java解释器和其它命令行工具都知道如何找到核心（core）类，它们在安装时都会包括进去。这些类不必包含在类路径CLASSPATH中，Java解释器和其它工具都可以自动找到它们。多数应用程序的类库都会充分利用扩展机制，因此，只有想要加载的某个类库没有在当前目录或其分包中，并且不在扩展机制所指定的位置时，才需要设置类路径。

### 活动2：亲自下载、安装JDK并设置环境变量

请你到Java官网（http://www.oracle.com/technetwork/java/index.html ）下载JDK，并在你自己的计算机上安装JDK、配置环境变量，并在命 令提示符窗口中验证环境变量设置的正确性。

**要点1**：安装JDK和配置环境变量的要点

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JDK包含了Java程序的开发环境也包含了Java程序的运行时环境。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 安装JDK时可以简单地选择使用安装程序提供的默认选项设置。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 安装完JDK后要设置环境变量。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 环境变量设置完成后，最好在用命令提示符窗口中使用set命令，查看并确认环境变量设置是否正确。若不正确，需重新设置正确的环境变量。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 可在互联网上利用搜索引擎寻找JDK的下载源，不一定必须到Java官网下载。如果下载源是非官方的，要谨慎确认下载到的JDK安装文件没有安全风险。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 下载JDK的时候，可同时下载官方的“Java SE Development Kit 8u91 Demos and Samples”，那是一个压缩文件，解压缩时候，可以看到其中包含了很多实例程序和例子程序，它们都是很好的学习材料。

## **2.2 JDK的目录结构及文件**

### 一、JDK 8 的目录结构

JDK安装完成后，可以看一下它的目录结构和文件。下面以安装在Windows操作系统上的JDK为例说明。

按照上述方法安装JDK，实际上是同时安装了Java开发工具包（JDK）和Java运行时环境（JRE）。下面看一下它的目录结构。

**安装OS：**Windows 7

**JDK版本：**jdk-8u73-windows-x64.exe

**安装路径：** C:\Program Files\Java

C:\Program Files\Java\jdk1.8.0_92，是JDK的文件目录。

C:\Program Files\Java\jre1.8.0_92，是JRE的文件目录。

**JDK开发文件和目录**

\jdk1.8.0_92——JDK的根目录，包含一些软件版权，声明，和自述文件，同时包含归档了的Java平台源代码包src.zip。

\jdk1.8.0_92\bin——JDK包含的一些开发工具执行文件。

\jdk1.8.0_92\lib——Java开发工具要用的一些库文件，有包含了支持JDK工具的非核心类库tools.jar，dt.jar等。

\jdk1.8.0_92\jre ——JDK使用的Java运行环境（JRE）的根目录，这个运行环境实现了Java平台。

\jdk1.8.0_92\jre\bin——Java平台所要用的工具执行文件和一些动态链接库文件。其中的可执行文件和 /jdk1.8.0_92/bin相同的。

\jdk1.8.0_92\jre\lib——JRE要用的代码库，属性设置，资源文件。

\jdk1.8.0_92\include——包含 C 语言的头文件，支持 Java 本地接口和 Java 虚拟机调试程序接口的本地代码编程技术。

\jdk1.8.0_92\db——纯Java开发的数据库 Derby，是一个开源的100%Java开发的关系数据库。开发Java程序是可以选用此数据库作为后台数据库。

### 二、JDK 8 的常用工具程序

基本工具

这些工具是JDK的基础，用这些工具来编写应用程序。

javac.exe——Java语言编译器

java.exe——Java应用程序启动器，JDK 1.6版里同时用于开发和部署，旧的部署启动器，jre，不在提供

javadoc.exe——Java API 文档生成器

apt.exe——java 注释处理器

appletviewer.exe——java applet 小程序查看器

jar.exe——java文件压缩打包工具

jdb.exe——Java 调试器.

javah.exe——C 头文件和stub生成器，用于写本地化方法，例如生产JNI样式的头文件

javap.exe——class文件 反编译工具

extcheck.exe——用于检测jar包中的问题

安全工具

这些工具用于设置系统的安全规则和生产可以工作在远端的安全规则下的应用程序

keytool.exe——管理密钥库和证书.

jarsigner.exe——生产和校验JAR签名

jpolicytool.exe——有用户界面的规则管理工具

kinit.exe.exe——用于获得和缓存网络认证协议Kerberos 票证的授予票证

klist.exe.exe—— 凭据高速缓存和密钥表中的 Kerberos 显示条目

ktab.exe.exe——密钥和证书管理工具

Java国际化工具

这些工具可以帮助你创建可本地化的应用程序

native2ascii——见文本转化为 Unicode Latin-1。

//这个工具很有意思 ,大家可以看看这里

//http://java.sun.com/javase/6/docs/technotes/tools/windows/native2ascii.html

远程方法调用工具

这些工具可以帮助创建可以和web和网络交互的应用程序

rmic.exe——生成远程对象的stubs and skeletons(存根和框架)

rmid.exe——Java 远程方法调用(RMI:Remote Method Invocation) 活化系统守护进程

rmiregistry.exe——Java 远程对象注册表

serialver.exe——返回类的 serialVersionUID.

Java IDL and RMI-IIOP 工具

这些工具用于创建使用OMG-Standard IDL 和 CORBA/IIOP 的应用程序

tnameserv.exe——Provides access to the naming service

idlj.exe——生产映射到OMG IDL接口可以使Java应用程序使用CORBA的.java文件

orbd.exe——为客户可以在CORBA环境下透明的定位和调用服务器的稳定的对象提供支持

servertool.exe——为应用程序提供易于使用的接口用于注册，注销，启动，关闭服务器

Java 部署工具

pack200.exe——使用java gzip压缩工具将JAR文件转换为压缩的pack200文件。

生产打包文件是高度压缩的JAR包，可以直接部署，减少下载时间。

unpack200.exe——解包pack200文件为JARs。

Java 插件工具

htmlconverter.exe——Java Plug-in HTML转换器 htmlconverter -gui 可以启动图形界面

Java web 启动工具

javaws.exe——Java web 启动命令行工具

Java 故障检修，程序概要分析，监视和管理工具

jvisualvm.exe——一个图形化的Java虚拟机，不说了 大家研究一下就发现太酷了

// 啊这是想了解JVM的人的神器

//http://java.sun.com/javase/6/docs/technotes/guides/visualvm/index.html

jconsole.exe——java监视台和管理控制台，图形界面的功能太强大了，运行一下就知道 ，不想多说，看了就知道。

Java web 服务工具

schemagen.exe ——Java构架的XML Schema生成器

wsgen.exe ——生成 JAX-WS

wsimport.exe——生成 JAX-WS

xjc.exe——绑定编译器

监视工具

监视Java虚拟机的性能，不支持Windows 98 和Windows ME 平台

jps.exe——JVM Process Status 进程状态工具。列出目标系统的HotSpot JJVM

jstat.exe——按照命令行的具体要求记录和收集一个JVM的性能数据

jstatd.exe——JVM jstat 的守护进程

故障检测和修理

jinfo.exe——配置或打印某个Java进程VM flag

jhat.exe——堆储存查看器

jmap.exe ——Java内存图

jsadebugd.exe——Java 的 Serviceability Agent Debug的守护进程

jstack.exe——Java堆栈跟踪

Java脚本工具

jrunscript.exe——运行脚本

//JDK 8工具都在JAVA_HOME\bin目录下，绝大部分工具都有-help命令行参数来提供帮助

JDK中rt.jar、tools.jar和dt.jar作用

jrunscript.exe——运行脚本

dt.jar和tools.jar位于：{Java_Home}/lib/下，而rt.jar位于：{Java_Home}/jre/lib/下,其中:rt.jar是JAVA基础类库，也就是你在java doc里面看到的所有的类的class文件

dt.jar是关于运行环境的类库

tools.jar是工具类库,编译和运行需要的都是toos.jar里面的类分别是sun.tools.java.*; sun.tols.javac.*



## **2.3 Java SE Documentation的下载和使用**

### 主体内容

Java SE Documentation是Java标准版平台的文档。在所有的Java书籍当中，其实最有用处是JDK的 Documentation！

几乎你想获得的所有的知识在Documentation里面全部都有，其中最主要的部分当然是Java基础类库的API文档。该文档是按照package来组织的，对于每一个class都有详细的解释，它的继承关系，是否实现了某个接口，通常用在哪些场合，还可以查到它所有的 public的属性和方法，每个属性的解释、意义，每个方法的用途、调用的参数、参数的意义、返回值的类型、以及方法可能抛出的异常等等。

可以这样来说，所有关于Java编程方面的书籍其实都不过是在用比较通俗易懂的语言，和良好的组织方式来介绍Documentation里面的某个 package里面包含的一些类的用法而已。所以万变不离其宗，如果你有足够的能力来直接通过Documentation来学习Java的类库，那么基本 上就不需要看其他的书籍了。因此，Documentation也是编程必备的手册。

### 活动1：观看关于Java SE Documentation的下载和使用方法的视频

**视频2-2：Java SE Documentation的下载和使用**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 登录网址：http://www.oracle.com/technetwork/java/javase/documentation/jdk8-doc-downloads-2133158.html

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 下载Java SE Development Kit 8 Documentation。下载过程中需要注册Oracle账户并登录。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 下载完成后，解压缩该文件，用浏览器浏览jdk-8u92-docs-all\docs\index.html。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 也可以联机查看Java SE Development Kit 8 Documentation。网址是：http://docs.oracle.com/javase/8/

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java文档最主要的部分是Java基础类库的API文档。这个文档是按照package来组织类的，对于每一个class都有详细的解释，它的继承关系，是否实现了某个接口，通常用在哪些场合，还可以查到它所有的 public的属性和方法，每个属性的解释、意义，每个方法的用途、调用的参数、参数的意义、返回值的类型、以及方法可能抛出的异常等等。



### 活动2：亲自下载Java SE Documentation并阅读

请你到Java SE Documentation的下载网址

（[ http://www.oracle.com/technetwork/java/index.html](http://www.oracle.com/technetwork/java/index.html)）下载Java SE Documentation，

并解压缩该文档，之后用浏览器浏览Java SE Documentation，了解该文档的内容的基本组织方式和大致内容结构。

## **2.4 Eclipse的下载和配置**

### 主体内容

Eclipse 是一个开放源代码的、基于Java的可扩展开发平台。Java程序开发者把它作为Eclipse 当作 Java 集成开发环境（IDE）来使用。一般我们可以安装JDK之后安装Eclipse，用这个集成开发环境开发Java程序更方便、更快捷。

登录Eclipse官网(http://www.eclipse.org/ )，选择Download，下载与你所使用主机平台相对应的版本的Eclipse IDE for Java Developers。

### 活动1：观看关于Eclipse的下载和配置的视频

下面的视频介绍了Eclipse的下载和配置的方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid2-3.png)

**视频2-3：Eclipse的下载和配置**

(1) 先安装JDK。

(2) 登录Eclipse官网(http://www.eclipse.org/ )，选择Download，下载与你所使用主机平台相对应的版本的Eclipse IDE for Java Developers。

(3) 将下载后的文件解压缩，直接运行eclipse.exe即可。

(4) 为eclipse.exe创建桌面快捷方式，以后直接从这个快捷方式启动Eclipse。



活动1的解析：为什么先安装JDK

Eclipse是使用Java 语言开发的，所以Eclipse可运行在任何的Java运行时环境（jre）之上。进一步，安装Eclipse的时候需要先安装一个Java运行时环境（Java运行时环境由Java虚拟机和Java API组成），以便使得Eclipse运行在此Java运行时环境之上。安装JDK的时候就同时安装了Java运行时环境。



### 活动2：亲自下载、安装和配置Eclipse

请你到Eclipse的下载网址（http://www.eclipse.org/download ）下载Eclipse IDE for Java Developers，并解压缩该文件，到解压缩之后的文件夹中找到eclipse.exe，为其创建桌面快捷方式。

## **2.5 开发一个简单的Java程序**

### 主体内容

你将实际开发一个简单的Java程序。通过实际操作，你将了解使用JDK开发Java程序的基本方法和使用Eclipse开发Java程序的基本方法。



### 活动1：创建一个用于练习Java编程的工作目录

请你在D:盘上创建一个文件夹“JavaPrograms”，即目录“D:\JavaPrograms”，用于存放平时练习Java编程的文件。



### 活动2：观看一个使用JDK开发"Hello world"程序的视频

下面的视频介绍了使用JDK开发Java程序的方法。请观看下面的视频。

![image-20220721234014418](C:\Users\wzn\AppData\Roaming\Typora\typora-user-images\image-20220721234014418.png)

**1.先编写一个Java源程序文件。**使用记事本编辑“Hello World”程序。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java2.5.html?node=858292427&detailRecordId=1315571824&studyrecordId=1225624963&sectionRecordId=1229924099#)

```
public` `class` `HelloWorld {``   ``public` `static` `void` `main(String[] args) {``     ``System.out.println(``"Hello World"``);``   ``}``}
```

保存程序到工作目录“D:\JavaPrograms”中，保存类型选“所有文件”，文件名为“HelloWorld.Java”。

【创建一个对象之后，它的数据和方法可以使用圆点运算符（. ）来访问和调用，该运算符也称为对象成员访问运算符（Object member access operator）；本书后面的附录还包括了对其它运算符的说明。】

**2.接下来要编译程序和运行程序。**

JDK提供的Java程序的编译器和解释器都是命令行工具。要使用它们要先启动命令提示符窗口。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 启动方法是：

单击屏幕左下角的，Windows的「开始」按钮，在「开始」菜单，在搜索框中键入命令——cmd，然后按“Enter”键，打开命令提示符窗口。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 接下来要进入到源程序文件所在目录：

在命令提示符窗口中键入D：，按回车键，计入D:盘。键入cd JavaPrograms，进入目录JavaPrograms。键入dir，按回车键，查看一下当前目录下的文件。这个HelloWord.java就是刚才编写的Java源程序文件。

**3.现在用Java编译器这个源程序。**

在cmd命令提示符窗口中，用Java.exe运行程序。在命令提示符窗口中键入javac，这是Java编译器程序名，之后键入空格，再键入Java源程序的名字——HelloWorld.Java，然后按回车键。如果没有看到错误提示，则表示编译通过。然后键入dir命令，会看到这里有一个HelloWorld.class，这是编译后得到的字节码形式的类文件。

**4.下面运行程序。**

在cmd命令提示符窗口中键入java，这是Java解释器程序名，之后键入Java程序的类名——HelloWorld，然后按回车键，就会看到程序的运行结果。

**5.关于类路径。**

重新启动一个命令提示符窗口。

**编译程序：**javac D:\JavaPrograms\HelloWorld.java。

**运行程序：**java HelloWorld。

**会看到“错误：**找不到或无法加载主类HelloWorld”。

这与Java虚拟机加载类的方式有关。JVM和其它JDK工具通过依次搜索平台库、库扩展和类路径来查找类。这个类路径是在环境变量CLASSPATH中设置的路径。由于我们刚才编译得到的HelloWorld类的class文件既没在平台库中，也没在库扩展中，也没在CLASSPATH所指定的类路径中，所以JVM找不到这个类，从而无法加载执行它。下面我们在CLASSPATH所指定的类路径加入HelloWorld类所在的目录，再看一下执行结果。

**键入命令：**set CLASSPATH=%CLASSPATH%;D:\JavaPrograms，HelloWorld的class文件就在D:\JavaPrograms目录下，我们把这个目录添加到CLASSPATH中。

**键入命令：**java HelloWorld

可以看到JVM能够找到这个类，并执行它了。

活动2的解析： 开发Java程序的一些基本概念

**(1) 开发程序的步骤**

开发程序的基本过程分为三步：编辑、编译和运行。 所谓编辑，就是编辑源程序。高级程序设计语言的源程序都是文本文件，可以用任何的文本编辑器编辑。所谓编译，就是将源程序编译成二进制代码的形式。通常使用专门的编译程序将源程序编译成二进制代码。对于C、C++这样的语言来说，编译后得到的二进制代码通常是可执行的目标代码，即该代码可以在目标计算机平台上直接执行。而Java则不同，Java的编译器将Java源程序编译后得到的二进制代码并不能直接在目标主机平台直接执行。虽然编译后的文件是二进制的，但其指令格式和数据格式都是Javaz自己特有的，与任何特定的平台，如Intel、AMD、ARM或MC68等都不同，所以没法直接执行。一般地，人们将Java源程序编译后得到的二进制文件称为字节码文件，因为文件以字节文基本单位。字节码文件的格式、含义和作用由Java虚拟机规范规定。Java虚拟机规范目前有Oracle控制。Java的字节码文件要放到Java虚拟机上执行。你要在主机平台上装一个Java虚拟机（程序），然后在Java虚拟机中运行Java的字节码文件——即Java程序。

**(2) Java源程序文件名的一个约定**

Java源程序如果包含公有类，如本例，则源程序文件名应该与公有类的类名相同。

**(3) Java的编译器**

JDK提供的工具javac.exe是Java的编译程序，用于把Java源程序编译成字节码文件。

**(4) Java的解释器**

JDK提供的工具java.exe是Java的解释器，用于解释执行Java字节码文件。当用java.exe执行Java程序的时候，java.exe会启动一个Java虚拟机，用这个Java虚拟机执行Java字节码文件。

**(5) Java的编译单元**

为Java 创建一个源文件的时候，它通常叫做一个“编译单元”（有时也叫做“翻译单元”）。每个编译单元都必须有一个以.java 结尾的名字。而且在编译单元的内部，可以有一个公有（public）类，它必须拥有与文件相同的名字（包括大小写形式，但排除.java 文件扩展名）。如果不这样做，编译器就会报告出错。每个编译单元内都只能有一个public 类（同样地，否则编译器会报告出错）。那个编译单元剩下的类（如果有的话）可在那个包外面的世界面前隐藏起来，因为它们并非“公有”的（非public），而且它们由用于主public 类的“支撑”类组成。

编译一个.java 文件时，编译器会为此源文件中的每个类单独生成一个.class文件，且每个.class文件的文件名就是该类的类名。因此，当你编译少量的.java 文件里时有可能获得数量众多的.class 文件。如你以前用一种汇编语言写过程序，那么可能已习惯编译器先分割出一种过渡形式（通常是一个.obj 文件），再用一个链接器将其与其他东西封装到一起（生成一个可执行文件），或者与一个库封装到一起（生成一个库）。但那并不是Java 的工作方式。一个有效的程序就是一系列.class 文件，它们可以封装和压缩到一个JAR 文件里（Java归档文件）。Java 解释器负责对这些文件的寻找、装载和解释。

**PS：**本例中只有一个类——HelloWorld，因此编译后只有一个HelloWorld.class文件。你可以自己试着在一个源程序文件中写多个类，然后编译，看看最后由多少个.class文件。

**(6) 圆点运算符（.）**

创建一个对象之后，它的数据和方法可以使用圆点运算符（.）来访问和调用，该运算符也称为对象成员访问运算符（Object member access operator）。



### 活动3：亲自用JDK开发“Hello World”程序

请你按照下述步骤亲自用JDK开发活动2的视频中的“hello World”程序。

**Step 1.** 使用记事本编辑“Hello World”程序。



```
public class HelloWorld {
    public static void main(String[] args) {  
    System.out.println("Hello World");
    }
    }
```

保存程序到工作目录“D:\JavaPrograms”中，保存类型选“所有文件”，文件名为“HelloWorld.Java”。

**Step 2.** 打开cmd命令提示符窗口，用javac.exe编译上述源程序。

**Step 3.** 在cmd命令提示符窗口中，用Java.exe运行程序。



### 活动4：观看一个使用Eclipse开发“Hello Kitty”程序的视频

下面的视频介绍了使用Eclipse开发Java程序的方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid2-5.png)

**视频2-5：使用Eclipse开发“Hello Kitty”程序**

1. 启动Eclipse，设置Eclipse的工作空间（Workspace）。

2. 新建一个Java项目。

3. 在该Java项目中新建一个类。

4. 编辑该类的源程序。

5. 运行该程序。

**活动4的解析**： Eclipse集成开发环境的一些基础知识

**（1）使用集成开发环境开发Java程序更方便**

Eclipse是一个集成开发环境，提供了编辑、编译和运行Java程序的基本工具和一些附加的（插件）组件和服务。用Eclipse之类的集成开发环境开发Java程序比直接用JDK开发Java程序方便多了。PS：软件公司基本都用集成开发环境开发Java程序。

**（2）Java项目与Eclipse的工作空间**

开发一个完成的Java程序可能需要一系列的程序文件、资源文件和其它相关文件，把它们放到一个“Java项目”中便于管理。一般地，都是先创建一个“Java项目”，然后把所有与此项目相关的东西都放到这个Java项目中。而Eclipse的“工作空间”的概念就是一个存放Java项目的磁盘目录，在一个工作空间中可以存放多个Java项目。

**（3）Eclipse的代码生成功能**

理论上，编辑源程序是一个字符地、一个字符地“敲”，就像视频2-4中所做的那样。但如果真的那么做，编写一个几十万行的程序，岂不是要累死了！有些机械性的重复工作其实可以让开发工具去做，程序员只做那些“必要”的工作就成了。Eclipse中的代码生成功能，以及下面将讲到的自动代码补齐功能、代码提示功能就用来完成哪些机械性的重复工作，减轻你的工作负担。

Eclipse具有代码自动生成功能，能提高开发效率。本例中，新建一个类的时候，Eclipse会打开一个Java编辑器窗口，供开发者编辑Java源程序。细心的你可以看到，Java编辑器窗口中已经有了类的声明部分以及界定类体的那对儿花括号。而且如果你在“New Java Class”对话框中选中了“public static void main(String[] args)”前面的复选框，那么在还会已经有了Java Application程序的main()方法。这些都是Java编辑器自动生成的。这样就不用你自己去敲字符了，省事儿多了吧？

除了上述基本代码之外，Eclipse还可以自动生成很多代码，比如根据底层数据结构生成Hibernate持久化访问的POJO、XML迎神文件、DAO；根据页面表单设计生成所需的ActionForm等。你在它自动生成的代码基础上进行编辑和修改，既提高了代码规范性，也提高了开发效率。

**PS：**你可以尽可能多地利用它的代码生成功能。

**（4）Eclipse的自动代码补齐功能**

在本例中，当输入一个左括号的时候，你会看到Java编辑器自动添加了与之配对儿的右括号；当输入一个左边双引号的时候，Java编辑器自动添加了与之配对儿的右双引号。这些都是“自动代码补齐”功能完成的。

Eclipse还具有很多其它的自动代码补齐功能，如编辑XML文档时，你输入一个开始标签，Eclipse会自动为它添加一个结束标签等。这种自动代码补齐功能可以为你减少很多敲字符的工作量。

**PS：**你可以尽可能多地利用它的自动代码生成功能。

**（5）Eclipse的代码提示功能**

本例中，当输入“System”，然后输入“.”之后，稍等一会儿，Java编辑器会自动在“.”之后提示系统类System的方法和属性，提示开发者下一步可以键入的代码。你还可以用上下键选中列表中的某个方法或某个属性，然后按下回车键，这样选中的方法或属性的代码就被自动添加到“.”的后边。不但自动提示，还自动添加，这样就很方便了。

**PS：**编辑程序的时候，有时Eclipse没有给出自动提示，此时可以使用组合键【Alt+/】来获取代码提示。

**（6）Eclipse的自动编译**

刚才看的视频中没有“编辑”就直接“运行”了，这是怎么回事呢？答案在于Eclipse的自动编译。Eclipse默认设置自动编译Java源程序，只要在你的eclipse中建好包结构和编辑好java文件。点击保存，eclipse就会去编译这个文件.然后把编译好的.class文件放入你指定的目录中或是默认目录。你可以配置不自动编译的，你可以看看windows-preference里的设置。java选项里面的。在project选项里面有个重新编译的选项，不过是对整个project而言的。有时你想重新编译一下，你可使用Project->Build Project 来编译当前的项目。

**（7）Eclipse的错误提示功能**

当你在Eclipse的Java编辑器窗口啊编写源程序时，有时会因为不小心或其它原因使得程序有些错误，此时Java编辑器会给程序实时错误提示，以便你修正错误。例如，在本例中，如果在“System.out.println("HelloWorld");”一行中不小心把分号敲成了中文的分号，则可以看到本行左边出现了一个红色的小叉，这就是错误提示。把鼠标放到红色的小叉上，Java编辑器会给你提示错误原因，以便你修改程序，如图2.1所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i1.png)

**图2.1 Eclipse的俄错误提示**

除了实时错误提示之外，Java编辑器也会给出一些实时警告提示，例如图2.2中的警告提示显示变量s在本程序中没有用。当然，这不是错误，不影响程序执行。只是如果变量s如果真的没用的话，最好把当前这个变量声明语句删除掉。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i2.png)

**图2.2 Eclipse的警告提示**



### 活动5：亲自用Eclipse开发“Hello Kitty”程序

请你按照下述步骤亲自用Eclipse开发活动4的视频中的“hello Kitty”程序。

**Step 1.** 启动Eclipse。

**Step 2.** 设定Eclipse的工作空间为“D:\JavaPrograms”。

**Step 3.** 新建一个项目Prj0。

**Step 4.** 在项目Prj0中新建一个Class。设定类名为“HelloKitty”，并让Java编辑器自动生成main()方法。

**Step 5.** 在Java编辑器中编辑缺少的程序代码。最终的程序如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java2.5.html?node=858292427&detailRecordId=1315571824&studyrecordId=1225624963&sectionRecordId=1229924099#)

```
public` `class` `HelloKitty {``  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``   ``System.out.println(``"Hello Kitty"``);``  ``}``}
```

**Step 6.** 保存源程序。

**Step 7.** 运行程序，观察结果。

## **2.6 Eclipse的基本使用方法**

### Eclipse平台简介

Eclipse 是基于Java 的、开放源代码的可扩展开发平台，它最初由IBM 公司投入巨资开发，后来被捐赠给国际开放源代码团体。就其本身而言，它只是一个框架和一组服务，用于通过插件组件构建开发环境。幸运的是，Eclipse附带了一个标准的插件集，包括了Java 开发工具（Java Development Tools，JDT）。

Eclipse的基础是Eclipse平台（Eclipse Platform），Eclipse平台提供软件开发工具的集成服务。所有开发工具（包括JDT 和PDE）都是用插件的形式提供的，这种设计使得Eclipse具有开放式可扩充的结构。比如，想开发C/C++程序，装一个C语言开发工具（C Development Toolkit，简称CDT）插件代替JDT 即可。同理，通过开发相应插件，Eclipse 也可以用来开发微软的C#程序。Eclipse设计的成功之处在于，除了小部分运行的核心，其他都是插件。

Eclipse 项目由Project Management Committee(PMC)所管理，它综观项目全局，Eclipse 项目分成3个子项目：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 平台--Platform

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 开发工具箱--Java Development Toolkit(JDT)

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 外挂开发环境--Plug-in Development Environment(PDE)

这些子项目又细分成更多子项目。例如Platform 子项目包含数个组件，如Compare、Help 与Search。JDT 子项目包括三个组件：User Interface(UI)、核心(Core)及调试(Debug)。PDE 子项目包含两个组件：UI 与Core。

Eclipse 软件开发工具箱（SDK）是由Eclipse 项目的上述3个子项目的组件组合而成的单一可下载包。所有基于Eclipse的工具都在Eclipse平台上创建。Eclipse平台又可以进一步划分如下。

（1）Ant：Java程序构建工具。

（2）Compare：通用比较工具。

（3）Core：核心库。

（4）Debug：通用调试器。

（5）Help：帮助系统。

（6）Scripting：脚本支持。

（7）Search：集成的搜索工具。

（8）SWT：标准小窗口工具箱。

（9）UI：用户界面。

（10）Update：动态更新/安装服务。

（11）VCM：版本化和配置管理。

（12）WebDAV：WebDAV 集成。



### Eclipse体系结构

Eclipse 平台的主要任务是为开发者提供能够使各种工具无缝集成的机制和需遵守的规则，这些机制通过具有良好定义的应用程序接口（API）、类和方法表现出来。本质上，Eclipse是一组松散绑定但互相连接的代码块。如果搞清楚这些代码块如何被“发现”，以及它们之间如何相互发现和扩展，就能了解Eclipse 体系结构的基本原理。Eclipse 平台的结构如图2.3所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i3.png)

**图2.3 Eclipse平台体系结构**

**（1）平台运行时（Platform Runtime）**

平台运行时是Eclipse平台核心运行时的简称。Eclipse体系结构的关键就是如何动态发现插件，平台运行时恰恰负责管理、发现和启动已经安装的插件。为了节省内存，只有当用户选择了插件的功能以后，插件才被载入和初始化。插件一旦激活，就可以使用插件注册表来发现和存取基于它的扩展点的扩展。

**（2）工作空间（Workspace）**

Eclipse 平台体系结构的重点在于工作空间。用户的工作空间是指通过插件技术插入到Eclipse平台的各种工具的操作范围。工作空间维护构建和测试软件项目所需要的一切工具，这些工具通过工作空间定义的API来使用工作空间的资源。工作空间的资源不仅包括对象、源代码和资源，还包括项目、IDE 和插件的配置设置。

工作空间由一个或多个项目组成，每个项目映射到对应用户的文件系统目录，不同的项目可能映射到不同的文件系统目录或驱动器。每个项目还可以包含任意数目的文件和文件夹，文件可以由用户创建，并且能被用户操作使用。在如图2.4 所示的“导航器”视图中可以看到项目资源的树形组织形式。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i4.png)

**图2.4 Eclipse的“导航器”视图**

所有的在工作空间中的文件都可以直接被操作系统下的标准程序和工具存取。与平台集成的工具提供了用于处理工作空间资源的应用程序接口。由于工作空间资源是用可适配对象表示的，其他开发人员就可以扩展它的行为。

**（3）工作台（Workbench）**

Eclipse平台是由组件构成的，其中最基础的组件就是Eclipse工作台。启动Eclipse后，工作台是主要的工作窗口，如图2.5所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i5.png)



Eclipse 平台界面正是搭建在这个提供整体结构并向用户提供可扩展界面的工作台之上的。Eclipse 工作台只是用来创建、管理和导航项目和资源（例如文件和文件夹等），它不知道如何编辑、运行以及测试Java 程序，这些工作都是由其他功能组件来完成的，例如Java开发工具JDT。

**（4）SWT和JFace**

工作台是构建在SWT和JFace两个工具包之上的。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) **SWT：**一个小窗口工具集合，它与本地窗口系统集成，并且提供了独立于操作系统的应用程序接口的图形库。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) **JFace：**一个用SWT 实现的用户界面工具包，它提供了难以实现的、用于开发用户界面的helper 类，进而简化了常用的界面编程任务。

图 2.6所示给出了Eclipse、JFace和SWT之间的关系。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i6.png)

**图2.6 Eclipse、JFace和SWT之间的关系**

**（5）外部工具（External Tools）**

外部工具允许在工作台下配置和运行程序、批处理文件、Ant 构建文件和其他对象，并且可以保存外部工具配置以便将来使用它们。外部工具的输出会在控制台视图显示。

可以添加外部工具，将其作为项目构建进程的一部分。每次构建项目时，这些外部工具都会按特定的顺序来执行。



### Eclipse 的工作台

工作台是指桌面编程环境，工作台的外在表现为“工作台”窗口。每个工作台窗口包括至少一个透视图，透视图又包含视图和编辑器，并且控制在菜单栏和工具栏显示的内容。多个工作台窗口可以同时存在。

**（1）视图（View）**

工作台有许多不同种类的内部窗口，称为视图(view)，以及一个特别的窗口--编辑（editor）。之所以称为视图，是因为这些窗口以不同的视野来看整个项目，例如图2.7所示的Outline的视图可以看项目中Java类别的概略状况，而图2.4所示的Navigator的视图可以导览整个项目。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i7.png)

**图2.7 Eclipse 的Outline视图**

视图有两个菜单，第一个允许对视图进行操作。右键点击视图的标签就会弹出该菜单，如图2.8所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i8.png)

**图2.8 视图标签的右键菜单**

第二个菜单，称为“视图下拉菜单”，可以通过单击向下的箭头来访问。视图下拉菜单包含对视图所有内容而不是视图中特定项的操作。排序和过滤的操作可以在视图下拉菜单找到，如图2.9所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/i9.png)

**图2.9 视图下拉菜单**

视图还有一个工具栏，单击工具栏中的工具按钮可以使用该工具，如图2.10所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z1.png)

**图2.10 视图的工具栏**

使用菜单栏的“WindowShow View”下面的级联菜单项，可以显示某个视图。视景决定了需要哪个视图。根据不同的视景，在“WindowShow View”下面的级联菜单项显示的视图选项也不一样。选择“其它”，就可以获得其它视图，如图2.11所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z2.png)

**图2.11 “WindowShow View”下面的Other级联菜单项**

**（2）编辑器（Editor）**

编辑器是特殊的窗口，出现在工作台的中央。当打开文件、程序代码或其它资源时，Eclipse会选择最适当的编辑器打开文件。若是纯文字文件，Eclipse就用内建的文字编辑器打开；若是Java程序代码，就用JDT的Java编辑器打开；若是Word文件，就用Word打开。此Word窗口会利用Object Linking and Embedding-OLE，内嵌在Eclipse中。JDT的Java编辑器如图2.12所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z3.png)

**图2.12 编译器**

**（3）视景（Perspective）**

有人把视景（Perspective）翻译为透视图。Eclipse中的视图和编辑器很多，为了使用方便，Eclipse根据任务的不同把视图和编辑器预先划分为不同的类别，且预设好视图的排列方式，并把每一个类别称为一个视景。每个视景是一组预定好的视图，所有视景的主要组件是编辑器。每个视景的目的是执行某特定的工作，在每个视图以各种不同的观点处理工作，如编写Java程序所用的视景为如图2.13 所示的“Java”视景，调试程序所用的视景为如图2.14所示的“Debug”视景。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z4.png)

**图2.13 “Java”视景**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z5.png)

**图2.14 “Debug”视景**

打开某个视景的方法有两种：

**A. 点击快捷方式栏上的“Open Perspective”按钮，**如图2.15所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z6.png)

**图2.15 快捷方式栏上的“Open Perspective”按钮**

在弹出的“Open Perspective”对话框中选择要打开的视景，如图2.14所示，然后点击“OK”按钮，则可以打开相应的视景，如图2.16所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z7.png)

**图2.16 “Open Perspective”对话框**

或者使用【窗口→打开透视图】子菜单，在弹出的菜单里选择 【其他】，如图3-2所示

**B. 使用菜单栏的“WindowPerspectiveOpen Perspective”下面的级联菜单项，可以打开视景，**如图2.17所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z8.png)

**图2.17 “WindowPerspectiveOpen Perspective”的级联菜单项**

**（4）Eclipse的工作界面**

Eclipse程序的工作界面是一个窗口，它将菜单、工具、视图和编辑器组织在一起，如图2.18所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z9.jpg)

**图2.18 Eclipse的工作界面**

其中的界面元素如下：

1.菜单(Menu Bar)

2.工具列(Tool Bar)

3.快速视图(Fast View)

4.包浏览器(Package Explorer)视图

5.编辑器(Editor)视图

6.快捷方式工具列(Shortcut Toolbar)

7.大纲(Outline)视图

8.任务(Tasks)视图和控制台(Console)视图



### Eclipse的快捷键

Eclipse的一些常用功能可以使用快捷键完成。

开发Java程序时，使用快捷键会更方便。

使用菜单“WindowPreferences”，打开“Preferences”对话框，找到【General】->【Keys】，窗口右边就会出现所有快捷键，如图2.19所示。

你可以在这里查看哪个功能使用哪个快捷键。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/s1.png)

**图2.19 Eclipse的“Preferences”对话框**

有一些快捷键是常用的，如：

**（1）一般**

代码助手:Ctrl+Space（简体中文操作系统是Alt+/）

快速修正：Ctrl+1

单词补全：Alt+/

**（2）定位**

行末/行首：End/Home

**（3）注释或取消注释**

Control+/: 对一行注释或取消注释。对于多行也同样适用。

**（4）导入类**

ctrl+shift+o：为当前行中尚未引入的类自动添加Inport语句导入。

**（5）重命名**

重命名属性及方法在几年前还是个很麻烦的事，需要大量使用搜索及替换，以至于代码变得零零散散的。今天的Java IDE提供源码处理功能，Eclipse也是一样。现在，变量和方法的重命名变得十分简单，你会习惯于在每次出现更好替代名称的时候都做一次重命名。要使 用这个功能，将鼠标移动至属性名或方法名上，按下alt+shift+r，输入新名称并点击回车。就此完成。如果你重命名的是类中的一个属性，你可以点击alt+shift+r两次，这会呼叫出源码处理对话框，可以实现get及set方法的自动重命名。

**（6）快速转换编辑器**

这组快捷键将帮助你在打开的编辑器之间浏览。使用ctrl+page down或ctrl+page up可以浏览前后的选项卡，但是在很多文件打开的状态下，ctrl+e会更加有效率。

**（7）创建一个新空白**

Shift+enter在当前行之下创建一个空白行，与光标是否在行末无关。Ctrl+shift+enter则在当前行之前插入空白行。



### Eclipse的快捷键

**（1）下载eclipse的中文语言包**

下载地址如下http://www.eclipse.org/babel/downloads.php

下载对应的eclipse的中文语言包。

**（2）解压缩该文件。**

**（3）安装eclipse的中文插件包。**

打开eclipse英文版，打开菜单“EclipseHelpInstall New Software…”，去安装eclipse的中文插件包。

## **2.7 Eclipse中的Java程序调试**

### 主题内容

有时程序编译没有错误，但执行结果不是预期的结果，这时可能就是程序逻辑问题了。程序逻辑问题是不容易发现的，因为人的思维总是有“惯性”的，有时很难发现自己的逻辑错误。此时调试程序就有用了。你可以用调试工具调试程序，从而发现逻辑错误。

Eclipse平台内置了一个Java 调试器。该调试器不仅提供诸如单步执行、设置断点、检查变量以及暂时挂起和恢复线程等标准调试功能，而且提供了代码片段编辑测试窗页面和远程调试两个特殊的功能。

调试视图

Eclipse有一个特殊的调试视图，使得开发人员能够管理工作台中程序的调试和运行。通过调试视图，可以管理和控制工作台中程序的运行或调试。通过设置断点、挂起线程、单步执行以及检查变量来控制程序的运行。

**调试视图显示以下信息:**

（1）被挂起的正在进行调试的线程的堆栈帧信息，所谓堆栈帧是程序运行时调用的方法以及它内部变量等信息。

（2）程序中每个线程都作为一个节点。

（3）正在运行的程序的进程。

调试视图包括进程视图和控制台视图。进程视图显示正在运行以及最近被终止的进程，控制台视图允许开发者通过标准输入和输出流对正在运行的进程进行交互操作。

调试方法

Java 调试器采用了C/S结构，这使得它既可以调试本地运行的程序，也可以进行远程调试（调试网络上其他电脑的Java 程序）。

本地调试是最常用的一类调试。代码编写和编译完成以后，就可以通过工作台的主菜单栏上的【运行→调试】来启动程序。按照这种方式启动程序，就能够在Java程序和调试器之间建立连接，以便使用断点、单步控制以及表达式求值来调试程序。

建议在调试时尽量做到每行只有一条语句。因为如果一行有多条语句，部分调试器的功能无法使用。

例如：如果同一行有多条语句，就无法设置断点或单步跳过，把源代码加入JAR文件。

**1．挂起和恢复线程**

调试开始后，开发人员可以将正在执行的线程挂起，以便查看该线程堆栈帧的信息，步骤如下：

（1）在调试视图选择线程。

（2）在调试视图的工具栏选择“挂起”按钮，线程将被挂起。调试视图显示该线程当前的调用堆栈（如图2.20所示），并且调试视图中的编辑器也会突出显示该堆栈帧对应的代码，这行代码就是线程被挂起那一刻程序运行到的地方。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/18.png)

**图2.20 调用堆栈**

线程挂起时会自动选择线程顶部的堆栈帧（即最近被调用的方法），变量视图将会显示堆栈帧中的变量以及它的值，复杂的变量可以被展开以便查看其成员的值。开发者也可以在调试视图的调用堆栈里选择一个方法调用，该方法的变量信息就会在变量视图显示出来。

线程挂起时，将鼠标移到Java 编辑器里的某个变量之上，就会显示该变量的值。

**线程既可以被挂起，也可以恢复执行。**

（1）在调试视图选择线程或它的堆栈帧。

（2）在调试视图的工具栏里点击“继续”按钮（或按F8），线程恢复执行。此时，调试视图不再显示它的堆栈帧，变量视图也会清除与其相关的信息，如图2.21所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/19.png)

**图2.21 恢复线程**

**2．单步执行程序**

线程被挂起后，可以使用“单步控制”逐行执行程序。如果在这个过程中遇到断点（下一小节将详细讲述），那么将在断点处挂起并且终止单步执行。

单步执行程序时有以下几种操作：

（1）“单步跳过”。不进入调用的方法内部，而是在该方法结束后，下一个方法执行前挂起。这个功能可以通过调试视图工具栏的“跳过”按钮或F6功能键来实现。

（2）“单步进入”。将会进入调用方法的内部。这个功能可以通过调试视图工具栏的“进入”按钮或F5功能键来实现。

**3．查看和修改变量的值**

线程被挂起后，可以检查变量以确定其值是否正确。

有几种方法可以用来检查程序中的变量。对于简单的变量，只需要在Java 编辑器中将鼠标移到变量名上（不需单击）即可，这样会自动打开一个文本框并显示该变量的信息，包括它当前的值，如图2.22所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/20.png)

**图2.22 简单变量的信息**

这种方法对于简单的变量是很方便。但对于一些复杂变量，这种方法只会显示对象ID和它的类型，虽然这些信息也重要，但是它没有提供变量的值。与类型相关的任何信息（例如Javadoc注释），同样也会在弹出的文本框里显示出来，如图2.23所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/21.png)

**Javadoc注释**

如果要查看复杂变量的值，可以使用变量视图。变量视图显示当前范围内（即堆栈帧的上下文）的所有变量。缺省情况下，变量视图位于窗口的右上角，它与表达式视图和断点视图共享一个窗格，如图2.24所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/22.png)

**图2.24 变量视图**

使用变量视图还可以修改变量的值。选择某个变量，单击右键并在弹出的菜单选择【更改值】。对于复杂的变量，可以选择变量的一个特定成员进行修改。如图2.25所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/23.png)

**图2.25 修改变量的值**



### 断点

当正在执行的程序线程遇到断点，它就被挂起了。断点视图和编辑器都会显示断点，可以通过断点视图启用或禁用断点。

当程序运行到一个可用的断点时，它就会被挂起。可用的断点用一个蓝色的圆圈表示。一旦在虚拟机上载入了类并且安装了断点，可用的断点就会用蓝色的圆圈上加一个勾表示。不可用的断点不会导致线程挂起，它用一个白色的圆圈表示。断点在编辑器区域左边的垂直标尺和断点视图中显示，如图2.26所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/ss.png)

**图2.26 显示断电**

可以为程序的可执行的代码（即没有注释掉的代码）添加行断点。步骤如下：

（1）在编辑器区域打开将要加入断点的文件。

（2）在想要添加断点的代码的左方，即垂直标尺上单击右键，并在弹出的菜单里选择**【切换断点】**，如图2.27所示。还可以通过双击垂直标尺来添加断点。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/sa.png)

**图2.27 设置断点时的弹出菜单**

在有断点的那一行代码执行之前，线程就会挂起。调试器会自动选择被挂起的线程，并且将线程堆栈里的信息在调试视图里显示出来。而在调试透视图的编辑器中，设置断点的那一行代码会被突出显示。

当不再需要某个断点时，可以很方便地将其删除，删除步骤如下：

（1）在编辑器区域打开将要删除断点的文件。

（2）在想要添加断点的那一行的左方，在垂直标尺上单击右键并在弹出的菜单里选择**【切换断点】**。也可以通过双击源代码旁边的垂直标尺来删除断点。

如果在同一个地方经常添加或删除断点，可以启用或禁用该断点。启用一个断点后，程序线程会在这个断点挂起；禁用该断点后，线程就不会在该处挂起。



## 2.8 拓展阅读



### Netbeans大战Eclipse

NetBeans由Sun公司（2009年被甲骨文收购）在2000年创立，它是开放源运动以及开发人员和客户社区的家园，旨在构建世界级的Java IDE。

NetBeans当前可以在Solaris、Windows、Linux和Macintosh OS X平台上进行开发，并在SPL(Sun公用许可)范围内使用。虽然NetBeans带有更多的“官方”色彩，但Java程序员使用更多的集成开发工具是IBM的Eclipse。

如果你是一个Java支持者，你一定不会陌生Netbeans，因为大家都是从Netbeans的爱恨交加中走过来的，初识Netbeans还是3.6版本，当时无论从界面还是运行上，真的不敢恭维，但是谁又能说Netbeans会停止它前进的脚步呢?由于开源脚步的加快，Borland提前宣布退出，给了Netbeans更多的机会，也让Netbeans在业界得到专业人士的赏识，但是他真的走出充当配角角色吗?真的像Netbeans高级宣传官所说的那样走出低谷了吗?



### Netbeans拒绝与Eclipse合并

随着开源的兴起，Jbuilder光辉不在，Netbeans的市场份额在今年上半年有了明显的增长，据国外权威调查机构显示，Eclipse 市场份额占45%，Netbeans占 30%，Jbuilder占15%，其它IDE占5%，从调查分析来看，Netbeans的市场占有率正在上升，原来三国鼎立的局面因为Jbuilder的退出，使Eclipse对决 Netbeans大战提前上演了，都说这是一场势均力敌的战争，倒不如说是两大软件巨头的撕杀，2006年初IBM就开始和Sun公司进行谈判，数月谈判结果给了IBM当头一棒，Sun公司拒绝加入IBM主导的开源项目Eclipse，在宣布放弃Eclipse同时，不久Sun表示，他们不再试图将Sun 发起的NetBeans.org开放源Java工具项目与Eclipse合并。

Sun公司认为，加入Eclipse阵营需要打破两个组织之间的技术和组织差别，而这将对NetBeans和Eclipse项目现有的参与者造成不利影响。Sun公司开发平台集团副总裁RichGreen表示，“我们双方都确定我们不希望放弃现有项目”，“我们确定，合作社团相对于削减成本等问题更为重要。”

Eclipse和NetBeans开放源项目目的是开发软件以允许不同的Java开发工具在单个编程应用中能够相互嵌和。比如，开发人员可以将一家公司提供的源代码管理工具与其他公司的代码编辑器综合在一起使用。

Green称，双方起初讨论放弃NetBeans，但很快转而谈判寻求将两个开放源项目统一在一个单一实体下。理论上，将两个项目和并可以建立一个针对同一技术的更大社团，并确保两个项目不会建立不兼容的代码。但Green表示，如果重写各自的插件系统以及相关的工具平台需要双方花费很长时间和巨大开销。比如，Sun的商业开发工具建立在NetBeans的基础上，如果转而采用Eclipse标准则需要进行重大修改。

Sun和IBM Eclipse未能走到一起，在两大开放源工具项目之间建立起一个鸿沟。Green表示，这样也为开发商提供了更多的选择。并且，Sun仍然希望将来与Eclipse重开谈判之门。

相对与Sun的内敛相比，Eclipse基金会的执行理事Mike Milinkovich要自信得多，在谈到老竞争对手时，他说这本来就是一场没有悬念的战争，我们已经拥有了足够多的用户，而他们没有，很明显我们会赢得这场战争，我只能祝他们好运。

关于两位当事人的观点我们的记者也采访了香港政府IT部门架构师Recher，他说这本身就是一场实力悬殊的竞争，虽然近期 Netbeans是在市场战略上取得一些佳绩，但不能说他们真正的赢得了这场胜利，他只不过是在分享Jbuilder抛弃的市场份额而已，Eclipse 并没有因为它的增加而减少，Sun公司一直在用一种狭隘的心态在抵制自已竞争对手，最近和IBM的谈判崩裂，以及Sun一直都没把OSGI列放JMX的标准中，就是很好的例证。



### Eclipse未来之路

同时Recher也谈到了Eclispe开发在3个方面占胜了Netbeans.

1. 在技术上Eclipse是良好的OSGI框架实现(Equinox是OSGi R4 core framework的一个实现，而Eclipse IDE是基于Equinox项目开发的一个典型例子OSGI的好处基本就是面向组件开发，并提供一个十分好用的plugs-in框架，开发性强。况且 Eclipse本身就是一个RCP的容器---为未来RCP应用程序的将来提供不可缺少而且成熟的工具和容器。

2. 在市场上Netbeans支持的项目和工具太少了，因为很多开源项目都提供了大量Eclipse的plugs-in组件，这些是其它IDE 工具无法比拟的， 现在的 IBM已经和Eclipse完全整合了(以前的WSAD还不能说完全，但IRAD6.0就已经很完全了)，同时IBM推出RSA(Rational Software Architect)的工具可以把Eclipse+UML+RUP+IRAD比较完美结合，至少我认为它是目前出来最好的工具了，整个RUP都可以涵盖，而且还是支持UML2.0。

3. 在背景方面Eclispe的流行完全是IBM在它萌芽阶段进行资金赞助的产物，有了IBM这个蓝色巨人的支持，它的前途无可限量，但是也不能小看了Sun公司的这个冷面杀手，有Sun这个强有力的后盾，双方以后的竞争会很激烈的。

其实对于Eclipse未来，我们国内的架构师们只是在应用的角度上来看得在这个问题，Mike Milinkovich在9月初的Eclipse 2006世界大会指出了Eclipse未来的发展和新技术走向，他告诉我们首先是围绕富客户端平台的继续增长和采用支持更多的语言。下个季度，我们计划在Eclipse内推出首版的PHP IDE项目，我们认为这是一个非常令人激动的项目。因为无论是对企业开发者还是Web开发者来说，PHP是一门非常重要的语言，因此使得Eclipse工具支持PHP是一件令我们激动的事情。



### NetBeans未来走向

在IDE开发工具竞争激烈的今天，Sun也逐步的调整了Netbeans市场战略，在今年JavaOne大会上，Netbeans高级宣传官 Tim Boudreau也谈到了Netbeans以后发展动向，他告诉我们，自从1998年以来，NetBeans并没有只为Java而工作。

它也是C/C++工具的基础，Sun公司已经将它转用于Solaris很多年了，对它的支持正在进行扩展化和通用化，不再仅限于Solaris。NetBeans也是HP公司用于OpenVMS的IDE，支持COBOL， Fortran， C/C++和其它语言。例如在今年JavaOne大会上我们演示的对VB的支持—实际上是读取VB代码，编译成字节码，然后运行，有时会比它本应生成的本地代码运行还要快。因此，我们已经开始了这个项目，也会有围绕脚本方面的开发做更多的努力。NetBeans并不一定要局限于Java IDE平台—它对于Java已经有了很大地支持，那是人们首先要考虑的事情。但是就NetBeans目前的发展来看，它已经成为了一个语言无关的平台。

正像我们早期提到的，重要的东西的寿命总是很长。一些人声称Java会在5或10年里死亡，我们都会迎来下一个大的事物。即使真是那样， NetBeans也一样可能会支持下一个事物的到来，但是对一个语言的寿命做假设的时候，有一件重事情要考虑，对于期望任何特殊的程序语言或范例的盛行周期日益变得更长是很实际的，这有两方面的原因。首先，我们在绘制人们如何考虑告诉计算机工作的方式上的蓝图方面正越来越好，其次，一个语言统治的时间越长，它的代码就会越多，因此移植的代价也就越大。于是你不得不紧跟一些事情，这些事情会强迫变化中的语言很丰富多彩。

现在有很多有关脚本语言的谈论，但是我期待在主流编程语言中的下一个重大变化是让直觉上类似多核芯片的并行方式成为规范标准。我确信在未来的时间里这些目标将会成我们考虑的主流。

从上述的采访中我们明显看到了开发公司的架构师对于Eclipse的钟爱程度，Eclipse已经深入人心，Eclipse的强大是显而易见，记得Ruby刚刚在网上火爆的时候，Eclipse就迅速作出反应，推出了支持Ruby开发插件，可是我们在反观 Netbeas在5.5的版本还没有这样的计划，Java之父Gosling曾说过未来的Netbeans不将是纯粹的Java开发工具，它要涉及各个方面，以后也会支持Ruby开发，可是在他说这些话的时候，Eclipse已经在前进的路上了，这难免令所有支持者感到失望，未来的日子，谁将主宰我们都拭目以待。

2.9 动手项目



## 动手项目2-1：了解其它Java集成开发环境

**所需时间：**30分钟。

**项目目标：**了解其它Java集成开发环境。

**过程描述：**使用搜索引擎寻找资源，了解其它Java集成开发环境。

（1）用浏览器登录到某个搜索引擎。

（2）在搜索引擎中输入关键字“Java集成开发环境”，并提交。

（3）在搜索引擎返回的结果列表中寻找不同的Java集成开发环境，了解其特点。

（4）把你所了解到的各种Java集成开发环境的功能和特点写个帖子法到课程论坛中。

2.10 小结



## 小结

JDK 的全称是Java SE Development Kit，即Java标准版开发包，是Java官网提供的一个用于开发Java应用程序的开发包。学习开发Java程序是一般用这个官方的JDK。

除了下载和安装JDK外，开发Java程序时，通常也下载Java SE Documentation。开发Java程序用的几乎所有的知识在它里面全部都有。程序员一般把Java SE Documentation作为“编程手册”使用。

Java程序开发者把它作为Eclipse 当作 Java 集成开发环境（IDE）来使用。

Eclipse是使用Java 语言开发的，所以Eclipse可运行在任何的Java运行时环境（jre）之上。进一步，安装Eclipse的时候需要先安装一个Java运行时环境（Java运行时环境由Java虚拟机和Java API组成），以便使得Eclipse运行在此Java运行时环境之上。安装JDK的时候就同时安装了Java运行时环境。

工作台是指桌面编程环境，工作台的外在表现为“工作台”窗口。每个工作台窗口包括至少一个透视图，透视图又包含视图和编辑器，并且控制在菜单栏和工具栏显示的内容。多个工作台窗口可以同时存在。

# 第3章 包

## **3.1 java中的包**

### 主题内容

一个具有实际功能的Java程序中往往会会包含很多类和接口，如果你直接把这类和接口都放在一起，那将是混乱和不便于管理的。你可以使用“包”把一些类和接口分门别类地组织在一起。也就是说，你可以把一组相近功能的类和接口放到一个“包”中。

在Java中，包的概念和其它编程语言中函数库的概念是相同的，也称为类库。包把一组类和接口封装在一个包内，为管理和使用大量的类和接口提供了方便，同时也有利于这些类和接口的安全（包内代码通过访问标志可以互相协作，而这些标志对外部代码是不可用的）。另外，程序包还可以有效地管理类名空间，位于不同包中的类即使同名也不会冲突。

当然，包机制并不能完全解决名字冲突的问题，因为尽管可以控制同一个项目的多个包具有不同的名字，但两个不同的项目的不同包可能为恰巧取了相同的名字，特别是不同公司的不同项目中是有可能发生这一情况的。这类问题只能通过“规定”来解决。Java官方标准规定使用程序开发组织的反向Internet域名作为包名的前缀，例如，如果Acem公司的域名是acem.com，它就可以使用com.acem作为本公司开发的Java项目的报名的前缀，这样就可以用类似的com.acme.tools的包名。

要点：包的概念

为了更好地组织类，Java提供了包机制。包有时也称类库。

把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。

如同文件夹一样，包也采用了树形目录的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。因此，包可以避免名字冲突。

包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类。

Java使用包（package）这种机制是为了防止命名冲突，访问控制，提供搜索和定位类（class）、接口、枚举（enumerations）和注释（annotation）等。

Java的包本身没有子包的概念，所有包都是并列的关系，没有谁包含谁的问题。比如:org.dominoo.action和org.dominoo.action.asl之间绝对没有包与子包的关系。它们是各自独立的包，各自拥有自己的了类和接口的集合。在org.dominoo.action.asl的某个java文件里，如果想引用org.dominoo.action里的某个类和接口，则必须使用import引入 org.dominoo.action。

为了避免不同项目之间包名的冲突，Java官方标准规定使用程序开发组织的反向Internet域名作为包名的前缀。

### **3.2包与文件系统目录结构的对应关系**

### 主题内容

包也采用了树形目录的存储方式，包中的类和接口与文件系统的目录结构存在对应关系。也就是说包所组织的类文件的逻辑结构与物理存放位置是一致的。



### 活动：观看关于Java基础类库目录结构的视频

下面的视频分析了Java基础类库目录结构，从而让你认识包与文件系统目录结构的对应关系。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid3-1.png)

**视频3-1：Java基础类库目录结构**

\1. 到JAVA_HOME\ jre1.8.0_92\lib下找到rt.jar（rt.jar是Java的基础类库的归档文件），把它复制到一个临时文件夹下，如C:\tmp。

\2. 使用解压缩软件WinRAR将rt.jar解压缩。注意，解压缩的时候选“解压到当前文件夹”，而不是“解压到rt”下，否则就等于多加了一层rt\。

\3. 使用资源管理器，打开目录结构，查看Java系统类的.class文件，如Java\lang\ System.class， java\io\FileInputStream.class等。

\4. 最后陈述一下下面的要点。

要点：包的命名规则以及包与目录的对应关系

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java约定包名字内的所有字母都应小写，甚至那些中间单词亦要如此,如mypackage而不是myPackage。这样的命名约定是为了避免包名与类、接口名字的冲突。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 包名具有层次结构，如Java的核心语言包名字是java.lang,Java用于图形用户界面事件处理的包名是java.awt.event。在包名中，用点(.)分隔了包名的层次结构。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 包名的层次结构与物理目录存在对应关系，如java.lang对应.\java\lang，java.awt.event对应.\java\awt\event。

## **3.3 创建包**

### 主题内容

Java系统中已经包含了设计者编写的大量系统程序包，你学习Java的任务之一就是了解和使用系统程序包。除此之外，你还可以声明和使用自己的程序包，这为大型程序的开发提供了方便。



### 活动：观看创建包的视频

点击折叠

下面的视频演示了创建包以及编译程序的方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid3-2.png)

**视频3-2：创建包以及编译程序**

**1.在工作目录下创建子目录pack1。**

**2.在pack1目录下创建如下两个文件：**

文件一：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.3.html?node=858292446&detailRecordId=1314589011&studyrecordId=1225624963&sectionRecordId=1229924109#)

```
package pack1;

public class CCircle {
	public void show(){ 
		System.out.println("show() method called");
		}
}
```

文件二：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.3.html?node=858292446&detailRecordId=1314589011&studyrecordId=1225624963&sectionRecordId=1229924109#)

```
package pack1;

public class PackDemo {
	public static void main(String args[]){
		CCircle cir= new CCircle();
		cir.show();
	} 
}
```

**3.编译这两个文件。**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/q.png)

**4.运行程序。**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/w.png)

活动的解析：本视频中创建的包

（1）本视频中创建了一个包pack1，包中包含了两个类CCircle和PackDemo。

（2）CCircle和PackDemo在同一个包中，所以在PackDemo中可以直接访问Circle。

（3）由于包pack1的物理目录就是在当前工作目录D:\JavaPrograms下面，而此前设置的CLASSPATH的类搜索路径中包括当前目录，因此Java解释器可以找到包中的类，即直接用java pack1.PackDemo可运行程序。

（4）编译器javac后面是目录和文件名，而解释器java后面是包名和包中的类名。目录和文件名之间的分隔符是反斜杠，而包名和包中的类名之间的分隔符则是圆点（.）。

要点： 创建包的方法和包的保存

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 创建package的时候，你需要为这个package取一个合适的名字。之后，如果其他的一个源文件包含了这个包提供的类、接口、枚举或者注释类型的时候，都必须将这个package的声明放在这个源文件的开头。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 包声明应该在源文件的第一行，每个源文件只能有一个包声明，这个文件中的每个类型都应用于它。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 如果一个源文件中没有使用包声明，那么其中的类，函数，枚举，注释等将被放在一个无名的包（unnamed package）中。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) package语句

**包语句的语法格式为：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.3.html?node=858292446&detailRecordId=1314589011&studyrecordId=1225624963&sectionRecordId=1229924109#)

```
package` `pkg1[．pkg2[．pkg3…]];
```

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 示例

**例如,一个Something.java 文件它的内容**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.3.html?node=858292446&detailRecordId=1314589011&studyrecordId=1225624963&sectionRecordId=1229924109#)

```
package` `net.java.util``  ``public` `class` `Something{``     ``...``  ``}
```

那么它的路径应该是 net/java/util/Something.java 这样保存的。 package(包)的作用是把不同的java程序分类保存，更方便的被其他java程序调用。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 开发者可以自己把一组类和接口等打包，并定义自己的package。而且在实际开发中这样做是值得提倡的，当你自己完成类的实现之后，将相关的类分组，可以让其他的编程者更容易地确定哪些类、接口、枚举和注释等是相关的。

## **3.4访问包中的类**

### 主题内容

同一个包中的类可以直接访问，不同包中的类需要特定的方式才能访问。



### 活动：观看访问包中的类的视频

下面的视频演示了访问包中的类的方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid3-3.png)

**视频3-3：访问包中的类**

**1.在工作目录下创建子目录pack1。**

**2.在pack1目录下创建如下文件：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.4.html?node=858292447&detailRecordId=1314589012&studyrecordId=1225624963&sectionRecordId=1229924134#)

```
public` `class` `PackDemo1  ``// PackDemo1没有在包pack1当中`` ``{``    ``public` `static` `void` `main(String args[])``   ``{``      ``CCircle cir=``new` `CCircle(); ``      ``cir.show();``   ``}`` ``}
```

**3.编译此文件。**错误提示：找不到CCircle这个符号。编译器不知道它是个什么东西。是因为PackDemo1和CCircle没在同一个包中，不能直接访问，所以编译器不知道CCircle是什么东西。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/z.png)

**4.修改程序如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.4.html?node=858292447&detailRecordId=1314589012&studyrecordId=1225624963&sectionRecordId=1229924134#)

```
import` `pack1.Circle;``    ``public` `class` `PackDemo1  ``// PackDemo1没有在包pack1当中``    ``{``      ``public` `static` `void` `main(String args[])``       ``{``          ``CCircle cir=``new` `CCircle();``          ``cir.show();``       ``}``    ``}
```

**5.再编译。**此时可以看到，编译器能够找到CCircle这个类的，但是由于该类不是公共的，所以还不能从外部访问。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/x.png)

**6.把pack1.CCircle改成public的，**让它能被外部访问，然后重新编译CCircle.java。

**7.再编译PackDemo1.java。**通过。

**8.运行程序。**正确。

活动的解析：访问包中的类的方法

（1）同一包中的类可以直接访问，不同包中的类不同直接访问。

（2）要让包中的类能够被外部访问，那么该类要声明为public的。

（3）访问其它包中的类的方法之一是使用import语句将要访问的类引入到当前程序中来。

要点： 访问在不同包中的类的两种方法

（1）在当前文件中使用如下的格式来引用另外一个程序包中的类

被访问的package的名称.被访问的类名称

（2）把被访问的程序包导入到当前文件中。格式如下：

import package1[.package2…].(classname|*);

例如语句：import java.awt.Graphics;

import java.applet.*;

import pack1.CCircle;

其中，星号（*）表示引入该包中的所有类和接口。

## **3.5 在Eclipse新建类时直接指定到它包中**

### 主题内容

直接使用JDK开发Java程序时，创建包是比较麻烦的。你得先创建相应的物理目录，然后再相应目录中创建源程序文件，然后再编译。而使用Eclipse创建包就轻松多了，很多工作Eclipse都会替你做了。



### 活动：观看在Eclipse创建包并创建类的视频

下面的视频演示了在Eclipse创建包并创建类的方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid3-4.png)

**视频3-4：在Eclipse创建包并创建类**

1.启动Eclipse。

2.在项目Prj0中创建类CCircle。在“New Java Class”对话框中指定package为com.buptnu，类名为CCircle，Modifiers指定为public。

3.在Java编辑器中为类CCircle添加show()方法并保存。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.5.html?node=858292671&detailRecordId=1314589013&studyrecordId=1225624963&sectionRecordId=1229924113#)

```
public` `void` `show(){ ` `    ``System.out.println(``"show() method called"``);` `}
```

4.到D:\Java Programs\Prj0\src\com\buptnu下面查看自动创建的目录和源文件；到D:\Java Programs\Prj0\bin\com\buptnu下面查看自动创建的目录和.class文件。

5.在default包中创建类PackDemo。在“New Java Class”对话框中清除com.buptnu，恢复default，在name中输入PackDemo1，Modifiers指定为public，指定自动生成main()方法。

6.在Java编辑器中为类CCircle添加语句。

**CCircle cir=new CCircle();**

**cir.show();**

会看到CCircle cir=new CCircle();所在行的实时错误提示。鼠标放到最左边的红色小叉上看错误原因——不能将CCircle解释为某个类型。将鼠标放到CCircle上，会看到Java编辑器提示的修改方法，选中“import…”，可以看到Java编辑器自动添加了import语句。此处再次体会到使用Eclipse的Java编辑器编辑比用文本编辑器编辑Java源程序的好处，它会自动提示修改方法并为你自动添加需要的代码。

然后保存。

7.剩下的就是运行程序。正确。

活动的解析：本视频中创建的包

（1）Eclipse中直接为类指定包就成了，包的物理目录Eclipse会替开发者去创建。

（2）Eclipse有错误提示和错误修改提示功能，用它比较较方便。

（3）后面的程序开发将使用Eclipse，而不再用初级的JDK。

## 3.6 动手项目

### 动手项目3-1：使用Eclipse创建包和类

所需时间：30分钟。

项目目标：使用Eclipse创建包和类。

过程描述：使用Eclipse创建包和类。

（1）启动Eclipse。

（2）在项目Prj0中创建一个接口，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.6.html?node=858292676&detailRecordId=1314589014&studyrecordId=1225624963&sectionRecordId=1229924112#)

```
/*文件名：Animal.java*/``package` `animals;` `public` `interface` `Animal{``  ``public` `void` `eat();``  ``public` `void` `travel();``}
```

把此接口指定到包com.buptnu.animals中

（3）接下来，在同一个包中加入该接口的实现：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.6.html?node=858292676&detailRecordId=1314589014&studyrecordId=1225624963&sectionRecordId=1229924112#)

```
package` `animals;``/*文件名： MammalInt.java*/` `public` `class` `MammalInt ``implements` `Animal{``  ``public` `void` `eat(){``    ``System.out.println(``"Mammal eats"``);``  ``}``  ``public` `void` `travel(){``    ``System.out.println(``"Mammal travels"``);``  ``}``  ``public` `int` `noOfLegs(){``    ``return` `0``;``  ``}``}
```

（4）在default包中创建主类AnimalApp，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java3.6.html?node=858292676&detailRecordId=1314589014&studyrecordId=1225624963&sectionRecordId=1229924112#)

```
import` `com.buptnu.animals.MammalInt;` `public` `class` `AnimalApp{` `  ``public` `static` `void` `main(String[] args){``     ``//TODO Auto-generated method stub``     ``MammalInt m = ``new` `MammalInt();``     ``m.eat();``     ``m.travel();``  ``}``}
```

（5）运行程序。

（6）使用资源管理器观察源文件目录结构和字节码文件目录结构。



## **3.7 小结**

### 主体内容

为了更好地组织类，Java提供了包机制。包有时也称类库。

把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。

如同文件夹一样，包也采用了树形目录的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。因此，包可以避免名字冲突。

包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类。

Java使用包（package）这种机制是为了防止命名冲突，访问控制，提供搜索和定位类（class）、接口、枚举（enumerations）和注释（annotation）等。

Java的包本身没有子包的概念，所有包都是并列的关系，没有谁包含谁的问题。

为了避免不同项目之间包名的冲突，Java官方标准规定使用程序开发组织的反向Internet域名作为包名的前缀。

package语句的语法格式为：

package pkg1[．pkg2[．pkg3…]];

import语句的语法格式为：

import package1[.package2…].(classname|*);

不使用import语句访问在不同包中类的方法

被访问的package的名称.被访问的类名称

Eclipse可以直接把新建的类指定到包中，不管该包是否存在。如果不存在，Eclipse的Java编辑器会自动地去创建包，然后把类纳入包中。

## **3.8 思考题**

### 主体内容

**1.什么是包？它的主要作用是什么？**【隐藏】

**答：**包是Java提供的一种组织类的机制，有时也称为类库。这种机制功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。

Java使用包（package）这种机制是为了防止命名冲突，访问控制，提供搜索和定位类（class）、接口、枚举（enumerations）和注释（annotation）等。

**2.包的命名规则以及包与目录的对应关系是怎样的？**【隐藏】

**答：**![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java约定包名字内的所有字母都应小写，甚至那些中间单词亦要如此，如mypackage而不是myPackage。这样的命名约定是为了避免包名与类、接口名字的冲突。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 包名具有层次结构，如Java的核心语言包名字是java.lang，Java用于图形用户界面事件处理的包名是java.awt.event。在包名中，用点（.）分隔了包名的层次结构。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 包名的层次结构与物理目录存在对应关系，如java.lang对应.\java\lang，java.awt.event对应.\java\awt\event。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 为了避免不同项目之间包名的冲突，Java官方标准规定使用程序开发组织的反向Internet域名作为包名的前缀。

**3.访问在不同包中的类的方法有哪些？**【隐藏】

**答：**有两种办法可以访问在不同程序包中的类。

（1）在当前文件中使用如下的格式来引用另外一个程序包中的类

被访问的package的名称.被访问的类名称

（2）把被访问的程序包导入到当前文件中。格式如下：

import package名称.类名

例如语句：import java.awt.Graphics;

import java.applet.*;

# 第4章Java中对象和类

## **4.1 Java中对象和类的概念**

### Java中对象和类的概念

面向对象编程（Object Oriented Programming）简称OOP 就是使我们分析、设计和实现一个系统的方法尽可能地接近我们认识客观世界的方法。

对象（Object）代表现实世界中可以明确标识的一个实体。例如，一个学生、一张桌子、一个圆、一个按钮甚至一笔贷款都可以看作是一个对象。每个对象都有自己独特的标识、状态和行为。

一个对象的状态（State）也称为特征（Property）或属性（Attribute），是指那些具有它们当前值的数据域（Data Field），用变量（Variable）描述。例如，一个圆对象具有一个数据域radius，它是标识圆半径的属性。一个矩形对象具有数据域width和height，它们是标识矩形宽和高的属性。

一个对象的行为（Behavior）也称为动作（Action），是由方法（Method）定义的。调用对象的一个方法就是要求对象完成一个动作。例如，可以为圆对象顶一个一个名为getArea()的方法。调用圆对象的getArea()方法可以返回圆的面积。

同一类的对象具有相同的类别的属性和行为。例如，有两个圆对象——圆对象A和圆对象B，它们都有表示圆半径的属性radius，尽管它们各自半径的取值可能不同（圆对象A的Aradius的值和圆对象B的Aradius的值可能是不同的）；它们也都有返回圆面积的方法（圆对象A的getArea()方法可以返回圆对象A的面积，而圆对象B的getArea()方法可以返回圆对象B的面积）。面向对象方法把同一类对象划归一个一个类（Class），用类来描述同一类对象所共同具有的那些类别的属性和行为。类作为创建对象的模板使用。

从程序组成的角度看，类是一种数据类型，而对象则是相应类（数据类型）的一个具体“值”。通常也把对象成为它所属类的实例（Instance）。而有类创建一个具体对象的过程则称为实例化（Instantiation）。

Java类使用变量定义数据域，使用方法定义动作。此外，Java类还提供一种称为构造方法（Constructor）的特殊类型的方法用于初始化对象。所谓初始化对象就是给对象的每个数据域都赋一个初值，以确定对象的初试状态。对象的状态是由对象持有的所有数据域的取值决定的。如果把对象的所有数据域的值看作是一个向量的话，那么这个向量在某个时刻的值就代表了对象的当前状态。

**PS：** 在OOP方法中，经常使用一种称为UML语言的图形语言描述系统设计。



### 面向对象程序设计的基本原则和特征

**(1)抽象**

抽象是指从事物中舍弃个别的、非本质的特征，而抽取共同的本质特征的做法。

**例如**：已知圆的半径，计算圆的周长和面积。在这个问题中，平面上的每一个圆看作一个对象。从客观存在的角度看，圆半径、圆心坐标都是圆的属性，但是对于计算圆的周长和面积来说，只有圆半径有用，所以在构建软件模型的时候，我们把圆的半径抽象出来，作为圆对象的一个属性，而把圆心坐标忽略掉。这就是在构造软件模型时的一种抽象。

**(2)分类**

分类是按照某种原则划分事物的类别。在面向对象的方法中，分类就是把具有相同属性和相同操作的对象划分为一类，用类作为这些对象所具有的结构和操作的抽象描述。

**例如：** 我们交通工具划分为机动车和非机动车两类，机动车和非机动车的结构和操作是不同的。我们在程序中用机动车类和非机动车类描述同一类交通工具所具有的结构和操作。这样构造程序就比较方便了。

**(3)封装**

面向对象中的封装就是用对象把属性（数据）和对这些属性的操作包装起来，形成一个独立的实体单元。通过封装，可以把数据之间的关系和对数据处理的细节隐藏在封装体的内部。从外部看一个封装体，仅仅能够看到一些接口。外部对对象的操作通过调用对象的接口来实现。封装原则使对象能够集中而完整的描述并对应一个具体的事物，体现了事物的相对独立性。

**(4)继承**

继承是指特殊类自动地拥有或隐含地复制其一般类的全部非私有属性与操作。

**例如：**“工作人员”类和“办公室工作人员”类以及“办公室主任”类可以抽象为如图4.1所示的继承关系。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/4.1.png)

**图4.1 类的继承示例**

继承提供了两点好处：一是通过继承的方式定义新的类，可以减少编写代码的工作量。原有类中的代码就不用重新写了。二是可以更好的模拟现实系统，可以更自然的构造系统模型。事实上，继承机制不仅仅是为了少写一些代码，更重要的是可以让我们更合理的构建系统模型。

**(5)多态**

多态是指在同一个类内或具有继承关系的类之间可以定义同名的操作或属性，但这些操作或属性具有不同的含义，即具有不同的数据类型或表现出不同的行为。这样相应的对象可以按不同的行为响应同一消息。

其实这个现实世界中事物的多态是类似的。简单的说就是对同一消息，事物可以有多种不同的表现形态。现实中，对同一类的不同事物做相同的操作，事物的行为可能是不同的。比如汽车以60mph的速度正常行驶，我们踩刹车。不同的汽车刹车距离是不同的。这就是对同一操作的多种不同的表现形态。

同继承一样，多态也让我们可以减少代码编写工作量，以及更合理地构建系统模型。

**(6)消息通信**

从面向对象的观点来看，所有的面向对象的程序都是由对象来组成的。这些对象是自治的，对象之间可以互相通信、协调和配合，共同完成整个程序的功能和任务。

对象之间通过消息进行通信，实现对象之间的动态联系。具体地说，在面向对象的方法中，对象发出的操作请求称为消息。

**例如：**当用户选择了屏幕上对话框例的一个命令按钮，按下鼠标，一条消息就发给了对话框对象，通知它命令按钮被按下了。然后对话框对象根据这个消息做进一步的操作。

## **4.2 Java中的常见系统类**

### 主体内容

Java编程语言本身提供的功能是很有限的，很多常用功能是系统类来提供的。所谓系统类，就是开发 Java 平台的人事先编制好的类代码，随 Java 平台一起提供给我们使用。安装Java运行时系统以后，这些系统类的代码就安装在我们的计算机上了，因而我们就可以使用这些系统类的功能。

Java的系统类被分门别类地放到不同的包中，这些包称为系统包，也称系统类库或称Java应用程序编程接口（API）。

Java 提供了很多程序包，其中有一个包是 java.lang，它包含了 Java 语言的核心类库。每次编译程序的时候 java.lang包都将自动导入到程序中，因而我们写程序的时候可以直接在程序中使用 java.lang 包中的系统类。除了 java.lang 包以外的其它包在编译程序的时候不会自动导入，我们写程序的时候如果用到这些包中的系统类则需要用 import 语句明确告诉编译器把这些包中的系统类导入到程序中。



### Java的数据类型与基本数据类型的包装类

在数学计算中是没有“数据类型”的概念的，只是计算机科学中才引入了“数据类型”的概念，把计算机处理的数据划分为不同的“数据类型”。

数据类型的出现是为了把数据分成所需内存大小不同的数据，编程的时候，需要用大数据的时候才需申请大内存，不需要按数据的时候就分配小内容，这样就可以充分利用内存。 例如大胖子必须睡双人床，就给他双人床，瘦的人单人床就够了。

Java的数据类型分为两大类：

**(1)内置数据类型**

Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。具体如表4-1所示。

**表4-1Java内置的八种基本数据类型**

| 数据类型 | 类型名 | 位长 |  默认值  |               取之范围                |
| :------: | :----: | :--: | :------: | :-----------------------------------: |
|  布尔型  | bolean |  1   |  false   |              true,false               |
|  字节型  |  byte  |  8   |    0     |               -128~127                |
|  字符型  |  char  |  16  | '\u0000' |           '\u0000'~'\uffff'           |
|  短整型  | short  |  16  |    0     |             -32768~32767              |
|   整型   |  int   |  32  |    0     |     -2,147,483,648~2,147,483,647      |
|  长整型  |  long  |  64  |    0     |      -9,233,372,036,854,775,808~      |
|  浮点型  | folat  |  32  |   0.0    |        1.4E-45~3.402 823 5E+38        |
|  双精度  | double |  64  |   0.0    | 4.9E-324~1.797 693 134 862 315 7E+308 |

**(2)引用数据类型**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 引用类型变量由类的构造函数创建，可以使用它们访问所引用的对象。这些变量在声明时被指定为一个特定的类型，比如Employee、Pubby等。变量一旦声明后，类型就不能被改变了。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 对象、数组都是引用数据类型。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 所有引用类型的默认值都是null。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 一个引用变量可以用来引用与任何与之兼容的类型。

**例子：** Site site = new Site("Runoob")。

有了八种基本数据类型和引用类型，按理说应该够用了，但Java还提供了相应的包装类型，如int对应Integer，char对应Character。为什么要有包装类型？是因为Java是一个面向对象的语言，基本类型并不具有对象的性质，为了与其他对象“接轨”就出现了包装类型（如我们在使用集合类型Collection时就一定要使用包装类型而非基本类型），它相当于将基本类型“包装起来”，使得它具有了对象的性质，并且为其添加了属性和方法，丰富了基本类型的操作。



### 活动1：观看关于基本数据类型的包装类的视频

下面的视频演示了基本数据类型的包装类的一些功能。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid4-1.png)

**视频4-1：基本数据类型的包装类**

视频4-1的脚本：基本数据类型的包装类

这里演示一个把字符串转换成整型数据的程序。

**1. 启动Eclipse**

**2. 在Prj0中创建类Wrappers。**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
import` `java.lang.Integer;` `public` `class` `Wrappers {` `  ``public` `static` `void` `main(String[] args) {   ``     ``String s1 = ``"12"``;``     ``int` `x;``     ``x = Integer.parseInt(s1);``     ``x++;``     ``System.out.println(x);``  ``}``}
```

**3. 运行程序。**

**4. 最后陈述一下下面的解析。**

活动1的解析：包装类提供了对数据类型的一些操作

视频中的程序如下：

**例4-1** Wrappers.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
import` `java.lang.Integer;` `public` `class` `Wrappers {` `  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``      ``String s1 = ``"12"``;``      ``int` `x;``      ``x = Integer.parseInt(s1);``      ``x++;``      ``System.out.println(x);``  ``}``}
```

**例4-1** 的运行结果：

**13**

**例4-1** 的程序分析：

这里使用 Integer 类的 parseInt() 方法把字符串转换为整型数据后赋给整型变量 x ，然后输出x 的值。这里的Interger类就是与类型 int 对应的系统类，它的 parseInt() 方法把一个字符串转换为一个整型数据。另外，由于 Integer 类是在核心语言包 java.lang 中提供的，编译时会自动导入到程序中来，所以这里没有使用 import 语句明确导入 Integer 类。当然，如果非要用 import 语句导入 Integer 类也成，但这样完全是多余的。

还有一个值得一提的地方是语句:

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
System.out.println(x);
```

println()是一个重载的方法，这里把一个整型数据作为实参调用它，它将打印这个整型数据。如果把一个字符串作为实参调用它，则它会打印该字符串。一些其它的细节可以参考 Java SE Documentation。

要点1：基本数据类型与它的包装类的一些区别

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 声明方式不同，基本类型不适用new关键字，而包装类型需要使用new关键字来在堆中分配存储空间。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 存储方式及位置不同，基本类型是直接将变量值存储在栈中，而包装类型是将对象放在堆中，然后通过引用来使用。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 初始值不同，基本类型的初始值如int为0，boolean为false，而包装类型的初始值为null。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 使用方式不同，基本类型直接赋值直接使用就好，而包装类型在集合如Collection、Map时会使用到。



### 简单的控制台输入输出

Java 程序的标准输入设备是键盘，标准输出设备是控制台窗口（对于 Windows 用户来说，控制台就是 Windows 提供的 DOS 窗口）。控制台输入输出就是从标准输入设备向程序输入数据以及由程序向标准输出设备输出数据。

从广泛的意义上讲， Java 程序中，数据的输入输出是通过流完成的。 Java 平台提供了基本的输入输出流类，这些系统类包含了处理输入输出的基本方法。Java 程序处理输入输出的基本思想是由系统流类创建流对象，然后使用流对象完成实际的数据输入输出。具体到控制台输入输出，则是通过标准输入流 System.in 和标准输出流 System.out 完成的。 System.in 和 System.out 实际上是 Java API 提供的两个流对象，通常我们简单的把它门叫做标准输入流和标准输出流。利用 System.out 完成数据输入，利用 System.out 完成数据输出。

数据输出到控制台是一件非常简单的事情，使用标准输出流 System.out 就可以了。而使用标准输入流 System.in由控制台输入数据比较复杂一些。Java API 提供了一个 Scanner 类，由这个类的对象通常称为简单文本扫描器。把一个简单文本扫描器连接到标准输入流对象之后，就可以读取由控制台输入的数据了。实际编程时，先由 Scanner 类构造一个连接到标准输入流对象 System.in 的 Scanner 对象，然后再调用 Scanner 对象的相关数据读取方法就可以获得标准输入流中的数据了。



### 活动2：观看简单的控制台输入输出的视频

点击折叠

下面的视频演示了简单的控制台输入输出。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid4-2.png)

**视频4-2：简单的控制台输入输出**

这里演示一个从键盘输入数据以及把数据显示到计算机屏幕的程序。程序运行的时候先在屏幕上提问用户，你的姓名是什么？用户从键盘输入他的姓名后，程序提问你的年龄是多大？用户输入他的年龄后，计算机在屏幕上打印，某某你好！明年你的年龄将是多少。

下面看程序的编制。

**1.启动Eclipse**

**2.在项目Prj0中创建类InputTest。**由于是练习用，把它放到default package中就成。

【先不用import引入包，直接编辑创建简单文本扫描器的语句。带着学生观察Eclipse的错误提示功能，并利用Eclipse的修改错误提示功能修正程序，让学生体会用Eclipse的方便性。】

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
import java.util.Scanner;
public class InputTest {
	public static void main(String[] args) { 
		Scanner myScanner =  new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = myScanner.nextLine();
		System.out.print("How old are you? ");
		int age = myScanner.nextInt();
		System.out.println("Hello, "+ name + ". Next year, you'll be "+ (age + 1));
		}
	}

```

**3.运行程序。**

**4.最后陈述一下下面的解析。**

活动2的解析：简单的控制台输入输出

视频中的程序如下：

**例4-2** InputTest.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
import` `java.util.Scanner;` `public` `class` `InputTest {``  ``public` `static` `void` `main(String[] args) {``   ``// TODO Auto-generated method stub``  ``Scanner myScanner = ``new` `Scanner(System.in);``   ``// get first input``  ``System.out.print(``"What is your name? "``);``  ``String name = myScanner.nextLine();``   ``// get second input``  ``System.out.print(``"How old are you? "``);``  ``int` `age = myScanner.nextInt();``   ``// display output on console``  ``System.out.println(``"Hello, "` `+ name + ``". Next year, you'll be "` `+ (age + ``1``));``  ``}``}
```

**例4-2** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
What is your name? Snoopy``How old are you? ``28``Hello, Snoopy. Next year, you'll be ``29
```

**例4-2** 的程序分析：

Scanner 类是在 java.util 包中定义的所以程序开头用 import 语句把 java.util 包中的 Scanner 类引入到程序中来。注意， Java 编译器编译源程序的时候会自动把 java.lang 包中的类和接口引入到程序中来，除此之外的其它包都不会自动引入。如果程序中要用到其它包的类，则需要用 import 语句把相应的类引入到程序中来。

**语句**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
Scanner myScanner = ``new` `Scanner(System.in);
```

是调用 Scanner 类的构造方法创建一个简单文本扫描器对象 myScanner。这里把 System.in 作为实参传递给 Scanner 类的构造方法，那么当系统初始化文本扫描器对象 myScanner 的时候就会把简单文本扫描器对象连接到标准输入流对象上了。

**语句**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
String name = myScanner.nextLine();
```

是调用 myScanner 对象的 nextLine 方法读取一行字符串，然后用这个字符串初始化字符串对象 name。语句：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
int` `age = myScanner.nextInt();
```

是调用 myScanner 对象的 nextInt 方法读取一个整数，然后把这个整数赋给变量 age。



### 活动3：观看数据的格式化输出的视频

点击折叠

下面的视频演示了数据的格式化输出。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid4-3.png)

**视频4-3：数据的格式化输出**

**1.启动Eclipse**

**2.在Prj0中创建类OutputTest2。**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
public` `class` `OutputTest2 {` `   ``public` `static` `void` `main(String[] args) {``    ``double` `x = ``100000.0` `/ ``3.0``;``    ``System.out.println(``"x = "` `+ x);``    ``System.out.printf(``"x = %8.2f"``, x);``   ``}``}
```

**3.运行程序。**

**4.最后陈述一下下面的解析。**

**活动3的解析：数据的格式化输出**

视频中的程序如下：

**例4-3** OutputTest2.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
public` `class` `OutputTest2 {` `  ``public` `static` `void` `main(String[] args) {``       ``double` `x = ``100000.0` `/ ``3.0``;``       ``System.out.println(``"x = "` `+ x);``       ``System.out.printf(``"x = %8.2f"``, x);``  ``}``}
```

**例4-3**的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
x = ``33333.333333333336``x = ``33333.33
```

**例4-3**的程序分析：

这里，语句

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
System.out.printf(``"x = %8.2f"``, x);
```

是使用System.out.printf()输出变量x的值，输出结果保留两位小数。这里使用了两个参数，前一个"x = %8.2f" 是**格式字符串**，它包含一个**格式说明符**%8.2f。后面一个是**参数列表**，这里参数列表只有一个参数x。输出的时候是把 x 的值按照格式说明符要求的格式插入到格式字符串中，然后把转换之后的文本输出到控制台。

下面的表4-2列出了一些常用的格式说明符。

**表4-2常用的格式说明符**

| 格式说明符 |         类型         |               例子               |
| :--------: | :------------------: | :------------------------------: |
|     D      |      十进制整数      |               159                |
|     X      |     十六进制整数     |                9f                |
|     O      |      八进制整数      |               237                |
|     F      |        浮点数        |               15.9               |
|     E      | 科学计数法形式浮点数 |             1.59e+01             |
|     S      |        字符串        |              Hello               |
|     C      |         字符         |                H                 |
|     B      |        布尔值        |               true               |
|     Tc     |   完整的日期和时间   | 星期五 四月 24 12:32:37 CST 2009 |
|     %      |        百分号        |                                  |



### 活动4：亲自用Eclipse开发一个格式化输出数据的程序

**Step 1.** 启动Eclipse。

**Step 2.** 在项目Prj0中创建一个类OutputTest3。该类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
import` `java.util.Date;` `public` `class` `OutputTest3 {` `  ``public` `static` `void` `main(String[] args) {``     ``System.out.printf(``"%tc"``, ``new` `Date());``  ``}``}
```

**Step 3.** 保存源程序。

**Step 4.** 运行程序，观察结果。

**Step 5.** 思考程序每条语句的功能。



### 字符串处理

请你按照下述步骤亲自用Eclipse开发一个格式化输出数据程序。

字符串常量是用双引号括起来的字符序列。Java把字符串作为对象来处理。把字符串当作对象的好处是在网络环境中，提供处理字符串的统一的规则和方法，同时提供异常处理功能，提高程序的健壮性。

Java用于处理处理字符串的类有两个：String类、StringBuffer类。需要注意的问题是：String类和String Buffer类都可以用来创建字符串对象。String Buffer类的对象与String类的对象相似，只不过String Buffer类对象可以改变，而且String类与String Buffer类提供的方法也有不同。

Java的编译器会为每个字符串常量生成一个String类的实例（对象）。

可以用字符串对象直接初始化一个String对象，例：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
String s = ``"Hello Java"
```

这里 "Hello Java" 是字符串常量，在编译的时候，系统会根据这个字符串常量创建一个 String 类的对象，然后用这个对象的引用初始化 String 类型的变量 s。

字符串常量可以直接调用String类提供的方法，例：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
int` `len= ``"Hello Java"``.length()
```

这里直接调用字符串对象的 length() 方法得到字符串长度。

**例4-4** StringReverse.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
public` `class` `StringReverse {` `  ``public` `static` `void` `main(String[] args) {``    ``String str = ``"This is a test string."``;``    ``String strR = reverse(str);``    ``System.out.println(strR);``  ``}` `  ``static` `String reverse(String s) {``    ``int` `len = s.length();``    ``StringBuffer buffer = ``new` `StringBuffer(len);``    ``for` `(``int` `i = len-``1``; i >= ``0``; i--)``    ``buffer.append(s.charAt(i));``    ``return` `buffer.toString();``  ``}` `}
```

**例4-4** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
.gnirts tset a si sihT
```

**例4-4** 的程序分析：

在 StringReverse 类中定义了静态方法 reverse()，作用是把 String参类型的参数 s 包含的字符序列逆序排序，把排序之后的字符串作为返回值。 reverse() 中先调用 s 的length() 方法取得字符串长度，然后用语句：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.2.html?node=858292479&detailRecordId=1318913719&studyrecordId=1225624963&sectionRecordId=1229924181#)

```
StringBuffer buffer = ``new` `StringBuffer(len); 
```

创建了一个 StringBuffer 类型的对象 buffer。StringBuffer 类型的对象与 String 类型的对象不同之处在于前者带有一个缓冲区，可以用缓冲的方式存放字符序列中的字符。这里创建的 buffer 是带有长度为 len 的缓冲区的字符串对象。之后的 for 循环语句是用从后向前的方式获取 s 的每个字符存储到缓冲字符串对象 buffer 的缓冲区中。最后，调用 buffer 对象的 toString() 方法把缓冲字符串对象转换成 String 类型的字符串对象作为方法的返回值。

在 main() 方法中给了一个字符串对象，然后调用 reverse() 方法得到该字符串的字符序列逆序的字符串对象，最后使用标准输出流打印出来。

## **4.3 声明类**

### 类的声明

一个类的声明包含两部分的内容：类的声明部分和类体。格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.3.html?node=858292480&detailRecordId=1318913720&studyrecordId=1225624963&sectionRecordId=1229924182#)

```
class Declaration{` `  ``classBody` `}
```

其中classDeclaration是类的声明部分。由花括号扩起来的classBody是类体。

完整的类声明格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.3.html?node=858292480&detailRecordId=1318913720&studyrecordId=1225624963&sectionRecordId=1229924182#)

```
[``public``] [``abstract``|``final``] ``class` `ClassName [``extends` `SuperClassName]` `        ``[``implements` `InterfaceNameList]` `{classbody}
```

其中，class是定义类的关键字，ClassName是类名。用户定义的类名必须符合标示符的命名规定。由花括号扩起来的语句是类体。在定义一个类的时候，这三部分是必不可少的。其余的由方括号扩起来的部分则是可选的。所谓“可选”的意思就是在定义一个类是，可以加上这些部分，也可以不加这些部分。加不加这些部分，要视具体情况而定。在第二个方括号中，是两个修饰符，abstract和final，它们用竖线“|”分隔，意思是二者只能选一。

下面对类声明的方括号中的内容逐项解释：

**(1)关键字public**

public是类声明中的修饰符，它的作用是把类声明为公共类，或叫做公有类。在没有这个修饰符的情况下，类只能被同一个源程序文件或同一个包中的其它类使用。加上public修饰符之后，类可以被任何包中的类使用。

**注意：** 在同一个源程序文件中，不能出现两个以上的public类。

**(2)关键字abstract**

abstract说明一个类为抽象类，不能用它实例化一个对象，它只能被继承。

**(3)关键字final**

final说明一个类为最终类，最终类不能有子类。换句话说，最终类不能被继承。

**注意：** final和abstract不能同时修饰一个类。

**(4)extends SuperClassName**

extends是Java的关键字，它表示类继承类某一个父类。SuperClassName是父类的类名。

**(5)implements InterfaceNameList**

implements是Java的关键字，它表示类实现了某些接口。InterfaceNameList是接口的列表。

在上面的那个完整的类声明格式中，由花括号扩起来的语句，就是类体。类体中定义了该类中所有的变量和该类所支持的方法。

类体中定义的变量和方法都是类的成员，所以称为成员变量和成员方法。



### 成员变量的声明

点击折叠

成员变量的声明必须放在类体中，通常是在成员方法之前。

在方法中声明的变量不是成员变量，而是方法的局部变量，二者是有区别的。成员变量的作用域是整个类，类中所有方法均可访问成员变量；而局部变量的作用域只是方法内部，一旦从方法中返回，该局部变量就消失。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.3.html?node=858292480&detailRecordId=1318913720&studyrecordId=1225624963&sectionRecordId=1229924182#)

```
[``public``|``private``|``protected``] [``package``] ``// 访问控制修饰符` `[``static``] [``final``] [``transient``] [``volatile``]` `类型 名称；
```

其中，变量的类型和变量的名称是必须的。其它在方括号中的内容根据具体情况来选择。在第一个方括号中扩起来的三个修饰符public、private和protected用竖线“|”分隔，表示在实际定义成员变量时，只能选择其中之一，不能同时使用这三个修饰符中的两个以上，修饰同一个成员变量

下面对成员变量声明的方括号中的内容逐项解释：

**(1)访问控制**

在成员变量声明格式中，前四个修饰符用于设定该成员变量的访问权限，限制其它对象对它的访问，所以叫做“访问控制修饰符”。

表4-3给出了访问控制修饰符的作用范围。

**表4-3 访问控制修饰符的作用范围**

|  修饰符   |  类  | 子类 |  包  | 所有类和包 |
| :-------: | :--: | :--: | :--: | :--------: |
|  public   |  √   |  √   |  √   |     √      |
|  private  |  √   |      |      |            |
| protected |  √   |  √*  |  √   |            |
|  package  |  √   |      |  √   |            |

public公共变量，可以被任何包中的任何类访问。由于公共变量对任何类都是可见的，所以它不具有数据保护功能。

private私有变量，只能被声明它的类所使用，拒绝任何外部类的访问。私有变量是不公开的，所以它的得到了最好的保护。

protected受保护变量，可以被声明它的类和该类的子类，以及同一个包中的类访问。

package包变量，可以被声明它的类和同一包中的其它类所访问。关键字package常常被省略，也就是说，没有访问控制修饰符的成员变量被自动视为package变量。

**(2)static静态变量**

用static修饰符修饰的变量是静态变量。静态变量属于这个类，被属于这个类的所有对象共同拥有。

**(3)final最终变量**

当使用关键字final修饰变量的时候，该变量的值在程序中将不能再被改变。这样的变量称为最终变量。最终变量也叫做标示符常量。

**(4)transient过渡变量**

用transient修饰符修饰的变量叫做过渡变量。过渡变量不允许被序列化。

**(5)volatile易失变量**

用volatile修饰符修饰的变量称为易失变量。volatile的作用是防止编译器对该成员变量进行某种优化。



### 成员方法的声明

对象的行为是通过方法实现的，其它对象可以调用一个对象的方法，通过消息的传递实现对该对象的控制。 成员方法的定义包括两部分内容：方法声明和方法体。格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.3.html?node=858292480&detailRecordId=1318913720&studyrecordId=1225624963&sectionRecordId=1229924182#)

```
methodDeclaration{``   ``methodBody``}
```

其中methodDeclaration是方法的声明。由花括号扩起来的metheodBody是方法体。 完整的方法声明格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.3.html?node=858292480&detailRecordId=1318913720&studyrecordId=1225624963&sectionRecordId=1229924182#)

```
[``public``|``private``|``protected``] [``package``] ``// 访问控制修饰符` `[``static``] [``final``|``abstract``] [``native``] [``synchronized``]` `returnType methodName( [paramList] ) [``throws` `exceptionList]
```

在这里，四种访问控制修饰符的作用与修饰成员变量时的作用相同。static修饰符也是同样。下面我们简要介绍本格式中的其它语法成分。

**(1)final最终方法**

用final修饰符修饰的最终方法只能被继承，不能被覆盖。后面我们讲类的继承的时候，会对final最终方法具体介绍。

**(2)abstract抽象方法**

用abstratct修饰符修饰的抽象方法只能用在抽象类中。后面我们讲接口的时候，会对abstract抽象方法具体介绍。

在对方法进行修饰的时候，final和abstract只能二选其一，不能同时使用final和abstract修饰同一个成员方法。

**(3)native本地方法**

修饰符native用来定义本地方法。本地方法用来把Java代码和其它语言的代码集成在一起。JDK提供了Java本地接口JNI(Java Native Interface)，使得Java虚拟机能运行嵌入在Java程序中的其它语言的代码。这些语言包括C/C++、FORTARN、汇编语言等等。

**(4)synchronized同步方法**

同步方法用于多线程编程。多线程在运行时可能会同时存取一个数据。为了避免数据的不一致性，应将方法声明为同步方法，对数据进行加锁，以保证线程的安全。

**(5)throws exceptionList**

短语throws exceptionList用来处理方法内可能发生的异常。当方法内的程序代码可能发生异常，而且在方法中又没有捕获这些异常时，就要使用短语throws exceptionList来从方法中抛出异常，以便让调用这个方法的程序来处理被抛出的异常。

**(6)returnType返回值类型**

Java要求一个方法必须声明它的返回值类型。如果方法没有返回值，就用关键字void作为返回值类型。

**(7)methodName方法名**

方法名由用户定义，它可以是任何有效的用户定义标示符。

**(8)paramList参数表**

在参数表中要声明参数的类型。当有多个参数时，各参数之间要用逗号分隔。在声明成员方法时使用的参数，称为方法的形式参数，简称形参。在调用方法时使用的参数称为方法的实际参数，简称实参。

**(9)方法体**

方法体式对方法的实现。它包括局部变量的声明以及所有合法的Java指令。

在方法中声明的变量称为局部变量。局部变量的作用域就是声明它的块，出了这个块，变量就消失了。

另外要注意，方法体包含在一对花括号中，即使方法体中没有语句，一对花括号也是不可少的。



### 构造方法的声明

构造方法是类的一种特殊的方法。Java中的每个类都有构造方法，构造方法的功能是为类的实例（对象）定义初始化状态。由于类是非原始数据类型，所以在创建属于某个类的实例（对象）的时候，要使用new运算符给对象分配内存。在new运算符为对象分配内存之后，Java自动调用类的构造方法，来确定对象的初始状态。

构造方法也有名称、参数、和方法体，并且也有访问权限的限制。但是，作为一种特殊的方法，它与其它方法还是有很大区别的。构造方法与其它方法的区别如下：

①构造方法的名称必须与类名相同。

②构造方法不能有返回值。

③用户不能直接调用构造方法，必须通过关键字new自动调用它。

## **4.4 创建对象和使用对象**

### 声明与创建对象

由类创建对象的过程，称为类的实例化。由类创建的这个对象，也称为类的一个实例。一个对象的生命周期包括三个阶段：创建、使用和清除。

要创建属于某个类的对象，可以通过下面两个步骤来完成：

**ⅰ. 声明对象变量。**

声明对象变量的格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.4.html?node=858292481&detailRecordId=1318913721&studyrecordId=1225624963&sectionRecordId=1229924183#)

```
type objectName; 
```

其中，type是复合类型（包括类和接口），而objectName是对象变量名。对象变量名可以使用任何合法的标示符。

**例如：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.4.html?node=858292481&detailRecordId=1318913721&studyrecordId=1225624963&sectionRecordId=1229924183#)

```
Integer i;
```

定义了一个Integer类型的对象变量i，其中Integer是系统类。

**ⅱ. 利用new运算符创建新对象，并指派给先前所创建的对象变量。**

我们在第一步中声明的对象变量，不是基本数据类型的变量，它所存放的并不是对象的实体。当声明一个对象变量之后，编译器仅仅分配一块内存给它，用来保存指向对象实体的一个地址。这个地址，在Java中称为引用或参考(reference)。对象的引用实际上类似于C\C++中的一个指针，它指向对象所在的内存地址。但是在Java中，这个地址是不能更改的，所以Java把它叫做引用或参考(reference)。

在Java中，每当创建对象时，系统都会从它管理的内存中分配一定的空间给这个对象。创建对象的方法是使用new运算符。使用new运算符创建新对象，并把新对象的引用赋给对象变量的格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.4.html?node=858292481&detailRecordId=1318913721&studyrecordId=1225624963&sectionRecordId=1229924183#)

```
objectName=``new` `classConstructor();
```

其中，objectName是对象变量名，new是对象实例化运算符。new运算符需要一个参数，这个参数就是classConstructor()，它是类的构造方法（类的构造器）。在这里，构造方法有两个作用，一个作用是提供要实例化的类的类名，另一个作用就是把新创建的对象初始化。new运算符被执行之后，会返回这个新创建的对象的引用。这个对象的引用被赋给对象变量objectName。

举例来说，设有长方形类CRectangle，则创建长方形对象的语法是：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.4.html?node=858292481&detailRecordId=1318913721&studyrecordId=1225624963&sectionRecordId=1229924183#)

```
CRectangle rect1; ``// 声明对象变量rect1``rect1=``new` `CRectangle(); ``// 利用new运算符创建新对象，并把返回的``     ``// 参考赋给变量rect1
```

另外，我们可以把声明与创建对象的两条语句合成一条语句。例如把刚才的朗条语句合成一条语句，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.4.html?node=858292481&detailRecordId=1318913721&studyrecordId=1225624963&sectionRecordId=1229924183#)

```
CRectangle rect1=``new` `CRectangle(); 
```

图4.2和动画4.1显示了这条语句的执行过程。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/r1.png)

经过这样一个过程之后，就可以使用对象变量rect1来引用对象实体了。



### 使用对象

对象被实例化之后，就可以使用了。我们可以使用对象的变量，也可以调用它的方法。

创建一个对象之后，它的数据和方法可以使用圆点运算符（.）来访问和调用，该运算符也称为对象成员访问运算符（Object member access operator）。Java通过成员访问运算符访问对象的数据和方法，其语法格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.4.html?node=858292481&detailRecordId=1318913721&studyrecordId=1225624963&sectionRecordId=1229924183#)

```
objectName.memberVariableName``objectName.memberMethodName
```

**例如：**我们可以使用如下语句来访问长方形对象rect1的成员变量和成员方法：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.4.html?node=858292481&detailRecordId=1318913721&studyrecordId=1225624963&sectionRecordId=1229924183#)

```
rect1.l=``12` `// 将长方形对象rect1的长度设置为12` `rect1.perimeter() ``// 获取长方形对象rect1的周长
```



### 清除对象

对象的清除是指释放对象占用的内存空间。很多OOP语言要求程序员跟踪所创建的对象，当不再使用这些对象的时候，由程序员负责清除它们，收回所占用的内存。但在Java语言中，对象使用完后的释放工作是由系统自动完成的，不需要程序员编程时关注。

Java引入了新的内存管理机制，由Java虚拟机担当垃圾收集器的工作。程序员可以创建对象而不用担心如何清除它们，垃圾收集器会自动清除它们。

使用new操作符创建对象之后，Java虚拟机自动为该对象分配内存并保持跟踪。Java虚拟机能判断出对象是否还被引用，对不再被引用的对象，释放它所占用的内存。这种定期寻找不再使用的对象并自动释放对象所占用内存的过程就称为垃圾收集。Java虚拟机实际上是利用变量生存期来管理内存的，对象的引用被保存在变量中，当程序跳出变量做在的区域后，它会被自动清除。

我们也可以自行清除一个对象，只要把一个空值null赋给这个对象引用即可。

**例如：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.4.html?node=858292481&detailRecordId=1318913721&studyrecordId=1225624963&sectionRecordId=1229924183#)

```
CRectangle rect1=``new` `CRectangle();
rect1.l=``12``rect1.perimeter()``rect1=``null``;
```

在执行最后一条语句之后，把代表空值的关键字null赋给对象变量rect1之后，对象将被清除。



### 动手实践

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/4.4.jpg)

**对象的创建过程**

## **4.5 一个对象和类编程实例**

### 开发背景和使用成员方法设置对象状态的程序

点击折叠

考虑开发一个薪酬管理系统。为了易于理解，我们考虑最简单的模型：系统只记录雇员的姓名和他的薪资。这里薪资只是记录一个数值，而不管它是月薪还是年薪。我们把雇员抽象为一个对象，它有姓名属性和薪资属性，而且不妨让这个对象还有设置和取得姓名以及薪资的方法。每个雇员都有这样的属性和方法，它们具有相同的结构，所以我们把它们看作是属于同一种类的对象，换句话说，就是把公司的所有雇员抽象为一个类。在程序中，我们定义用雇员类Employee来描述所有雇员对象所具有的结构，其代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
public` `class` `Employee {` `  ``private` `String name;  ``  ` `  ``private` `double` `salary; `` ` `  ``public` `void` `setName(String na) {``     ``name = na;``  ``}``  ``public` `void` `setSalary(``double` `sa) {``     ``salary = sa;``  ``}``  ``public` `String getName() {``     ``return` `name;``  ``}``  ``public` `double` `getSalary() {``     ``return` `salary;``  ``}` `}
```

这里的 Employee 类就是雇员类，它有两个成员变量 name 和 salary，分别用来描述雇员的姓名和薪资。它还有四个成员方法 setName()、 getName()、 setSalary() 和 getSalary()，分别用来设置雇员姓名、取得雇员姓名、设置雇员薪资、取得雇员薪资。

当程序中需要描述一个雇员的时候，我们就可以用 Employee 类创建一个雇员对象，用这个对象作为真实雇员的模拟。下面代码定义了程序的主类 PayrollSystem：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
public` `class` `PayrollSystem {` `  ``public` `static` `void` `main(String[] args) {``   ``// TODO Auto-generated method stub``   ``Employee e1 = ``new` `Employee();``   ``Employee e2 = ``new` `Employee();``   ` `   ``e1.setName(``"Carl Cracker"``);``   ``e1.setSalary(``1287.0``);``   ``e2.setName(``"Harry Hacker"``);``   ``e2.setSalary(``987.0``);``   ` `   ``System.out.print(``"name = "` `+ e1.getName());``   ``System.out.println(``", salary = "` `+ e1.getSalary());``   ``System.out.print(``"name = "` `+ e2.getName());``   ``System.out.println(``", salary = "` `+ e2.getSalary());``  ``}``}
```

在 PayrollSystem 类的main()方法中用 Employee 类分别创建了两个雇员对象 e1 和 e2，然后分别调用这两个对象的相关方法设置雇员的姓名和薪资，最后分别输出了这两个雇员的信息。



### 使用构造方法设置对象状态的程序

点击折叠

上述例子中，我们用专门的成员方法（set-get方法）为雇员对象的姓名和薪酬赋值。另一种常用的方法是在 Employee 类中提供自定义的构造方法，当根据类定义创建对象的时候，在对象初始化阶段为雇员对象的姓名和薪酬赋值。下面的程序说明了这种方法。

**例4-5** PayrollSystem.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
class` `Employee {` ` ``private` `String name;  `` ``private` `double` `salary; ` ` ``Employee(String n, ``double` `s) {``    ``name = n;``    ``salary = s;`` ``}` ` ``String getName() {``    ``return` `name;`` ``}` ` ``double` `getSalary() {``    ``return` `salary;`` ``}``}` `public` `class` `PayrollSystem {` `  ``public` `static` `void` `main(String[] args) {`` ` `   ``Employee e1 = ``new` `Employee(``"Carl Cracker"``, ``1287.0``);``   ``Employee e2 = ``new` `Employee(``"Harry Hacker"``, ``987.0``);`` ` `   ``System.out.print(``"name = "` `+ e1.getName());``   ``System.out.println(``", salary = "` `+ e1.getSalary());``   ``System.out.print(``"name = "` `+ e2.getName());``   ``System.out.println(``", salary = "` `+ e2.getSalary());``  ``}` `}
```

**例4-5** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
name = Carl Cracker, salary = ``1287.0``name = Harry Hacker, salary = ``987.0
```

**例4-5** 的程序分析：

程序中的方法 Employee() 是我们提供的构造方法，它用参数 n 和 s 分别给 Employee 类的成员变量 name 和 salary 赋值。

在主类 PayrollSystem 的 main() 方法中用

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
new` `Employee(``"Carl Cracker"``, ``1287.0``) 
```

创建一个对象。其中 **new** 是 对象实例化运算符， **new** 后面参数就是 Employee 类的构造方法，也就是说用 **new** 运算符调用类的构造方法创建对象。在这里，构造方法有两个作用，一个作用是提供要实例化的类的类名，另一个作用就是对象创建好之后对对象进行初始化。所谓对对象进行初始化，就是执行构造方法的代码。这里的效果就是用实参 **"Carl Cracker"** 和 1287.0 分别给对象的成员变量 name 和 salary 赋值。**new** 运算符被执行之后，会返回这个新创建的对象的引用，程序通过赋值运算符把刚刚创建的这个对象的引用赋给变量 e1，之后就可以由类变量 e1 引用这个新创建的对象了。同理，在创建对象 e1 之后创建了另一个对象 e2。



### 一个完整功能的程序

前面的程序用来说明如何定义类、如何由类创建对象，以及如何操作对象是比较好的。但程序的功能实在是过于简单了。下面对程序稍作变化，让使用程序的人能够给雇员增加薪酬，并且能够增加新雇员。需要考虑的问题是，给雇员增加薪酬的方法以及添加新雇员的方法写到哪里去呢？是放到 Employee 类中，还是放到 PayrollSystem 类中？首先，放到Employee 类不合适，因为给雇员增加薪酬或添加新雇员不是雇员对象应该做的事儿。放到 PayrollSystem 类中似乎也不合理，因为 PayrollSystem 类中作为程序的主类，主要完成控制程序主流程的功能，而不是做其他的事情。考虑实际的薪酬管理中，给雇员加薪和添加新雇员是由公司的专门的部门，例如人力资源管理部门或人事部门完成的，因此我们在程序中用一个控制对象充当公司中管理雇员薪酬的部门的角色，该对象有一个数组成员用于存储多个雇员的信息。当需要添加雇员的时候就创建一个雇员对象并且把这个雇员对象放到数组中。当需要删除雇员的时候就把需要删除的雇员从数组中删除。这个数组有点儿像雇员薪资册。我们把用于创建这个控制对象的类命名为 PayrollHandler，下面是这个类的代码。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
class` `PayrollHandler {` `   ``// 不妨假设公司雇员不会超过100人，并且雇员姓名没有相同的。` `  ``private` `Employee[] staff = ``new` `Employee[``100``];` `  ``void` `printStaff() {` `    ``for` `(``int` `i = ``0``; i < staff.length; i++) {``      ``if` `(``null` `!= staff[i]) {``         ``System.out.print(``"name = "` `+ staff[i].getName());``         ``System.out.println(``", salary = "` `+ staff[i].getSalary());``      ``}``    ``}``  ``}` `  ``void` `addAnEmployee(String n, ``double` `s) {` `    ``for` `(``int` `i = ``0``; i < staff.length; i++) {``      ``if` `(``null` `== staff[i]) {``         ``staff[i] = ``new` `Employee(n, s);``         ``break``;``      ``}``    ``}``  ``}` `  ``void` `deleteAnEmployee(String n) {`` ` `    ``for` `(``int` `i = ``0``; i < staff.length; i++) {``      ``if` `((staff[i].getName()).equals(n)) {``         ``staff[i] = ``null``;``         ``break``;``      ``}``    ``}``  ``}` `  ``void` `raiseSalary(String n, ``double` `s) {`` ` `    ``for` `(``int` `i = ``0``; i < staff.length; i++) {``       ``if` `(``null` `!= staff[i]){``         ``if` `((staff[i].getName()).equals(n)) {``            ``staff[i].setSalary(staff[i].getSalary() + s);``            ``break``;``         ``}``       ``}``    ``}``  ``}``}
```

这里，语句**private** Employee[] **staff** = **new** Employee[100];创建了数组staff[]，每个数组元素可以存放一个 Employee 对象的引用。雇员对象的引用就存储到这个数组中。方法 printStaff()、addAnEmployee()、deleteAnEmployee()、raiseSalary() 的功能依次是打印数组中存储的雇员信息、添加新雇员到数组中、从数组中删除指定姓名的雇员、给指定姓名的雇员添加指定的薪资。

有了 PayrollHandler 类之后就用它创建一个对象 **payrollhandler**，这个对象的职责是保存公司雇员的姓名和薪资信息，并提供相应的添加新雇员、删除雇员、给雇员加薪和打印当前所有雇员薪资表的方法。 问题是什么时候创建 **payrollhandler** 对象？考虑到 **payrollhandler**对象实际上是系统的一个组成部分，而我们这里也不想把程序搞得太复杂，所以我们就简单地把它看作是主类 PayrollSystem 的一个静态成员。



### 活动3：观看用Eclipse开发完整功能的薪酬管理程序的视频

点击折叠

下面的视频演示了用Eclipse开发完整功能的薪酬管理程序的过程。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid4-4.png)

**视频4-4：用Eclipse开发完整功能的薪酬管理程序**

**1.启动Eclipse。**

**2.新建项目PrjPayrollSystem。**

**3.在项目PrjPayrollSystem中创建类Employee。在“New Java Class”对话框中指定package为com.buptnu.payrollsystem.model。**编辑此类的程序代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
package` `com.buptnu.payrollsystem.model;` `public` `class` `Employee {` `private` `String name; ``private` `double` `salary; ` ` ``public` `Employee(String n, ``double` `s) {``   ``name = n;``   ``salary = s;`` ``}` ` ``public` `void` `setName(String na) {``   ``name = na;`` ``}`` ` ` ``public` `void` `setSalary(``double` `sa) {``   ``salary = sa;`` ``}`` ` ` ``public` `String getName() {``   ``return` `name;`` ``}`` ` ` ``public` `double` `getSalary() {``   ``return` `salary;`` ``}``}
```

**4.在项目PrjPayrollSystem中创建类PayrollHandler。在“New Java Class”对话框中指定package为com.buptnu.payrollsystem.handler。**编辑此类的程序代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
package` `com.buptnu.payrollsystem.handler;` `import` `com.buptnu.payrollsystem.model.Employee;` `public` `class` `PayrollHandler {``    ``// 不妨假设公司雇员不会超过100人，并且雇员姓名没有相同的。`` ``private` `Employee[] staff = ``new` `Employee[``100``];` ` ``public` `void` `printStaff() {``   ``for` `(``int` `i = ``0``; i < staff.length; i++) {``     ``if` `(``null` `!= staff[i]) {``       ``System.out.print(``"name = "` `+ staff[i].getName());``       ``System.out.println(``", salary = "` `+ staff[i].getSalary());``     ``}``   ``}`` ``}` ` ``public` `void` `addAnEmployee(String n, ``double` `s) {``   ``for` `(``int` `i = ``0``; i < staff.length; i++) {``     ``if` `(``null` `== staff[i]) {``       ``staff[i] = ``new` `Employee(n, s);``       ``break``;``     ``}``   ``}`` ``}` ` ``public` `void` `deleteAnEmployee(String n) {``   ``for` `(``int` `i = ``0``; i < staff.length; i++) {``     ``if` `((staff[i].getName()).equals(n)) {``       ``staff[i] = ``null``;``       ``break``;``     ``}``   ``}`` ``}` ` ``public` `void` `raiseSalary(String n, ``double` `s) {``   ``for` `(``int` `i = ``0``; i < staff.length; i++) {``     ``if` `(``null` `!= staff[i]){``       ``if` `((staff[i].getName()).equals(n)) {``         ``staff[i].setSalary(staff[i].getSalary() + s);``         ``break``;``       ``}``     ``}``   ``}`` ``}``}
```

**5.在项目PrjPayrollSystem中创建类PayrollSystem。在“New Java Class”对话框中指定package为com.buptnu.payrollsystem。**编辑此类的程序代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
 ``package` `com.buptnu.payrollsystem;` ` ``import` `java.util.Scanner;` ` ``import` `com.buptnu.payrollsystem.handler.PayrollHandler;` ` ``public` `class` `PayrollSystem {``  ``private` `static` `PayrollHandler payrollhandler = ``new` `PayrollHandler();` `   ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``int` `opr = -``1``;``    ``String n = ``null``;``    ``double` `s = ``0``.0d;``    ` `    ``Scanner in = ``new` `Scanner(System.in);``    ``while` `(``true``) {``      ``System.out.println(``"Enter a number between 0 and 2, 3 to end:"``);``      ``opr = in.nextInt();``      ``in.nextLine(); ``// 返回当前行的其余部分，不包括结尾处的行分隔符。当前位置移至下一行的行首。``              ``// 这里用in.nextLine()的目的是让扫描位置转到下一行的开头，否则会继续在当前行向后扫描。``              ``// 后面的in.nextLine()和in.nextDouble()就会出错了。``      ``if` `(``0` `== opr) {``        ``System.out.println(``"END."``);``        ``break``;``      ``}``      ``else` `if` `(``1` `== opr) {``        ``System.out.println(``"Add an employee."``);``        ``System.out.println(``"Please input the person's name:"``);``        ``n = in.nextLine();``        ``System.out.println(``"Please input the person's salary:"``);``        ``s = in.nextDouble();``        ``payrollhandler.addAnEmployee(n, s);``        ``payrollhandler.printStaff();``        ``continue``;``      ``}``      ``else` `if` `(``2` `== opr) {``        ``System.out.println(``"Delete an employee."``);``        ``System.out.println(``"Please input the person's name:"``);``        ``n = in.nextLine();``        ``payrollhandler.deleteAnEmployee(n);``        ``payrollhandler.printStaff();``        ``continue``;``      ``}``      ``else` `if` `(``3` `== opr) {``        ``System.out.println(``"Raise an employee's salary."``);``        ``System.out.println(``"Please input the person's name:"``);``        ``n = in.nextLine();``        ``System.out.println(``"Please input adding salary:"``);``        ``s = in.nextDouble();``        ``payrollhandler.raiseSalary(n, s);``        ``payrollhandler.printStaff();``        ``continue``;  ``      ``}``    ``}``  ``}``}
```

**6.运行程序PayrollSystem，观察结果。**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
Enter a number between ``0` `and ``2``, ``3` `to end:``1``Add an employee.``Please input the person's name:``Carl Cracker``Please input the person's salary:``1287.0``name = Carl Cracker, salary = ``1287.0``Enter a number between ``0` `and ``2``, ``3` `to end:``1``Add an employee.``Please input the person's name:``Harry Hacker``Please input the person's salary:``987.0``name = Carl Cracker, salary = ``1287.0``name = Harry Hacker, salary = ``987.0``Enter a number between ``0` `and ``2``, ``3` `to end:``2``Delete an employee.``Please input the person's name:``Carl Cracker``name = Harry Hacker, salary = ``987.0``Enter a number between ``0` `and ``2``, ``3` `to end:``3``Raise an employee's salary.``Please input the person's name:``Harry Hacker``Please input adding salary:``20.10``name = Harry Hacker, salary = ``1007.1``Enter a number between ``0` `and ``2``, ``3` `to end:``0``END.
```



### 活动4：亲自用Eclipse开发本节所述的完整功能的薪酬管理程序

点击折叠

请你按照下述步骤亲亲自用Eclipse开发较为完整功能的程序。

**Step1. 启动Eclipse。**

**Step2. 在项目PrjPayrollSystem中修改之前的com.buptnu.payrollsystem.model.Employee。**编辑为如下程序：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
package` `com.buptnu.payrollsystem.model;` `public` `class` `Employee {` `   ``private` `String name;  ``   ``private` `double` `salary; ``   ` `   ``public` `Employee(String n, ``double` `s) {``     ``name = n;``     ``salary = s;``   ``}``   ` `   ``public` `void` `setName(String na) {``     ``name = na;``   ``}``   ``public` `void` `setSalary(``double` `sa) {``     ``salary = sa;``   ``}``   ``public` `String getName() {``     ``return` `name;``   ``}``    ``public` `double` `getSalary() {``     ``return` `salary;``   ``}` ` ``}
```

**Step3. 在项目PrjPayrollSystem中创建类PayrollHandler。在“New Java Class”对话框中指定package为com.buptnu.payrollsystem.handler。**编辑此类的程序代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
package` `com.buptnu.payrollsystem.handeler;``import` `com.buptnu.payrollsystem.model.Employee;` ` ``public` `class` `PayrollHandler {``   ``// 不妨假设公司雇员不会超过100人，并且雇员姓名没有相同的。``   ``private` `Employee[] staff = ``new` `Employee[``100``];``   ` `   ``public` `void` `printStaff() {``     ``for` `(``int` `i = ``0``; i < staff.length; i++) {``       ``if` `(``null` `!= staff[i]) {``         ``System.out.print(``"name = "` `+ staff[i].getName());``         ``System.out.println(``", salary = "` `+ staff[i].getSalary());``       ``}``     ``}``   ``}``   ` `   ``public` `void` `addAnEmployee(String n, ``double` `s) {``     ``for` `(``int` `i = ``0``; i < staff.length; i++) {``       ``if` `(``null` `== staff[i]) {``         ``staff[i] = ``new` `Employee(n, s);``         ``break``;``       ``}``     ``}``   ``}``   ` `   ``public` `void` `deleteAnEmployee(String n) {``     ``for` `(``int` `i = ``0``; i < staff.length; i++) {``       ``if` `((staff[i].getName()).equals(n)) {``         ``staff[i] = ``null``;``         ``break``;``       ``}``     ``}``   ``}``   ` `   ``public` `void` `raiseSalary(String n, ``double` `s) {``     ``for` `(``int` `i = ``0``; i < staff.length; i++) {``       ``if` `(``null` `!= staff[i]){``         ``if` `((staff[i].getName()).equals(n)) {``         ``staff[i].setSalary(staff[i].getSalary() + s);``         ``break``;``         ``}``       ``}``     ``}``   ``}`` ``}
```

**Step4. 在项目PrjPayrollSystem中修改之前的com.buptnu.payrollsystem.PayrollSystem。**编辑为如下程序：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.5.html?node=858292482&detailRecordId=1318913723&studyrecordId=1225624963&sectionRecordId=1229924184#)

```
package` `com.buptnu.payrollsystem;``import` `java.util.Scanner;``import` `com.buptnu.payrollsystem.handeler.PayrollHandler;` ` ``public` `class` `PayrollSystem {` `   ``private` `static` `PayrollHandler payrollhandler = ``new` `PayrollHandler();` `   ``public` `static` `void` `main(String[] args) {``     ``// TODO Auto-generated method stub``     ``int` `opr = -``1``;``     ``String n = ``null``;``     ``double` `s = ``0``.0d;``     ` `     ``Scanner in = ``new` `Scanner(System.in);``     ``while` `(``true``) {``       ``System.out.println(``"Enter a number between 0 and 2, 3 to end:"``);``       ``opr = in.nextInt();``       ``in.nextLine(); ``// 返回当前行的其余部分，不包括结尾处的行分隔符。当前位置移至下一行的行首。``               ``// 这里用in.nextLine()的目的是让扫描位置转到下一行的开头，否则会继续在当前行向后扫描。``               ``// 后面的in.nextLine()和in.nextDouble()就会出错了。``       ``if` `(``0` `== opr) {``         ``System.out.println(``"END."``);``         ``break``;``       ``}``       ``else` `if` `(``1` `== opr) {``         ``System.out.println(``"Add an employee."``);``         ``System.out.println(``"Please input the person's name:"``);``         ``n = in.nextLine();``         ``System.out.println(``"Please input the person's salary:"``);``         ``s = in.nextDouble();``         ``payrollhandler.addAnEmployee(n, s);``         ``payrollhandler.printStaff();``         ``continue``;``       ``}``       ``else` `if` `(``2` `== opr) {``         ``System.out.println(``"Delete an employee."``);``         ``System.out.println(``"Please input the person's name:"``);``         ``n = in.nextLine();``         ``payrollhandler.deleteAnEmployee(n);``         ``payrollhandler.printStaff();``         ``continue``;``       ``}``       ``else` `if` `(``3` `== opr) {``         ``System.out.println(``"Raise an employee's salary."``);``         ``System.out.println(``"Please input the person's name:"``);``         ``n = in.nextLine();``         ``System.out.println(``"Please input adding salary:"``);``         ``s = in.nextDouble();``         ``payrollhandler.raiseSalary(n, s);``         ``payrollhandler.printStaff();``         ``continue``;  ``       ``}``     ``}``   ``}`` ``}
```

**Step5. 运行程序PayrollSystem，观察结果。**

**Step6. 思考程序每条语句的功能。**

注释：

上述的较为完成功能的程序并不严谨，还存在一些问题，比如实际中雇员可能有同名的，雇员人数可能超过100人，等等。如果做实际的程序，这些问题都需要解决。但是我们的目标是介绍最基本的 Java 技术，而这些软件设计的问题已经超出了本课程的范围，所以我们就采取了相当简化的程序模型。这样的简化带来的好处是让我们能够看到重点。也不必着急，饭总是要一口一口地吃，从能够开发简单的例子程序到能够开发实用的程序总是要有一个从量变到质变的过程。

## **4.6 方法**

### 主体内容

在面向对象的程序中，方法是用于定义对象的某个特定功能的代码段。Java中的方法都是在类中定义的，用于描述对象的某个特定功能。





### 方法的签名

点击折叠

为了描述方法，我们需要详细说明方法名和方法的参数类型。方法名和方法的参数类型称为方法的签名。例如前述PayrollHandler的方法：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
void` `addAnEmployee(String n, ``double` `s) {` `  ``for` `(``int` `i = ``0``; i < staff.length; i++) {``    ``if` `(``null` `== staff[i]) {``      ``staff[i] = ``new` `Employee(n, s);``      ``break``;``    ``}``  ``}``}
```

其签名是

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
addAnEmployee(String, ``double``)
```

方法的签名惟一标识了一个方法。换句话说就是，方法名和方法参数类型一起惟一标识了一个方法。



### 方法的调用

点击折叠

需要调用方法才能使用方法提供的功能。逻辑上看，方法是对象的一个组成部分，因而方法调用通常是通过对象的引用调用的。调用方法的语句格式是：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
reference.method(arguments)
```

这里 reference 表示某个对象的引用，method(arguments) 是对象的某个方法。需要注意的是 method(arguments) 是在对象所属的类中定义的。 arguments 是方法的参数列表。参数列表中可以包含多个参数，每个参数的声明包含参数类型和参数名两个部分，参数与参数之间用逗号隔开。

看一个简单的例子。考虑这样一种情况：程序中要创建一个能够做简单的整数加减法的计算器（对象），然后用这个计算器计算整数的加减法。我们可以先定义一个计算器类 Computer，然后实例化这个类，由这个类创建对象。由这个类创建的每一个对象都是一个具有整数加减法功能的计算器。 Computer 类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
class` `Computer {` `private` `int` `result; ` `  ``void` `compute(``int` `x, ``int` `y,``char` `operator) { ``      ``if` `(``'a'` `== operator)``        ``result = (x + y);``      ``else` `if` `(``'s'` `== operator)``        ``result = (x - y);``  ``}` `  ``int` `getResult() {``return` `result;}``}
```

这个类中定义了一个成员变量 **result**，用于保存计算结果。还有两个成员方法：方法 compute() 用于完成计算并把计算结果存储到变量 **result** 中。方法 getResult() 用于取得计算结果。在方法 compute() 的定义中声明了该方法需要三个参数，整型参数 x， 整型参数 y 和字符型参数 operator。我们把在方法中定义的参数称为方法的形式参数，简称形参。方法的形式参数实际上是属于方法代码段的局部变量，在方法的代码段中可以使用，而方法代码段之外的地方不能使用。因此我们会看到在方法 compute() 的方法体中的语句可以直接使用或操作方法的形式参数。 compute() 方法的前两个参数是实际要参与加减法运算的整数，第三个参数是一个字符类型的参数，用于表示要对前两个数据进行加法运算还是减法运算。方法体中的代码判断参数 operator 的值，如果是 **'a'** 则做加法运算并把运算结果存储到 result 中。如果是 **'s'** 则做减法运算并且也把运算结果存储到 result 中。

Computer 类描述了我们的加减法计算器对象的结构。由 Computer 类创建的每个对象都具有 Computer 类所描述的这种结构。

**例如：** 我们可以用这样的语句创建一个对象：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
Computer cmp = ``new` `Computer();
```

得到计算器对象 cmp 之后，就可以使用这个对象了。使用这个对象的计算两个整数的和就是调用对象 cmp 的comptuer() 方法去完成计算。

下面的图4.3表示了 Computer 类和其实例 cmp 之间的关系。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java4.png)

完整的程序如下：

**例4-6** ComputerApp.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
class` `Computer {``  ``private` `int` `result; ` `  ``void` `compute(``int` `x, ``int` `y,``char` `operator) { ``    ``if` `(``'a'` `== operator)``      ``result = (x + y);``    ``else` `if` `(``'s'` `== operator)``      ``result = (x - y);``  ``}``  ``int` `getResult() {``return` `result;}``}` `public` `class` `ComputerApp {` `  ``public` `static` `void` `main(String args[]) {``    ``int` `rs;``    ``Computer cmp = ``new` `Computer();``    ``cmp.compute(``3``, ``5``, ``'s'``);``    ``rs = cmp.getResult();``    ``System.out.println(``"The result is "` `+ rs + ``"."``);``  ``}``}
```

**例4-6** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
The result is -``2``.
```

**例4-6** 的程序分析：

语句 “cmp.compute(3, 5, 's');”是调用对象 cmp 的 compute() 方法。调用方法时要为方法的形式参数提供“值”，调用方法时提供的“值”叫实际参数，简称实参。方法调用过程中会把实参的值传给形参，然后再执行方法的代码。这里圆括号中是一个包含三个参数的参数列表，三个参数依次是整数3、整数5和字符’s’，它们就是实参，也就是为形参提供的“值”。调用方法compute(3, 5, 's') 的时候程序流程会转到 compute()方法的代码出去执行，同时把实参3, 5 和 's' 分别传递给形参 x, y 和 operator。方法的代码执行完成之后，返回原来调用方法的地方继续往后执行。

下面的图4.4与图4.5说明了程序的执行过程：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java6.png)

图4.4 方法调用过程1

**第一步：** 声明变量rs；

**第二步：**创建计算器对象，并把对象的引用赋给类变量cmp；

**第三步：**调用对象 cmp 的 compute() 方法。执行流程转到 Computer 类定义中的 compute() 方法代码处执行。同时把实参3, 5, 's'分别赋给形参 x, y 和 operator；

**第四步：**紧接着执行compute() 方法的代码；

**第五步：**执行 if 语句。判断表达式 ('a' == operator) 的值是 true还是 false。在此例中， operator 的值是 's'，所以此表达式的值是 false，流程转到 else if 后面；

**第六步：**判断 else if 后面的表达式('s' == operator)，此时表达式的值为 true，所以执行 else if 后面的程序分支；

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java7.png)

图4.5 方法调用过程2

**第七步：**计算 (x – y)，此时表达式的值是 -2，然后把计算结果 -2赋给变量 result。注意，这里变量 result 是成员变量，实际赋值是把 -2 写到对象 cmp 的成员变量 result中。参见图4.5中对象 cmp 的图例。

**第八步：**compute() 方法代码执行完毕，流程返回到调用“cmp.compute(3, 5, 's')”的地方继续往后执行，即接下来执行“rs = cmp.getResult();”。“cmp.getResult()”是调用对象 cmp 的 getResult() 方法。此方法调用的执行过程与前述类似，也是转到被调用方法处执行，方法执行完毕后返回。值得注意的是 getResult() 的代码是取得对象 cmp 的成员变量 result 的值，此时为 -2。getResult() 的 最后一条语句是return语句， 流程遇到 return 语句的时候从 getResult() 方法返回，并带回返回值 -2。方法返回后继续往后执行，此时做赋值运算，把从 getResult() 方法中带回的返回值赋给局部变量 rs。

**第九步：**输出结果“The result is -2.”。

**第十步：**流程遇到 main() 方法的方法体的结尾，运行结束。



### 方法的隐式参数与 this 引用

点击折叠

在例4-6的讲解中，我们曾经提到在程序执行的第七步时，语句“**result** = (x - y);”的执行结果是把 x – y 的值赋给对象 cmp 的成员变量 **result**。那里我们只是笼统地这么说，但仔细想想就会发现问题好像没那么简单：假如程序中创建了多个计算器对象，例如有两个，一个是 cmp，另一个是cmpp，那么当执行语句“result = (x - y);”的时候是把计算结果赋给cmp的成员变量 result，还是把计算结果赋给cmpp的成员变量 result？

我们在源程序中定义方法的一般格式是：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
returnType methodName(argument1, argument2)` `{` `  ``// some code here;` `}
```

在方法名后面的圆括号中是参数列表。这里是只有两个参数的情况，其它情况只是参数个数不同而已。在方法声明中列出的参数 argument1、 argument2 称为方法的显式参数。当编译源程序时，编译器会为方法添加一个隐式参数，方法声明的格式变成了如下样子：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
returnType methodName(argument0, argument1, argument2)``{` `  ``// some code here;` `}
```

其中 argument0 是编译器添加的隐式参数。方法的隐式参数 argunent_0用来存储运行时刻传来的当前对象的引用。在运行时刻，当由对象调用这个方法时，运行时系统会把当前对象的引用作为实参传递给这个参数argument_0。 argument_0 有一个专门的名字，叫 this 引用，它是系统提供的，不用你自己声明，直接用就可以。

这样，例4-6中的方法调用

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
cmp.compute(``3``, ``5``, ``'s'``);
```

实际上变成了

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
Computer.compute(cmp, ``3``, ``5``, ``'s'``);
```

也就是以 cmp, 3, 5, 's' 为参数，调用 Computer 类的 compute() 方法。执行的代码就是

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
if` `(``'a'` `== operator)``  ``this``.result = (x + y);``else` `if` `(``'s'` `== operator)``  ``this``.result = (x - y);
```

由于把 cmp 赋给argument0，所以这里 this 指向的对象和 cmp 指向的对象是同一个对象，从而代码修改的就是对象 cmp 的result。

类似地，假设有另外一个计算器对象 cmpp 时，如果调用 cmpp 的compte( ) 方法，那么由于是把 cmpp 传递给 compute() 方法的隐式参数的，this 指向 cmpp 指向的对象实体，所以修改的就是 cmpp 的result。

我们编写源程序时也可以直接使用 this 引用。

**例如：**在源程序中可以用下面的方式写代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
class` `Computer {` `private` `int` `result; ` `  ``void` `compute(``int` `x, ``int` `y,``char` `operator) { ``     ``if` `(``'a'` `== operator)``        ``this``.result = (x + y);``     ``else` `if` `(``'s'` `== operator)``        ``this``.result = (x - y);``  ``}``  ``int` `getResult() {``return` `result;}``}
```

使用 this 引用还有一个好处就是可以将局部变量和实例变量明显地区分开。考虑下面的代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
class` `Employee {` `private` `String name;  ``private` `double` `salary; ` `  ``void` `setName(String name) {``     ``name = name;``  ``}``  ``void` `setSalary(``double` `salary) {``     ``salary = salary;``  ``}``  ``String getName() {``     ``return` `name;``  ``}``  ``double` `getSalary() {``     ``return` `salary;``  ``}``}
```

我们看这个类定义的 setName() 方法。我们写这段代码的本意是使用 setName() 方法为实例变量 name 赋值。但是这样写代码是不对的。方法体中的语句“name = name;”的意图是前一个 name 是 Employee 类的实例变量，后一个name是方法声明中的形参，目的是把形参 name 的值赋给实例变量 name。但是如果这样写代码的话，由于赋值运算符前后的变量名相同，系统没法明白我们的意思，系统会认为这两个 name 都是方法的局部变量。同理，方法 setSalary() 也是有问题的。用 this 引用就可以解决这个问题。把上面的类定义改成这样就正确了：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
class` `Employee {` `private` `String name;  ``private` `double` `salary; ` `  ``void` `setName(String name) {``    ``this``.name = name;``  ``}``  ``void` `setSalary(``double` `salary) {``    ``this``.salary = salary;``  ``}``  ``String getName() {``    ``return` `name;``  ``}``  ``double` `getSalary() {``    ``return` `salary;``  ``}``}
```

完整的程序如下

**例4-7** PayrollSystem.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
class` `Employee {``private` `String name;  ``private` `double` `salary; ` `  ``void` `setName(String name) {``    ``this``.name = name;``  ``}``  ``void` `setSalary(``double` `salary) {``    ``this``.salary = salary;``  ``}``  ``String getName() {``    ``return` `name;``  ``}``  ``double` `getSalary() {``    ``return` `salary;``  ``}``}` `public` `class` `PayrollSystem {` `  ``/**``   ``* @param args``   ``*/``  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``Employee e1 = ``new` `Employee();``    ``Employee e2 = ``new` `Employee();``    ` `    ``e1.setName(``"Carl Cracker"``);``    ``e1.setSalary(``1287.0``);``    ``e2.setName(``"Harry Hacker"``);``    ``e2.setSalary(``987.0``);``    ` `    ``System.out.print(``"name = "` `+ e1.getName());``    ``System.out.println(``", salary = "` `+ e1.getSalary());``    ``System.out.print(``"name = "` `+ e2.getName());``    ``System.out.println(``", salary = "` `+ e2.getSalary());` `  ``}` `}
```

**例4-7** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
name = Carl Cracker, salary = ``1287.0` `name = Harry Hacker, salary = ``987.0
```

**想一想：**

把本例的 Employee 类的getName() 和 getSalary() 方法中的变量名字前面也都加上 this 引用可以吗？自己动手试试吧！

注释：

实例方法有隐式参数，而类方法没有，所以在类方法中不能使用 this 引用。这样确保了类方法不能操作实例成员或者是调用其它实例方法。

要点： 关于this引用

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 成员方法中隐含有 this 引用（编译器给加的）。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 成员方法的代码在做数据运算时，隐含使用了this 引用，如 this.grams * this.calories。也可以在成员方法的代码中显示地使用 this 引用。但是编程时如无必要，尽量不显示地使用 this。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) this 引用实际上存储的是当前对象的引用，也就是“调用方法的那个对象”的引用。通过这个引用可以找到当前对象，然后使用当前对象的数据做运算。



### 方法的重载

点击折叠

方法重载可以实现Java的编译时多态。重载的英文名称是overloading，它是在相同类内，定义名称相同，但参数个数或参数类型不同的方法。(仅仅有返回值数据类型不同是不行的）。编译器会根据实参的个数和类型，确定调用哪个方法。所谓编译时多态，是指程序会根据参数的不同来调用相应的方法。具体调用哪个被重载的方法，是由编译器在编译阶段决定的。所以编译时多态也叫做静态多态性。

看如下例程，体会“重载”。

**例4-7** MOL.java 成员方法的重载

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
class` `MOL {` `  ``long` `cube(``long` `a) {``return` `a*a*a;}``  ``double` `cube(``double` `d) {``return` `d*d*d;}``  ``public` `static` `void` `main(String[] args) {``    ``MOL obj=``new` `MOL();``    ``long` `x;``    ``double` `y;``    ``x=obj.cube(``5``);``    ``y=obj.cube(``0.9``);``    ``System.out.println(``"long:"``+x);``    ``System.out.println(``"double:"``+y);``  ``}``}
```

**例4-8** NumberContainerApp.java 构造方法的重载

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.6.html?node=858292483&detailRecordId=1318913724&studyrecordId=1225624963&sectionRecordId=1229924185#)

```
class` `NumberContainer {` `  ``private` `int` `x;``  ``private` `double` `y; ``  ``NumberContainer() {``    ``x = ``0``; y = ``0.0``;``  ``}``  ``NumberContainer(``int` `x) {``    ``this``.x = x;``  ``}``  ``NumberContainer(``double` `y) {``    ``this``.y = y;``  ``}``  ``NumberContainer(``int` `x,``double` `y) {``    ``this``.x = x;``    ``this``.y = y;``  ``}``  ``void` `show() {``    ``System.out.println(``"x = "` `+ x + ``"\ty = "` `+ y);``  ``}``}``public` `class` `NumberContainerApp {``  ``public` `static` `void` `main( String args[] ) {``    ``NumberContainer co1 = ``new` `NumberContainer();``    ``NumberContainer co2 = ``new` `NumberContainer(``3``);``    ``NumberContainer co3 = ``new` `NumberContainer(``0.92``);``      ``NumberContainer co4 = ``new` `NumberContainer(``5``, ``5.3``);``    ``co1.show(); ``    ``co2.show();``    ``co3.show(); ``    ``co4.show();``  ``}``}
```

要点： 关于重载

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 重载的关键是方法具有不同的“签名”，如此编译器才能区分它们的不同

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 不但可以重载成员方法，也可以重载构造方法。



### 动手实践

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/4.6.jpg)

**隐式参数与方法调用**

## **4.7 内部类**

### 主体内容

Java允许将一个类的定义放在另一个类的内部。定义在另一个类内部的类就是内部类。内部类允许我们把一些逻辑相关的类组织在一起，并控制在内部的类的访问特性。



### 内部类的声明和使用

内部类的声明格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
class` `外部类名称 {``  ``//外部类成员`` ``class` `内部类名称 {``   ``//内部类成员`` ``}``}
```

内部类的对象持有一个隐式引用，它引用了实例化该内部对象的外围类对象。通过这个引用，可以访问外围类对象的全部状态。



### 活动1：观看关于内部类的视频

点击折叠

下面的视频演示了内部类的声明和使用。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid4-5.png)

**视频4-5：内部类的声明和使用**

这里演示一个内部类的声明和使用的视频。

**1. 打开视频4-5的PPT，讲解。**

**2. 启动Eclipse。**

**3. 在Prj0中创建类Car。**

**4. 在Prj0中创建类CarApp。**

**5. 运行程序。**

**6. 最后陈述一下下面的解析。**

**例4-10** CarApp.java 视频4-5中的程序

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
public` `class` `Car {` ` ``private` `int` `gasoline = ``0``;`` ``private` `Engine eg = ``new` `Engine(); ``// 发动机`` ` ` ``public` `Engine getEngine() {``  ``return` `eg;`` ``}`` ` ` ``public` `void` `refuel(``int` `gas) {``  ``gasoline = gasoline + gas;``  ``System.out.println(``"Car refueling "` `+ gas + ``" liters"``);`` ``}` ` ``class` `Engine {``  ``void` `start() {``   ``if` `(``0` `== gasoline)``    ``System.out.println(``"The engine does not starts."``);``   ``else` `if` `(gasoline > ``0``) {``    ``System.out.println(``"The engine starts."``);``   ``}``   ``else``    ``System.out.println(``"The car broke down."``);``  ``}`` ``}``}` `public` `class` `CarApp {`` ``public` `static` `void` `main(String[] args) {``  ``// TODO Auto-generated method stub``  ``Car myCar = ``new` `Car();``  ``myCar.getEngine().start();``  ``myCar.refuel(``10``);``  ``myCar.getEngine().start();`` ``}``}
```

**例4-10** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
The engine does not starts.``Car refueling ``10` `liters``The engine starts.
```

**例4-10** 的程序分析：

小汽车类 Car 的私有成员变量 **gasoline** 用于表示汽油量。另一个私有成员变量 **eg** 是一个 Engine 类的对象。Engine 类是 Car 类的内部类，它可以使用其外部类，也就是 Car 类的任何成员，包括私有成员变量 **gasoline**。所以在本程序中， Engine 类的 start() 方法直接使用 Car 类的成员变量 **gasoline** 是合法的。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
myCar.getEngine().start();
```

就是(myCar.getEngine()).start()，即先调用 myCar 对象的 getEngine() 方法取得汽车的发动机对象，之后再调用发动机对象的.start()方法启动发动机。

**方法**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
void` `start() {`` ``if` `(hasGasoline)``  ``System.out.println(``"The engine starts."``);`` ``else``  ``System.out.println(``"The engine does not starts."``);``}
```

的正式写法是

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
void` `start() {`` ``if` `(Car.``this``.hasGasoline)``  ``System.out.println(``"The engine starts."``);`` ``else``  ``System.out.println(``"The engine does not starts."``);``}
```

创建内部类对象的正式写法是

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
private` `Engine eg = ``this``.``new` `Engine();
```

注释：

内部类是一种编译器现象，与虚拟机无关。当使用内部类时，编译器会从外部类中把内嵌的类分离出来并调整编译结果。使用内部类的目的只是是为了使用更合适的方式组织代码。



### 匿名内部类

点击折叠

有些情况下我们创建的对象仅仅在程序中使用一次就不会再用了。这个时候就没有必要给这个对象命名。匿名内部类提供了创建不具名称的对象的简便地编写代码的方法。

创建匿名内部类并访问成员的语法：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
(`` ``new` `ClassName( )``  ``{``  ``type variableName;``  ``returnType methodName([paramList])``  ``{``   ``methodBody;``  ``}`` ``}``).methodName(param1,param2,...,param n)
```

分成两步来看：

**第一步：**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java12.png)

**第二步：**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java13.png)

下面是一个使用匿名内部类的程序。

**例4-11** MyTry.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
class` `Content {`` ``protected` `String label = ``"hello"``;``}` `class` `C {`` ``C() {``  ``(``    ``new` `Content() {``     ``protected` `int` `i = ``1``;``     ``void` `print() {``      ``System.out.println(label);``      ``System.out.println(``"i = "` `+ i);``     ``}``    ``}``  ``).print();`` ``}``}` `public` `class` `MyTry {`` ``public` `static` `void` `main(String[] args) {``  ``C obj = ``new` `C();`` ``}`` ` `}
```

**例4-11** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
hello``i = ``1
```

**例4-11** 的程序分析：

在类 C 的构造方法中创建匿名类对象，在初始化对象的时候就会调用这段代码了。

**例4-11** 的程序等价于下面的程序：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.7.html?node=858292484&detailRecordId=1318913725&studyrecordId=1225624963&sectionRecordId=1229924186#)

```
class` `Content {`` ``protected` `String label = ``"hello"``;``}` `class` `C {`` ``C() {``  ``class` `D ``extends` `Content {``   ``protected` `int` `i = ``1``;``   ``void` `print() {``    ``System.out.println(label);``    ``System.out.println(``"i = "` `+ i);``   ``}``  ``}``  ``(``new` `D()).print();`` ``}``}` `public` `class` `MyTry {`` ``public` `static` `void` `main(String[] args) {``  ``C obj = ``new` `C();`` ``}``}
```

## **4.8 类成员和实例成员**

### 主体内容

成员变量和成员方法是类的基本组成部分，它们分别用于描述该类的实例具有的属性和功能。不管成员变量也好，还是成员方法也好，都有类成员和实例成员之分。下面就介绍它们的区别。



### 类和对象的逻辑结构与内存区域

点击折叠

类的代码和对象都占有一定的内存区域。在类的内存区域中，存储了类的成员变量的定义信息和成员方法代码。

图4.8表明了类的存储区域存储的内容。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/q1.png)

**图4.8 CInvoice 类的成员**

对象也会占有自己的内存区域。图4.9表明了类和对象的内存区域。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/q2.png)

**图4.9 类和对象的内存区域**

由 Employee 类创建了两个对象，一个是 e1，一个是e2。按照前面讲的，每个对象都有自己的内存区域，在每个对象的存储区域中都会为变量 name 和变量 salary 分配存储空间，这样 e1 的 name 和 salary 与 e2 的 name 和 salary 在存储上是独立的，存储的实际的值是互不影响的。但是要注意，成员方法的代码只在类的内存区域存储，在每个对象的内存区域是不会再分配的，因为所有对象的成员方法的代码都是相同的，没有必要在每个对象内再重复存储方法的代码。

值得注意的是，虽然方法的代码只在类的存储区域存储，不在每个对象的内存区域重复存储，但是从逻辑上看，我们仍然认为对象持有成员方法。

图4.10说明了例4-5程序中的类和对象之间的逻辑关系。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/q3.png)

**图4.9 类和对象的存储区域与逻辑关系**



### 类变量和实例变量

点击折叠

通过前面的介绍，我们知道了类怎样定义对象的成员变量和成员方法，而且我们知道，在每个对象的内存区域中都单独存储自己拥有的成员变量，而成员方法只在类的内存区域中存储一份。这是我们通常所需要的。但是，有时我们会希望某个变量被类的所有实例共享。例如，在薪酬管理系统中，每个雇员会有一个惟一的雇员号，为了这个属性，我们给 Employee 类增加一个用于记录雇员号的成员变量 id。我们希望雇员号是递增的，即新增加雇员的时候新雇员的雇员号是原有最大雇员号加一。那么我们还需要一个表示当前最大雇员号的变量，比如叫 maxId。显然，这个 maxId 应该是 Employee 类的所有对象共有的，而不是某个对象特有的。如果仍然按照前面的方法去处理变量 maxId 显然不合理，那么我们该怎么办呢？答案是我们在声明变量 maxId 的时候用 static 修饰符修饰它，把它声明为类变量。看下面的程序代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.8.html?node=858292485&detailRecordId=1318913726&studyrecordId=1225624963&sectionRecordId=1229924187#)

```
class` `Employee {` `  ``private` `String name; ``// per-object field  ``  ``private` `double` `salary; ``// per-object field``  ``private` `int` `id; ``// per-object field``  ``private` `static` `int` `maxId = ``0``; ``// per-class field (one only)``  ` `  ``Employee(String n, ``double` `s) {``    ``name = n;``    ``salary = s;``    ``setId();``  ``}``  ` `  ``void` `setId() {``    ``id = maxId;``    ``maxId++;``  ``}``  ``int` `getId() {``    ``return` `id;``  ``}``  ``String getName() {``    ``return` `name;``  ``}``  ``double` `getSalary() {``    ``return` `salary;``  ``}``}
```

在这个类定义中，用 static 修饰符修成员变量 maxId，这样就把 maxId 定义成为一个类变量。这个类变量只在Employee 类的内存区域存储一份，被 Employee 类的所有实例共享。当一个对象改变此变量值以后，其它对象使用此变量的值也随之更改。仔细分析下面的例 4-12 及其运行结果就可以理解这个问题。

**例4-12** PayrollSystem.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.8.html?node=858292485&detailRecordId=1318913726&studyrecordId=1225624963&sectionRecordId=1229924187#)

```
class` `Employee {` `  ``private` `String name; ``// per-object field  ``  ``private` `double` `salary; ``// per-object field``  ``private` `int` `id; ``// per-object field``  ``private` `static` `int` `maxId = ``0``; ``// per-class field (one only)``  ` `  ``Employee(String n, ``double` `s) {``    ``name = n;``    ``salary = s;``    ``setId();``  ``}``  ` `  ``void` `setId() {``    ``maxId++;``    ``id = maxId;``  ``}``  ``int` `getId() {``    ``return` `id;``  ``}``  ``String getName() {``    ``return` `name;``  ``}``  ``double` `getSalary() {``    ``return` `salary;``  ``}``}` `public` `class` `PayrollSystem {` `  ``/**``   ``* @param args``   ``*/``  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``Employee e1 = ``new` `Employee(``"Carl Cracker"``, ``1287.0``);``    ``Employee e2 = ``new` `Employee(``"Harry Hacker"``, ``987.0``);``    ``Employee e3 = ``new` `Employee(``"Jerry"``, ``887.0``);``    ` `    ``System.out.print(``"ID = "` `+ e1.getId());``    ``System.out.print(``", name = "` `+ e1.getName());``    ``System.out.println(``", salary = "` `+ e1.getSalary());``    ``System.out.print(``"ID = "` `+ e2.getId());``    ``System.out.print(``", name = "` `+ e2.getName());``    ``System.out.println(``", salary = "` `+ e2.getSalary());``    ``System.out.print(``"ID = "` `+ e3.getId());``    ``System.out.print(``", name = "` `+ e3.getName());``    ``System.out.println(``", salary = "` `+ e3.getSalary());``  ``}` `}
```

**例4-12** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.8.html?node=858292485&detailRecordId=1318913726&studyrecordId=1225624963&sectionRecordId=1229924187#)

```
ID = ``1``, name = Carl Cracker, salary = ``1287.0``ID = ``2``, name = Harry Hacker, salary = ``987.0``ID = ``3``, name = Jerry, salary = ``887.0
```

**例4-12** 的程序分析：

方法 setId() 的功能是把 **maxId**的值加一作为新雇员的雇员号，构造方法中调用方法 setId() 设置当前雇员对象的雇员号。

创建对象 e1 之前，**maxId**的值是0。创建对象 e1 之后系统会调用 Employee 类的构造方法初始化对象 e1。构造方法的最后一行代码是调用方法 setId() 设置雇员号。而方法 setId() 执行的时候会把 **maxId**的值加一，然后把所得的值赋给成员变量 id，也就是把雇员号最大值加一作为新雇员的雇员号。这个过程中把 **maxId**的值从0修改为1。之后在创建对象 e2 的时候，就会把 e2 的 id 设置成2，创建对象 e3 的情况同理。

在整个过程中会看到， e1、 e2 和 e3 共享变量 **maxId**。

综上所述， **maxId**是实例变量，在内存中只存储一份，所有雇员对象共享，当一个变量把 **maxId**改成其它值以后，其它对象的这个成员的值也跟着改变。

在声明成员变量的时候，用关键字static修饰的变量就是类变量，类变量也称为静态变量。没有被关键字static修饰的变量就是实例变量。两种成员变量区别在于实例变量属于个别对象所有，每个对象都有自己的一份实例变量；而类变量属于类本身，属于类的所有实例，它在内存中只存储一份，该类的所有实例访问的都是类变量的同一个拷贝。



### 类方法和实例方法

点击折叠

成员方法也有类方法和实例方法之分。在声明成员方法的时候，用关键字static修饰的方法就是类方法，没有被关键字static修饰的方法就是实例方法。类方法也称为静态方法。类方法和实例方法的区别在于类方法不针对特定的对象，所以在没有创建对象之前可以执行，而且在类方法中只能访问类变量和类方法，而不能访问实例变量和实例方法。实例方法则只能针对特定的对象执行，因此，如果任何对象都不存在，则也就没有可以执行的实例方法。调用类方法有两种情况，一种通过类名调用类方法，另一种是通过对象名调用类方法。

**例4-13** PayrollSystem.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.8.html?node=858292485&detailRecordId=1318913726&studyrecordId=1225624963&sectionRecordId=1229924187#)

```
class` `Employee {` `  ``private` `String name; ``// per-object field  ``  ``private` `double` `salary; ``// per-object field``  ``private` `int` `id; ``// per-object field``  ``private` `static` `int` `maxId = ``0``; ``// per-class field (one only)``  ` `  ``Employee(String n, ``double` `s) {``    ``name = n;``    ``salary = s;``    ``setId();``  ``}``  ` `  ``void` `setId() {``    ``maxId++;``    ``id = maxId;``  ``}``  ``int` `getId() {``    ``return` `id;``  ``}``  ``static` `int` `getMaxId() {``    ``return` `maxId;``  ``}` `  ``String getName() {``    ``return` `name;``  ``}``  ``double` `getSalary() {``    ``return` `salary;``  ``}``}` `public` `class` `PayrollSystem {` `  ``/**``   ``* @param args``   ``*/``  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``System.out.println(``"max ID = "` `+ Employee.getMaxId());``    ` `    ``Employee e1 = ``new` `Employee(``"Carl Cracker"``, ``1287.0``);``    ``Employee e2 = ``new` `Employee(``"Harry Hacker"``, ``987.0``);``    ``Employee e3 = ``new` `Employee(``"Jerry"``, ``887.0``);``    ` `    ``System.out.print(``"ID = "` `+ e1.getId());``    ``System.out.print(``", name = "` `+ e1.getName());``    ``System.out.println(``", salary = "` `+ e1.getSalary());``        ` `    ``System.out.print(``"ID = "` `+ e2.getId());``    ``System.out.print(``", name = "` `+ e2.getName());``    ``System.out.println(``", salary = "` `+ e2.getSalary());``    ``System.out.print(``"ID = "` `+ e3.getId());``    ``System.out.print(``", name = "` `+ e3.getName());``    ``System.out.println(``", salary = "` `+ e3.getSalary());``    ` `    ``System.out.println(``"max ID = "` `+ Employee.getMaxId());``    ``System.out.println(``"max ID = "` `+ e3.getMaxId());``  ``}` `}
```

**例4-13** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.8.html?node=858292485&detailRecordId=1318913726&studyrecordId=1225624963&sectionRecordId=1229924187#)

```
max ID = ``0``ID = ``1``, name = Carl Cracker, salary = ``1287.0``ID = ``2``, name = Harry Hacker, salary = ``987.0``ID = ``3``, name = Jerry, salary = ``887.0``max ID = ``3``max ID = ``3
```

**例4-13** 的程序分析：

main() 方法中的第一条语句中的 Employee.getMaxId() 是在没有创建任何对象的情况下调用类方法。此时使用类名 Employee 调用类方法 getMaxId()。

main() 方法中的最后两条语句是在创建对象之后调用类方法。此时即可以用类名调用类方法，也可以用对象名调用类方法，二者的执行结果是相同的。

## **4.9 动手项目**

### 动手项目4-1 用Eclipse开发类变量和实例变量实例程序

点击折叠

**所需时间：**30分钟。

**项目目标：**掌握类变量和实例变量的使用方法。

**过程描述：**

（1）启动Eclipse。

（2）在项目Prj0中创建一个类EmployeeC，放在default包中，该类代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.9.html?node=858292486&detailRecordId=1318913727&studyrecordId=1225624963&sectionRecordId=1229924188#)

```
class` `EmployeeC {` `  ``private` `String name; ``// per-object field  ``  ``private` `double` `salary; ``// per-object field``  ``private` `int` `id; ``// per-object field``  ``private` `static` `int` `maxId = ``0``; ``// per-class field (one only)``  ``EmployeeC(String n, ``double` `s) {``    ``name = n;``    ``salary = s;``    ``setId();``  ``}``  ``void` `setId() {``    ``maxId++;``    ``id = maxId;``  ``}``  ``int` `getId() {``    ``return` `id;``  ``}``  ``String getName() {``    ``return` `name;``  ``}``  ``double` `getSalary() {``    ``return` `salary;``  ``}``}
```

（3）在项目Prj0中创建一个类PayrollSystem，放在default包中，该类代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.9.html?node=858292486&detailRecordId=1318913727&studyrecordId=1225624963&sectionRecordId=1229924188#)

```
public` `class` `PayrollSystem {` `  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``EmployeeC e1 = ``new` `EmployeeC(``"Carl Cracker"``, ``1287.0``);``    ``EmployeeC e2 = ``new` `EmployeeC(``"Harry Hacker"``, ``987.0``);``    ``EmployeeC e3 = ``new` `EmployeeC(``"Jerry"``, ``887.0``);``    ``System.out.print(``"ID = "` `+ e1.getId());``    ``System.out.print(``", name = "` `+ e1.getName());``    ``System.out.println(``", salary = "` `+ e1.getSalary());``    ``System.out.print(``"ID = "` `+ e2.getId());``    ``System.out.print(``", name = "` `+ e2.getName());``    ``System.out.println(``", salary = "` `+ e2.getSalary());``    ``System.out.print(``"ID = "` `+ e3.getId());``    ``System.out.print(``", name = "` `+ e3.getName());``    ``System.out.println(``", salary = "` `+ e3.getSalary());``  ``}``}
```

（4）运行程序PayrollSystem，观察结果。

（5）思考：在EmployeeC的成员变量中，哪些是类变量？哪些是实例变量？它们有什么区别？

## **4.10 小结**

### 主体内容

点击折叠

面向对象编程（Object Oriented Programming）简称OOP 就是使我们分析、设计和实现一个系统的方法尽可能地接近我们认识客观世界的方法。

对象（Object）代表现实世界中可以明确标识的一个实体。例如，一个学生、一张桌子、一个圆、一个按钮甚至一笔贷款都可以看作是一个对象。每个对象都有自己独特的标识、状态和行为。

一个对象的行为（Behavior）也称为动作（Action），是由方法（Method）定义的。调用对象的一个方法就是要求对象完成一个动作。

同一类的对象具有相同的类别的属性和行为。面向对象方法把同一类对象划归一个一个类（Class），用类来描述同一类对象所共同具有的那些类别的属性和行为。类作为创建对象的模板使用。

从程序组成的角度看，类是一种数据类型，而对象则是相应类（数据类型）的一个具体“值”。

面向对象程序设计的基本原则和特征：抽象、分类、封装、继承、多态、消息通信。

所谓系统类，就是开发 Java 平台的人事先编制好的类代码，随 Java 平台一起提供给我们使用。安装Java运行时系统以后，这些系统类的代码就安装在我们的计算机上了。

除了java.lang包以外，其它包在编译程序的时候不会自动导入，需要用import语句导入到程序中才能用。

只是计算机科学中才引入了“数据类型”的概念。数据类型的出现是为了把数据分成所需内存大小不同的数据，编程的时候，需要用大数据的时候才需申请大内存，不需要按数据的时候就分配小内容，这样就可以充分利用内存。 例如大胖子必须睡双人床，就给他双人床，瘦的人单人床就够了。

一个类的声明包含两部分的内容：类的声明部分和类体。

方法名和方法的参数类型称为方法的签名。方法的签名是方法的“标识”。

圆点运算符（.）也称为对象成员访问运算符（Object member access operator），Java通过成员访问运算符访问对象的数据和方法，其语法格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java4.10.html?node=858292487&detailRecordId=1318913728&studyrecordId=1225624963&sectionRecordId=1229924189#)

```
objectName.memberVariableName``objectName.memberMethodName
```

每个对象持有自己的数据（存储在成员变量中）和方法，通过圆点运算符调用某个对象的方法是对该对象所持有数据进行操作。而Java通过方法的隐式参数和this引用实现这种方法调用机制。

Java允许将一个类的定义放在另一个类的内部。定义在另一个类内部的类就是内部类。但内部类是一种编译器现象，与虚拟机无关。当使用内部类时，编译器会从外部类中把内嵌的类分离出来并调整编译结果。

不管成员变量也好，还是成员方法也好，都有类成员和实例成员之分。

在声明成员变量的时候，用关键字static修饰的变量就是类变量，类变量也称为静态变量。没有被关键字static修饰的变量就是实例变量。类变量只在类的内存区域存储一份，因而被类的所有实例共享，当一个对象改变此变量值以后，其它对象使用此变量的值也随之更改；实例变量在每个对象自己的内存区域分别存储一份，因而每个对象的实例变量的值都是不同的。

在声明成员方法的时候，用关键字static修饰的方法就是类方法，没有被关键字static修饰的方法就是实例方法。类方法也称为静态方法。类方法和实例方法的区别在于类方法不针对特定的对象，所以在没有创建对象之前可以执行，而且在类方法中只能访问类变量和类方法，而不能访问实例变量和实例方法。实例方法则只能针对特定的对象执行，因此，如果任何对象都不存在，则也就没有可以执行的实例方法。

调用类方法有两种情况，一种通过类名调用类方法，另一种是通过对象名调用类方法。

## **4.11 思考题**

### 主体内容

**1.类变量和实例变量有哪些不同？**

**答：**在声明成员变量的时候，用关键字static修饰的变量就是类变量，类变量也称为静态变量。没有被关键字static修饰的变量就是实例变量。类变量只在类的内存区域存储一份，因而被类的所有实例共享，当一个对象改变此变量值以后，其它对象使用此变量的值也随之更改；实例变量在每个对象自己的内存区域分别存储一份，因而每个对象的实例变量的值都是不同的。

**2.类方法和实例方法有哪些不同？**

**答：**在声明成员方法的时候，用关键字static修饰的方法就是类方法，没有被关键字static修饰的方法就是实例方法。类方法也称为静态方法。类方法和实例方法的区别在于类方法不针对特定的对象，所以在没有创建对象之前可以执行，而且在类方法中只能访问类变量和类方法，而不能访问实例变量和实例方法。实例方法则只能针对特定的对象执行，因此，如果任何对象都不存在，则也就没有可以执行的实例方法。

**3.什么是内部类？使用内部类有什么好处？**

**答：**Java允许将一个类的定义放在另一个类的内部。定义在另一个类内部的类就是内部类。但内部类是一种编译器现象，与虚拟机无关。当使用内部类时，编译器会从外部类中把内嵌的类分离出来并调整编译结果。

内部类允许我们把一些逻辑相关的类组织在一起，并控制在内部的类的访问特性。内部类的对象持有一个隐式引用，它引用了实例化该内部对象的外围类对象。通过这个引用，可以访问外围类对象的全部状态。

# **第5章 继承和多态**

## **5.1 继承的概念和实现**

### 主体内容

继承是面向对象编程的一个重要机制，它允许你在已有类的基础上创建新的类。当你创建一个新类，声明它是从某个已有类继承得到的时候，你就重用了那个已有类的属性和方法，同时你还可以向新类中添加新的属性和方法，以适应新的情况，解决新的问题。

在面向对象的理论中，“继承”是一个原始概念，没办法给出一个定义，只能描述它。通过描述和例子来慢慢理解这个概念。



### 活动1：观看关于子类继承父类成员的视频

下面的视频演示了继承的概念、实现方法及继承的基本内涵。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid5-3.png)

**视频5-1：子类继承父类成员的实例**

**PPT引入：**

视频5-1的PPT

前面在雇员薪酬管理系统的例子中，我们把雇员抽象为拥有姓名和薪资两个属性的对象。任何一个雇员都有这两个属性。相应地，用雇员类描述雇员对象的属性和功能。

现在把问题考虑得再细致一些：在一个公司中可能有多个部门，每个部门有部门经理。其实部门经理也是雇员，具有雇员的属性和方法。另外，部门经理还具有一些普通雇员没有的特殊的属性。比如，部门经理除了拿工资之外，还有奖金。而作为一般的雇员是没有奖金的。在这种情况下，需要定义一个新的类来表示部门经理。我们自然可以从头儿开始定义一个新类作为部门经理类，但如果这样，就要要把原来雇员类中的所有属性和方法，在部门经理类中都重新写一遍。很麻烦。另外，如果重新定义一个部门经理类的话，部门经理类和原来的雇员类是相互独立的，没有逻辑联系。没有把“部门经理也是雇员”这样的逻辑关系就没有表达出来。为了解决这个问题，面向对象方法中提出了“继承”的概念。我们可以利用继承来创建部门经理类。把雇员类作为父类，部门经理类作为它的子类，这样就可以描述部门经理是一种特殊的雇员了。

我们先看看部门经理类不添加任何新成员的情况。

**1.新建一个Java项目PrjInheritance。** 本章的实例都放到这个项目中。

**2.在项目PrjInheritance中创建雇员类Employee。** Employee类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.1.html?node=858292513&dt=7585&sectionRecordId=1229924195#)

```
public` `class` `Employee {` `  ``String name; ``// 包访问权限``  ``double` `basicSalary; ` `  ``void` `setName(String na) { ``// 包访问权限``    ``name = na;``  ``}` `  ``void` `setBasicSalary(``double` `sa) {``    ``basicSalary = sa;``  ``}` `  ``String getName() {``    ``return` `name;``  ``}` `  ``double` `getBasicSalary() {``    ``return` `basicSalary;``  ``}``}
```

**3.创建部门经理类Manager。** 在“New Java Class”对话框的“Superclass”域，将“java.lang.Object”改为“Employee”。Manager类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.1.html?node=858292513&dt=7585&sectionRecordId=1229924195#)

```
public` `class` `Manager ``extends` `Employee {` `}
```

**注意，Manager类的类体中什么语句都没写。**

**4.创建一个Java Application程序主类PayrollApp。**

PayrollApp的main方法中创建部门经理类的对象并使用设置它的姓名和基本工资，然后在屏幕打印出来。PayrollApp类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.1.html?node=858292513&dt=7585&sectionRecordId=1229924195#)

```
public` `class` `PayrollApp {` ` ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``   ``Manager aManager = ``new` `Manager();``   ``aManager.name = ``"Phoebe"``;``   ``aManager.basicSalary = ``3780``;``   ``System.out.println(aManager.getName());``   ``System.out.println(aManager.getBasicSalary());`` ``}``}
```

**5.运行程序，查看结果。**

**6.提示思考（返回视频5-1的PPT）：** aManager是Manager类的对象，它是一个部门经理对象，而Manager类的类体中没有写任何语句，那么aManager的name、basicSalary、getName()、getBasicSalary()从哪里来的呢？答案在于继承。Manager类的声明部分，在类名之后使用extends短语，声明Manager类扩展Employee类，这样，它就由Employee类继承了Employee类中定义的所有属性和方法，故此，Manager类的对象拥有成员变量name、basicSalary，拥有成员方法setName()、setSalary()、getName()、getBasicSalary()。虽然我们没有在后来的Manager类的类体中定义任何的成员变量和成员方法，但它通过继承，已经有了父类中定义的成员变量和成员方法。

**要点1：** 类的继承

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java使用关键字extends声明类之间的继承关系。extends之后的类是父类，extends之前的类是子类。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java中，子类继承父类的所有成员。有人说子类只继承父类的非私有成员，这是不准确的。子类继承父类的所有成员，只是父类的私有成员在子类中不可见而已。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 面向对象方法中的继承有单一继承和多重继承之分。单一继承是指一个子类只继承一个父类，而多重继承是指一个类可以同时继承多个父类的属性和功能。Java只支持单一继承，不支持多重继承。



### 活动2：观看关于子类新增成员的视频

下面的视频演示了子类不但可以继承父类成员，而且可以定义自己的新增成员。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid5-2.png)

**视频5-2：子类新增成员的实例**

前一个视频中，我们仅仅声明部门经理类Manager由雇员类Employee继承得到，而没有给Manager类添加任何新成员，这个视频来看一下给Manager类添加新成员的情况。

**1. 打开项目PrjInheritance的Manager类，为其添加新成员，如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.1.html?node=858292513&dt=7585&sectionRecordId=1229924195#)

```
public` `class` `Manager ``extends` `Employee {``double` `bonus;` `void` `setBonus(``double` `bo) {``  ``bonus = bo;``}``double` `getBonus() {``  ``return` `bonus;``}``}
```

**2. 打开项目PrjInheritance的PayrollApp类，为其添加语句如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.1.html?node=858292513&dt=7585&sectionRecordId=1229924195#)

```
public` `class` `PayrollApp {` `  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``Manager aManager = ``new` `Manager();``    ``aManager.name = ``"Phoebe"``;``    ``aManager.basicSalary = ``3780``;``    ``aManager.bonus = ``5000``;``    ``System.out.println(aManager.getName());``    ``System.out.println(aManager.getBasicSalary());``    ``System.out.println(aManager.getBonus());``  ``}``}
```

**3. 运行程序，查看结果。**

**4. 提示：**Manager类的中定义了成员变量setBonus，定义了成员方法setBonus()、getBonus()，这些是子类Manager新增的成员。这样，雇员对象Manager类不但拥有从父类继承而来的成员，还拥有自己新增的成员。

## **5.2 成员变量的隐藏和成员方法的覆盖**

### 活动：观看关于成员变量的隐藏和成员方法的视频

如果子类的类体中定义的成员变量与父类继承来的某个成员变量同名，会是怎样的情况？如果子类的类体中定义的某个成员方法与父类继承来的某个成员方法的方法声明相同，又会是怎样的情况呢？

下面的视频演示了上面的情况。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid5-3.png)

**视频5-3：成员变量的隐藏和成员方法的覆盖**

考虑在雇员类Employee和部门经理类Manager中都增加描述总工资的成员变量，不妨把这个变量命名为totalSalary。显然，普通员工的totalSalary的计算方法就是他的基本工资，而部门经理的totalSalary则是他的基本工资加上奖金。

**1. 打开项目PrjInheritance的Employee类，为其添加新成员，如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.2.html?node=858292513&detailRecordId=1318913782&studyrecordId=1225624963&sectionRecordId=1229924193#)

```
public` `class` `Employee {` `  ``String name; ``// 包访问权限``  ``double` `basicSalary; ``  ``double` `totalSalary; ``// 总工资` `  ``void` `setName(String na) { ``// 包访问权限``    ``name = na;``  ``}` `  ``void` `setBasicSalary(``double` `sa) {``    ``basicSalary = sa;``  ``}` `  ``void` `setTotalSalary() { ``// 设置总工资``    ``totalSalary = basicSalary;``  ``}` `  ``String getName() {``    ``return` `name;``  ``}` `  ``double` `getBasicSalary() {``    ``return` `basicSalary;``  ``}` `  ``double` `getTotalSalary() { ``// 获取总工资``    ``setTotalSalary();``    ``return` `totalSalary;``  ``}``}
```

**2. 打开项目PrjInheritance的Manager类，为其添加新成员，如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.2.html?node=858292513&detailRecordId=1318913782&studyrecordId=1225624963&sectionRecordId=1229924193#)

```
public` `class` `Manager ``extends` `Employee {` `  ``double` `bonus;``  ``double` `totalSalary; ``// 总工资` `  ``void` `setBonus(``double` `bo) {``    ``bonus = bo;``  ``}` `  ``void` `setTotalSalary() { ``// 设置总工资``    ``totalSalary = basicSalary + bonus;``  ``}` `  ``double` `getBonus() {``    ``return` `bonus;``  ``}` `  ``double` `getTotalSalary() { ``// 获取总工资``    ``setTotalSalary();``    ``return` `totalSalary;``  ``}``}
```

**3.打开项目PrjInheritance的PayrollApp类，为其添加语句如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.2.html?node=858292513&detailRecordId=1318913782&studyrecordId=1225624963&sectionRecordId=1229924193#)

```
public` `class` `PayrollApp {` `  ``public` `static` `void` `main(String[] args) {` `    ``// TODO Auto-generated method stub``    ``Manager aManager = ``new` `Manager();``    ``aManager.name = ``"Phoebe"``;``    ``aManager.basicSalary = ``3780``;``    ``aManager.bonus = ``5000``;``    ``System.out.println(aManager.getName());``    ``System.out.println(aManager.getBasicSalary());``    ``System.out.println(aManager.getBonus());``    ``System.out.println(aManager.getTotalSalary());``  ``}``}
```

**4. 运行程序，查看结果。**

**5. 提示：** Employee类和Manager类的继承关系如下图所示：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/5.2.png)

问题是，雇员对象aManager中用到的totalSalary是从父类继承来的那totalSalary还是在子类中自己定义的那个totalSalary呢？答案是如果没有做特殊说明，默认使用子类中自己定义的成员。成员变量是如此成员方法也是如此。

**要点1：** 成员变量的隐藏和成员方法的覆盖

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 在类的继承关系中，当子类的成员变量与父类的成员变量同名时，子类的成员变量会隐藏父类的成员变量；当子类的方法与父类的方法具有相同的方法名、返回值、以及相同的参数个数和参数类型时，子类的方法会覆盖父类的方法。当子类对象调用被覆盖的方法时，会按照该方法在子类中定义的代码执行；该方法在父类中定义的代码被隐藏。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 当子类隐藏父类的成员变量时，子类中由父类继承而来的成员变量依然存在。在子类中，默认情况下使用子类定义的变量。如果想使用父类被隐藏的变量，则要用如下格式：super.原变量名。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 当子类覆盖父类的成员方法时，默认使用子类的方法。如果想使用父类被覆盖的方法，则要用如下的格式：super.原方法名。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 如果父类的成员变量没有被隐藏，或成员方法没有被覆盖，则可以在子类中直接使用，不必使用关键字super。

**要点2：** 编译时多态和运行时多态

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java中的多态就是指一个程序中同名的不同方法共存的情况。分为编译时多态和运行时多态两类。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 方法重载可以实现Java的编译时多态。它是在相同类内，定义名称相同，但参数个数或参数类型不同的方法。编译器会根据实参的个数和类型，确定调用哪个方法。所谓编译时多态，是指程序会根据参数的不同来调用相应的方法。具体调用哪个被重载的方法，是由编译器在编译阶段决定的。所以编译时多态也叫做静态多态性。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 方法覆盖可以实现Java的运行时多态。它是在子类当中，定义名称、参数个数与类型均与父类相同的方法，用以改写父类方法的功能。运行时多态是一种在运行时，而不是在编译时调用覆盖方法的一种机制。对于覆盖的方法，Java运行时系统根据调用该方法的实例的类型，来决定选择哪个方法调用。



### 动手实践

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/5.2.jpg)

成员变量的隐藏与成员方法的覆盖

## **5.3 super引用**

### 主体内容

在类的继承关系中，如果子类隐藏了父类的某个成员变量或覆盖了父类的某个成员方法，此时要想指定使用父类继承来的被隐藏的成员变量，或调用被覆盖的成员方法，则需使用super引用明确声明。



### 活动：观看关于super引用的视频

下面的视频演示了super引用的使用方法和效果。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid5-4.png)

**视频5-4：super引用**

**1.打开项目PrjInheritance的Manager类，添加如下代码：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.3.html?node=858292514&detailRecordId=1318913783&studyrecordId=1225624963&sectionRecordId=1229924194#)

```
void` `show() {` `  ``super``.totalSalary = ``1000``;``  ``System.out.println(``"'totalSalary' inheriting from Employee is "` `+ ``super``.totalSalary);``  ``System.out.println(``"'totalSalary' defined in Manager is "` `+ totalSalary);` `}
```

**2.打开项目PrjInheritance的PayrollApp类，在mian()方法的最后添加如下代码：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.3.html?node=858292514&detailRecordId=1318913783&studyrecordId=1225624963&sectionRecordId=1229924194#)

```
aManager.show();
```

**3.查看运行结果。**

**4.提示：** Manager类的show()方法中使用super引用明确指定使用从父类继承来，但是被隐藏了的成员变量。

**要点：** this引用和super引用

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) this引用和super引用都是系统提供的，在使用前都是不需要声明。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 关键字this只能用于方法的方法体内。当一个对象创建后，Java虚拟机（JVM）就会给这个对象分配一个引用自身的指针，这个指针的名字就是this。因此，this只能在类中的非静态方法中使用，静态方法和静态的代码块中绝对不能出现this，并且this只和特定的对象关联，而不和类关联，同一个类的不同对象有不同的this。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 关键字super用在子类当中，使被隐藏的成员变量或被覆盖的成员方法或变为可见，或者说用来引用被隐藏的成员变量和被覆盖的成员方法。super可以理解为是指向自己父类的一个指针，而这个父类指的是离自己最近的一个父类。

## **5.4 继承中的构造方法**

### 主体内容

本节讨论子继承中的构造方法的问题。



### 活动：观看关于继承中的构造方法的视频

下面的视频演示了继承中的构造方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid5-5.png)

**视频5-5：继承中的构造方法**

**1. 在项目PrjInheritance中创建雇员类Employee1，Employee1类的代码如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.4.html?node=858292515&detailRecordId=1318913784&studyrecordId=1225624963&sectionRecordId=1229924198#)

```
public` `class` `Employee1 {` `  ``protected` `String name; ``  ``protected` `double` `basicSalary; ``  ` `  ``Employee1(String n, ``double` `bs) {``    ``name = n;``    ``basicSalary = bs;``  ``}``  ` `  ``String getName() {``    ``return` `name;``  ``}``  ``double` `getSalary() {``    ``return` `basicSalary;``  ``}``}
```

**2. 在项目PrjInheritance中创建雇员类Manager1，Manager1类的代码如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.4.html?node=858292515&detailRecordId=1318913784&studyrecordId=1225624963&sectionRecordId=1229924198#)

```
public` `class` `Manager1 ``extends` `Employee1 {` `  ``protected` `double` `bonus;``  ` `  ``Manager1(String na, ``double` `bs, ``double` `bo) {``    ``super``(na, bs);``    ``setBonus(bo);``  ``}``  ``void` `setBonus(``double` `bo) {``    ``bonus = bo;``  ``}``  ``double` `getBonus() {``    ``return` `bonus;``  ``}``  ``double` `getSalary() {``    ``return` `basicSalary + bonus;``  ``}``}
```

**3. 创建一个Java Application程序主类PayrollApp1。PayrollApp1的代码如下：**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.4.html?node=858292515&detailRecordId=1318913784&studyrecordId=1225624963&sectionRecordId=1229924198#)

```
public` `class` `PayrollApp1 {` `  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``Manager1 aManager = ``new` `Manager1(``"Phoebe"``, ``2185.05``, ``1000.0``);``    ``System.out.println(aManager.getName());``    ``System.out.println(aManager.getBonus());``    ``System.out.println(aManager.getSalary());``  ``}``}
```

**4. 运行程序。**

活动的解析：本视频中创建的包

（1）本视频中，子类定义了自己的构造方法 Manager1(String na, double bs, double bo)。在这个构造方法中有两条语句，第一条是使用super(na, bs);调用父类的构造方法为从父类继承来的 name 和 basicSalary 赋初值，第二条是调用 setBonus() 方法为自己新添的 bonus 赋初值。

（2）本视频中的Employee1类的数据成员声明为protected访问控制权限，这样子类中可以直接使用。如果把它们声明为private权限，则子类虽然继承它们，但不能直接访问，还得调用父类的可见方法访问它们。

## **5.5 继承的层次结构**

### 主体内容

一个类A可以派生子类B，子类B还可以在派生子类的子类C，这样形成一种多层次的继承关系。此时，C继承B的所有成员，也就意味着继承了A的所有成员。

看这样一个程序：

**例5-1** MultiLayerApp.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.5.html?node=858292516&detailRecordId=1318913785&studyrecordId=1225624963&sectionRecordId=1229924199#)

```
class` `Vehicle {` ` ``public` `void` `start() {``  ``System.out.println(``" Starting..."``);`` ``}``}` `class` `Aircraft ``extends` `Vehicle {`` ``public` `void` `fly() {``  ``System.out.println(``" Flying..."``);`` ``}``}` `class` `Whirlybird ``extends` `Aircraft {`` ``public` `void` `whirl() {``  ``System.out.println(``" Whirling..."``);`` ``}``}` `class` `Jet ``extends` `Aircraft {`` ``public` `void` `zoom() {``  ``System.out.println(``" Zooming..."``);`` ``}``}` `public` `class` `MultiLayerApp { ``//MultiLayerApp`` ``public` `static` `void` `main(String[] args) {``  ``Whirlybird w;``  ``w = ``new` `Whirlybird();``  ``w.start(); w.fly(); w.whirl();``  ``Jet j;``  ``j = ``new` `Jet();``  ``j.start(); j.fly(); j.zoom();`` ``}``}
```

**例5-1** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.5.html?node=858292516&detailRecordId=1318913785&studyrecordId=1225624963&sectionRecordId=1229924199#)

```
Starting...``Flying...``Whirling...``Starting...``Flying...``Zooming...
```

**例5-1** 程序中类之间的继承关系如图5.1所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/o1.png)

**图5.1 类的继承示例**

**要点1：**多层继承中的成员继承问题

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png)在多层次的继承中，子类继承其所有直接父类和间接父类的成员，即子类继承其直接父类，父类的父类，父类的父类的父类……的所有成员。

## **5.6 Object类和系统类的继承层次**

### 主体内容

Java 中有个特殊的系统类 —— Object 类，它是 Java 程序中所有类的祖先。Java 程序中的所有类都由 Object 类直接继承或简介继承得到的。以前我们写自定义类的时候，没有用 extends 短语表明继承自哪个父类，在这样的情况下默认我们写的自定义类直接由 Object 类继承得到。举个例子，我们这样写

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.6.html?node=858292517&detailRecordId=1318913786&studyrecordId=1225624963&sectionRecordId=1229924196#)

```
class` `Employee {`` ``// …``}
```

和这样写

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.6.html?node=858292517&detailRecordId=1318913786&studyrecordId=1225624963&sectionRecordId=1229924196#)

```
class` `Employee ``extends` `Object {`` ``// …``}
```

是一样的。

Object类是系统类，同其它系统类一样，是 Java 平台必须提供的 API。Object在 Java 的类库 java.lang 中定义。这个类仅提供了一些关于类本身的方法，很少有具体的功能。表5-1列举了Object类的三个常用方法。

|           方法名           |               功能说明               |
| :------------------------: | :----------------------------------: |
|      Class getClass()      |   取得调用getClass()的对象的所属类   |
| boolean equals(Object obj) | 判断两各类变量所指的是否为同一个对象 |
|     String toString()      |   将调用toString()的对象转成字符串   |

前面在讲“对象的本体”时提到，每个对象和其他所有对象都是有区别的，即使两个对象保存完全相同的数据，它们也是不同的对象。我们可用下面的程序验证一下：

**例5-2** PayrollSystem.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.6.html?node=858292517&detailRecordId=1318913786&studyrecordId=1225624963&sectionRecordId=1229924196#)

```
class` `Employee {` ` ``private` `String name; `` ``private` `double` `salary; `` ` ` ``Employee(String n, ``double` `s) {``  ``name = n;``  ``salary = s;`` ``}`` ` ` ``String getName() {``  ``return` `name;`` ``}`` ``double` `getSalary() {``  ``return` `salary;`` ``}``}` `public` `class` `PayrollSystem {` ` ``/**``  ``* @param args``  ``*/`` ``public` `static` `void` `main(String[] args) {``  ``// TODO Auto-generated method stub``  ``Employee e1 = ``new` `Employee(``"Carl Cracker"``, ``1287.0``);``  ``Employee e2 = ``new` `Employee(``"Carl Cracker"``, ``1287.0``);``  ` `  ``System.out.println(e1.toString());``  ``System.out.print(``"name = "` `+ e1.getName());``  ``System.out.println(``", salary = "` `+ e1.getSalary());``  ` `  ``System.out.println(e2.toString());``  ``System.out.print(``"name = "` `+ e2.getName());``  ``System.out.println(``", salary = "` `+ e2.getSalary());`` ``}` `}
```

**例5-2** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.6.html?node=858292517&detailRecordId=1318913786&studyrecordId=1225624963&sectionRecordId=1229924196#)

```
Employee``@a90653``name = Carl Cracker, salary = ``1287.0``Employee``@de6ced``name = Carl Cracker, salary = ``1287.0
```

**例5-2** 的程序分析：

toString() 方法是在 Object 类中定义，继承到 Employee 类中的。它返回返回该对象的字符串表示。通常，toString 方法会返回一个“以文本方式表示”此对象的字符串。这里， e1.toString()返回一个字符串，该字符串由类名（对象是该类的一个实例）、at 标记符“@”和此对象 e1哈希码的无符号十六进制数（此即为 e1 的引用）表示组成。 e2.toString() 同理。

从运行结果可以看到，e1 和 e2 的引用是不同的，它们是两个不同的对象，虽然它们的状态相同。

Java 提供了很多系统类，这些系统类也是按照一定的层次结构继承下来的。看一个例子。以前我们用过 Integer 类。它的继承的层次如下面的图5.2所示。系统类的继承层次可以从Java SE Documentation中查到。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/o2.png)

**图5.2 类的继承示例**



## **5.7 对象的转型**

### 主体内容

基本数据类型的数据在某些情况下可以转变成另外类型的数据。对于对象，也就是类类型的数据，在某种情况下也可以转换。对象的类型发生在父类对象和子类对象之间，其转换分为upcasting 和 casting两种。



### Upcasting

子类对象可以看作是父类对象，子类对象的引用可以赋给父类对象。此时，子类与父类共有的方法（覆盖），默认情况下仍然调用子类的覆盖方法的代码。

**例5-3** MyTry.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.7.html?node=858292518&detailRecordId=1318913787&studyrecordId=1225624963&sectionRecordId=1229924197#)

```
class` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a mammal"``);`` ``}``}``class` `Dog ``extends` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a dog"``);`` ``}``}``class` `Cat ``extends` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a cat"``);`` ``}``}` `public` `class` `MyTry {`` ``public` `static` `void` `main(String[] args) {``  ``Dog fido = ``new` `Dog();``  ``Cat kitty = ``new` `Cat();``  ``Mammal m;``  ``m = fido;``  ``m.show();``  ``m = kitty;``  ``m.show();`` ``}` `}
```

**例5-3** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.7.html?node=858292518&detailRecordId=1318913787&studyrecordId=1225624963&sectionRecordId=1229924197#)

```
a dog``a cat
```

**例5-3** 的程序分析：

fido 和 kitty 都是子类对象的引用，它们可以赋给父类对象的引用 m。

此程序还表明了，即使把子类对象的引用赋给父类对象，但是当调用覆盖的方法时，使用的仍然时子类中的代码。

**想一想：**

**下面程序不能通过编译，想想为什么？**【查看答案】

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.7.html?node=858292518&detailRecordId=1318913787&studyrecordId=1225624963&sectionRecordId=1229924197#)

```
class` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a mammal"``);`` ``}``}``class` `Dog ``extends` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a dog"``);`` ``}``}``class` `Cat ``extends` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a cat"``);`` ``}`` ``void` `showOK() {``  ``System.out.println(``"a cat"``);`` ``}``}` `public` `class` `MyTry {`` ``public` `static` `void` `main(String[] args) {``  ``Dog fido = ``new` `Dog();``  ``Cat kitty = ``new` `Cat();``  ``Mammal m;``  ``m = fido;``  ``m.show();``  ``m = kitty;``  ``m.show();``  ``m.showOK();`` ``}``}
```



## Casting

点击折叠

父类对象不能自动成为子类对象，如需转换则要用“强制类型转换”。

**例5-4** MyTry.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.7.html?node=858292518&detailRecordId=1318913787&studyrecordId=1225624963&sectionRecordId=1229924197#)

```
class` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a mammal"``);`` ``}``}``class` `Dog ``extends` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a dog"``);`` ``}``}``class` `Cat ``extends` `Mammal { `` ``void` `show() {``  ``System.out.println(``"a cat"``);`` ``}`` ``void` `showOK() {``  ``System.out.println(``"a cat"``);`` ``}``}` `public` `class` `MyTry {`` ``public` `static` `void` `main(String[] args) {``  ``Dog fido = ``new` `Dog();``  ``Cat kitty = ``new` `Cat();``  ``Mammal m = fido;``  ``Dog d;``  ``d = (Dog)m; ``// 要把父类对象引用强制转换为子类对象引用才行``  ``System.out.println(``"OK"``);` ` ``}``}
```

**例5-4** 的运行结果：

ok

**例5-4** 的程序分析：

只有 m 指向的对象具有子类的结构才能强制转换，否则不行。

**下面的程序可以吗？**【查看答案】

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java5.7.html?node=858292518&detailRecordId=1318913787&studyrecordId=1225624963&sectionRecordId=1229924197#)

```
class` `Mammal { }``class` `Dog ``extends` `Mammal {  }``class` `Cat ``extends` `Mammal {  }` `public` `class` `CastingApp1 {`` ``public` `static` `void` `main(String[] args) {``  ``Mammal m = ``new` `Mammal();``  ``Dog fido;``  ``fido = (Dog)m;``  ``System.out.println(``"OK"``);`` ``}``}
```

## **5.8 动手项目**

### 动手项目5-1使用继承创建新类

**所需时间：**30分钟。

**项目目标：**掌握使用继承创建新类的方法。

**过程描述：**

（1）启动Eclipse。

（2）新建一个Java项目PrjInheritance。

（3）在项目PrjInheritance中创建一个表示人的类Person，要求有表示人的姓名、性别、身份证号的属性，有设置和获取各个属性的方法。

（4）在项目PrjInheritance中创建一个表示学生的类Student，要求由Person类继承得到。在Student类中增加表示学号、学生所在系别的属性，增加设置和获取学号、学生所在系别的方法。

（5）在项目PrjInheritance中创建一个主类StudentApp，在主类的main方法中创建一个学生对象，给学生对象的数据成员设置值，然后打印该学生的各个数据成员的值。

（6）运行程序，观察结果。

## **5.9 小结**

### 主体内容

继承是面向对象编程的一个重要机制，它允许你在已有类的基础上创建新的类。当你创建一个新类，声明它是从某个已有类继承得到的时候，你就重用了那个已有类的属性和方法，同时你还可以向新类中添加新的属性和方法，以适应新的情况，解决新的问题。

Java使用关键字extends声明类之间的继承关系。extends之后的类是父类，extends之前的类是子类。

Java中，子类继承父类的所有成员。

面向对象方法中的继承有单一继承和多重继承之分。单一继承是指一个子类只继承一个父类，而多重继承是指一个类可以同时继承多个父类的属性和功能。Java只支持单一继承，不支持多重继承。

在类的继承关系中，当子类的成员变量与父类的成员变量同名时，子类的成员变量会隐藏父类的成员变量；当子类的方法与父类的方法具有相同的方法名、返回值、以及相同的参数个数和参数类型时，子类的方法会覆盖父类的方法。当子类对象调用被覆盖的方法时，会按照该方法在子类中定义的代码执行；该方法在父类中定义的代码被隐藏。

当子类隐藏父类的成员变量时，子类中由父类继承而来的成员变量依然存在。在子类中，默认情况下使用子类定义的变量。如果想使用父类被隐藏的变量，则要用如下格式：super.原变量名。

当子类覆盖父类的成员方法时，默认使用子类的方法。如果想使用父类被覆盖的方法，则要用如下的格式：super.原方法名。

如果父类的成员变量没有被隐藏，或成员方法没有被覆盖，则可以在子类中直接使用，不必使用关键字super。

Java中的多态就是指一个程序中同名的不同方法共存的情况。分为编译时多态和运行时多态两类。

this引用和super引用都是系统提供的，在使用前都是不需要声明。this指代当前对象，super指代父类。 Java 中有个特殊的系统类 —— Object 类，它是 Java 程序中所有类的祖先。

子类对象可以看作是父类对象，子类对象的引用可以赋给父类对象。此时，子类与父类共有的方法（覆盖），默认情况下仍然调用子类的覆盖方法的代码。

子类对象转型成了父类对象，就不能再用子类中的方法新定义的方法了。除非覆盖的方法才能用。

## **5.10 思考题**

### 主体内容

**1.什么是继承？问什么要使用继承？**【隐藏】

**答：**继承是面向对象编程的一个重要机制，它允许你在已有类的基础上创建新的类。当你创建一个新类，声明它是从某个已有类继承得到的时候，你就重用了那个已有类的属性和方法，同时你还可以向新类中添加新的属性和方法，以适应新的情况，解决新的问题。

继承不但为编程带来方便，更重要的是它表达了现实世界的父类和子类的逻辑关系。

**2.若父类中的某个成员方法的访问控制权限为包权限，那么在子类中定义它的覆盖方法的时，可否把访问控制权限修改为private？为什么？**【隐藏】

**答：**不可以。Java中的protected、public在子类中是可见的，所以在子类中声明同一方法时，被认为是覆盖（override），这时子类中的访问控制权限只能大，不能小，即父类方法若是protected，则子类的覆盖方法可以是protected或public，而若即父类方法若是public，则子类的覆盖方法只能是public。

**3.什么是多态？ Java 的编译时多态和运行时多态有什么区别？**【隐藏】

**答：**Java中的多态就是指一个程序中同名的不同方法共存的情况。分为编译时多态和运行时多态两类。

方法重载可以实现Java的编译时多态。它是在相同类内，定义名称相同，但参数个数或参数类型不同的方法。编译器会根据实参的个数和类型，确定调用哪个方法。所谓编译时多态，是指程序会根据参数的不同来调用相应的方法。具体调用哪个被重载的方法，是由编译器在编译阶段决定的。所以编译时多态也叫做静态多态性。

方法覆盖可以实现Java的运行时多态。它是在子类当中，定义名称、参数个数与类型均与父类相同的方法，用以改写父类方法的功能。运行时多态是一种在运行时，而不是在编译时调用覆盖方法的一种机制。对于覆盖的方法，Java运行时系统根据调用该方法的实例的类型，来决定选择哪个方法调用。

## **5.11 自测练习**

## 【课后练习】

1. Java语言中，类之间的继承关系是（）。 

   （A）单一继承   

   （B）多重继承   

   （C）不能继承  

   （D）视编译器的不同而定

   2. 在Java中，所有类的根类是（）。

       （A）import ch4.*;   *

      （B）package ch4.*;   

      （C）ch4 import;  

      （D）ch4 package;

      3. 在Java中，用Package语句说明一个包时，该包的层次结构必须是（）。

          （A）java.lang.Object   

         （B）java.lang.Class 

           （C）java.applet.Applet  

         （D）java.awt.Frame

         4. 用于在子类中调用被重写父类方法的关键字是（）。 

            （A）this   

            （B）super   

            （C）extends  

            （D）implements

            5. 下列不是上转型对象的特点是（）。 

               （A）不能操作子类新增的成员   

               （B）可以操作子类继承或重写的成员  

                （C）可以将对象的上转型对象强制转型成一个子类的对象 

                （D）上转型之后将失去子类新增成员，因此不能再转型成原来子类对象

# **第6章 接口**

## **6.1 接口**

### 主体内容

在面向对象系统设计领域，人们认为：对象是具有状态、行为、本体的某个东西；对象持有系统的局部数据以及操作这些数据的方法；对象的方法是对象对外的“接口”，系统的其它部件通过对象的“接口”使用对象提供的功能或服务（其它部件使用对象的“接口”其实就是调用该对象的某个方法）。但是在 Java 中，“接口”是一个专门的概念，并非是上面提到的一般意义上的“对象的接口”。 Java 中的接口是一组抽象方法和常量的集合，用来描述类应该提供什么样的功能。实现某个接口的类必须提供该接口规定的功能。

在 Java 中，接口不是类，而是一组抽象方法和常量的集合，用来描述类应该提供什么样的功能。在接口中定义的方法仅仅给出方法名称、参数列表、返回值类型等信息的说明，并不给出方法体的具体代码，即没有给出方法功能的具体实现。在程序中定义了一个接口以后，就可以声明某些类实现了这个接口，在实现了该接口的类中再给出接口的方法的功能代码。这相当于用接口规范了实现接口的那些类都必须以特定的形式提供一组特定的功能。反过来，实现某个接口的类必须提供该接口规定的功能，并且要遵从接口中定义的方法的格式约定。

使用接口实际上要做两件事：

（1）声明接口（定义接口）。

（2）在类中实现接口。



### 活动：观看关于接口的声明与实现的视频

点击折叠

下面的视频演示了如何声明接口以及如何在类中实现接口。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid6-1.png)

**视频6-1：接口的声明与实现**

**PPT引入：**

\1. 新建一个Java项目PrjInterface。本章的实例都放到这个项目中。

\2. 在项目PrjInterface中创建接口Shapes。Shapes的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
public` `interface` `Shapes {` `  ``public` `final` `static` `double` `PI = ``3.14159``;``  ``public` `abstract` `double` `getArea();``  ``public` `abstract` `double` `getPerimeter();``}
```

**说明：**（1）声明接口的方法。

（2）解释常量和抽象方法的概念。

\3. 在项目PrjInterface中创建类Circle，让Circle类实现Shapes接口。操作：在“New Java Class”对话框中，Package域就用空的，即把类Circle放到无名的default包中。在Name域输入类名Circle。之后，点击“Interface”域右边的“Add”按钮，打开“Implemented Interfaces Selection”对话框，在“Choose Interfaces:”域中输入“Sh”，观察下面匹配的条目。第一个是“Shape - java.awt”，这个是java.awt包中定义的Shape接口，是一个系统接口，不是我们要用的。我们要用的是下面的“Shapes”接口，这个是我们刚才定义的。选中它，点“OK”，返回。之后，选中“Constructors from superclass”，让Eclipse为这个类自动生成构造方法的代码。再点“Finish”，然后就看到Eclipse创建了Circle类，并在Java编辑窗口中打开了它。Eclipse的Java编辑器为Circle类自动生成了如下代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
public` `class` `Circle ``implements` `Shapes {``  ``@Override``  ``public` `double` `getArea() {``    ``// TODO Auto-generated method stub``    ``return` `0``;``  ``}``  ``@Override``  ``public` `double` `getPerimeter() {``    ``// TODO Auto-generated method stub``    ``return` `0``;``  ``}``}
```

**说明：**（1）声明在Circle类中实现了Shapes接口。

（2）自动生成了Shapes接口中的抽象方法的具体实现代码框架。而且在每个抽象方法的具体实现之间自动添加了“@Override”注解，用于实现编译时检查，检查此方法是重写接口中的抽象方法。

（3）Java规定，在类中实现接口的时候要给出接口中所有抽象方法的具体实现。即便某个方法的方法体为空，表示方法体的花括号也要给出。

（4）把getArea()和getPerimeter()的具体实现代码写到方法体的“//TODO……”注释行之后。

接下来，把Circle类的代码添加完整，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
public` `class` `Circle ``implements` `Shapes {``  ``private` `double` `radius;``  ` `  ``Circle(``double` `radius) {``    ``this``.radius = radius;``  ``}``  ` `  ``@Override``  ``public` `double` `getArea() {``    ``// TODO Auto-generated method stub``    ``return` `(PI * radius * radius);``  ``}` `  ``@Override``  ``public` `double` `getPerimiter() {``    ``// TODO Auto-generated method stub``    ``return` `(``2` `* PI * radius);``  ``}``}
```

\4. 类似地，在项目PrjInterface中创建类Rectangle，让Rectangle类实现Shapes接口。Rectangle类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
public` `class` `Rectangle ``implements` `Shapes {` `  ``private` `double` `width;``  ``private` `double` `height;``  ``Rectangle (``int` `width,``int` `height) {``    ``this``.width = width;``    ``this``.height = height;``  ``}``  ``@Override``  ``public` `double` `getArea() {``    ``// TODO Auto-generated method stub``    ``return` `(width * height);``  ``}``  ``@Override``  ``public` `double` `getPerimeter() {``    ``// TODO Auto-generated method stub``    ``return` `(``2` `* width + ``2` `* height);``  ``}``}
```

\5. 创建一个Java Application程序主类InterfaceApp。InterfaceApp的main方法中创建一个圆形对象和一个矩形对象，分别计算并打印它们各自的周长和面积。InterfaceApp类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
public` `class` `InterfaceApp {``  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``Circle objC = ``new` `Circle(``3``);``    ``Rectangle objR = ``new` `Rectangle(``2``, ``3``);``    ` `    ``System.out.println(objC.getPerimeter());``    ``System.out.println(objC.getArea());``    ` `    ``System.out.println(objR.getPerimeter());``    ``System.out.println(objR.getArea());``  ``}``}
```

\6. 返回PPT，陈述注释和注解都不是必须的。在类中实现接口的时候，本质上是不需要它们的。

活动的解析：本视频的问题描述与程序分析

看一个定义接口和实现接口的例子。考虑这样一个问题，计算二维平面上几何形状的面积和周长。不同的形状的面积和周长的计算方法不同。可以定义一个接口 Shapes，在该接口中声明两个求面积和求周长的抽象方法，让所有的二维几何图形都实现 Shapes 接口。这样就规范了任何二维几何图形都要提供 Shapes 中约定的求面积和求周长的方法。程序的任何其它部件都可以按照接口 Shapes 中的规范去使用这些图形对象提供的求面积和求周长的方法。

看第一段代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
interface` `Shapes {` `  ``public` `final` `static` `double` `PI = ``3.14159``;``  ``public` `abstract` `double` `getArea();``  ``public` `abstract` `double` `getPerimeter();``}
```

这段代码定义了一个接口Shapes。接口中定义了一个常量 PI 和两个抽象方法 getArea() 和 getPerimeter()。注意，抽象方法只有方法的声明部分，没有方法体。这个接口规范了任何“形状类”都要给出 getArea() 和 getPerimeter()的具体实现代码。 getArea() 用于计算并取得形状的面积， getPerimeter() 用于计算并取得形状的周长。

看第二段代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
class` `Circle ``implements` `Shapes {``  ``private` `double` `radius;``  ` `  ``Circle(``double` `radius) {``    ``this``.radius = radius;``  ``}``  ` `  ``public` `double` `getArea() {``    ``return` `(PI * radius * radius);``  ``}``  ``public` `double` `getPerimeter() {``    ``return` `(``2` `* PI * radius);``  ``}``}
```

这段代码定以了圆形类 Circle。在该类的声明部分用 implements 短语声明了 Circle 类实现了 Shapes 接口。那么，在 Circle 类中必须要给出接口 Shapes 中声明的所有抽象方法的方法体，即便某个方法不需要完成任何具体的功能，也要给出方法体，只是给出一个空的方法体就成了。另外，Circle 类实现了接口 Shapes 也意味着在 Circle 类中可以使用接口中定义的常量，所以这里计算圆的面积和周长的时候可以直接使用 Shapes 中定义的作为圆周率的常量 PI。

看第三段代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
class` `Rectangle ``implements` `Shapes {``  ``private` `double` `width;``  ``private` `double` `height;``  ` `  ``Rectangle (``int` `width,``int` `height) {``    ``this``.width = width;``    ``this``.height = height;``  ``}``  ` `  ``public` `double` `getArea() {``    ``return` `(width * height);``  ``}``  ``public` `double` `getPerimeter() {``    ``return` `(``2` `* width + ``2` `* height);``  ``}``}
```

这段代码定以了长方形类 Rectangle。在该类的声明部分用 implements 短语声明了 Rectangle 类实现了 Shapes 接口。在 Rectangle 类中给出了接口中定义的 getArea() 和 getPerimeter()的具体实现代码。

InterfaceApp是主类，在其 main() 方法中创建了一个圆形对象和一个长方形对象，然后分别调用了它们的方法求出相应形状的周长和面积。

要点1：声明接口

接口的声明包括接口声明和接口体两部分。格式如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
interfaceDeclaration {``  ``interfaceBody``}
```

其中，interfaceDeclaration是接口的声明，interfaceBody是接口的接口体。

（1）接口声明

完整的接口声明如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
[``public``] ``interface` `InterfaceName [``extends` `listOfSupgerInterface] {``  ``…``}
```

其中，interface是声明接口的关键字，InterfaceName是用户声明的接口的名字。extends子句与类声明中的extends子句功能基本相同，不同的时一个接口可以有多个父接口，多个父接口用逗号隔开。子接口继承父接口的中所有的常量和方法。

（2）接口体

接口体中包含常量声明和抽象方法声明两部分。

常量声明的格式为：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
type NAME=value;
```

其中type是任意数据类型，NAME是常量名，value是常量值。

在接口中声明的常量默认具有public、final和static属性。

抽象方法声明的格式为：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.1.html?node=858292530&dt=7674&sectionRecordId=1229924192#)

```
returnType methodName( [paramlist] );
```

其中returnType是方法的返回值，methodName是方法的名字，paramlist是方法的参数。接口中只进行方法的声明，而不提供方法的实现。所以，方法声明没有方法体，而且用分号(;)结尾。

在接口中声明的方法默认具有public和abstract属性。

另外，如果在子接口中声明了和父接口同名的常量和相同的方法，则父接口中的常量被隐藏，方法被覆盖。

要点2：实现接口

在类中实现接口。在类中实现接口的方法和注意事项如下：

（1）在类的声明中用implements子句来表示一个类实现了某个接口，在类体中可以使用接口中声明的常量，而且必须实现接口中声明的所有抽象方法。

（2）一个类可以实现多个接口，多个接口在implements子句中用逗号分隔。

（3）在类中实现接口声明的抽象方法时，方法的声明必须与接口中声明的完全一致。

要点3：接口的作用

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 接口把方法的定义和类的层次结构区分开来，通过它可以在运行时动态地定位所调用的方法。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 利用接口可以实现“多重继承”

– 一个接口可以有多个父接口

– 一个类可以实现多个接口

要点4：注释（Comment）

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 注释是对程序的解释和说明，是给程序员看的，编译器会忽略它们，即对编译器来说，注释是没用的。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java有三种注释

– 行注释，//

– 块注释，/*...*/

– Java文档注释（javadoc Comment），/**...*/

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java的一种特殊注释形式，能被JDK的javadoc命令提取出来，放入一个HTML文件中，用于生成HTML文件形式的程序文档。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 注释不是必须的

– 可以把任何程序中的任何注释删除，对程序功能没有任何影响

要点5：注解（Annotation）

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 注解使得源代码中不但可以包含功能性的实现代码，还可添加元数据（Metadata）。元数据是关于数据的组织、数据域及其关系的说明信息，简言之，元数据就是描述数据的数据。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 注解为代码添加元数据的实现形式，更通俗地说，他是为程序元素添加更直观明了的说明，这些说明信息与程序的业务逻辑无关，**并且是供特定的工具或框架使用的。**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) @Override就是一个注解，它是供JDK用的。它是让编译器编译程序的时候看一下其之后的方法是否是某个父类或接口中某个已有方法的覆盖方法（以免程序员写错），JDK的编译器就会去做。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 注解也不是必须的

– 对本视频的接口的例子而言，可以把@Override删除，没有影响

– 但是有一些注释是供特定框架使用的，特定工具或框架的代码依赖这些注释完成一些功能，此时就不能随便删除注解了。

## **6.2 回调**

### 主体内容

回调（callback）是一种常见的程序设计模式，这种程序设计模式在Java中通常是用接口来实现。

回调并不是什么很玄虚的东西，其实 C 程序中也可以实现回调， C 程序实现回调通过指向函数的指针实现。如果回调是通过指针实现的，那么程序的正确执行必须依赖于程序员使用指针时别犯错误。鉴于使用指针实现回调不能保证程序员不犯错误，所以Java采用了一种更好的解决方案——使用接口实现回调。



### 活动1：观看关于回调的视频

下面的视频通过一个例子程序阐述了回调的概念以及Java利用接口实现回调的基本方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid6-2.png)

**视频6-2：利用接口实现回调**

**PPT引入：**

\1. Shapes接口、Circle类、Rectangle类和主类InterfaceApp在前面的视频中都已经创建过了，所以不用再创建。

\2. 在项目PrjInterface中创建图形计算器类Gcalculator，代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.2.html?node=858292530&detailRecordId=1318913794&studyrecordId=1225624963&sectionRecordId=1229924133#)

```
public` `class` `GCalculator {``  ``void` `print(Shapes obj) {``    ``System.out.println(obj.getArea());``    ``System.out.println(obj.getPerimeter());``  ``}``}
```

**注：**print()方法实现回调。给print()方法传来一个对象，print()方法执行过程中返回调用所传来对象的某个方法。实现回调的关键是声明print()方法的参数是接口类型的，则任何实现了该接口的对象都可以传给print()方法做实参，print()方法都可以回调该对象中对于接口中抽象方法的具体实现。

\3. 修改主类InterfaceApp，代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.2.html?node=858292530&detailRecordId=1318913794&studyrecordId=1225624963&sectionRecordId=1229924133#)

```
public` `class` `InterfaceApp {``  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``Circle objC = ``new` `Circle(``3``);``    ``Rectangle objR = ``new` `Rectangle(``2``, ``3``);``    ` `    ``GCalculator cal = ``new` `GCalculator();``    ``cal.print(objC);``    ``cal.print(objR);``  ``}``}
```

\4. 运行程序。

\5. 最后陈述一下下面的要点。

活动1的解析：本视频的问题描述与程序分析

通过一个例子来理解什么是回调以及怎样用接口实现回调。在前面的视频中定义了 Shape 接口，然后在 Circle 类和 Rectangle 类中实现了这个接口。这里打算定义一个可以计算图形面积和周长的类 Gcalculator——图形计算器类，它有一个print() 方法可以打印图形的面积和周长。我们希望 print() 方法能够打印实现了 Shape 接口的任何图形的面积和周长。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/sk1.png)

**图6.1 图形计算机器类与图形接口和图形类之间的关系**

我们按照图6.1所示的方式设计程序：GCauculator 使用 Shape 接口， Circle 和 Rectangle 实现接口。完整的程序如下：

**例6-1** MyTry.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.2.html?node=858292530&detailRecordId=1318913794&studyrecordId=1225624963&sectionRecordId=1229924133#)

```
interface` `Shapes {``  ``double` `PI = ``3.14159``;``  ``double` `getArea();``  ``double` `getPerimeter();``}` `class` `Circle ``implements` `Shapes {``  ``private` `double` `radius;``  ` `  ``Circle(``double` `radius) {``    ``this``.radius = radius;``  ``}``  ` `  ``public` `double` `getArea() {``    ``return` `(PI * radius * radius);``  ``}``  ``public` `double` `getPerimeter() {``    ``return` `(``2` `* PI * radius);``  ``}``}` `class` `Rectangle ``implements` `Shapes {``  ``private` `double` `width;``  ``private` `double` `height;``  ` `  ``Rectangle (``int` `width,``int` `height) {``    ``this``.width = width;``    ``this``.height = height;``  ``}``  ` `  ``public` `double` `getArea() {``    ``return` `(width * height);``  ``}``  ``public` `double` `getPerimeter() {``    ``return` `(``2` `* width + ``2` `* height);``  ``}``}` `class` `GCalculator {``  ``void` `print(Shapes obj) {``    ``System.out.println(obj.getArea());``    ``System.out.println(obj.getPerimeter());``  ``}``}` `public` `class` `MyTry {``  ``public` `static` `void` `main(String[] args) {``    ``Circle objC = ``new` `Circle(``3``);``    ``Rectangle objR = ``new` `Rectangle(``2``, ``3``);``    ` `    ``GCalculator cal = ``new` `GCalculator();``    ``cal.print(objC);``    ``cal.print(objR);``  ``}``}
```

**例6-1** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.2.html?node=858292530&detailRecordId=1318913794&studyrecordId=1225624963&sectionRecordId=1229924133#)

```
28.274309999999996``18.849539999999998``6.0``10.0
```

**例6-1** 的程序分析：

看 GCalculator 类的 print() 方法：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.2.html?node=858292530&detailRecordId=1318913794&studyrecordId=1225624963&sectionRecordId=1229924133#)

```
void` `print(Shapes obj) {``  ``System.out.println(obj.getArea());``  ``System.out.println(obj.getPerimeter());``}
```

在print()方法的声明中使用Shapes接口类型的参数obj当调用这个方法的时候要传递给一个实现了Shapes接口的类的实例给obj就像此程序主类的mian()方法中所做的那样在print()方法的方法体中通过obj.getArea()和obj.getPerimeter()计算传来的图形对象的面积和周长。

看主类的 main () 方法的语句：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.2.html?node=858292530&detailRecordId=1318913794&studyrecordId=1225624963&sectionRecordId=1229924133#)

```
cal.print(objC);
```

这里实际上利用了“upcasting”，objC 是 Circle 类的实例，在把这个实参赋给print(Shapes obj) 的形参 obj 的时候，把 objC 向上定型为 Shapes 类型。在执行 print() 的代码的时候，obj.getArea() 和 obj.getPerimeter() 自然会去执行 objC 中定义的求圆形面积和求周长的代码。

再看语句：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.2.html?node=858292530&detailRecordId=1318913794&studyrecordId=1225624963&sectionRecordId=1229924133#)

```
cal.print(objR);
```

和语句“cal.print(objC);”类似，只是在执行 print() 的代码的时候会去执行objC 中定义的求长方形面积和求周长的代码。

从例6-1可以看到，我们把圆形对象 objC 作为实参传递给图形计算对象cal 的 print() 方法，print() 方法的代码执行过程中又**回调了** objC 中定义的方法 getArea() 和 getPerimeter()，从而完成了具体计算圆形面积和周长的功能。当然，当使用图形计算对象 cal 的 print() 方法打印长方形对象 objR 的情况也是类似的。

综上所述，回调（callback）是一种程序设计模式。通过回调，对象被赋予一些信息，这些信息允许它在稍后的某个时刻返回头去调用初始对象。

## **6.3 动手项目**

### 动手项目6-1：接口的单一继承与多重继承

**所需时间：**30分钟。

**项目目标：**使用Eclipse创建接口的单一继承与多重继承的程序。

**过程描述：**使用Eclipse创建接口的单一继承与多重继承的程序。

接口继承(inheritance)与类继承很类似，就是以被继承的interface为基础，增添新增的接口方法原型。类的继承仅支持单一继承，而接口不仅支持单一继承，还支持多重继承。Java利用接口实现多重继承机制，巧妙地解决了多重继承中的“钻石危机”。

本项目让你通过亲自动手练习，熟悉Java的接口、接口的继承和在类中实现接口。

当你用微软的Word编辑文档时，可以在页面上插入几何形状，你可以设置形状的大小和位置，还可以设置形状的填充颜色。Word中，几何形状都是放置在一个矩形区域中的（几何形状的轮廓线“内切”于该矩形），因此，矩形区域的位置决定了几何形状的大小和位置。换句话说，你设置形状大小和位置的操作实际上是设置了该矩形区域的宽度、高度以及左上角点相对于纸张左上角的位置（坐标）。

（1）启动Eclipse。

（2）声明一个描述几何形状的大小的接口ShapeSize，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.3.html?node=858292664&detailRecordId=1318913795&studyrecordId=1225624963&sectionRecordId=1229924132#)

```
public` `interface` `ShapeSize {` `  ``void` `setHeight(``double` `h);``  ``void` `setWidth(``double` `w);``}
```

（3）声明一个描述几何形状的位置的接口ShapePosition，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.3.html?node=858292664&detailRecordId=1318913795&studyrecordId=1225624963&sectionRecordId=1229924132#)

```
public` `interface` `ShapePosition {``  ``void` `setCoordinate(``double` `x, ``double` `y); ``// 设置左上角顶点坐标``}
```

（4）声明一个描述几何形状的接口DShape，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.3.html?node=858292664&detailRecordId=1318913795&studyrecordId=1225624963&sectionRecordId=1229924132#)

```
public` `interface` `DShape ``extends` `ShapeSize, ShapePosition {``  ``void` `setGraphType(String s); ``// 设置图形类型``}
```

（5）声明一个填充颜色接口FillColor;，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.3.html?node=858292664&detailRecordId=1318913795&studyrecordId=1225624963&sectionRecordId=1229924132#)

```
public` `interface` `FillColor {``  ``void` `setFillColor(String s); ``// 设置颜色，这里简单用颜色的英文名替代。``}
```

（6）创建一个矩形类Rectangle1，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.3.html?node=858292664&detailRecordId=1318913795&studyrecordId=1225624963&sectionRecordId=1229924132#)

```
public` `class` `Rectangle1 ``implements` `DShape, FillColor {` `  ``double` `h, w, x, y;``  ``String color, type;``  ` `  ``void` `show() {``    ``System.out.println(``"The properties of the shape are:"``);``    ``System.out.println(``"The height is "` `+ h);``    ``System.out.println(``"The width is "` `+ w);``    ``System.out.println(``"The coordinate is ("` `+ x + ``", "` `+ y +``")"``);``    ``System.out.println(``"The color is "` `+ color);``    ``System.out.println(``"The type is "` `+ type);``  ``}``  ` `  ``@Override``  ``public` `void` `setHeight(``double` `h) {``    ``// TODO Auto-generated method stub``    ``this``.h = h;``  ``}` `  ``@Override``  ``public` `void` `setWidth(``double` `w) {``    ``// TODO Auto-generated method stub``    ``this``.w = w;``  ``}` `  ``@Override``  ``public` `void` `setCoordinate(``double` `x, ``double` `y) {``    ``// TODO Auto-generated method stub``    ``this``.x = x;``    ``this``.y = y;``  ``}` `  ``@Override``  ``public` `void` `setFillColor(String s) {``    ``// TODO Auto-generated method stub``    ``this``.color = s;``  ``}` `  ``@Override``  ``public` `void` `setGraphType(String s) {``    ``// TODO Auto-generated method stub``    ``this``.type = s;``  ``}``}
```

（7）创建主类，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.3.html?node=858292664&detailRecordId=1318913795&studyrecordId=1225624963&sectionRecordId=1229924132#)

```
public` `class` `MyApp {` `  ``public` `static` `void` `main(String[] args) {``    ``// TODO Auto-generated method stub``    ``Rectangle1 r = ``new` `Rectangle1();``    ``r.setHeight(``200``);``    ``r.setWidth(``300``);``    ``r.setCoordinate(``100``, ``150``);``    ``r.setFillColor(``"yellow"``);``    ``r.setGraphType(``"RECTANGLE"``);``    ``r.show();``  ``}``}
```

（8）运行程序，观察结果。

（9）思考：Java接口的多重继承如何实现？一个类如何实现多个接口？

## **6.4 小结**

### 主体内容

Java中的接口是一组抽象方法和常量的集合，用来描述类应该提供什么样的功能。实现某个接口的类必须提供该接口规定的功能。

接口的声明包括接口声明和接口体两部分。

一个接口可以有多个父接口。

一个类可以实现多个接口。

注释是对程序的解释和说明，是给程序员看的，编译器会忽略它们，即对编译器来说，注释是没用的。

注解使得源代码中不但可以包含功能性的实现代码，还可添加元数据（Metadata）。元数据是关于数据的组织、数据域及其关系的说明信息，简言之，元数据就是描述数据的数据。

注解为代码添加元数据的实现形式，更通俗地说，他是为程序元素添加更直观明了的说明，这些说明信息与程序的业务逻辑无关，并且是供特定的工具或框架使用的。

回调（callback）是一种程序设计模式。通过回调，对象被赋予一些信息，这些信息允许它在稍后的某个时刻返回头去调用初始对象这种程序设计模式在Java中通常是用接口来实现。

## **6.5 思考题**

### 主体内容

**1.Java利用接口实现多重继承机制，这样做有什么好处？** 【隐藏】

**答：**不允许类多重继承的主要原因是，如果A同时继承B和C，而B和C同时有一个名称为method1()的方法，则没法决定A该继承B的method1()方法，还是该继承C的method1()方法。这种情况被称为“钻石危机”。但接口不存在这样的问题，因为接口中的方法都是抽象方法，若接口IA继承接口IB和接口IC，而IB和IC中都有方法method2()，则不管继承哪一个接口，抽象方法method2()都是一样的。

**2.当在类中实现接口的时候，要注意哪些问题？**【隐藏】

**答：**主要注意以下几点：

（1）一个类如果实现了一个借口，则要实现该接口的所有方法。

（2）方法的名字、返回类型、参数必须与接口中完全一致。如果方法的返回类型不是void，则方法体必须至少有一条return语句。

（3）因为接口的方法默认是public类型的，所以在实现的时候一定要用public来修饰（否则默认为protected类型，缩小了方法的使用范围）。

**3.设有下述源程序，请你指出其中的错误，并说明错误原因。**【隐藏】

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java6.5.html?node=858292668&detailRecordId=1318913797&studyrecordId=1225624963&sectionRecordId=1229924136#)

```
interface` `Playable {`` ``void` `play();``}``interface` `Bounceable {`` ``void` `play();``}``interface` `Rollable ``extends` `Playable, Bounceable {``  ``Ball ball = ``new` `Ball(``"PingPang"``);``}``class` `Ball ``implements` `Rollable {``  ``private` `String name;``  ``public` `String getName() {``   ``return` `name;``  ``}``  ``public` `Ball(String name) {``    ``this``.name = name;    ``  ``}``  ``public` `void` `play() {``    ``ball = ``new` `Ball(``"Football"``);``    ``System.out.println(ball.getName());``  ``}``}``public` `class` `MyClass {`` ``public` `static` `void` `main(String[] args) {``  ``Ball b = ``new` `Ball(``"Kitty"``);``  ``b.play();`` ``}``}
```

**答：**Ball类实现接口的play()方法的代码有错误，即语句“ball = new Ball("Football");”有错。

任何在接口里声明的变量，默认具有public、static、final属性。因此Rollable接口中的ball是常量，其存储的引用是固定的，不可改变的（指向字符串对象“PingPang”），而Ball类在实现接口的play()方法的时候企图改变ball的值，因此出错。

# **第7章 异常**

## **7.1 异常的概念**

### 主体内容

在程序执行期间，可能会发生许多意外的事件，例如程序申请内存没有申请到、要打开的文件并不存在，原本预期用户由键盘输入整数，但用户输入的却是英文字母等等。这些情况会导致程序在运行时发生错误。这些错误在编译阶段是没有办法发现的，只有到了程序运行阶段才可能产生。而所谓异常，就是程序的运行时错误。如果运行中的程序中出现了违反了 Java 语言的语义规定的现象，则 Java 虚拟机就会把这个错误当作一个“异常”通知给程序。当程序接收到“异常”以后，有两种处理办法：一种是结束程序的执行，另一种是修正错误，然后重新尝试执行前一次产生异常的代码段。

错误在所难免，不出错是只是相对的。程序编译期间不能找出所有错误，余下的问题必须在运行期间得到解决。这就需要错误源能通过某种方式，把适当的信息传递给某个接受者，后者知道如何正确解决这个问题。也就是说系统需要错误报告和处理机制。

异常处理是 Java 中惟一正式的错误报告机制，并且通过编译器强制执行。有些异常是可以检测到的，而有些异常是不能检测到的。不能检测到的异常自然没办法处理，而对于可以检测到的异常，Java要求程序员在编写程序时必须对其进行处理，否则程序不能通过编译。因此，Java程序员必须学会异常处理。



### 活动：观看一个程序出现异常的例子的视频

下面的视频演示了一个出现异常的程序，从而让你对程序运行时的异常有一个直观的认识。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid7-1.png)

**视频7-1：一个程序出现异常的例子**

1.新建一个Java项目PrjExcep。本章的实例都放到这个项目中。

2.在项目PrjExcep中创建类Exp。Exp类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.1.html?node=858292554&dt=4492&sectionRecordId=1229924169#)

```
package` `com.buptnu;` `import` `java.util.Scanner;` `public` `class` `Exp {`` ``public` `static` `void` `main(String[] args) {``  ``int` `x, y, z;``  ``Scanner in = ``new` `Scanner(System.in);` `   ``// get first input``   ``System.out.print(``"Please enter the first integer: "``);``   ``x = in.nextInt();``   ``in.nextLine(); ``// 返回当前行的其余部分，不包括结尾处的行分隔符。当前位置移至下一行的行首。``  ``// 这里用in.nextLine()的目的是让扫描位置转到下一行的开头，否则会继续在当前行向后扫描。``  ``// 后面的in.nextLine()和in.nextDouble()就会出错了。` `   ``// get second input``   ``System.out.print(``"Please enter the second integer: "``);``   ``y = in.nextInt();``   ``in.nextLine();``   ` `   ``// division``   ``z = x / y;``  ``System.out.println(x + ``" / "` `+ y + ``" = "` `+ z);``  ``System.out.println(``"End."``);``  ` `   ``// close the scanner``   ``in.close();`` ``}``}
```

3.运行程序，输入78， 16，观察结果。

4.运行程序，输入78， 0，观察结果。发现异常后，终止程序执行，后续语句不再执行。

活动的解析：本视频程序中的异常

(1)本程序让用户输入两个整数，然后用第一个整数除以第二个整数，输出运算结果。当用户输入的除数不为0的时候，程序做正常的除法运算，并输出结果。而当用户输入的除数为0时，由于违反了除法运算的语义——除数不能为0，因此程序出现错误。由于编译器是无法知道用户运行程序时输入的数据是什么，所以编译器无法检查此类错误，所以源程序能够通过编译。像“除数为0”这样的错误，只有到了运行阶段，运行时系统才能知道用户输入的除数是否为0，才会发现错误。Java将程序的运行时错误称为“异常”，Java运行时系统有专门的机制检查和处理异常。

(2)本例中，当除数为0时，执行到语句“z=x/y;”会产生异常。而产生异常后，本程序只是简单地在控制台窗口输出异常信息，让后就终止程序的执行，后面的语句“System.out.println(x+"/"+y+"="+z);”和“System.out.println("End.");”不再执行。

要点：异常的相关概念

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java把程序的运行时错误称为异常。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 异常处理是 Java中惟一正式的错误报告机制，并且通过编译器强制执行。对于可以检测到的异常，Java要求程序员在编写程序时必须对其进行处理，否则程序不能通过编译。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 当程序接收到“异常”以后，有两种处理办法：一种是结束程序的执行，另一种是修正错误，然后重新尝试执行前一次产生异常的代码段。通常用前一种方式处理。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 要区分“异常情况”和“普通问题”。这里“普通问题”是指，我们在当前环境下能得到足够的信息，总能处理这个错误。对于“异常情况”，我们就不能继续下去了，因为我们在当前环境下无法获得必要的信息来解决问题。我们所能做的就是从当前环境中跳出，并且把问题提交给上一级别的环境。

## **7.2 异常类与异常的层次结构**

### 主体内容

Java以面向对象的方式处理异常。当有异常发生时， Java 虚拟机会生成异常对象并交给运行时系统。异常对象是由异常类创建的。Java提供了一系列的异常类，用于处理异常。例如，视频7-1中，除数为0时，Java虚拟机判断出该错误是一个算数运算错误，之后，根据java.lang.ArithmeticException类创建异常对象，然后把它交给Java运行时系统的异常处理机制做后续处理。

Java中的异常类是以一定的层次结构来组织的。Java系统异常类的层次结构关系如图7.1所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/7.2.png)

**图7.1 Java异常处理类的层次**

在 Java 中，所有的异常都有一个共同的祖先 Throwable（可抛出）。Throwable 指定代码中可用异常传播机制通过 Java 应用程序传输的任何问题的共性。Throwable 是 Object 的直接子类，是所有异常的父类。 Throwable：有两个重要的子类：Exception（异常）和 Error（错误），二者都是 Java 异常处理的重要子类，各自都包含大量子类。

Error（错误）是程序无法处理的错误，表示运行应用程序中较严重问题。大多数错误与代码编写者执行的操作无关，而表示代码运行时 JVM（Java 虚拟机）出现的问题。例如，Java虚拟机运行错误（java.lang.VirtualMachineError），当 JVM 不再有继续执行操作所需的内存资源时，将出现 java.lang.OutOfMemoryError。这些异常发生时，Java虚拟机一般会选择线程终止。这些错误表示故障发生于虚拟机自身、或者发生在虚拟机试图执行应用时，如Java虚拟机运行错误（VirtualMachineError）、类定义错误（NoClassDefFoundError）等。这些错误是不可检查的，因为它们在应用程序的控制和处理能力之 外，而且绝大多数是程序运行时不允许出现的状况。对于设计合理的应用程序来说，即使确实发生了错误，本质上也不应该试图去处理它所引起的异常状况。在 Java中，错误通过Error的子类描述。

Exception（异常）是程序本身可以处理的异常。Exception类有一个重要的子类 RuntimeException。RuntimeException 类及其子类表示“JVM 常用操作”引发的错误。例如，若试图使用空值对象引用、除数为零或数组越界，则分别引发运行时异常NullPointerException、ArithmeticException和 ArrayIndexOutOfBoundException。



注意：异常和错误的区别：异常能被程序本身可以处理，错误是无法处理。

Error及其子类、 RuntimeException 及其子类代表的异常是编译器不能检测到的，称为不可检测的异常。而其它异常类代表的异常，编译器可以检测到，所以称这些异常为可检测异常。编译器要求我们编写的程序，必须对可检测的异常进行处理，否则不能通过编译。而对于不可检测的异常，在我们编写程序时可以不做处理。为什么只能对可检测异常才作强制要求呢？原因是不可检测异常通常比较严重，此时程序无法恢复，系统基本上只能终止，强制要求对这些错误进行处理也是在做无用功。

由上述可见，Java提供和很多系统异常类，这些系统异常类可以处理大多数情况的异常。有时程序有特殊要求，而没有与之对应的系统异常类可用，此时程序员可以创建自定义异常类。创建自定义异常类就是由某个系统异常类直接或间接派生出子类，在派生出的子类中处理程序的特殊要求。

Throwable类是所有异常的父类，该类中定义的方法会被所有异常类继承，这意味着任它们在异常对象中都是可用的。其中一些常用方法如下：

getCause()：返回抛出异常的原因。如果 cause 不存在或未知，则返回 null。

getMeage()：返回异常的消息信息。

printStackTrace()：对象的堆栈跟踪输出至错误输出流，作为字段System.err的值。

## **7.3 Java的异常处理过程**

### 主体内容

Java 的异常处理过程分为抛出异常和捕获异常两个阶段。

Java通过面向对象的方法来处理异常。在一个方法的运行过程中，如果发生了一个异常，则 Java 虚拟机会如同创建其它对象一样，使用 new 在堆上创建异常对象（这个理解起来有点难度，因为涉及到了Java运行时的内存分配问题。我们可以简单地把“堆”理解为它是 Java 的一种数据结构，用来支持对象实体或数组实体的动态内存分配。如果想深入了解这方面的知识，可以看看《深入 java 虚拟机》和《Just Java™ 2 SIXTH EDITION》）。然后，当前的执行流程被终止，并且从当前环境中弹出异常对象的引用。此时， Java 的异常处理机制接管程序，并开始寻找一个恰当的地方来继续执行程序。这个恰当的地方就是“异常处理程序”，它的任务是将程序从错误状态中恢复或者做一些简单地处理后结束程序。

我们把生成异常对象并把它交给运行时系统的异常处理机制的过程称为 **抛出异常** 。运行时系统的异常处理机制在方法的调用栈中查找，从生成异常的方法开始回溯，直到找到包含相应异常处理的方法为止，这个过程称为 **捕获异常** 。



### 动手实践

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/7.3.jpg)

**Java的异常处理机制**

## **7.4 触发异常**

### 主体内容

在运行中的程序中，如果出现了违反了 Java语义规定的现象，或违反了程序员自定义的某些特殊现象时，则触发异常。

异常通常由以下两种情况引起：

(1)程序执行了不合法的动作。

(2)或者通过执行 throw 语句由程序显式生成异常。



### 程序执行了不合法的动作产生异常

Java 中存在一定数量的预定义异常，比如ArithmeticException，这些异常通常称为运行时异常。实际上，所有的异常都是运行时事件，这些预定义异常只是其中的一部分，把它们叫做的 “不可恢复的”异常可能更恰当一些。运行时异常意味着此类异常是由运行时库代码抛出的，而不是由程序员自己的代码抛出的。这种情况也称为由运行时库代码隐式抛出异常。

除了预定义异常之外，我们也可以根据需要在程序中定义自己的异常类，并创建自己的异常对象，然后用 throw 语句抛出自定义异常对象。与运行时异常相比，自定义的异常的严重程度相对比较轻，在某些情况下也是可以恢复的。例如，如果打不开文件，提示用户输入一个新的文件名即可，这样就可以恢复程序的执行。

通常我们不必捕获运行时异常（因为运行时异常通常比较严重，此时程序无法恢复，系统基本上只能终止，捕获了也没用），但需要设法捕获其它类型的异常。



程序执行了不合法的动作时，会由运行时库代码隐式抛出异常。下面是一个典型的例子。

**例7-1** MyTry.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.4.html?node=858292556&detailRecordId=1318913801&studyrecordId=1225624963&sectionRecordId=1229924167#)

```
 ``public` `class` `MyTry {`` ``public` `static` `void` `main(String[] args) {``  ``int` `x, y, z;``  ``x = ``10``;``  ``y = ``0``;``  ``z = x / y;``  ``System.out.println(z);``  ``System.out.println(``"ok"``);`` ``}``}
```

**例7-1** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.4.html?node=858292556&detailRecordId=1318913801&studyrecordId=1225624963&sectionRecordId=1229924167#)

```
Exception in thread ``"main"` `java.lang.ArithmeticException: / by zero  at MyTry.main(MyTry.java:``6``)
```

**例7-1** 的程序分析：

编译此程序，可以通过编译，但是运行程序时就出现了异常。程序中除法运算的除数为0，这是违反了算术运算的要求。算术运算要求除数不能为0。对于这样的错误，系统会产生异常。程序运行的结果表明程序运行过程中产生了 ArithmeticException 异常。 ArithmeticException 是系统定义好的异常类，是系统类，它代表了算术运算异常。



### 通过执行 throw 语句由程序显式生成异常

在例7-1中，除法运算的除数为0引发了系统运行时异常，它是由 Java 运行时库代码抛出的，而不是我们由在程序中自己写代码抛出。我们也可以在程序中自己写代码抛出异常。

**例7-2** MyTry.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.4.html?node=858292556&detailRecordId=1318913801&studyrecordId=1225624963&sectionRecordId=1229924167#)

```
 ``public` `class` `Exp1 {`` ``public` `static` `void` `main(String[] args) {``  ``// TODO Auto-generated method stub``  ``System.out.println(``"hello"``);``  ``throw` `new` `ArithmeticException();`` ``}``}
```

**例7-2** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.4.html?node=858292556&detailRecordId=1318913801&studyrecordId=1225624963&sectionRecordId=1229924167#)

```
hello
```

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.4.html?node=858292556&detailRecordId=1318913801&studyrecordId=1225624963&sectionRecordId=1229924167#)

```
Exception in thread ``"main"` `java.lang.ArithmeticException``  ``at Exp1.main(Exp1.java:``6``)
```

**例7-2** 的程序分析：

在语句 “ **throw new** ArithmeticException();” 中，先使用 new 运算符显式地创建了一个 ArithmeticException 类的实例，它就是一个异常对象，然后用 throw 把这个异常对象抛出。Java 运行时系统的异常处理机制捕获这个异常之后就输出异常信息然后终止程序的执行。



### 定义自己的异常并且用 throw 抛出

我们也可以定义自己的异常。通过扩展 Syetem.Exception 类可以创建自己的异常类。有了自定义异常类以后，在需要的时候就可以创建相应的异常对象。注意，在程序中创建自定义异常对象之后，需要用 throw 显式抛出该对象，Java 运行时系统的异常处理机制才能捕获它并做相应的异常处理。

看一个自定义异常类的例子：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.4.html?node=858292556&detailRecordId=1318913801&studyrecordId=1225624963&sectionRecordId=1229924167#)

```
 ``class` `MyException ``extends` `Exception {`` ``MyException() {``  ``System.out.println(``"My Exception is created."``);`` ``}``}
```

MyException 继承自 Exception。如同其它类的继承关系一样，在子类MyException 中可以添加自己需要的各种成员。有了这个自定义异常类之后，可以用 new 运算符创建它的实例。它的实例就是自定义的异常对象。得到这个自定义异常对象之后要用 throw 抛出它才行。语法如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.4.html?node=858292556&detailRecordId=1318913801&studyrecordId=1225624963&sectionRecordId=1229924167#)

```
throw` `new` `MyException();
```

任何抛出用户自定义异常的方法也必须捕获异常，或者把异常声明为方法接口的一部分。具体的方法见下面的一个小节。

## **7.5 处理异常**

### 主体内容

**try…catch…finally语句**

如果方法的代码在执行过程中产生异常，那么需要提供相应的代码以处理该异常。try…catch…finally 语句是处理异常的语句结构。



### 活动1：观看使用try…catch…finally语句处理异常的视频

下面的视频演示了一个出现异常的程序，从而让你对程序运行时的异常有一个直观的认识。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid7-2.png)

**视频7-2：使用try…catch..finally语句处理异常**

1.在项目PrjInterface中创建类Exp1。Exp1类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
package` `com.buptnu;``public` `class` `Exp1 {`` ``public` `static` `void` `main(String[] args) {``  ``int` `x, y, z;``  ``x = ``78``;``  ``y = ``16``;``  ``try` `{``   ``System.out.println(``"Division:"``);``   ``z = x / y;``   ``System.out.println(x + ``" / "` `+ y + ``" = "` `+ z);``  ``} ``  ``catch` `(ArithmeticException e) {``   ``System.out.println(``"程序出现异常：除数为0。"``);``  ``}``  ``finally` `{``   ``System.out.println(``"程序结束。"``);``  ``}``  ``System.out.println(``"End."``);`` ``}``}
```

2.运行程序，观察结果。此时为程序正常执行的情况。实际执行的语句序列是：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
[``1``]``int` `x, y, z;``[``2``]x = ``78``;``[``3``]y = ``16``;``[``4``]System.out.println(``"Division:"``);``[``5``]z = x / y;``[``6``]System.out.println(x + ``" / "` `+ y + ``" = "` `+ z);``[``7``]System.out.println(``"程序结束。"``);``[``8``]System.out.println(``"End."``);
```

程序运行结果是：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
Division:` `78` `/ ``16` `= ``4
```

程序结束。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
End.
```

3.修改程序，将Exp1类的main()方法的语句“y = 16;”修改为“y = 0;”，再运行程序。此时为程序执行过程中产生异常的情况。实际执行的语句序列是：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
[``1``]``int` `x, y, z;``[``2``]x = ``78``;``[``3``]y = ``16``;``[``4``]System.out.println(``"Division:"``);``[``5``]z = x / y;``[``6``]System.out.println(``"程序出现异常：除数为0。"``);``[``7``]System.out.println(``"程序结束。"``);``[``8``]System.out.println(``"End."``);
```

程序运行结果是：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
Division:
```

程序结束。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
End.
```

4.小结：try…catch…finally语句是监视异常和处理异常的语句结构。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java7.5.png)

要点1：try…catch…finally语句

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
try``…``catch``…``finally``语句的一般语法形式是：`` ``try` `{...} ``// 被监视的代码段，一旦发生异常，则交由其后的catch代码段处理`` ``catch` `(异常类型``1` `e) {...} ``// 要处理的第一种异常`` ``catch` `(异常类型``2` `e) {...} ``// 要处理的第二种异常`` ``...`` ``finally` `{...} ``// 最终处理
```

**说明：**

关键词try后的一对大括号将一块可能发生异常的代码包起来，称为监控区域。try 子句意味着“试用这些语句，检查是否会有异常”。 try 子句后面必须至少有一个 catch 子句或 finally 子句。当 try 子句中的代码段在执行过程中有异常产生时，其后的 catch 子句负责处理相应的异常。也就是说，异常处理的代码写到 catch 子句中。catch 后面跟有用圆括号括起来的异常参数。如果 try 子句的代码引发（抛出）的异常与该参数的类型匹配，则用其后的语句块中的代码处理该异常。如果不匹配就往后找有没有其它的 catch 子句的异常参数类型匹配。如果所有的 catch 子句的异常类型与 try 子句代码段实际产生的异常都不匹配，则执行 finally 子句的代码。另外， try 子句的代码段在执行过程中也有可能不产生异常，此时不管有没有异常产生， try 子句的代码段执行完了之后都会执行 finally 子句的代码段。

try…catch …finally 代码块全部执行结束之后，如果中间没有出现任何控制转移，程序将在 catch 或 finally 之后继续执行。能够引起控制转移的是一些常规动作，如 continue、 break、return 或许会产生另外异常。如果 finally 子句中也有控制转移语句，则这样的语句必须执行。

有时为了简单会忽略掉catch语句后的代码，这样try…catch…finally语句就成了一种摆设，一旦程序在运行过程中出现了异常，就会忽略处理异常，而错误发生的原因很难查找。



### 处理不同方式抛出的异常

点击折叠

Java抛出异常的方式如图7.2所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java7.5_1.png)

**图7.2 Java抛出异常的形式**

**例7-3**使用try…catch…finally处理运行时系统自动抛出的预定义异常。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
package` `com.buptnu;``public` `class` `Exp2 {``  ``public` `static` `void` `main(String[] args) { ``    ``int``[] intArray = ``new` `int``[``3``]; ``    ``try` `{ ``      ``for` `(``int` `i = ``0``; i <= intArray.length; i++) { ``        ``intArray[i] = i; ``        ``System.out.println(``"intArray["` `+ i + ``"] = "` `+ intArray[i]); ``        ``System.out.println(``"intArray["` `+ i + ``"]模 "` `+ (i - ``2``) + ``"的值: "` `            ``+ intArray[i] % (i - ``2``)); ``      ``} ``    ``} ``catch` `(ArrayIndexOutOfBoundsException e) { ``      ``System.out.println(``"intArray数组下标越界异常。"``); ``    ``} ``catch` `(ArithmeticException e) { ``      ``System.out.println(``"除数为0异常。"``); ``    ``} ``    ``System.out.println(``"程序正常结束。"``); ``  ``} ``}
```

**例7-3**的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
intArray[``0``]模 -``2``的值: ``0``intArray[``1``] = ``1``intArray[``1``]模 -``1``的值: ``0``intArray[``2``] = ``2
```

除数为0异常。

程序正常结束。

**例7-3**的程序分析：

main()方法控制程序的主流程。

程序主流程中先创建一个长度为3的一维数组intArray。数组元素下标从0到2。接下来使用for循环语句为数组的每个元素赋值，并让该数组元素做模运算。在for语句中，变量i控制循环，i从0变道3，每次循环都把i的值赋给intArray[i]，并运算intArray[i]%(i-2)，并输出结果。在for语句执行过程中有两种可能的异常情况：其一是数组下标越界。Java数组下标从0开始，当i为3时，试图把3赋给intArray[3]，而实际上数组的最大下标是2，intArray[3]已经超出系统分配给数组intArray的存储空间了，会引起程序执行的错误，所以Java不允许。其二是数组元素作模运算时，除数可能为0（当i的值是2时，i-2的值是0，此时模运算的除数为0），违反算术运算规则，Java也不允许。

由于for语句的代码段可能产生异常，所以主流程中try子句对它进行“监视”。由于可能产生两种异常，所以提供了两个catch子句处理捕获到的异常。

**注意：** 实际上是JVM根据异常的情况生成异常对象，并把它抛给Java运行时系统的异常处理机制。Java异常处理机制捕获到该异常对象后，在依次从前往后查找try后面的catch子句，若某个catch子句的参数类型与该异常对象的类型匹配，则把捕获到异常对象传给该catch语句，并执行该catch子句后面的语句块的局域，处理该异常。

try后面第一个catch子句的参数类型是“ArrayIndexOutOfBoundsException”，它处理数组下标越界异常；第一个catch子句的参数类型是“ArithmeticException”，它处理算数运算异常。

本程序的for语句执行到i的值为2时，先发生了算数运算异常，try内的代码段终止执行，JVM产生的代表该异常的对象被JVM抛出，并被运行时系统的异常处理机制捕获，交给第二个catch子句处理。

由于使用了try…catch对异常进行了处理，所以程序会继续执行try…catch后面的其它语句。这里所谓的“产生异常，终止执行”，只是终止执行try子句的代码段，而try…catch之后的代码则继续执行。如果没有try…catch处理异常，则Java会在异常发生的地方终止整个主流程。你可以把本例中的try…catch结构去掉，然后运行程序试一下，就可以观察到如下的结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
intArray[``0``] = ``0``intArray[``0``]模 -``2``的值: ``0``intArray[``1``] = ``1``intArray[``1``]模 -``1``的值: ``0``intArray[``2``] = ``2
```

Exception in thread "main" java.lang.ArithmeticException : / by zero 
   at com.buptnu.Exp2.main( Exp2.java:10 )

此处你会看到，语句“System.out.println("程序正常结束。");”没有被执行。

**例7-4** 使用try…catch…finally处理程序员用throw语句抛出的预定义异常。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
  ``public` `class` `Exp3 {``  ``public` `static` `void` `main(String[] args) { ``    ``int` `b = ``0``; ``    ``try` `{ ``// try监控区域 ``      ``if` `(b == ``0``) ``throw` `new` `ArithmeticException(); ``// 通过throw语句抛出异常 ``      ``System.out.println(``"这是一个示例。"` `); ``    ``} ``    ``catch` `(ArithmeticException e) { ``// catch处理异常 ``      ``System.out.println(``"程序出现异常，变量b不能为0。"``); ``    ``} ``    ``System.out.println(``"程序正常结束。"``); ``  ``} ``}``      
```

**例7-4**的运行结果：

程序出现异常，变量b不能为0。

程序正常结束。

**例7-4** 的程序分析：

程序中使用new运算符创建了一个ArithmeticException对象，然后用throw把该对象抛出。Java运行时系统的异常处理机制会捕获到这个对象，并交给try子句后面的catch子句去处理。

**例7-5** 使用try…catch…finally处理程序员用throw语句抛出的自定义异常。

考虑这样一个例子。程序要求输入用户的姓名和年龄。人的年龄必须是大于等于0并且小于等于150的正整数。我们把用户输入小于0的整数看作是一种异常，把用户输入大于150的整数看作是另一种异常。这两个异常都是程序特定情况下的约定，类似这样的特定约定需要程序员自己定义异常类去处理。程序如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
package` `com.buptnu;``import` `java.util.Scanner;``class` `LessThanException ``extends` `Exception {`` ``LessThanException() {``  ``System.out.println(``"The LessThanException is created."``);`` ``}`` ``void` `show() {``  ``System.out.println(``"Your age shouldn't be less than 0."``);`` ``}``}``class` `LargerThanException ``extends` `Exception {`` ``LargerThanException() {``  ``System.out.println(``"The LargerThanException is created."``);`` ``}`` ``void` `show() {``  ``System.out.println(``"Your age shouldn't be larger than 150."``);`` ``}``}` `public` `class` `Exp4 {`` ``public` `static` `void` `main(String[] args) {``  ``Scanner myScanner = ``new` `Scanner(System.in);``   ``// get first input``   ``System.out.print(``"What is your name? "``);``   ``String name = myScanner.nextLine();``   ``// get second input``   ``System.out.print(``"How old are you? "``);``   ``int` `age = myScanner.nextInt();``   ``myScanner.nextLine();``   ``try` `{``    ``if` `(age < ``0``) {``     ``throw` `new` `LessThanException();``    ``} ``else` `if` `(age > ``150``) {``     ``throw` `new` `LargerThanException();``    ``}``    ``else` `{``     ``// display output on console``     ``System.out.println(``"Hello, "` `+ name + ``". Next year, you'll be "` `+ (age + ``1``));``    ``}``   ``}``   ``catch` `(LessThanException e) {``    ``e.show();;``   ``}``   ``catch` `(LargerThanException e) {``    ``e.show();``   ``}``   ``finally` `{``    ``myScanner.close();``   ``} `` ``}``}
```

**例7-5**的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
What is your name? ii``How old are you? ``786``The LargerThanException is created.``Your age shouldn't be larger than ``150``.
```

**例7-5** 的程序分析：

自定义异常类就是由某个系统异常类直接或间接派生出的子类。这里的LessThanException和LargerThanException都继承自系统异常类Exception，分别用来创建表示年龄小于0和年龄大于150的异常对象。

程序主流程中让用户输入姓名和年龄。然后做判断，如果用户输入的年龄小于0，则认为是一种异常，创建LessThanException类的实例，并用throw把它抛出，如果用户输入的年龄大于150，则认为是一种异常，创建LargerThanException类的实例，并用throw把它抛出。

程序中使用try...catch...finally语句监视并处理异常。catch子句的代码段中，调用系统传来的异常对象的show（）方法，显示异常信息。



### 异常处理的时机

处理异常的方式有两种：一种是产生异常的方法自己处理。这时就是使用 try…catch…finally 语句捕获并处理该异常。另一种是产生异常的方法自己不处理，而交给别人去处理。谁调用了它，就交给谁去处理。

本节前述例子都是在产生异常的方法内，使用try…catch…finally 语句捕获并处理该异常。此处讲把异常交给上层环境去处理的方法。

把异常交给常常环境去处理是通过throws短语实现的。如果一个方法可能会出现异常，但没有能力处理这种异常，可以在方法声明处用throws短语来声明抛出异常。例如汽车在运行时可能会出现故障，汽车本身没办法处理这个故障，那就让开车的人来处理。

throws语句用在方法定义时声明该方法要抛出的异常类型，如果抛出的是Exception异常类型，则该方法被声明为抛出所有的异常。多个异常可使用逗号分割。throws语句的语法格式为：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
methodname ``throws` `Exception1,Exception2,..,ExceptionN { ` `}
```

方法名后的throws Exception1,Exception2,...,ExceptionN 为声明要抛出的异常列表。当方法抛出异常列表的异常时，方法将不对这些类型及其子类类型的异常作处理，而抛向调用该方法的方法，由它去处理。

**例7-6** 用throws短语将异常抛给上层环境的方法调用者去处理。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
package` `com.buptnu;``public` `class` `Exp5 {``  ``static` `void` `pop() ``throws` `NegativeArraySizeException { ``    ``// 定义方法并抛出NegativeArraySizeException异常 ``    ``int``[] arr = ``new` `int``[-``3``]; ``// 创建数组 ``    ``System.out.println(arr[``0``]);``  ``} `` ``public` `static` `void` `main(String[] args) {``    ``try` `{ ``// try语句处理异常信息 ``      ``pop(); ``// 调用pop()方法 ``    ``} ``catch` `(NegativeArraySizeException e) { ``      ``System.out.println(``"pop()方法抛出的异常"``);``// 输出异常信息 ``    ``} `` ``}``}
```

**例7-6**的运行结果：

pop()方法抛出的异常

**例7-6**的程序分析：

类Exp5中声明静态方法pop()，该方法中创建一个数组arr[]，但创建数组指定的长度是复数，这是Java不允许的。此时产生异常。可以在pop()方法内部使用try...catch...finally语句处理此异常。而本例没有这样做。本例在pop()方法的声明部分添加了短语“throws NegativeArraySizeException”，声明如果本方法的方法体的代码在执行过程中产生数组大小为负值的异常，本方法不处理，交给上层环境方法调用者去处理——谁调用我pop谁去处理这个异常。

类Exp5的main()方法中调用了pop()方法，使用try监视pop()方法是否产生异常，如果产生异常，则用catch子句捕获并处理它。

使用throws关键字将异常抛给调用者后，如果调用者不想处理该异常，可以继续向上抛出，但最终要有能够处理该异常的调用者。

要点2： throws抛出异常的规则

(1)如果是不可查异常（unchecked exception），即Error、RuntimeException或它们的子类，那么可以不使用throws关键字来声明要抛出的异常，编译仍能顺利通过，但在运行时会被系统抛出。

(2)必须声明方法可抛出的任何可查异常（checked exception）。即如果一个方法可能出现受可查异常，要么用try…catch语句捕获，要么用throws子句声明将它抛出，否则会导致编译错误

(3)仅当抛出了异常，该方法的调用者才必须处理或者重新抛出该异常。当方法的调用者无力处理该异常的时候，应该继续抛出，而不是囫囵吞枣。

(4)调用方法必须遵循任何可查异常的处理和声明规则。若覆盖一个方法，则不能声明与覆盖方法不同的异常。声明的任何异常必须是被覆盖方法所声明异常的同类或子类。

(5)如果所有方法都不处理异常，而是层层向上抛出获取的异常，最终JVM会进行处理，处理也很简单，就是打印异常消息和堆栈信息。如果抛出的是Error或RuntimeException，则该方法的调用者可选择处理该异常。

### 异常的传播与异常链

在产生异常的方法中，如果没有一个 catch 子句能够匹配已经产生的异常，则执行 finally 子句（如果存在）。此时，如果仍然没有程序能够处理这个异常，好像发出异常的语句根本没有嵌套在 try 语句中，控制流程将会立即离开当前方法，过早地返回调用当前方法的方法中。如果这个调用语句处于某一个 try 语句范围之内，则将开始执行新一轮的异常匹配操作。

**例7-7** 用throws短语将异常抛给上层环境的方法调用者去处理。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
import` `java.lang.Exception; ` `public` `class` `Exp6 { `` ``static` `int` `quotient(``int` `x, ``int` `y) ``throws` `MyException { ``// 定义方法抛出异常 ``  ``if` `(y < ``0``) { ``// 判断参数是否小于0 ``   ``throw` `new` `MyException(``"除数不能是负数"``); ``// 异常信息 ``  ``} ``  ``return` `x/y; ``// 返回值 `` ``} `` ``public` `static` `void` `main(String args[]) { ``// 主方法 ``  ``int` `a =``3``; ``  ``int` `b =``0``;  ``  ``try` `{ ``// try语句包含可能发生异常的语句 ``   ``int` `result = quotient(a, b); ``// 调用方法quotient() ``  ``} ``catch` `(MyException e) { ``// 处理自定义异常 ``   ``System.out.println(e.getMessage()); ``// 输出异常信息 ``  ``} ``catch` `(ArithmeticException e) { ``// 处理ArithmeticException异常 ``   ``System.out.println(``"除数不能为0"``); ``// 输出提示信息 ``  ``} ``catch` `(Exception e) { ``// 处理其他异常 ``   ``System.out.println(``"程序发生了其他的异常"``); ``// 输出提示信息 ``  ``} `` ``} ``}` `class` `MyException ``extends` `Exception { ``// 创建自定义异常类 `` ``String message; ``// 定义String类型变量 `` ``public` `MyException(String ErrorMessagr) { ``// 构造方法 ``  ``message = ErrorMessagr; `` ``} `` ``public` `String getMessage() { ``// 覆盖getMessage()方法 ``  ``return` `message; `` ``} ``} 
```

**例7-7**的运行结果：

除数不能为0

**例7-6** 的程序分析：

1) 如果调用quotient(3,-1)，将发生MyException异常，程序调转到catch (MyException e)代码块中执行；

2) 如果调用quotient(5,0)，将会因“除数为0”错误引发ArithmeticException异常，属于运行时异常类，由Java运行时系统自动抛出。quotient（）方法没有捕捉ArithmeticException异常，Java运行时系统将沿方法调用栈查到main方法，将抛出的异常上传至quotient（）方法的调用者：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
int` `result = quotient(a, b); ``// 调用方法quotient()
```

由于该语句在try监控区域内，因此传回的“除数为0”的ArithmeticException异常由Java运行时系统抛出，并匹配catch子句：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.5.html?node=858292557&detailRecordId=1318913802&studyrecordId=1225624963&sectionRecordId=1229924168#)

```
catch` `(ArithmeticException e) { ``// 处理ArithmeticException异常<br>``  ``System.out.println(``"除数不能为0"``); ``// 输出提示信息``  ``} 
```

处理结果是输出“除数不能为0”。Java这种向上传递异常信息的处理机制形成 **异常链** 。

Java方法抛出的可查异常将依据调用栈、沿着方法调用的层次结构一直传递到具备处理能力的调用方法，最高层次到main方法为止。如果异常传递到main方法，而main不具备处理能力，也没有通过throws声明抛出该异常，将可能出现编译错误。

3)如还有其他异常发生，将使用catch (Exception e)捕捉异常。由于Exception是所有异常类的父类，如果将catch (Exception e)代码块放在其他两个代码块的前面，后面的代码块将永远得不到执行，就没有什么意义了，所以catch语句的顺序不可掉换。



## **7.6 动手项目**

### 动手项目7-1：自定义异常并抛出和处理该异常

**所需时间：**30分钟。

**项目目标：**自定义异常并抛出和处理该异常。

**过程描述：**自定义异常并抛出和处理该异常。

(1)启动Eclipse。

(2)新建一个Java项目PrjExcep。

(3)在项目PrjExcep中创建自定义异常类MyException，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.6.html?node=858292558&detailRecordId=1318913803&studyrecordId=1225624963&sectionRecordId=1229924104#)

```
 ``class` `MyException ``extends` `Exception { ``// 创建自定义异常类 `` ``String message; ``// 定义String类型变量 `` ``public` `MyException(String ErrorMessagr) { ``// 构造方法 ``  ``message = ErrorMessagr; `` ``} `` ``public` `String getMessage() { ``// 覆盖getMessage()方法 ``  ``return` `message; `` ``} ``} 
```

(4)在项目PrjExcep中创建程序主类Exp6，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java7.6.html?node=858292558&detailRecordId=1318913803&studyrecordId=1225624963&sectionRecordId=1229924104#)

```
public` `class` `Exp6 { `` ``static` `int` `quotient(``int` `x, ``int` `y) ``throws` `MyException { ``// 定义方法抛出异常 ``  ``if` `(y < ``0``) { ``// 判断参数是否小于0 ``   ``throw` `new` `MyException(``"除数不能是负数"``); ``// 异常信息 ``  ``} ``  ``return` `x/y; ``// 返回值 `` ``} `` ``public` `static` `void` `main(String args[]) { ``// 主方法 ``  ``int` `a =``3``; ``  ``int` `b =``0``;  ``  ``try` `{ ``// try语句包含可能发生异常的语句 ``   ``int` `result = quotient(a, b); ``// 调用方法quotient() ``  ``} ``catch` `(MyException e) { ``// 处理自定义异常 ``   ``System.out.println(e.getMessage()); ``// 输出异常信息 ``  ``} ``catch` `(ArithmeticException e) { ``// 处理ArithmeticException异常 ``   ``System.out.println(``"除数不能为0"``); ``// 输出提示信息 ``  ``} ``catch` `(Exception e) { ``// 处理其他异常 ``   ``System.out.println(``"程序发生了其他的异常"``); ``// 输出提示信息 ``  ``} `` ``} ``}
```

(5)运行程序，观察结果。

(6)修改类Exp6的main()方法的代码，让它接收用户从键盘输入的两个整数分别发给变量a和变量b，而不是在程序中直接指定。

(7)运行程序，分别输入不同的两个整数，观察其正常执行结果，各种其他异常的结果。



## **7.7 小结**

### 主体内容

Java把程序的运行时错误称为异常。

异常处理是 Java 中惟一正式的错误报告机制，并且通过编译器强制执行。对于可以检测到的异常，Java要求程序员在编写程序时必须对其进行处理，否则程序不能通过编译。

Java以面向对象的方式处理异常。Java提供了一系列的异常类，用于处理异常。

在 Java 中，所有的异常都有一个共同的祖先 Throwable（可抛出）。Throwable 指定代码中可用异常传播机制通过 Java 应用程序传输的任何问题的共性。Throwable 是 Object 的直接子类，是所有异常的父类。

Throwable：有两个重要的子类：Exception（异常）和 Error（错误），二者都是 Java 异常处理的重要子类，各自都包含大量子类。

在一个方法的运行过程中，如果发生了一个异常，则 Java 虚拟机会如同创建其它对象一样，使用 new 在堆上创建异常对象。然后，当前的执行流程被终止，并且从当前环境中弹出异常对象的引用。此时， Java 的异常处理机制接管程序，并开始寻找一个恰当的地方来继续执行程序。这个恰当的地方就是“异常处理程序”，它的任务是将程序从错误状态中恢复或者做一些简单地处理后结束程序。

我们把生成异常对象并把它交给运行时系统的异常处理机制的过程称为抛出异常。运行时系统的异常处理机制在方法的调用栈中查找，从生成异常的方法开始回溯，直到找到包含相应异常处理的方法为止，这个过程称为捕获异常。

异常通常由以下两种情况引起：

(1) 程序执行了不合法的动作。

(2) 或者通过执行 throw 语句由程序显式生成异常。

try…catch…finally 语句是处理异常的语句结构。

自定义异常类就是由某个系统异常类直接或间接派生出的子类。

处理异常的方式有两种：一种是产生异常的方法自己处理。这时就是使用 try…catch…finally 语句捕获并处理该异常。另一种是产生异常的方法自己不处理，而交给别人去处理。谁调用了它，就交给谁去处理。

在产生异常的方法中，如果没有一个 catch 子句能够匹配已经产生的异常，则执行 finally 子句（如果存在）。此时，如果仍然没有程序能够处理这个异常，好像发出异常的语句根本没有嵌套在 try 语句中，控制流程将会立即离开当前方法，过早地返回调用当前方法的方法中。如果这个调用语句处于某一个 try 语句范围之内，则将开始执行新一轮的异常匹配操作。

## **7.8 思考题**

### 主体内容

**1.什么是异常？ Java 处理异常的方法是什么？**【隐藏】

**答：**所谓异常，就是程序的运行时错误。

Java通过面向对象的方法来处理异常。在一个方法的运行过程中，如果发生了一个异常，则 Java 虚拟机会如同创建其它对象一样，使用 new 在堆上创建异常对象。然后，当前的执行流程被终止，并且从当前环境中弹出异常对象的引用。此时， Java 的异常处理机制接管程序，并开始寻找一个恰当的的地方来继续执行程序。这个恰当的地方就是“异常处理程序”，它的任务是将程序从错误状态中恢复或者做一些简单地处理后结束程序。

**2.在编写程序时如何在抛出异常的方法内部处理异常？**【隐藏】

**答：**使用try … catch … finally 代码块监视和处理异常。

如果 try 语句的代码引发（抛出）的异常与后面某个catch语句的参数的类型匹配，则用该catch语句块中的代码处理该异常。如果不匹配就往后找有没有其它的 catch 语句的异常参数类型匹配。如果所有的 catch 语句的异常类型与 try 语句代码段实际产生的异常都不匹配，则执行 finally 语句的代码。另外， try 语句的代码段在执行过程中也有可能不产生异常，此时不管有没有异常产生， try 语句的代码段执行完了之后都会执行 finally 语句的代码段。try … catch … finally 代码块全部执行结束之后，如果中间没有出现任何控制转移，程序将在 catch 或 finally 之后继续执行。

**3.在编写程序时如何把异常交给方法调用者去处理？**【隐藏】

**答：**可以在产生异常的方法内部自己处理异常，也可以不自己处理，而是简单的声明自己可能会抛出哪些类型的异常，如果方法代码执行过程中真的产生异常了，那么就让方法调用者去处理。方法是在方法声明中使用 throws 短语声明该方法可能会抛出哪种类型的异常。

**4.异常是如何传播的？**【隐藏】

**答：**在“try … catch … finally”结构中，如果没有一个 catch 子句能够匹配已经产生的异常，则执行 finally 子句（如果存在）。此时，如果仍然没有程序能够处理这个异常，好像发出异常的语句根本没有嵌套在 try 语句中，控制流程将会立即离开当前方法，过早地返回调用当前方法的方法中。如果这个调用语句处于某一个 try 语句范围之内，则将开始执行新一轮的异常匹配操作。



## **7.9 自测练习**

## 【课后练习】

1. 自定义异常时，可以通过对下列哪一项进行继承？（） 

   （A）Error类   

   （B）Applet类  

    （C）Exception类及其子类 

    （D）AssertionError类

   2. 以下关于java异常说法错误的是（）。 

      （A）Throwable 类是 Java 语言中Error类和Exception类的父类   

      （B）当异常对象是Exception类（或其子类）的实例时，能通过 Java 虚拟机或者 throw 语句抛出该异常对象，并能通过try…catch…finally处理   

      （C）如果只用一个catch块捕捉多个异常对象，则catch 子句中的参数类型应是所有异常对象的父类  

      （D）以上说法都不对

      3. 异常包含下列哪些内容？（） 

         （A）程序执行过程中遇到的事先没有预料到的情况   

         （B）程序中的语法错误  

          （C）程序的编译错误  

         （D）以上都是

         4. 对于已经被定义过可能抛出异常的语句，在编程时？（） 

            （A）必须使用try／catch语句处理异常，或用throws将其抛出  

             （B）如果程序错误，必须使用 try／catch语句处理异常   

            （C）可以置之不理  

            （D）只能使用try／catch语句处理

            5. 当方法遇到异常又不知如何处理时，应该怎么做？（） 

               （A）捕获异常  

                （B）抛出异常   

               （C）声明异常  

               （D）嵌套异常

# 第8章 流

## **8.1 流的概念**

### 主体内容

在计算机系统的实际应用中，常常需要处理许多资源。这些资源有的以文件形式保存在磁盘中，有的通过网络进行连接。这样，在应用程序的实现中，必须在程序中提供一种将数据连接到应用程序的方法。在Java中，这样的方法称为流(stream)。

流是一种抽象的概念，它为应用程序和各种实际设备提供了一致性的接口。Java把各种实际设备的处理细节都封装在某个数据流类当中，所以虽然各种实际设备的差别很大，但是我们可以通过Java提供的数据流类，使用相同的方法来连接数据资源和应用程序。直观地说，流就是用于处理输入/输出的字节序列或字符序列。

java.io程序包中提供了大量的数据流类，编程人员只要使用相应的数据流类，就可以与相应的设备交换数据。

按照数据的传输方向，流可以分为输入流和输出流两类。

将字节序列或字符序列从应用程序传递到外设或外存的流称为输出流（output stream）；反之，将字节序列或字符序列从外设或外存传递到应用程序的流称为输入流（input stream）。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z1.png)

**图8.1 输入流与输出流**

图8.1说明了流的处理方式。Java在实际设备和应用程序之间加入了一个中间介质，这就是流。流是数据传输的抽象表达。应用程序使用输入流，从外部设备读取数据，使用输出流，向外部设备写入数据。所以，流实际上就是在应用程序和实际设备之间的逻辑设备。通过这种抽象可以使得应用程序读取数据和写入数据更为一致，而具体的从某个外部设备读取和写入数据的细节则被封装在系统提供的数据流类当中。

按照数据的格式，可以分为字节流和字符流。字节流是一组二进制字节序列，它与设备之间传递的数据存在一一对应关系，没有任何字符的转换。而字符流是字符序列，根据具体环境的需要，可能会有一定的字符要进行转换，因此在被读或写的字符与设备上的字符之间可能不存在一一对应关系。

在Java中，基本流类有4个，它们都是抽象类：Reader是基于Unicode字符的输入流，Writer是基于Unicode字符的输出流，InputStream是基于二进制字节的输入流，OutputStream是基于二进制字节的输出流。

在实际使用的时候，我们不要直接使用这些类，而是应该从它们派生出新类。通常，我们使用流类的构造器创建流对象，在建立流对象之后，可以使用它们的方法传输数据。使用流对象之后，通常还要使用close方法关闭流。

## **8.2 数据流的应用**

### 文件输入/输出流的应用

系统类FileInputStream和FileOutputStream用于以字节方式处理文件的输入和输出，称为文件输入/输出流；而系统类FileReader 和FileWriter用于以字符方式处理文件的输入和输出，称为文件读写器。



### 活动1：观看关于文件输入/输出流的视频

下面的视频演示了文件输入/输出流的应用。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid8-1.png)

**视频8-1：文件输入/输出流的应用**

1. 新建一个Java项目PrjStream。本章的实例都放到这个项目中。

2. 在项目PrjStream中创建类BytesCopy。BytesCopy类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.2.html?node=858292563&detailRecordId=1318913808&studyrecordId=1225624963&sectionRecordId=1229924160#)

```
package` `com.buptnu;``import` `java.io.*;` `public` `class` `BytesCopy {`` ``public` `static` `void` `main(String[] args) ``throws` `IOException {``  ``// TODO Auto-generated method stub``  ``FileInputStream in = ``new` `FileInputStream( ``"D:\\JavaPrograms\\PrjStream\\src\\com\\buptnu\\BytesCopy.java"` `);``  ``FileOutputStream out = ``new` `FileOutputStream ( ``"D:\\JavaPrograms\\PrjStream\\src\\com\\buptnu\\BytesCopy.txt"` `);``  ``int` `c;``  ``while` `( ( c = in.read() ) != -``1` `)``   ``out.write(c);``  ``in.close();``  ``out.close();`` ``}``}
```

3. 运行程序，到“D:\JavaPrograms\PrjStream\src\com\buptnu”下面查看复制前和复制后的结果。

活动1的解析：本视频程序的说明

main()方法的第1条语句是创建了文件输入流对象in。其中，在FileInputStream的构造方法中给出的字符串参数是要读取的文件，输入流对象in连接到该文件。

要读取的文件包含了文件所在路径和文件名。这里的路径字符串中用到了转义字符。Java 语言中有些字符有特定意义，或者不能显示，需要用转义字符表示它们，例如 \’ 表示单引号， \\ 表示反斜杠。

main()方法的第2条语句是创建了文件输入流对象out，其中，在FileOutputStream的构造方法中给出的字符串参数是要写入的文件，含路径和文件名。

main()方法的第4条语句是一个while循环语句。while后面的表达式中，使用文件输入流对象in的read()方法，读取输入流的字节，放入变量c中。方法read()的返回值是整型，所以变量c必须声明为整型的。while语句的循环体，使用文件输出流对象out的write方法，把变量c的值写入输出流，也就是新文件中。这样，每从原文件中读取一个字符，就向新文件中写入一个字符。当文件的内容全部读完后，方法read()返回-1，于是退出循环。

之后，关闭输入流对象，关闭输出流对象。

程序的运行结果：把文件BytesCopy.java复制为BytesCopy.txt.。

要点1：流的使用要点

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) Java提供了用于处理数据输入输出专门的系统类，这些类统称为“流类”。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 在实际使用的时候，通常我们使用流类的构造器创建流对象，在建立流对象之后，可以使用它们的方法传输数据。使用流对象之后，通常还要使用close方法关闭流。



### 活动2：亲自开发一个基于字符的文件读写器的复制文件的程序

请你按照下述步骤亲自用Eclipse开发一个基于字符的文件读写器的复制文件的程序。

**Step1.** 启动Eclipse。

**Step2.** 新建一个Java项目PrjStream。

**Step3.** 在项目PrjStream中，新建一个类Copy，功能是将你本地磁盘的某个文件复制为另外一个文件。提示：可直接利用视频8-1中的程序为基础程序框架，在它的上面进行修改。把FileInputStream换成FileReader，把FileOutputStream换成FileWriter，即可。

**Step4.** 运行程序，观察结果。

**Step5.** 思考程序每条语句的功能。



### 缓冲流的应用

系统类BufferedReader和BufferedWriter分别称为缓冲读取器和缓冲写入器，它们都有一个缓冲区。与之对应的是系统类BufferedInputStream和BufferedOutputStream，分别称为缓冲输入流和缓冲输出流，它们也都有一个缓冲区。通过使用缓冲区，这些数据流将尽可能多的读取或写入数据到缓冲区内，然后集中发送到终点，以减少系统和外部设备的交换次数。

将文件输入流作为缓冲流的数据源来显示文件内容的例子。

**例8-1** MyTry.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.2.html?node=858292563&detailRecordId=1318913808&studyrecordId=1225624963&sectionRecordId=1229924160#)

```
import` `java.io.*;` `class` `ShowFile {`` ``public` `static` `void` `main( String args[] ) ``throws` `IOException {``  ``FileReader fr=``new` `FileReader(``"ShowFile.java"``);``  ``BufferedReader br=``new` `BufferedReader(fr);``  ``String str;``  ``while` `((str=br.readLine())!=``null``)``   ``System.out.println(str);``  ``br.close();``  ``fr.close();`` ``}``}
```

**例8-1** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/z2.png)

**例8-1** 的程序分析：

在这个程序中，先用文件读取器创建了文件输入流对象fr，然后将它作为缓冲读取器的参数创建缓冲读取器对象br，也就是我们常说的“把文件输入流对象连接到缓冲读取器对象上”。执行时，从fr读取得内容将保存在br的缓冲区内。程序使用一个循环从br的缓冲区逐行读取数据到字符串str中，然后显示在屏幕上。最后关闭这流对象。



### 数据输入/输出流的应用

系统类DataInputStream和DataOutputStream称为数据输入/输出流，它们在输入输出数据的同时，能对流进行变换处理，所以可以读写任意一种基本数据类型。

**例8-2** DataTest.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.2.html?node=858292563&detailRecordId=1318913808&studyrecordId=1225624963&sectionRecordId=1229924160#)

```
import` `java.io.*;` `public` `class` `DataTest {`` ``public` `static` `void` `main( String args[] ) ``throws` `IOException {``  ``FileOutputStream fout=``new` `FileOutputStream(``"data.txt"``);``  ``DataOutputStream out=``new` `DataOutputStream(fout);``  ``float` `prices=``1``.5f;``int` `units=``5``;String items=``"苹果"``;``  ``out.writeFloat(prices);out.writeChar(``'\t'``);``  ``out.writeInt(units);out.writeChar(``'\t'``);``  ``out.writeChars(items);out.writeChar(``'\n'``);``  ``out.close();``  ``fout.close();``  ` `  ``FileInputStream fin=``new` `FileInputStream(``"data.txt"``);``  ``DataInputStream in=``new` `DataInputStream(fin);``  ``float` `price;``int` `unit;String item;``char` `ch;``  ``try` `{``   ``price=in.readFloat();``   ``in.readChar();``   ``unit=in.readInt();``   ``in.readChar();``   ``//in.skip(2);``   ``item=``new` `String();``   ``while` `((ch=in.readChar())!=``'\n'``)``    ``item+=ch;``   ``System.out.println(item+``" "``+unit+``"斤"``+``" 单价"``+price+``"元"``); ``  ``} ``catch` `(EOFException e){}``  ``in.close();``  ``fin.close();   `` ``}``}
```

**例8-2** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.2.html?node=858292563&detailRecordId=1318913808&studyrecordId=1225624963&sectionRecordId=1229924160#)

```
苹果 ``5``斤 单价``1.5``元
```

在这个程序中，数据输入输出流建立在文件输入输出流的基础上。

数据输出的过程如下：首先创建文件输出流对象fout，然后以fout为参数创建数据输出流对象out。此初始化是把数据输出流out连接到文件输入流fout上。接下来使用数据输出流对象out的writeXXX方法，向数据输出流中写相应XXX类型的数据。最后关闭数据输出流对象out和文件输出流对象fout。

数据输入过程与数据输出过程语法类似，只是数据流动方向相反。创建文件输入流fin，以fin为参数创建数据输出流对象in，通过初始化操作把in连接到fin上。

在执行过程中，首先创建文件data.txt，然后向这个文件写入不同类型的数据。接下来从文件data.txt中读取这些数据，按照一定的格式显示在屏幕上。

需要说明的是，如果我们使用记事本打开文件data.txt，则看到的文件是乱码，这与Java程序所使用的字符编码方式有关。只要调用相应的读取方法，如本程序这样，这些数据就能被数据输入流正确还原。



### 节点流与处理流

按照数据来源，可以分为节点流和处理流两类。节点流从一个特定的数据源读写数据。即节点流是直接操作文件，网络等的流，例如FileInputStream和FileOutputStream，他们直接从文件中读取或往文件中写入字节流。处理流是“连接”在已存在的流（节点流或处理流）之上通过对数据的处理为程序提供更为强大的读写功能。过滤流是使用一个已经存在的输入流或输出流连接创建的，过滤流就是对节点流进行一系列的包装。例如BufferedInputStream和BufferedOutputStream，使用已经存在的节点流来构造，提供带缓冲的读写，提高了读写的效率，以及DataInputStream和DataOutputStream，使用已经存在的节点流来构造，提供了读写Java中的基本数据类型的功能。他们都属于过滤流。



### 节点流类型常见的有：

对文件操作的字符流有FileReader/FileWriter，字节流有FileInputStream/FileOutputStream。



### 处理流类型常见的有：

（1）缓冲流：缓冲流要“套接”在相应的节点流之上，对读写的数据提供了缓冲的功能，提高了读写效率，同时增加了一些新的方法。字节缓冲流有BufferedInputStream/BufferedOutputStream，字符缓冲流有BufferedReader/BufferedWriter，字符缓冲流分别提供了读取和写入一行的方法ReadLine和NewLine方法。对于输出地缓冲流，写出的数据，会先写入到内存中，再使用flush方法将内存中的数据刷到硬盘。所以，在使用字符缓冲流的时候，一定要先flush，然后再close，避免数据丢失。

（2）转换流：用于字节数据到字符数据之间的转换。仅有字符流InputStreamReader/OutputStreamWriter。其中，InputStreamReader需要与InputStream“套接”，OutputStreamWriter需要与OutputStream“套接”。

（3）数据流：提供了读写Java中的基本数据类型的功能。DataInputStream和DataOutputStream分别继承自InputStream和OutputStream，需要“套接”在InputStream和OutputStream类型的节点流之上。

（4）对象流：用于直接将对象写入写出。流类有ObjectInputStream和ObjectOutputStream，本身这两个方法没什么，但是其要写出的对象有要求，该对象必须实现Serializable接口，来声明其是可以序列化的。否则，不能用对象流读写。还有一个关键字比较重要，transient，由于修饰实现了Serializable接口的类内的属性，被该修饰符修饰的属性，在以对象流的方式输出的时候，该字段会被忽略。

## **8.3 文件类**

### 主体内容

为了全面管理文件系统，Java还提供了两个文件类：File和RandowmAccessFile。前者提供操作系统目录管理功能，后者用于文件的随机读写操作。



### 一般文件类

**例8-3** DirFile.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.3.html?node=858292564&detailRecordId=1318913809&studyrecordId=1225624963&sectionRecordId=1229924159#)

```
import` `java.io.*;` `class` `DirFile {`` ``public` `static` `void` `main( String args[] ) ``throws` `IOException {``  ``File file = ``new` `File(``"DirFile.java"``);``  ``if` `(file.exists()) {``   ``System.out.println(``"文件名: "``+file.getName());``   ``System.out.println(``"绝对路径: "``+file.getAbsolutePath());``  ``}``  ``else``   ``System.out.println(``"文件没找到。"``);`` ``}``}
```

**例8-3** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.3.html?node=858292564&detailRecordId=1318913809&studyrecordId=1225624963&sectionRecordId=1229924159#)

```
文件名: DirFile.java``绝对路径: D:\JavaSrcEclipse\workspace\MyTry\DirFile.java
```

**例8-3** 的程序分析：

这个程序创建了一个File系统类的对象，使用这个对象代表实际要访问的文件。使用file对象的exists()方法判断文件是否存在，如果文件存在，则使用getName()方法取得文件名，使用getAbsolutePath()方法取得文件的绝对路径，继而输出文件名和文件路径。如果文件步存在，则输出提示信息。



### 随机存取文件类

随机存取文件类可以使应用程序从文件的不同位置读取或写入不同长度的数据。

**例8-4** MyTry.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.3.html?node=858292564&detailRecordId=1318913809&studyrecordId=1225624963&sectionRecordId=1229924159#)

```
import` `java.io.*;` `class` `AppendFile {`` ``public` `static` `void` `main( String args[] ) {``  ``try` `{``   ``RandomAccessFile rf=``new` `RandomAccessFile(``"demo.txt"``,``"rw"``);``   ``rf.seek(rf.length());``   ``rf.writeBytes(``"First line\n"``);``   ``rf.writeBytes(``"Second line\n"``);``   ``rf.seek(``0``);``   ``String s;``   ``while` `((s=rf.readLine())!=``null``)``    ``System.out.println(s);``   ``rf.close();``  ``}``  ``catch` `(FileNotFoundException fnoe) {}``  ``catch` `(IOException ioe) {}`` ``}``}
```

**例8-4** 的运行结果：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.3.html?node=858292564&detailRecordId=1318913809&studyrecordId=1225624963&sectionRecordId=1229924159#)

```
First line``Second line
```

**例8-4** 的程序分析：

在这个程序中，创建了一个随机存储文件对象rf。在调用随机存储类的构造方法的时候，使用了两个参数。第一个参数是"demo.txt"，它是要处理的文件的名字。第二个参数是"rw"，它表示以读写的方式打开文件。这种方式既可以读取文件的数据，也可以向文件写入数据。随机存储文件对象的seek()方法用于定位文件的指针。以rf.length()为参数调用方法seek()，就是把文件指针移到文件尾部。writeBytes()方法用于以字节序列的方式写入字符串。While循环语句用于从文件demo.txt中读取数据，显示到计算机屏幕上。

在程序处理过程中可能产生异常，所以使用了try…catch语句捕获异常。而在catch语句中并没有对所捕获的异常做任何特殊处理。

## **8.4 动手项目**



### 动手项目8-1：使用File类创建目录（文件夹）

**所需时间：**30分钟。

**项目目标：**使用File类创建目录。

**过程描述：**使用File类创建目录。

File类中有两个方法可以用来创建文件夹：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) mkdirs()方法创建一个文件夹和它的所有父文件夹。

本项目创建"/tmp/user/java/bin"文件夹。

（1）启动Eclipse。

（2）在项目PrjStream中，新建一个类Copy，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java8.4.html?node=858292565&detailRecordId=1318913810&studyrecordId=1225624963&sectionRecordId=1229924162#)

```
import` `java.io.File;` `public` `class` `CreateDir {`` ``public` `static` `void` `main(String args[]) {``  ``String dirname = ``"/tmp/user/java/bin"``;``  ``File d = ``new` `File(dirname);``  ``// 现在创建目录``  ``d.mkdirs();`` ``}``}
```

（3）运行程序。

（4）到D盘，tmp文件夹下，查看所创建的目录。

（5）**思考：** 为什么是在D盘，而不是在其它磁盘下创建目录？

## **8.5 小结**

### 主体内容

java.io程序包中提供了大量的数据流类，编程人员只要使用相应的数据流类，就可以与相应的设备交换数据。

按照数据的传输方向，流分为输入流和输出流两类。

按照数据的格式，流分为字节流和字符流两类。

字节流是一组二进制字节序列，它与设备之间传递的数据存在一一对应关系，没有任何字符的转换。而字符流是字符序列，根据具体环境的需要，可能会有一定的字符要进行转换，因此在被读或写的字符与设备上的字符之间可能不存在一一对应关系。

在Java中，基本流类有4个，它们都是抽象类：Reader是基于Unicode字符的输入流，Writer是基于Unicode字符的输出流，InputStream是基于二进制字节的输入流，OutputStream是基于二进制字节的输出流。

在实际使用的时候，我们不要直接使用这些类，而是应该从它们派生出新类。通常，我们使用流类的构造器创建流对象，在建立流对象之后，可以使用它们的方法传输数据。使用流对象之后，通常还要使用close方法关闭流。

照数据来源，流分为节点流和处理流两类。

节点流从一个特定的数据源读写数据。即节点流是直接操作文件，网络等的流。处理流是“连接”在已存在的流（节点流或处理流）之上通过对数据的处理为程序提供更为强大的读写功能。

FileInputStream、FileOutputStream、FileReader 、FileWriter都是节点流。缓冲流、转换流、数据流和对象流都是处理流。

## **8.6 思考题**

### 主体内容

**1.什么是流？它的作用是什么？**【隐藏】

**答：**直观地说，流就是用于处理输入/输出的字节序列或字符序列。Java 把程序与各种实际设备之间的数据输入输出的处理细节都封装在称为“流”的系统类中。这样，虽然各种实际设备的差别很大，但是我们可以通过 Java 平台提供的“流”类，使用相同的方法来连接数据资源和应用程序。java.io程序包中提供了大量的数据流类，编程人员只要使用相应的数据流类，就可以与相应的设备交换数据。

**2.字节流和字符流有什么差别？**【隐藏】

**答：**字节流是一组二进制字节序列，它与设备之间传递的数据存在一一对应关系，没有任何字符的转换。而字符流是字符序列，根据具体环境的需要，可能会有一定的字符要进行转换，因此在被读或写的字符与设备上的字符之间可能不存在一一对应关系。

**3.节点流和处理流有什么差别？**【隐藏】

**答：**节点流从一个特定的数据源读写数据。即节点流是直接操作文件，网络等的流。处理流是“连接”在已存在的流（节点流或处理流）之上通过对数据的处理为程序提供更为强大的读写功能。

FileInputStream、FileOutputStream、FileReader 、FileWriter都是节点流。缓冲流、转换流、数据流和对象流都是处理流。

## **8.7 自测练习**

## 【课后练习】

1. Java提供处理不同类型流的类的API包是（）。 

   （A）java.sql   

   （B）java.util   

   （C）java.net  

   （D）java.io

   2. 下列流中哪一个使用了缓冲区技术？（） 

      （A）BufferedOutputStream   

      （B）FileInputStream   

      （C）DataOutputStream  

      （D）FileReader

      3. 能读入字节数据进行Java基本数据类型判断过虑的类是（）。 

         （A）BufferedInputStream   

         （B）FileInputStream   

         （C）DataInputStream  

         （D）FileReader

         4. 字符流与字节流的区别在于（）。 

            （A）前者带有缓冲，后者没有   

            （B）前者是块读写，后者是字节读写   

            （C）二者没有区别，可以互换使用  

            （D）每次读写的字节数不同

            5. Java中的抽象类Reader和Writer所处理的流是（）。 

               （A）图像流   

               （B）对象流   

               （C）字节流  

               （D）字符流

# **第9章 多线程**

## **9.1 线程的概念**

### 主体内容

线程不是什么新的概念。在以前，许多操作系统都通过提供的库来为 C 语言程序员提供创建线程的机制。而其它一些语言（如 Ada）与 Java 一样，将对线程的支持内置到语言内部。早前，线程往往被看成是一个非主流的编程主题，但在 Java 中情况完全不一样，线程是一个核心主题。如果不引入有关线程的技术，则只能编写简单的 Java 程序。

通俗地讲，线程是一个代码执行流，通过使用线程可以使程序看起来似乎同时做几件事。例如，程序代码可能要与用户进行交互，同时在后台执行耗时很长的任务，比如从网络上获取一个较大的文件。此时使用两个线程来分别完成这两个任务会比较合适一些，如果用单个线程完成这两个工作，那么当启动从网络上获取文件的工作以后，用户就暂时无法与程序进行交互了。只有等文件获取工作结束之后程序才能继续和用户交互。假如从网络上获取文件要等待很长时间才能完成，那么用户必定要非得疯了不可。此时使用多线程，看起来两个任务好像同时进行。然而，不同的线程实际上往往并不是同时进行的。如果是单处理器，那么处理器在一个时刻只能执行一个线程。每个线程在这个单独的处理器上得到一个时间片。一个线程暂时不用处理器的时候就让这个处理器执行其它线程的代码。这样看起来就好像是多个线程同时在执行。当然，如果是有多个处理器的话，有可能多个线程是真正同时在执行的。

在传统的多任务操作系统中，当需要执行一个任务的时候，操作系统就启动一个进程去完成该任务，如果要同时完成另外一个任务，那么操作系统就又启动一个进程去完成它。这样在系统中同时存在多个进程。操作系统会有专门的进程调度程序去管理这多个进程的执行。最早的时候只有进程的概念，没有线程的概念，每个进程只有一个代码执行流，有开始点，结束点，从开始到结束中间任何一个时刻都只有一个执行点。从另外一个角度看，当需要运行一个程序的时候，操作系统就启动一个进程，用这个进程加载程序代码去执行这个程序。如果需要同时运行另一个程序，操作系统就再启动一个新的进程，然后让它去执行需要执行的程序。每个进程都需要拥有需要的资源才能执行，但是这样划分进程的粒度太大，耗费资源太多，于是就出现了线程的概念。在支持线程的系统中，每个进程中可以有多个线程，每个线程拥有一个独立的代码执行序列，多个线程共享同一个进程的资源。有专门的线程调度机制负责管理多个线程的执行。线程调度机制可以放到操作系统一级，也可以放到应用程序一级。采用那种机制就看操作系统设计者和程序员怎么决策了。怎么决策视实际要解决的问题的需要而定。支持线程的系统在一定程度上减轻了进程资源耗费的问题。

提示：

编写多线程的程序看起来好像有点难，实事上要从操作系统级处理多进程和多线程的问题确实是很复杂的是事情。但不要对此感到恐慌：在 Java 中进行多线程编程并不意味着我们要编写一个可以运行多个程序的多任务操作系统时所必须进行的系统级编程。对于通常的任务而言， Java API 设计得非常简单并且很少需要特别的技能，只要我们熟练使用与线程相关 Java API 并熟悉一些相关的语法就足够了。

## **9.2 Java的线程与主线程**

### 主体内容

Java 程序是从一个众所周知的入口点开始执行的，即是从 main() 方法的第一条语句开始执行的 。事实上，当 Java 程序启动时，系统就为它创建好一个线程，用这个线程执行 main() 方法中的代码序列。这个系统创建好的线程叫主线程。对于 Java Application 程序而言是这样的，但是对于 Java Applet 程序而言，主线程的概念有了转义，Java Applet 程序的“主线程”用来指负责调用 init()、 actionPerformed() 等回调方法的那个线程。

除了主线程， JVM 还创建了其它线程，不过我们通常都看不到它们：例如，与垃圾收集、对象终止和其它 JVM 内事务处理任务相关的线程，等等。另外，其它工具也创建线程，如 AWT或 Swing UI 工具箱、servlet 容器等。

我们也可以在程序中自己写代码去创建线程。我们程序代码也可以创建多个线程，每个线程完成不同的处理任务。例如，像前面曾经提到过的，我们可以创建一个线程进行用户交互，创建另一个线程在后台执行耗时很长的任务。

JVM 创建的线程称为系统线程，我们自己在程序中用代码创建的线程称为用户线程。



### 活动：观看关于Java程序主线程的一些操作的视频

下面的视频介绍了获取Java程序主线程并对其进行一些操作，从而让你对线程有一个初步的认识。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid9-1.png)

**视频9-1： Java程序主线程的一些操作**

\1. 新建一个Java项目PrjThread。本章的实例都放到这个项目中。

\2. 在项目PrjThread中创建类mainThreadApp。mainThreadApp类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.2.html?node=858292590&detailRecordId=1318913815&studyrecordId=1225624963&sectionRecordId=1229924180#)

```
package` `com.buptnu;``public` `class` `mainThreadApp {`` ``public` `static` `void` `main(String[] args) {``  ``Thread thrd= Thread.currentThread();``  ``System.out.println(``   ``"Main thread is named "` `+ thrd.getName()``   ``);``  ``try` `{``   ``System.out.println(``"Hello "``);``   ``Thread.sleep(``2000``);``   ``System.out.println(``"from "``);``   ``Thread.sleep(``2000``);``   ``System.out.println(``"java."``);``   ``Thread.sleep(``2000``);``  ``} ``catch` `(InterruptedException e) {}`` ``}``}
```

\3. 运行程序，观察结果，特别是休眠2000ms再输出的情况。

\4. 最后陈述一下下面的要点。

活动的解析：本视频中的程序的分析

（1）Java API 提供了一个系统类 Thread 供我们创建和使用线程。 Thread 类的对象就是一个线程。

（2）Thread 类的currentThread() 方法得到当前的线程。这个程序执行的时候正在主线程中执行，所以 currentThread() 方法得到的就是主线程。程序中用此方法得到主线程对象以后，把这个主线程对象的引用赋给线程类变量 thrd，在之后的语句中调用 thrd 的 getName() 方法取得线程的名字然后输出。由此看到，主线程的名字就是 main。

（3）Thread 类的 sleep() 方法让线程休眠一段时间，以毫秒数计算。语句Thread.sleep(2000);让当前线程休眠 2000 毫秒，时间到了之后线程再继续执行。

（4）由于线程休眠期间可能会出现 InterruptedException 异常，所以使用 try … catch … 做了异常处理。这里的异常处理就是什么都不做，所以在 catch 后面的语句块中为空。当然，如果真的需要对该异常做出特定处理的话，把异常处理代码写到 catch 后面的语句块就可以了。

（5）实际运行程序就会看到，三个字符串的输出之间确实等了一段时间，那正是由于我们让线程休眠了。也可以改改程序，让线程休眠更长的时间，那样效果会更明显。

## **9.3 创建线程和启动线程**

### 主体内容

可以在程序中创建自己的线程并启动线程。



### 创建线程和启动线程

Java 用面向对象的方法实现线程。在 Java 中，线程被表示为 Java.lang.Thread 类的一个实例。所以创建一个线程最简单的做法是从 Java.lang.Thread 类继承，这个类已经具有了创建和运行线程所必要的架构。 Thread 类最重要的方法是 run()。一个线程要完成一个应用任务，为了完成该应用任务而编写的代码要放到 run() 方法中，这也就意味着在 Thread 的子类中要重载 run() 方法。

Thread 类的对象以及它的任何子类对象都是一个线程，但是创建好线程对象之后并不意味着这个线程就会被处理机（JMV）运行，还需要调用线程对象的 start() 方法启动线程。当线程启动之后，Java 的线程调度机制才会在适当的时候调度线程，执行 run() 方法的代码，从而完成线程该完成的应用任务。

通过继承系统类 Thread 创建线程类的方法简单，但是有时候会不好用。 Java 只支持单一继承，假如一个类为了完成线程任务而继承了 Thread 类，那它就不能再继承其它类了，显然这使编程受到了很多限制。可以使用另外一种变通方法来解决这个问题：创建一个实现 Runnable 接口的类，然后创建该类的一个对象，再把这个对象传递给 Thread 类的构造方法去创建线程对象。



### 活动1：观看直接从 Java.lang.Thread 类创建线程的视频

下面的视频演示了直接从 Java.lang.Thread 类创建线程，之后启动线程。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid9-2.png)

**视频9-2：直接从 Java.lang.Thread 类创建线程**

\1. 在项目PrjThread中新建文件ThreadDemo1.java。

在Eclipse的“Package Explorer”窗口中右键单击项目PrjExcep下的src文件夹，然后弹出可得快捷菜单中选择new->file，打开“New File”对话框，键入文件名ThreadDemo1.java，然后确定。

\2. 编辑文件ThreadDemo1.java。

（1）创建线程类testThread，代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.3.html?node=858292591&detailRecordId=1318913816&studyrecordId=1225624963&sectionRecordId=1229924178#)

```
class` `testThread ``extends` `Thread {` ` ``public` `testThread(String str) {``  ``super``(str);`` ``} ``// 调用父类的构造方法，创建名称为str的线程对象`` ``public` `void` `run() {``  ``for` `(``int` `i=``0``;i< ``3``;i++) {``   ``System.out.println(getName()+``"在运行"``);``   ``try` `{``    ``sleep(``2000``);``   ``} ``catch` `(InterruptedException e) {}``  ``}``  ``System.out.println(getName()+``"已结束"``);`` ``}``}
```

（2）创建应用程序主类ThreadDemo1，代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.3.html?node=858292591&detailRecordId=1318913816&studyrecordId=1225624963&sectionRecordId=1229924178#)

```
class` `ThreadDemo1 {` ` ``public` `static` `void` `main( String[] args) {` `  ``testThread t1=``new` `testThread(``"thread1"``);``  ``testThread t2=``new` `testThread(``"thread2"``);``  ``t1.start();``  ``t2.start();`` ``}``}
```

\3. 多次运行程序，每次把运行结果保存到一个文件中，对比每次程序的运行结果，体会多线程程序的运行特点。

活动1的解析：本视频中创建的包

（1）TestThread 类继承自线程类 Thread，它的实例化对象就是要执行的线程。在这个类中有一个构造方法，它调用父类的构造方法，为实例化对象线程命名。这个类中覆盖了父类的 run() 方法，并把线程的任务处理代码全部写在 run() 方法中。在这个方法中，有一个 for 循环语句，它的作用是取得线程对象的名字，然后输出，之后让线程睡上一会儿，再输出线程的名字。这样循环三次。在 run() 方法的最后，输出提示：线程已经结束。

（2）程序的主类 ThreadDemo1。在它的 main() 方法中，创建了两个testThread 类的实例对象 t1 和 t2，然后调用这两个对象的 start() 方法，启动这两个线程。这个 start() 方法是从父类 Thread 继承过来的，它的作用就是启动线程。 Thread 类的 start() 方法将为线程执行特殊的初始化操作，然后调用 run() 方法。所以，整个步骤是：先创建线程对象，然后调用 start() 方法配置并启动线程，然后由 Java 的线程调度机制调用调度线程执行，线程执行的时候系统就会调用 run()方法，即执行 run() 的代码。

（3）线程 t1 和 t2 启动之后， Java 的线程调度程序会调度它们去执行。线程的执行就是执行我们写到 run() 方法中的代码。线程 t1 和 t2 都是运行一会儿就进入休眠状态（我们在 run() 方法中使用 sleep() 方法人为地让它休眠的），当两个个线程都从休眠中醒来进入就绪状态之后，线程调度程序就有机会调度其中的一个继续执行它，但是具体先调度 t1 还是先调度t2 却不一定。 Java 的线程调度机制会按照一定的线程调度策略选一个线程运行，但要注意的是线程调度机制选 t1 还是 t2 是不确定的，所以每次运行该程序有可能会产生不同的输出结果。



### 活动2：观看用 Runnable 接口创建线程的视频

点击折叠

如前所述，通过继承系统类 Thread 创建线程类的方法简单，但是有时候会不好用。 Java 只支持单一继承，假如一个类为了完成线程任务而继承了 Thread 类，那它就不能再继承其它类了，此时可用Runnable接口解决这个问题（还记得第3章接口中的介绍吗？Java用接口解决多重继承的问题）。下面的视频演示了用 Runnable 接口创建线程，之后启动线程。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid9-3.png)

**视频9-3：用 Runnable 接口创建线程**

\1. 在项目PrjThread中新建文件ThreadDemo2.java。

在Eclipse的“Package Explorer”窗口中右键单击项目PrjExcep下的src文件夹，然后弹出可得快捷菜单中选择new->file，打开“New File”对话框，键入文件名ThreadDemo2.java，然后确定。

\2. 编辑文件ThreadDemo2.java。

（1）创建线程类Ctest，代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.3.html?node=858292591&detailRecordId=1318913816&studyrecordId=1225624963&sectionRecordId=1229924178#)

```
class` `Ctest ``implements` `Runnable { ``// 声明 Ctest 类实现了 Runnable 接口` ` ``private` `String id; ``// 作为可运行对象的标识`` ``public` `Ctest(String str) { ``// 构造方法``  ``id = str;`` ``} ``// 构造方法，设置 id 的值`` ``public` `void` `run() { ``// 实现 Runnable 接口的 run() 方法``  ``for` `(``int` `i = ``0``; i < ``3``; i++) {``   ``for` `(``int` `j = ``0``; j < ``100000000``; j++); ``// 空循环,用来拖慢运行速度``   ``System.out.println(id + ``"在运行"``);``  ``}``  ``System.out.println(id + ``"已结束"``);`` ``}``}
```

（2）创建应用程序主类ThreadDemo1，代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.3.html?node=858292591&detailRecordId=1318913816&studyrecordId=1225624963&sectionRecordId=1229924178#)

```
class` `ThreadDemo2 {` ` ``public` `static` `void` `main( String args[] ) {``  ``Ctest ct1 = ``new` `Ctest(``"thread1"``); ``// 创建可运行对象 ct1``  ``Ctest ct2 = ``new` `Ctest(``"thread2"``); ``// 创建可运行对象 ct2``  ``Thread t1 = ``new` `Thread(ct1); ``// 把可运行对象 ct1 传递给 Thread 类的构造方法用以创建线程对象 t1``  ``Thread t2 = ``new` `Thread(ct2); ``// 把可运行对象 ct2 传递给 Thread 类的构造方法用以创建线程对象 t2``  ``t1.start(); ``// 启动线程 t1``  ``t2.start(); ``// 启动线程 t2`` ``}``}
```

\3. 多次运行程序，每次把运行结果保存到一个文件中，对比每次程序的运行结果，体会多线程程序的运行特点。

活动2的解析：本视频中创建的包

（1）通过继承系统类 Thread 创建线程类的方法简单，但是有时候会不好用。 Java 只支持单继承，假如一个类为了完成线程任务而继承了 Thread 类，那它就不能再继承其它类了，显然这使编程受到了很多限制。可以使用另外一种变通方法来解决这个问题：创建一个实现 Runnable 接口的类，然后创建该类的一个对象，再把这个对象传递给 Thread 类的构造方法去创建线程对象。

（2）我们称实现了 Runnable 接口的类为线程化的类，称实现了 Runnable 接口的类的实例为可运行的对象（the runnable object）。

（3）在线程化类的 run() 方法中编写线程任务代码，然后用它创建可运行对象，最后利用可运行对象去创建线程对象。



### Java线程调度机制将主线程与程序中其它线程同等对待

点击折叠

前面我们提到，每个 Java 程序在运行的时候，系统都会创建一个主线程，让这个主线程去运行 main() 方法的代码。这个主线程有与后来程序创建并启动的线程有和不同吗？事实上，它们是等同的，线程调度机制把主线程和程序中创建的其它线程是一样看待的。

下面的例子说明了这个情况。这个程序与前一个程序基本相同，只是在 main() 方法中也增加了一些程序代码，以便看到程序运行效果。

**例9-1** ThreadDemo1.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.3.html?node=858292591&detailRecordId=1318913816&studyrecordId=1225624963&sectionRecordId=1229924178#)

```
class` `testThread ``extends` `Thread {`` ``public` `testThread(String str) {``  ``super``(str);`` ``} ``// 调用父类的构造方法，创建名称为str的线程对象`` ``public` `void` `run() {``  ``for` `(``int` `i=``0``;i< ``3``;i++) {``   ``System.out.println(getName()+``"在运行"``);``   ``try` `{``    ``sleep(``2000``);``   ``} ``catch` `(InterruptedException e) {}``  ``}``  ``System.out.println(getName()+``"已结束"``);`` ``}``}` `class` `ThreadDemo1 {`` ``public` `static` `void` `main( String args[] ) {``  ``Thread thrd= Thread.currentThread();``  ``testThread t1=``new` `testThread(``"thread1"``);``  ``testThread t2=``new` `testThread(``"thread2"``);``  ``t1.start();``  ``t2.start();``  ``for` `(``int` `i=``0``;i< ``3``;i++) {``   ``System.out.println(thrd.getName()+``"在运行"``);``   ``try` `{``    ``Thread.sleep(``2000``);``   ``} ``catch` `(InterruptedException e) {}``  ``}``  ``System.out.println(thrd.getName()+``"已结束"``);`` ``}``}
```

**例9-1** 的运行结果：

多运行几遍程序，仔细观察运行结果，会发现程序每次都输出一系列字符串。但是每次字符串的输出次序可能不同。

下面是两次不同的运行结果的示例。

| main在运行 thread2在运行 thread1在运行 main在运行 thread1在运行 thread2在运行 thread2在运行 main在运行 thread1在运行 thread1已结束 thread2已结束 main已结束 | thread1在运行 thread2在运行 main在运行 thread1在运行 thread2在运行 main在运行 thread2在运行 main在运行 thread1在运行 main已结束 thread2已结束 thread1已结束 |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
|                                                              |                                                              |

**例9-1** 的程序分析：

这个程序说明了 Java 的线程调度机制是把主线程和程序中创建的其它线程等同看待，一起调度的。



### Runnable 接口与 Thread 类

Runnable 接口的定义是这样的：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.3.html?node=858292591&detailRecordId=1318913816&studyrecordId=1225624963&sectionRecordId=1229924178#)

```
package` `java.lang;` `public` `interface` `Runnable {` `  ``public` `void` `run( );` `}
```

从这个定义可以看到， Runnable 接口实际上只定义了 run() 方法，其它什么也没有。当某个对象具有 Runnable 接口，即表明它有 run() 方法，但也就仅此而已，不像从 Thread 继承得到的那些类，它不带有任何和线程有关的特性。所以当我们得到一个实现了 Runnable 接口的对象的时候仅仅说它是一个“可运行对象”，而不是说它是一个“线程对象”，因为它根本就不是一个线程对象。虽然可运行对象不具有线程相关的特性，但是由于它实现了 Runnable 接口，具有 run() 方法，从而我们可以从它产生一个线程对象。方法是建立一个单独的 Thread 对象，并把可运行对象传递给专门的 Thread 类的构造方法，就像我们在视频2中看到的那样。

前面提到，Thread 类的对象以及它的任何子类对象都是一个线程，我们创建自己的线程的最简单的做法是从 Java.lang.Thread 类继承得到线程子类。事实上， Thread 类也是实现了 Runnable 接口的类，它的 run() 方法就是 Runnable 接口的 run() 方法的实现。 Thread 类的定义是这样的：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.3.html?node=858292591&detailRecordId=1318913816&studyrecordId=1225624963&sectionRecordId=1229924178#)

```
package` `java.lang;` `public` `class` `Thread ``implements` `Runnable {` `  ``public` `Thread( );` `  ``public` `Thread(Runnable target);` `  ``public` `Thread(ThreadGroup group, Runnable target);` `  ``public` `Thread(String name);` `  ``public` `Thread(ThreadGroup group, String name);` `  ``public` `Thread(Runnable target, String name);` `  ``public` `Thread(ThreadGroup group, Runnable target, String name);` `  ``public` `Thread(ThreadGroup group, Runnable target, String name,` `         ``long` `stackSize);` `  ``public` `void` `start( );` `  ``public` `void` `run( );` `// some other codes``}
```

这里只是列出了 Thread 类定义的一部分代码。重点是为了说明 Thread 类实际上也是实现了 Runnable 接口的类



### run() 与 main() 的比较

在 Runnable 接口中定义的惟一的方法是 run()，在线程执行时调用。线程退出 run() 之后，就已经死亡，无法重新启动或复用。不管是正常退出还是由于未捕获异常退出，情况都是如此。在效果上，线程的 run() 方法与 Java 应用程序的 main() 方法作用相同：就是代码的初始入口点。在应用程序中， mian() 控制程序的主流程，在线程中， run() 控制线程任务的处理流程。

从本质上来说，对于一个新创建的线程， run() 方法可以被看成是 main()方法：如同程序是从 main() 方法开始运行一样，新线程就是从其 run() 方法开始运行的。但是 main() 方法从 argv 来获取它的参数（argv 一般是通过命令行来设定的），而新创建的线程是用编程的方式从原始线程获取它的参数的。因此，我们可以通过构造方法、静态实例变量或者程序员设计的其他技术来获得这些参数。

## **9.4 线程的生命周期和线程调度**

### 线程的生命周期

点击折叠

一个线程从创建到工作到死亡的过程称为线程的生命周期。线程生命周期共有五个状态：新建状态、就绪状态、运行状态、阻塞状态和死亡状态。

**（1）新建状态**

新建状态是指创建了一个线程，大它还没有启动。处于新建状态的线程对象，只能够被启动或者终止。例如，以下代码使线程 myThread 处于新建状态：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.4.html?node=858292592&detailRecordId=1318913817&studyrecordId=1225624963&sectionRecordId=1229924177#)

```
Thread myThread = ``new` `Thread();
```

**（2）就绪状态**

就绪状态是当前线程处于新建状态后，调用了 start() 方法，线程就处于就绪状态。就绪状态的线程具备了运行条件，但尚未进入运行状态。处于就绪状态的线程可有多个，这些就绪状态的线程将在就绪队列中排队，等待 CPU 资源。就绪状态的线程通过线程调度获得 CPU 资源变成运行状态。例如，以下代码使线程 myThread 进入就绪状态：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.4.html?node=858292592&detailRecordId=1318913817&studyrecordId=1225624963&sectionRecordId=1229924177#)

```
myThread.start();
```

**（3）运行状态**

运行状态是某个就绪状态的线程获得 CPU 资源，正在运行。如果有更高优先级的线程进入就绪状态，则该线程将被迫放弃对 CPU 的控制权，进入就绪状态。使用 yield() 方法可以使线程主动放弃 CPU。线程也可能由于执行结束或执行 stop() 方法进入死亡状态。每个线程对象都有一个 run() 方法，当线程对象开始执行时，系统就调用该对象的　run() 方法。

**（4）阻塞状态**

阻塞状态是正在运行的线程遇到某个特殊情况。例如，延迟、挂起、等待 I/O 操作完成等。进入阻塞状态的线程让出 CPU，并暂时停止自己的执行。线程进入阻塞状态后，就一直等待，知道引起阻塞的原因被消除，线程又转入就绪状态，重新进入就绪队列排队。当线程再次变成运行状态时，将从原来暂停处开始继续运行。

线程从阻塞状态恢复到就绪状态有三种途径：自动恢复（例如：　sleep　时间到、 I/O 操作完成）；用　resume() 方法恢复；用　notify()　或　notifyAll()　方法通知恢复。也可能因为别的线程强制某个处于阻塞状态的线程终止，该线程就从阻塞状态进入死亡状态。

**（5）死亡状态**

死亡状态是指线程不再具有继续运行的能力，也不能再转到其他状态。一般有两种情况使一个线程终止，进入死亡状态。一是线程完成了全部应用任务，即执行完　run() 方法的最后一条语句。另一种是线程被提前强制性终止。

线程的生命周期及状态转换如图9.1所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/q1.png)



### 线程调度与优先级

Java 的线程调度机制负责调度线程。 Java 的线程调度策略采用抢占式调度，优先级高的线程比优先级低的线程优先执行。在优先级相同的情况下，就按“先到先服务”的原则调度线程。 Java 有专门的调度器，它的任务是使优先级高的线程能始终运行，一旦时间片有空闲，则使具有同等优先级的线程以轮流的方式顺序使用时间片。只有当高级别的线程死亡时（除非用 sleep(int millsecond) 或 wait() 方法让出 CPU 资源），低级别线程才有机会获得 CPU 资源。

线程的优先级用数值表示，数值越大优先级越高（范围1～10）。每个线程根据继承性自动从父线程获得一个线程的优先级，也可在程序中重新设置线程的优先级。对于任务较紧急的重要线程，可安排较高的优先级。相反，则给一个较低的优先级。



### 在程序中控制线程

Thread 类的常见成员方法：

start()，启动线程。

sleep()，让线程休眠一段时间。

suspend()，挂起线程。

resume()，恢复挂起的线程。

stop()，停止线程，推出 run() 方法。



### 活动1：观看关于控制线程的常用方法的视频

下面的视频演示了控制线程的常用方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid9-4.png)

**视频9-4：控制线程的常用方法**

\1. 在项目PrjThread中创建类MyThread。MyThread类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.4.html?node=858292592&detailRecordId=1318913817&studyrecordId=1225624963&sectionRecordId=1229924177#)

```
package` `com.buptnu;` `public` `class` `MyThread ``extends` `Thread {`` ``boolean` `flg = ``false``; ``// 是否休眠标志`` ` ` ``void` `setSleepFlag(``boolean` `flg) {``  ``this``.flg = flg;`` ``}`` ` ` ``public` `void` `run() { ``// 实现Runnable接口的run()方法``  ``while``(``true``) { ``// 在控制台不断输出字符串``   ``if` `(flg == ``false``) ``    ``System.out.println(``"hello."``);``   ``else` `{``    ``try` `{``     ``this``.sleep(``3000``);``     ``flg = ``false``;``    ``} ``catch` `(InterruptedException ex) {}``   ``}``  ``}`` ``}` `}
```

\2. 在项目PrjThread中创建类MyThread。MyThread类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.4.html?node=858292592&detailRecordId=1318913817&studyrecordId=1225624963&sectionRecordId=1229924177#)

```
package` `com.buptnu;``import` `javax.swing.*;``import` `java.awt.*; ``import` `java.awt.event.*;` `public` `class` `MyJFrame ``extends` `JFrame ``implements` `ActionListener {`` ``Container conPane = ``null``;`` ``MyThread myThread;`` ``JButton btnStart, btnSleep, btnSuspend, btnResume, btnStop;` ` ``// 构造方法 ` ` ``public` `MyJFrame(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `FlowLayout());``  ``btnStart = ``new` `JButton(``"Start"``);``  ``btnSleep = ``new` `JButton(``"Sleep"``);``  ``btnSuspend = ``new` `JButton(``"Suspend"``);``  ``btnResume = ``new` `JButton(``"Resume"``);``  ``btnStop = ``new` `JButton(``"Stop"``);``  ``btnStart.addActionListener(``this``);``  ``btnSleep.addActionListener(``this``);``  ``btnSuspend.addActionListener(``this``);``  ``btnResume.addActionListener(``this``);``  ``btnStop.addActionListener(``this``);``  ``conPane.add(btnStart);``  ``conPane.add(btnSleep);``  ``conPane.add(btnSuspend);``  ``conPane.add(btnResume);``  ``conPane.add(btnStop);``  ``// 创建线程对象 ``  ``myThread = ``new` `MyThread();``  ``// 关闭窗口时退出程序 ``  ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ` ` ``@Override`` ``public` `void` `actionPerformed(ActionEvent e) {``  ``// TODO Auto-generated method stub``  ``if` `(e.getSource() == btnStart) {``   ``myThread.start();``   ``//System.out.println("a");``  ``} ``else` `if` `(e.getSource() == btnSleep) {``   ``/* ``    ``* myThread.sleep(3000); 这样不行``    ``* sleep() 方法只能强制当前线程休眠，所以``    ``* AWT 线程不能强制 myThread 线程休眠``    ``* 要让 myThread 线程休眠，可以通过向 myThread 线程``    ``* 发送休眠请求的方法``    ``*/``    ``myThread.setSleepFlag(``true``);``    ` `   ``//System.out.println("b");``  ``} ``else` `if` `(e.getSource() == btnSuspend) {``   ``myThread.suspend();``   ``//System.out.println("c");``  ``} ``else` `if` `(e.getSource() == btnResume) {``   ``myThread.resume();``   ``//System.out.println("d");``  ``} ``else` `if` `(e.getSource() == btnStop) {``   ``myThread.stop();``   ``//System.out.println("e");``  ``}`` ``}``}
```

\3. 在项目PrjThread中创建主类ThreadDemo3。ThreadDemo3类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.4.html?node=858292592&detailRecordId=1318913817&studyrecordId=1225624963&sectionRecordId=1229924177#)

```
package` `com.buptnu;``public` `class` `ThreadDemo3 {`` ``public` `static` `void` `main(String[] args) {``  ``// TODO Auto-generated method stub``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrame mw =``   ``new` `MyJFrame(str1, ``300``, ``200``);``  ``mw.setVisible(``true``);`` ``}``}
```

\4. 运行程序。操作程序的图形界面，观察Eclipse的“Console”窗口的输出。

活动1的解析：本视频中创建的包

（1）本例中用到了程序的图形界面，目前不用纠结此细节，下一章中将详述。

（2）本例中用到了一些“过时”的方法，及新版本的Java不建议用的方法。不用拘泥和受限于此。本例用这些方法让你了解线程的各个状态而已。



### 动手实践

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/9.4.jpg)

**线程的生命周期及状态转换**



## **9.5 守护线程与非守护线程**

### 主体内容

所谓“守护线程(daemon thread)”是指，只要程序还在运行，它就应该在后台提供某种公共服务的线程，但是守护线程不属于程序的核心部分。因此，当所有非守护线程都运行结束的时候，程序也结束了。相反，只要还有非守护线程在运行，程序就不能结束。

Java 程序运行的时候，系统会创建多个线程，有些是守护线程，有些是非守护线程。例如，我们所熟悉的Java垃圾回收线程就是一个典型的守护线程，而运行 main( ) 的线程就属于非守护线程。不要误认为由虚拟机（virtual machine）在内部创建的线程都是守护线程，而非守护线程都是用户创建的。事实上， JVM 创建的线程有些就不是守护线程，例如提供图形用户界面的应用程序隐式生成和使用另一个线程： AWT 事件线程。 AWT 事件线程适用于 AWT 和 Swing 图形用户界面，负责绘制简单组件和进行事件通知。AWT 事件线程就不是守护程序线程（这也是通常使用 System.exit() 结束 AWT 和 Swing 应用程序的原因）。用户创建的线程默认情况下是非守护线程，但也可以被设置成守护线程。事实上，“守护线程”和“非守护线程”本质上并没有什么区别，只是JVM 对其控制的方式有所不同而已。主要表现在：第一，守护线程一般是在后台提供某种服务，而非程序核心部分的线程，所以它的优先级最低。这意味着 JVM 会尽量先调度那些非守护线程运行。第二，程序中所有非守护线程都已结束运行时，程序就结束。程序中除了主线程之外可能还有其它的非守护线程， Java 线程调度机制会把主线程和其它线程一起调度，所以即便主线程的代码都执行完了，程序也未必会结束（例9-1就可以说明这个问题），必须等所有非守护线程都运行结束后，程序才真正结束。这意味着一个程序的任何非守护线程的执行代码都要执行完程序才结束。而守护线程的执行代码不一定都要执行完。当程序中所有非守护线程都已结束运行时，即使守护线程的run()方法还有需要执行的语句，守护线程也会立刻结束运行。正是因为这个原因，守护线程通常用于做一些不是很严格的工作，当线程随时结束时不会产生什么不良后果。

可以在程序中用代码设置线程的守护模式。setDaemon(boolean on) 方法可以方便的设置线程的Daemon模式，true为Daemon模式，false为User模式。setDaemon(boolean on) 方法必须在线程启动之前调用，当线程正在运行时调用会产生异常。isDaemon() 方法将测试该线程是否为守护线程。

值得一提的是，当你在一个守护线程中产生了其他线程，那么这些新产生的线程不用设置Daemon属性，都将是守护线程。对于用户线程也是同样的，由一个非守护线程产生的线程默认都是非守护线程。在线程启动前可以用 setDaemon() 更改线程模式。

下面这个例子说明了如何把一个线程设置为守护线程，同时也说明了守护线程和非守护线程的区别以及一旦所有非守护线程结束程序就结束，即便非守护线程的执行代码还没执行完。

**例9-2** MyThread.java

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.5.html?node=858292593&detailRecordId=1318913818&studyrecordId=1225624963&sectionRecordId=1229924176#)

```
import` `java.io.IOException;` ` ``// 守护线程在没有非守护线程可服务时自动离开`` ` `public` `class` `MyThread ``extends` `Thread {``  ` `  ``public` `MyThread() {``  ``}``  ` `   ``// 线程的run方法，它将和其他线程同时运行``   ` `  ``public` `void` `run() {``    ``for``(``int` `i = ``1``; i <= ``10``; i++){``      ``try` `{``        ``Thread.sleep(``1000``);``      ``} ``catch` `(InterruptedException ex) {``        ``ex.printStackTrace();``      ``}``      ``System.out.println(i);``    ``}``    ``System.out.println(``"Run"` `+ ``"结束。"``);``  ``}``  ` `  ``public` `static` `void` `main(String [] args){``   ``MyThread test = ``new` `MyThread();``    ``test.setDaemon(``true``);``    ``test.start();``    ``System.out.println(``"isDaemon = "` `+ test.isDaemon());``    ``// isDaemon() 功能是判断是否是守护线程，如果是则返回 true，否则返回 false。``    ``try` `{``      ``System.in.read(); ``      ``// 接受输入，使程序在此停顿，一旦接收到用户输入，``      ``// main线程结束，守护线程自动结束``    ``} ``catch` `(IOException ex) {``      ``ex.printStackTrace();``    ``}``    ``System.out.println(``"Main"` `+ ``"结束。"``);``  ``}``}
```

**例9-2** 的运行结果：

（1）启动程序运行，看着程序运行，什么都不做，会看到：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/q2.png)

此时表明守护线程的 run() 方法已经执行完了。但是 main() 并没有执行完，它还在等待用户输入数据。这是任意输入一些数据，然后按回车键确认，就会看到如下结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/q3.png)

这个操作展示了 Java 的线程调度器先调度主线程运行，当 main() 执行到 “System.in.read();” 的时候，由于等待 I/O 而进入阻塞状态，此时 CPU 空闲出来，继而 Java 的线程调度器调度守护线程执行，也就是执行 run()。由于我们一直没有输入数据，所以主线程一直处于阻塞状态，这样 run() 的代码有机会执行结束。等 run() 的代码都执行完之后，我们再输入数据，主线程完成 I/O，从阻塞状态转为就绪状态。 Java 的线程调度器发现有就绪线程之后就去调度它执行，这样主线称继续执行。主线程执行完之后，程序结束。

也可以不等 run() 执行完就输入数据。这样当 run() 还在执行的时候，主线程就从阻塞状态变为就绪状态了，由于主线程是非守护线程，非守护线程的优先级高于守护线程，所以此时即便 run() 正在占用 CPU，线程调度器也会中断它的执行，而把 CPU 资源给主线程，让主线程运行。主线程运行结束之后，由于程序中没有其它守护线程了，所以程序立即结束，就算 run() 中还有代码没执行，程序也结束。 run() 中尚未来得及执行的代码也不会再执行了。看下面的执行界面就明白了。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/q4.png)

## **9.6 线程同步**

### 主体内容

前面我们讲的线程的程序都是独立的，而且是异步执行，也就是说每个线程都包含了运行时所需要的数据和方法，不需要外部资源，也不用关心其他线程的状态和行为。但是，有时一些同时运行的线程序要共享数据，这时，线程必须考虑其他线程的状态和行为，以解决资源共享问题。

下面我们通过生产者——消费者模型，来说明线程同步问题。

生产者——消费者模型：在这个模型中，有两类线程，一类是使用某种资源的线程称为消费者，另一类是产生或释放某种资源的线程称为生产者。还有一个对象，用于生产者和消费者之间交互数据，称为共享资源对象。

我们这里，生产者生成10个整数，存储到一个共享对象中，并把它们打印出来。每生成一个数就随机休眠0到100毫秒，然后重复生成整数。一旦有整数可以从共享对象中得到，消费者就尽可能地消费这10个数，也就是把它们取出来，并打印结果。

**例9-3** 共享资源对象没有同步化的情况

这个程序由四部分组成，第一部分是

**（1）共享资源对象**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.6.html?node=858292594&detailRecordId=1318913821&studyrecordId=1225624963&sectionRecordId=1229924175#)

```
class` `Share { ``// 共享资源对象` ` ``private` `int` `contents;`` ``public` `int` `get() {``  ``return` `contents;`` ``}`` ``public` `void` `put(``int` `value) {``  ``contents=value;`` ``}``}
```

程序分析：

这是一个自定义类，类名是Share，它是创建共享资源对象的模板。它有一个私有数据成员contents，用来存储一个整数。生产者产生的整数将被保存在这个成员变量中，而消费者消费数据就是取得这个变量的值。它还有两个成员方法，方法get()用来的到数据成员的值；方法put()用来设置数据成员的值。

**（2）生产者程序**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.6.html?node=858292594&detailRecordId=1318913821&studyrecordId=1225624963&sectionRecordId=1229924175#)

```
class` `Producer ``extends` `Thread { ``// 生产者程序` ` ``private` `Share shared;`` ``private` `int` `number;`` ``public` `Producer(Share s,``int` `number) {``  ``shared=s;``  ``this``.number=number;`` ``}`` ``public` `void` `run() {``  ``for` `(``int` `i=``0``;i< ``10``;i++) {``   ``shared.put(i);``   ``System.out.println(``"生产者"``+``this``.number+``" 输出的数据为："``+i);``   ``try` `{``    ``sleep((``int``)(Math.random()*``100``));``   ``} ``catch` `(InterruptedException e) {}``  ``}`` ``}``}
```

程序分析：

第二部分是生产者程序，在这部分程序中定义了一个类，就是Producer。类Producer继承自线程类Thread，它的实例化对象是一个线程。它有两个数据成员。第一个数据成员是对象变量shared，用来引用共享成员对象。第二个数据成员是整型变量number，用来标示当前生产者对象的序号。类Producer的构造方法用于给生产者对象做一个标号，并且把共享资源对象赋给数据成员shared。在这个类中覆盖了父类的run()方法。在run()方法中，使用循环，给共享对象的数据成员设置从1到10的整数值。每设置一个整数，间隔0到100毫秒之间的一个随机时间，再设置下一个值。

**（3）**消费者程序

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.6.html?node=858292594&detailRecordId=1318913821&studyrecordId=1225624963&sectionRecordId=1229924175#)

```
class` `Consumer ``extends` `Thread { ``// 消费者程序`` ``private` `Share shared;`` ``private` `int` `number;`` ``public` `Consumer(Share s,``int` `number) {``  ``shared=s;``  ``this``.number=number;`` ``}`` ``public` `void` `run() {``  ``int` `value=``0``;``  ``for` `(``int` `i=``0``;i< ``10``;i++) {``   ``value=shared.get();``   ``System.out.println(``"消费者"``+``this``.number+``" 得到的数据为："``+value);``   ``try` `{``    ``sleep((``int``)(Math.random()*``100``));``   ``} ``catch` `(InterruptedException e) {}``  ``}`` ``}``}
```

程序分析:

第三部分是消费者程序。类Consumer也是一个线程类。消费者也有两个数据成员，对象变量shared用于引用共享资源对象，整型变量number用来标识当前消费者对象的序号。在构造方法中给消费者对象做一个标号，并且实现对共享资源对象的引用。

消费者类也覆盖了父类的run()方法。在run()方法中读取共享资源对象的数据成员的当前值，然后输出。

**（4）主程序**

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.6.html?node=858292594&detailRecordId=1318913821&studyrecordId=1225624963&sectionRecordId=1229924175#)

```
public` `class` `PCTest { ``//主程序` ` ``public` `static` `void` `main( String args[] ) {``  ``Share s=``new` `Share();``  ``Producer p=``new` `Producer(s,``1``);``  ``Consumer c=``new` `Consumer(s,``1``);``  ``p.start();``  ``c.start();`` ``}``}
```

程序分析：

第四部分是主程序，在main()方法中，创建了共享资源对象s，然后又创建了一个生产者对象p和一个消费者对象s。最后分别调用p和s的start()方法启动这两个线程。

**例9-3** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/q5.png)

多运行几次，你会看到每次都会有不同的结果。生产者线程产生一个整数，放到共享对象中，然后休眠一会儿，再产生下一个整数。消费者线程从共享资源对象获取一个消费者放好的证书，然后休眠一会儿，然后再取下一个数据。由于生产者线程和消费者线程是相对独立的，它们休眠时间随机，且是被线程调度机制调度的，因此生产者和消费者之间利用共享对象传递数据的方式并不是“放一个->取一个->放一个->取一个……”的方式。

**例9-4** 共享资源对象同步化的情况

我们的原意是让生产者生产一个数据，消费者消费一个数据，然后生产者再生产一个数据，消费者再消费一个数据。要想实现这样的情况，就必须实现资源的互斥共享。Java语言是通过互斥锁来实现互斥共享的。

我们只需修改共享资源对象这部分程序即可。

把共享资源对象修改如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.6.html?node=858292594&detailRecordId=1318913821&studyrecordId=1225624963&sectionRecordId=1229924175#)

```
class` `Share { ``// 共享资源对象` ` ``private` `int` `contents;`` ``private` `boolean` `available=``false``;`` ``public` `synchronized` `int` `get() {``  ``while` `(available==``false``) {``   ``try` `{``    ``wait();``   ``} ``catch` `(InterruptedException e) {}``  ``}``  ``available=``false``;``  ``notifyAll();``  ``return` `contents;`` ``}`` ``public` `synchronized` `void` `put(``int` `value) {``  ``while` `(available==``true``) {``   ``try` `{``    ``wait();``   ``} ``catch` `(InterruptedException e) {}``  ``}``  ``contents=value;``  ``available=``true``;``  ``notifyAll();`` ``}``}
```

程序分析：

首先增加一个数据成员，就是布尔变量available。available用来标记当前生产者生产的内容是否被取出。当available的值为false时，表明生产者没有产生新的数据，这时消费者不能从共享资源对象中读取数据。当available的值为true时，表明生产者已经产生新的数据，这时消费者才能读取。

其次，对成员方法put()做了修改。在方法put()的方法体中，使用while循环，判断布尔变量available的值是否为true，如果是则表明消费者还没有把上一次产生的数据取走，所以就调用wait()方法使当前线程进入休眠，直到收到notifyAll()方法的通知，线程才会苏醒。如果available的值不是true，则表明消费者已经把上一次产生的数据取走，这时可以产生新的数据了。所以就把生产者新产生的整数值存放到变量contents当中，然后把avaliable的值设置为true，再调用notifyAll()方法唤醒其它等待执行的线程。

最后，按照相似的办法，对成员方法get()也进行了修改。只不过在方法get()中，avaliable的值为false才把当前线程置为休眠状态，avaliable的值为true才读取共享对象中的整数。

还有一点要注意的就是方法put()和方法get()都要用关键字synchronized修饰，已表明它们都是同步化方法。经过修改之后，程序的运行结果如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/q6.png)

这样就实现了生产者线程产生数据和消费者线程消费数据的同步化。

## **9.7 动手项目**

### 动手项目9-1：开发一个多线程程序

**所需时间：**30分钟。

**项目目标：**开发一个多线程程序。

**过程描述：**开发一个多线程程序。

（1）启动Eclipse。

（2）新建一个Java项目PrjThread

（3）在项目PrjThread中创建一个按照指定次数打印某个指定字符的线程化类PrintChar，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.7.html?node=858292595&detailRecordId=1318913822&studyrecordId=1225624963&sectionRecordId=1229924174#)

```
//The task for printing a character a specified number of times` `class` `PrintChar ``implements` `Runnable {`` ``private` `char` `charToPrint; ``// The character to print`` ``private` `int` `times; ``// The number of times to repeat`` ``/** Construct a task with specified character and number of``  ``* times to print the character``  ``*/`` ``public` `PrintChar(``char` `c, ``int` `t) {``  ``charToPrint = c;``  ``times = t;`` ``}`` ``@Override` `/** Override the run() method to tell the system``  ``* what task to perform``  ``*/`` ``public` `void` `run() {``  ``for` `(``int` `i = ``0``; i < times; i++) {``   ``System.out.print(charToPrint);``  ``}`` ``}``}
```

（4）在项目PrjThread中创建一个打印从1到指定整数的线程化类PrintNum，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.7.html?node=858292595&detailRecordId=1318913822&studyrecordId=1225624963&sectionRecordId=1229924174#)

```
// The task class for printing numbers from 1 to n for a given n` `class` `PrintNum ``implements` `Runnable {`` ``private` `int` `lastNum;`` ``/** Construct a task for printing 1, 2, ..., n */`` ``public` `PrintNum(``int` `n) {``  ``lastNum = n;`` ``}`` ``@Override` `/** Tell the thread how to run */`` ``public` `void` `run() {``  ``for` `(``int` `i = ``1``; i <= lastNum; i++) {``   ``System.out.print(``" "` `+ i);``  ``}`` ``}``}
```

（5）创建主类AnimalApp，如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java9.7.html?node=858292595&detailRecordId=1318913822&studyrecordId=1225624963&sectionRecordId=1229924174#)

```
public` `class` `TaskThreadDemo {` ` ``public` `static` `void` `main(String[] args) {``  ``// Create tasks``  ``Runnable printA = ``new` `PrintChar(``'a'``, ``10``);``  ``Runnable printB = ``new` `PrintChar(``'b'``, ``10``);``  ``Runnable print10 = ``new` `PrintNum(``10``);``  ``// Create threads``  ``Thread thread1 = ``new` `Thread(printA);``  ``Thread thread2 = ``new` `Thread(printB);``  ``Thread thread3 = ``new` `Thread(print10);``  ``// Start threads``  ``thread1.start();``  ``thread2.start();``  ``thread3.start();`` ``}``}
```

（6）运行程序，多运行几次，多线程的执行情况。



## **9.8 小结**

### 主体内容

通俗地讲，线程是一个代码执行流，通过使用线程可以使程序看起来似乎同时做几件事。

在支持线程的系统中，每个进程中可以有多个线程，每个线程拥有一个独立的代码执行序列，多个线程共享同一个进程的资源。有专门的线程调度机制负责管理多个线程的执行。线程调度机制可以放到操作系统一级，也可以放到应用程序一级。采用那种机制就看操作系统设计者和程序员怎么决策了。怎么决策视实际要解决的问题的需要而定。支持线程的系统在一定程度上减轻了进程资源耗费的问题。

当 Java 程序启动时，系统就为它创建好一个线程，用这个线程执行 main() 方法中的代码序列。这个系统创建好的线程叫主线程。

除了主线程， JVM 还创建了其它线程，不过我们通常都看不到它们：例如，与垃圾收集、对象终止和其它 JVM 内事务处理任务相关的线程，等等。另外，其它工具也创建线程，如 AWT或 Swing UI 工具箱、servlet 容器等。

JVM 创建的线程称为系统线程，我们自己在程序中用代码创建的线程称为用户线程。

在 Java 中，线程被表示为 Java.lang.Thread 类的一个实例。所以创建一个线程最简单的做法是从 Java.lang.Thread 类继承，这个类已经具有了创建和运行线程所必要的架构。 Thread 类最重要的方法是 run()。一个线程要完成一个应用任务，为了完成该应用任务而编写的代码要放到 run() 方法中，这也就意味着在 Thread 的子类中要重载 run() 方法。

通过继承系统类 Thread 创建线程类的方法简单，但是有时候会不好用。 Java 只支持单继承，假如一个类为了完成线程任务而继承了 Thread 类，那它就不能再继承其它类了，显然这使编程受到了很多限制。可以使用另外一种变通方法来解决这个问题：创建一个实现 Runnable 接口的类，然后创建该类的一个对象，再把这个对象传递给 Thread 类的构造方法去创建线程对象。

启动线程的方法是调用这线程对象的 start() 方法，而不是调用线程对象的run()方法。

线程调度机制把主线程和程序中创建的其它线程是一样看待的。

一个线程从创建到工作到死亡的过程称为线程的生命周期。线程生命周期共有五个状态：新建状态、就绪状态、运行状态、阻塞状态和死亡状态。

Java 的线程调度机制负责调度线程。 Java 的线程调度策略采用抢占式调度，优先级高的线程比优先级低的线程优先执行。在优先级相同的情况下，就按“先到先服务”的原则调度线程。 Java 有专门的调度器，它的任务是使优先级高的线程能始终运行，一旦时间片有空闲，则使具有同等优先级的线程以轮流的方式顺序使用时间片。只有当高级别的线程死亡时（除非用 sleep(int millsecond) 或 wait() 方法让出 CPU 资源），低级别线程才有机会获得 CPU 资源。



## **9.9 思考题**

## 主体内容

**1.什么是线程？使用多线程有哪些好处？又会带来哪些问题？**【隐藏】

**答：**通俗地讲，线程是一个代码执行流。

使用多线程的好处是：（1）多线程为多个代码执行流并发执行提供了可能。（2）多线程程序比多进程程序降低了资源占用要求。

使用多线程也会对系统产生一些不利影响：（1）线程需要占用内存，线程越多，内存占用越多。（2）线程过多，会消耗大量CPU时间来跟踪线程。（3）必须考虑多线程同时访问共享资源的问题，如果没有协调好，就会产生令人意想不到的问题，例如死锁和资源竞争等。（4）因为同一个任务的所有线程都共享相同的地址空间，并共享任务的全局变量，所以程序也必须考虑多线程同时访问的全局变量问题。

**2.进程和线程之间的关系是怎样的？**【隐藏】

**答：**在支持线程的系统中，每个进程中可以有多个线程，每个线程拥有一个独立的代码执行序列，多个线程共享同一个进程的资源。有专门的线程调度机制负责管理多个线程的执行。线程调度机制可以放到操作系统一级，也可以放到应用程序一级。采用那种机制就看操作系统设计者和程序员怎么决策了。怎么决策视实际要解决的问题的需要而定。支持线程的系统在一定程度上减轻了进程资源耗费的问题

**3.Runnable 接口中定义的run() 方法与Application程序入口 main() 方法有哪些相近之处？**【隐藏】

**答：**在 Runnable 接口中定义的惟一的方法是 run()，在线程执行时调用。线程退出 run() 之后，就已经死亡，无法重新启动或复用。不管是正常退出还是由于未捕获异常退出，情况都是如此。在效果上，线程的 run() 方法与 Java 应用程序的 main() 方法作用相同：就是代码的初始入口点。在应用程序中， mian() 控制程序的主流程，在线程中， run() 控制线程任务的处理流程。

从本质上来说，对于一个新创建的线程， run() 方法可以被看成是 main()方法：如同程序是从 main() 方法开始运行一样，新线程就是从其 run() 方法开始运行的。但是 main() 方法从 argv 来获取它的参数（argv 一般是通过命令行来设定的），而新创建的线程是用编程的方式从原始线程获取它的参数的。因此，我们可以通过构造方法、静态实例变量或者程序员设计的其他技术来获得这些参数。

## **9.10 自测练习**

## 【课后练习】

1. 以下哪个方法用于定义线程的执行体？（） 

   （A）start( )   （B）init( )   （C）run( )  （D）main( )

   2. 下面关于进程、线程的说法错误的是（）。

       （A）进程是程序的一次动态执行过程。一个进程在其执行过程中，可以产生多个线程——多线程，形成多条执行线索。   （B）线程是比进程更小的执行单位，是在一个进程中独立的控制流，即程序内部的控制流。线程本身不能自动运行，栖身于某个进程之中，由进程启动执行。   （C）对于单处理器系统，多个线程分时间片获取CPU或其他系统资源来运行。对于多处理器系统，线程可以分配到多个处理器中，从而真正的并发执行多任务。  （D）线程可以提高资源利用率，所以程序中应该尽可能多地创建线程。

      3. 下列方法中可以用来创建一个新线程的是（）。 

         （A）实现java.lang.Runnable接口并重写start()方法   （B）实现java.lang.Runnable接口并重写run()方法   （C）实现java.lang.Thread类并重写run()方法  （D）实现java.lang.Thread类并重写start()方法

         4. 下列关于线程优先级的说法中，正确的是（）。 

            （A）线程的优先级是不能改变的   （B）线程的优先级是在创建线程时设置的   （C）在创建线程后的任何时候都可以设置  （D）以上多不对

            5. 下列说法中，错误的一项是（）。 

               （A）线程一旦创建，则立即自动执行   （B）线程创建后需要调用start()方法，将线程置于可运行状态   （C）调用线程的start()方法后，线程也不一定立即执行  （D）线程处于可运行状态，意味着它可以被调度

## **第10章 图形用户界面**

## **10.1 Java图形用户界面编程概述**

### 事件与事件驱动工作方式

事件泛指由用户或系统触发的一个特定操作。例如：用鼠标单击命令按钮，将触发一个按钮的Click事件；用鼠标选择一个菜单项，会产生一个菜单项的选择事件，等等。事件驱动工作方式是指，程序启动后，执行一系列初始化操作，然后处于等待状态。当用户或系统触发某个事件之后，程序马上就去执行与该事件对应的过程。待事件过程执行完毕后，系统又处于等待某事件发生的状态。程序的这种工作方式称为事件驱动工作方式。

具有图形界面的Java程序使用事件驱动工作方式。编写具有图形用于界面的 Java 程序时不仅要创建程序的图形界面，还要编写相应的事件处理代码，这样程序才能响应用户的操作。



### GUI库

图形用户界面常简称为GUI。Java 通过提供 GUI 库提供对图形用户界面编程的支持， GUI 库的代码提供了这样一些基本功能：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 创建用户界面的“控件”或组件，如滚动条、按钮和标签等。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 通过把GUI事件（例如单击按钮）和程序程序员编写的事件处理代码关联起来，可以控制组件的动作 。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 支持对屏幕上的组件进行分组和布局。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 支持访问窗口管理器，指定某个窗口作为输入焦点，读取JPEG和其它影像文件，以及进行打印等。



### AWT和Swing

当前版本的 Java 提供了两个用于 GUI 编程的系统库，一个是 AWT，一个是 Swing。java.awt 包是 Java 早期版本提供的用于 GUI 编程的包。现在仍然提供。 Java 的后来的版本除了提供 java.awt 包之外，还提供了另一个用于 GUI 编程的包—— java.Swing。早期的时候都是用 AWT 写 GUI 程序，现在大多是情况下是用 Swing 编写 GUI 程序，有时也需要把 AWT 和 Swing 结合使用。

AWT 处理用户界面元素的方法是把这些元素的创建和元素行为的处理委托给程序运行时的具体的目标平台上的本地 GUI 工具进行处理，比如假定你在一个窗口中放置了一个文本框，那么 AWT 会把它映射为底层平台的一个对等的文本框取去处理文本输入。编写这类 AWT 程序的想法是你只需要指定界面元素的位置和行为，而 Java 运行时系统会去创建真正进行处理的对等实体。这样，从理论上说，结果程序能运行在任何平台，外观同目标平台一致。（普通 Java 程序的字节代码在每个平台上都是相同的，但 Java 运行时库的代码对于每个平台却是专用的，这样 Java 运行时库去创建 GUI 元素的对等实体是可行的。）

Swing 采用了另一种工作方式。在 Swing 中，用户界面元素，如按钮、菜单等，是绘制到空白窗口上，对等体只需要构造和绘制窗口。Swing 对底层的依赖相对小一些。所以称为轻量级的 GUI 编程组件。

Swing 并没有完全替代 AWT。 Swing 只是提供了更好的用户界面组件而已。 AWT 的基本体系结构，尤其是事件处理模型，从 java 1.1 版后并没有改变。Swing 仍然使用 1.1 版本的事件处理模型。也就是说， Swing 在事件处理时仍然用 AWT 的事件处理模型。

AWT和Swing的类层次结构如图10.1所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_1.png)

**图10.1 AWT和Swing的类层次结构**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 使用 Swing 编写程序的图形界面要引入两个程序包

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) java.swing，包含Swing的基本类



### 组件、容器和布局管理器

组件是构成图形界面的基本元素，用户可以直接操作组件，例如按钮，滚动条等都是组件。容器是图形界面的复合元素，一个容器可以容纳多个组件，使这些组件成为一个整体。容器本身也是一个组件，具有组件的所有性质，另外还具有容纳其它组件的功能。

Java 系统类库中定义了很多预定义的组件和容器类，利用它们可以创建用于构建程序图形界面的组件和容器。例如，

JButton b = new JButton("Example"); // 创建按钮

JFrame jframe = new JFrame("Example"); // 创建 JFrame 窗口

容器和组件通常是具有一定的包含关系的。可以按照这样的观点分层次：

顶层容器（不会包含在其它任何容器中的容器），例如JFrame 、JApplet 、JDialog 、JWindow等；

中间容器，例如 JPanel 、JScrollPane 、JSplitPane 、JToolBar 等；

基本控件，例如 JButton 、JComboBox 、JList 、JMenu 、JTextField 等；

可编辑的组件，例如 JColorChooser 、JFileChooser 、JTextArea 等。

在构建程序的图形界面时，一般一次创建顶层容器，中间容器，基本控件和可编辑组件，然后再把基本控件和可编辑组件放到中间容器中，最后再把中间容器放到顶层容器中。

在容器中可以放置许多组件，需要合理地安排这些组件在容器中的位置才能使界面方便使用并且美观，这些工作就是组件的布局设计与管理。

每个容器都有一个布局管理器用来管理放到这个容器中的组件的布局。当容器需要对某个组件进行定位或判断其大小尺寸时，就会调用其对应的布局管理器。布局管理器可以使我们生成的图形用户界面具有良好的平台无关性。在Java语言中，用布局管理器来管理组件在容器中的布局，而不直接设置组件位置和大小。容器通过选择不同的布局管理器来决定布局。

实际上，布局管理器是实现 LayoutManager 接口的类。常用的布局管理器有 FlowLayout、BorderLayout、CardLayout、GridLayout、GridBagLayout 等。

使用布局管理器要引入 java.awt 包。



## **10.2 Java图形用户界面编程基本方法**

### 主体内容

编写具有图形用于界面的 Java 程序要做两件事：

（1）创建程序的图形界面。

（2）编写相应的事件处理代码。



### 活动1：观看创建程序图形界面的视频

下面的视频演示了创建程序图形界面的基本方法，从而让你了解创建程序图形用户界面的基本过程。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid10-1.png)

**视频10-1：创建程序图形界面**

1.新建一个Java项目PrjGUI。本章的实例都放到这个项目中。

2.在项目PrjGUI中创建类FrameApp1。FrameApp1类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.2.html?node=858292615&detailRecordId=1318913827&studyrecordId=1225624963&sectionRecordId=1229924124#)

```
package` `com.buptnu;``import` `java.awt.*;``import` `javax.swing.*;``public` `class` `FrameApp1 {`` ``public` `static` `void` `main(String[] args) {``  ``// TODO Auto-generated method stub``  ``JFrame jframe = ``new` `JFrame(``"Example"``);``  ``jframe.setSize(``400``,``100``);``  ``jframe.getContentPane().setLayout(``new` `FlowLayout());``  ``JButton jbtn1 = ``new` `JButton(``"按钮"``);``  ``jframe.getContentPane().add(jbtn1);``  ``jframe.setVisible(``true``);`` ``}``}
```

3.运行程序，观察窗口标题栏（标题、最小化按钮、最大化/还原按钮、关闭按钮），观察窗口（内容面板、按钮），试着点击按钮，观察程序是否有响应。

4.最后陈述一下单击按钮程序没响应，是因为没有编写相应的事件处理代码。

活动1的解析：本视频中的程序的分析

(1)程序创建了一个窗口，窗口中显示一个按钮。但是，当用鼠标点击按钮的时候，程序不会有任何反应，这是因为程序中没有编写按钮点击事件的代码。

(2)系统类 JFrame 用于创建框架窗口，也叫 JFrame 窗口。从前面介绍知道， JFrame 窗口是顶层容器，用来容纳其它中间容器或组件。相关代码的解释如下：

语句“JFrame jframe = new JFrame("Example");”是创建JFrame类的一个实例，给它命名为 jframe。 jframe就是一个框架窗口。

语句“jframe.setSize(400,100);”是设置JFrame窗口初始显示时的宽度和高度。

语句“jframe.getContentPane()”是调用 jframe 对象的 getContentPane() 方法，取得框架窗口的内容面板对象。每个框架窗口都有一个内容面板，通常把窗口要显示的内容放到内容面板上。

取得窗口的内容面板并把它的布局管理器设置为顺序布局管理的Java语句及其语法分析如图10.2所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_2.png)

**图10.2 取得窗口的内容面板并把它的布局管理器设置为顺序布局管理器**

JButton 是系统类，它的实例就是一个按钮。所以语句“JButton jbtn1 = new JButton("按钮");”是创建了一个按钮对象。

语句“jframe.getContentPane().add(jbtn1);”是调用内容面板对象的 add() 方法，把按钮添加到内容面板上。

语句“jframe.setVisible(true);”是调用 jframe 对象的 setVisible()方法，设置框架窗口是可见的。一个框架窗口创建好了之后，默认情况下是不可见的，要让用户能在屏幕上看到窗口，需要用代码把它设定为可见的。

程序执行的时候就会从main()方法第一条语句开始依次执行每条语句，最后就能看到程序的图形用户界面了。

(3)mian()方法执行结束后，主线程执行结束，但图形用户界面的线程仍然在运行。



### 活动2：观看添加了事件处理代码的程序的视频

点击折叠

在Java中，程序和用户的交互是通过响应各种事件来实现的。例如，用户点击一个按钮，就意味着一个按钮事件的发生；选中一个选项，就意味着一个选项事件的发生。每当一个事件发生，Java虚拟机就会产生代表这个事件的事件对象，然后将事件对象传递给程序，由程序的事件处理方法对事件进行处理。如果没有编写事件处理方法，程序就不能和用户交互。

下面的视频演示了给视频10-1的图形用户界面程序中的按钮添加时间处理代码的基本方法，从而让你了解为图形用户界面程序编写事件处理代码的基本方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid10-2.png)

**视频10-2： 为图形用户界面添加事件处理代码**

1.在项目PrjGUI中打开类FrameApp1，修改FrameApp1类，添加事件处理代码如下（高亮显示的代码是新添加的）：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_3.png)

2.运行程序，点击“按钮”，观看程序的响应。

活动2的解析：本视频中的程序的分析

(1)程序开头用 import 语句把要用到的类库引入。由于要做事件处理，而事件处理要用到 java.awt.event 包中的类和接口，所以把这个包也引入到程序中。

(2)程序运行时，用户用鼠标点击按钮后，底层操作系统平台会把这个鼠标事件通知Java 运行时系统， Java 运行时系统产生相应的事件对象，然后运行时系统的事件调度机制会把这个事件对象调度给用户代码，让用户代码去处理这个事件。

(3)Java 中把能够产生事件的组件叫做事件源。这个程序中的按钮就是一个事件源。在Java 中，事件源产生的事件并不是由事件源本身处理，而是由其他的对象来处理。用来处理事件的对象，就叫做事件监听者或事件监听器。对于这个程序来说，我们专门创建了一个对象作为事件监听者，用来处理按钮组件激活事件。是用这条语句完成的：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_4.png)

按钮组件激活事件产生后将交给这个事件监听者对象去处理。需要注意的是，不是随便拿一个对象就可以当事件监听者的。必须让对象具有事件处理能力，这个对象才能当事件监听者。要想让事件源具备事件处理的能力，就必须在事件监听者中实现相应的事件监听接口。按钮组件激活事件对象所属的类是系统类 ActionEvent， 与这个系统类相对应的事件监听接口是系统接口是 ActionListioner，即事件监听者必须实现 ActionListioner 接口才能处理组件激活事件。因此我们会看到，源程序中 FrameApp1类的声明部分增加了短语 implements ActionListener，声明这个类实现了 ActionListener 接口。 如同系统类 ActionEvent 一样，ActionListener 接口是系统接口，是系统类库中已经定义好的。其实 ActionListener 接口很简单，在其中只定义了一个抽象方法 void actionPerformed(ActionEvent e)。在实现这个接口的类中给出这个方法的具体实现就可以了。具体点说，在这个程序中，我们把按钮组件激活事件的事件处理代码写到这个方法中就成了。当按钮组件激活事件产生的时候， Java 的事件处理机制会调用这个 actionPerformed(ActionEvent e) 方法中的事件处理代码去处理事件。对应到这个程序，会看到，在FrameApp2 类的类体中这样给出了actionPerformed(ActionEvent e) 方法的实现。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.2.html?node=858292615&detailRecordId=1318913827&studyrecordId=1225624963&sectionRecordId=1229924124#)

```
public` `void` `actionPerformed(ActionEvent e) {`` ``JOptionPane.showMessageDialog(``null``, ``"ok"``);``}
```

其中的语句就是弹出一个提示框，提示信息是 "ok"。正是由于 FrameApp2 类实现了 ActionListioner 接口，所以用 new FrameApp2() 创建的对象才具有事件处理能力，因而才能当作事件监听者。

好了，现在有了产生事件的事件源和处理事件的事件监听者，但还不够，还有一个问题需要解决。一个程序中的事件源可能有多个，而且一个事件源产生的事件也可能有多个，还有事件监听者也可能有多个，这样问题就来了：某个事件源产生的某个类型的事件后到底该给谁去处理呢？这个必须在用户代码中作出明确的约定才行，否则 Java 运行时系统可不知道该怎么办。也就是说，用户代码要明确地指明某个事件源产生某个事件之后要交给哪个事件监听者去处理。这个工作是通过给事件源注册事件监听者完成的。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_5.png)

(4)启动程序执行后，显示框架窗口，窗口中间部分是内容面板，内容面板上是一个按钮。创建好这样的图形用户界面后，程序就处于等待用户输入状态。当我们用鼠标点击按钮后，Java 运行时系统的事件处理机制就会调用事件监听者对象的 actionPerformed(ActionEvent e) 方法，从而会显示提示框。

(5)在这个程序中，我们按照 Java的事件处理模型（我们前面的那几段话其实就是描述了 Java 的事件处理模型）编写了事件处理代码，所以程序能够相应用户对程序的图形界面的操作。



## **10.3 事件类型与事件监听接口**

### 事件类型与事件监听接口

为了便于管理事件，也为了便于注册事件监听者，Java 将事件分类，称为事件类型。每一种事件都有一个事件类与之对应，当事件产生后，系统会根据与事件对应的事件类创建一个事件对象代表该事件，然后交给事件处理机制去处理。Java 的事件类的层次结构如图10.3所示

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_6.png)

**图10.3 Java 的事件类的层次结构**

GUI 的不同组件会产生不同的事件，例如，JButton 可以产生过 ActionEvent 事件， JCheckBox（选择框）可以产生 ItemEvent 事件。即便是同一个组件也可能产生多种不同的事件，例如 JButton 可以产生 ActionEvent 事件，还可以产生 MouseEvent 事件。下面的表列出了常见的事件类型（事件类）以及能够产生这些事件的组件之间的关系如表10-1所示。

**表10-1事件类型与组件**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) 事件类型

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)能够产生该类型事件的组件

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)描述

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)ActionEvent

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) JButton  JCheckBox  JComboBox  JMenuItem  JRadioButton

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) 点击、选项或选择

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)ChangeEvent

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)JSlider

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)调整一个可移动元素的位置

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)ItemEvent

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) JComboBox   JCheckBox

JRadioButton 
JRadioButtonMenuItem JCheckBoxMenuItem

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) 从一组可选方案中选择一个项目

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)KeyEvent 
![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png)MouseEvent

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) JComponent 及其子类

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) 操纵鼠标或键盘

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) CareEvent

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) JTextArea JTextField

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) 选择和编辑文本

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) WindowEvent

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) Window 及其子类 JFrame

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/table.png) 对窗口打开、关闭和图标化

每个事件类型都有一个特定的事件监听接口，事件监听者必须实现与事件类型相对应的事件监听接口才具有处理那类事件的能力。例如，对于 ActionEvent 事件，与之相对应的事件监听接口是 ActionListioner，那么能够处理 ActionEvent 事件的事件监听者对象必须是实现了 ActionListioner 接口的对象。就像在视频10-2中那样，FrameApp1 类必须实现 ActionListioner 接口，它的实例才能够作为按钮 jbtn1 的ActionEvent 事件的事件处理器。如果FrameApp1 类实现的不是 ActionListioner 接口，而是其它的什么接口，即便把 FrameApp 类的一个实例注册给 jbtn1，它也不能处理jbtn1 的ActionEvent 事件。表10-2列出了事件类型和事件监听接口之间的对应关系：

**表10-2常用事件类和事件监听接口**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_7.png)



### 事件分派

点击折叠

这是一个比较深入的问题，要读懂需要比较多的知识。如果实在读不懂，也不用这个时候在这里“较劲儿”。在本课程的这块儿，你只要记住本小节最后面讲的“编写事件处理程序时要注意的两个问题”是什么就够了。以后你学得多了，这里讲得事情自然就明白了。不用焦虑，总是要有一个循序渐进的过程，总要经历一个从量变到质变的过程。本质上来说，没什么“捷径”可言。

**（1）AWT的事件分派**

当 Java 虚拟机开始执行时，它会启动一个初始线程。然后，当第一个与 AWT 相关的类（包括 Swing 类）被实例化时，在 JVM 中的 GUI 工具包也会被初始化。根据底层操作系统的不同，这会导致一个或者多个附加的线程被创建，它们负责与本地的窗口系统交互。这些线程提供了 GUI 程序运行的基本支持，例如在这些线程中有负责处理GUI事件线程，也有负责将窗体或组件绘制到桌面的线程。

不管有多少个线程被创建，其中一个被称为事件分派线程（event dispatching thread）。该线程负责获取用户输入的事件；当用户敲入一个字符时，该事件分派线程就会从底层窗口系统中收到一个消息。当用户移动鼠标或者按下鼠标键时，该事件分派线程也会接收到消息。当它接收到消息后，就开始处理该事件的分派：它指出该事件发生在哪个 AWT 组件上，并且调用在该组建上注册的事件处理方法。

因此，任何被调用来对这些消息进行响应的方法都是在消息分派线程中被调用的。在一般情况下，任何与消息相关的方法（actionPerformed()、focusGained() 和 itemStateChanged() 等）以及作为 java.awt.event 包中的监听接口的一部分的方法都是在事件分派线程中被调用的。

事件分派线程是非守护线程。由前面关于线程的介绍我们知道，只要程序中还有非守护线程没结束，程序就不会结束，所以这个线程将会防止用户程序到达 main() 末尾时结束运行。这样一来，即便 main() 方法代码都执行完了，程序也不会结束运行， GUI 将会留在屏幕上，程序继续运行以响应用户在 GUI 上的输入。

总之，AWT 的事件分派线程由 JVM 隐式启动，在操作系统上抽取和移除事件，当诸如按钮动作这样的逻辑事件被触发时，它或者自己处理事件，或回调程序员编写并注册的事件处理代码去处理事件。

AWT 的事件分派线程通常被命名为 AWT-{OS}-Thread（在不同的操作系统上实现的 Java 平台中，{OS}会被命名为具体的操作系统的名字）。开发者也能为AWT组件编写鼠标，键盘和绘制事件的事件监听器。这通常通过扩展AWT Canvas组件来完成。这一组件支持了所有已提供的事件，而且你可以通过重写事件处理方法，实现一个自定义的组件。

**（2）Swing的事件分派**

Swing 的事件处理以 AWT 的事件处理为基础，建立在 AWT 事件处理机制之上。但是在Swing中，事件处理是另外一个的线程。 Swing 把 AWT 事件作为自身事件系统的一个输入，它获取 AWT 事件并做一些初始化处理，产生一个对应的 Swing 事件并把它放到自己的事件队列上。 Swing 也有自己的事件分派线程，通常命名为 EventQueue-0。这个线程从 AWT事件队列中抽取Swing事件，就如同AWT从操作系统中抽取事件那样，然后它把事件分发给目标组件。通常， Swing 事件首先被分发给组件的顶层容器，然后由顶层容器的 dispatch() 方法处理，它可能被再分发或重定向到一个 Swing 组件，在那里继续由组件自己的监听器进行处理。

**（3）编写事件处理程序时要注意的两个问题**

AWT 和Swing 都采用采用单线程分派模型，在这样的模型中，事件一个事件从队列中抽出并在同一个线程中被立即处理，然后再抽取下一个事件并处理。这样的事件处理模型的特征就是只有当前事件的事件处理代码都执行完了，后续的GUI 事件才能被抽取并处理，否则必须等待。这就会带来一个问题，如果某个事件的处理过程耗时太长，那么后续的 GUI 事件就要等待很长时间才能被响应。所以编程时要注意，在我们自己编写的事件处理代码中不要执行耗时常的操作。如果一个动作需要花费很长的时间，如从网络上获取一个文件，那么应该在一个独立的线程中做这件事，而不要在事件处理代码中去做。

另外一个要注意的问题是除了事件分派线程，不要在我们自己的任何线程中接触 Swing 组件。 Swing 不是线程安全的，如果让多个的线程直接操作 Swing 组件则可能造成异常。因此，要编写线程安全的 Swing 程序，就要确保我们的程序只通过事件分派线程接触 Swing组件。

## **10.4 框架窗口**

### 主体内容

窗口是顶层容器，小应用程序或图形界面的应用程序的可视组件都放在窗口中。有三种窗口：Applet 窗口、 框架窗口（JFrame）和 无边框的窗口（JWindow）

JFrame 类或它的子类创建的对象就是 JFrame 窗口。JFrame 类的主要构造方法如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JFrame() ，创建无标题的框架窗口对象

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JFrame(String s) ，创建一个名称为字符串 s 的框架对象

Java系统中已经包含了设计者编写的大量系统程序包，你学习Java的任务之一就是了解和使用系统程序包。除此之外，你还可以声明和使用自己的程序包，这为大型程序的开发提供了方便。

刚才看到的框架窗口是一个空的框架窗口。要让程序能完成实际的功能，需要在框架窗口中显示信息或者添加其它的 GUI 组件。那么怎样在框架窗口中显示信息或者添加组件呢？

Swing 里的容器都可以添加组件。除了 JPanel 及其子类 （如 JApplet ）之外，其它的Swing 容器不允许把组件直接加入其中。（这和 AWT 编程是不同的。 AWT 编程可以在容器中直接加入组件）。

JFrame 包含有一个内容面板，要在 JFrame 窗口中显示信息或者往 JFrame 窗口中添加组件，那么就要把信息写到 JFrame 的内容面板上，或者把组件添加到 JFrame 的内容面板上才行。

要理解这个问题，需要了解JFrame框架的基本结构。其基本结构如图10.3所示：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_8.png)

**图10.3 JFrame框架的基本结构**

JFrame 窗口中包含一个 JRootPane 类的实例（对象），用这个对象管理放到框架窗体中的元素。JRootPane 面板包含一个 glassPane 面板和一个 JLayeredPane 面板。 glassPane 面板能够截取鼠标移动，而JLayeredPane 面板负责管理 contentPane 内容面板和 JMenuBar 菜单。程序中要使用的按钮、列表框等组件不是直接添加到 JFrame 框架窗口，而是需要添加到内容面板中，而 JMenuBar 对象则负责管理出现在框架窗口顶部的菜单。



### 活动1：观看JFrame窗口的使用方法的视频

点击折叠

通常不直接使用 JFrame 类创建框架窗口，而是由JFrame 类派生子类，在子类中加入窗口的特定要求和功能。这是更常用的编程方式：

下面的视频演示了创建包以及编译程序的方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid10-3.png)

**视频10-3：JFrame窗口的使用方法**

1.在项目PrjGUI中创建类MyJFrame。MyJFrame类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.4.html?node=858292617&detailRecordId=1318913829&studyrecordId=1225624963&sectionRecordId=1229924126#)

```
package` `com.buptnu;``import` `java.awt.*;``import` `javax.swing.*;``public` `class` `MyJFrame ``extends` `JFrame {`` ``public` `MyJFrame(String name, JButton btn, Color c, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``Container conPane = getContentPane();``  ``conPane.setLayout(``new` `FlowLayout());``  ``conPane.add(btn);``  ``conPane.setBackground(c);``  ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}``}
```

2.在项目PrjGUI中创建类FrameApp2。FrameApp2类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.4.html?node=858292617&detailRecordId=1318913829&studyrecordId=1225624963&sectionRecordId=1229924126#)

```
package` `com.buptnu;``import` `java.awt.*;``import` `javax.swing.*;``public` `class` `FrameApp2 {`` ``public` `static` `void` `main(String[] args) {``  ``JButton btn1 = ``new` `JButton(``"确定"``);``  ``String str1 = ``"在窗口中添加按钮的例子"``;``  ``MyJFrame mw =``   ``new` `MyJFrame(str1, btn1, Color.yellow, ``250``, ``200``);``  ``mw.setVisible(``true``);`` ``}``}
```

3.运行程序。

活动1的解析：本视频中程序的分析

这个程序没有直接实例化 JFrame 产生框架窗口，而是由 JFrame 派生出子类 MyJFrame，创建子类对象作为框架窗口。这是比较常用的方法，即通常由 JFrame 派生子类，在子类中设定我们自己的框架窗口特有的属性，然后创建子类对象，等到我们需要的框架窗口。就我们这个例子而言，在子类 MyJFrame的构造方法使用指定的宽度和高度作为窗口初始宽度和高度，使用指定的颜色作为内容面板的颜色，使用指定的按钮添加到内容面板上。此外，子类中还有这样一条语句

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.4.html?node=858292617&detailRecordId=1318913829&studyrecordId=1225624963&sectionRecordId=1229924126#)

```
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

这个语句是设定当前框架窗口关闭时要执行的操作。JFrame.EXIT_ON_CLOSE 表示要退出应用程序。如果没有这句话，只关闭当前窗口，并不退出应用程序。

要点1：关闭框架窗口与应用程序退出的问题

在有着多个框架的程序中，可能不能因为用户关闭了多了框架中的一个就让程序全部退出。默认情况下，当用户关闭一个框架时，该框架会隐藏起来，但应用程序不会终止。要退出程序，可以使用语句

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.4.html?node=858292617&detailRecordId=1318913829&studyrecordId=1225624963&sectionRecordId=1229924126#)

```
fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

或者在已注册的 WindowListener对象的 windowClosing 方法中去退出程序，比如在那里使用语句 System.exit(0);



### 活动2：观看使用窗口事件监听接口的视频

点击折叠

与窗口事件对应的事件监听接口是WindowListener，可以使用此接口处理与窗口相关的事件。下面的视频演示了WindowListener的使用方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid10-4.png)

**视频10-4：使用窗口事件监听接口**

1.在项目PrjGUI中创建类MyJFrame1。MyJFrame1类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.4.html?node=858292617&detailRecordId=1318913829&studyrecordId=1225624963&sectionRecordId=1229924126#)

```
        ``package` `com.buptnu;``import` `java.awt.*;``import` `javax.swing.*;``import` `java.awt.event.*;``class` `MyJFrame1 ``extends` `JFrame ``implements` `WindowListener {`` ``Container conPane = ``null``;`` ``public` `MyJFrame1(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `FlowLayout());``  ``// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);``  ``addWindowListener(``this``);`` ``}`` ``public` `void` `windowClosing(WindowEvent e) {``  ``System.out.println(``"Closing..."``);`` ``}`` ``public` `void` `windowClosed(WindowEvent e) {``  ``System.exit(``0``);`` ``}`` ``public` `void` `windowOpened(WindowEvent e) {``  ``System.out.println(``"Opened..."``);`` ``}`` ``public` `void` `windowIconified(WindowEvent e) {``  ``System.out.println(``"Iconified..."``);`` ``}`` ``public` `void` `windowDeiconified(WindowEvent e) {``  ``System.out.println(``"Deiconified..."``);`` ``}`` ``public` `void` `windowActivated(WindowEvent e) {``  ``System.out.println(``"Activated..."``);`` ``}`` ``public` `void` `windowDeactivated(WindowEvent e) {``  ``System.out.println(``"Deactivated..."``);`` ``}``}
```

2.在项目PrjGUI中创建类FrameApp3。FrameApp3类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.4.html?node=858292617&detailRecordId=1318913829&studyrecordId=1225624963&sectionRecordId=1229924126#)

```
package` `com.buptnu;``public` `class` `FrameApp3 {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"JFrame 窗口"``;``  ``MyJFrame1 mw = ``new` `MyJFrame1(str1, ``250``, ``200``);``  ``mw.setVisible(``true``);`` ``}``}
```

3.运行程序，在Console窗口观察窗口事件的响应。分别观察打开窗口、最小化窗口、窗口非激活和激活窗口时，程序在Console中的输出。注：这些输出都是程序捕获到窗口事件并处理后的输出。

活动2的解析：本视频中程序的分析

事件的事件监听者。本程序中，在MyJFrame1类的构造方法中使用语句

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.4.html?node=858292617&detailRecordId=1318913829&studyrecordId=1225624963&sectionRecordId=1229924126#)

```
addWindowListener(``this``);
```

在窗口对象初始化的时候，把此窗口对象作为事件监听者。

MyJFrame1类要给出WindowListener接口定义的所有抽象方法的实现，即使某个方法什么都不做，其表示方法体的那对儿花括号也要给出。



## **10.5 面板**

### 主体内容

面板有两种：普通面板 JPanel 和滚动面板 JScrollPane。



### JPanel 面板

JPanel类或它的子类创建的对象就是面板对象。 JPanel面板是一种普通容器，作用是实现界面的层次结构。在 JPanel面板上可以放置组件，也可以在上面绘图。JPanel 面板的默认布局管理器是 FlowLayout 。

JPanel 类的主要构造方法：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JPanel() ，创建一个面板对象

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JPanel(LayoutManager layout) ，创建一个JPanel 对象，同时指定使用的布局管理器是 layout

JPanel 类的常用成员方法：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) add( 组件) ，向面板中添加组件

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) add( 字符串, 组件) ，向面板中添加组件，当面板采用 CardLayout 布局时，字符串时引用添加组件的代号



### 活动1：观看使用JPanel面板的视频

点击折叠

下面的视频演示了使用JPanel面板的方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid10-5.png)

**视频10-5：使用JPanel面板**

\1. 在项目PrjGUI中创建类MyPanel。MyPanel类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.5.html?node=858292618&detailRecordId=1318913830&studyrecordId=1225624963&sectionRecordId=1229924125#)

```
package` `com.buptnu;``import` `javax.swing.*;` `public` `class` `MyPanel ``extends` `JPanel {``  ``JButton button1, button2;``  ``JLabel label1;``  ``MyPanel(String s1, String s2, String s3) {``    ``label1 = ``new` `JLabel(s1);``    ``button1 = ``new` `JButton(s2);``    ``button2 = ``new` `JButton(s3);``    ``add(label1);``    ``add(button1);``    ``add(button2);``  ``}``}
```

\2. 在项目PrjGUI中创建类MyPanelApp。MyPanelApp类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.5.html?node=858292618&detailRecordId=1318913830&studyrecordId=1225624963&sectionRecordId=1229924125#)

```
package` `com.buptnu;``import` `java.awt.*;``import` `javax.swing.*;` `public` `class` `MyPanelApp {``  ``public` `static` `void` `main(String[] args) {``    ``JFrame jframe = ``new` `JFrame(``"Example"``);``    ``jframe.setSize(``400``,``200``);``    ``jframe.getContentPane().setLayout(``new` `FlowLayout());``    ``MyPanel panel1, panel2;``    ``JButton button3;``    ``panel1 = ``new` `MyPanel(``"我们在面板1中"``, ``"确定"``, ``"取消"``);``    ``panel1.setBackground ( Color.yellow );``    ``panel2 = ``new` `MyPanel(``"我们在面板2中"``, ``"确定"``, ``"取消"``);``    ``panel2.setBackground ( Color.orange );``    ``button3 = ``new` `JButton(``"我是没在面板中，直接放在 Applet 窗口中的按钮"``);``    ``jframe.getContentPane().add(panel1);``    ``jframe.getContentPane().add(panel2);``    ``jframe.getContentPane().add(button3);``    ``jframe.setVisible(``true``);``  ``}``}
```

\3. 运行程序，观察面板的摆放。面板panel1和panel2都放置在了JFrame窗口的内容面板上，第一个面板背景颜色为黄色，第二个面板背景颜色为橙色。每个面板上有一个标签，两个按钮。最后一个按钮直接放在JFrame窗口的内容面板上，没在JPanel面板上。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/a1.png)

活动1的解析：本视频中程序的分析

MyPanel继承自JPanel，它的实例就是JPanel面板。

MyPanel有三个成员：前两个是按钮，第三个是标签。

MyPanel的构造方法接收三个参数，并将这三个参数分别设置为标签文本和按钮上显示的文字，之后把标签和按钮都依次添加到面板对象上。

主类MyPanelApp中，先创建了一个窗口对象jframe，设置好它的初始宽度和高度，为它的内容面板设置顺序布局管理器。之后，创建了两个面板panel1和panel2，且把panel1的背景颜色设置为黄色，把panel2的背景颜色设置为橙色。程序还创建了一个按钮button3，它没在任何一个JPanel面板上。最后把面板panel1和panel2、按钮button3都放置到窗口的内容面板上，并将窗口设置为显示状态。



### JScrollPane面板（滚动面板）

JScrollPane 类或它的子类创建的对象就是滚动面板对象。JScrollPane 滚动面板是一个容器，带有滚动条。当该容器的显示区域不足以显示组件的全部时，使用滚动条滑块可以看到组件的其它部分。JScrollPane 滚动面板中只能添加一个组件。JScrollPane 滚动面板的使用方式是，一般将一些组件先添加到一个 JPanel 面板中，然后在把该 JPanel 面板添加到JScrollPane 滚动面板，这样看起来好像在JScrollPane 滚动面板中有很多组件。

JScrollPane 类的主要构造方法：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JScrollPane() ，创建一个 JScrollPane 对象

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JScrollPane(Component com) ，创建一个JScrollPane 对象， com 是要放到该滚动面板的组件对象JScrollPane 类的常用成员方法：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setHorizontalScrollBarPolicy(int policy) ，设置水平滚动条的显示方式

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setVerticalScrollBarPolicy(int policy) ，设置垂直滚动条的显示方式





### 活动2：观看使用JScrollPane面板的视频

点击折叠

下面的视频演示了使用JScrollPane面板的方法。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid10-6.png)

**视频10-6：JScrollPane面板**

\1. 在项目PrjGUI中创建类JScrollPaneApp。JScrollPaneApp类的代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.5.html?node=858292618&detailRecordId=1318913830&studyrecordId=1225624963&sectionRecordId=1229924125#)

```
package` `com.buptnu;``import` `java.awt.*;``import` `javax.swing.*;` `public` `class` `JScrollPaneApp {``  ``public` `static` `void` `main(String[] args) {``    ``JFrame jframe = ``new` `JFrame(``"Example"``);``    ``jframe.setSize(``400``,``300``);``    ``jframe.getContentPane().setLayout(``new` `FlowLayout());``    ``JTextArea textA = ``new` `JTextArea(``10``, ``20``);``    ``JScrollPane jsp = ``new` `JScrollPane(textA);``    ``jsp.setHorizontalScrollBarPolicy(``        ``JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS``      ``);``    ``jsp.setVerticalScrollBarPolicy(``        ``JScrollPane.VERTICAL_SCROLLBAR_ALWAYS``      ``);``    ``jframe.getContentPane().add(jsp);``    ``jframe.setVisible(``true``);``  ``}``}
```

\2. 运行程序，复制一些文本到滚动面变的文本域上，拖动水平滚动条和垂直滚动条，查看文本域中的内容。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/a2.png)

活动2的解析：本视频中程序的分析

主类JScrollPaneApp中，先创建了一个窗口对象jframe，设置好它的初始宽度和高度，为它的内容面板设置顺序布局管理器。之后，创建一个10行20列的文本域textA，一个滚动面板jsp。创建滚动面板的时候，将文本域textA作为实参，传给滚动面板的构造方法，该构造方法在初始化滚动面板的时候会把这个文本域添加到滚动面板上。创建好滚动面板后，设置滚动面板的水平滚动条和垂直滚动条都总是显示状态。最后把面滚动面板放置到窗口的内容面板上，并将窗口设置为显示状态。

## **10.6 布局设计**

### 主体内容

在容器中可以放置许多组件，需要合理地安排这些组件在容器中的位置才能使界面方便使用并且美观，这些工作就是组件的布局设计与管理。每个容器都有一个布局管理器用来管理组件在该容器中的布局。布局管理器是实现 LayoutManager 接口的类。

**常用的布局管理器：**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) FlowLayout: 组件在一行中从左至右水平排列，排满后折行

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) BorderLayout：北、南、东、西、中

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) GridLayout：以行和列的网格形式安排组件

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) GridBagLayout：更复杂、功能更强的网格布局

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) CardLayout：每一个组件作为一个卡片，容器仅显示多个卡片中的某一个

**缺省的布局管理器：**

Window 、Frame、Dialog的缺省的布局管理器是BorderLayout。

Panel 、Applet的缺省的布局管理器是FlowLayout。

**选择布局管理器的方法：**

（1）建立布局管理器类的对象

（2）利用容器的 setLayout 为容器指定布局（即指定一个布局管理器的对象）



### FlowLayout布局

FlowLayout 的布局方式是将组件按照加入的先后顺序从左到右排列，一行排满之后转到下一行继续排。每行中的组件默认居中排列。



### FlowLayout 的构造方法：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) FlowLayout() ，生成一个默认的 FlowLayout 布局管理器。默认情况下组件居中，间隙5 个像素

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) FlowLayout(int aligment) ，生成一个FlowLayout 布局管理器，设定每一行组件的对齐方式为 alignment

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) FlowLayout(int aligment, int horz, int vert) ，生成一个FlowLayout 布局管理器，设定对齐方式、水平间距和垂直间距

**设定容器的布局管理器为 FlowLayout 的方法：**

setLayout(new FlowLayout())

当布局管理器为 FlowLayout 时向容器添加组件的方法

add( 组件名)

小应用程序和面板默认的布局管理器是 FlowLayout

**例10-1** 顺序布局管理器的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.6.html?node=858292619&detailRecordId=1318913831&studyrecordId=1225624963&sectionRecordId=1229924128#)

```
import` `javax.swing.*;``import` `java.awt.*;` `class` `MyJFrame ``extends` `JFrame {`` ``Container conPane = ``null``;`` ``public` `MyJFrame(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `FlowLayout());``  ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}``}``public` `class` `FlowLayoutApp1 {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrame mw = ``new` `MyJFrame(str1, ``250``, ``200``);``  ``for` `(``int` `i = ``0``; i <= ``10``; i++) {``   ``mw.conPane.add(``new` `JButton(``"按钮"` `+ i));``  ``}``  ``mw.setVisible(``true``);`` ``}``}
```

**例10-1** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/a3.png)

**例10-1** 的程序分析：

MyJFrame类继承自系统类JFrame，它的实例就是一个窗口。MyJFrame类的构造方法中将窗口内容面板的布局管理器设置为顺序布局。

主类FlowLayoutApp1的main()方法控制程序的主流程。主流程中先创建窗口对象，然后使用for循环语句创建了10个按钮并添加到窗口的内容面板上，最后设置窗口为显示状态。



### BorderLayout布局

BorderLayout 的布局方式是把容器内的空间划分为East/West/South/North/Center 五个区域，组件放在某个区域中。

BorderLayout 的构造方法

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) BorderLayout() ，生成一个默认的 BorderLayout 布局管理器。默认情况下没有间隙

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) BorderLayout(int horz, int vert) ，生成一个BorderLayout 布局管理器，设定水平间距 horz ，和垂直间距 vert

**设定容器的布局管理器为 BorderLayout 的方法：**

setLayout(new BorderLayout())

**当布局管理器为 BorderLayout 时向容器添加组件的方法：**

add( 组件名, 位置)

JWindow 、 JFrame 和 JDialog 默认的布局管理器是 BorderLayout

**例10-2** 边界布局管理器的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.6.html?node=858292619&detailRecordId=1318913831&studyrecordId=1225624963&sectionRecordId=1229924128#)

```
import` `javax.swing.*;``import` `java.awt.*; ``// Container 类在此类库中定义` `class` `MyJFrame ``extends` `JFrame {`` ``Container conPane = ``null``;`` ``public` `MyJFrame(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `BorderLayout(``2``,``3``));``  ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}``}``public` `class` `BorderLayoutApp1 {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrame mw =``   ``new` `MyJFrame(str1, ``250``, ``200``);``  ``JButton jbtn1 = ``new` `JButton(``"Center"``);``  ``JButton jbtn2 = ``new` `JButton(``"North"``);``  ``JButton jbtn3 = ``new` `JButton(``"West"``);``  ``JButton jbtn4 = ``new` `JButton(``"South"``);``  ``JButton jbtn5 = ``new` `JButton(``"East"``);``  ``mw.conPane.add(jbtn1, BorderLayout.CENTER);``  ``mw.conPane.add(jbtn2, BorderLayout.NORTH);``  ``mw.conPane.add(jbtn3, BorderLayout.WEST);``  ``mw.conPane.add(jbtn4, BorderLayout.SOUTH);``  ``mw.conPane.add(jbtn5, BorderLayout.EAST);``  ``mw.setVisible(``true``);`` ``}``}
```

**例10-2** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/a4.png)

**例10-2** 的程序分析：

MyJFrame类继承自系统类JFrame，它的实例就是一个窗口。MyJFrame类的构造方法用接收到的实参设置窗口标题，初始宽度和高度，并设置窗口内容面板的布局管理器设置为边界布局，最后设置窗口关闭时结束程序。

主类BorderLayoutApp1的main()方法控制程序的主流程。主流程中先创建窗口对象，然后创建5个按钮，分别放在内容面板的中、上、左、下、又部，最后设置窗口为显示状态。



### GridLayout布局

GridLayout 的布局方式是把容器划分为若干行和列的网格状，行数和列数由程序控制，组件放在网格的小格子中。GridLayout 布局的特点时组件定位比较精确，每个网格具有相同的大小。GridLayout 布局以行为基准，当放置的组件个数超额时，自动增加列；反之，组件太少时，自动减少列。行数总是不变的。GridLayout 布局按行优先顺序排列组件。

**GridLayout的构造方法：**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) GridLayout() ，生成一个单列的 GridLayout 布局管理器。默认情况下无间隙。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) GridLayout(int row, int col)，生成一个GridLayout布局管理器，设定有row行col列。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) GridLayout(int row, int col, int horz, int vert) ，生成一个GridLayout布局管理器，设定有 row行 col列，水平间距 horz ，垂直间距vert。

**设定容器的布局管理器为 GridLayout 的方法：**

setLayout(new GridLayout())

**当布局管理器为 GridLayout 时向容器添加组件的方法：**

add( 组件名)

GridLayout 布局的每个网格都必须填入组件，如果希望某个网格为空白，可以用一个空白标签（add(new Label()) ）占用那个位置

**例10-3** 网格布局管理器的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.6.html?node=858292619&detailRecordId=1318913831&studyrecordId=1225624963&sectionRecordId=1229924128#)

```
import` `java.awt.*; ``import` `javax.swing.*;` `public` `class` `GridEx {    `` ``private` `JFrame f; `` ``private` `Button b1, b2, b3, b4, b5;`` ``public` `static` `void` `main (String args[]){``  ``GridEx that = ``new` `GridEx ( ); ``  ``that.go ( );`` ``}`` ``void` `go ( ) {``  ``f = ``new` `JFrame ( ``"Grid Layout"` `);``  ``f.setLayout ( ``new` `GridLayout ( ``3``, ``2` `) ); ``  ``b1 = ``new` `Button ( ``"b1"` `);``  ``b2 = ``new` `Button ( ``"b2"` `);``  ``b3 = ``new` `Button ( ``"b3"` `);``  ``b4 = ``new` `Button ( ``"b4"` `);``  ``b5 = ``new` `Button ( ``"b5"` `);``  ``f. add ( b1 ); ``  ``f. add ( b2 ); ``  ``f. add ( b3 );``  ``f. add ( b4 );``  ``f. add ( b5 );``  ``f. pack ( );``  ``f. setVisible ( ``true` `); } ``}
```

**例10-3** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/a5.png)

**例10-3** 的程序分析：

主类GridEx包含6个成员变量：1个JFrame窗口、5个按钮；2个成员方法：mian()方法和go()方法。其中，go()方法创建窗口，设置窗口布局管理器为网格布局，并添加了5个按钮，最后设置窗口为显示状态。mian()方法创建了一个主类对象，然后在这个对象上调用go()方法，显示窗口。

**注意：**网格每行的高度也是相同的，等于容器的高度除以网格的行数。组件被放入容器的次序决定了它在容器中所占的位置。组件从第一行开始从左至右填充，一行放完转到下行。



### null布局与setBounds()方法

空布局就是把一个容器的布局管理器设置为null布局。当把一个容器的布局管理器设置为null布局的时候，可以使用setBounds()方法手工设置组件本身的大小和组件在容器中的位置。

设置容器的布局为空布局的方法：

setLayout(null)

当容器的布局管理器 null布局时，摆放组件的方法：

setBounds(int x, int y, int width, int height) ，x和y确定组件左上角顶点在容器中的坐标，width和height确定组件的宽度和高度。

当容器的布局管理器为 null 布局时，与组件相关的其它方法：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getSize().width

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getSize().height

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setVgap(int vgap)

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setHgap(int hgap)

**例10-4** null布局与手工摆放组件的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.6.html?node=858292619&detailRecordId=1318913831&studyrecordId=1225624963&sectionRecordId=1229924128#)

```
import` `javax.swing.*;``import` `java.awt.*;` `class` `MyJFrameN ``extends` `JFrame {`` ``Container conPane = ``null``;`` ``JButton jbtn1 = ``new` `JButton(``"Hello!"``);`` ``JButton jbtn2 = ``new` `JButton(``"你好！"``);`` ``public` `MyJFrameN(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``conPane = getContentPane();``  ``conPane.setLayout(``null``);``  ``add(jbtn1);``  ``jbtn1.setBounds(``20``, ``30``, ``70``, ``30``);``  ``add(jbtn2);``  ``jbtn2.setBounds(``100``, ``50``, ``80``, ``30``);``  ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}``}``public` `class` `NullLayoutApp1 {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameN mw = ``new` `MyJFrameN(str1, ``250``, ``200``);``  ``mw.setVisible(``true``);`` ``}``}
```

**例10-4** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/a6.png)

**例10-4** 的程序分析：

MyJFrameN类继承自系统类JFrame，它的实例就是一个窗口。MyJFrameN类持有的数据成员包括：一个容器和两个按钮。

MyJFrameN类的构造方法用接收到的实参设置窗口标题，初始宽度和高度，获取并设置窗口内容面板的布局管理器设置null，之后添加两个按钮并手工摆放它们的位置，最后设置窗口关闭时结束程序。

主类的main()方法控制程序的主流程。主流程创建窗口对象，并设置窗口为显示状态。

## **10.7 常用组件**

### 主体内容

组件是构成图形界面的基本元素，用户可以直接操作组件。本节介绍常见组件。



### 标签

点击折叠

JLabel 类或它的子类创建的对象就是标签对象。标签对象的作用是对位于其后的组件做说明。

标签的主要构造方法：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JLabel() ，构造一个无显示文字的标签

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JLabel(String s) ，构造一个显示文字为字符串s的标签

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JLabel(String s, int align) ，构造一个显示文字为字符串 s 的标签。Align为显示文字的水平对齐方式。

**例10-5** 标签的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.7.html?node=858292620&detailRecordId=1318913832&studyrecordId=1225624963&sectionRecordId=1229924127#)

```
import` `java.awt.*; ``import` `javax.swing.*;` `class` `MyJFrameLabel ``extends` `JFrame {`` ``Container conPane = ``null``;`` ``public` `MyJFrameLabel(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `FlowLayout());``  ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}``}``public` `class` `JLabelApp {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameLabel mw =``   ``new` `MyJFrameLabel(str1, ``250``, ``200``);``  ``JLabel jlbl1 = ``new` `JLabel(``"Hello！"``, JLabel.CENTER);``  ``JLabel jlbl2 = ``new` `JLabel(``"你好！"``, JLabel.CENTER);``  ``mw.conPane.add(jlbl1);``  ``mw.conPane.add(jlbl2);``  ``mw.setVisible(``true``);`` ``}``}
```

**例10-5** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/b1.png)

**例10-5** 的程序分析：

MyJFrameLabel类继承自系统类JFrame，它的实例就是一个窗口。MyJFrameLabel类持有一个Container类的对象变量conPan作为其数据成员。构造方法中获取窗口对象的内容面板，并把内容面板的引用赋给conPan，这样，后面任何时候想使用窗口的内容面板的时候，直接使用conPan即可，而不必每次都执行一次getContentPane()方法。

主类的main()方法控制程序的主流程。主流程创建窗口对象，在窗口中添加两个标签，并设置窗口为显示状态。



### 按钮

JButton类或它的子类创建的对象就是按钮对象。按钮可显示文本，能激发动作事件（ActionEvent） 。

JButton类的主要构造方法：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JButton() ，创建一个没有标题的按钮对象

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JButton(String s) ，创建一个标题为s的按钮对象

按钮可以产生 ActionEvent事件，使用 ActionListener接口处理该事件。

**例10-6** 标签的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.7.html?node=858292620&detailRecordId=1318913832&studyrecordId=1225624963&sectionRecordId=1229924127#)

```
import` `java.awt.*;``import` `javax.swing.*;``import` `java.awt.event.*;` `class` `MyJFrameJButton ``extends` `JFrame ``implements` `WindowListener, ActionListener {`` ``Container conPane = ``null``;`` ``public` `MyJFrameJButton(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``addWindowListener(``this``);``  ``conPane = getContentPane();``  ``conPane.setBackground(Color.BLUE);``  ``conPane.setLayout(``new` `FlowLayout());``  ``JButton redBut = ``new` `JButton(``"Red"``);``  ``redBut.addActionListener(``this``);``  ``conPane.add(redBut);``  ``JButton greenBut = ``new` `JButton(``"Green"``);``  ``greenBut.addActionListener(``this``);``  ``conPane.add(greenBut);`` ``}`` ` ` ``// 实现 WindowListioner 中的方法`` ``public` `void` `windowClosing(WindowEvent e) {System.exit(``0``);}`` ``public` `void` `windowClosed(WindowEvent e) { }`` ``public` `void` `windowOpened(WindowEvent e) { }`` ``public` `void` `windowIconified(WindowEvent e) { }`` ``public` `void` `windowDeiconified(WindowEvent e) { }`` ``public` `void` `windowActivated(WindowEvent e) { }`` ``public` `void` `windowDeactivated(WindowEvent e) { }`` ` ` ``// 实现 ActionListener 中的方法`` ``public` `void` `actionPerformed(ActionEvent e) {``  ``if` `(e.getActionCommand().equals(``"Red"``))``   ``conPane.setBackground(Color.RED);``  ``else` `if` `(e.getActionCommand().equals(``"Green"``))``   ``conPane.setBackground(Color.GREEN);``  ``else` `{}`` ``}``}` `public` `class` `JButtonApp{`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameJButton mw = ``new` `MyJFrameJButton(str1, ``250``, ``200``);``  ``mw.setVisible(``true``);`` ``}``}
```

**例10-6** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/b2.png)

**例10-6** 的程序分析：

MyJFrameJButton类继承自系统类JFrame，它的实例就是一个窗口。MyJFrameJButton类实现了两个接口——WindowListener和ActionListener，这样，它的实例就同时具备处理窗口时间和组件激活事件的能力。

窗口的内容面板上放置了两个按钮。用户用鼠标点击按钮的时候，产生组件激活事件，Java运行时系统会根据用户在按钮上的这个操作，产生代表该组件激活事件的对象，并把该对象交给事件处理机制。Java的事件处理机制会以接收到的这个组件激活事件对象为实参，调用窗口对象的actionPerformed(ActionEvent e)方法去处理。actionPerformed(ActionEvent e)方法用代码e.getActionCommand()获取事件的命令字符串，判断事件源是“Red”按钮还是“Green”按钮，如果是“Red”按钮则将内容面板设置为红色，如果是“Green”按钮则将内容面板设置为绿色。

本程序只处理一个窗口事件，就是窗口关闭事件，当关闭窗口时执行语句“System.exit(0);”，结束程序。

要点1：事件处理的注意事项

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 组件不同，激发的事件类型也不同

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 不同类型的事件，需要使用的事件监听接口也不同。需要用正确的事件监听接口才能处理相应的事件

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 每个界面元素激发事件时，都有一个字符串与这个事件相对应，这个字符串称为 action 命令字符串。用代码 e.getActionCommand() 能够获取事件 e 的命令字符串，从而知道是哪一个组件激发的事件。如果有必要，可以用方法 setActionCommand() 方法为界面组件设置命令字符串。在默认情况下，按钮的命令字符串就是按钮上面的文字。



### 文本框和密码框

文本框的概念

JTextField 类或它的子类创建的对象就是文本框对象。文本框用于输入输出一行文本。与文本框相关的事件处理接口是 ActionListener。

JTextField 类的主要构造方法

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JTextField() ，创建一个文本框，字符长度为1

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JTextField(int columns) ，创建一个初始值为空字符串的文本框，字符长度为 columns

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JTextField(String text) ，创建一个初始值为 text 的字符串

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JTextField(String text, int columns) ，创建一个初始值为 text 的字符串，字符长度为 columns

密码框(JPasswordField) 是一个单行的输入组件，与 JTextField 基本类似。 密码框多一个屏蔽功能，即当用书输入数据时，用一个特别的字符（一般是*字符）输出。

**例10-7** 文本框的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.7.html?node=858292620&detailRecordId=1318913832&studyrecordId=1225624963&sectionRecordId=1229924127#)

```
import` `java.awt.*;``import` `javax.swing.*;``import` `java.awt.event.*;` `class` `MyJFrameJTextField ``extends` `JFrame ``implements` `ActionListener {`` ``Container conPane = ``null``;`` ``JTextField text1, text2;`` ``public` `MyJFrameJTextField(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `FlowLayout());``  ``text1 = ``new` `JTextField(``10``);``  ``text2 = ``new` `JTextField(``10``);``  ``conPane.add(text1);``  ``conPane.add(text2);``  ``text1.addActionListener(``this``);``  ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ``public` `void` `actionPerformed(ActionEvent e) {``  ``if` `(e.getSource() == text1) {``   ``long` `n = Long.parseLong(text1.getText());``    ``text2.setText(String.valueOf(n * n));``  ``}`` ``}``}` `public` `class` `JTextFieldApp {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameJTextField wt =``   ``new` `MyJFrameJTextField(str1, ``250``, ``200``);``  ``wt.setVisible(``true``);`` ``}``}
```

**例10-7** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/b3.png)

**例10-7** 的程序分析：

MyJFrameJTextField类的实例是一个窗口，并且该类实现了ActionListener接口，具有处理ActionEvent事件的能力。它的构造方法对窗口对象做初始化，向窗口的内容面板上添加了两个文本框，并为第一个文本框text1注册了事件监听者。这里所用的事件监听者用this引用指定，也就是使用当前窗口对象作为事件监听者。

用户在第一个文本框中输入一个数值，按下回车键，激活组件，则第二个文本框中显示该值的平方。



### 择框和单选按钮

选择组件可以让用户在一组选择项目中做选择。选择组件有两种状态，一种是选中(on) ，另一种是未选中(off) ，程序根据选择组件的不同状态做不同的处理。选择框、单选框和单选按钮是一类选择组件，列表框和组合框是另一类选择组件。

**例10-8** 选择框和单选按钮的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.7.html?node=858292620&detailRecordId=1318913832&studyrecordId=1225624963&sectionRecordId=1229924127#)

```
import` `java.awt.*;``import` `javax.swing.*;``import` `java.awt.event.*;` `class` `Panel1 ``extends` `JPanel {`` ``JRadioButton box1, box2, box3;`` ``ButtonGroup g;` ` ``Panel1() {``  ``setLayout(``new` `GridLayout(``1``, ``3``));``  ``box1 = ``new` `JRadioButton(MyWindowSle.fName[``0``] + ``"计算机"``, ``false``);``  ``box2 = ``new` `JRadioButton(MyWindowSle.fName[``1``] + ``"计算机"``, ``false``);``  ``box3 = ``new` `JRadioButton(MyWindowSle.fName[``2``] + ``"计算机"``, ``false``);``  ``g = ``new` `ButtonGroup();``  ``g.add(box1);``  ``g.add(box2);``  ``g.add(box3);``  ``add(box1);``  ``add(box2);``  ``add(box3);``  ``add(``new` `JLabel(``"计算机3选1"``));`` ``}``}` `class` `Panel2 ``extends` `JPanel {`` ``JCheckBox box1, box2, box3;`` ``ButtonGroup g;`` ` ` ``Panel2() {``  ``setLayout(``new` `GridLayout(``1``, ``3``));``  ``box1 = ``new` `JCheckBox(``"购买1台"``);``  ``box2 = ``new` `JCheckBox(``"购买2台"``);``  ``box3 = ``new` `JCheckBox(``"购买3台"``);``  ``g = ``new` `ButtonGroup();``  ``g.add(box1);``  ``g.add(box2);``  ``g.add(box3);``  ``add(box1);``  ``add(box2);``  ``add(box3);``  ``add(``new` `JLabel(``"选择1、2或3"``));`` ``}``}` `class` `MyWindowSle ``extends` `JFrame ``implements` `ItemListener {`` ``Panel1 panel1;`` ``Panel2 panel2;`` ``JLabel label1, label2;`` ``JTextArea text1, text2;`` ``static` `String[] fName = {``"HP"``, ``"IBM"``, ``"DELL"``};`` ``static` `double``[][] priTbl = ``  ``{{``1.20``, ``1.15``, ``1.10``}, {``1.70``, ``1.65``, ``1.60``}, {``1.65``, ``1.60``, ``1.58``}}; ``// 产品数量价格对照表`` ``static` `int` `production = -``1``; ``// 产品标志`` ` ` ``MyWindowSle(String s) {``  ``super``(s);``  ``Container con = ``this``.getContentPane();``  ``con.setLayout(``new` `GridLayout(``3``, ``2``));``  ``this``.setLocation(``100``, ``100``);``  ``this``.setSize(``400``, ``100``);``  ``panel1 = ``new` `Panel1();``  ``panel2 = ``new` `Panel2();``  ``label1 = ``new` `JLabel(``"产品介绍"``, JLabel.CENTER);``  ``label2 = ``new` `JLabel(``"产品价格"``, JLabel.CENTER);``  ``text1 = ``new` `JTextArea();``  ``text2 = ``new` `JTextArea();``  ``con.add(label1);``  ``con.add(label2);``  ``con.add(panel1);``  ``con.add(panel2);``  ``con.add(text1);``  ``con.add(text2);``  ``panel1.box1.addItemListener(``this``);``  ``panel1.box2.addItemListener(``this``);``  ``panel1.box3.addItemListener(``this``);``  ``panel2.box1.addItemListener(``this``);``  ``panel2.box2.addItemListener(``this``);``  ``panel2.box3.addItemListener(``this``);``  ``this``.setVisible(``true``);``  ``this``.pack();`` ``}`` ` ` ``public` `void` `itemStateChanged(ItemEvent e) {``  ``if` `(e.getItemSelectable() == panel1.box1) {``   ``production = ``0``;``   ``text1.setText(fName[``0``] + ``"公司生产"``);``   ``text2.setText(``""``);``  ``} ``else` `if` `(e.getItemSelectable() == panel1.box2) {``   ``production = ``1``;``   ``text1.setText(fName[``1``] + ``"公司生产"``);``   ``text2.setText(``""``);``  ``} ``else` `if` `(e.getItemSelectable() == panel1.box3) {``   ``production = ``2``;``   ``text1.setText(fName[``2``] + ``"公司生产"``);``   ``text2.setText(``""``);``  ``} ``else` `{``   ``if` `(production == -``1``) ``return``;``   ``if` `(e.getItemSelectable() == panel2.box1) {``    ``text2.setText(``""` `+ priTbl[production][``0``] + ``"万元/台"``);``   ``} ``else` `if` `(e.getItemSelectable() == panel2.box2) {``    ``text2.setText(``""` `+ priTbl[production][``1``] + ``"万元/台"``);``   ``} ``else` `if` `(e.getItemSelectable() == panel2.box3) {``    ``text2.setText(``""` `+ priTbl[production][``2``] + ``"万元/台"``);``   ``}``  ``}`` ``}``}` `public` `class` `SleApp {`` ``public` `static` `void` `main(String[] args) {``  ``MyWindowSle myWin = ``new` `MyWindowSle(``"选项项目处理示例程序"``);;``  ``myWin.setVisible(``true``);`` ``}``}
```

**例10-8** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/b4.png)

**例10-8** 的程序分析：

在窗口的构造方法中创建两个标签、两个文本框和两个面板。在第一个面板上放置了三个单选按钮，第二个面板上放置了三个复选框。把这些组件放置到窗口的内容面板上。最后编写了ItemEvent事件处理代码。



### 列表和组合框

点击折叠

列表和组合框是又一类供用户选择的界面组件，用于在一组选择项目选择，组合框还可以输入新的选择。

列表(JList)在界面中表现为列表框，是JList类或它的子类的对象。程序可以在列表框中加入多个文本选择项条目。列表事件的事件源有两种：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 一是鼠标双击某个选项：双击选项是动作事件，与该事件相关的接口是ActionListener，注册监视器的方法是addActionListener()，接口方法是actionPerformed(ActionEvent e)。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 二是鼠标单击某个选项：单击选项是选项事件，与选项事件相关的接口是ListSelectionListener,注册监视器的方法是addListSelectionListener,接口方法是valueChanged(ListSelectionEvent e)。

**JList 类的常用构造方法：**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JList()：建立一个列表。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JList(String list[])：建立列表，list是字符串数组，数组元素是列表的选择条目。

**List类的常用方法：**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getSelectedIndex()：获取选项的索引。返回最小的选择单元索引；只选择了列表中单个项时，返回该选择。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getSelectedValue()：获取选项的值。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getSelectedIndices()：返回所选的全部索引的数组（按升序排列）。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getSelectedValues(),：返回所有选择值的数组，根据其列表中的索引顺序按升序排序。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getItemCount()：获取列表中的条数。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setVisibleRowCount(int n)：设置列表可见行数。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setSelectionMode(int seleMode)：设置列表选择模型。选择模型有单选和多选两种。

√ 单选：ListSelectionModel.SINGLE_SELECTION.

√ 多选：ListSelectionModel.MULTIPLE.INTERVAL_SELECTION.

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) remove(int n)：从列表的选项菜单中删除指定索引的选项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) removeAll()：删除列表中的全部选项。

列表可以添加滚动条，列表添加滚动条的方法是先创建列表，然后再创建一个JScrollPane滚动面板对象，在创建滚动面板对象时指定列表。以下代码示意为列表list2添加滚动条：

JScrollPane jsp = new JScrollPane(list2);

**例10-9**列表的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.7.html?node=858292620&detailRecordId=1318913832&studyrecordId=1225624963&sectionRecordId=1229924127#)

```
package` `com.buptnu;` `import` `java.applet.*;``import` `javax.swing.*;``import` `java.awt.*;``import` `javax.swing.event.*; ``// ListSelectionListener 在此类库中定义` `class` `MyJFrameList ``extends` `JFrame ``implements` `ListSelectionListener``{`` ``Container con = ``null``;`` ``JList list1, list2;`` ``String[] news = {``"人民日报"``, ``"新民晚报"``, ``"浙江日报"``, ``"文汇报"``};`` ``String[] sports = {``"足球"``, ``"篮球"``, ``"排球"``, ``"乒乓球"``, ``"羽毛球"``};`` ``JTextArea text;`` ``public` `MyJFrameList(String name) {``  ``super``();``  ``setTitle(name);``  ``con = getContentPane();``  ``con.setBackground(Color.BLUE);``  ``con.setLayout(``new` `GridLayout(``2``, ``2``));``  ``con.setSize(``250``, ``200``); ``// 此时好像没起作用，先注释掉看看 ``  ``list1 = ``new` `JList(news);``  ``list1.setVisibleRowCount(``3``); ``// 把 JList 对象放到 JScrollPane 对象上之后这个选项才有效``      ``// 而且这个选项的显示效果和使用的布局管理器有关。使用FlowLayout``      ``// 效果比较明显。当使用GridLayout时，只有窗口的足够小的时候才看到效果，``      ``// 否则会显示全部列表项``  ``list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); ``  ``list1.addListSelectionListener(``this``);``  ``list2 = ``new` `JList(sports);``  ``list2.setVisibleRowCount(``2``);``  ``list2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); ``// 这个选项容易造成误解。这实际上时起作用的``    ``// 在运行程序时，你要同时选择多个选项应该 按住CTRL键，同时点击每个项目,``    ``// 若是相邻的则按住SHIFT……``    ``// 若是什么键都不按，则每次就选一个。看起来和SINGLE_SELECTION差不多``    ``// 单实际上是不同的。``  ``list2.addListSelectionListener(``this``);``  ``JScrollPane listScrollPane1 = ``new` `JScrollPane(list1);``  ``listScrollPane1.setViewportView(list1);``  ` `  ``JScrollPane listScrollPane2 = ``new` `JScrollPane(list2);``  ``con.add(listScrollPane1);``  ``con.add(listScrollPane2);``  ``text = ``new` `JTextArea(``10``,``20``);``  ``con.add(text);``  ` `  ``//text.setText("" + list1.getVisibleRowCount());``  ` `  ``this``.setVisible(``true``);``  ``this``.pack();``  ` `  ``/* 关闭窗口时退出程序 */``  ``/* 当用 Applet 启动 JFrame 窗口时，不能用这句话，否则会引起安全控制问题。*/``  ``/* 当关闭 Applet 窗口时，JFrame 窗口回自动关闭，同时也会退出应用程序。*/``  ``//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ``public` `void` `valueChanged(ListSelectionEvent e) {``  ``if` `(e.getSource() == list1) {``   ``text.setText(``null``);``   ``Object ListValue = ((JList)e.getSource()).getSelectedValue();``   ``String seleName = ListValue.toString();``   ``for` `(``int` `i = ``0``; i < news.length; i++)``    ``if` `(news[i].equals(seleName)) {``     ``text.append(seleName + ``"：被选中\n"``);``    ``}``  ``} ``else` `if` `(e.getSource() == list2) {``   ``text.setText(``null``);``   ``int` `tempList[] = list2.getSelectedIndices();``   ``for` `(``int` `i = ``0``; i < tempList.length; i++) {``    ``text.append(sports[tempList[i]] + ``"：被选中\n"``);``    ``//text.append(tempList.length + "");``   ``}``   ` `  ``}`` ``}``}` `public` `class` `ListApp{`` ``public` `static` `void` `main(String[] args) {``  ``// TODO Auto-generated method stub``  ``MyJFrameList myWin = ``new` `MyJFrameList(``"列表示例"``);`` ``}``}
```

**例10-9** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/b5.png)

**例10-9** 的程序分析：

程序有两个列表，第一个列表只允许单选，第二个列表允许多选。

JList对象本身不具有滚动功能，需要把它放到一个滚动面板中，才能看到结果。如果不把它放到滚动面板中，“setVisibleRowCount(3);”是无效的，列表会全部显示。

组合框(JComboBox)是文本框和列表的组合，可以在文本框中输入选项，也可以单击下拉按钮从显示的列表中进行选择。

**组合框的常用构造方法：**

√ JComboBox()：建立一个没有选项的JComboBox对象。

√ JComboBox(JComboBoxModel aModel)：用数据模型建立一个JComboBox对象。

√ JComboBox(Object[]items)：利用数组对象建立一个JComboBox对象。

**组合框的其他常用方法有以下几个：**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) addItem(Object obj)：向组合框加选项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getItemCount()：获取组合框的条目总数。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) removeItem(Object ob)：删除指定选项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) removeItemAt(int index)：删除指定索引的选项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) insertItemAt(Object ob,int index)：在指定的索引处插入选项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getSelectedIndex()：获取所选项的索引值(从0开始)。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getSelectedItem()：获得所选项的内容

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setEditable(boolean b)：设为可编辑。组合框的默认状态是不可编辑的，需要调用本方法设定为可编辑，才能响应选择输入事件。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 在JComboBox对象上发生事件分为两类。一是用户选定项目，事件响应程序获取用户所选的项目。二是用户输入项目后按回车键，事件响应程序读取用户的输入。第一类事件的接口是ItemListener;第二类事件是输入事件，接口是ActionListener。

**例10-10** 组合框的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.7.html?node=858292620&detailRecordId=1318913832&studyrecordId=1225624963&sectionRecordId=1229924127#)

```
package` `com.buptnu;` `import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameJComboBox ``extends` `JFrame ``implements` `ActionListener, ItemListener {`` ``public` `static` `final` `int` `Width = ``350``;`` ``public` `static` `final` `int` `Height = ``150``;`` ``String[] proList = {``"踢足球"``, ``"打蓝球"``, ``"打排球"``};`` ``JTextField text;`` ``JComboBox comboBox;`` ``Container conPane = ``null``;`` ``public` `MyJFrameJComboBox() {``  ``super``();``  ``setTitle(``"组合框示例"``);``  ``setSize(Width, Height);``  ``conPane = getContentPane();``  ``conPane.setBackground(Color.BLUE);``  ``conPane.setLayout(``new` `FlowLayout());``  ``comboBox = ``new` `JComboBox(proList);``  ``comboBox.addActionListener(``this``);``  ``comboBox.addItemListener(``this``);``  ``comboBox.setEditable(``true``);``  ``conPane.add(comboBox);``  ``text = ``new` `JTextField(``10``);``  ``conPane.add(text);``  ``this``.setVisible(``true``);``  ` `  ``/* 关闭窗口时退出程序 */``  ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ``public` `void` `actionPerformed(ActionEvent e) {``  ``if` `(e.getSource() == comboBox) {``   ``text.setText(comboBox.getSelectedItem().toString());``  ``}`` ``}`` ``public` `void` `itemStateChanged(ItemEvent e) {``  ``if` `(e.getSource() == comboBox) {``   ``text.setText(comboBox.getSelectedItem().toString());``  ``}`` ``}``}` `public` `class` `JComboBoxApp1 {`` ``public` `static` `void` `main(String[] args) {``  ``MyJFrameJComboBox mw = ``new` `MyJFrameJComboBox();`` ``}``}
```

**例10-10** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/b6.png)

**例10-10** 的程序分析：

程序中用数组porList初始化组合框，对列表框的组件激活事件和项目选择时间进行了处理。



### 滚动条

滚动条也称为滑块，用来表示一个相对值，该值代表指定范围内的一个整数。 Swing 中，用 JSCrollBar 类实现和管理可调界面。 JSCrollBar 类对象的事件处理事件类型是 AdjustmentEvents，要实现的事件监听接口的方法是 adjustmentValueChanaged()，注册事件监听器的方法是 addAdjustmentListener()，获取事件源对象的方法是 getAdjustable()。

**例10-11** 滚动条的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.7.html?node=858292620&detailRecordId=1318913832&studyrecordId=1225624963&sectionRecordId=1229924127#)

```
package` `com.buptnu;` `import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyScrollBar ``extends` `JScrollBar{`` ``public` `MyScrollBar(``int` `init, ``int` `len, ``int` `low, ``int` `high) {``  ``super``(JScrollBar.HORIZONTAL, init, len, low, high);`` ``}`` ` `  ``// getPreferredSize() 方法是窗口的画图系统自动调用的，``  ``// 具体点就是布局管理器在布局组件时调用的。``  ``// 详细信息可以看看 jdk 的源代码。``  ` ` ``public` `Dimension getPreferredSize() {``  ``return` `new` `Dimension(``125``, ``20``);`` ``}``}` `class` `MyJFrameJScrollBar ``extends` `JFrame ``implements` `ActionListener, AdjustmentListener {`` ``private` `JButton btn;`` ``private` `JTextField text;`` ``private` `boolean` `barOpened;`` ` ` ``Container conPane = ``null``;`` ` ` ``// 构造方法`` ``public` `MyJFrameJScrollBar(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``setLocation(``100``, ``100``);``  ` `  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `GridLayout(``2``, ``1``));``  ` `  ``btn = ``new` `JButton(``"开/闭滚动条"``);``  ``btn.addActionListener(``this``);``  ``barOpened = ``false``; ``// 记录点击按钮后滚动条是打开还是关闭状态``  ` `  ``MyScrollBar tempBar = ``new` `MyScrollBar(``10``, ``10``, ``0``, ``255``);``  ``tempBar.addAdjustmentListener(``this``);``  ``text = ``new` `JTextField(``"滚动条关闭"``, ``20``);``  ` `  ``conPane.add(btn);``  ``conPane.add(text);``  ``conPane.add(tempBar);``  ``//setVisible(true);``  ``pack();``  ` `  ``/* 关闭窗口时退出程序 */``  ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ` ` ``// 实现 ActionListener 中的方法`` ``public` `void` `actionPerformed(ActionEvent e) {``  ``if` `(e.getSource() == btn) {``   ``if` `(barOpened)``    ``text.setText(``"滚动条关闭"``);``   ``else``    ``text.setText(``"滚动条打开"``);``   ``barOpened = !barOpened;``  ``}`` ``}`` ` ` ``// 实现 AdjustmentListener 中的方法`` ``public` `void` `adjustmentValueChanged(AdjustmentEvent e) {``  ``if` `(barOpened) {``   ``MyScrollBar myBar = (MyScrollBar)e.getAdjustable();``   ``text.setText(``"选择的值是："` `+ myBar.getValue());``  ``}`` ``}`` ` `}` `public` `class` `JScrollBarApp {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameJScrollBar mw = ``new` `MyJFrameJScrollBar(str1, ``250``, ``200``);``  ``mw.setVisible(``true``);`` ``}``}
```

**例10-11** 的运行结果：

程序的初始界面如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/b7.png)

点击“开/闭”滚动条按钮，然后滑动滚动条，如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/b8.png)

**例10-11** 的程序分析：

系统类JScrollBar用于创建滚动条。MyScrollBar继承自JScrollBar，它的实例是一个自定义滚动条。JScrollBar.HORIZONTAL用于设置滚动条是水平滚动条。

## **10.8 菜单**

### 菜单概述

菜单分为下拉式菜单和弹出式菜单两种。本课程只要求掌握下拉式菜单的使用。

有三个基本概念：菜单条、菜单和菜单项，其基本含义如10.4所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_9.png)

**图10.4 菜单条、菜单和菜单项**

一个菜单条可以放多个菜单，每个菜单又可以放多个菜单项。菜单中的菜单项也可以是一个完整的菜单，因而可以构造一个层次状菜单结构。



### 一个简单的菜单程序

点击折叠

给窗口添加菜单的基本过程可以分为如下四步：

（1）创建所需要的菜单条对象、菜单对象和菜单项对象

（2）把菜单项添加到菜单对象

（3）把菜单添加到菜单条对象

（4）把装配好的菜单条对象添加的窗口对象

**(a)菜单条**

类JMenuBar的实例就是菜单条。例如，以下代码创建菜单条对象menubar：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.8.html?node=858292621&detailRecordId=1318913833&studyrecordId=1225624963&sectionRecordId=1229924130#)

```
JMenuBar menubar = ``new` `JMenuBar();
```

在窗口中增设菜单条，必须使用JFrame类中的setJMenuBar()方法。例如，代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.8.html?node=858292621&detailRecordId=1318913833&studyrecordId=1225624963&sectionRecordId=1229924130#)

```
setJMenuBar(menubar);
```

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 类JMenuBar的常用方法有：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) add(JMenu m)：将菜单m加入到菜单条中。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) countJMenus()：获得菜单条中菜单条数。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getJMenu(int p)：取得菜单条中的菜单。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) remove(JMenu m)：删除菜单条中的菜单m。

**(b)菜单**

由类JMenu创建的对象就是菜单。类JMenu的常用方法如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JMenu()：建立一个空标题的菜单。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JMenu(String s)：建立一个标题为s的菜单。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) add(JMenuItem item)：向菜单增加由参数item指定的菜单选项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) add(JMenu menu)：向菜单增加由参数menu指定的菜单。实现在菜单嵌入子菜单。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) addSeparator()：在菜单选项之间画一条分隔线。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getItem(int n)：得到指定索引处的菜单项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getItemCount()：得到菜单项数目。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) insert(JMenuItem item,int n)：在菜单的位置n插入菜单项item。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) remove(int n)：删除菜单位置n的菜单项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) removeAll()：删除菜单的所有菜单项。

**(c)菜单项**

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) 类JMenuItem 的实例就是菜单项。类JMenuItem的常用方法如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JMenuItem()：构造无标题的菜单项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JMenuItem(String s)：构造有标题的菜单项。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setEnabled(boolean b)：设置当前单项是否可被选择。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) isEnabled()：返回当前菜单项是否可被用户选择。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getLabel()：得到菜单项的名称。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setLabel()：设置菜单选项的名称。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) addActionListener(ActionListener e)：为菜单项设置监视器。监视器接受点击某个菜单的动作事件。

**(d)处理菜单事件**

菜单的事件源是用鼠标点击某个菜单项。处理该事件的接口是ActionListener,要实现的接口方法是actionPerformed(ActionEvent e),获得事件源的方法getSource().

**例10-12**菜单的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.8.html?node=858292621&detailRecordId=1318913833&studyrecordId=1225624963&sectionRecordId=1229924130#)

```
 ``运行时，先选 ``new` `菜单，然后再选其它菜单，可以看到运行结果。`` ` `package` `com.buptnu;` `import` `java.applet.*;``import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameJManu ``extends` `JFrame ``implements` `ActionListener {`` ` ` ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区`` ` ` ``// 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。`` ``// 在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameJManu 的成员变量`` ``// 以后就可以直接引用这个成员变量。`` ` ` ``Container conPane = ``null``;`` ` ` ``// 构造方法`` ``public` `MyJFrameJManu(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``setLocation(``100``, ``100``);``  ` `  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `BorderLayout());``  ` `  ``JMenuBar mnb = ``new` `JMenuBar();``  ` `  ``JMenu fileMenu = ``new` `JMenu(``"File"``);``  ``JMenuItem newItem = ``new` `JMenuItem(``"New"``);``  ``JMenuItem openItem = ``new` `JMenuItem(``"Open"``);``  ``JMenuItem saveItem = ``new` `JMenuItem(``"Save"``);``  ``JMenuItem exitItem = ``new` `JMenuItem(``"Exit"``);``  ``newItem.addActionListener(``this``);``  ``openItem.addActionListener(``this``);``  ``saveItem.addActionListener(``this``);``  ``exitItem.addActionListener(``this``);``  ``fileMenu.add(newItem);``  ``fileMenu.add(openItem);``  ``fileMenu.add(saveItem);``  ``fileMenu.addSeparator();``  ``fileMenu.add(exitItem);``  ``mnb.add(fileMenu);``  ` `  ``JMenu editMenu = ``new` `JMenu(``"Edit"``);``  ``JMenuItem copyItem = ``new` `JMenuItem(``"Copy"``);``  ``JMenuItem pasteItem = ``new` `JMenuItem(``"Paste"``);``  ``copyItem.addActionListener(``this``);``  ``pasteItem.addActionListener(``this``);``  ``editMenu.add(copyItem);``  ``editMenu.add(pasteItem);``  ``mnb.add(editMenu);` `  ``setJMenuBar(mnb);``  ` `  ``/* 关闭窗口时退出程序 */``  ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ` ` ``// 实现 ActionListener 中的方法`` ``public` `void` `actionPerformed(ActionEvent e) {``  ` `  ``if` `(e.getActionCommand() == ``"Exit"``) {``   ``System.exit(``0``);``  ``} ``else` `if` `(e.getActionCommand() == ``"New"``) {``   ``//text = new JTextArea();``   ``conPane.add(text, BorderLayout.CENTER);``   ` `   ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``  ``} ``else` `{``   ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``  ``}`` ``}`` ` `}` `public` `class` `JManuApp1 {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"菜单的例子"``;``  ``MyJFrameJManu mw = ``new` `MyJFrameJManu(str1, ``250``, ``200``);``  ``mw.setVisible(``true``); ``// 如果在先设置菜单之前就调用此方法，那么之后添加的菜单就不能显示了。``     ``// 所以要等其他工作做完，最后再调用此方法。`` ``}``}
```

**例10-12** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_10.png)

**例10-12** 的程序分析：

程序中先创建菜单条、菜单、菜单项，给菜单项注册事件监听者（事件监听者就是当前窗口）。之后把菜单项添加到菜单上，再把菜单添加到菜单条上，最后把菜单条添加到窗口上。

程序中使用代码 e.getActionCommand() 能够获取事件 e 的命令字符串，从而知道是哪一个组件激发的事件，然后根据事件源的不同分别做不同处理。



### 嵌入子菜单

点击折叠

创建了一个菜单，并创建多个菜单项，其中某个菜单项又是一个(含其他菜单项的)菜单，这就构成菜单嵌套。

**例10-13** 嵌入子菜单的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.8.html?node=858292621&detailRecordId=1318913833&studyrecordId=1225624963&sectionRecordId=1229924130#)

```
// 运行时，先选 new 菜单，然后再选其它菜单，可以看到运行结果。`` ` `package` `com.buptnu;` `import` `java.applet.*;``import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameJManu2 ``extends` `JFrame ``implements` `ActionListener {`` ` ` ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区`` ` ` ``// 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。``  ``// 在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameJManu2 的成员变量``  ``// 以后就可以直接引用这个成员变量。``  ` ` ``Container conPane = ``null``;`` ` ` ``// 构造方法`` ``public` `MyJFrameJManu2(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``setLocation(``100``, ``100``);``  ` `  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `BorderLayout());``  ` `  ``JMenuBar mnb = ``new` `JMenuBar();``  ` `  ``JMenu fileMenu = ``new` `JMenu(``"File"``);``  ``JMenuItem newItem = ``new` `JMenuItem(``"New"``);``  ``JMenuItem openItem = ``new` `JMenuItem(``"Open"``);``  ``JMenuItem saveItem = ``new` `JMenuItem(``"Save"``);``  ``JMenuItem exitItem = ``new` `JMenuItem(``"Exit"``);``  ``newItem.addActionListener(``this``);``  ``openItem.addActionListener(``this``);``  ``saveItem.addActionListener(``this``);``  ``exitItem.addActionListener(``this``);``  ``fileMenu.add(newItem);``  ``fileMenu.add(openItem);``  ``fileMenu.add(saveItem);``  ``fileMenu.addSeparator();``  ``fileMenu.add(exitItem);``  ``mnb.add(fileMenu);``  ` `  ``JMenu editMenu = ``new` `JMenu(``"Edit"``);``  ``JMenuItem copyItem = ``new` `JMenuItem(``"Copy"``);``  ``JMenuItem pasteItem = ``new` `JMenuItem(``"Paste"``);``  ``copyItem.addActionListener(``this``);``  ``pasteItem.addActionListener(``this``);``  ``editMenu.add(copyItem);``  ``editMenu.add(pasteItem);``  ``// 子菜单的例子``  ``JMenu insertElementMenu = ``new` `JMenu(``"Insert"``);``  ``JMenuItem insertImageItem = ``new` `JMenuItem(``"Image"``);``  ``JMenuItem insertSoundItem = ``new` `JMenuItem(``"Sound"``);``  ``insertImageItem.addActionListener(``this``);``  ``insertSoundItem.addActionListener(``this``);``  ``insertElementMenu.add(insertImageItem);``  ``insertElementMenu.add(insertSoundItem);``  ``editMenu.addSeparator();``  ``editMenu.add(insertElementMenu);``  ``mnb.add(editMenu);` `  ``setJMenuBar(mnb);``  ` `  ``// 关闭窗口时退出程序 ``  ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ` ` ``// 实现 ActionListener 中的方法`` ``public` `void` `actionPerformed(ActionEvent e) {``  ` `  ``if` `(e.getActionCommand() == ``"Exit"``) {``   ``System.exit(``0``);``  ``} ``else` `if` `(e.getActionCommand() == ``"New"``) {``   ``//text = new JTextArea();``   ``conPane.add(text, BorderLayout.CENTER);``   ` `   ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``  ``} ``else` `{``   ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``  ``}`` ``}`` ` `}` `public` `class` `JManuApp2 {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameJManu2 mw = ``new` `MyJFrameJManu2(str1, ``250``, ``200``);``  ``mw.setVisible(``true``); ``// 如果在先设置菜单之前就调用此方法，那么之后添加的菜单就不能显示了。``     ``// 所以要等其他工作做完，最后再调用此方法。`` ``}``}``  
```

**例10-13**的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/java10_11.png)

**例10-13** 的程序分析：

程序创建了三个菜单fileMenu、editMenu和insertElementMenu，把insertElementMenu添加到editMenu后，前者就变成了后者的子菜单。事件处理方法actionPerformed()中的代码与李10-11中的代码相同，没做任何改变，仍然是根据事件源的不同做不同处理。



### 设置菜单项的快捷键

点击折叠

在Java中，可以通过在菜单构造器中指定一个快捷字母来为菜单设置快捷键，例如：

JMenuItem newItem = new JMenuItem(“New”, ‘N’);

JMenuItem openItem = new JMenuItem(“Open”, KeyEvent.VK_O); /

快捷键会自动在菜单项中显示出来，其方式是在快捷键字母加以下划线。

只能在菜单项的构造器中设定快捷键字母，而在菜单构造器中则不行。若要为一个菜单设置快捷键，需要调用setMnemonic()方法，例如：

fileMenu.setMnemonic('F');

用这条语句给菜单加快捷键。运行时按"Alt + F" 可以打开"File" 菜单。

**例10-14** 设置菜单项的快捷键的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.8.html?node=858292621&detailRecordId=1318913833&studyrecordId=1225624963&sectionRecordId=1229924130#)

```
  ``/**`` ``* 运行时，先选 new 菜单，然后再选其它菜单，可以看到运行结果。`` ``*/``package` `com.buptnu;` `import` `java.applet.*;``import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameJManu3 ``extends` `JFrame ``implements` `ActionListener {`` ` ` ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区`` ` ` ``// 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。`` ``// 在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameJManu3 的成员变量`` ``// 以后就可以直接引用这个成员变量。``  ` ` ``Container conPane = ``null``;`` ` ` ``// 构造方法`` ``public` `MyJFrameJManu3(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``setLocation(``100``, ``100``);``  ` `  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `BorderLayout());``  ` `  ``JMenuBar mnb = ``new` `JMenuBar();``  ` `  ``JMenu fileMenu = ``new` `JMenu(``"File"``);``  ``fileMenu.setMnemonic(``'F'``); ``// 给菜单加快捷键。运行时按"Alt + F"可以打开"File"菜单``  ``JMenuItem newItem = ``new` `JMenuItem(``"New"``, ``'N'``);``  ``JMenuItem openItem = ``new` `JMenuItem(``"Open"``, ``'O'``);``  ``JMenuItem saveItem = ``new` `JMenuItem(``"Save"``, ``'S'``);``  ``JMenuItem exitItem = ``new` `JMenuItem(``"Exit"``, ``'E'``);``  ``newItem.addActionListener(``this``);``  ``openItem.addActionListener(``this``);``  ``saveItem.addActionListener(``this``);``  ``exitItem.addActionListener(``this``);``  ``fileMenu.add(newItem);``  ``fileMenu.add(openItem);``  ``fileMenu.add(saveItem);``  ``fileMenu.addSeparator();``  ``fileMenu.add(exitItem);``  ``mnb.add(fileMenu);``  ` `  ``JMenu editMenu = ``new` `JMenu(``"Edit"``);``  ``JMenuItem copyItem = ``new` `JMenuItem(``"Copy"``);``  ``JMenuItem pasteItem = ``new` `JMenuItem(``"Paste"``);``  ``copyItem.addActionListener(``this``);``  ``pasteItem.addActionListener(``this``);``  ``editMenu.add(copyItem);``  ``editMenu.add(pasteItem);``  ``// 子菜单的例子``  ``JMenu insertElementMenu = ``new` `JMenu(``"Insert"``);``  ``JMenuItem insertImageItem = ``new` `JMenuItem(``"Image"``);``  ``JMenuItem insertSoundItem = ``new` `JMenuItem(``"Sound"``);``  ``insertImageItem.addActionListener(``this``);``  ``insertSoundItem.addActionListener(``this``);``  ``insertElementMenu.add(insertImageItem);``  ``insertElementMenu.add(insertSoundItem);``  ``editMenu.addSeparator();``  ``editMenu.add(insertElementMenu);``  ``mnb.add(editMenu);` `  ``setJMenuBar(mnb);``  ` `  ``// 关闭窗口时退出程序 ``  ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ` ` ``// 实现 ActionListener 中的方法`` ``public` `void` `actionPerformed(ActionEvent e) {``  ` `  ``if` `(e.getActionCommand() == ``"Exit"``) {``   ``System.exit(``0``);``  ``} ``else` `if` `(e.getActionCommand() == ``"New"``) {``   ``// text = new JTextArea();``   ``conPane.add(text, BorderLayout.CENTER);``   ` `   ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``  ``} ``else` `{``   ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``  ``}`` ``}`` ` `}` `public` `class` `JManuApp3 {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameJManu3 mw = ``new` `MyJFrameJManu3(str1, ``250``, ``200``);``  ``mw.setVisible(``true``); ``// 如果在先设置菜单之前就调用此方法，那么之后添加的菜单就不能显示了。``     ``// 所以要等其他工作做完，最后再调用此方法。`` ``}``}
```

**例10-14** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/a1.png)

**例10-14** 的程序分析：

为菜单项设置快捷键与为菜单设置快捷键的方法是不同的：为菜单项设置快捷键的方法是在菜单项的构造器中设定快捷键字母，而为一个菜单设置快捷键的方法是在菜单上调用setMnemonic()方法。



### 选择框菜单项

点击折叠

菜单可以包含具有持久的选择状态的选项。

**例10-15** 组合框的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.8.html?node=858292621&detailRecordId=1318913833&studyrecordId=1225624963&sectionRecordId=1229924130#)

```
            ``/**`` ``* 运行时，先选 new 菜单，然后再选其它菜单，可以看到运行结果。`` ``*/``package` `com.buptnu;` `import` `java.applet.*;``import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameJManu4 ``extends` `JFrame ``implements` `ActionListener {`` ` ` ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区`` ` ` ``/* 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。``  ``* 在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameJManu4 的成员变量``  ``* 以后就可以直接引用这个成员变量。``  ``*/`` ``Container conPane = ``null``;`` ` ` ``// 构造方法`` ``public` `MyJFrameJManu4(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``setLocation(``100``, ``100``);``  ` `  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `BorderLayout());``  ` `  ``JMenuBar mnb = ``new` `JMenuBar();``  ` `  ``JMenu fileMenu = ``new` `JMenu(``"File"``);``  ``fileMenu.setMnemonic(``'F'``); ``// 给菜单加快捷键。运行时按"Alt + F"可以打开"File"菜单``  ``JMenuItem newItem = ``new` `JMenuItem(``"New"``, ``'N'``);``  ``JMenuItem openItem = ``new` `JMenuItem(``"Open"``, KeyEvent.VK_O); ``// 用教材的方法``  ``JMenuItem saveItem = ``new` `JMenuItem(``"Save"``, ``'S'``);``  ``JMenuItem exitItem = ``new` `JMenuItem(``"Exit"``, ``'E'``);``  ``JCheckBoxMenuItem readonlyItem = ``new` `JCheckBoxMenuItem(``"Read Only"``); ``//``  ``newItem.addActionListener(``this``);``  ``openItem.addActionListener(``this``);``  ``saveItem.addActionListener(``this``);``  ``exitItem.addActionListener(``this``);``  ``readonlyItem.addActionListener(``this``); ``//``  ``fileMenu.add(newItem);``  ``fileMenu.add(openItem);``  ``fileMenu.add(saveItem);``  ``fileMenu.addSeparator();``  ``fileMenu.add(readonlyItem);``  ``fileMenu.addSeparator();``  ``fileMenu.add(exitItem);``  ``mnb.add(fileMenu);``  ` `  ``JMenu editMenu = ``new` `JMenu(``"Edit"``);``  ``JMenuItem copyItem = ``new` `JMenuItem(``"Copy"``);``  ``JMenuItem pasteItem = ``new` `JMenuItem(``"Paste"``);``  ``copyItem.addActionListener(``this``);``  ``pasteItem.addActionListener(``this``);``  ``editMenu.add(copyItem);``  ``editMenu.add(pasteItem);``  ``// 子菜单的例子``  ``JMenu insertElementMenu = ``new` `JMenu(``"Insert"``);``  ``JMenuItem insertImageItem = ``new` `JMenuItem(``"Image"``);``  ``JMenuItem insertSoundItem = ``new` `JMenuItem(``"Sound"``);``  ``insertImageItem.addActionListener(``this``);``  ``insertSoundItem.addActionListener(``this``);``  ``insertElementMenu.add(insertImageItem);``  ``insertElementMenu.add(insertSoundItem);``  ``editMenu.addSeparator();``  ``editMenu.add(insertElementMenu);``  ``mnb.add(editMenu);` `  ``setJMenuBar(mnb);``  ` `  ``//关闭窗口时退出程序 ``  ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ` ` ``// 实现 ActionListener 中的方法`` ``public` `void` `actionPerformed(ActionEvent e) {``  ` `  ``if` `(e.getActionCommand() == ``"Exit"``) {``   ``System.exit(``0``);``  ``} ``else` `if` `(e.getActionCommand() == ``"New"``) {``   ``conPane.add(text, BorderLayout.CENTER);``   ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``  ``} ``else` `{``   ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``  ``}`` ``}`` ` `}` `public` `class` `JManuApp4 {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameJManu4 mw = ``new` `MyJFrameJManu4(str1, ``250``, ``200``);``  ``mw.setVisible(``true``); ``// 如果在先设置菜单之前就调用此方法，那么之后添加的菜单就不能显示了。``     ``// 所以要等其他工作做完，最后再调用此方法。`` ``}``}
```

**例10-15** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/css_imgs/a2.png)

**例10-15** 的程序分析：

程序中用了两种不同的方法为菜单项设置快捷键：JMenuItem("New", 'N');和JMenuItem("Open", KeyEvent.VK_O);

JCheckBoxMenuItem类的实例是带有选择框的菜单项。



## **10.9 对话框**

### 主体内容

对话框是一个临时窗口，可以在其中放置用于显示信息或得到用户输入的组件。在 Swing 中，有两个对话框类，一个是 JDialog 类，提供构造并管理通用对话框；另一个是 JOptionPane 类，提供构造常见对话框。



### JDialog 类

对话框与一般窗口不同，对话框依赖其它窗口，当它所依赖的窗口消失或最小化时，对话框也将消失；窗口还原时，对话框又自动恢复。

对话框分为强制型（模式对话框）和非强制型（非模式对话框）两种。

JDialog 对象也是容器，它默认的布局是 BorderLayout 布局。但组件不能直接加入到对话框中。对话框也包含一个内容面板，应当把组件加到 JDialog 对象的内容面板中。

JDialog类作作对话框的基类。对话框与一般窗口不同，对话框依赖其他窗口，当它所依赖的窗口消失或最小化时，对话框也将消失；窗口还原时，对话框又会自动恢复。

对话框分为强制和非强制两种。强制型对话框不能中断对话过程，直至对话框结束，才让程序响应对话框以外的事件。非强制型对话框可以中断对话过程，去响应对话框以外的事件。强制型也称有模式对话框，非强制对话框也称非模式对话框。

JDialog对象也是一种容器，因此也可以给JDialog对话框指派布局管理器，对话框的默认布局为BoarderLayout布局。但组件不能直接加到对话框中，对话框也包含一个内容面板，应当把组件加到JDialog对象的内容面板中。由于对话框依赖窗口，因此要建立对话框，必须先要创建一个窗口。

JDialog类常用的构造方法有3个：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JDialog(),构造一个初始化不可见的非强制型对话框。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JDialog(JFramef,String s),构造一个初始化不可见的非强制型对话框，参数f设置对话框所依赖的窗口，参数s用于设置标题。通常先声明一个JDialog类的子类，然后创建这个子类的一个对象，就建立了一个对话框。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) JDialog(JFrame f,String s,boolean b),构造一个标题为s，初始化不可见的对话框。参数f设置对话框所依赖的窗口，参数b决定对话框是否强制或非强制型。

JDialog类的其他常用方法有以下几个：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) getTitle(),获取对话框的标题。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setTitle(String s),设置对话框的标题。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setModal(boolean b)，设置对话框的模式。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setSize(),设置框的大小。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_24.png) setVisible(boolean b),显示或隐藏对话框。

**例10-16** JDialog对话框的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.9.html?node=858292622&detailRecordId=1318913834&studyrecordId=1225624963&sectionRecordId=1229924129#)

```
package` `com.buptnu;` `import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameJDialog ``extends` `JFrame ``implements` `ActionListener {``  ``private` `JButton btn1, btn2;``  ``private` `static` `int` `flg = ``0``;``  ``private` `static` `JTextField text1, text2;``  ` `  ``// 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。``  ``// 在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameJDialog 的成员变量``  ``// 以后就可以直接引用这个成员变量。``   ` `  ``Container conPane = ``null``;``  ` `  ``// 构造方法 ``  ``MyJFrameJDialog(String name, ``int` `w, ``int` `h) {``    ``super``();``    ``setTitle(name);``    ``setSize(w, h);``    ``setLocation(``100``, ``100``);``    ` `    ``conPane = getContentPane();``    ``conPane.setLayout(``new` `GridLayout(``2``, ``2``));``    ` `    ``btn1 = ``new` `JButton(``"选择水果"``);``    ``btn2 = ``new` `JButton(``"选择食品"``);``    ``btn1.addActionListener(``this``);``    ``btn2.addActionListener(``this``);``    ``text1 = ``new` `JTextField(``20``);``    ``text2 = ``new` `JTextField(``20``);``    ``conPane.add(btn1);``    ``conPane.add(btn2);``    ``conPane.add(text1);``    ``conPane.add(text2);``    ``setVisible(``true``);``    ``pack();``    ` `    ``// 关闭窗口时退出程序 ``    ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);``  ``}``  ` `  ``public` `static` `void` `returnName(String s) {``    ``if` `(flg == ``1``)``      ``text1.setText(``"选择的水果是："` `+ s);``    ``else` `if` `(flg == ``2``)``      ``text2.setText(``"选择的食品是"` `+ s);``  ``}``  ` `  ``// 实现 ActionListener 中的方法``  ``public` `void` `actionPerformed(ActionEvent e) {``    ``MyDialog dlg;``    ``if` `(e.getSource() == btn1) {``      ``dlg = ``new` `MyDialog(``this``, ``"水果"``);``      ``dlg.setVisible(``true``);``      ``flg = ``1``;``    ``} ``else` `if` `(e.getSource() == btn2) {``      ``dlg = ``new` `MyDialog(``this``, ``"食品"``);``      ``dlg.setVisible(``true``);``      ``flg = ``2``;``    ``}``  ``}``  ` `}` `class` `MyDialog ``extends` `JDialog ``implements` `ActionListener {``  ``JLabel title;``  ``JTextField text;``  ``JButton done;``  ` `  ``// 构造方法``  ``MyDialog (JFrame fra, String s) {``    ``super``(fra, s, ``true``);``    ``Container con = getContentPane();``    ``title = ``new` `JLabel(``"输入"` `+ s + ``"名称"``);``    ``text = ``new` `JTextField(``10``);``    ``text.setEditable(``true``);``    ``con.setLayout(``new` `FlowLayout());``    ``con.setSize(``200``, ``100``);``    ``setModal(``false``);``    ``done = ``new` `JButton(``"确定"``);``    ``done.addActionListener(``this``);``    ``con.add(title);``    ``con.add(text);``    ``con.add(done);``    ``con.setVisible(``true``);``    ``pack(); ``// size the JFrame to fit its contents``  ``}``  ` `  ``// 实现 ActionListener 中的方法``  ``public` `void` `actionPerformed(ActionEvent e) {``    ``MyJFrameJDialog.returnName(text.getText());``    ``setVisible(``false``);``    ``dispose();``  ``}``  ` `}` `public` `class` `JDialogApp1 {``  ``public` `static` `void` `main(String[] args) {``    ``String str1 = ``"Frame 窗口"``;``    ``MyJFrameJDialog mw = ``new` `MyJFrameJDialog(str1, ``250``, ``200``);``    ``//mw.setVisible(true); // 如果在先设置菜单之前就调用此方法，那么之后添加的菜单就不能显示了。``          ``// 所以要等其他工作做完，最后再调用此方法。``  ``}``}
```

**例10-16** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/d1.png)

**例10-16** 的程序分析：

MyJFrameJDialog类的actionPerformed()方法用e.getSource()获取事件e的事件源（只事件源对象）根据事件源对象的不同创建不同的对话框。程序中创建的对话框是MyDialog类的实例。MyDialog类继承自JDialog，它的每个实例都是一个对话框。JDialog类实现了ActionListener接口，在actionPerformed()方法中调用MyJFrameJDialog窗口对象returnName()方法实现对话框关闭后的操作。

要点1：dispose()方法

public void dispose()

释放由此 Window、其子组件及其拥有的所有子组件所使用的所有本机屏幕资源。即这些 Component 的资源将被破坏，它们使用的所有内存都将返回到操作系统，并将它们标记为不可显示。 通过随后调用 pack 或 show 重新构造本机资源，可以再次显示 Window 及其子组件。重新创建的 Window 及其子组件的状态与释放 Window 时这些对象的状态一致（不考虑这些操作之间的其他更改）。

要点2：e.getSource()与e.getActionCommand()的区别

e.getSource()方法依赖于事件对象。比如：JButton jbt = new JButton("button");中事件对象就是jbt。

e.getActionCommand()方法依赖于按钮上的字符串。比如：JButton jbt = new JButton("button");中字符串button。

简而言之：用e.getSource()得到的是jbt，而用e.getActionCommand()得到的是button。



### JOptionPane类

点击折叠

经常遇到非常简单的对话情况，为了简化常见对话框的编程，JOptionPane类定义了四个简单对话框类型，方便编程。JOptionPane类提供一组静态方法，让用户选用某种类型的对话框，下面的方法用于打开四中不同的常见对话框。

|       方法名        |                       描述                        |
| :-----------------: | :-----------------------------------------------: |
| showConfirmDialog() | 确认对话框：询问一个确认问题，如yes/no/cancle等。 |
|  showInputDialog()  |          输入对话框：提示要求某些输入。           |
| showMessageDialog() |        消息对话框：告知用户某事件已发生。         |
| showOptionDialog()  |          选项对话框：上述三项的大统一。           |

**例10-17** 确认对话框的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.9.html?node=858292622&detailRecordId=1318913834&studyrecordId=1225624963&sectionRecordId=1229924129#)

```
// 运行时，先选 new 菜单，然后再选其它菜单，可以看到运行结果。`` ` `package` `com.buptnu;``import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameConfirmD ``extends` `JFrame ``implements` `ActionListener {``  ` `  ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区``  ` `   ``// 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。``   ``// 在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameConfirmD 的成员变量``   ``// 以后就可以直接引用这个成员变量。``   ` `  ``Container conPane = ``null``;``  ` `  ``// 构造方法``  ``public` `MyJFrameConfirmD(String name, ``int` `w, ``int` `h) {``    ``super``();``    ``setTitle(name);``    ``setSize(w, h);``    ``setLocation(``100``, ``100``);``    ` `    ``conPane = getContentPane();``    ``conPane.setLayout(``new` `BorderLayout());``    ` `    ``JMenuBar mnb = ``new` `JMenuBar();``    ` `    ``JMenu fileMenu = ``new` `JMenu(``"File"``);``    ``fileMenu.setMnemonic(``'F'``); ``// 给菜单加快捷键。运行时按"Alt + F"可以打开"File"菜单``    ``JMenuItem newItem = ``new` `JMenuItem(``"New"``, ``'N'``);``    ``JMenuItem openItem = ``new` `JMenuItem(``"Open"``, KeyEvent.VK_O); ``// 用教材的方法``    ``JMenuItem saveItem = ``new` `JMenuItem(``"Save"``, ``'S'``);``    ``JMenuItem exitItem = ``new` `JMenuItem(``"Exit"``, ``'E'``);``    ``JCheckBoxMenuItem readonlyItem = ``new` `JCheckBoxMenuItem(``"Read Only"``); ``//``    ``newItem.addActionListener(``this``);``    ``openItem.addActionListener(``this``);``    ``saveItem.addActionListener(``this``);``    ``exitItem.addActionListener(``this``);``    ``readonlyItem.addActionListener(``this``); ``//``    ``fileMenu.add(newItem);``    ``fileMenu.add(openItem);``    ``fileMenu.add(saveItem);``    ``fileMenu.addSeparator();``    ``fileMenu.add(readonlyItem);``    ``fileMenu.addSeparator();``    ``fileMenu.add(exitItem);``    ``mnb.add(fileMenu);``    ` `    ``JMenu editMenu = ``new` `JMenu(``"Edit"``);``    ``JMenuItem copyItem = ``new` `JMenuItem(``"Copy"``);``    ``JMenuItem pasteItem = ``new` `JMenuItem(``"Paste"``);``    ``copyItem.addActionListener(``this``);``    ``pasteItem.addActionListener(``this``);``    ``editMenu.add(copyItem);``    ``editMenu.add(pasteItem);``    ``// 子菜单的例子``    ``JMenu insertElementMenu = ``new` `JMenu(``"Insert"``);``    ``JMenuItem insertImageItem = ``new` `JMenuItem(``"Image"``);``    ``JMenuItem insertSoundItem = ``new` `JMenuItem(``"Sound"``);``    ``insertImageItem.addActionListener(``this``);``    ``insertSoundItem.addActionListener(``this``);``    ``insertElementMenu.add(insertImageItem);``    ``insertElementMenu.add(insertSoundItem);``    ``editMenu.addSeparator();``    ``editMenu.add(insertElementMenu);``    ``mnb.add(editMenu);` `    ``setJMenuBar(mnb);``    ` `    ``// 关闭窗口时退出程序 ``    ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);``  ``}``  ` `  ``// 实现 ActionListener 中的方法``  ``public` `void` `actionPerformed(ActionEvent e) {``    ` `    ``if` `(e.getActionCommand() == ``"Exit"``) {``      ``int` `result = JOptionPane.showConfirmDialog(``this``, ``"确实要退出吗"``, ``"退出确认"``, JOptionPane.YES_NO_CANCEL_OPTION);``      ``text.setText(``""` `+ result);``      ``if` `(``0` `== result)``        ``System.exit(``0``); ``    ``} ``else` `if` `(e.getActionCommand() == ``"New"``) {``      ``conPane.add(text, BorderLayout.CENTER);``      ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``    ``} ``else` `{``      ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``    ``}``  ``}``  ` `}``public` `class` `JOptionPaneApp1 {``  ``public` `static` `void` `main(String[] args) {``    ``String str1 = ``"Frame 窗口"``;``    ``MyJFrameConfirmD mw = ``new` `MyJFrameConfirmD(str1, ``250``, ``200``);``    ``mw.setVisible(``true``);``  ``}``}
```

**例10-17** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/d2.png)

**例10-17** 的程序分析：

调用JOptionPane类的静态方法showConfirmDialog()创建并打开一个确认对话框，其中其中方法名的中间部分文字“Confirm”是创建对话框的类型，文字Confirm指明是选用确认对话框。将文字Confirm改为另外三种类型的某一个，就成为相应类型的对话框。上述代码的四个参数的意义是：第一个参数指定这个对话框的父窗口；第二个参数是对话框显示的文字；第三个参数是对话框的标题；最后一个参数指明对话框有三个按钮，分别为“是(Y)”，“否(N)”，和“撤销”。方法的返回结果是用户响应了这个对话框后的结果。

**例10-18** 输入对话框的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.9.html?node=858292622&detailRecordId=1318913834&studyrecordId=1225624963&sectionRecordId=1229924129#)

```
// 运行时，先选 new 菜单，然后再选其它菜单，可以看到运行结果。`` ` `package` `com.buptnu;` `import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameshowInputD ``extends` `JFrame ``implements` `ActionListener {``  ` `  ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区``  ` `  ``// 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。``  ``// 在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameshowInputD 的成员变量``  ``// 以后就可以直接引用这个成员变量。``   ` `  ``Container conPane = ``null``;``  ` `  ``// 构造方法``  ``public` `MyJFrameshowInputD(String name, ``int` `w, ``int` `h) {``    ``super``();``    ``setTitle(name);``    ``setSize(w, h);``    ``setLocation(``100``, ``100``);``    ` `    ``conPane = getContentPane();``    ``conPane.setLayout(``new` `BorderLayout());``    ` `    ``JMenuBar mnb = ``new` `JMenuBar();``    ` `    ``JMenu fileMenu = ``new` `JMenu(``"File"``);``    ``fileMenu.setMnemonic(``'F'``); ``// 给菜单加快捷键。运行时按"Alt + F"可以打开"File"菜单``    ``JMenuItem newItem = ``new` `JMenuItem(``"New"``, ``'N'``);``    ``JMenuItem openItem = ``new` `JMenuItem(``"Open"``, KeyEvent.VK_O); ``// 用教材的方法``    ``JMenuItem saveItem = ``new` `JMenuItem(``"Save"``, ``'S'``);``    ``JMenuItem exitItem = ``new` `JMenuItem(``"Exit"``, ``'E'``);``    ``JCheckBoxMenuItem readonlyItem = ``new` `JCheckBoxMenuItem(``"Read Only"``); ``//``    ``newItem.addActionListener(``this``);``    ``openItem.addActionListener(``this``);``    ``saveItem.addActionListener(``this``);``    ``exitItem.addActionListener(``this``);``    ``readonlyItem.addActionListener(``this``); ``//``    ``fileMenu.add(newItem);``    ``fileMenu.add(openItem);``    ``fileMenu.add(saveItem);``    ``fileMenu.addSeparator();``    ``fileMenu.add(readonlyItem);``    ``fileMenu.addSeparator();``    ``fileMenu.add(exitItem);``    ``mnb.add(fileMenu);``    ` `    ``JMenu editMenu = ``new` `JMenu(``"Edit"``);``    ``JMenuItem inputItem = ``new` `JMenuItem(``"Input"``);``    ``JMenuItem copyItem = ``new` `JMenuItem(``"Copy"``);``    ``JMenuItem pasteItem = ``new` `JMenuItem(``"Paste"``);``    ``inputItem.addActionListener(``this``);``    ``copyItem.addActionListener(``this``);``    ``pasteItem.addActionListener(``this``);``    ``editMenu.add(inputItem);``    ``editMenu.add(copyItem);``    ``editMenu.add(pasteItem);``    ``// 子菜单的例子``    ``JMenu insertElementMenu = ``new` `JMenu(``"Insert"``);``    ``JMenuItem insertImageItem = ``new` `JMenuItem(``"Image"``);``    ``JMenuItem insertSoundItem = ``new` `JMenuItem(``"Sound"``);``    ``insertImageItem.addActionListener(``this``);``    ``insertSoundItem.addActionListener(``this``);``    ``insertElementMenu.add(insertImageItem);``    ``insertElementMenu.add(insertSoundItem);``    ``editMenu.addSeparator();``    ``editMenu.add(insertElementMenu);``    ``mnb.add(editMenu);` `    ``setJMenuBar(mnb);``    ` `    ``// 关闭窗口时退出程序 ``    ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);``  ``}``  ` `  ``// 实现 ActionListener 中的方法``  ``public` `void` `actionPerformed(ActionEvent e) {``    ` `    ``if` `(e.getActionCommand() == ``"Exit"``) {``      ``int` `result = JOptionPane.showConfirmDialog(``this``, ``"确实要退出吗"``, ``"退出确认"``, JOptionPane.YES_NO_CANCEL_OPTION);``      ``text.setText(``""` `+ result);``      ``if` `(``0` `== result)``        ``System.exit(``0``); ``    ``} ``else` `if` `(e.getActionCommand() == ``"Input"``) {``      ``String result = (String)JOptionPane.showInputDialog(``        ``this``,``        ``"请选择一个项目"``,``        ``"这是运动项目选择对话框"``,``        ``JOptionPane.QUESTION_MESSAGE,``        ``null``,``        ``new` `Object[] {``"踢足球"``,``"打蓝球"``,``"跑步"``,``"跳绳"``,``"游泳"``},``        ``"跑步"``      ``);``      ``text.setText(``"您选择的运动项目是"` `+ result);``    ``} ``else` `if` `(e.getActionCommand() == ``"New"``) {``      ``conPane.add(text, BorderLayout.CENTER);``      ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``    ``} ``else` `{``      ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``    ``}``  ``}``  ` `}``public` `class` `JOptionPaneApp2 {``  ``public` `static` `void` `main(String[] args) {``    ``String str1 = ``"Frame 窗口"``;``    ``MyJFrameshowInputD mw = ``new` `MyJFrameshowInputD(str1, ``250``, ``200``);``    ``mw.setVisible(``true``);``  ``}``}
```

**例10-18** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/d3.png)

**例10-17**的程序分析：

下面的语句用于创建并打开输入对话框：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.9.html?node=858292622&detailRecordId=1318913834&studyrecordId=1225624963&sectionRecordId=1229924129#)

```
String result = (String)JOptionPane.showInputDialog(``      ``this``,``      ``"请选择一个项目"``,``      ``"这是运动项目选择对话框"``,``      ``JOptionPane.QUESTION_MESSAGE,``      ``null``,``      ``new` `Object[] {``"踢足球"``,``"打蓝球"``,``"跑步"``,``"跳绳"``,``"游泳"``},``      ``"跑步"``    ``);
```

**例10-19** 显示信息对话框的的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.9.html?node=858292622&detailRecordId=1318913834&studyrecordId=1225624963&sectionRecordId=1229924129#)

```
//  运行时，先选 new 菜单，然后再选其它菜单，可以看到运行结果。` `package` `com.buptnu;``import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameshowMessageD ``extends` `JFrame ``implements` `ActionListener {``  ` `  ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区``  ` `  ``// 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。``  ``// 在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameshowMessageD 的成员变量``  ``// 以后就可以直接引用这个成员变量。``   ` `  ``Container conPane = ``null``;``  ` `  ``// 构造方法``  ``public` `MyJFrameshowMessageD(String name, ``int` `w, ``int` `h) {``    ``super``();``    ``setTitle(name);``    ``setSize(w, h);``    ``setLocation(``100``, ``100``);``    ` `    ``conPane = getContentPane();``    ``conPane.setLayout(``new` `BorderLayout());``    ` `    ``JMenuBar mnb = ``new` `JMenuBar();``    ` `    ``JMenu fileMenu = ``new` `JMenu(``"File"``);``    ``fileMenu.setMnemonic(``'F'``); ``// 给菜单加快捷键。运行时按"Alt + F"可以打开"File"菜单``    ``JMenuItem newItem = ``new` `JMenuItem(``"New"``, ``'N'``);``    ``JMenuItem openItem = ``new` `JMenuItem(``"Open"``, KeyEvent.VK_O); ``// 用教材的方法``    ``JMenuItem saveItem = ``new` `JMenuItem(``"Save"``, ``'S'``);``    ``JMenuItem exitItem = ``new` `JMenuItem(``"Exit"``, ``'E'``);``    ``JCheckBoxMenuItem readonlyItem = ``new` `JCheckBoxMenuItem(``"Read Only"``); ``//``    ``newItem.addActionListener(``this``);``    ``openItem.addActionListener(``this``);``    ``saveItem.addActionListener(``this``);``    ``exitItem.addActionListener(``this``);``    ``readonlyItem.addActionListener(``this``); ``//``    ``fileMenu.add(newItem);``    ``fileMenu.add(openItem);``    ``fileMenu.add(saveItem);``    ``fileMenu.addSeparator();``    ``fileMenu.add(readonlyItem);``    ``fileMenu.addSeparator();``    ``fileMenu.add(exitItem);``    ``mnb.add(fileMenu);``    ` `    ``JMenu editMenu = ``new` `JMenu(``"Edit"``);``    ``JMenuItem showMSGItem = ``new` `JMenuItem(``"Show Message"``);``    ``JMenuItem inputItem = ``new` `JMenuItem(``"Input"``);``    ``JMenuItem copyItem = ``new` `JMenuItem(``"Copy"``);``    ``JMenuItem pasteItem = ``new` `JMenuItem(``"Paste"``);``    ``showMSGItem.addActionListener(``this``);``    ``inputItem.addActionListener(``this``);``    ``copyItem.addActionListener(``this``);``    ``pasteItem.addActionListener(``this``);``    ``editMenu.add(showMSGItem);``    ``editMenu.add(inputItem);``    ``editMenu.add(copyItem);``    ``editMenu.add(pasteItem);``    ``// 子菜单的例子``    ``JMenu insertElementMenu = ``new` `JMenu(``"Insert"``);``    ``JMenuItem insertImageItem = ``new` `JMenuItem(``"Image"``);``    ``JMenuItem insertSoundItem = ``new` `JMenuItem(``"Sound"``);``    ``insertImageItem.addActionListener(``this``);``    ``insertSoundItem.addActionListener(``this``);``    ``insertElementMenu.add(insertImageItem);``    ``insertElementMenu.add(insertSoundItem);``    ``editMenu.addSeparator();``    ``editMenu.add(insertElementMenu);``    ``mnb.add(editMenu);` `    ``setJMenuBar(mnb);``    ` `    ``/* 关闭窗口时退出程序 */``    ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);``  ``}``  ` `  ``// 实现 ActionListener 中的方法``  ``public` `void` `actionPerformed(ActionEvent e) {``    ` `    ``if` `(e.getActionCommand() == ``"Exit"``) {``      ``int` `result = JOptionPane.showConfirmDialog(``this``, ``"确实要退出吗"``, ``"退出确认"``, JOptionPane.YES_NO_CANCEL_OPTION);``      ``text.setText(``""` `+ result);``      ``if` `(``0` `== result)``        ``System.exit(``0``); ``    ``} ``else` `if` `(e.getActionCommand() == ``"Input"``) {``      ``String result = (String)JOptionPane.showInputDialog(``        ``this``,``        ``"请选择一个项目"``,``        ``"这是运动项目选择对话框"``,``        ``JOptionPane.QUESTION_MESSAGE,``        ``null``,``        ``new` `Object[] {``"踢足球"``,``"打蓝球"``,``"跑步"``,``"跳绳"``,``"游泳"``},``        ``"跑步"``      ``);``      ``text.setText(``"您选择的运动项目是"` `+ result);``    ``}``else` `if` `(e.getActionCommand() == ``"Show Message"``) {``      ``JOptionPane.showMessageDialog(``        ``this``,``        ``"这是一个 Java 程序"``,``        ``"我是输出信息对话框"``,``        ``JOptionPane.PLAIN_MESSAGE``      ``);``    ``}``    ` `     ``else` `if` `(e.getActionCommand() == ``"New"``) {``      ``conPane.add(text, BorderLayout.CENTER);``      ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``    ``} ``else` `{``      ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``    ``}``  ``}``  ` `}``public` `class` `JOptionPaneApp3 {``  ``public` `static` `void` `main(String[] args) {``    ``String str1 = ``"Frame 窗口"``;``    ``MyJFrameshowMessageD mw = ``new` `MyJFrameshowMessageD(str1, ``250``, ``200``);``    ``mw.setVisible(``true``);``  ``}``}
```

**例10-19** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/d4.png)

例10-19的程序分析：

下面的语句用于创建并打开消息对话框：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.9.html?node=858292622&detailRecordId=1318913834&studyrecordId=1225624963&sectionRecordId=1229924129#)

```
JOptionPane.showMessageDialog(``      ``this``,``      ``"这是一个 Java 程序"``,``      ``"我是输出信息对话框"``,``      ``JOptionPane.PLAIN_MESSAGE``    ``);
```

**例10-20** 选项对话框的的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.9.html?node=858292622&detailRecordId=1318913834&studyrecordId=1225624963&sectionRecordId=1229924129#)

```
//  运行时，先选 new 菜单，然后再选其它菜单，可以看到运行结果。`` ` `package` `com.buptnu;` `import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameOptionD ``extends` `JFrame ``implements` `ActionListener {``  ` `  ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区``  ` `  ``//  声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。``  ``//  在构造方法之外声明这个变量是为了让 conPane称为 MyJFrameOptionD 的成员变量``  ``//  以后就可以直接引用这个成员变量。``   ` `  ``Container conPane = ``null``;``  ` `  ``// 构造方法``  ``public` `MyJFrameOptionD(String name, ``int` `w, ``int` `h) {``    ``super``();``    ``setTitle(name);``    ``setSize(w, h);``    ``setLocation(``100``, ``100``);``    ` `    ``conPane = getContentPane();``    ``conPane.setLayout(``new` `BorderLayout());``    ` `    ``JMenuBar mnb = ``new` `JMenuBar();``    ` `    ``JMenu fileMenu = ``new` `JMenu(``"File"``);``    ``fileMenu.setMnemonic(``'F'``); ``// 给菜单加快捷键。运行时按"Alt + F"可以打开"File"菜单``    ``JMenuItem newItem = ``new` `JMenuItem(``"New"``, ``'N'``);``    ``JMenuItem openItem = ``new` `JMenuItem(``"Open"``, KeyEvent.VK_O); ``// 用教材的方法``    ``JMenuItem saveItem = ``new` `JMenuItem(``"Save"``, ``'S'``);``    ``JMenuItem exitItem = ``new` `JMenuItem(``"Exit"``, ``'E'``);``    ``JCheckBoxMenuItem readonlyItem = ``new` `JCheckBoxMenuItem(``"Read Only"``); ``//``    ``newItem.addActionListener(``this``);``    ``openItem.addActionListener(``this``);``    ``saveItem.addActionListener(``this``);``    ``exitItem.addActionListener(``this``);``    ``readonlyItem.addActionListener(``this``); ``//``    ``fileMenu.add(newItem);``    ``fileMenu.add(openItem);``    ``fileMenu.add(saveItem);``    ``fileMenu.addSeparator();``    ``fileMenu.add(readonlyItem);``    ``fileMenu.addSeparator();``    ``fileMenu.add(exitItem);``    ``mnb.add(fileMenu);``    ` `    ``JMenu editMenu = ``new` `JMenu(``"Edit"``);``    ``JMenuItem showMSGItem = ``new` `JMenuItem(``"Show Message"``);``    ``JMenuItem inputItem = ``new` `JMenuItem(``"Input"``);``    ``JMenuItem copyItem = ``new` `JMenuItem(``"Copy"``);``    ``JMenuItem pasteItem = ``new` `JMenuItem(``"Paste"``);``    ``showMSGItem.addActionListener(``this``);``    ``inputItem.addActionListener(``this``);``    ``copyItem.addActionListener(``this``);``    ``pasteItem.addActionListener(``this``);``    ``editMenu.add(showMSGItem);``    ``editMenu.add(inputItem);``    ``editMenu.add(copyItem);``    ``editMenu.add(pasteItem);``    ``// 子菜单的例子``    ``JMenu insertElementMenu = ``new` `JMenu(``"Insert"``);``    ``JMenuItem insertImageItem = ``new` `JMenuItem(``"Image"``);``    ``JMenuItem insertSoundItem = ``new` `JMenuItem(``"Sound"``);``    ``insertImageItem.addActionListener(``this``);``    ``insertSoundItem.addActionListener(``this``);``    ``insertElementMenu.add(insertImageItem);``    ``insertElementMenu.add(insertSoundItem);``    ``editMenu.addSeparator();``    ``editMenu.add(insertElementMenu);``    ``mnb.add(editMenu);` `    ``setJMenuBar(mnb);``    ` `    ``// 关闭窗口时退出程序 ``    ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);``  ``}``  ` `  ``// 实现 ActionListener 中的方法``  ``public` `void` `actionPerformed(ActionEvent e) {``    ` `    ``if` `(e.getActionCommand() == ``"Exit"``) {``      ``//int result = JOptionPane.showConfirmDialog(this, "确实要退出吗", "退出确认", JOptionPane.YES_NO_CANCEL_OPTION);``      ` `      ``/* 这是用 OptionDialog 实现的输入框 */``      ``int` `result = JOptionPane.showOptionDialog(``        ``this``,``        ``"确实要退出吗？"``,``        ``"退出确认"``,``        ``JOptionPane.YES_NO_CANCEL_OPTION,``        ``JOptionPane.QUESTION_MESSAGE,``        ``null``,``        ``null``,``        ``null``      ``);``      ``text.setText(``""` `+ result);``      ``if` `(``0` `== result)``        ``System.exit(``0``); ``    ``} ``else` `if` `(e.getActionCommand() == ``"Input"``) {``      ``String result = (String)JOptionPane.showInputDialog(``        ``this``,``        ``"请选择一个项目"``,``        ``"这是运动项目选择对话框"``,``        ``JOptionPane.QUESTION_MESSAGE,``        ``null``,``        ``new` `Object[] {``"踢足球"``,``"打蓝球"``,``"跑步"``,``"跳绳"``,``"游泳"``},``        ``"跑步"``      ``);``      ``text.setText(``"您选择的运动项目是"` `+ result);``    ``}``else` `if` `(e.getActionCommand() == ``"Show Message"``) {``      ``JOptionPane.showMessageDialog(``        ``this``,``        ``"这是一个 Java 程序"``,``        ``"我是输出信息对话框"``,``        ``JOptionPane.PLAIN_MESSAGE``      ``);``    ``}``    ` `     ``else` `if` `(e.getActionCommand() == ``"New"``) {``      ``conPane.add(text, BorderLayout.CENTER);``      ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``    ``} ``else` `{``      ``text.setText(e.getActionCommand() + ``"菜单项被选中!"``);``    ``}``  ``}``  ` `}``public` `class` `JOptionPaneApp4 {``  ``public` `static` `void` `main(String[] args) {``    ``String str1 = ``"Frame 窗口"``;``    ``MyJFrameOptionD mw = ``new` `MyJFrameOptionD(str1, ``250``, ``200``);``    ``mw.setVisible(``true``);``  ``}``}
```

**例10-20** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/d5.png)

**例10-20** 的程序分析：

下面的语句用于创建并打开选项对话框：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.9.html?node=858292622&detailRecordId=1318913834&studyrecordId=1225624963&sectionRecordId=1229924129#)

```
这是用 OptionDialog 实现的输入框 ``  ``int` `result = JOptionPane.showOptionDialog(``    ``this``,``    ``"确实要退出吗？"``,``    ``"退出确认"``,``    ``JOptionPane.YES_NO_CANCEL_OPTION,``    ``JOptionPane.QUESTION_MESSAGE,``    ``null``,``    ``null``,``    ``null``  ``);
```



## **10.10 鼠标事件**

### 主体内容

任何组件上都可以发生鼠标事件。 Java 处理鼠标事件提供了两个接口：MouseListener 接口和 MouseMotionListener 接口。

**例10-21** MouseListener 接口的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.10.html?node=858292623&detailRecordId=1318913835&studyrecordId=1225624963&sectionRecordId=1229924121#)

```
package` `com.buptnu;` `import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyPanelMouse ``extends` `JPanel {`` ``public` `void` `print(``int` `r) {``  ``Graphics g = getGraphics();``  ``g.clearRect(``0``, ``0``, ``this``.getWidth(), ``this``.getHeight());``  ``g.setColor(Color.red);``  ``g.fillOval(``10``, ``10``, r, r);`` ``}``}` `class` `MyJFrameMouseListener ``extends` `JFrame ``implements` `MouseListener {`` ``JTextArea text;`` ``MyPanelMouse pnl;`` ``int` `x, y, r = ``10``;`` ``int` `mouseFlg = ``0``;`` ``static` `String[] mouseStates = {``"鼠标键按下"``, ``"鼠标松开"``,``   ``"鼠标进来"``, ``"鼠标走开"``, ``"鼠标点击"``};`` ` ` ``Container conPane = ``null``;`` ` ` ``// 构造方法`` ``public` `MyJFrameMouseListener(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``setLocation(``100``, ``100``);``  ` `  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `GridLayout(``2``, ``1``));``  ` `  ``pnl = ``new` `MyPanelMouse();``  ``conPane.add(pnl);``  ``text = ``new` `JTextArea(``10``, ``20``);``  ``text.setBackground(Color.blue);``  ``conPane.add(text);``  ` `  ``addMouseListener(``this``); ``// 给 MyJFrameMouseListener 对象注册事件监听器``  ` `  ``//setVisible(true);``  ``pack(); ``// 调整窗口以适应组件的大小``  ` `  ``// 关闭窗口时退出程序 ``  ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ` ` ``// paint() 方法在绘制组件时由系统自动调用`` ``public` `void` `paint(Graphics g) {``  ``r = r + ``4``;``  ``if` `(r > ``80``)``   ``r = ``10``;``  ``text.append(``   ``mouseStates[mouseFlg] + ``"了，位置是："` `+ x + ``","` `+``   ``y + ``","` `+ ``"\n"``  ``);``  ``pnl.print(r);`` ``}`` ` ` ``/* 实现 MouseListener 中的方法 */`` ``public` `void` `mousePressed(MouseEvent e) {``  ``x = e.getX();``  ``y = e.getY();``  ``mouseFlg = ``0``;``  ``repaint(); ``// 此方法会自动调用 paint() 方法`` ``}`` ` ` ``public` `void` `mouseReleased(MouseEvent e) {``  ``// 如果 mouseClicked() 方法代码为空，则可以看到此方法的执行效果``  ``x = e.getX();``  ``y = e.getY();``  ``mouseFlg = ``1``;``  ``repaint();`` ``}`` ``public` `void` `mouseEntered(MouseEvent e) {``  ``x = e.getX();``  ``y = e.getY();``  ``mouseFlg = ``2``;``  ``repaint();`` ``}`` ``public` `void` `mouseExited(MouseEvent e) {``  ``x = e.getX();``  ``y = e.getY();``  ``mouseFlg = ``3``;``  ``repaint();`` ``}`` ``public` `void` `mouseClicked(MouseEvent e) {``  ``x = e.getX();``  ``y = e.getY();``  ``mouseFlg = ``4``;``  ``repaint();`` ``}``}` `public` `class` `MouseListenerApp {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameMouseListener mw = ``new` `MyJFrameMouseListener(str1, ``250``, ``200``);``  ``mw.setVisible(``true``);`` ``}``}
```

**例10-21** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/c3.png)

**例10-21** 的程序分析：

MyPanelMouse是一个自定义面板类，它包含一个成员方法print(int r)，根据指定的实参绘制一个红色的圆。

自定义窗口类的构造方法在窗口的内容面板上添加了一个自定义面板对象和一个文本域对象。同时为窗口添加了鼠标事件处理代码。对鼠标移入窗口、移出窗口、按下鼠标、释放鼠标、单击鼠标等事件都做了处理。面板上绘制的红色的圆反应鼠标事件次数，而在文本域显示的具体的鼠标操作是什么。

当然，实际编程的时候，一般不会让整个窗口响应鼠标事件，二是让某个组件响应鼠标事件，此时只要在组件类中编写鼠标事件处理代码即可。

**例10-22** MouseMotionListener 接口的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.10.html?node=858292623&detailRecordId=1318913835&studyrecordId=1225624963&sectionRecordId=1229924121#)

```
package` `com.buptnu;` `import` `javax.swing.*;``import` `java.awt.*;``import` `java.awt.event.*;` `class` `MyJFrameMML ``extends` `JFrame{`` ` ` ``Container conPane = ``null``;`` ` ` ``// 构造方法`` ``public` `MyJFrameMML(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``setLocation(``100``, ``100``);``  ` `  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `BorderLayout());``  ` `  ``JScrollBar xAxis = ``new` `JScrollBar(JScrollBar.HORIZONTAL, ``50``, ``1``, ``0``, ``100``);``  ``JScrollBar yAxis = ``new` `JScrollBar(JScrollBar.VERTICAL, ``50``, ``1``, ``0``, ``100``);``  ``MyListener lsn = ``new` `MyListener(xAxis, yAxis, ``238``, ``118``);``  ``JPanel sCanvas = ``new` `JPanel();``  ``sCanvas.setLayout(``new` `BorderLayout());``  ``sCanvas.add(lsn, BorderLayout.CENTER);``  ``sCanvas.add(xAxis, BorderLayout.SOUTH);``  ``sCanvas.add(yAxis, BorderLayout.EAST);``  ``conPane.add(sCanvas, BorderLayout.CENTER);``  ` `  ``setVisible(``true``);``  ``pack(); ``// 调整窗口以适应组件的大小``  ` `  ``// 关闭窗口时退出程序 ``  ``this``.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`` ``}`` ` ` ``/* getPreferredSize() 方法是窗口的画图系统自动调用的，``  ``* 具体点就是布局管理器在布局组件时调用的。``  ``* 详细信息可以看看 jdk 的源代码。``  ``*/`` ``public` `Dimension getPreferredSize() {``  ``return` `new` `Dimension(``500``, ``300``);`` ``}``}` `class` `MyListener ``extends` `JComponent ``implements``  ``MouseListener, MouseMotionListener, AdjustmentListener {`` ` ` ``private` `int` `x, y;`` ``private` `JScrollBar xScrollBar;`` ``private` `JScrollBar yScrollBar;`` ` ` ``public` `MyListener(JScrollBar xaxis, JScrollBar yaxis, ``int` `x0, ``int` `y0) {``  ``xScrollBar = xaxis;``  ``yScrollBar = yaxis;``  ``x = x0;``  ``y = y0;``  ``xScrollBar.addAdjustmentListener(``this``);``  ``yScrollBar.addAdjustmentListener(``this``);``  ``this``.addMouseListener(``this``);``  ``this``.addMouseMotionListener(``this``);`` ``}`` ` ` ``private` `void` `updateScrollBars(``int` `x, ``int` `y) {``  ``int` `d;``  ``d = (``int``)((``float``)x / (``float``)getSize().width * ``100.0``);``  ``xScrollBar.setValue(d);``  ``d = (``int``)((``float``)y / (``float``)getSize().height * ``100.0``);``  ``yScrollBar.setValue(d);`` ``}`` ` ` ``public` `void` `paint(Graphics g) {``  ``g.setColor(getBackground());``  ``Dimension size = getSize();``  ``g.fillRect(``0``, ``0``, size.width, size.height);``  ``g.setColor(Color.blue);``  ``g.fillRect(x, y, ``50``, ``50``);`` ``}`` ` ` ``// 实现接口中的方法`` ` ` ``public` `void` `mouseEntered(MouseEvent e) {}`` ``public` `void` `mouseExited(MouseEvent e) {}`` ``public` `void` `mouseClicked(MouseEvent e) {}`` ``public` `void` `mouseReleased(MouseEvent e) {}`` ``public` `void` `mousePressed(MouseEvent e) {``  ``x = e.getX();``  ``y = e.getY();``  ``updateScrollBars(x, y);``  ``repaint();`` ``}`` ` ` ``public` `void` `mouseMoved(MouseEvent e) {}`` ``public` `void` `mouseDragged(MouseEvent e) {``  ``x = e.getX();``  ``y = e.getY();``  ``updateScrollBars(x, y);``  ``repaint();`` ``}`` ` ` ``public` `void` `adjustmentValueChanged(AdjustmentEvent e) {``  ``if` `(e.getSource() == xScrollBar) {``   ``x = (``int``) ((``float``)(xScrollBar.getValue() / ``100.0``) * getSize().width);``  ``} ``else` `if` `(e.getSource() == yScrollBar) {``   ``y = (``int``) ((``float``)(yScrollBar.getValue() / ``100.0``) * getSize().height);``  ``}``  ``repaint();`` ``}``}` `public` `class` `MouseMotionListenerApp {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口"``;``  ``MyJFrameMML mw = ``new` `MyJFrameMML(str1, ``250``, ``200``);``  ``//mw.setVisible(true);`` ``}``}
```

**例10-22** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/c4.png)

窗口中有一个蓝色画布，用鼠标拖动它，水平滚动条和垂直滚动条都随之变化。

**例10-22** 的程序分析：

程序中创建了一个自定义组件类MyListener，它继承自系统组件类JComponent。自定义组件类MyListener实现了三个接口MouseListener、MouseMotionListener和AdjustmentListener。自定义组件类把程序所需处理的事件都进行了处理。

窗口对象的构造方法中创建了一个自定义组件类MyListener的实例lsn，用它作为画布组件的事件监听者。

## **10.11 键盘事件**

### 主体内容

键盘事件的事件源一般与组件相关，当一个组件处于激活状态时，按下、释放或敲击键盘上的某个键时发生键盘事件。

**例10-23** 键盘事件的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.11.html?node=858292624&detailRecordId=1318913836&studyrecordId=1225624963&sectionRecordId=1229924122#)

```
package` `com.buptnu;` `import` `java.awt.*;``import` `javax.swing.*;``import` `java.awt.event.*;` `class` `MyJFrameKeyL ``extends` `JFrame ``implements` `KeyListener {`` ``int` `count = ``0``;`` ``Button btn = ``new` `Button(``"开始"``);`` ``TextArea text = ``new` `TextArea(``5``, ``20``);`` ``Container conPane = ``null``;`` ` ` ``public` `MyJFrameKeyL(String name, ``int` `w, ``int` `h) {``  ``super``();``  ``setTitle(name);``  ``setSize(w, h);``  ``setLocation(``400``, ``300``);``  ``conPane = getContentPane();``  ``conPane.setLayout(``new` `FlowLayout());``  ``btn.addKeyListener(``this``);``  ``conPane.add(btn);``  ``conPane.add(text);`` ``}`` ` ` ``public` `void` `keyPressed(KeyEvent e) {``  ``int` `t = e.getKeyCode();``  ``if` `(t >= KeyEvent.VK_A && t <= KeyEvent.VK_Z) {``   ``text.append((``char``)t + ``" "``);``   ``count++;``   ``System.out.println(count);``   ``if` `(count % ``10` `== ``0``)``    ``text.append(``"\n"``);``  ``}`` ``}`` ``public` `void` `keyTyped(KeyEvent e) {}`` ``public` `void` `keyReleased(KeyEvent e) {}`` ` `}` `public` `class` `KeyListenerApp {`` ``public` `static` `void` `main(String[] args) {``  ``String str1 = ``"Frame 窗口：键盘事件"``;``  ``MyJFrameKeyL mw = ``new` `MyJFrameKeyL(str1, ``250``, ``200``);``  ``mw.setVisible(``true``);`` ``}``}
```

**例10-23** 的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/c2.png)

运行的时候要先用鼠标点击“开始”按钮，然后按钮才响应键盘事件。如果用户键入的是英文字符键，则在文本域中显示该字符，并且10个字符一行，然后到下一行显示用户敲击的键的字符。注意，这里是按钮响应键盘事件，与你在文本域中直接键入字符是不同的。

**例10-23** 的程序分析：

程序的事件源是按钮，用“btn.addKeyListener(this);”给按钮注册事件监听者，事件监听者是当前窗口。这里给按钮注册的事件是鼠标事件，不是组件激活事件，因此用的方法是addKeyListener()，而不是addActionListener()。



## **10.12 动手项目**

### 动手项目10-1：自己编写一个记事本程序（选做）

点击折叠

**所需时间：**100分钟。

**项目目标：**自己编写一个记事本程序。

**过程描述：**仿照Windows的记事本的样子和功能，使用Eclipse编写一个记事本的Java程序。

（1）启动Eclipse。

（2）在项目PrjGUI中仿照Windows的记事本的样子和功能，使用Eclipse编写一个记事本的Java程序，要求如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/cc1.png)

（a）创建一个名为“简单记事本”窗口，在窗口中添加一个带有滚动条的文本区。

（b）在窗口中添加一个具有以下菜单的菜单栏：

√ “文件”菜单，包含“打开”、“保存”、“退出”的菜单项，菜单间加分隔线，添加事件处理方法，使菜单具有打开、保存文件及退出的功能。

√ “编辑”菜单，包含“复制”、“剪切”、“粘贴”的菜单项，添加事件处理方法，使菜单具有“复制”、“剪切”、“粘贴”的功能。

√ 格式”菜单，包含“格式设置”的二级子菜单；而二级“格式设置”子菜单， 包含 “自动换行”、“取消自动换行”、“断行不断字”、“取消断行不断字”的菜单项，添加事件处理方法， 设置文本框自动换行和断行不断字的格式。（提示：JTextArea类中，使用setLineWrap(true)方法设置自动换行，使用setWrapStyleword(true)方法设置断行不断字）

（c）在窗口中添加工具栏，包含“打开”、“保存”、“复制”、“剪切”、“粘贴”图片按钮的工具栏，添加事件处理方法，单击相应的按钮能实现相应的功能。

（d）在窗口中添加弹出式菜单，包含“打开”、“保存”、“复制”、“剪切”、“粘贴”的菜单项，直接添加分隔线，添并加事件处理方法，选择相应的菜单项能实现相应的功能。

（3）运行程序，尝试着用它编辑一个文本文件并保存。

（4）可参考下面的程序：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java10.12.html?node=858292625&detailRecordId=1318913837&studyrecordId=1225624963&sectionRecordId=1229924140#)

```
import` `java.awt.*; ``import` `javax.swing.*; ``import` `java.awt.event.*; ``import` `java.io.*; ` `public` `class` `Notepad ``extends` `JFrame ``{ ``  ``private` `JTextArea editor; ``  ``private` `Container c; ``  ``private` `Font f=``new` `Font(``"sanserif"``,Font.PLAIN,``12``); ``  ``//菜单栏成员属性声明 ``  ``private` `JMenuBar mb;    ``//菜单棒 ``  ``private` `JMenu fileMenu;   ``//文件菜单 ``  ``private` `JMenu editMenu;   ``//编辑菜单 ``  ``private` `JMenu formatMenu;  ``//格式菜单 ``  ``private` `JMenuItem fileMenuOpen,fileMenuSave,fileMenuExit;  ``//文件菜单的菜单项 ``  ``private` `JMenuItem editMenuCopy,editMenuCut,editMenuPaste;  ``//编辑菜单的菜单项 ``  ``private` `JMenu formatSet;``//格式菜单第一级菜单 ``  ``private` `JMenuItem lineWrap,cancleLineWrap,wrapStyleWord,cancleWrapStyleWord;``//格式菜单的第二级菜单 `` ` `  ``//工具栏成员属性声明 ``  ``private` `JToolBar toolBar;  ``//工具棒 ``  ``private` `JButton b1,b2,b3,b4,b5; ``//声明5个按钮，分别为：“打开”、“保存”、“复制”、“剪切”、“粘贴” ``   ` `  ``//弹出式菜单属性声明 ``  ``private` `JPopupMenu pm; ``  ``private` `JMenuItem item1,item2,item3,item4,item5; ` `  ``public` `Notepad() ``  ``{ ``    ``super``(``"简单记事本"``); ``    ``setSize(``400``,``300``); ``   ` `    ``try``{ ``      ``UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); ``    ``} ``catch` `(Exception e){ System.err.println(``"不能被设置外观的原因:"``+e);} `` ` `    ``c=getContentPane();     ``//创建一个内容面板 ``    ``editor = ``new` `JTextArea();  ``//创建一个文本区 ``    ``c.add(``new` `JScrollPane(editor)); ``//设置滚动条，并添加到内容面板 `` ` `    ``//菜单栏的实现 ``    ``//文件菜单的实现 ``    ``mb = ``new` `JMenuBar();  ``//创建菜单棒 ``    ``fileMenu = ``new` `JMenu(``"文件(F)"``);``//创建菜单 ``    ``fileMenuOpen = ``new` `JMenuItem(``"打开(O)...Ctrl+O"``); ``    ``fileMenuSave = ``new` `JMenuItem(``"保存(S)...Ctrl+S"``); ``    ``fileMenuExit = ``new` `JMenuItem(``"退出"``); ``    ``JMHandler JM=``new` `JMHandler();    ``//创建监听器 ``    ``fileMenuOpen.addActionListener(JM); ``//注册监听器 ``    ``fileMenuSave.addActionListener(JM); ``    ``fileMenuExit.addActionListener(JM); ``    ``fileMenu.add(fileMenuOpen); ``    ``fileMenu.add(fileMenuSave); ``    ``fileMenu.addSeparator();  ``//添加分隔线 ``    ``fileMenu.add(fileMenuExit); ``    ``fileMenu.setFont(f);    ``//设置菜单中文体的字体 ``     ` `    ``//编辑菜单的实现 ``    ``editMenu = ``new` `JMenu(``"编辑(E)"``); ``    ``editMenuCopy = ``new` `JMenuItem(``"复制(C) Ctrl+C"``); ``    ``editMenuCut = ``new` `JMenuItem(``"剪切(T) Ctrl+X"``); ``    ``editMenuPaste = ``new` `JMenuItem(``"粘贴(P) Ctrl+v"``); ``    ``EMHandler EM=``new` `EMHandler();  ``//创建监听器 ``    ``editMenuCopy.addActionListener(EM);``//注册监听器 ``    ``editMenuCut.addActionListener(EM); ``    ``editMenuPaste.addActionListener(EM); ``    ``editMenu.add(editMenuCopy); ``    ``editMenu.add(editMenuCut); ``    ``editMenu.add(editMenuPaste); ``    ``editMenu.setFont(f); `` ` `    ``//格式菜单的实现 ``    ``formatMenu = ``new` `JMenu(``"格式(O)"``);      ``//创建菜单 ``    ``formatSet = ``new` `JMenu(``"格式设置"``);     ``//二级菜单 ``    ``lineWrap = ``new` `JMenuItem(``"自动换行"``);    ``//二级菜单项 ``    ``cancleLineWrap = ``new` `JMenuItem(``"取消自动换行"``); ``    ``wrapStyleWord = ``new` `JMenuItem(``"断行不断字"``); ``    ``cancleWrapStyleWord = ``new` `JMenuItem(``"取消断行不断字"``); ``    ``FMHandler FM=``new` `FMHandler();        ``//创建事件监听器 ``    ``lineWrap.addActionListener(FM);       ``//注册二级菜单项的监听器 ``    ``cancleLineWrap.addActionListener(FM); ``    ``wrapStyleWord.addActionListener(FM); ``    ``cancleWrapStyleWord.addActionListener(FM); ``    ``formatSet.add(lineWrap); ``    ``formatSet.add(cancleLineWrap); ``    ``formatSet.addSeparator();  ``//添加分隔线 ``    ``formatSet.add(wrapStyleWord); ``    ``formatSet.add(cancleWrapStyleWord); ``    ``formatMenu.add(formatSet); ``    ``formatMenu.setFont(f); `` ` `    ``//将菜单全部添加菜单棒里 ``    ``mb.add(fileMenu); ``    ``mb.add(editMenu); ``    ``mb.add(formatMenu); ` `    ``//工具栏的实现 ``    ``//按钮分别为：“打开”、“保存”、“复制”、“剪切”、“粘贴” ``    ``toolBar =``new` `JToolBar();  ``//创建工具棒 ``    ``b1= ``new` `JButton(``new` `ImageIcon(``"img/open.gif"``)); ``    ``b2= ``new` `JButton(``new` `ImageIcon(``"img/save.gif"``)); ``    ``b3= ``new` `JButton(``new` `ImageIcon(``"img/copy.gif"``)); ``    ``b4= ``new` `JButton(``new` `ImageIcon(``"img/cut.gif"``)); ``    ``b5= ``new` `JButton(``new` `ImageIcon(``"img/paste.gif"``)); ``    ``TBHandler TB=``new` `TBHandler();    ``//创建按钮监听器 ``    ``b1.addActionListener(TB);  b2.addActionListener(TB); ``    ``b3.addActionListener(TB);  b4.addActionListener(TB); ``    ``b5.addActionListener(TB); ``    ``//把按钮全部添加到工具棒中 ``    ``toolBar.add(b1);  toolBar.add(b2); ``    ``toolBar.add(b3);  toolBar.add(b4); ``    ``toolBar.add(b5); `` ` `    ``//弹出菜单的实现 ``    ``pm =``new` `JPopupMenu();  ``//创建弹出菜单 ``    ``item1 = ``new` `JMenuItem(``"打开"``); ``    ``item2 = ``new` `JMenuItem(``"保存"``); ``    ``item3 = ``new` `JMenuItem(``"复制"``); ``    ``item4 = ``new` `JMenuItem(``"剪切"``); ``    ``item5 = ``new` `JMenuItem(``"粘贴"``); ``    ``JPHandler JP=``new` `JPHandler(); ``    ``item1.addActionListener(JP); ``//注册菜单项的鼠标事件监听器 ``    ``item2.addActionListener(JP); ``    ``item3.addActionListener(JP); ``    ``item4.addActionListener(JP); ``    ``item5.addActionListener(JP); ``    ``editor.addMouseListener(JP); ``//注册文本区的鼠标事件监听器 ``    ``pm.add(item1); pm.add(item2); ``    ``pm.add(item3); pm.add(item4); ``    ``pm.add(item5); ``     ` `    ``//把菜单栏、工具栏、弹出菜单添加到内容面板 ``    ``setJMenuBar(mb);    ``//显示菜单栏 ``    ``c.add(toolBar,BorderLayout.NORTH); `` ` `    ``setVisible(``true``); ``    ``setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ``  ``} `` ` `  ``//自定义类实现文件菜单项的事件处理 ``  ``private` `class` `JMHandler ``implements` `ActionListener ``  ``{   ``    ``public` `void` `actionPerformed(ActionEvent e) ``    ``{ ``      ``if``(e.getSource()==fileMenuOpen){ loadFile(); } ``      ``else` `if``(e.getSource()==fileMenuSave){ saveFile(); } ``      ``else``{System.exit(``0``);} ``    ``} `` ` `  ``} `` ` `  ``public` `void` `loadFile() ``//打开文件方法 ``  ``{ ``    ``JFileChooser fc=``new` `JFileChooser(); ``    ``int` `r=fc.showOpenDialog(``this``); ``    ``if``(r==JFileChooser.APPROVE_OPTION) ``    ``{ ``      ``File file=fc.getSelectedFile(); ``      ``try``{ editor.read(``new` `FileReader(file),``null``);} ``      ``catch``(IOException e){} ``    ``} ``  ``} ``     ` `  ``public` `void` `saveFile() ``//保存文件的方法 ``  ``{ ``    ``JFileChooser fc=``new` `JFileChooser(); ``    ``int` `r=fc.showSaveDialog(``this``); ``    ``if``(r==JFileChooser.APPROVE_OPTION) ``    ``{ ``      ``File file=fc.getSelectedFile(); ``      ``try``{ editor.write(``new` `FileWriter(file));} ``      ``catch``(IOException e){} ``    ``} ``  ``} ` `  ``//编辑菜单菜单项的事件处理 ``  ``private` `class` `EMHandler ``implements` `ActionListener ``  ``{ ``    ``public` `void` `actionPerformed(ActionEvent e) ``    ``{ ``      ``if``(e.getSource()==editMenuCopy)   ``//实现复制功能 ``      ``{ ``        ``editor.copy(); ``        ``editor.requestFocus(); ``      ``} ``      ``else` `if``(e.getSource()==editMenuCut)``//实现剪切功能 ``      ``{ ``        ``editor.cut(); ``        ``editor.requestFocus(); ``      ``} ``      ``else`                `//实现粘贴功能 ``      ``{ ``        ``editor.paste(); ``        ``editor.requestFocus(); ``      ``} ``    ``} ``  ``} ``  ``//格式菜单二级菜单的菜单项的事件处理 ``  ``private` `class` `FMHandler ``implements` `ActionListener ``  ``{ ``    ``public` `void` `actionPerformed(ActionEvent e) ``    ``{ ``      ``if``(e.getSource()==lineWrap){ editor.setLineWrap(``true``); } ``      ``else` `if``(e.getSource()==cancleLineWrap) { editor.setLineWrap(``false``);} ``      ``else` `if``(e.getSource()==wrapStyleWord) { editor.setWrapStyleWord(``true``);} ``      ``else``{ editor.setWrapStyleWord(``false``); } ``    ``} ``  ``} `` ` `  ``//自定义类实现工具栏的按钮事件处理 ``  ``private` `class` `TBHandler ``implements` `ActionListener ``  ``{ ``    ``public` `void` `actionPerformed(ActionEvent e) ``    ``{ ``      ``if``(e.getSource()==b1){ loadFile(); }    ``//实现打开文件功能 ``      ``else` `if``(e.getSource()==b2) {saveFile();}  ``//实现保存文件功能 ``      ``else` `if``(e.getSource()==b3) ``//文件复制 ``      ``{ ``        ``editor.copy(); ``        ``editor.requestFocus(); ``      ``} ``      ``else` `if``(e.getSource()==b4) ``//文件剪切 ``      ``{ ``        ``editor.cut(); ``        ``editor.requestFocus(); ``      ``} ``      ``else`            `//文件粘贴 ``      ``{ ``        ``editor.paste(); ``        ``editor.requestFocus(); ``      ``} ``    ``} ``  ``} `` ` `  ``//自定义类实现弹出式菜单的事件处理 ``  ``private` `class` `JPHandler ``implements` `ActionListener,MouseListener ``  ``{ ``    ``public` `void` `actionPerformed(ActionEvent e) ``    ``{ ``      ``if``(e.getSource()==item1){ loadFile(); }   ``//实现打开文件功能 ``      ``else` `if``(e.getSource()==item2) {saveFile();} ``//实现保存文件功能 ``      ``else` `if``(e.getSource()==item3)  ``//文件复制 ``      ``{ ``        ``editor.copy(); ``        ``editor.requestFocus(); ``      ``} ``      ``else` `if``(e.getSource()==item4) ``//文件剪切 ``      ``{ ``        ``editor.cut(); ``        ``editor.requestFocus(); ``      ``} ``      ``else`            `//文件粘贴 ``      ``{ ``        ``editor.paste(); ``        ``editor.requestFocus(); ``      ``} ``    ``} `` ` `    ``public` `void` `mouseReleased(MouseEvent e) ``    ``{ ``      ``if``(e.isPopupTrigger())         ``//判断是否按下鼠标右键 ``        ``pm.show(editor,e.getX(),e.getY()); ``//显示弹出式菜单 ``    ``} `` ` `    ``public` `void` `mouseClicked(MouseEvent e){} ``    ``public` `void` `mouseEntered(MouseEvent e){} ``    ``public` `void` `mouseExited(MouseEvent e){} ``    ``public` `void` `mousePressed(MouseEvent e){} ``  ``} `` ` `  ``public` `static` `void` `main(String []args) ``  ``{ ``    ``Notepad N=``new` `Notepad(); ``  ``} ``     ` `}
```

## **10.13 小结**

### 主体内容

具有图形界面的Java程序使用事件驱动工作方式。编写具有图形用于界面的 Java 程序时不仅要创建程序的图形界面，还要编写相应的事件处理代码，这样程序才能响应用户的操作。

Java 通过提供 GUI 库提供对图形用户界面编程的支持。

Java的图形用户界面包括组件、容器和布局管理器。组件是构成图形界面的基本元素，用户可以直接操作组件，例如按钮，滚动条等都是组件。容器是图形界面的复合元素，一个容器可以容纳多个组件，使这些组件成为一个整体。容器本身也是一个组件，具有组件的所有性质，另外还具有容纳其它组件的功能。布局管理器负责组件在容器中的布局。

在Java中，程序和用户的交互是通过响应各种事件来实现的。例如，用户点击一个按钮，就意味着一个按钮事件的发生；选中一个选项，就意味着一个选项事件的发生。每当一个事件发生，Java虚拟机就会产生代表这个事件的事件对象，然后将事件对象传递给程序，由程序的事件处理方法对事件进行处理。如果没有编写事件处理方法，程序就不能和用户交互。

Java采用事件委托模型处理事件。把能够产生事件的组件叫做事件源。事件源产生的事件并不是由事件源本身处理，而是由其他的对象来处理。用来处理事件的对象，就叫做事件监听者或事件监听器。需要注意的是，不是随便拿一个对象就可以当事件监听者的。必须让对象具有事件处理能力，这个对象才能当事件监听者。要想让事件源具备事件处理的能力，就必须在事件监听者中实现相应的事件监听接口。此外，程序代码要明确地指明某个事件源产生某个事件之后要交给哪个事件监听者去处理。这个工作是通过给事件源注册事件监听者完成的。

Java 将事件分类，称为事件类型。每一种事件都有一个事件类与之对应，当事件产生后，系统会根据与事件对应的事件类创建一个事件对象代表该事件，然后交给事件处理机制去处理。每个事件类型都有一个特定的事件监听接口，事件监听者必须实现与事件类型相对应的事件监听接口才具有处理那类事件的能力。

我们在编写事件处理代码时，很重要的事情就是弄清楚要对哪些组件产生的哪些事件进行处理，与要处理的事件对应的时间监听接口是什么。这些清楚了就好办了。之后的事情只要按照 Java 的事件处理代码编写框架把我们的代码“填写”到恰当的地方就成了。

窗口是顶层容器，小应用程序或图形界面的应用程序的可视组件都放在窗口中。有三种窗口：Applet 窗口、 框架窗口（JFrame）和 无边框的窗口（JWindow）。

面板有两种：普通面板 JPanel 和滚动面板 JScrollPane。

每个容器都有一个布局管理器用来管理组件在该容器中的布局。布局管理器是实现 LayoutManager 接口的类。

空布局就是把一个容器的布局管理器设置为null布局。当把一个容器的布局管理器设置为null布局的时候，可以使用setBounds()方法手工设置组件本身的大小和组件在容器中的位置。

一个菜单条可以放多个菜单，每个菜单又可以放多个菜单项。菜单中的菜单项也可以是一个完整的菜单，因而可以构造一个层次状菜单结构。

对话框是一个临时窗口，可以在其中放置用于显示信息或得到用户输入的组件。在 Swing 中，有两个对话框类，一个是 JDialog 类，提供构造并管理通用对话框；另一个是 JOptionPane 类，提供构造常见对话框。任何组件上都可以发生鼠标事件。 Java 处理鼠标事件提供了两个接口：MouseListener 接口和 MouseMotionListener 接口。

键盘事件的事件源一般与组件相关，当一个组件处于激活状态时，按下、释放或敲击键盘上的某个键时发生键盘事件。

## **10.14 思考题**

## 主体内容

**1.什么是事件？什么是事件驱动工作方式？**【隐藏】

**答：**事件泛指由用户或系统触发的一个特定操作。例如：用鼠标单击命令按钮，将触发一个按钮的Click事件；用鼠标选择一个菜单项，会产生一个菜单项的选择事件，等等。事件驱动工作方式是指，程序启动后，执行一系列初始化操作，然后处于等待状态。当用户或系统触发某个事件之后，程序马上就去执行与该事件对应的过程。待事件过程执行完毕后，系统又处于等待某事件发生的状态。程序的这种工作方式称为事件驱动工作方式。

具有图形界面的Java程序使用事件驱动工作方式。编写具有图形用于界面的 Java 程序时不仅要创建程序的图形界面，还要编写相应的事件处理代码，这样程序才能响应用户的操作。

**2.Java GUI 库代码提供的基本功能有哪些？**【隐藏】

**答：**Java 通过提供 GUI 库提供对图形用户界面编程的支持， GUI 库的代码提供了这样一些基本功能：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_21.png) 创建用户界面的“ 控件” 或组件，如滚动条、按钮和标签等。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_21.png) 通过把 GUI 事件（例如单击按钮）和程序程序员编写的事件处理代码关联起来，可以控制组件的动作 。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_21.png) 支持对屏幕上的组件进行分组和布局。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_21.png) 支持访问窗口管理器，指定某个窗口作为输入焦点，读取 JPEG 和其它影响文件 ，以及进行打印等。

**3.如何用分层次的方法看待组件和容器之间的关系？**【隐藏】

**答：**容器和组件通常是具有一定的包含关系的。可以按照这样的观点分层次：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_21.png) 顶层容器（不会包含在其它任何容器中的容器），例如JFrame 、JApplet 、JDialog 、JWindow等；

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_21.png) 中间容器，例如 JPanel 、JScrollPane 、JSplitPane 、JToolBar 等；

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_21.png) 基本控件，例如 JButton 、JComboBox 、JList 、JMenu 、JTextField 等；

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/java3_21.png) 可编辑的组件，例如 JColorChooser 、JFileChooser 、JTextArea 等。

在构建程序的图形界面时，一般一次创建顶层容器，中间容器，基本控件和可编辑组件，然后再把基本控件和可编辑组件放到中间容器中，最后再把中间容器放到顶层容器中。

## **10.15 自测练习**

## 【课后练习】

1. 下面选项中不是Java GUI库的代码提供的基本功能的是（）。 

   （A）创建用户界面的“ 控件” 或组件，如滚动条、按钮和标签等   （B）支持对屏幕上的组件进行分组和布局   （C）基本的 I/O 处理  （D）通过把GUI事件和程序程序员编写的事件处理代码关联起来，控制组件的动作

   2. 以下有关事件监听器的叙述正确的是（）。 

      （A）多个监听者可以被附加到一个组件   （B）只有一个监听者可以被附加到一个组件上   （C）一个监听者只能接受一个组件产生的事件  （D）以上都不对

      3. 如果容器组件p的布局是BorderLayout，则在p的下边中添加一个按钮b，应该使用的语句是（）。 （A）p.add(b);   （B）p.add(b,"North");   （C）p.add(b,"South");  （D）b.add(p,"North");
         4. 容器被重新设置大小后，下面布局管理器的容器中的组件大小不随容器大小的变化而改变是（）。 （A）CardLayout   （B）FlowLayout   （C）BorderLayout  （D）GridLayout
            5. 用鼠标点击菜单项（MenuItem）产生的事件是（）。 （A）MenuEvent   （B）ActionEvent   （C）KeyEvent  （D）MouseEvent



# 第11章 数据库编程

## **11.1 JDBC概述**

### JDBC的概念

点击折叠

开发数据库应用程序的Java API称为JDBC，它支持访问关系数据库的Java程序。虽然JDBC本身是个商标名（它是用于访问数据库的Java API的品牌名称）而不是一个缩写字，然而人们通常把它认为是代表“Java 数据库连接 (Java Database Connectivity)”。

JDBC由一组用Java编程语言编写的类和接口组成，使程序员能够用纯Java API来编写数据库应用程序。通过JDBC API，用Java语言编写的应用程序能够执行SQL语句、获取结果、在友好的用户界面中显示数据，并且可以将所做的修改传回数据库。JDBC API还可用于异构环境中多种数据源之间的交互。

通常的编程技术中，应用程序通过数据库厂商提供的API访问数据库，如图11.1所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y1.png)

**图11.1 应用程序访问数据库的通常方式**

在这种方式中，数据库厂商提供数据库编程API，不同的数据库有不同的API。这样的话，对于实现同样功能的应用程序，针对不同的数据库，开发人员需要编写不同的代码，这样对Java设计人员是很不方便的。

Java技术中，应用程序使用JDBC访问数据库，如图11.2所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y2.png)

**图11.2 Java程序通过JDBC访问数据库的方式**

在这种方式中，JDBC API和JDBC驱动程序协同实现Java程序对数据库的访问功能。其中，JDBC API是一个Java接口和类的集合，用于编写访问和操纵关系数据库的Java程序；而JDBC驱动程序起着接口实现的作用。JDBC驱动与具体数据相关，所以通常有数据库厂商提供。访问MySQL数据库需使用MySQL JDBC驱动程序，访问Oracle数据库需要使用Oracle JDBC驱动程序，而访问SQL Server数据库需要使用问SQL Server JDBC驱动程序。应用程序调用JDBC提供的API，其实是由数据库厂商提供的JDBC驱动程序来负责实现的。如果要更换数据库，只要更换驱动程序，并在JDBC中载入新的驱动程序来源，即可完成数据库系统的变更。换句话说，使用JDBC后就没有必要写一个程序访问Oracle数据库，而另一个程序访问SQL Server数据库，再写一个程序访问SQL Server了。 



### JDBC的主要组成和实现机制

点击折叠

JDBC的主要组成及其实现如图11.3所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y3.png)

**图11.3 Java程序通过JDBC API访问数据库**

JDBC包含了若干用于数据库访问的类和接口，以及接口的实现代码，其实现原理如图11.4所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y4.png)

**图11.4 JDBC实现原理**

（1）JDBC驱动管理器：java.sql.DriverManager，负责注册JDBC驱动器，并为创建数据库连接提供支持。由SUN公司实现。

（2）JDBC驱动器API：java.sql.Driver，由SUN公司实现。

（3）JDBC驱动器：有数据库供应商或者第三方工具提供商创建，也称为JDBC驱动程序。JDBC驱动程序负责与特定的数据库连接，并处理通信细节。

JDBC驱动器可以分为以下四种类型：

①第一类驱动程序：JDBC-ODBC驱动器：

ODBC（Open DataBase Connectivity）开放数据库互连是微软公司为应用程序提供的访问任何一种数据库的标准API。JDBC-ODBC 驱动器是由SUN 公司开发实现的驱动器，为Java 程序和ODBC 之间建立了桥接，使得Java程序可以间接地访问ODBC API。但是这种方式连接数据库的速度比较慢，把请求转发给ODBC，再由ODBC 将请求发送给数据库服务器。

②第二类驱动程序：

由部分Java程序代码和部分本地代码组成。用于与数据库的客户端API 进行通信。

③第三类驱动程序：

完全由Java 语言编写的类库。用一种与具体数据库服务器无关的协议将请求发送给服务器的特定组件，再由该组件按照特定数据库协议对请求进行翻译，把翻译后的内容发送给数据库服务器。

④第四类驱动程序：

完全由Java语言编写的类库。直接按照特定数据库的协议，把请求发送给数据库服务器。通过第四类驱动程序访问数据库的速度最快。

编程的时候优先考虑第三类和第四类驱动程序，如果某种数据库不存在第三类或者第四类驱动程序，可以考虑使用第一类和第二类驱动程序。



### JDBC API简介及使用

JDBC中，定义了许多接口和类，但经常使用的不是很多。以下介绍的是最常用的接口和类，使初学者能够尽快掌握JDBC技术。

（1）java.sql.DriverManager 驱动程序管理类：

DriverManage 类是java.sql包中用于管理数据库驱动程序的类。它处理驱动程序的加载和建立数据库连接。DriverManage类的静态方法 getConnection() 用于建立数据库连接。该方法返回一个Connection对象。

（2）java.sql.Connection类：

Connection类是java.sql包中用于处理特定数据库连接的类。Connection对象表示一个实际的数据库连接，在操作数据库之前应该首先建立数据库连接，取得Connection对象。

（3）Statement类：

Statement类是java.sql包中用于在指定的连接中处理SQL语句的类。取得Connection 对象之后，用该对象的 createStatement()方法创建Statement对象，然后就可以用Statement 对象执行SQL语句操作数据库了。

（4）ResultSet类：

ResultSet类是java.sql包中用于管理查询结果集的类。Statement对象执行SQL语句时，如果该SQL语句是一个查询语句，将返回一个查询结果集，ResultSet对象就表示一个查询结果集，它管理查询结果记录。



## **11.2 MySQL 数据库的安装和配置**

### 主体内容

点击折叠

MySQL是一个关系型数据库管理系统，由瑞典MySQL AB公司开发，目前属于 Oracle 旗下公司。MySQL是一个开源的关系数据库系统，它的许多应用也是免费的。

Windows下的MySQL安装文件有两个版本，一个版本是msi（或exe）格式的，一种是zip格式的。如果是msi（或exe）格式的可以直接点击安装，按照它给出的安装提示进行安装（相信大家的英文可以看 懂英文提示），一般MySQL将会安装在C:\Program Files\MySQL\MySQL Server x.x目录中，其中x.x是你所安装的MySQL的版本号。zip格式文件要自己解压，解压缩之后再进行一些安装和配置。

下面介绍zip格式的MySQL安装文件的解压缩和安装配置。

这里所使用的文件是mysql-5.7.11-winx64.zip。

**1．解压缩文件mysql-5.7.11-winx64.zip。**

解压缩文件mysql-5.7.11-winx64.zip到当前文件夹下，会得到一个同名的文件加。将该文件夹改放到合适的位置，如 C:\Program Files\MySQL路径中（如果你的磁盘上还没有此文件夹，你可以先创建它，然后再把解压缩之后的文件夹复制到该文件夹下），如图11.5所示。当然你也可以放到自己想放的任意位置。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y5.png)

**图11.5 将解压缩后的文件夹复制到C:\Program Files\MySQL**

**2．配置环境变量。**

此处配置环境变量path，将MySQL的命令文件路径添加到环境变量path中。在环境变量Path中添加MySQL命令文件所在路径的作用是使的在Windows的命令提示符窗口中键入MySQL命令时，Windows能够找到其相应的文件。

在Windows中，选择「开始」菜单，从「开始」菜单中打开“控制面板”。在“控制面板”中选择“系统和安全->系统->高级系统设置”，打开“系统属性”对话框。在“系统属性”对话框中选择“高级”标签页，如图11.6所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y6.png)

**图11.6 “系统属性”对话框中的“高级”标签页**

在“系统属性”对话框中的“高级”标签页中点击“环境变量”，打开“环境变量”对话框，如图11.7所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y7.png)

**图11.7 “环境变量”对话框中**

在“环境变量”对话框中的“系统变量”区域选择“Path”，然后点击“编辑”，打开“编辑系统变量”对话框，在“变量值”的最后添加MySQL的命令文件所在路径，如图11.8所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y8.png)

**图11.8 “环境变量”对话框中**

这里添加的路径是

C:\Program Files\MySQL\mysql-5.7.11-winx64\bin

如果你把解压缩后的MySQL文件夹放到其它路径下了，那么添加的路径是要修改成你实际的存放路径。此外，还要注意，Path的路径之间用英文的分号隔开。

**3．编辑MySQL配置文件。**

配置完环境变量之后先别忙着启动MySQL，我们还需要编辑一下MySQL的配置文件。

进入MySQL的基路径，此处是

C:\Program Files\MySQL\mysql-5.7.11-winx64

你会看到一个文件my-default.ini，这是创建配置文件的模板。你复制它到同目录下，并改名为“my.ini”。这个my.ini （Linux系统下是my.cnf）就是MySQL的配置文件，当mysql服务器启动时它会读取这个文件，设置相关的运行环境参数。

用记事本打开my.ini，并编辑如下配置项：

\# These are commonly set, remove the # and set as required.

basedir = C:\Program Files\MySQL\mysql-5.7.11-winx64

datadir = C:\Program Files\MySQL\mysql-5.7.11-winx64\data

port = 3306

\# server_id = .....

**注：**在mysql-5.7.11-winx64中不编辑这个配置文件也可以，MySQL会使用默认的环境参数。其默认环境参数根此处设置的值是相同的。如果你想修改参数，例如把数据文件放到别的文件夹中，或者修改MySQL的服务端口为其它端口，则就需要创建并编辑配置文件了。

**4．安装MySQL服务。**

在Windows中，选择「开始」菜单，从「开始」菜单中选择“所有程序->附件”，在“附件”的子菜单中右键单击“命令提示符”，打开快捷菜单，如图11.9所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y9.png)

**图11.9 右键单击“命令提示符”的快捷菜单**

在该快捷菜单中选择“以管理员身份运行”。这样就“以管理员身份运行”打开了命令提示符窗口，在其中键入的命令都是以管理员身份运行，如图11.10所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y10.png)

**图11.10 以管理员身份打开的命令提示符窗口**



![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y11.png)

**图11.11 将mysql安装到windows的服务**

**5．初始化data目录。**

MySQL的data目录下面存放一些系统文件和用户数据库文件。而mysql-5.7.11-winx64.zip解压缩之后的初始目录下是没有data目录的。所以还还需要初始化data目录。

MySQL的官方的安装文档说要用mysqld --initialize 先初始化data目录。其中，mysqld --initialize-insecure自动生成无密码的root用户，mysqld --initialize自动生成带随机密码的root用户。data文件夹不为空是不能执行这个命令的。可以先删除data目录下的所有文件或者移走。

这里用mysqld --initialize-insecure初始化，生成一个无密码的root用户（MySQL的管理员用户），后面用此用户登录到MySQL服务器后再重新给他设定密码。

以管理员身份运行命令提示符，键入命令mysqld --initialize-insecure，完成初始化，如图11.12所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y12.png)

**图11.12 用命令mysqld --initialize-insecure完成MySQL的初始化**

**6．启动MySQL服务。**

执行net start mysql启动服务（net stop mysql将停止服务），如图11.13所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y13.png)

**图11.13 启动MySQL服务**

**7．登录MySQL服务器并设置root的密码。**

使用命令mysql -h localhost -u root登录MySQL服务器，然后用命令SET PASSWORD FOR 'root'@'localhost' = PASSWORD('newpass');为root设置密码，如图11.14所示。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/y14.png)

**图11.14 登录MySQL服务器并设置root的密码**

之后就可以用root/mypsd登录MySQL服务器了。

注意：每次重启计算机后要用管理员身份重启一下MySQL服务器，即net start mysql



### 活动：亲自下载、安装和配置MySQL

请你按照上面的说明，亲自在你自己的计算机上安装和配置MySQL

Step 1. 到MySQL官网或本网站“课程资源”栏目下载MySQL安装文件。

Step 2. 安装并配置MySQL服务器。

Step 3. 启动MySQL服务。

Step 4. 登录MySQL服务器并设置root的密码。

Step 5. 在网上查找MySQL用法资料，试着执行一些MySQL基本命令，用SQL语句一些基本操作，如创建数据库、创建数据库表、向数据库表中添加一些记录、查询数据等。



## **11.3 Java程序访问MySQL数据库**

### 主体内容

使用Eclipse开发访问MySQL数据库的Java程序的过程是：

（1）下载数据库厂商提供的驱动程序包。

（2）将驱动程序包引入项目中。

（3）编写代码，通过纯Java驱动方式与数据库建立连接。



### 活动：观看关于安装和配置MySQL的视频

下面的视频演示了开发使用JDBC访问MySQL数据库的Java程序的过程。请观看下面的视频。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/img/vid11-1.png)

**视频11-1：开发使用JDBC访问MySQL数据库的Java程序**

\1. 登录MySQL服务器并创建数据库testp，后面程序将连接到这个数据库。

以管理员身份运行cmd命令提示符窗口，运行命令net start mysql，启动mysql服务。

然后使用mysql –h localhost –u root –p登录服务器，输入密码。

使用命令create database testp;创建数据库。

使用命令show databases;查看是否创建成功。

\2. 下载MySQL的JDBC驱动程序包。这里所使用的MySQL驱动程序包是mysql-connector-java-5.1.38-bin.jar。你可以在网上下载这个包更新版本的MySQL驱动程序包。

\3. 项目下新建文件夹lib，按照导入文件系统方式把文件mysql-connector-java-5.1.38-bin.jar导入到lib下面。

\4. 在Eclipse下，选菜单Project->Properties->Java Build Path->Libraries->Add JARs，找到PrjDB下面的lib下面的mysql-connector-java-5.1.38-bin.jar，加进去即可。此表示构建项目的时候把此jar文件构建进去。注意，这不是必须的。实际上运行程序的时候只要编辑CLASSPATH环境变量，让Java运行时能够找到mysql-connector-java-5.1.38-bin.jar即可。

\5. 编辑MysqlDemo.java，文件如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
import` `java.sql.DriverManager;``import` `java.sql.ResultSet;``import` `java.sql.SQLException;``import` `java.sql.Connection;``import` `java.sql.Statement;` `public` `class` `MysqlDemo {``  ``public` `static` `void` `main(String[] args) ``throws` `Exception {``    ``Connection conn = ``null``;``    ``String sql;``    ``// MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值``    ``// 避免中文乱码要指定useUnicode和characterEncoding``    ``// 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，``    ``// 下面语句之前就要先创建javademo数据库``    ``String url = ``"jdbc:mysql://localhost:3306/testp?"``        ``+ ``"user=root&password=root&useUnicode=true&characterEncoding=UTF8"``;`` ` `    ``try` `{``      ``// 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，``      ``// 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以``      ``Class.forName(``"com.mysql.jdbc.Driver"``);``// 动态加载mysql驱动``      ``// or:``      ``// com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();``      ``// or：``      ``// new com.mysql.jdbc.Driver();`` ` `      ``System.out.println(``"成功加载MySQL驱动程序"``);``      ``// 一个Connection代表一个数据库连接``      ``conn = DriverManager.getConnection(url);``      ``// Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等``      ``Statement stmt = conn.createStatement();``      ``sql = ``"create table student(NO char(20),name varchar(20),primary key(NO)) charset utf8 collate utf8_general_ci;"``;``      ``int` `result = stmt.executeUpdate(sql);``// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功``      ``if` `(result != -``1``) {``        ``System.out.println(``"创建数据表成功"``);``        ``sql = ``"insert into student(NO,name) values('2012001','陶伟基')"``;``        ``result = stmt.executeUpdate(sql);``        ``sql = ``"insert into student(NO,name) values('2012002','周小俊')"``;``        ``result = stmt.executeUpdate(sql);``        ``sql = ``"select * from student"``;``        ``ResultSet rs = stmt.executeQuery(sql);``// executeQuery会返回结果的集合，否则返回空值``        ``System.out.println(``"学号\t姓名"``);``        ``while` `(rs.next()) {``          ``System.out``              ``.println(rs.getString(``1``) + ``"\t"` `+ rs.getString(``2``));``// 入如果返回的是int类型可以用getInt()``        ``}``      ``}``    ``} ``catch` `(SQLException e) {``      ``System.out.println(``"MySQL操作错误"``);``      ``e.printStackTrace();``    ``} ``catch` `(Exception e) {``      ``e.printStackTrace();``    ``} ``finally` `{``      ``conn.close();``    ``}`` ` `  ``}`` ` `}
```

\6. 执行程序。程序的功能是连接到testp上，创建一个数据表student，向表中添加一条记录，最后读取表中记录并在控制台显示。

活动的解析：Java程序访问MySQL数据库的示例程序分析

本程序使用JDBC API访问MySQL数据库，过程如下：

**（1）让JVM或开发工具能够找到驱动程序的jar文件**

本来将MySQL的驱动程序归档文件mysql-connector-java-5.1.38-bin.jar添加到项目的构建路径的Libraries中。这样做是在项目中添加jar包，是使用相对地址的，这样把项目复制到其它电脑也可以用。然而，对开发或运行Java程序来说，这不是必须的。为了使用JDBC驱动程序包，只需将驱动包的jar文件所在路径添加到Java的类路径（CLASSPATH）中，让JVM或开发工具能够找到该jar文件即可。

**（2）加载数据库驱动程序**

Class类是java.lang包中的一个系统类，此处利用它加载数据库驱动程序。程序调用Class类的静态方法forName()加载数据库驱动程序，调用该方法时所使用的字符串是数据库驱动程序名，此处的"com.mysql.jdbc.Driver"就是MySQL驱动程序名。

**（3）建立到数据库的连接**

加载了JDBC驱动程序后，便可以连接数据库了。程序使用调用DriverManager类的静态方法getConnection()建立到数据库的连接。调用getConnection()时使用的字符串是一个url（统一资源定位符），该标识符是要连接的数据库在Internet上的唯一标识符。本例中，把登录数据库的所有信息都编写在url中。其中，问号(？)之前的jdbc:mysql://localhost:3306/testp是数据库原本的url，指明了协议类型、主机地址、端口号和数据库名，而问号(？)之后的则是“名称-值”的对儿，指明用户名、密码、字符编码方式。这些“名称-值”的对儿以et(&)符号隔开。

getConnection()方法返回一个Connection对象，表示一个实际的数据库连接。后续对数据库的一切操作都是在这个连接的基础上进行的。

**（4）利用已有Connection对象创建Statement对象。**

一旦获得了Connection对象，接下来就可以创建Statement对象了。Statement对象是用于在已经建立的连接的基础上向数据库发送SQL语句的对象，它把字符串形式的SQL语句在通过已有Connection对象发送给后台数据库管理系统（此处是MySQL），让后台数据库管理系统去执行该SQL语句。

取得 Connection 对象之后，用该对象的 createStatement() 方法创建 Statement 对象，然后就可以用 Statement 对象执行 SQL 语句操作数据库了

**（5）执行SQL语句。**

可以使用Statement对象的executeUpdate()方法来执行SQL DDL（数据定义语言）语句或数据更新语句，此时executeUpdate()方法返回一个整数值，若该值为-1，则语句没有执行成功；若该值不为-1，则语句执行成功。可以使用Statement对象的executeQuery()方法来执行SELECT查询语句，该语句将返回一个ResultSet对象，查询结果集就包含在该对象中。

**（6）处理查询结果集。**

如果所执行的SQL语句是一个SELECT查询语句，则返回一个查询结果集， ResultSet对象就表示一个查询结果集，它管理查询结果记录。可以使用ResultSet对象的next()、previous()、、first()、last()等方法移动记录集的记录指针定位当前记录，使用ResultSet对象的getXXX()等方法获取当前记录的某个字段的值。

**（7）关闭数据库连接。**

对数据库操作完成后，应该使用对象的close()方法将操作数据库的对象资源关闭。一般关闭Connection对象即可。关闭连接对象后，既释放了资源，又提高了安全性。

**（8）处理数据库访问是的异常。**

使用try…catch…finally语句处理数据库访问时可能产生的异常。

要点1：注册驱动的三种方法

此处的例子均是以程序使用JDBC连接mysql数据库的代码演示的，如果要连接其他数据库，修改为其他数据库对应的数据库url即可。

**（1）使用DriverManager的registerDriver()方法加载驱动程序**

示例代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
import` `java.sql.*;` `public` `class` `MysqlDemo1 {``  ``public` `static` `void` `main(String[] args) ``throws` `Exception {``    ``Connection conn = ``null``;``    ``String url = ``"jdbc:mysql://localhost:3306/testp?"``        ``+ ``"user=root&password=root&useUnicode=true&characterEncoding=UTF8"``;``    ``try` `{``      ``DriverManager.registerDriver(``new` `com.mysql.jdbc.Driver());``      ``System.out.println(``"成功加载MySQL驱动程序"``);``      ``// 一个Connection代表一个数据库连接``      ``conn = DriverManager.getConnection(url);``      ``// Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等``      ``if` `(``null` `!= conn)``        ``System.out.println(``"成功建立数据库连接"``);``    ``} ``catch` `(SQLException e) {``      ``System.out.println(``"MySQL操作错误"``);``      ``e.printStackTrace();``    ``} ``catch` `(Exception e) {``      ``e.printStackTrace();``    ``} ``finally` `{``      ``conn.close();``    ``}``  ``}``}
```

**（2）使用System类的setProperty()方法加载驱动程序**

示例代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
import` `java.sql.Connection;``import` `java.sql.DriverManager;``import` `java.sql.SQLException;`` ` `public` `class` `MysqlDemo2 {``  ``public` `static` `void` `main(String[] args) ``throws` `Exception {``    ``Connection conn = ``null``;``    ``String url = ``"jdbc:mysql://localhost:3306/testp?"``        ``+ ``"user=root&password=root&useUnicode=true&characterEncoding=UTF8"``;``    ``try` `{``      ``System.setProperty(``"jdbc.drivers"``, ``"com.mysql.jdbc.Driver"``);``      ``System.out.println(``"成功加载MySQL驱动程序"``);``      ``// 一个Connection代表一个数据库连接``      ``conn = DriverManager.getConnection(url);``      ``// Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等``      ``if` `(``null` `!= conn)``        ``System.out.println(``"成功建立数据库连接"``);``    ``} ``catch` `(SQLException e) {``      ``System.out.println(``"MySQL操作错误"``);``      ``e.printStackTrace();``    ``} ``catch` `(Exception e) {``      ``e.printStackTrace();``    ``} ``finally` `{``      ``conn.close();``    ``}``  ``}``}
```

**（3）使用Class类的forName()方法加载驱动程序**

示例代码如下：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
import` `java.sql.Connection;``import` `java.sql.DriverManager;``import` `java.sql.SQLException;`` ` `public` `class` `MysqlDemo3 {``  ``public` `static` `void` `main(String[] args) ``throws` `Exception {``    ``Connection conn = ``null``;``    ``String url = ``"jdbc:mysql://localhost:3306/testp?"``        ``+ ``"user=root&password=root&useUnicode=true&characterEncoding=UTF8"``;``    ``try` `{``      ``Class.forName(``"com.mysql.jdbc.Driver"``);``      ``System.out.println(``"成功加载MySQL驱动程序"``);``      ``// 一个Connection代表一个数据库连接``      ``conn = DriverManager.getConnection(url);``      ``// Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等``      ``if` `(``null` `!= conn)``        ``System.out.println(``"成功建立数据库连接"``);``    ``} ``catch` `(SQLException e) {``      ``System.out.println(``"MySQL操作错误"``);``      ``e.printStackTrace();``    ``} ``catch` `(Exception e) {``      ``e.printStackTrace();``    ``} ``finally` `{``      ``conn.close();``    ``}``  ``}``}
```

要点2：Java程序访问数据库的步骤

编写Java程序访问数据库的步骤如下：

Step 1. 注册驱动 （Driver）

Step 2. 建立连接（创建Connection）

Step 3. 创建执行sql语句（通常是创建Statement或者其子类）

Step 4. 执行语句

Step 5. 处理执行结果（在非查询语句中，该步骤是可以省略的）

Step 6. 释放相关资源

补充知识点：Class 类和 Class对象与类的加载

Class 类是 java.lang 包中的一个系统类。 Class类没有公共构造方法。Class 类的实例是在加载类时由 Java 虚拟机以及通过调用类加载器中的 defineClass 方法自动构造的。作为程序的一部分，每个类都有一个 Class 对象。换言之，每当你编写并且编译了一个新类，就会产生一个 Class 对象（更恰当地说，是被保存在一个同名的 .class 文件中）。在运行期，一旦我们想生成这个类的一个对象， 运行这个程序的 JVM 首先检查这个类的 Class 对象是否已经加载。如果尚未加载， JVM 就会根据类名查找 .class 文件，并将其载入。所以， Java 程序并不是一开始执行，就被完全加载的。一旦某个类的 Class 对象被载入内存，它就被用来创建这个类的所有对象。

Class对象就和其他对象一样，我们可以获取并操作它的引用（这是类加载器的工作）。Class 类有一个静态方法 forName()，这个方法可以返回 Class 对象的引用。

例11-1 Class类与Class对象的的例子

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
class` `Candy {`` ``static` `{   System.out.println(``"Loading Candy"``); }``}``class` `Gum {`` ``static` `{  System.out.println(``"Loading Gum"``); }``}``class` `Cookie {`` ``static` `{  System.out.println(``"Loading Cookie"``); }``}``public` `class` `SweetShop1 {`` ``public` `static` `void` `main(String[] args) {``  ``System.out.println(``"It's inside the main:"``);``  ``new` `Candy();   System.out.println(``"After creating Candy"``);``  ``try` `{ ``   ``Class.forName(``"Gum"``); ``// 这和 new Gum(); 效果是相同的。``  ``} ``catch``(ClassNotFoundException e) {``   ``System.out.println(``"Couldn't find Gum"``);``  ``}``  ``System.out.println(``"After Class.forName(\"Gum\")"``);``  ``/* 可以用下面的代码代替上面的代码，看看运行结果就知道了``    ``new Gum(); System.out.println("After Class.forName(\"Gum\")");``   ``*/``  ``new` `Cookie();   System.out.println(``"After creating Cookie"``);`` ``}``}
```

例11-1的运行结果：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/x1.png)

**例11-1的程序分析：**

在这个程序中有一条语句：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
Class.forName(``"Gum"``);
```

这是 Class 类（所有 Class 对象都属于这个类型）的一个 static 成员。 orName() 是取得 Class 对象的引用的一种方法。它是用一个包含目标类的文本名的 String 作输入参数，返回一个的是一个 Class 对象的引用。上面代码忽略了返回值。对 forName() 的调用是为了它产生“副作用”：如果类 Gum 还没有被加载就加载它。在加载过程中， Gum 的 static 语句被执行。执行效果上

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
Class.forName(``"Gum"``);
```

等价于

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
new` `Gum();
```

但本质上二者实际上是不一样的：Class.forName("Gum")是装载类 Gum，并且得到该类的 Class 对象，并没有生成 Gum 类的实例。而 new Gum() 是装载类 Gum，并且由 Class 对象创建一个 Gum 对象实例（以 Gum 的Class 对象为模板创建一个实例），即 new Gum() 不但装载了类 Gum，而且还生成了类 Gum 的一个实例。

看下面这段代码：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
private` `static` `String myDriver = ``"com.microsoft.jdbc.sqlserver.SQLServerDriver"``;``Class.forName(myDriver);
```

实际上等价于

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
new` `com.microsoft.jdbc.sqlserver.SQLServerDriver();
```

由于实际创建 SQLServerDriver 类的实例是没有必要的（而且也是浪费的），只要加载它的 Class 对象就足够了，所以在加载数据库驱动程序的时候一般用 Class.forName()。

想一想：

考虑一下这个问题，给你一个字符串变量，它代表一个类的包名和类名，你怎么实例化它？

可以用这样的方法：

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
A a = (A)Class.forName(``"pacage.A"``).newInstance(); 
```

这和

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.3.html?node=858292645&detailRecordId=1318913843&studyrecordId=1225624963&sectionRecordId=1229924154#)

```
A a = ``new` `A()； 
```

是一样的效果。



## **11.4 动手项目**

### 动手项目11-1：使用JDK开发连接MySQL数据库的Java程序

**所需时间：**30分钟。

**项目目标：**使用JDK开发连接MySQL数据库的Java程序；知道如何使用第三方jar文件。

**过程描述：**设置jar文件路径并使用JDK开发数据库程序。

（1）准备所使用的jar文件。在目录D:\JavaPrograms下创建子目录MyLibs，把文件mysql-connector-java-5.1.38-bin.jar放置到目录D:\JavaPrograms\MyLibs下面。

（2）创建MySQL数据库。登录到MySQL服务器，创建数据库mytestdb。

（3）编辑源程序。使用文本编辑器编辑如下程序，将文件命名为MyDBProg1.java，保存到目录D:\JavaPrograms下。

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java11.4.html?node=858292646&detailRecordId=1318913844&studyrecordId=1225624963&sectionRecordId=1229924152#)

```
import` `java.sql.*;` `public` `class` `MyDBProg1 {``  ``public` `static` `void` `main(String[] args) ``throws` `Exception {``    ``Connection conn = ``null``;``    ``String sql;` `    ``try` `{``      ``Class.forName(``"com.mysql.jdbc.Driver"``);``// 动态加载mysql驱动``      ``System.out.println(``"成功加载MySQL驱动程序"``);``      ``conn = DriverManager.getConnection(``"jdbc:mysql://localhost:3306/mytestdb?useUnicode=true&characterEncoding=GBK"``, ``"root"``, ``"root"``);``      ``Statement stmt = conn.createStatement();``      ``sql = ``"drop table if exists student"``;``      ``stmt.executeUpdate(sql);``      ``sql = ``"create table student(NO char(20),name varchar(20),primary key(NO)) charset gbk COLLATE gbk_chinese_ci"``;``      ``int` `result = stmt.executeUpdate(sql);``// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功``      ``if` `(result != -``1``) {``        ``System.out.println(``"创建数据表成功"``);``        ``sql = ``"insert into student(NO,name) values('2012001','陶伟基')"``;``        ``result = stmt.executeUpdate(sql);``        ``sql = ``"insert into student(NO,name) values('2012002','周小俊')"``;``        ``result = stmt.executeUpdate(sql);``        ``sql = ``"select * from student"``;``        ``ResultSet rs = stmt.executeQuery(sql);``// executeQuery会返回结果的集合，否则返回空值``        ``System.out.println(``"学号\t姓名"``);``        ``while` `(rs.next()) {``          ``System.out``              ``.println(rs.getString(``1``) + ``"\t"` `+ rs.getString(``2``));``// 入如果返回的是int类型可以用getInt()``        ``}``      ``}``    ``} ``catch` `(SQLException e) {``      ``System.out.println(``"MySQL操作错误"``);``      ``e.printStackTrace();``    ``} ``catch` `(Exception e) {``      ``e.printStackTrace();``    ``} ``finally` `{``      ``conn.close();``    ``}`` ` `  ``}`` ` `}
```

（4）编译源程序。打开Windows的命令提示符窗口，进入目录D:\JavaPrograms，编译程序MyDBProg1.java

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/x2.png)

（5）运行程序。使用JDK提供的Java解释器直接运行程序MyDBProg1，观察运行结果，想想为什么会有这样的结果？

（6）设置类路径。将D:\JavaPrograms\MyLibs\mysql-connector-java-5.1.38-bin.jar添加到环境变量CLASSPATH中。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/x3.png)

（7）重新运行程序，观察运行结果。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/x4.png)



### 动手项目11-2：使用Eclipse开发连接MySQL数据库的Java程序

**所需时间：**30分钟。

**项目目标：**使用Eclipse开发连接MySQL数据库的Java程序；知道如何将第三方jar文件导入到项目中。

**过程描述：**导入第三方jar文件导入到项目中，编辑和运行访问MySQL数据库的程序。

（1）启动Eclipse。

（2）创建项目PrjDB。

（3）将mysql-connector-java-5.1.38-bin.jar导入到当前项目PrjDB。可参考本章“11.2.2 Java程序访问MySQL数据库程序实例”的活动2。

（4）在项目PrjDB中创建类MyDBProg1，代码同动手项目11-1中的代码。

（5）运行程序，观察结果。

## **11.5 小结**

### 主体内容

开发数据库应用程序的Java API称为JDBC，它支持访问关系数据库的Java程序。

JDBC由一组用Java编程语言编写的类和接口组成，使程序员能够用纯Java API来编写数据库应用程序。

JDBC API和JDBC驱动程序协同实现Java程序对数据库的访问功能。其中，JDBC API是一个Java接口和类的集合，用于编写访问和操纵关系数据库的Java程序；而JDBC驱动程序起着接口实现的作用。JDBC驱动与具体数据相关，所以通常有数据库厂商提供。访问MySQL数据库需使用MySQL JDBC驱动程序，访问Oracle数据库需要使用Oracle JDBC驱动程序，而访问SQL Server数据库需要使用问SQL Server JDBC驱动程序。应用程序调用JDBC提供的API，其实是由数据库厂商提供的JDBC驱动程序来负责实现的。如果要更换数据库，只要更换驱动程序，并在JDBC中载入新的驱动程序来源，即可完成数据库系统的变更。

JDBC中，定义了许多接口和类，经常使用的有：

（1）java.sql.DriverManager 驱动程序管理类：

DriverManage 类是java.sql包中用于管理数据库驱动程序的类。它处理驱动程序的加载和建立数据库连接。DriverManage类的静态方法 getConnection() 用于建立数据库连接。该方法返回一个Connection对象。

（2）java.sql.Connection类：

Connection类是java.sql包中用于处理特定数据库连接的类。Connection对象表示一个实际的数据库连接，在操作数据库之前应该首先建立数据库连接，取得Connection对象。

（3）Statement类：

Statement类是java.sql包中用于在指定的连接中处理SQL语句的类。取得Connection 对象之后，用该对象的 createStatement()方法创建Statement对象，然后就可以用Statement 对象执行SQL语句操作数据库了。

（4）ResultSet类：

ResultSet类是java.sql包中用于管理查询结果集的类。Statement对象执行SQL语句时，如果该SQL语句是一个查询语句，将返回一个查询结果集，ResultSet对象就表示一个查询结果集，它管理查询结果记录。

MySQL是一个关系型数据库管理系统，由瑞典MySQL AB公司开发，目前属于 Oracle 旗下公司。

MySQL是一个开源的关系数据库系统，它的许多应用也是免费的。

使用Eclipse开发访问MySQL数据库的Java程序的过程是：

（1）下载数据库厂商提供的驱动程序包。

（2）将驱动程序包引入项目中。

（3）编写代码，通过纯Java驱动方式与数据库建立连接。

编写Java程序访问数据库的步骤如下：

Step1. 注册驱动 （Driver）

Step2. 建立连接（创建Connection）

Step3. 创建执行sql语句（通常是创建Statement或者其子类）

Step4. 执行语句

Step5. 处理执行结果（在非查询语句中，该步骤是可以省略的）

Step6. 释放相关资源

## **11.6 思考题**

### 主体内容

**1.JDBC的基本组成和实现原理是怎样的？**【隐藏】

**答：**JDBC的基本组成和实现原理如下图所示：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/c1.png)

**图11.4 JDBC实现原理**

（1）JDBC驱动管理器：java.sql.DriverManager，负责注册JDBC驱动器，并为创建数据库连接提供支持。由SUN公司实现。

（2）JDBC驱动器API：java.sql.Driver，由SUN公司实现。

（3）JDBC驱动器：有数据库供应商或者第三方工具提供商创建，也称为JDBC驱动程序。JDBC驱动程序负责与特定的数据库连接，并处理通信细节。

**2.常见的Java 数据库编程 API有哪些？它们的主要功能分别是什么？**【隐藏】

**答：**DriverManage 类是 java.sql 包中用于管理数据库驱动程序的类。它处理驱动程序的加载和建立数据库连接。DriverManage 类的静态方法 getConnection() 用于建立数据库连接。该方法返回一个 Connection 对象。

Connection 类是 java.sql 包中用于处理特定数据库连接的类。Connection 对象表示一个实际的数据库连接，在操作数据库之前应该首先建立数据库连接，取得 Connection 对象。

Statement 类是 java.sql 包中用于在指定的连接中处理 SQL 语句的类。取得 Connection 对象之后，用该对象的 createStatement() 方法创建 Statement 对象，然后就可以用 Statement 对象执行 SQL 语句操作数据库了。

ResultSet 类是 java.sql 包中用于管理查询结果集的类。Statement 对象执行 SQL 语句时，如果该 SQL 语句是一个查询语句，将返回一个查询结果集， ResultSet 对象就表示一个查询结果集，它管理查询结果记录。

**3.编写Java程序访问数据库的步骤如何？**【隐藏】

**答：**编写Java程序访问数据库的步骤如下：

Step1. 注册驱动 （Driver）

Step2. 建立连接（创建Connection）

Step3. 创建执行sql语句（通常是创建Statement或者其子类）

Step4. 执行语句

Step5. 处理执行结果（在非查询语句中，该步骤是可以省略的）

Step6. 释放相关资源

## **11.7 自测练习**

## 【课后练习】

1. Java中，JDBC是指（）。 

   （A）Java程序与数据库连接的一种机制   （B）Java程序与浏览器交互的一种机制   （C）Java类路径  （D）Java类编译程序

   2. 下面陈述错误正确的是（）。

       （A）Statement的executeQuery()方法会返回一个结果集   （BStatement的executeUpdate()方法会返回是否更新成功的boolean值   （C）使用ResultSet中的getString()可以获得一个对应于数据库中char类型的值  （D）ResultSet中的next()方法会使结果集中的下一行成为当前行

      3. JDBC中要显式地关闭连接的命令是（）。 （A）Connection.close()   （B）RecordSet.close()   （C）Connection.stop()  （D）Connection.release()
      4. 如果数据库中某个字段为numberic类型，可以通过结果集中的（）方法获取。 （A）getNumberic()   （B）setNumberic()   （C）getDouble ()  （D）setDouble ()
         5. 下列关于Class.forName()的陈述错误的是（）。 （A）Class.forName()的作用是要求JVM查找并加载指定的驱动器类   （B）Class.forName()会查找并加载指定的类，并创建驱动器实例   （C）Class.forName()会创建驱动器类实例，并注册在Driver.Manager上  （D）Class.forName()找不到驱动器类时，会抛出DriverClassNotFoundException





# 第12章 课程实验

## **12.1 面向对象编程实验**

### 面向对象编程实验

一、实验目的

（1）掌握JDK的安装和环境变量的设置。

（2）掌握Eclipse的安装和配置。

（3）掌握 Java 面向对象编程的基本思想和基本方法。

二、实验要求

按照“实验内容和步骤”的要求在自己的计算机上完成本实验。

三、实验设备、环境

（1）硬件：PC机。

（2）操作系统：Windows操作系统。

（3）软件系统：JDK安装文件jdk-8u73-windows-x64.exe、Eclipse压缩包eclipse-java-mars-2-win32-x86_64.zip。

**说明：**所需软件可以到网上课程资源中下载。

四、实验内容和步骤

（1）安装和配置JDK

双击JDK 安装文件jdk-8u73-windows-x64.exe开始安装，安装中可以选择JDK的安装目标路径以及选择 JRE 的目标安装路径。配置环境变量path、JAVA_HOME和CLASSPATH的时候做出相应的设置即可。

（2）解压缩Eclipse，为eclipse.exe程序创建桌面快捷方式。以后可以使用此卓明快捷方式启动Eclipse。

（3）建立工作目录

建立磁盘目录“D:\MyJavaPrograms”，用来存放实验的源程序文件、编译后的字节码文件以及其它相关文件。

（4）启动Eclipse，设置Eclipse的“工作空间”的路径为工作目录，即“D:\MyJavaPrograms”。

（5）在Eclipse中新建一个Java项目，项目名称为“PrjOOP”。

（6）设书籍有书名、作者、出版商、价格属性。在项目PrjOOP中，编写一个书籍类 Book，有 title、author、publisher、price属性，分别表示书籍的书名、作者、出版商、价格，有setTitle()、setAuthor()、setPublisher()、setPrice()方法，分别用来设置itle、author、publisher、price的值，有getTitle()、getAuthor()、getPublisher()、getPrice()方法，分别用来取得title、author、publisher、price的值，还有一个 printBookMessage() 方法用来显示书籍信息。

（7）在项目PrjOOP中，编写一个Java Application程序，程序读取用户输入的书籍信息，把用户输入的数据放到一个Book类的对象中，然后在该对象上调用printBookMessage()方法打印书籍信息。

（8）运行程序，验证程序功能。

五、注意事项

（1）给 Book 类的成员变量的数据类型定义要合理。

（2）Book 类的成员方法的参数和返回值类型要正确。

六、思考题

（1）如果要使用数组存储多本书籍信息，用户输入的每个书籍信息都存储到数组中，同时让程序具有添加、修改、删除、打印书籍信息的功能应该怎么编写程序？

（2）如果要使用一个文件存储多本书籍信息，用户输入的每个书籍信息都存储到文件中，同时让程序具有添加、修改、删除、打印书籍信息的功能应该怎么编写程序？

七、提示与参考

（1）可以使用 java.util.Scanner 对象读取数据。

（2）

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java12.1.html?node=858292654&dt=5785&sectionRecordId=1229924150#)

```
public` `void` `setTitle(String title) {``  ``this``.title = title;``}``public` `String getTitle() {``  ``return` `title;``}
```



## **12.2 图形用户界面编程实验**

### 图形用户界面编程实验

一、实验目的

（1）掌握创建图形用户界面的方法。

（2）掌握事件处理的基本方法。

二、实验要求

按照“实验内容和步骤”的要求在自己的计算机上完成本实验。

三、实验设备、环境

（1）硬件：PC机。

（2）操作系统：Windows操作系统。

（3）软件系统：JDK安装文件jdk-8u73-windows-x64.exe、Eclipse压缩包eclipse-java-mars-2-win32-x86_64.zip。

**说明：**所需软件可以到网上课程资源中下载。

四、实验内容和步骤

（1）在Eclipse中新建项目PrjGUI。

（2）在项目PrjGUI中，编写一个具有下面功能的程序：

i. 程序主窗口如下

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j1.png)

ii. 用户选“退出”菜单项，或者点击窗口标题栏右上角的关闭按钮，则关闭窗口，退出程序。

iii. 用户选择“显示图书”菜单项，则出现下面的显示界面

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j2.png)

iv. 用户选择“添加图书”菜单项，则弹出如下对话框

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j3.png)

用户输入信息，点击“确定”按钮，则用户的输入在主窗口中显示出来，如下所示：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j4.png)

点击“确定”之后，主窗口显示：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j5.png)

如果点击取消按钮，则主窗口显示“空白”，如下图所示：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j6.png)

五、注意事项

（1）对话框为模式对话框。

（2）当在对话框中输入书籍信息的时候，如何让窗口对象获取用户在对话框中的数据需要仔细设计。

六、思考题

把对话框设计为窗口对象的内部类怎么做？这样做可以使编程更加方便吗？

七、提示与参考

（1）

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java12.2.html?node=858292654&detailRecordId=1318913849&studyrecordId=1225624963&sectionRecordId=1229924149#)

```
class` `MyJFrame ``extends` `JFrame ``implements` `ActionListener {` `  ``JTextArea text = ``new` `JTextArea(); ``// 用于在窗口中显示内容的文本区``  ` `  ``/* 声明面板 conPane。在构造方法中取得内容面板，赋给 conPane。``   ``* 在构造方法之外声明这个变量是为了让 conPane 成为 MyJFrame 的成员变量。``   ``* 以后就可以直接引用这个成员变量。``   ``*/``  ``Container conPane = ``null``;``  ` `  ``// 构造方法``  ``public` `MyJFrame(String name, ``int` `w, ``int` `h) {``     ``...``  ``}``  ` `  ``// 实现 ActionListener 中的方法``  ``public` `void` `actionPerformed(ActionEvent e) {``    ``...``  ``}``  ` `  ``public` `void` `updateText(String s) {``    ``text.setText(s);``  ``}``}
```

（2）

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java12.2.html?node=858292654&detailRecordId=1318913849&studyrecordId=1225624963&sectionRecordId=1229924149#)

```
class` `MyDialog ``extends` `JDialog ``implements` `ActionListener {``  ``JLabel idLabel;``  ``JLabel titleLabel;``  ``JLabel authorLabel;``  ``JLabel publisherLabel;``  ``JLabel priceLabel;``  ``JTextField idField;``  ``JTextField titleField;``  ``JTextField authorField;``  ``JTextField publisherField;``  ``JTextField priceField;``  ``JButton doneButton;``  ``JButton cancelButton;``  ` `  ``// 构造方法``  ``MyDialog (JFrame fra, String s) {``    ``super``(fra, s, ``true``);``    ``setSize(``300``, ``200``);``    ``setLocation(``200``,``200``);``    ``Container con = getContentPane();``    ``con.setLayout(``new` `BorderLayout());``    ``// con.setSize(300, 200);``    ` `    ``idLabel = ``new` `JLabel(``"序号："``, SwingConstants.RIGHT);``    ``titleLabel = ``new` `JLabel(``"书名："``, SwingConstants.RIGHT);``    ``authorLabel = ``new` `JLabel(``"作者："``, SwingConstants.RIGHT);``    ``publisherLabel = ``new` `JLabel(``"出版商："``, SwingConstants.RIGHT);``    ``priceLabel = ``new` `JLabel(``"价格："``, SwingConstants.RIGHT);``    ``idField = ``new` `JTextField();``    ``titleField = ``new` `JTextField();``    ``authorField = ``new` `JTextField();``    ``publisherField = ``new` `JTextField();``    ``priceField = ``new` `JTextField();``    ``idField.setEditable(``false``);``    ``doneButton = ``new` `JButton(``"确定"``);``    ``cancelButton = ``new` `JButton(``"取消"``);``    ` `    ``doneButton.addActionListener(``this``);``    ``cancelButton.addActionListener(``this``);``    ` `    ``JPanel northPanel = ``new` `JPanel();``    ``northPanel.setLayout(``new` `GridLayout(``5``, ``2``));``    ``northPanel.add(idLabel);``    ``northPanel.add(idField);``    ``northPanel.add(titleLabel);``    ``northPanel.add(titleField);``    ``northPanel.add(authorLabel);``    ``northPanel.add(authorField);``    ``northPanel.add(publisherLabel);``    ``northPanel.add(publisherField);``    ``northPanel.add(priceLabel);``    ``northPanel.add(priceField);``    ``con.add(northPanel, BorderLayout.NORTH);``    ` `    ``JPanel southPanel = ``new` `JPanel();``    ``southPanel.setLayout(``new` `GridLayout(``1``, ``2``));``    ``southPanel.add(doneButton);``    ``southPanel.add(cancelButton);``    ``con.add(southPanel, BorderLayout.SOUTH);``    ` `    ``con.setVisible(``true``);``    ``//pack(); // size the JFrame to fit its contents``  ``}``  ` `  ``// 实现 ActionListener 中的方法``  ``public` `void` `actionPerformed(ActionEvent e) {``    ``StringBuffer sb = ``new` `StringBuffer();``    ` `    ``if` `(e.getSource() == doneButton) {``      ` `      ``sb = sb.append(titleField.getText() + ``"\t"` `+ authorField.getText() + ``"\t"` `+ ``          ``publisherField.getText() + ``"\t"` `+ priceField.getText() +``"\n"``);``      ``/* 用this.getOwner() 获取当前对话框的拥有者。``       ``* (MyJFrame)(this.getOwner()) 是把取得的父窗口对象做“向下定型”为 MyJFrame 类型，``       ``* 这样才能调用 MyJFrame 类中我们自己定义的属性和方法。``       ``* 之后调用 updateText() 方法更新 JFrame 窗口内容面板中的 JTextArea 对象就可以了。``       ``*/``      ``((MyJFrame)(``this``.getOwner())).updateText(sb.toString());``      ``setVisible(``false``);``      ``dispose();``    ``} ``else` `if` `(e.getSource() == cancelButton) {``      ``((MyJFrame)(``this``.getOwner())).updateText(sb.toString());``      ``setVisible(``false``);``      ``dispose();``    ``}``  ``}  ``}
```

## **12.3 数据库编程实验**

## 主体内容

点击折叠

一、实验目的

（1）掌握MySQL数据库的安装和配置。

（2）熟悉MySQL数据的基本使用方法。

（3）掌握使用JDBC访问MySQL数据库的编程过程。

（4）掌握常见JDBC API的用法。

二、实验要求

按照“实验内容和步骤”的要求在自己的计算机上完成本实验。

三、实验设备、环境

（1）硬件：PC机。

（2）操作系统：Windows操作系统。

（3）软件系统：JDK安装文件jdk-8u73-windows-x64.exe、Eclipse压缩包eclipse-java-mars-2-win32-x86_64.zip、MySQL文件压缩包mysql-5.7.11-winx64.zip、MySQL的JDBC驱动程序包mysql-connector-java-5.1.38-bin.jar。

**说明：**所需软件可以到网上课程资源中下载。

四、实验内容和步骤

（1）安装并配置MySQL服务器。

（2）在MySQL服务器上创建一个数据库books，创建数据库时选择字符集为gbk -- GBK Simplified Chinese。

（3）在数据库books中创建数据库表，如下：

/*

Navicat MySQL Data Transfer



Source Server : localconnect

Source Server Version : 50711

Source Host : localhost:3306

Source Database : books



Target Server Type : MYSQL

Target Server Version : 50711

File Encoding : 65001



Date: 2016-07-23 15:28:27

*/



SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------

-- Table structure for `book`

-- ----------------------------

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (

`ID` int(10) NOT NULL AUTO_INCREMENT,

`title` varchar(100) DEFAULT NULL,

`author` varchar(50) DEFAULT NULL,

`publisher` varchar(100) DEFAULT NULL,

`price` float(10,0) DEFAULT NULL,

PRIMARY KEY (`ID`)

) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=gbk;



-- ----------------------------

-- Records of book

-- ----------------------------

（4）在Eclipse中新建项目PrjDB。

（5）在项目PrjDB中，导入MySQL的JDBC驱动程序包mysql-connector-java-5.1.38-bin.jar。

（6）按照下面要求编写一个具有图形用户界面并且能够访问数据库books的程序：

i. 程序主窗口如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j7.png)

ii. 用户选“退出”菜单项，或者点击窗口标题栏右上角的关闭按钮，则关闭窗口，退出程序。

iii. 用户选择“显示图书”菜单项，则读取books的book表的所有书籍在主窗口中显示，出现下面的显示界面：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j8.png)

iv. 用户选择“添加图书”菜单项，则弹出如下对话框：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j9.png)

用户输入信息，点击“确定”按钮，则把用户的输入的书籍信息写到数据库books的book表中，之后重新在主窗口中显示现有的所有书籍。

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j10.png)

点击“确定”之后，主窗口显示：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j11.png)

如果点击取消按钮，则从数据库中读取所有书籍信息在主窗口显示，如下：

![img](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/images/j12.png)

五、注意事项

（1）数据显示时要每行显示一条记录。

六、思考题

（1）数据库使用 MySQL，使用 JDBC 驱动程序访问数据库，该怎么写程序呢？

七、提示与参考

（1）数据库连接参考代码

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java12.3.html?node=858292655&detailRecordId=1318913850&studyrecordId=1225624963&sectionRecordId=1229924139#)

```
Class.forName(``"com.mysql.jdbc.Driver"``);``// 动态加载mysql驱动``conn = DriverManager.getConnection(``    ``"jdbc:mysql://localhost:3306/books?useUnicode=true&characterEncoding=GBK"``, ``    ``"root"``, ``"root"``);
```

（2）添加图书

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java12.3.html?node=858292655&detailRecordId=1318913850&studyrecordId=1225624963&sectionRecordId=1229924139#)

```
public` `void` `addBooks() {<``  ``String sql = ``"insert into book(title, author, publisher, price) "` `+``      ``"values('"` `+ ``this``.title + ``"', '"` `+ ``this``.author + ``"', '"` `+``          ``this``.publisher + ``"', "` `+ ``this``.price + ``")"``;``  ``try` `{``    ``conn = DBConnection.getConnection();``    ``stmt = conn.createStatement();``    ``stmt.executeUpdate(sql);``    ``//stmt.close();``    ``//conn.close();``    ` `    ``return``;``  ``}``  ``catch``(SQLException e) {``    ``System.out.println(e.getMessage());``  ``}``}
```

（3）查询图书

[?](http://jx2.buptnu.com.cn/hello/resource/course/d3de68c9-0ff8-4c73-90bc-d5b59d0f9a93/java12.3.html?node=858292655&detailRecordId=1318913850&studyrecordId=1225624963&sectionRecordId=1229924139#)

```
public` `void` `fetchBooks() {``  ``String sql = ``"select * from book"``;``  ` `  ``try` `{``    ``conn = DBConnection.getConnection();``    ``stmt = conn.createStatement();``    ``this``.result = stmt.executeQuery(sql);``    ``//stmt.close();``    ``//conn.close();``  ``}``  ``catch``(SQLException e) {``    ``System.out.println(e.getMessage());``  ``}``  ``finally` `{``  ``}``}
```

