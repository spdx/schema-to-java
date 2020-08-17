# schema-to-java
Generates Java classes from the SPDX Schema. Here we use the tool, JiBX to perform conversion.


# Requirements
Either the Sun/Oracle JDK/JRE Variant or OpenJDK. 
I used OpenJDK 11.0.7.


# Installation
1. Clone or download the repository.
2. Store the xsd file in ```src/main/config``` directory.


# To generate modal classes from XSD
1. Open the terminal and go to the repository.
2. Run the project by command <I>**```$ mvn jibx:schema-codegen```**</I>


# Applying Global Customization
1. Created GlobalCustomization.xml file in ```src/main/custom``` directory. Add the required custom attributes in schema element.
2. Configure the custom file in pom.xml as shown below :
```
	<configuration>
         --------------

                    ------------
                    <customizations>
                                <customization>src/main/custom/GlobalCustomization.xml</customization>
                    </customizations>
                    ------------
         --------------
   </configuration>      
```
3. Run the project by command <I>**```$ mvn jibx:schema-codegen```**</I>



# Applying Specific Customization

To apply specific decorations over generated classes we need to create a decor java class and write codes to perform changes.(For reference the decor file named SPDXClassDecorator.java is stored in ```src/main/main/Decorator/org/spdx/jibx``` directory of schema-to-java.

1. Create a new side-project to have a separated pom.xml. We use this project to create jar file and use it as a dependency in our main project.
We used specific groupId, artifactId and version in our new pom.xml. As shown below:
```
<groupId>org.spdx.jibx</groupId>
  <artifactId>spdxclassdecorator</artifactId>
  <version>1.0-SNAPSHOT</version>
<packaging>jar</packaging>main
```


2. Create a new java class that extends NameMatchDecoratorBase implements ClassDecorator from ```https://github.com/jibx/core/blob/master/build/src/org/jibx/schema/codegen/extend/NameMatchDecoratorBase.java``` and ```https://github.com/jibx/core/blob/master/build/src/org/jibx/schema/codegen/extend/ClassDecorator.java``` respectively.

3. Implement your customization codes in the same class of side project.

4. Compile it, create its ```.jar``` and run <I>**```$ mvn install```**</I>.

5. Add the newly created plugin in main-project as dependency. As shown below :
```
<plugin>
  ---------
         <dependencies>
                  <dependency>
                         <groupId>org.spdx.jibx</groupId>
                         <artifactId>spdxclassdecorator</artifactId>       
                         <version>1.0-SNAPSHOT</versio
                         <scope>compile</scope>
                         <type>jar</type>
                  </dependency>
         </dependencies>
  ---------
</plugin>
```
6. Configure the SPDXClassDecorator along with its package in GlobalCustomization.xml in class-decorator element.  

7. Run the main-project by command: <I>**```$ mvn jibx:schema-codegen```**</I>



**<h3>A. Extend the generated classes by a superclass </h3>**
Here we only extend java classes by a superclass. During java class generation, we also got some enums generated. Enums don't extend baseclass.
The classes are to be extended by ```ModelObject.java``` provided the generated classes already don't extend any baseclass.

1. We implement start() of SPDXClassDecorator.java to extend classes which do not have pre determined baseclass in schema. This method also checks for enum. If class is enum it do not extend

2. Create a java class named ModelObject.java in main-project in ```src/main/source-code/org/spdx/library/model``` directory. This is our superclass.

3. Add an attribute "base-class" in GlobalCustomization.xml to determine baseclass.

4. Compile the SPDXClassDecorator.java and run <I>**```$ mvn install```**</I>. 

5. Switch to main-project and run(schema-to-java) by <I>**```$ mvn jibx:schema-codegen```**</I>



 **<h3>B. Addition of constructors </h3>**
 Here, we add two parameterized constructors to all the non-enum classes. 
 To do this:
 
 1. Add the lines of code to the start() of SPDXClassDecorator to add constructor. For referrence view the code in ```side-project/Decorator/ogr/spdx/jibx```. 
 
 2. The ```ModelObject.java``` class in ```src/main/source-code/org/spdx/library/model``` is to be modified. The new ModelObject.java class will be completely taken from ```https://github.com/spdx/Spdx-Java-Library/blob/master/src/main/java/org/spdx/library/model/ModelObject.java```
  
 3. Creat a class ```ClassHolderHelper``` to access methods of AST. This will help in calling and reusing the AST methods to complete our above task.  For referrence view the code in ```side-project/ClassHolderHelper```.
  
 4. Compile the SPDXClassDecorator.java and run by <I>**```$ mvn install```**</I>.
 
 5. Switch to main-project and run(schema-to-java) by <I>**```$ mvn jibx:schema-codegen```**</I>
 
 
 
 **<h3>C. Addition of getType() method</h3>**
 The getType() method is to be added to all the non-enum classes.
 To do this:
 
 1. Add more codes to SPDXClassDecorator to add method. Here again we call many methods using ClassHolderHelper. We add return type of method, access modifiers, block and return statement to the method getType(). This piece of code is also written in start().
  
 2. Compile the SPDXClassDecorator.java and run by <I>**```$ mvn install```**</I>.
 
 3. Switch to main-project and run(schema-to-java) by <I>**```$ mvn jibx:schema-codegen```**</I>

 







