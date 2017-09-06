
安卓productFlavors多渠道多版本管理
http://www.jianshu.com/p/4677efee7214

http://www.cnblogs.com/qianxudetianxia/p/4948499.html

默认的main 文件夹里存在的文件 在其他 适配目录中不允许出现相同文件名的文件，如果差异化特别大可以将文件抽取出来单独放到各个差异包下， main文件下不创建差异文件

productFlavor

gradlew assembleDebug 
gradlew assembleRelease

gradlew assembleuatRelease 打包指定 Build Variant

gradle build
 
 

BuildTypes：构建类型，AndroidStudio的Gradle组件默认提供给了“debug”“release”两个默认配置，此处用于配置是否需要混淆、是否可调试等 
Flavors：产品渠道，默认不提供任何默认配置，在实际发布中，根据不同渠道，我们可能需要用不同的包名，服务器地址等 
BuildVariants：每个buildtype和flavor组成一个buildvariant

