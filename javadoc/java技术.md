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

# 第3章