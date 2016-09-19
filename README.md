## ThinR gradle plugin
* Other languages: [简体中文] (README.zh-cn.md) .



### ThinR plugin introduce
***
ThinR plug-in at compile time will remove all R.class except R$styleable.class off, and in the reference to replace the corresponding constant, so as to reduce the size of the package and reduce the effect of DEX number.

### ThinR plugin principle
R in the Android file, in addition to the styleable type, all fields are int type variables / constants, and in the running will not change. So you can compile time, record all the field name and the corresponding value of R, and then use the ASM tool to traverse all the class, the R field will be replaced by the reference to the corresponding constant.


### HOW TO USE
***
Outermost build.gradle add the following dependency:

 	classpath   'com.mogujie.gradle:ThinRPlugin:0.0.1'
 
Add the following code in the inner gradle file:

	 apply plugin: 'thinR'
	 
	 thinR {
	     // In order not to affect the daily development of compilation speed, debug version can not delete R
	   skipThinRDebug = true
	 }
    
### Licence
***
ThinRPlugin is licensed under the MIT license




In case of using the issue to the wangzhi@meili-inc.com please!