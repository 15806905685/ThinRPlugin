## ThinR gradle plugin
*其他语言版本: [English](README.md).*



### ThinR插件介绍
***
ThinR插件在编译时将除R$styleable.class以外的所有R.class删除掉，并且在引用的地方替换成对应的常量，从而达到缩减包大小和减少dex个数的效果。

### ThinR插件原理
android中的R文件，除了styleable类型外，所有字段都是int型变量/常量，且在运行期间都不会改变。所以可以在编译时，记录R中所有字段名称及对应值，然后利用asm工具遍历所有class，将引用R字段的地方替换成对应常量。


### 使用方法
***
在最外层的build.gradle中加入如下依赖：

 	classpath   'com.mogujie.gradle:ThinRPlugin:0.0.1'
 
在内层的gradle文件中加入如下代码：

 	apply plugin: 'thinR'
 
 	thinR {
     //为了不影响日常开发的编译速度，debug版本可以不用删除R
   	 skipThinRDebug = true
 	 }
    
### Licence
***
ThinRPlugin is licensed under the MIT license




如遇使用问题，请@往之  wangzhi@meili-inc.com


