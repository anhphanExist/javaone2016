# javaone2016
[Code Generation with JavaCompiler for Fun, Speed, and Business Profit](http://www.slideshare.net/JuanCruzNores/javaone-2016-code-generation-with-javacompiler-for-fun-speed-and-business-profit)
# Building
First checkout [medallia/unsafe](https://github.com/medallia/unsafe)
~~~
cd unsafe
mvn -DskipTests install
~~~
This will build the basic dependency and install for the java parts to compile. If you want to try the C++ code generation, follow instructions on [medallia/unsafe](https://github.com/medallia/unsafe) on how to build the native library .

Once this is done, go to this repo 
~~~
cd ../javaone2016
mvn package
~~~
