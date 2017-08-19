
public class piramide extends baseRetangular {
private double largura;
private double comprimento;

public double calcVolume(){
    return 1/3*(this.calcBaseArea()*this.altura);
}

}
