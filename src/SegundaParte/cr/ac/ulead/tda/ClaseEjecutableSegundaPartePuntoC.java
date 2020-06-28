    package SegundaParte.cr.ac.ulead.tda;                                                                                         
                                                                                                                                  
    import Info_mascota.Mascota;                                                                                                  
                                                                                                                                  
    import java.util.Scanner;                                                                                                     
                                                                                                                                  
    public class ClaseEjecutableSegundaPartePuntoC {
        Scanner input = new Scanner(System.in);
        public static Mascota pet[] = new Mascota[50];
        int inicio;
        int fin;
        int[] cola;
        boolean extraido;
        boolean insertado;
        int max = 50;
        static int contador = 0;

        ClaseEjecutableSegundaPartePuntoC() {
            cola = new int[50];
            inicio = 0;
            fin = inicio;
            extraido = true;
            insertado = false;
            int max = 50;
        }

        public void insertar() {
            if (llena()) {
                System.out.println("ERROR: COLA LLENA");

            } else {
                System.out.println("Ingrese la siguiente informacion: ");
                inicio = 0;
                pet[contador] = new Mascota(info_pet(), info_pet(), info_pet());
                System.out.println(pet[contador].SerializadorXML());
                contador++;
            }
        }

        private boolean llena() {
            if (pet[50 - 1] != null) {
                return true;
            } else {
                return false;

            }
        }

        private String info_pet() {
            String[] info_mascota = {"Nombre : ", "Tipo de Animal : ", "Edad : "};
            System.out.println(info_mascota[inicio]);
            inicio++;
            return input.nextLine();
        }

        public void mostrar() {
            int i;
            if (vacia()) {
                System.out.println("Cola vacia, no hay elementos que mostrar");
            }
            if (inicio < fin)
                for (i = inicio; i < fin; i++)
                    System.out.print(cola[i] + " ");
            if (inicio > fin || llena()) {
                for (i = 0; i < fin; i++)
                    System.out.print(cola[i] + " ");
            }
            for (i = max - 1; i >= 0; i--) {
                if (pet[i] != null) {
                    System.out.println(pet[i].SerializadorXML());

                }
            }
        }

        public boolean vacia() {
            if (pet[0] == null) {
                return true;
            } else {
                return false;
            }
        }

        public int extraer() {
            if (!vacia()) {
                extraido = true;
                insertado = false;
                if (inicio == inicio - 1) {
                    inicio++;
                    return cola[contador - inicio];

                } else {
                    contador=0;
                    System.out.println(pet[contador].SerializadorXML());
                    System.out.println("Ha sido eliminado");
                    return cola[cola.length - inicio ];
                }


            } else {
                System.out.println("ERROR: COLA VACIA");

                return 0;
            }
        }
    }



