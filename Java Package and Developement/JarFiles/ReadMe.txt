To execute jar file directly from command prompt.

Jar file must contains Manifest.mf file in which entry point(Class name that contains main method) of program must be written.

Try to execute Hello.jar and Hello1.jar from command prompt by using:
------------------------------------------------------------------------------
D:\JavaDev_Package\JavaPackageandDevelopement\DependencyofClasses\ItIndustry>java -jar Hello.jar
This output is generated from m1():method in AStudent class.
m2():method:from Hello class.
main():method

-----------------------------------------------------------------------------
D:\JavaDev_Package\JavaPackageandDevelopement\DependencyofClasses\ItIndustry>java -jar Hello1.jar
no main manifest attribute, in Hello1.jar