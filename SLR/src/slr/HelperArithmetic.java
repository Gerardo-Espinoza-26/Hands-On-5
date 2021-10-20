package slr;

public class HelperArithmetic {
       
    DataSet DS = new DataSet();
       
    int [] aux = DS.getMatrizx();
    int [] auy = DS.getMatrizy();
    int [] auxy = DS.getMatrizxy();
    int [] aux2 = DS.getMatrizx2();
    
    int sumax;
    int sumay;
    int sumaxy;
    int sumax2;
    
    public int Sumax(){
            
        for(int i = 0; i < 9; i++){

            sumax = aux[i] + sumax;

        }//Fin for i

        return sumax;
            
    }//Fin public int Sumax
    
    public int Sumay(){
            
        for(int i = 0; i < 9; i++){

            sumay = auy[i] + sumay;

        }//Fin for i

        return sumay;
            
    }//Fin public int Sumay
    
    public int Sumaxy(){
            
        for(int i = 0; i < 9; i++){

            sumaxy = auxy[i] + sumaxy;

        }//Fin for i

        return sumaxy;
            
    }//Fin public int Sumaxy
    
    public int Sumax2(){
            
        for(int i = 0; i < 9; i++){

            sumax2 = aux2[i] + sumax2;

        }//Fin for i

        return sumax2;
            
    }//Fin public int Sumax2
    
}//Fin public class HelperArithmetic