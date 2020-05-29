package entidades;

public class Retangulo {
public double width;
public double height;

public double area() {
	return width * height;
}

public double perimeter() {
	return width + width + height + height;
}

public double diagonal() {
	return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
}

}