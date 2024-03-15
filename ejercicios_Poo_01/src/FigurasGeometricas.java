abstract  class FigurasGeometricas {//CLASE ABSTRACTA PARA REPRESENTAR FIGURAS GEOMETRICAS
    abstract double CalcularArea();//METODO ABSTRACTO PARA CALCULAR EL AREA

}
class cuadrado extends FigurasGeometricas{//CLASE HIJA QUE HEREDA DE FIGURAS GEOMETRICAS
    private double lado;//ATRIBUTO PARA EL LADO DEL CUADRADO
    public cuadrado(double lado){//CONSTRUCTOR
        this.lado=lado;
    }
    public double getLado() {//METODO PARA OBTENER EL LADO
        return lado;
    }
    public void setLado(double lado) {//METODO PARA ESTABLECER EL LADO
        this.lado = lado;
    }
    @Override
    double CalcularArea() {//METODO PARA CALCULAR EL AREA
        return lado*lado;
    }
}
class rectangulo extends FigurasGeometricas{//CLASE HIJA QUE HEREDA DE FIGURAS GEOMETRICAS
    private double base;//ATRIBUTO PARA LA BASE DEL RECTANGULO
    private double altura;//ATRIBUTO PARA LA ALTURA DEL RECTANGULO
    public rectangulo(double base, double altura){//CONSTRUCTOR
        this.base=base;
        this.altura=altura;
    }
    public double getBase() {//METODO PARA OBTENER LA BASE
        return base;
    }
    public void setBase(double base) {//METODO PARA ESTABLECER LA BASE
        this.base = base;
    }
    public double getAltura() {//METODO PARA OBTENER LA ALTURA
        return altura;
    }
    public void setAltura(double altura) {//METODO PARA ESTABLECER LA ALTURA
        this.altura = altura;
    }
    @Override
    double CalcularArea() {//METODO PARA CALCULAR EL AREA
        return base*altura;
    }
}
class circulo extends FigurasGeometricas{//CLASE HIJA QUE HEREDA DE FIGURAS GEOMETRICAS
    private double radio;//ATRIBUTO PARA EL RADIO DEL CIRCULO
    public circulo(double radio){//CONSTRUCTOR
        this.radio=radio;
    }
    public double getRadio() {//METODO PARA OBTENER EL RADIO
        return radio;
    }
    public void setRadio(double radio) {//METODO PARA ESTABLECER EL RADIO
        this.radio = radio;
    }
    @Override
    double CalcularArea() {//METODO PARA CALCULAR EL AREA
        return Math.PI*radio*radio;
    }
}
