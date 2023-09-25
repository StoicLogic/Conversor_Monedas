import javax.swing.*;
public class PesosDivisas {

    //Constructor vacio
    PesosDivisas(){}

    //INICIO Metodos convertir MXN a divisas
    public void pesosDolar(double pesos){
        double dolar = pesos / 17.1;
        dolar = (double) Math.round(dolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ dolar +" dolares");
    }

    public void pesosEuro(double pesos){
        double euros = pesos / 18.2;
        euros = (double) Math.round(euros *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ euros +" euros");
    }

    public void pesosLibras(double pesos){
        double libras = pesos / 21;
        libras = (double) Math.round(libras *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ libras +" libras Esterlinas");
    }

    public void pesosYuan(double pesos){
        double yuan = pesos / 2.3;
        yuan = (double) Math.round(yuan *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ yuan +" yuanes");
    }

    public void pesosWon(double pesos){
        double won = pesos / 0.0128;
        won = (double) Math.round(won *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $"+ won +" wons");
    }

    //FIN metodos convertir MXN a divisas
}