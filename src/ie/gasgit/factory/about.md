# Creational pattern
# Use Factory to create objects, keeping logic from client using interface

```java

ShapeFactory shapeFactory = new ShapeFactory();

Shape shape1 = shapeFactory.getShape("CIRCLE");
shape1.draw();

Shape shape2 = shapeFactory.getShape("RECTANGLE");
shape2.draw();

Shape shape3 = shapeFactory.getShape("SQUARE");
shape3.draw();
        
```

## Sample Output
```
Drawing A Circle
Drawing A Rectangle!
Drawing A Square

```

