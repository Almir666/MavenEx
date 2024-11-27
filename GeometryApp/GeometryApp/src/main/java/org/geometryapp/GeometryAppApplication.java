package org.geometryapp;

import com.example.geometry.threedimensional.Cube;
import com.example.geometry.threedimensional.Sphere;
import com.example.geometry.utils.GeometryConverter;
import com.geometry.library.impl.Circle;
import com.geometry.library.impl.Rectangle;
import com.geometry.library.impl.Triangle;
import com.geometry.library.interfaces.Shape;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeometryAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(GeometryAppApplication.class, args);

        double centimeters = 20.0;

        Shape circle = new Circle(5);
        Shape triangle = new Triangle(3, 3, 3);
        Shape rectangle = new Rectangle(2, 4);

        Sphere sphere = new Sphere(5);
        Cube cube = new Cube(4);

        System.out.println();
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println();

        System.out.println("Circle perimeter: " + circle.getPerimeter());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println();


        System.out.println(GeometryConverter.centimetersToInches(centimeters));
        System.out.println(GeometryConverter.centimetersToFeet(centimeters));
        System.out.println();

        System.out.println(sphere.getVolume());
        System.out.println(cube.getVolume());
    }

}
