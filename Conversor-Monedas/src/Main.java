import javax.swing.*;

//Main del programa
public class Main {
    public static void main(String[] args) {
        OpcionDivisas monedaOpcion = new OpcionDivisas();
        boolean bucle= false;

        do {
            String cantidad = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que quieres convertir");
            if (ValidarNumero(cantidad)){
                double moneda = Double.parseDouble(cantidad);
                monedaOpcion.cantidadDivisas(moneda);

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                if (JOptionPane.OK_OPTION == respuesta) {
                    System.out.println("Selecciona opción Afirmativa");
                    bucle = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Programa terminado");
                    bucle = false;
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Valor no valido");
            }
        }while(bucle);


    }
    public static boolean ValidarNumero(String dato) {
        try {
            double x = Double.parseDouble(dato);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
