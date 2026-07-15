
import java.util.ArrayList;

public class ShoppingCart{
    //BAD: array with fixed size
    private Product[] items = new Product[10];
    //GOOD: arraylist with dynamic size
    private List<Product> items = new ArrayList<>();
    public void addProduct(Product product){
        items.add(product);//always works, no size limit
    }
}

//2.adding elements
//variablename.add( " element");//at specific position

//variablename.add(index, " element");//at specific position
students.add("allce");
students.add(1, "Eve");

//3.accesing collectionname.get(index)
String first = students.get(o);

//4.removing elements collectionname.remove(index);--bye index
//collectinname.remove("obj")-- by obj
students.remove(1); 
//remove all elements matching a condition
students.removeIf(name -> name.startsWith("F"));

//5.checking contents--for checking elements are present or not
boolean hasAlice = students.contains("alice");//true
int index = students.indexOf("Charlie"); //1  

//6.size and capacity---length of list
int size = students.size();
boolean empty = students.isEmpty();

//7.iteration ---multiple ways
//for each loop 
for (String student : students){//String-datatype; students-listname; student-variable name
    System.out.println("Students:" +student);
}

//Iterator--it is goint to point to the first element 
Iterator<String> iterator =studensts.iterator();
while(iterator.hasNext()){
    
}

//lambda for each
students.forEach(students -> System.out.println("Student:" + student));

//clearing the list
students.clear();
System.out.println(isEmpty());


