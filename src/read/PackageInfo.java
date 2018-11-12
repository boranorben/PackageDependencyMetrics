package read;
public class PackageInfo {

    String packageName;
    double ca;
    double ce;
    double na;
    double nc;

    public PackageInfo(double ca, double ce, double na, double nc) {
		this.ce = ce;
		this.ca = ca;
		this.na = na;
		this.nc = nc;
	}

    public double getInstability(){
        return ce/(ca+ce);
    }

    public double getAbstractness(){
        return na/nc;
    }

    public double getDistance() {
		return Math.abs(getAbstractness() - getInstability());
	}

}
