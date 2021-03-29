# Belajar Interface Java

•	Interfaces specify what a class must do (requeired) and not how.

•	It is the blueprint of the class.

## Example for realized

### Interface
```
List MyList = new ArrayList(); //allowed
```
List an Interface

```
List MyList = new List(); //erorr!!
```


### Class
```
ArrayList MyList = new ArrayList(); //allowed
```
ArrayList is a Class

### Additional Information

When create some interface-module and implements it, 
the all operation is required to @override / create operation body

so if u want to create module without required operation to 
@override / create us **abstract class**
