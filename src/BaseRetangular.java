
public class BaseRetangular extends Solido{
protected double baseLargura;
protected double baseProfundidade;

public double getBaseLargura() {
	return baseLargura;
}

public void setBaseLargura(double baseLargura) {
	this.baseLargura = baseLargura;
}

public double getBaseProfundidade() {
	return baseProfundidade;
}

public void setBaseProfundidade(double baseProfundidade) {
	this.baseProfundidade = baseProfundidade;
}

protected double calcBaseArea(){
    return this.baseLargura * this.baseProfundidade;
}
}
