
public class Piramide {
	
	private double altura =0;
	private double  ab=0;
	private double  base=0;

	public void setAltura(double altura) {
		if(altura > 0)
			this.altura = altura;
	}
	public void setArestaB(double ab) {
		if(ab > 0)
			this.ab = ab;
		setBase();
	}
	public void setBase() {
		if(this.ab > 0)
			this.base = ab * 2;
	}
	public double getAltura() {
		return altura;
	}
	public double getAb() {
		return ab;
	}
	
	
	public double areaTriangulo() {
		
		if (this.altura > 0 && this.ab> 0) {
			
			double areaT = (this.base * this.altura)/2;
			
			return areaT;
			
		}
		else 
			return (double)0.0;
		
	}
	
	public double volumePiramide() {
		if (this.altura > 0 && this.base> 0) {
			
			double areaT = (this.ab*2) * this.altura;
			
			return areaT;
			
		}
		else 
			return (double)0.0;
		
	}
	
	public double areaBase() {
		if (this.base> 0) {
			
			double areaB = (this.base * this.base);
			
			return areaB;
			
		}
		else 
			return (double)0.0;
		
	}
	
	public double areaTotal() {
			return (double)(this.areaBase()+(this.areaTriangulo()*4));
	}
	
	public double volume() {
		return (double)((this.areaBase()*this.altura)/3);
}
	
	
	
	
	
	
	
	
	
	
}
