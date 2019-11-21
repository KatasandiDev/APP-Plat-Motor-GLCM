/*
 * Ekstraksi Fitur Plat Kedaraan Bermotor Mahasiswa Fakultas Ilmu Komputer 
 * Universitas Muslim Indonsia Menggunakan Metode Gray Level Co-Occurrence Matrix 
 * (GLCM)
 * Oleh: Agus Arisandi
 */

package Plat;
import java.awt.Point;
/**
 * <p> untuk melakukan operasi pada array1D maupun array2D
 * <br>
 * </p>
 */
public class JavaMatrix
{
    /**
     * @param min nilai min
     * @param max nilai max
     * @param n nilai pembagi
     * @return array1D
     */
    public static double[] linSpace(double min,double max, double n){
        double []n_2=new double[(int)(n-2)+1];
        for(int i=0;i<n_2.length;i++){
            n_2[i]=i;
        }
        double []a= new double [n_2.length+1];

        double buff=0;
        for (int i=0;i<a.length-1;i++){
            buff=min+(n_2[i]*(max-min)/Math.floor(n-1));
            a[i]=buff;
        }
        a[a.length-1]=max;
        return a;
    }
    /**
     * @param size ukuran array2D
     * @return array2D dengan value 0
     */
    public static int [][]zerosInt2D (int size){
        return new int [size][size];
    }
    public static double [][]zerosDouble2D (int size){
        return new double [size][size];
    }
    public static Point searchUniq(int[][]data, int index){
        Point point=new Point();

        int baris = data.length;
	int kolom = data[0].length;
	boolean stop=false;
	for (int i = 0; i < baris; i++) {
	    for (int j = 0; j < kolom; j++){
                if(data[i][j]==index){
                    point.setLocation(j, i);
                    stop=true;
                    break;
                }
            }
            if(stop){
                break;
            }
	}
        return point;
    }
    public static double round(double a, double lastDigit){
        double p=Math.pow(10, lastDigit);
        a=a*p;
        double tmp=Math.round(a);
        return tmp/p;

    }
    public static Point searchUniq2(int[][]data, int ind){
        Point point=new Point();

        int baris = data.length;
	int kolom = data[0].length;
	boolean stop=false;
        for (int j = 0; j < kolom; j++){
	for (int i = 0; i < baris; i++) {
	    
                if(data[i][j]==ind){
                    point.setLocation(j, i);
                    stop=true;
                    break;
                }
            }
            if(stop){
                break;
            }
	}
        return point;
    }
    public static int indexOf(int[]data,int noIndex){
        int posisi = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]==noIndex){
                posisi=i;
                break;
            }
                
                
        }
        return posisi;
    }
    public static int indexOf(int[]data,int min,int max){
        int posisi = 0;
        for(int i=0;i<data.length;i++){
            //jika nilainya rentang

            if(data[i]>=min && data[i]<=max){
                posisi=i;
                break;
            }


        }
        return posisi;
    }
    public static double[] createMatrixInt(int value, int size) {
	double[] out = new double[size];
	for (int i = 0; i < size; i++) {
	    out[i] = (double) value;
	    value++;
	}
	return out;
    }
    public static double[] createMatrixDouble(int value, int size) {
	double[] ds = new double[size = size - value + 1];
	for (int i = 0; i < size; i++) {
	    ds[i] = (double) value;
	    value++;
	}
	return ds;
    }
    public static double[][] add(double[][] A, double[][] B) {
	int baris = A.length;
	int kolom = A[0].length;
	double[][] buff = new double[baris][kolom];
	for (int i = 0; i < baris; i++) {
	    for (int j = 0; j < kolom; j++)
		buff[i][j] = A[i][j] + B[i][j];
	}
	return buff;
    }
    public static double[][] add(double a, double[][] A) {
	int baris = A.length;
	int kolom = A[0].length;
	double[][] buff = new double[baris][kolom];
	for (int i = 0; i < baris; i++) {
	    for (int j = 0; j < kolom; j++)
		buff[i][j] = a + A[i][j];
	}
	return buff;
    }
    public static double[] sum(double[][] A) {
	int baris = A.length;
	int kolom = A[0].length;
	double d = 0.0;
	double[] buff = new double[kolom];
	for (int j = 0; j < kolom; j++) {
	    for (int i = 0; i < baris; i++)
		d = A[i][j] + d;
	    buff[j] = d;
	    d = 0.0;
	}
	return buff;
    }
    public static double sum(double[] A) {
	double out = 0.0;
	for (int i = 0; i < A.length; i++)
	    out = A[i] + out;
	return out;
    }
    public static double max(double[] A) {
	double out = A[0];
	for (int i = 0; i < A.length; i++) {
	    if (A[i] > out)
		out = A[i];
	}
	return out;
    }
    public static int[] sum(int[][] data) {
	int buff = 0;
	int[] out = new int[data[0].length];
	for (int i = 0; i < data[0].length; i++) {
	    for (int j = 0; j < data.length; j++)
		buff = data[j][i] + buff;
	    out[i] = buff;
	    buff = 0;
	}
	return out;
    }
    public static int sum(int[] data) {
	int out = 0;
	for (int i = 0; i < data.length; i++)
	    out = data[i] + out;
	return out;
    }
    public static int[] min(int[][] data) {
	int buff = 0;
	int[] out;
	(out = new int[data[0].length])[0] = data[0][0];
	int[] buff1D = new int[data.length];
	for (int i = 0; i < data[0].length; i++) {
	    for (int j = 0; j < data.length; j++) {
		buff1D[j] = data[j][i];
		buff = min(buff1D);
	    }
	    out[i] = buff;
	}
	return out;
    }
    public static int min(int[] data) {
	int i = data.length;
	int i_32_ = data[0];
	for (int i_33_ = 0; i_33_ < i; i_33_++) {
	    if (i_32_ >= data[i_33_])
		i_32_ = data[i_33_];
	}
	return i_32_;
    }
    public static int[] max(int[][] data) {
	int i = data.length;
	int i_34_ = data[0].length;
	int i_35_ = 0;
	int[] is_36_;
	(is_36_ = new int[i_34_])[0] = data[0][0];
	int[] is_37_ = new int[i];
	for (int i_38_ = 0; i_38_ < i_34_; i_38_++) {
	    for (int i_39_ = 0; i_39_ < i; i_39_++) {
		is_37_[i_39_] = data[i_39_][i_38_];
		i_35_ = max(is_37_);
	    }
	    is_36_[i_38_] = i_35_;
	}
	return is_36_;
    }
    public static int max(int[] data) {
	int i = data.length;
	int i_40_ = data[0];
	for (int i_41_ = 0; i_41_ < i; i_41_++) {
	    if (i_40_ <= data[i_41_])
		i_40_ = data[i_41_];
	}
	return i_40_;
    }
    public static double mean(int[] data) {
	int i = data.length;
	return (double) (sum(data) / i);
    }
    public static double[] mean(int[][] data) {
	int i = data[0].length;
	int[] is_42_ = sum(data);
	double[] ds = new double[i];
	for (int i_43_ = 0; i_43_ < i; i_43_++)
	    ds[i_43_] = (double) is_42_[i_43_] / (double) data.length;
	return ds;
    }
    public static double[] mean(double[][] data) {
	int i = data[0].length;
	double[] ds_44_ = sum(data);
	double[] ds_45_ = new double[i];
	for (int i_46_ = 0; i_46_ < i; i_46_++)
	    ds_45_[i_46_] = ds_44_[i_46_] / (double) data.length;
	return ds_45_;
    }
    public static double mean(double[] data) {
	int i = data.length;
	return sum(data) / (double) i;
    }
    public static int[][] add(int[][] A, int[][] B) {
	int i = A.length;
	int i_48_ = A[0].length;
	int[][] is_49_ = new int[i][i_48_];
	for (int i_50_ = 0; i_50_ < i; i_50_++) {
	    for (int i_51_ = 0; i_51_ < i_48_; i_51_++)
		is_49_[i_50_][i_51_] = A[i_50_][i_51_] + B[i_50_][i_51_];
	}
	return is_49_;
    }
    public int[][] add(int a, int[][] A) {
	int i_52_ = A.length;
	int i_53_ = A[0].length;
	int[][] is_54_ = new int[i_52_][i_53_];
	for (int i_55_ = 0; i_55_ < i_52_; i_55_++) {
	    for (int i_56_ = 0; i_56_ < i_53_; i_56_++)
		is_54_[i_55_][i_56_] = a + A[i_55_][i_56_];
	}
	return is_54_;
    }
    public double[][] min(double[][] A, double[][] B) {
	int i = A.length;
	int i_58_ = A[0].length;
	double[][] ds_59_ = new double[i][i_58_];
	for (int i_60_ = 0; i_60_ < i; i_60_++) {
	    for (int i_61_ = 0; i_61_ < i_58_; i_61_++)
		ds_59_[i_60_][i_61_] = A[i_60_][i_61_] - B[i_60_][i_61_];
	}
	return ds_59_;
    }
    public double[][] min(double a, double[][] A) {
	int i = A.length;
	int i_62_ = A[0].length;
	double[][] ds_63_ = new double[i][i_62_];
	for (int i_64_ = 0; i_64_ < i; i_64_++) {
	    for (int i_65_ = 0; i_65_ < i_62_; i_65_++)
		ds_63_[i_64_][i_65_] = a - A[i_64_][i_65_];
	}
	return ds_63_;
    }
    public int[] min(int[] A, int a) {
	int i_67_;
	int[] is_66_ = new int[i_67_ = A.length];
	for (int i_68_ = 0; i_68_ < i_67_; i_68_++)
	    is_66_[i_68_] = A[i_68_] - a;
	return is_66_;
    }
    public double[] min(double[] A, double a) {
	int i;
	double[] ds_69_ = new double[i = A.length];
	for (int i_70_ = 0; i_70_ < i; i_70_++)
	    ds_69_[i_70_] = A[i_70_] - a;
	return ds_69_;
    }
    public double[] pow(double[] A, double a) {
	int i;
	double[] ds_71_ = new double[i = A.length];
	for (int i_72_ = 0; i_72_ < i; i_72_++)
	    ds_71_[i_72_] = Math.pow(A[i_72_], a);
	return ds_71_;
    }
    public double[][] min(double[][] A, double a) {
	int i = A.length;
	int i_73_ = A[0].length;
	double[][] ds_74_ = new double[i][i_73_];
	for (int i_75_ = 0; i_75_ < i; i_75_++) {
	    for (int i_76_ = 0; i_76_ < i_73_; i_76_++)
		ds_74_[i_75_][i_76_] = A[i_75_][i_76_] - a;
	}
	return ds_74_;
    }
    public static double[][] multiply(double[][] A, double[][] B) {
	int baris = A.length;
	int kolom = B[0].length;
	double d = 0.0;
	double[][] buff = new double[baris][kolom];
////	for(){
////            for(){
////
////            }
////        }
	return buff;
    }
    public int[][] multiply(int[][] A, int[][] B) {
	int i = A.length;
	int i_84_ = B[0].length;
	int i_85_ = 0;
	int[][] is_86_ = new int[i][i_84_];
	for (int i_87_ = 0; i_87_ < i; i_87_++) {
	    for (int i_88_ = 0; i_88_ < i_84_; i_88_++) {
		for (int i_89_ = 0; i_89_ < i; i_89_++)
		    i_85_ = A[i_87_][i_89_] / B[i_89_][i_88_] + i_85_;
		is_86_[i_87_][i_88_] = i_85_;
	    }
	    i_85_ = 0;
	}
	return is_86_;
    }
    public double[][] multiply(double a, double[][] A) {
	int i = A.length;
	int i_90_ = A[0].length;
	double[][] ds_91_ = new double[i][i_90_];
	for (int i_92_ = 0; i_92_ < i; i_92_++) {
	    for (int i_93_ = 0; i_93_ < i_90_; i_93_++)
		ds_91_[i_92_][i_93_] = a * A[i_92_][i_93_];
	}
	return ds_91_;
    }
    public double[] multiply(double[] a, double[] A) {
	int i;
	double[] ds_95_ = new double[i = a.length];
	for (int i_96_ = 0; i_96_ < i; i_96_++)
	    ds_95_[i_96_] = a[i_96_] * A[i_96_];
	return ds_95_;
    }
    public int[] multiply(int[] a, int[] A) {
	int i;
	int[] is_98_ = new int[i = a.length];
	for (int i_99_ = 0; i_99_ < i; i_99_++)
	    is_98_[i_99_] = a[i_99_] * A[i_99_];
	return is_98_;
    }
    public int[] multiply(int a, int[] A) {
	int i_101_;
	int[] is_100_ = new int[i_101_ = A.length];
	for (int i_102_ = 0; i_102_ < i_101_; i_102_++)
	    is_100_[i_102_] = a * A[i_102_];
	return is_100_;
    }
    public double[] multiply(double a, double[] A) {
	int i;
	double[] ds_103_ = new double[i = A.length];
	for (int i_104_ = 0; i_104_ < i; i_104_++)
	    ds_103_[i_104_] = a * A[i_104_];
	return ds_103_;
    }
    public double[] add(double a, double[] A) {
	int i;
	double[] ds_105_ = new double[i = A.length];
	for (int i_106_ = 0; i_106_ < i; i_106_++)
	    ds_105_[i_106_] = a + A[i_106_];
	return ds_105_;
    }
    public int[][] multiply(int a, int[][] A) {
	int i_107_ = A.length;
	int i_108_ = A[0].length;
	int[][] is_109_ = new int[i_107_][i_108_];
	for (int i_110_ = 0; i_110_ < i_107_; i_110_++) {
	    for (int i_111_ = 0; i_111_ < i_108_; i_111_++)
		is_109_[i_110_][i_111_] = a * A[i_110_][i_111_];
	}
	return is_109_;
    }
    public double[][] divide(double[][] A, double[][] B) {
	int i = A.length;
	int i_113_ = B[0].length;
	double[][] ds_114_ = new double[i][i_113_];
	for (int i_115_ = 0; i_115_ < i; i_115_++) {
	    for (int i_116_ = 0; i_116_ < i_113_; i_116_++)
		ds_114_[i_115_][i_116_]
		    = A[i_115_][i_116_] / B[i_115_][i_116_];
	}
	return ds_114_;
    }
    public double[][] divide(double a, double[][] A) {
	int i = A.length;
	int i_117_ = A[0].length;
	double[][] ds_118_ = new double[i][i_117_];
	for (int i_119_ = 0; i_119_ < i; i_119_++) {
	    for (int i_120_ = 0; i_120_ < i_117_; i_120_++)
		ds_118_[i_119_][i_120_] = a / A[i_119_][i_120_];
	}
	return ds_118_;
    }
    public double[][] divide(double[][] A, double a) {
	int i = A.length;
	int i_121_ = A[0].length;
	double[][] ds_122_ = new double[i][i_121_];
	for (int i_123_ = 0; i_123_ < i; i_123_++) {
	    for (int i_124_ = 0; i_124_ < i_121_; i_124_++)
		ds_122_[i_123_][i_124_] = A[i_123_][i_124_] / a;
	}
	return ds_122_;
    }
    public static double[] divide(double[] A, double a) {
	int i;
	double[] ds_125_ = new double[i = A.length];
	for (int i_126_ = 0; i_126_ < i; i_126_++)
	    ds_125_[i_126_] = A[i_126_] / a;
	return ds_125_;
    }    
    public int[][] transform(int[][] data) {
	int i = data.length;
	int i_131_ = data[0].length;
	int[][] is_132_ = new int[i][i_131_];
	for (int i_133_ = 0; i_133_ < i; i_133_++) {
	    for (int i_134_ = 0; i_134_ < i_131_; i_134_++)
		is_132_[i_134_][i_133_] = data[i_133_][i_134_];
	}
	return is_132_;
    }
    public static double[] calLogMaps(double r, double x0, int iter){
        double []unSortLogMaps=new double[iter];
        // inialisasi
        unSortLogMaps[0]=x0;
        //kalkulasi logistic maps
        for (int i=0;i<unSortLogMaps.length-1;i++)
                unSortLogMaps[i+1]=r*unSortLogMaps[i]*(1-unSortLogMaps[i]);

        return unSortLogMaps;
    }    //normalisasi matrix
    public static double[][]norm(double [][]data){
        //menghitung jumlah nya
        double []jumlah=JavaMatrix.sum(data);
        double jmlh=JavaMatrix.sum(jumlah);
        double [][]out=new double [data.length][data[0].length];
        //proses pembagian
        for (int i=0;i<data.length;i++){
            for(int j=0;j<data[0].length;j++){
                out[i][j]=data[i][j]/jmlh;
            }
        }
        return out;
    }
    public static double[][] transpose(double[][]data){
        double[][]buff=new double[data[0].length][data.length];
        for (int j=0;j<data[0].length;j++){
            for(int i=0;i<data.length;i++){
                buff[j][i]=data[i][j];
            }
        }
        return buff;
    }
    public static double [][]getColumn(double [][]data, int indexColum){
        double[][]buff=new double[data.length][1];
        for(int i=0;i<data.length;i++){
            buff[i][0]=data[i][indexColum];
        }
        return buff;
    }
    
}
