package principal;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        int codMenuPpal = 0, codMenuTipico = 0, codMenuCarta = 0, codMenuInternacional = 0;
        int totalPlatos = 0, platosTipicos = 0, platosaCarta = 0, platosInternacionales = 0;
        double totalPagar = 0.0;
        
        String nombreUsuario = JOptionPane.showInputDialog("Por favor, ingrese su nombre:");
        
        do {
            String menu1 = "MENU RESTAURANTE\n\n";
            menu1 += "1. Plato Tipico\n";
            menu1 += "2. Plato a la Carta\n";
            menu1 += "3. Plato Internacional\n";
            menu1 += "4. Ver resumen y salir\n\n";
            menu1 += "Por favor seleccione una opcion\n";
            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(menu1));

            switch (codMenuPpal) {
                case 1:
                    do {
                        String menuTipico = "Menu TIPICO\n\n";
                        menuTipico += "1. Frijoles\n";
                        menuTipico += "2. Sopa de verdura\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "Por favor seleccione una opcion\n";
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de frijoles, el costo es de $12000");
                                totalPagar += 12000;
                                totalPlatos++;
                                platosTipicos++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una sopa de verduras, el costo es de $8000");
                                totalPagar += 8000;
                                totalPlatos++;
                                platosTipicos++;
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }

                        if (codMenuTipico != 3) {
                            codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu tipico, de lo contario regresará al menu principal "));
                        }
                    } while (codMenuTipico != 3);
                    break;
                case 2:
                    do {
                        String menuCarta = "Menu A LA CARTA\n\n";
                        menuCarta += "1. Filete de Pescado\n";
                        menuCarta += "2. Pollo a la Parrilla\n";
                        menuCarta += "3. Ensalada César\n";
                        menuCarta += "4. Regresar\n\n";
                        menuCarta += "Por favor seleccione una opcion\n";
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(menuCarta));

                        switch (codMenuCarta) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Filete de Pescado, el costo es de $25000");
                                totalPagar += 25000;
                                totalPlatos++;
                                platosaCarta++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un Pollo a la Parrilla, el costo es de $22000");
                                totalPagar += 22000;
                                totalPlatos++;
                                platosaCarta++;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado una Ensalada César, el costo es de $18000");
                                totalPagar += 18000;
                                totalPlatos++;
                                platosaCarta++;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }

                        if (codMenuCarta != 4) {
                            codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu a la carta, de lo contario regresará al menu principal "));
                        }
                    } while (codMenuCarta != 4);
                    break;
                case 3:
                    do {
                        String menuInternacional = "Menu INTERNACIONAL\n\n";
                        menuInternacional += "1. Sushi\n";
                        menuInternacional += "2. Pasta Carbonara\n";
                        menuInternacional += "3. Tacos al Pastor\n";
                        menuInternacional += "4. Regresar\n\n";
                        menuInternacional += "Por favor seleccione una opcion\n";
                        codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(menuInternacional));

                        switch (codMenuInternacional) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado Sushi, el costo es de $30000");
                                totalPagar += 30000;
                                totalPlatos++;
                                platosInternacionales++;
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado Pasta Carbonara, el costo es de $28000");
                                totalPagar += 28000;
                                totalPlatos++;
                                platosInternacionales++;
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Se han solicitado Tacos al Pastor, el costo es de $26000");
                                totalPagar += 26000;
                                totalPlatos++;
                                platosInternacionales++;
                                break;
                            case 4:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }

                        if (codMenuInternacional != 4) {
                            codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menu internacional, de lo contario regresará al menu principal "));
                        }
                    } while (codMenuInternacional != 4);
                    break;
                case 4:
                    String resumen = "Resumen de la orden para " + nombreUsuario + ":\n\n";
                    resumen += "Total de platos pedidos: " + totalPlatos + "\n";
                    resumen += "Platos típicos: " + platosTipicos + "\n";
                    resumen += "Platos a la carta: " + platosaCarta + "\n";
                    resumen += "Platos internacionales: " + platosInternacionales + "\n";
                    resumen += "Total a pagar: $" + totalPagar + "\n\n";
                    resumen += "Gracias por su visita. ¡Hasta pronto!";
                    JOptionPane.showMessageDialog(null, resumen);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);
    }
}