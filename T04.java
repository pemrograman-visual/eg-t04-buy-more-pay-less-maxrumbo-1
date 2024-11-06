//12S24037 - Maxwell Rumahorbo
//12S24030 - Swasti Sihombing
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[3];
        int[] jumlahBuku = new int[3];

        jumlahBuku[0] = 0;
        jumlahBuku[1] = 0;
        jumlahBuku[2] = 0;
        double[] harga = new double[3];

        harga[0] = 0;
        harga[1] = 0;
        harga[2] = 0;
        double[] totalHarga = new double[3];

        totalHarga[0] = 0;
        totalHarga[1] = 0;
        totalHarga[2] = 0;
        double totalAkhir1;
        int x;

        x = 0;
        int jumlahBuku0, jumlahBuku1, jumlahBuku2;

        jumlahBuku0 = 0;
        jumlahBuku1 = 0;
        jumlahBuku2 = 0;
        String buku0, buku1, buku2;

        buku0 = "Buku";
        buku1 = "Buku";
        buku2 = "Buku";
        int nol, satu, dua;

        nol = 0;
        satu = 1;
        dua = 2;
        do {
            iSBN[x] = input.nextLine();
            if (iSBN[x].equals("---")) {
                x = 3;
            } else {
                if (iSBN[x].equals(iSBN[0])) {
                    if (nol == 0) {
                        buku0 = iSBN[x];
                    }
                    if (iSBN[0].equals(buku0)) {
                        x = 0;
                        harga[x] = Double.parseDouble(input.nextLine());
                        jumlahBuku[x] = Integer.parseInt(input.nextLine());
                        jumlahBuku0 = jumlahBuku0 + jumlahBuku[x];
                        nol = 3;
                        x = x + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = iSBN[x];
                        }
                        if (iSBN[0].equals(buku1)) {
                            x = 1;
                            harga[x] = Double.parseDouble(input.nextLine());
                            jumlahBuku[x] = Integer.parseInt(input.nextLine());
                            jumlahBuku1 = jumlahBuku1 + jumlahBuku[x];
                            nol = 3;
                            x = x + 1;
                        } else {
                            x = 2;
                            harga[x] = Double.parseDouble(input.nextLine());
                            jumlahBuku[x] = Integer.parseInt(input.nextLine());
                            jumlahBuku2 = jumlahBuku2 + jumlahBuku[x];
                            nol = 3;
                            x = 0;
                        }
                    }
                } else {
                    if (iSBN[x].equals(iSBN[1])) {
                        if (satu == 1) {
                            buku1 = iSBN[x];
                        }
                        if (iSBN[1].equals(buku1)) {
                            x = 1;
                            harga[x] = Double.parseDouble(input.nextLine());
                            jumlahBuku[x] = Integer.parseInt(input.nextLine());
                            jumlahBuku1 = jumlahBuku1 + jumlahBuku[x];
                            satu = 3;
                            x = x + 1;
                        } else {
                            x = 2;
                            harga[x] = Double.parseDouble(input.nextLine());
                            jumlahBuku[x] = Integer.parseInt(input.nextLine());
                            jumlahBuku2 = jumlahBuku2 + jumlahBuku[x];
                            satu = 3;
                            x = 0;
                        }
                    } else {
                        if (iSBN[x].equals(iSBN[2])) {
                            if (dua == 2) {
                                buku2 = iSBN[x];
                            }
                            if (iSBN[2].equals(buku2)) {
                                x = 2;
                                harga[x] = Double.parseDouble(input.nextLine());
                                jumlahBuku[x] = Integer.parseInt(input.nextLine());
                                dua = 3;
                                x = 0;
                            }
                        }
                    }
                }
            }
        } while (x < 3);
        if (jumlahBuku0 >= 20) {
            harga[0] = harga[0] - harga[0] * 12 / 100;
        } else {
            if (jumlahBuku0 >= 10) {
                harga[0] = harga[0] - harga[0] * 5 / 100;
            } else {
                if (jumlahBuku0 >= 5) {
                    harga[0] = harga[0] - harga[0] * 2 / 100;
                }
            }
        }
        totalHarga[0] = harga[0] * jumlahBuku0;
        if (jumlahBuku1 >= 20) {
            harga[1] = harga[1] - harga[1] * 12 / 100;
        } else {
            if (jumlahBuku1 >= 10) {
                harga[1] = harga[1] - harga[1] * 5 / 100;
            } else {
                if (jumlahBuku1 >= 5) {
                    harga[1] = harga[1] - harga[1] * 2 / 100;
                }
            }
        }
        totalHarga[1] = harga[1] * jumlahBuku1;
        if (jumlahBuku2 >= 20) {
            harga[2] = harga[2] - harga[2] * 12 / 100;
        } else {
            if (jumlahBuku2 >= 10) {
                harga[2] = harga[2] - harga[2] * 5 / 100;
            } else {
                if (jumlahBuku2 >= 5) {
                    harga[2] = harga[2] - harga[2] * 2 / 100;
                }
            }
        }
        totalHarga[2] = harga[2] * jumlahBuku2;
        totalAkhir1 = totalHarga[0] + totalHarga[1] + totalHarga[2];
        System.out.println(toFixed(totalAkhir1,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
