public class MainFiguras {
    public static void main(String[] args) {
        //crear instancias de las figuras geometricas
        circulo circulo=new circulo(5);
        rectangulo rectangulo=new rectangulo(5, 10);
        cuadrado cuadrado=new cuadrado(5);

        //mostrar el area de las figuras
        System.out.println("El area del circulo es: "+circulo.CalcularArea());
        System.out.println("El area del rectangulo es: "+rectangulo.CalcularArea());
        System.out.println("El area del cuadrado es: "+cuadrado.CalcularArea());
    }
}
