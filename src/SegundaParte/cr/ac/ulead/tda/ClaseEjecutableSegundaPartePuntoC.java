    package SegundaParte.cr.ac.ulead.tda;                                                                                         
                                                                                                                                  
    import Info_mascota.Mascota;

    public class ClaseEjecutableSegundaPartePuntoC {
        int max = 50;

        int inicio=-1;
        int fin=-1;
        public Mascota pet[] = new Mascota[50];

        public void ingresarCola(Mascota newMascota) {

            try {
                if (llena()) {
                    throw new Exception("La cola esta llena");
                } else {
                    if (inicio == -1)
                        inicio = 0;

                    fin = (fin+ 1) % this.max;
                    pet[fin] = newMascota;
                }
            }catch (Exception e){
                System.out.println("Hay problemas"+e);
            }
        }
        public String eliminarCola() throws Exception {

            try {
                Mascota mascota;
                if (vacia()) {
                    throw new Exception("La cola esta vacia");
                } else {
                    mascota = pet[inicio];
                    if (inicio == fin) {
                        inicio = -1;
                        fin = -1;
                    }
                    else {
                        inicio = (inicio + 1) % this.max;
                    }
                }
                return mascota.SerializadorJson();

            }catch (Exception e){
                System.out.println("Hay problemas"+ e);
            }
            return null;
        }

        private boolean llena() {
            if (inicio == 0 && fin == this.max - 1) {
                return true;
            }
            if ( inicio == fin + 1) {
                return true;
            }
            return false;
        }

        private boolean vacia() {
            if (fin == -1)
                return true;
            else
                return false;
        }
    }


