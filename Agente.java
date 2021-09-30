package agente;

import jade.core.Agent;
import javax.swing.JOptionPane;

public class Agente extends Agent{
    
    public void setup(){
        
        int sumax = 0 , sumay = 0 , sumaxy = 0 , sumax2 = 0; 
        
        int xs = 0, ys = 0, xys = 0, x2s = 0, b0, b1, prediccion = 0;
        
        //Arrays Donde Guardarmos Los Datos
        int [] x = {23,26,30,34,43,48,52,57,58};
        int [] y = {651,762,856,1063,1190,1298,1421,1440,1518};
        int [] xy = {14973,19812,25680,36142,51170,62304,73892,82080,88044};
        int [] x2 = {529,676,900,1156,1849,2304,2704,3249,3364};
        
        for(int i = 0; i < 9; i++){
            
            sumax = sumax + x[i];
            sumay = sumay + y[i];
            sumaxy = sumaxy + xy[i];
            sumax2 = sumax2 + x2[i];
            
        }//Fin for
        
        //Formula Para Sacar B1
        b1 = ( 9 * sumaxy - (sumax * sumay)) / ( 9 * sumax2 - (sumax * sumax));
        
        //Formula Para Sacar B0
        b0 = (sumax2 * sumay - (sumax * sumaxy)) / ( 9 * sumax2 - (sumax * sumax));
        
        System.out.println("Sumatoria De X: " + sumax);
        System.out.println("Sumatoria De Y: " + sumay);
        System.out.println("Sumatoria De XY: " + sumaxy);
        System.out.println("Sumatoria De X²: " + sumax2);
        System.out.println("B1: " + b1 );
        System.out.println("B0: " + b0 );
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa El Numero a Predecir: "));
        
        //Formula Para Realizar La Prediccion
        prediccion = b0 + b1 * numero;
        
        System.out.println("Regression Equation: " + prediccion);
        
    }
    
}
