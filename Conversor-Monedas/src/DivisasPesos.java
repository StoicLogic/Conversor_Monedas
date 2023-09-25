import javax.swing.*;

public class DivisasPesos {

    //Constructor vacio
    DivisasPesos(){}


    //INICIO Metodos convertir divisas a MXN
    public void dolarPesos(double dolar){
        double pesos = dolar * 17.1;
        pesos = (double) Math.round(pesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ pesos +" MXN");
    }

    public void euroPesos(double euro){
        double pesos = euro * 18.2;
        pesos = (double) Math.round(pesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ pesos +" MXN");
    }

    public void librasPesos(double libras){
        double pesos = libras * 21;
        pesos = (double) Math.round(pesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ pesos +" MXN");
    }

    public void yuanPesos(double yuan){
        double pesos = yuan * 2.3;
        pesos = (double) Math.round(pesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ pesos +" MXN");
    }

    public void wonPesos(double won){
        double pesos = won * 0.0128;
        pesos = (double) Math.round(pesos *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ pesos +" MXN");
    }

    //FIN metodos convertir divisas a MXN
}