# Implicit Ordering Resolution Failure in Scala

This example demonstrates a common issue encountered when using implicit parameters in Scala, specifically with implicit Ordering for type parameters.

The `MyClass` class utilizes an implicit `Ordering[T]` to compare two values of type `T`. While the code works for `Int` due to the readily available `Ordering.Int`, it fails to compile for `String` because there's no implicit `Ordering[String]` in scope by default.

To fix this, you'd need to either provide an implicit `Ordering[String]` or modify the method to not rely on an implicit ordering.

The included `MyClass.scala` file contains the example code. The solution involves adding the necessary implicit ordering, demonstrating how to resolve the compilation error.