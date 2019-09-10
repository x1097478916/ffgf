
class Student{
private String name;
private int age;
public Student(){

}
public Student(String stuName,int stuAge){
this.name=stuName;
this.age=stuAge;
}
public String getName(){
return name;
}
public void setName(String stuName){
name=stuName;
}
public int getAge(){
return age;
}
public void setAge(int stuAge){
if(stuAge<0){
System.out.println("年龄不合法......");
} 
else{
age=stuAge;
}
}
public void introduce(){
System.out.println("大家好，我叫"+name+"，我今年"+age+"岁！");
}

}
public class Example01{
public static void main(String[] args){
Student stu1=new Student();
Student stu2=new Student("夏鑫鑫",21);
stu1.setAge(10);
stu1.setName("夏鑫鑫");
stu1.introduce();
stu2.introduce();
}
}