# Geometric Figures DSL

This DSL allows for easy creation and manipulation of geometric figures, such as points, lines, and triangles. Below are
examples of using the DSL to create various geometric objects and operations on them.

## Creating Points and Lines

```plaintext
Point A(100, 100);
Point B(200, 200);
Line L(A, B);
```

## Creating Triangles
You can create a triangle using the coordinates of three points:
```plaintext
Point A(0, 0);
Point B(400, 0);
Point C(0, 300);
Triangle t1(A, B, C);
```
Specialized types of triangles are also supported:

```plaintext
EquilateralTriangle t1(500); // Equilateral triangle
IsoscelesTriangle t2(400, 600); // Isosceles triangle
Triangle t2(200, 300, 400); // Arbitrary triangle by the lengths of sides
```

## Advanced Operations with Triangles
You can apply operations such as constructing bisectors to triangles using the following syntax:

```plaintext
Triangle t1(S : 200, D : 300, E : 400)->bisector(S)->bisector(D);
Triangle t1(A, B, C)->bisector(A)
```