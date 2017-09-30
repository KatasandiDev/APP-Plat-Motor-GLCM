package Plat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Administrator
 */
public class FeatGlcm {
    private double energy;
    private double entropy;
    private double contrast;
    //private double variance;
    private double homogen;
    private double correlation;
    private double dissimilarity;
    private double autocorrelation;
    private double[][]data;
    private double mx;
    private double my;
    private double sx;
    private double sy;

    public void process (double [][]data){
            //update
            this.data=data;
            this.energy=0;
            this.entropy=0;
            this.contrast=0;
            //this.variance=0;
            this.homogen=0;
            this.dissimilarity=0;
            this.autocorrelation=0;
            //hitung mean menjadi perkolom
            //double []sumPerKolom=math.JaMa.sum(data);//Matrix.Sum(data);
            //
            //sumPerKolom=Matrix.Divide(sumPerKolom,data.GetLength(0));
            //Console.WriteLine("sum perkolom");
            //Prt.Print();
            //double totalMean=Matrix.Sum(sumPerKolom)/data.GetLength(1);
            //Console.WriteLine(totalMean);

            //hitung mx dan my
            this.mx=0;
            this.my=0;
            this.correlation=0;

            for (int i=0;i<data.length;i++){
                    for (int j=0;j<data[0].length;j++){
                            //hitung energy
                            energy=energy+Math.pow(data[i][j],2);
                            //hitung entropy
                            entropy=entropy-(data[i][j]*Math.log(data[i][j]+2.2204e-016));

                            //hitung contrast
                            contrast=contrast+(Math.pow((i+1)-(j+1),2)*data[i][j]);
                            //hitung variance
                            //variance=variance+(Math.pow(((double)i+1)-totalMean,2)*data[i][j]);
                            //hitung homogeneity
                            homogen=homogen+(data[i][j]/(1+Math.pow(((i+1)-(j+1)),2)));
                            //hitung dissimiliarity
                            dissimilarity=dissimilarity+(Math.abs((i+1)-(j+1))*data[i][j]);
                            //hitung autocorrelation
                            autocorrelation=autocorrelation+((i+1)*(j+1)*data[i][j]);
                            //hitung mx
                            mx=mx+((i+1)*data[i][j]);
                            //hitung my
                            my=my+((j+1)*data[i][j]);
                    }
            }
            //hitung sx dan sy
            this.sx=0;
            this.sy=0;
            for (int i=0;i<data.length;i++){
                    for (int j=0;j<data[0].length;j++){
                            sx=sx+(Math.pow((i+1)-mx,2)*data[i][j]);
                            sy=sy+(Math.pow((j+1)-my,2)*data[i][j]);

                    }
            }

            for (int i=0;i<data.length;i++){
                    for (int j=0;j<data[0].length;j++){
                            correlation=correlation+(((i+1)-mx)*((j+1)-my)*data[i][j]);

                    }
            }

            this.correlation=correlation/Math.sqrt(sx*sy);

    }
    public double getEnergy(){
            
                    return this.energy;
            
    }
    public double getEntropy(){
            
                    return this.entropy;
            
    }
    public double getContrast(){
            
                    return this.contrast;

            
    }
    public double getHomogen(){
            
                    return this.homogen;
            
    }
    public double getCorrelation(){
            
                    return this.correlation;
            
    }
    public double getDissimilarity(){
            
                    return this.dissimilarity;
            
    }
    public double getAutocorrelation(){
            
                    return this.autocorrelation;
            
    }
    public double getMx(){
            
                    return this.mx;

            
    }
    public double getMy(){
            
                    return this.my;
            
    }
    public double getSx(){
            
                    return this.sx;
            
    }
    public double getSy(){
            
                    return this.sy;
            
    }

}
