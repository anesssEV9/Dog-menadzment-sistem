import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        ArrayList<Dog> shelter = new ArrayList<>();
        while (true) {
            Dog.meni();
            System.out.println("Izaberi: ");
            int izb = unos.nextInt();
            unos.nextLine();
            switch (izb) {
                case 1 -> {
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Unesi ime psa: ");
                        String naziv = unos.nextLine();

                        System.out.println("Unesi dob psa: ");
                        int dob = unos.nextInt();

                        unos.nextLine();

                        System.out.println("Unesi pasminu psa: ");
                        String pasmina = unos.nextLine();

                        shelter.add(new Dog(naziv, dob, pasmina));
                    }
                }
                case 2 -> {
                    System.out.println("Unesi naziv psa: ");
                    String naziv = unos.nextLine();
                    for (Dog x : shelter) {
                        if (Objects.equals(x.getIme(), naziv)) {
                            System.out.println("Ime: " + x.getIme() + "\nDob: " + x.getDob() + "\nPasmina: " + x.getPasmina());
                        }
                    }
                    System.out.println("===============================================");
                    for (Dog x : shelter) {
                        System.out.println("Ime: " + x.getIme() + "\nDob: " + x.getDob() + "\nPasmina: " + x.getPasmina());
                    }
                }
                case 3 -> {
                    System.out.println("Unesi ime psa:");
                    String naziv = unos.nextLine();

                    boolean obrisano = shelter.removeIf(x -> x.getIme().equalsIgnoreCase(naziv));

                    if (obrisano) {
                        System.out.println("Pas je uspješno obrisan.\n");
                    } else {
                        System.out.println("Pas s tim imenom nije pronaden\n");
                    }
                    System.out.println("Trenutni psi u azilu:");
                    for (Dog x : shelter) {
                        System.out.println("Ime: " + x.getIme() + "\nDob: " + x.getDob() + "\nPasmina: " + x.getPasmina() + "\n-------------------");
                    }
                    System.out.println("Broj preostalih pasa: "+shelter.size());
                    }
                }
            }
        }
    }
