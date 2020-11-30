
package newpackage;

public class Grupo {
    
    private Nodo cabeza = null; 
    private double SumaDeCal = 0;
    
    private class Nodo{
        
        public Estudiante estudiante;
        public Nodo siguiente = null;
        public int CA = 0;

        public Nodo(Estudiante estudiante) {
            this.estudiante = estudiante;
        }
        
        public void IncorporarEstudiante(Estudiante estudiante){
            Nodo nodo = new Nodo(estudiante);
            if (cabeza == null) {
                cabeza = nodo;
            } else{
                Nodo puntero = cabeza;
                while(puntero.siguiente != null){
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = nodo;
            }
            SumaDeCal += nodo.estudiante.getPromedio();
            CA++;
        }
        
        public void DarBaja(int n){
            if (cabeza != null) {
                if (n == 0) {
                    Nodo primer = cabeza;
                    cabeza = cabeza.siguiente;
                    primer.siguiente = null;
                    SumaDeCal -= primer.estudiante.getPromedio();
                    CA--;
                } else {
                    Nodo puntero = cabeza;
                    int contador = 0;
                    while (contador <(n-1)) {                    
                        puntero = puntero.siguiente;
                        contador++;
                    }
                    Nodo temp = puntero.siguiente;
                    puntero.siguiente = temp.siguiente;
                    temp.siguiente = null;
                    SumaDeCal -= puntero.estudiante.getPromedio();
                    CA--;
                }
            }
        }
        
        public Double Promedio(){
            return SumaDeCal/CA;
        }    
            
        
        

    

}
}

