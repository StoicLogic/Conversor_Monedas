import javax.swing.*;

public class OpcionDivisas {

    //Constructor vacio
    OpcionDivisas(){}
    PesosDivisas monedas = new PesosDivisas();
    DivisasPesos divisas = new DivisasPesos();

    //Metodo para elegir la opcion a la que se desea convertir
    public void cantidadDivisas(double cantidad){
        String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ",
                "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"MXN a Dolar",
                        "MXN a Euros","MXN a Libras", "MXN a Yen", "MXN a Won",
                        "Dolar a MXN", "Euro a MXN","Libra a MXN","Yen a MXN","Won a MXN"}, "Seleccion")).toString();

        switch(opciones){
            case "MXN a Dolar" ->
                    monedas.pesosDolar(cantidad);
            case "MXN a Euros" ->
                monedas.pesosEuro(cantidad);
            case "MXN a Libras" ->
                monedas.pesosLibras(cantidad);
            case "MXN a Yen" ->
                monedas.pesosYuan(cantidad);
            case "MXN a Won" ->
                monedas.pesosWon(cantidad);
            case "Dolar a MXN" ->
                divisas.dolarPesos(cantidad);
            case "Euro a MXN" ->
                divisas.euroPesos(cantidad);
            case "Libra a MXN" ->
                divisas.librasPesos(cantidad);
            case "Yen a MXN" ->
                divisas.yuanPesos(cantidad);
            case "Won a MXN" ->
                divisas.wonPesos(cantidad);

        }
    }


}
