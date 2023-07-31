import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        HashMap<String, Materia> materias_disp = new HashMap<>();
        ArrayList<Profesor> lista = new ArrayList<>();

        
        materias_disp.put("Matemáticas", new Materia(1, "Matemáticas"));
        materias_disp.put("Ciencias", new Materia(2, "Ciencias"));
        materias_disp.put("Historia", new Materia(3, "Poo"));
        materias_disp.put("Literatura", new Materia(4, "Literatura"));

        int opcion;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===== Menú =====");
            System.out.println("1. Agregar Profesor");
            System.out.println("2. Buscar Profesor por ID");
            System.out.println("3. Imprimir Maestros ordenados por ID");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    
                    System.out.println("Nombre del maestro:");
                    String nombre = entrada.next();
                    System.out.println("Ingrese el ID:");
                    int ID = entrada.nextInt();
                    Profesor profesor = new Profesor(ID, nombre);

                    
                    boolean agregarMaterias = true;
                    while (agregarMaterias) {
                        
                        System.out.println("\nMaterias disponibles:");
                        for (Materia materia : materias_disp.values()) {
                            materia.imprimirMat();
                        }

                        System.out.println("Ingrese el nombre de la materia:");
                        String nombreMateria = entrada.next();

                        
                        Materia materia = materias_disp.get(nombreMateria);
                        if (materia == null) {
                            System.out.println("La materia '" + nombreMateria + "' no existe en el sistema.");
                        } else {
                            profesor.agregarMateria(materia);
                            System.out.println("Materia '" + nombreMateria + "' agregada al maestro.");
                        }

                        System.out.println("¿Desea agregar otra materia? (Sí: 1, No: 0)");
                        int seguir = entrada.nextInt();
                        if (seguir == 0) {
                            agregarMaterias = false;
                        }
                    }

                    lista.add(profesor);
                    break;

                case 2:
                    
                    System.out.println("Ingrese el ID del maestro a buscar:");
                    int searchID = entrada.nextInt();

                    for (Profesor prof : lista) {
                        if (prof.getID() == searchID) {
                            System.out.println("Maestro encontrado: " + prof.getNombre());
                            System.out.println("Materias asignadas al maestro:");
                            for (Materia materia : prof.getMaterias()) {
                                System.out.println("- " + materia.getNombre());
                            }
                            break;
                        }
                    }
                    break;

                case 3:
                    
                    Collections.sort(lista, Comparator.comparingInt(Profesor::getID));

                    System.out.println("Maestros ordenados por ID:");
                    for (Profesor prof : lista) {
                        System.out.println("ID: " + prof.getID() + ", Nombre: " + prof.getNombre());
                    }
                    break;

                case 4:
                    
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        }

        System.out.println("¡Hasta luego!");
    }
}


