public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Challenge Java" + '\n' + "---------------------");

        Empleado jotaPerez = new Empleado();

        Empleado matiasLoza = new Empleado("Matias Loza", 200);

        //setter for class Empleado
        jotaPerez.setNombre("Jota Perez");
        jotaPerez.setCantidadHorasTrabajadas(160);

        //use getter for class Empleado
        System.out.println("Nombre: " + jotaPerez.getNombre());
        System.out.println("Horas trabajadas: " + jotaPerez.getCantidadHorasTrabajadas());

        System.out.println("---------------------");
        
        System.out.println("Nombre: " + matiasLoza.getNombre());
        System.out.println("Horas trabajadas: " + matiasLoza.getCantidadHorasTrabajadas());

    }
}
