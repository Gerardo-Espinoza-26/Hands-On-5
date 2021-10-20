package slr;

import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import javax.swing.JOptionPane;

public class SLR extends Agent {
    
    HelperArithmetic HA = new HelperArithmetic();
    
    int sumax = HA.Sumax();
    int sumay = HA.Sumay();
    int sumaxy = HA.Sumaxy();
    int sumax2 = HA.Sumax2();
    
    public float CalculateB0(){
     
        float CalculateB0  = (sumax2 * sumay - (sumax * sumaxy)) / ( 9 * sumax2 - (sumax * sumax));
    
        return CalculateB0;
        
    }//Fin public float CalculateB0
    
    public float CalculateB1(){
     
        float CalculateB1 = ( 9 * sumaxy - (sumax * sumay)) / ( 9 * sumax2 - (sumax * sumax));
    
        return CalculateB1;
        
    }//Fin public float CalculateB1
    
    public void displayRegressioEquation(){
        
        System.out.println("Regression Equation y = B0 + B1 X1");
        
    }//Fin public void displayRegressioEquation
    
    public float predict(float b0, float b1){
        
        float valor = Float.parseFloat(JOptionPane.showInputDialog("Ingresa El Valor a Predecir"));
        
        float predict = b0 + b1 * valor;
        
        System.out.println("Predict: " + predict);
        
        return predict;
        
    }//Fin public float predict
    
    @Override
    protected void setup(){
        
        System.out.println("Agent " + getLocalName() + " Started.");
        addBehaviour(new MyOneShotBehaviour());
        
    }//Fin protected void setup
    
    private class MyOneShotBehaviour extends OneShotBehaviour{
        
        @Override
        public void action(){
            
            SLR slr = new SLR();
        
            float b0 = slr.CalculateB0();
            float b1 = slr.CalculateB1();

            slr.displayRegressioEquation();
            slr.predict(b0,b1);
            
        }//Fin public void action
    
        @Override
        public int onEnd(){
            
            myAgent.doDelete();
            return super.onEnd();
            
        }//Fin public int onDelete
        
    }//Fin private class MyOneShotBehaviour
    
}//Fin public class SLR extends Agent