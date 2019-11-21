package Plat;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author @author Administrator
 */
public class GLCM{

    public static  int SUDUT_0=0;
    public static  int SUDUT_45=45;
    public static  int SUDUT_90=90;
    public static  int SUDUT_135=135;
    public static  int SUDUT_ALL=360;
    private double [][]h;
    private double [][]t;
    public double [][]getH(){
           return this.h;

    }
    public double [][]getT(){
            return this.t;

    }
    public  void process(int[][]data,int sudut,int maks){

            if (sudut!=SUDUT_ALL){
                    //update - perhitungan glcm
                    this.h=this.doCal(data,sudut,maks);
                    //update - perhitungan glcm normalisasi
                    this.t= JavaMatrix.norm(h);

            }
            else{
                    //untuk sudut 0
                    double [][]h0=this.doCal(data,0,maks);
                    //untuk sudut 45
                    double [][]h45=this.doCal(data,45,maks);
                    //untuk sudut 90
                    double [][]h90=this.doCal(data,90,maks);
                    //untuk sudut 135
                    double [][]h135=this.doCal(data,135,maks);
                    h=new double [h0.length][h0[0].length];

                    for (int i=0;i<h0.length;i++){
                            for (int j=0;j<h0[0].length;j++){
                                    this.h[i][j]=h0[i][j]+h45[i][j]+h90[i][j]+h135[i][j];
                            }
                    }
                    //update - perhitungan glcm normalisasi
                    this.t = JavaMatrix.norm(h);

            }

    }

    private  double [][] doCal(int[][]data,int sudut,int maks){
            maks=maks+1;
            //untuk menyimpan hasil matrix glcm
            double [][]mat=new double[maks][maks];
            int baris=data.length;
            // origin adalah titik acuan
            // neigh adalah titik tetangga
            int kolom=data[0].length;
            int origin,neigh;


            //untuk sudut 0 dan 180
            if (sudut==0){
                    for (int i=0;i<baris;i++){
                            for (int j=0;j<kolom;j++){
                                    //untuk arrah 0
                                    //check outofbox
                                    // maka j+1
                                    if((j+1)<kolom){
                                            origin=data[i][j];
                                            neigh=data[i][j+1];
                                            //Console.Write(" ["+origin+"-"+neigh+"] ");
                                            if(origin>=0 && neigh>=0){
                                                    mat[origin][neigh]=mat[origin][neigh]+1;
                                            }
                                    }
                                    //untuk arrah 180
                                    //check outofbox
                                    //maka j-1
                                    if ((j-1)>=0){
                                            origin=data[i][j];
                                            neigh=data[i][j-1];
                                            //Console.Write(" ["+origin+"-"+neigh+"] ");
                                            if(origin>=0 && neigh>=0){
                                                    mat[origin][neigh]=mat[origin][neigh]+1;
                                            }
                                    }

                            }
                            //Console.WriteLine();
                    }
            }

            //untuk sudut 45 dan 225
            if (sudut==45){
                    for (int i=0;i<baris;i++){
                            for (int j=0;j<kolom;j++){
                                    //untuk arrah 45
                                    //check outofbox
                                    // maka i-1 dan j+1
                                    if((j+1)<kolom && (i-1)>=0){
                                            origin=data[i][j];
                                            neigh=data[i-1][j+1];
                                            //Console.Write(" ["+origin+"-"+neigh+"] ");
                                            if(origin>=0 && neigh>=0){
                                                    mat[origin][neigh]=mat[origin][neigh]+1;
                                            }
                                    }
                                    //untuk arrah 225
                                    //check outofbox
                                    // maka  i+1,j-1
                                    if((j-1)>=0 && (i+1)<baris){
                                            origin=data[i][j];
                                            neigh=data[i+1][j-1];
                                            //Console.Write(" ["+origin+"-"+neigh+"] ");
                                            if(origin>=0 && neigh>=0){
                                                    mat[origin][neigh]=mat[origin][neigh]+1;
                                            }
                                    }


                            }
                            //Console.WriteLine();
                    }
            }
            //untuk sudut 90 dan 180
            if (sudut==90){
                    for (int i=0;i<baris;i++){
                            for (int j=0;j<kolom;j++){

                                    //untuk arrah 90
                                    //check outofbox
                                    // maka i-1
                                    if((i-1)>=0 ){
                                            origin=data[i][j];
                                            neigh=data[i-1][j];
                                            //Console.Write(" ["+origin+"-"+neigh+"] ");
                                            if(origin>=0 && neigh>=0){
                                                    mat[origin][neigh]=mat[origin][neigh]+1;
                                            }
                                    }
                                    //untuk arrah 180
                                    //check outofbox
                                    // maka i+1
                                    if((i+1)<baris ){
                                            origin=data[i][j];
                                            neigh=data[i+1][j];
                                            //Console.Write(" ["+origin+"-"+neigh+"] ");
                                            if(origin>=0 && neigh>=0){
                                                    mat[origin][neigh]=mat[origin][neigh]+1;
                                            }
                                    }


                            }

                    }
            }
            //untuk sudut 135 dan 225

            if (sudut==135){
                    for (int i=0;i<baris;i++){
                            for (int j=0;j<kolom;j++){
                                    //untuk arrah 135
                                    //check outofbox
                                    // maka i-1 dan j-1
                                    if((j-1)>=0 && (i-1)>=0){
                                            origin=data[i][j];
                                            neigh=data[i-1][j-1];
                                            //Console.Write(" ["+origin+"-"+neigh+"] ");
                                            if(origin>=0 && neigh>=0){
                                                    mat[origin][neigh]=mat[origin][neigh]+1;
                                            }
                                    }
                                    //untuk arrah 270
                                    //check outofbox
                                    // maka i+1 dan j+1
                                    if((j+1) <kolom && (i+1)<baris){
                                            origin=data[i][j];
                                            neigh=data[i+1][j+1];
                                            //Console.Write(" ["+origin+"-"+neigh+"] ");
                                            if(origin>=0 && neigh>=0){
                                                    mat[origin][neigh]=mat[origin][neigh]+1;
                                            }
                                    }


                            }
                            //Console.WriteLine();
                    }
            }


            return mat;
    }

}
