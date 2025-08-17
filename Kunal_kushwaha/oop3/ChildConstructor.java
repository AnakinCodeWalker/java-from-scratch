package oop3;
// so this is a child class which is inheriting the properties of base class
// it is going to  have a constructor so instead of making the properties again
// we can just access the properties of base class in it.
 class ChildConstructor  extends BaseClass {
     int weight ;
ChildConstructor(){
    this.weight = -1 ;
}
ChildConstructor(int length , int width , int height , int weight){
    super(length ,width , height);// internally its just calling the parent class constructor
    this.weight = weight ;
}
//public void value(){ // do it later on
//    System.out.println(this.width);
//}
}
