package org.example;
import java.util.*;

public final class CasoTarifa {

    public static void main(String[] args) {
        Map<Object, Object> clientesPrecioTotal = new HashMap<>();
        ArrayList<String> clientes = new ArrayList<>();
        clientes.add("103765");
        clientes.add("42989");
        clientes.add("71650");

        Scanner sc = new Scanner(System.in);
        int descuento = 10;

        System.out.print("Ingrese en la Pantalla el número de documento: ");
        String documento = sc.next();

        System.out.print("\n¿Cuál es el valor del producto?: ");
        Double valorProducto = sc.nextDouble();

        if (clientes.contains(documento)) {
            valorProducto = valorTotal(descuento, valorProducto);
            System.out.println("Su Documento es: "+documento+ " y con este ganaste un descuento," +
                    " tu nuevo valor a pagar es: "+valorProducto+ ", el descuento fue de "+descuento+"%");
        }else{
            System.out.println("Hoy con tu número de documento: "+documento+" no fuiste ganador del descuento"
                    + " y el valor a pagar es: "+valorProducto);
        }

    }

    public static Double valorTotal(int descuento, Double valorProducto) {
        Double total = 0.0;
        total = valorProducto - (valorProducto * (Double.parseDouble(String.valueOf(descuento))/ 100));

        return total;
    }
}